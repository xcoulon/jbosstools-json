/******************************************************************************* 
 * Copyright (c) 2008 Red Hat, Inc. 
 * Distributed under license by Red Hat, Inc. All rights reserved. 
 * This program is made available under the terms of the 
 * Eclipse Public License v1.0 which accompanies this distribution, 
 * and is available at http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 * Xavier Coulon - Initial API and implementation 
 ******************************************************************************/

package org.jboss.tools.json.util;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.internal.core.JavaProject;
import org.jboss.tools.json.JSONTestsActivator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.osgi.framework.Bundle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@RunWithProject("json-sample-project")
@SuppressWarnings("restriction")
public abstract class AbstractCommonTestCase {

	public static final Logger LOGGER = LoggerFactory.getLogger(AbstractCommonTestCase.class);

	protected String projectName = null;

	protected IJavaProject javaProject;

	protected IProject project;

	protected static Bundle bundle = JSONTestsActivator.getDefault().getBundle();

	public final static String DEFAULT_SAMPLE_PROJECT_NAME = WorkbenchUtils
			.retrieveSampleProjectName(AbstractCommonTestCase.class);

	private ProjectSynchronizator synchronizor;

	@Rule
	public TestRule watchman = new TestWatcher() {
		@Override
		public void starting(Description description) {
			LOGGER.info("**********************************************************************************");
			LOGGER.info("Starting test '{}'...", description.getMethodName());
			LOGGER.info("**********************************************************************************");
		}

		@Override
		public void finished(Description description) {
			LOGGER.info("**********************************************************************************");
			LOGGER.info("Test '{}' finished.", description.getMethodName());
			LOGGER.info("**********************************************************************************");
		}
	};

	@BeforeClass
	public static void setupWorkspace() throws Exception {
		//org.eclipse.jdt.core.JavaCore.getPlugin().start(bundle.getBundleContext());
		long startTime = new Date().getTime();
		try {
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			if (workspace.isAutoBuilding()) {
				IWorkspaceDescription description = workspace.getDescription();
				description.setAutoBuilding(false);
				workspace.setDescription(description);
			}

			workspace.getRoot().refreshLocal(IResource.DEPTH_INFINITE, null);
			LOGGER.info("Initial Synchronization (@BeforeClass)");
			WorkbenchUtils.syncSampleProject(DEFAULT_SAMPLE_PROJECT_NAME);
		} finally {
			long endTime = new Date().getTime();
			LOGGER.info("Initial Workspace setup in " + (endTime - startTime) + "ms.");
		}
	}

	
	@Before
	public void bindAndBuildSampleProject() throws Exception {
		long startTime = new Date().getTime();
		try {
			projectName = WorkbenchUtils.retrieveSampleProjectName(this.getClass());
			project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			project.open(new NullProgressMonitor());
			javaProject = JavaCore.create(project);
			javaProject.open(new NullProgressMonitor());
			Assert.assertNotNull("JavaProject not found", javaProject.exists());
			Assert.assertNotNull("Project not found", javaProject.getProject().exists());
			Assert.assertTrue("Project is not open", project.isOpen());
			Assert.assertTrue("Project is not a JavaProject", JavaProject.hasJavaNature(javaProject.getProject()));
			synchronizor = new ProjectSynchronizator();
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			workspace.addResourceChangeListener(synchronizor);
			LOGGER.debug("Starting test with project {} ({})", javaProject.getElementName(), javaProject.getAllPackageFragmentRoots());
		} finally {
			long endTime = new Date().getTime();
			LOGGER.info("Test Workspace setup in " + (endTime - startTime) + "ms.");
		}
	}

	@After
	public void removeResourceChangeListener() throws CoreException, InvocationTargetException, InterruptedException {
		long startTime = new Date().getTime();
		try {
			LOGGER.info("Synchronizing the workspace back to its initial state...");
			// remove listener before sync' to avoid desync...
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			workspace.removeResourceChangeListener(synchronizor);
			synchronizor.resync();
		} finally {
			long endTime = new Date().getTime();
			LOGGER.info("Test Workspace sync'd in " + (endTime - startTime) + "ms.");
		}
	}

}

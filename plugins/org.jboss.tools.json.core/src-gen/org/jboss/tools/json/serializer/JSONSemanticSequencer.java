package org.jboss.tools.json.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.jboss.tools.json.json.False;
import org.jboss.tools.json.json.JSONArray;
import org.jboss.tools.json.json.JSONModel;
import org.jboss.tools.json.json.JSONObject;
import org.jboss.tools.json.json.JsonPackage;
import org.jboss.tools.json.json.Key;
import org.jboss.tools.json.json.Null;
import org.jboss.tools.json.json.Pair;
import org.jboss.tools.json.json.QuotedChars;
import org.jboss.tools.json.json.True;
import org.jboss.tools.json.services.JSONGrammarAccess;

@SuppressWarnings("all")
public class JSONSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private JSONGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == JsonPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case JsonPackage.FALSE:
				if(context == grammarAccess.getFalseRule() ||
				   context == grammarAccess.getJSONSimpleValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_False(context, (False) semanticObject); 
					return; 
				}
				else break;
			case JsonPackage.JSON_ARRAY:
				if(context == grammarAccess.getJSONArrayRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_JSONArray(context, (JSONArray) semanticObject); 
					return; 
				}
				else break;
			case JsonPackage.JSON_MODEL:
				if(context == grammarAccess.getJSONModelRule()) {
					sequence_JSONModel(context, (JSONModel) semanticObject); 
					return; 
				}
				else break;
			case JsonPackage.JSON_OBJECT:
				if(context == grammarAccess.getJSONObjectRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_JSONObject(context, (JSONObject) semanticObject); 
					return; 
				}
				else break;
			case JsonPackage.KEY:
				if(context == grammarAccess.getKeyRule()) {
					sequence_Key(context, (Key) semanticObject); 
					return; 
				}
				else break;
			case JsonPackage.NULL:
				if(context == grammarAccess.getJSONSimpleValueRule() ||
				   context == grammarAccess.getNullRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_Null(context, (Null) semanticObject); 
					return; 
				}
				else break;
			case JsonPackage.NUMBER:
				if(context == grammarAccess.getJSONSimpleValueRule() ||
				   context == grammarAccess.getNumberRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_Number(context, (org.jboss.tools.json.json.Number) semanticObject); 
					return; 
				}
				else break;
			case JsonPackage.PAIR:
				if(context == grammarAccess.getPairRule()) {
					sequence_Pair(context, (Pair) semanticObject); 
					return; 
				}
				else break;
			case JsonPackage.QUOTED_CHARS:
				if(context == grammarAccess.getJSONSimpleValueRule() ||
				   context == grammarAccess.getQuotedCharsRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_QuotedChars(context, (QuotedChars) semanticObject); 
					return; 
				}
				else break;
			case JsonPackage.TRUE:
				if(context == grammarAccess.getJSONSimpleValueRule() ||
				   context == grammarAccess.getTrueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_True(context, (True) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     value=TERMINAL_FALSE
	 */
	protected void sequence_False(EObject context, False semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JsonPackage.Literals.JSON_SIMPLE_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonPackage.Literals.JSON_SIMPLE_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFalseAccess().getValueTERMINAL_FALSETerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=Value elements+=Value*)
	 */
	protected void sequence_JSONArray(EObject context, JSONArray semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     rootObject=JSONObject?
	 */
	protected void sequence_JSONModel(EObject context, JSONModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((pairs+=Pair pairs+=Pair*)?)
	 */
	protected void sequence_JSONObject(EObject context, JSONObject semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=TERMINAL_QUOTED_CHARS
	 */
	protected void sequence_Key(EObject context, Key semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JsonPackage.Literals.KEY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonPackage.Literals.KEY__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getKeyAccess().getNameTERMINAL_QUOTED_CHARSTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=TERMINAL_NULL
	 */
	protected void sequence_Null(EObject context, Null semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JsonPackage.Literals.JSON_SIMPLE_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonPackage.Literals.JSON_SIMPLE_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNullAccess().getValueTERMINAL_NULLTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=TERMINAL_NUMBER
	 */
	protected void sequence_Number(EObject context, org.jboss.tools.json.json.Number semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JsonPackage.Literals.JSON_SIMPLE_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonPackage.Literals.JSON_SIMPLE_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberAccess().getValueTERMINAL_NUMBERTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (key=Key value=Value)
	 */
	protected void sequence_Pair(EObject context, Pair semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JsonPackage.Literals.PAIR__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonPackage.Literals.PAIR__KEY));
			if(transientValues.isValueTransient(semanticObject, JsonPackage.Literals.PAIR__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonPackage.Literals.PAIR__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPairAccess().getKeyKeyParserRuleCall_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getPairAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=TERMINAL_QUOTED_CHARS
	 */
	protected void sequence_QuotedChars(EObject context, QuotedChars semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JsonPackage.Literals.JSON_SIMPLE_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonPackage.Literals.JSON_SIMPLE_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQuotedCharsAccess().getValueTERMINAL_QUOTED_CHARSTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=TERMINAL_TRUE
	 */
	protected void sequence_True(EObject context, True semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, JsonPackage.Literals.JSON_SIMPLE_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, JsonPackage.Literals.JSON_SIMPLE_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTrueAccess().getValueTERMINAL_TRUETerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
}

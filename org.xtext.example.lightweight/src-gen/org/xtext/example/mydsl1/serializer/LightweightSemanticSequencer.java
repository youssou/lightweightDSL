/*
 * generated by Xtext 2.15.0
 */
package org.xtext.example.mydsl1.serializer;

import com.google.inject.Inject;
import java.util.Set;
import lightweightDSL.App;
import lightweightDSL.Biometrics;
import lightweightDSL.Credential;
import lightweightDSL.Knowledge;
import lightweightDSL.LightweightDSLPackage;
import lightweightDSL.Login;
import lightweightDSL.MFA;
import lightweightDSL.Possession;
import lightweightDSL.Recovery;
import lightweightDSL.Registration;
import lightweightDSL.Reset;
import lightweightDSL.SFA;
import lightweightDSL.VerifMethod;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl1.services.LightweightGrammarAccess;

@SuppressWarnings("all")
public class LightweightSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LightweightGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == LightweightDSLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case LightweightDSLPackage.APP:
				sequence_App(context, (App) semanticObject); 
				return; 
			case LightweightDSLPackage.BIOMETRICS:
				sequence_Biometrics(context, (Biometrics) semanticObject); 
				return; 
			case LightweightDSLPackage.CREDENTIAL:
				sequence_Credential(context, (Credential) semanticObject); 
				return; 
			case LightweightDSLPackage.KNOWLEDGE:
				sequence_Knowledge(context, (Knowledge) semanticObject); 
				return; 
			case LightweightDSLPackage.LOGIN:
				sequence_Login(context, (Login) semanticObject); 
				return; 
			case LightweightDSLPackage.MFA:
				sequence_MFA(context, (MFA) semanticObject); 
				return; 
			case LightweightDSLPackage.POSSESSION:
				sequence_Possession(context, (Possession) semanticObject); 
				return; 
			case LightweightDSLPackage.RECOVERY:
				sequence_Recovery(context, (Recovery) semanticObject); 
				return; 
			case LightweightDSLPackage.REGISTRATION:
				sequence_Registration(context, (Registration) semanticObject); 
				return; 
			case LightweightDSLPackage.RESET:
				sequence_Reset(context, (Reset) semanticObject); 
				return; 
			case LightweightDSLPackage.SFA:
				sequence_SFA(context, (SFA) semanticObject); 
				return; 
			case LightweightDSLPackage.VERIF_METHOD:
				sequence_VerifMethod(context, (VerifMethod) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     App returns App
	 *
	 * Constraint:
	 *     (
	 *         authenticators+=Authenticator 
	 *         authenticators+=Authenticator* 
	 *         authMethods+=AuthMethod 
	 *         authMethods+=AuthMethod* 
	 *         phases+=Phase 
	 *         phases+=Phase*
	 *     )
	 */
	protected void sequence_App(ISerializationContext context, App semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Authenticator returns Biometrics
	 *     Biometrics returns Biometrics
	 *
	 * Constraint:
	 *     (name=EString value=BVALUE)
	 */
	protected void sequence_Biometrics(ISerializationContext context, Biometrics semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LightweightDSLPackage.Literals.AUTHENTICATOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LightweightDSLPackage.Literals.AUTHENTICATOR__NAME));
			if (transientValues.isValueTransient(semanticObject, LightweightDSLPackage.Literals.BIOMETRICS__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LightweightDSLPackage.Literals.BIOMETRICS__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBiometricsAccess().getNameEStringParserRuleCall_5_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getBiometricsAccess().getValueBVALUEEnumRuleCall_9_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Credential returns Credential
	 *
	 * Constraint:
	 *     (name=EString provider=PROVIDER type=CredTYPE verifmethod=VerifMethod?)
	 */
	protected void sequence_Credential(ISerializationContext context, Credential semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Authenticator returns Knowledge
	 *     Knowledge returns Knowledge
	 *
	 * Constraint:
	 *     (name=EString value=KVALUE limitedAttempts?=EBoolean autofilled?=EBoolean)
	 */
	protected void sequence_Knowledge(ISerializationContext context, Knowledge semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LightweightDSLPackage.Literals.AUTHENTICATOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LightweightDSLPackage.Literals.AUTHENTICATOR__NAME));
			if (transientValues.isValueTransient(semanticObject, LightweightDSLPackage.Literals.KNOWLEDGE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LightweightDSLPackage.Literals.KNOWLEDGE__VALUE));
			if (transientValues.isValueTransient(semanticObject, LightweightDSLPackage.Literals.KNOWLEDGE__LIMITED_ATTEMPTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LightweightDSLPackage.Literals.KNOWLEDGE__LIMITED_ATTEMPTS));
			if (transientValues.isValueTransient(semanticObject, LightweightDSLPackage.Literals.KNOWLEDGE__AUTOFILLED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LightweightDSLPackage.Literals.KNOWLEDGE__AUTOFILLED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getKnowledgeAccess().getNameEStringParserRuleCall_5_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getKnowledgeAccess().getValueKVALUEEnumRuleCall_9_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getKnowledgeAccess().getLimitedAttemptsEBooleanParserRuleCall_13_0(), semanticObject.isLimitedAttempts());
		feeder.accept(grammarAccess.getKnowledgeAccess().getAutofilledEBooleanParserRuleCall_17_0(), semanticObject.isAutofilled());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Phase returns Login
	 *     Login returns Login
	 *
	 * Constraint:
	 *     (name=EString session=EBoolean authMethods+=[AuthMethod|ID] authMethods+=[AuthMethod|ID]*)
	 */
	protected void sequence_Login(ISerializationContext context, Login semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AuthMethod returns MFA
	 *     MFA returns MFA
	 *
	 * Constraint:
	 *     (name=EString authenticators+=[Authenticator|ID] authenticators+=[Authenticator|ID]+ correlation?=EBoolean validation=ValidationType)
	 */
	protected void sequence_MFA(ISerializationContext context, MFA semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Authenticator returns Possession
	 *     Possession returns Possession
	 *
	 * Constraint:
	 *     (name=EString value=PVALUE)
	 */
	protected void sequence_Possession(ISerializationContext context, Possession semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LightweightDSLPackage.Literals.AUTHENTICATOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LightweightDSLPackage.Literals.AUTHENTICATOR__NAME));
			if (transientValues.isValueTransient(semanticObject, LightweightDSLPackage.Literals.POSSESSION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LightweightDSLPackage.Literals.POSSESSION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPossessionAccess().getNameEStringParserRuleCall_5_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPossessionAccess().getValuePVALUEEnumRuleCall_9_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Phase returns Recovery
	 *     Recovery returns Recovery
	 *
	 * Constraint:
	 *     (name=EString authenticator=[Authenticator|ID]? protocol=Protocol?)
	 */
	protected void sequence_Recovery(ISerializationContext context, Recovery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Phase returns Registration
	 *     Registration returns Registration
	 *
	 * Constraint:
	 *     (name=EString credentials+=Credential credentials+=Credential*)
	 */
	protected void sequence_Registration(ISerializationContext context, Registration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Phase returns Reset
	 *     Reset returns Reset
	 *
	 * Constraint:
	 *     (name=EString authenticator=[Authenticator|ID]? authMethods+=[AuthMethod|ID] authMethods+=[AuthMethod|ID]*)
	 */
	protected void sequence_Reset(ISerializationContext context, Reset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AuthMethod returns SFA
	 *     SFA returns SFA
	 *
	 * Constraint:
	 *     (name=EString authenticators+=[Authenticator|ID])
	 */
	protected void sequence_SFA(ISerializationContext context, SFA semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     VerifMethod returns VerifMethod
	 *
	 * Constraint:
	 *     (validity=EBoolean uniqueness=EBoolean bindings=EBoolean)
	 */
	protected void sequence_VerifMethod(ISerializationContext context, VerifMethod semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LightweightDSLPackage.Literals.VERIF_METHOD__VALIDITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LightweightDSLPackage.Literals.VERIF_METHOD__VALIDITY));
			if (transientValues.isValueTransient(semanticObject, LightweightDSLPackage.Literals.VERIF_METHOD__UNIQUENESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LightweightDSLPackage.Literals.VERIF_METHOD__UNIQUENESS));
			if (transientValues.isValueTransient(semanticObject, LightweightDSLPackage.Literals.VERIF_METHOD__BINDINGS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LightweightDSLPackage.Literals.VERIF_METHOD__BINDINGS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVerifMethodAccess().getValidityEBooleanParserRuleCall_4_0(), semanticObject.isValidity());
		feeder.accept(grammarAccess.getVerifMethodAccess().getUniquenessEBooleanParserRuleCall_8_0(), semanticObject.isUniqueness());
		feeder.accept(grammarAccess.getVerifMethodAccess().getBindingsEBooleanParserRuleCall_12_0(), semanticObject.isBindings());
		feeder.finish();
	}
	
	
}

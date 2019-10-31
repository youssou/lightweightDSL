package org.xtext.example.mydsl1.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl1.services.LightweightGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLightweightParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'Identity provider'", "'Self provided'", "'Institutional'", "'Digital'", "'Physical'", "'Email-Based'", "'MS-based'", "'Local'", "'High Entropy Text-Based Password'", "'Pass phrase'", "'Knowledge-based Preferences'", "'Low Entropy Text-Based Password'", "'Pin Code'", "'Fingerprint Recognition'", "'Facial Recognition'", "'Hard Drive Token'", "'Physical device'", "'local validation'", "'Remote validation'", "'App'", "':'", "'{'", "'Authenticators'", "'['", "']'", "','", "'Authentications'", "'Procedures'", "'}'", "'name'", "'authenticators'", "'&'", "'correlation'", "'validation'", "'authenticator'", "'value'", "'limitedAttempts'", "'autofillable'", "'attributes'", "'provider'", "'type'", "'verification'", "'validity'", "'uniqueness'", "'bindings'", "'authentication'", "'||'", "'protocol'", "'persistedSession'", "'MFA'", "'SFA'", "'Possession'", "'Knowledge'", "'Biometrics'", "'Registration'", "'Recovery'", "'Login'", "'Reset'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalLightweightParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLightweightParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLightweightParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLightweight.g"; }


    	private LightweightGrammarAccess grammarAccess;

    	public void setGrammarAccess(LightweightGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleApp"
    // InternalLightweight.g:53:1: entryRuleApp : ruleApp EOF ;
    public final void entryRuleApp() throws RecognitionException {
        try {
            // InternalLightweight.g:54:1: ( ruleApp EOF )
            // InternalLightweight.g:55:1: ruleApp EOF
            {
             before(grammarAccess.getAppRule()); 
            pushFollow(FOLLOW_1);
            ruleApp();

            state._fsp--;

             after(grammarAccess.getAppRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApp"


    // $ANTLR start "ruleApp"
    // InternalLightweight.g:62:1: ruleApp : ( ( rule__App__Group__0 ) ) ;
    public final void ruleApp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:66:2: ( ( ( rule__App__Group__0 ) ) )
            // InternalLightweight.g:67:2: ( ( rule__App__Group__0 ) )
            {
            // InternalLightweight.g:67:2: ( ( rule__App__Group__0 ) )
            // InternalLightweight.g:68:3: ( rule__App__Group__0 )
            {
             before(grammarAccess.getAppAccess().getGroup()); 
            // InternalLightweight.g:69:3: ( rule__App__Group__0 )
            // InternalLightweight.g:69:4: rule__App__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__App__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApp"


    // $ANTLR start "entryRuleAuthMethod"
    // InternalLightweight.g:78:1: entryRuleAuthMethod : ruleAuthMethod EOF ;
    public final void entryRuleAuthMethod() throws RecognitionException {
        try {
            // InternalLightweight.g:79:1: ( ruleAuthMethod EOF )
            // InternalLightweight.g:80:1: ruleAuthMethod EOF
            {
             before(grammarAccess.getAuthMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleAuthMethod();

            state._fsp--;

             after(grammarAccess.getAuthMethodRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAuthMethod"


    // $ANTLR start "ruleAuthMethod"
    // InternalLightweight.g:87:1: ruleAuthMethod : ( ( rule__AuthMethod__Alternatives ) ) ;
    public final void ruleAuthMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:91:2: ( ( ( rule__AuthMethod__Alternatives ) ) )
            // InternalLightweight.g:92:2: ( ( rule__AuthMethod__Alternatives ) )
            {
            // InternalLightweight.g:92:2: ( ( rule__AuthMethod__Alternatives ) )
            // InternalLightweight.g:93:3: ( rule__AuthMethod__Alternatives )
            {
             before(grammarAccess.getAuthMethodAccess().getAlternatives()); 
            // InternalLightweight.g:94:3: ( rule__AuthMethod__Alternatives )
            // InternalLightweight.g:94:4: rule__AuthMethod__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AuthMethod__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAuthMethodAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAuthMethod"


    // $ANTLR start "entryRuleMFA"
    // InternalLightweight.g:103:1: entryRuleMFA : ruleMFA EOF ;
    public final void entryRuleMFA() throws RecognitionException {
        try {
            // InternalLightweight.g:104:1: ( ruleMFA EOF )
            // InternalLightweight.g:105:1: ruleMFA EOF
            {
             before(grammarAccess.getMFARule()); 
            pushFollow(FOLLOW_1);
            ruleMFA();

            state._fsp--;

             after(grammarAccess.getMFARule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMFA"


    // $ANTLR start "ruleMFA"
    // InternalLightweight.g:112:1: ruleMFA : ( ( rule__MFA__Group__0 ) ) ;
    public final void ruleMFA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:116:2: ( ( ( rule__MFA__Group__0 ) ) )
            // InternalLightweight.g:117:2: ( ( rule__MFA__Group__0 ) )
            {
            // InternalLightweight.g:117:2: ( ( rule__MFA__Group__0 ) )
            // InternalLightweight.g:118:3: ( rule__MFA__Group__0 )
            {
             before(grammarAccess.getMFAAccess().getGroup()); 
            // InternalLightweight.g:119:3: ( rule__MFA__Group__0 )
            // InternalLightweight.g:119:4: rule__MFA__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MFA__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMFAAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMFA"


    // $ANTLR start "entryRuleSFA"
    // InternalLightweight.g:128:1: entryRuleSFA : ruleSFA EOF ;
    public final void entryRuleSFA() throws RecognitionException {
        try {
            // InternalLightweight.g:129:1: ( ruleSFA EOF )
            // InternalLightweight.g:130:1: ruleSFA EOF
            {
             before(grammarAccess.getSFARule()); 
            pushFollow(FOLLOW_1);
            ruleSFA();

            state._fsp--;

             after(grammarAccess.getSFARule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSFA"


    // $ANTLR start "ruleSFA"
    // InternalLightweight.g:137:1: ruleSFA : ( ( rule__SFA__Group__0 ) ) ;
    public final void ruleSFA() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:141:2: ( ( ( rule__SFA__Group__0 ) ) )
            // InternalLightweight.g:142:2: ( ( rule__SFA__Group__0 ) )
            {
            // InternalLightweight.g:142:2: ( ( rule__SFA__Group__0 ) )
            // InternalLightweight.g:143:3: ( rule__SFA__Group__0 )
            {
             before(grammarAccess.getSFAAccess().getGroup()); 
            // InternalLightweight.g:144:3: ( rule__SFA__Group__0 )
            // InternalLightweight.g:144:4: rule__SFA__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SFA__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSFAAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSFA"


    // $ANTLR start "entryRuleAuthenticator"
    // InternalLightweight.g:153:1: entryRuleAuthenticator : ruleAuthenticator EOF ;
    public final void entryRuleAuthenticator() throws RecognitionException {
        try {
            // InternalLightweight.g:154:1: ( ruleAuthenticator EOF )
            // InternalLightweight.g:155:1: ruleAuthenticator EOF
            {
             before(grammarAccess.getAuthenticatorRule()); 
            pushFollow(FOLLOW_1);
            ruleAuthenticator();

            state._fsp--;

             after(grammarAccess.getAuthenticatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAuthenticator"


    // $ANTLR start "ruleAuthenticator"
    // InternalLightweight.g:162:1: ruleAuthenticator : ( ( rule__Authenticator__Alternatives ) ) ;
    public final void ruleAuthenticator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:166:2: ( ( ( rule__Authenticator__Alternatives ) ) )
            // InternalLightweight.g:167:2: ( ( rule__Authenticator__Alternatives ) )
            {
            // InternalLightweight.g:167:2: ( ( rule__Authenticator__Alternatives ) )
            // InternalLightweight.g:168:3: ( rule__Authenticator__Alternatives )
            {
             before(grammarAccess.getAuthenticatorAccess().getAlternatives()); 
            // InternalLightweight.g:169:3: ( rule__Authenticator__Alternatives )
            // InternalLightweight.g:169:4: rule__Authenticator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Authenticator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAuthenticatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAuthenticator"


    // $ANTLR start "entryRulePossession"
    // InternalLightweight.g:178:1: entryRulePossession : rulePossession EOF ;
    public final void entryRulePossession() throws RecognitionException {
        try {
            // InternalLightweight.g:179:1: ( rulePossession EOF )
            // InternalLightweight.g:180:1: rulePossession EOF
            {
             before(grammarAccess.getPossessionRule()); 
            pushFollow(FOLLOW_1);
            rulePossession();

            state._fsp--;

             after(grammarAccess.getPossessionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePossession"


    // $ANTLR start "rulePossession"
    // InternalLightweight.g:187:1: rulePossession : ( ( rule__Possession__Group__0 ) ) ;
    public final void rulePossession() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:191:2: ( ( ( rule__Possession__Group__0 ) ) )
            // InternalLightweight.g:192:2: ( ( rule__Possession__Group__0 ) )
            {
            // InternalLightweight.g:192:2: ( ( rule__Possession__Group__0 ) )
            // InternalLightweight.g:193:3: ( rule__Possession__Group__0 )
            {
             before(grammarAccess.getPossessionAccess().getGroup()); 
            // InternalLightweight.g:194:3: ( rule__Possession__Group__0 )
            // InternalLightweight.g:194:4: rule__Possession__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Possession__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPossessionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePossession"


    // $ANTLR start "entryRuleKnowledge"
    // InternalLightweight.g:203:1: entryRuleKnowledge : ruleKnowledge EOF ;
    public final void entryRuleKnowledge() throws RecognitionException {
        try {
            // InternalLightweight.g:204:1: ( ruleKnowledge EOF )
            // InternalLightweight.g:205:1: ruleKnowledge EOF
            {
             before(grammarAccess.getKnowledgeRule()); 
            pushFollow(FOLLOW_1);
            ruleKnowledge();

            state._fsp--;

             after(grammarAccess.getKnowledgeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleKnowledge"


    // $ANTLR start "ruleKnowledge"
    // InternalLightweight.g:212:1: ruleKnowledge : ( ( rule__Knowledge__Group__0 ) ) ;
    public final void ruleKnowledge() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:216:2: ( ( ( rule__Knowledge__Group__0 ) ) )
            // InternalLightweight.g:217:2: ( ( rule__Knowledge__Group__0 ) )
            {
            // InternalLightweight.g:217:2: ( ( rule__Knowledge__Group__0 ) )
            // InternalLightweight.g:218:3: ( rule__Knowledge__Group__0 )
            {
             before(grammarAccess.getKnowledgeAccess().getGroup()); 
            // InternalLightweight.g:219:3: ( rule__Knowledge__Group__0 )
            // InternalLightweight.g:219:4: rule__Knowledge__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKnowledge"


    // $ANTLR start "entryRuleBiometrics"
    // InternalLightweight.g:228:1: entryRuleBiometrics : ruleBiometrics EOF ;
    public final void entryRuleBiometrics() throws RecognitionException {
        try {
            // InternalLightweight.g:229:1: ( ruleBiometrics EOF )
            // InternalLightweight.g:230:1: ruleBiometrics EOF
            {
             before(grammarAccess.getBiometricsRule()); 
            pushFollow(FOLLOW_1);
            ruleBiometrics();

            state._fsp--;

             after(grammarAccess.getBiometricsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBiometrics"


    // $ANTLR start "ruleBiometrics"
    // InternalLightweight.g:237:1: ruleBiometrics : ( ( rule__Biometrics__Group__0 ) ) ;
    public final void ruleBiometrics() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:241:2: ( ( ( rule__Biometrics__Group__0 ) ) )
            // InternalLightweight.g:242:2: ( ( rule__Biometrics__Group__0 ) )
            {
            // InternalLightweight.g:242:2: ( ( rule__Biometrics__Group__0 ) )
            // InternalLightweight.g:243:3: ( rule__Biometrics__Group__0 )
            {
             before(grammarAccess.getBiometricsAccess().getGroup()); 
            // InternalLightweight.g:244:3: ( rule__Biometrics__Group__0 )
            // InternalLightweight.g:244:4: rule__Biometrics__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Biometrics__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBiometricsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBiometrics"


    // $ANTLR start "entryRulePhase"
    // InternalLightweight.g:253:1: entryRulePhase : rulePhase EOF ;
    public final void entryRulePhase() throws RecognitionException {
        try {
            // InternalLightweight.g:254:1: ( rulePhase EOF )
            // InternalLightweight.g:255:1: rulePhase EOF
            {
             before(grammarAccess.getPhaseRule()); 
            pushFollow(FOLLOW_1);
            rulePhase();

            state._fsp--;

             after(grammarAccess.getPhaseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePhase"


    // $ANTLR start "rulePhase"
    // InternalLightweight.g:262:1: rulePhase : ( ( rule__Phase__Alternatives ) ) ;
    public final void rulePhase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:266:2: ( ( ( rule__Phase__Alternatives ) ) )
            // InternalLightweight.g:267:2: ( ( rule__Phase__Alternatives ) )
            {
            // InternalLightweight.g:267:2: ( ( rule__Phase__Alternatives ) )
            // InternalLightweight.g:268:3: ( rule__Phase__Alternatives )
            {
             before(grammarAccess.getPhaseAccess().getAlternatives()); 
            // InternalLightweight.g:269:3: ( rule__Phase__Alternatives )
            // InternalLightweight.g:269:4: rule__Phase__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Phase__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPhaseAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePhase"


    // $ANTLR start "entryRuleEString"
    // InternalLightweight.g:278:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalLightweight.g:279:1: ( ruleEString EOF )
            // InternalLightweight.g:280:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalLightweight.g:287:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:291:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalLightweight.g:292:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalLightweight.g:292:2: ( ( rule__EString__Alternatives ) )
            // InternalLightweight.g:293:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalLightweight.g:294:3: ( rule__EString__Alternatives )
            // InternalLightweight.g:294:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleRegistration"
    // InternalLightweight.g:303:1: entryRuleRegistration : ruleRegistration EOF ;
    public final void entryRuleRegistration() throws RecognitionException {
        try {
            // InternalLightweight.g:304:1: ( ruleRegistration EOF )
            // InternalLightweight.g:305:1: ruleRegistration EOF
            {
             before(grammarAccess.getRegistrationRule()); 
            pushFollow(FOLLOW_1);
            ruleRegistration();

            state._fsp--;

             after(grammarAccess.getRegistrationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRegistration"


    // $ANTLR start "ruleRegistration"
    // InternalLightweight.g:312:1: ruleRegistration : ( ( rule__Registration__Group__0 ) ) ;
    public final void ruleRegistration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:316:2: ( ( ( rule__Registration__Group__0 ) ) )
            // InternalLightweight.g:317:2: ( ( rule__Registration__Group__0 ) )
            {
            // InternalLightweight.g:317:2: ( ( rule__Registration__Group__0 ) )
            // InternalLightweight.g:318:3: ( rule__Registration__Group__0 )
            {
             before(grammarAccess.getRegistrationAccess().getGroup()); 
            // InternalLightweight.g:319:3: ( rule__Registration__Group__0 )
            // InternalLightweight.g:319:4: rule__Registration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Registration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegistrationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegistration"


    // $ANTLR start "entryRuleAttribute"
    // InternalLightweight.g:328:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // InternalLightweight.g:329:1: ( ruleAttribute EOF )
            // InternalLightweight.g:330:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalLightweight.g:337:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:341:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // InternalLightweight.g:342:2: ( ( rule__Attribute__Group__0 ) )
            {
            // InternalLightweight.g:342:2: ( ( rule__Attribute__Group__0 ) )
            // InternalLightweight.g:343:3: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // InternalLightweight.g:344:3: ( rule__Attribute__Group__0 )
            // InternalLightweight.g:344:4: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleVerifMethod"
    // InternalLightweight.g:353:1: entryRuleVerifMethod : ruleVerifMethod EOF ;
    public final void entryRuleVerifMethod() throws RecognitionException {
        try {
            // InternalLightweight.g:354:1: ( ruleVerifMethod EOF )
            // InternalLightweight.g:355:1: ruleVerifMethod EOF
            {
             before(grammarAccess.getVerifMethodRule()); 
            pushFollow(FOLLOW_1);
            ruleVerifMethod();

            state._fsp--;

             after(grammarAccess.getVerifMethodRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVerifMethod"


    // $ANTLR start "ruleVerifMethod"
    // InternalLightweight.g:362:1: ruleVerifMethod : ( ( rule__VerifMethod__Group__0 ) ) ;
    public final void ruleVerifMethod() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:366:2: ( ( ( rule__VerifMethod__Group__0 ) ) )
            // InternalLightweight.g:367:2: ( ( rule__VerifMethod__Group__0 ) )
            {
            // InternalLightweight.g:367:2: ( ( rule__VerifMethod__Group__0 ) )
            // InternalLightweight.g:368:3: ( rule__VerifMethod__Group__0 )
            {
             before(grammarAccess.getVerifMethodAccess().getGroup()); 
            // InternalLightweight.g:369:3: ( rule__VerifMethod__Group__0 )
            // InternalLightweight.g:369:4: rule__VerifMethod__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VerifMethod__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVerifMethodAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVerifMethod"


    // $ANTLR start "entryRuleRecovery"
    // InternalLightweight.g:378:1: entryRuleRecovery : ruleRecovery EOF ;
    public final void entryRuleRecovery() throws RecognitionException {
        try {
            // InternalLightweight.g:379:1: ( ruleRecovery EOF )
            // InternalLightweight.g:380:1: ruleRecovery EOF
            {
             before(grammarAccess.getRecoveryRule()); 
            pushFollow(FOLLOW_1);
            ruleRecovery();

            state._fsp--;

             after(grammarAccess.getRecoveryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecovery"


    // $ANTLR start "ruleRecovery"
    // InternalLightweight.g:387:1: ruleRecovery : ( ( rule__Recovery__Group__0 ) ) ;
    public final void ruleRecovery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:391:2: ( ( ( rule__Recovery__Group__0 ) ) )
            // InternalLightweight.g:392:2: ( ( rule__Recovery__Group__0 ) )
            {
            // InternalLightweight.g:392:2: ( ( rule__Recovery__Group__0 ) )
            // InternalLightweight.g:393:3: ( rule__Recovery__Group__0 )
            {
             before(grammarAccess.getRecoveryAccess().getGroup()); 
            // InternalLightweight.g:394:3: ( rule__Recovery__Group__0 )
            // InternalLightweight.g:394:4: rule__Recovery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Recovery__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecoveryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecovery"


    // $ANTLR start "entryRuleLogin"
    // InternalLightweight.g:403:1: entryRuleLogin : ruleLogin EOF ;
    public final void entryRuleLogin() throws RecognitionException {
        try {
            // InternalLightweight.g:404:1: ( ruleLogin EOF )
            // InternalLightweight.g:405:1: ruleLogin EOF
            {
             before(grammarAccess.getLoginRule()); 
            pushFollow(FOLLOW_1);
            ruleLogin();

            state._fsp--;

             after(grammarAccess.getLoginRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogin"


    // $ANTLR start "ruleLogin"
    // InternalLightweight.g:412:1: ruleLogin : ( ( rule__Login__Group__0 ) ) ;
    public final void ruleLogin() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:416:2: ( ( ( rule__Login__Group__0 ) ) )
            // InternalLightweight.g:417:2: ( ( rule__Login__Group__0 ) )
            {
            // InternalLightweight.g:417:2: ( ( rule__Login__Group__0 ) )
            // InternalLightweight.g:418:3: ( rule__Login__Group__0 )
            {
             before(grammarAccess.getLoginAccess().getGroup()); 
            // InternalLightweight.g:419:3: ( rule__Login__Group__0 )
            // InternalLightweight.g:419:4: rule__Login__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Login__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoginAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogin"


    // $ANTLR start "entryRuleReset"
    // InternalLightweight.g:428:1: entryRuleReset : ruleReset EOF ;
    public final void entryRuleReset() throws RecognitionException {
        try {
            // InternalLightweight.g:429:1: ( ruleReset EOF )
            // InternalLightweight.g:430:1: ruleReset EOF
            {
             before(grammarAccess.getResetRule()); 
            pushFollow(FOLLOW_1);
            ruleReset();

            state._fsp--;

             after(grammarAccess.getResetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReset"


    // $ANTLR start "ruleReset"
    // InternalLightweight.g:437:1: ruleReset : ( ( rule__Reset__Group__0 ) ) ;
    public final void ruleReset() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:441:2: ( ( ( rule__Reset__Group__0 ) ) )
            // InternalLightweight.g:442:2: ( ( rule__Reset__Group__0 ) )
            {
            // InternalLightweight.g:442:2: ( ( rule__Reset__Group__0 ) )
            // InternalLightweight.g:443:3: ( rule__Reset__Group__0 )
            {
             before(grammarAccess.getResetAccess().getGroup()); 
            // InternalLightweight.g:444:3: ( rule__Reset__Group__0 )
            // InternalLightweight.g:444:4: rule__Reset__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reset__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReset"


    // $ANTLR start "entryRuleEBoolean"
    // InternalLightweight.g:453:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalLightweight.g:454:1: ( ruleEBoolean EOF )
            // InternalLightweight.g:455:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalLightweight.g:462:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:466:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalLightweight.g:467:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalLightweight.g:467:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalLightweight.g:468:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalLightweight.g:469:3: ( rule__EBoolean__Alternatives )
            // InternalLightweight.g:469:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "rulePROVIDER"
    // InternalLightweight.g:478:1: rulePROVIDER : ( ( rule__PROVIDER__Alternatives ) ) ;
    public final void rulePROVIDER() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:482:1: ( ( ( rule__PROVIDER__Alternatives ) ) )
            // InternalLightweight.g:483:2: ( ( rule__PROVIDER__Alternatives ) )
            {
            // InternalLightweight.g:483:2: ( ( rule__PROVIDER__Alternatives ) )
            // InternalLightweight.g:484:3: ( rule__PROVIDER__Alternatives )
            {
             before(grammarAccess.getPROVIDERAccess().getAlternatives()); 
            // InternalLightweight.g:485:3: ( rule__PROVIDER__Alternatives )
            // InternalLightweight.g:485:4: rule__PROVIDER__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PROVIDER__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPROVIDERAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePROVIDER"


    // $ANTLR start "ruleCredTYPE"
    // InternalLightweight.g:494:1: ruleCredTYPE : ( ( rule__CredTYPE__Alternatives ) ) ;
    public final void ruleCredTYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:498:1: ( ( ( rule__CredTYPE__Alternatives ) ) )
            // InternalLightweight.g:499:2: ( ( rule__CredTYPE__Alternatives ) )
            {
            // InternalLightweight.g:499:2: ( ( rule__CredTYPE__Alternatives ) )
            // InternalLightweight.g:500:3: ( rule__CredTYPE__Alternatives )
            {
             before(grammarAccess.getCredTYPEAccess().getAlternatives()); 
            // InternalLightweight.g:501:3: ( rule__CredTYPE__Alternatives )
            // InternalLightweight.g:501:4: rule__CredTYPE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CredTYPE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCredTYPEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCredTYPE"


    // $ANTLR start "ruleProtocol"
    // InternalLightweight.g:510:1: ruleProtocol : ( ( rule__Protocol__Alternatives ) ) ;
    public final void ruleProtocol() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:514:1: ( ( ( rule__Protocol__Alternatives ) ) )
            // InternalLightweight.g:515:2: ( ( rule__Protocol__Alternatives ) )
            {
            // InternalLightweight.g:515:2: ( ( rule__Protocol__Alternatives ) )
            // InternalLightweight.g:516:3: ( rule__Protocol__Alternatives )
            {
             before(grammarAccess.getProtocolAccess().getAlternatives()); 
            // InternalLightweight.g:517:3: ( rule__Protocol__Alternatives )
            // InternalLightweight.g:517:4: rule__Protocol__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Protocol__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProtocolAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "ruleBool2"
    // InternalLightweight.g:526:1: ruleBool2 : ( ( rule__Bool2__Alternatives ) ) ;
    public final void ruleBool2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:530:1: ( ( ( rule__Bool2__Alternatives ) ) )
            // InternalLightweight.g:531:2: ( ( rule__Bool2__Alternatives ) )
            {
            // InternalLightweight.g:531:2: ( ( rule__Bool2__Alternatives ) )
            // InternalLightweight.g:532:3: ( rule__Bool2__Alternatives )
            {
             before(grammarAccess.getBool2Access().getAlternatives()); 
            // InternalLightweight.g:533:3: ( rule__Bool2__Alternatives )
            // InternalLightweight.g:533:4: rule__Bool2__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Bool2__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBool2Access().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBool2"


    // $ANTLR start "ruleKVALUE"
    // InternalLightweight.g:542:1: ruleKVALUE : ( ( rule__KVALUE__Alternatives ) ) ;
    public final void ruleKVALUE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:546:1: ( ( ( rule__KVALUE__Alternatives ) ) )
            // InternalLightweight.g:547:2: ( ( rule__KVALUE__Alternatives ) )
            {
            // InternalLightweight.g:547:2: ( ( rule__KVALUE__Alternatives ) )
            // InternalLightweight.g:548:3: ( rule__KVALUE__Alternatives )
            {
             before(grammarAccess.getKVALUEAccess().getAlternatives()); 
            // InternalLightweight.g:549:3: ( rule__KVALUE__Alternatives )
            // InternalLightweight.g:549:4: rule__KVALUE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__KVALUE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getKVALUEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleKVALUE"


    // $ANTLR start "ruleBVALUE"
    // InternalLightweight.g:558:1: ruleBVALUE : ( ( rule__BVALUE__Alternatives ) ) ;
    public final void ruleBVALUE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:562:1: ( ( ( rule__BVALUE__Alternatives ) ) )
            // InternalLightweight.g:563:2: ( ( rule__BVALUE__Alternatives ) )
            {
            // InternalLightweight.g:563:2: ( ( rule__BVALUE__Alternatives ) )
            // InternalLightweight.g:564:3: ( rule__BVALUE__Alternatives )
            {
             before(grammarAccess.getBVALUEAccess().getAlternatives()); 
            // InternalLightweight.g:565:3: ( rule__BVALUE__Alternatives )
            // InternalLightweight.g:565:4: rule__BVALUE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BVALUE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBVALUEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBVALUE"


    // $ANTLR start "rulePVALUE"
    // InternalLightweight.g:574:1: rulePVALUE : ( ( rule__PVALUE__Alternatives ) ) ;
    public final void rulePVALUE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:578:1: ( ( ( rule__PVALUE__Alternatives ) ) )
            // InternalLightweight.g:579:2: ( ( rule__PVALUE__Alternatives ) )
            {
            // InternalLightweight.g:579:2: ( ( rule__PVALUE__Alternatives ) )
            // InternalLightweight.g:580:3: ( rule__PVALUE__Alternatives )
            {
             before(grammarAccess.getPVALUEAccess().getAlternatives()); 
            // InternalLightweight.g:581:3: ( rule__PVALUE__Alternatives )
            // InternalLightweight.g:581:4: rule__PVALUE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PVALUE__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPVALUEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePVALUE"


    // $ANTLR start "ruleValidationType"
    // InternalLightweight.g:590:1: ruleValidationType : ( ( rule__ValidationType__Alternatives ) ) ;
    public final void ruleValidationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:594:1: ( ( ( rule__ValidationType__Alternatives ) ) )
            // InternalLightweight.g:595:2: ( ( rule__ValidationType__Alternatives ) )
            {
            // InternalLightweight.g:595:2: ( ( rule__ValidationType__Alternatives ) )
            // InternalLightweight.g:596:3: ( rule__ValidationType__Alternatives )
            {
             before(grammarAccess.getValidationTypeAccess().getAlternatives()); 
            // InternalLightweight.g:597:3: ( rule__ValidationType__Alternatives )
            // InternalLightweight.g:597:4: rule__ValidationType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ValidationType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValidationTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidationType"


    // $ANTLR start "rule__AuthMethod__Alternatives"
    // InternalLightweight.g:605:1: rule__AuthMethod__Alternatives : ( ( ruleMFA ) | ( ruleSFA ) );
    public final void rule__AuthMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:609:1: ( ( ruleMFA ) | ( ruleSFA ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==62) ) {
                alt1=1;
            }
            else if ( (LA1_0==63) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalLightweight.g:610:2: ( ruleMFA )
                    {
                    // InternalLightweight.g:610:2: ( ruleMFA )
                    // InternalLightweight.g:611:3: ruleMFA
                    {
                     before(grammarAccess.getAuthMethodAccess().getMFAParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMFA();

                    state._fsp--;

                     after(grammarAccess.getAuthMethodAccess().getMFAParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:616:2: ( ruleSFA )
                    {
                    // InternalLightweight.g:616:2: ( ruleSFA )
                    // InternalLightweight.g:617:3: ruleSFA
                    {
                     before(grammarAccess.getAuthMethodAccess().getSFAParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSFA();

                    state._fsp--;

                     after(grammarAccess.getAuthMethodAccess().getSFAParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AuthMethod__Alternatives"


    // $ANTLR start "rule__Authenticator__Alternatives"
    // InternalLightweight.g:626:1: rule__Authenticator__Alternatives : ( ( rulePossession ) | ( ruleBiometrics ) | ( ruleKnowledge ) );
    public final void rule__Authenticator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:630:1: ( ( rulePossession ) | ( ruleBiometrics ) | ( ruleKnowledge ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt2=1;
                }
                break;
            case 66:
                {
                alt2=2;
                }
                break;
            case 65:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalLightweight.g:631:2: ( rulePossession )
                    {
                    // InternalLightweight.g:631:2: ( rulePossession )
                    // InternalLightweight.g:632:3: rulePossession
                    {
                     before(grammarAccess.getAuthenticatorAccess().getPossessionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePossession();

                    state._fsp--;

                     after(grammarAccess.getAuthenticatorAccess().getPossessionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:637:2: ( ruleBiometrics )
                    {
                    // InternalLightweight.g:637:2: ( ruleBiometrics )
                    // InternalLightweight.g:638:3: ruleBiometrics
                    {
                     before(grammarAccess.getAuthenticatorAccess().getBiometricsParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBiometrics();

                    state._fsp--;

                     after(grammarAccess.getAuthenticatorAccess().getBiometricsParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLightweight.g:643:2: ( ruleKnowledge )
                    {
                    // InternalLightweight.g:643:2: ( ruleKnowledge )
                    // InternalLightweight.g:644:3: ruleKnowledge
                    {
                     before(grammarAccess.getAuthenticatorAccess().getKnowledgeParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleKnowledge();

                    state._fsp--;

                     after(grammarAccess.getAuthenticatorAccess().getKnowledgeParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Authenticator__Alternatives"


    // $ANTLR start "rule__Phase__Alternatives"
    // InternalLightweight.g:653:1: rule__Phase__Alternatives : ( ( ruleRegistration ) | ( ruleRecovery ) | ( ruleLogin ) | ( ruleReset ) );
    public final void rule__Phase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:657:1: ( ( ruleRegistration ) | ( ruleRecovery ) | ( ruleLogin ) | ( ruleReset ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt3=1;
                }
                break;
            case 68:
                {
                alt3=2;
                }
                break;
            case 69:
                {
                alt3=3;
                }
                break;
            case 70:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalLightweight.g:658:2: ( ruleRegistration )
                    {
                    // InternalLightweight.g:658:2: ( ruleRegistration )
                    // InternalLightweight.g:659:3: ruleRegistration
                    {
                     before(grammarAccess.getPhaseAccess().getRegistrationParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRegistration();

                    state._fsp--;

                     after(grammarAccess.getPhaseAccess().getRegistrationParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:664:2: ( ruleRecovery )
                    {
                    // InternalLightweight.g:664:2: ( ruleRecovery )
                    // InternalLightweight.g:665:3: ruleRecovery
                    {
                     before(grammarAccess.getPhaseAccess().getRecoveryParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRecovery();

                    state._fsp--;

                     after(grammarAccess.getPhaseAccess().getRecoveryParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLightweight.g:670:2: ( ruleLogin )
                    {
                    // InternalLightweight.g:670:2: ( ruleLogin )
                    // InternalLightweight.g:671:3: ruleLogin
                    {
                     before(grammarAccess.getPhaseAccess().getLoginParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLogin();

                    state._fsp--;

                     after(grammarAccess.getPhaseAccess().getLoginParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLightweight.g:676:2: ( ruleReset )
                    {
                    // InternalLightweight.g:676:2: ( ruleReset )
                    // InternalLightweight.g:677:3: ruleReset
                    {
                     before(grammarAccess.getPhaseAccess().getResetParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleReset();

                    state._fsp--;

                     after(grammarAccess.getPhaseAccess().getResetParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Phase__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalLightweight.g:686:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:690:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLightweight.g:691:2: ( RULE_STRING )
                    {
                    // InternalLightweight.g:691:2: ( RULE_STRING )
                    // InternalLightweight.g:692:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:697:2: ( RULE_ID )
                    {
                    // InternalLightweight.g:697:2: ( RULE_ID )
                    // InternalLightweight.g:698:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalLightweight.g:707:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:711:1: ( ( 'true' ) | ( 'false' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==11) ) {
                alt5=1;
            }
            else if ( (LA5_0==12) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLightweight.g:712:2: ( 'true' )
                    {
                    // InternalLightweight.g:712:2: ( 'true' )
                    // InternalLightweight.g:713:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:718:2: ( 'false' )
                    {
                    // InternalLightweight.g:718:2: ( 'false' )
                    // InternalLightweight.g:719:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__PROVIDER__Alternatives"
    // InternalLightweight.g:728:1: rule__PROVIDER__Alternatives : ( ( ( 'Identity provider' ) ) | ( ( 'Self provided' ) ) | ( ( 'Institutional' ) ) );
    public final void rule__PROVIDER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:732:1: ( ( ( 'Identity provider' ) ) | ( ( 'Self provided' ) ) | ( ( 'Institutional' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalLightweight.g:733:2: ( ( 'Identity provider' ) )
                    {
                    // InternalLightweight.g:733:2: ( ( 'Identity provider' ) )
                    // InternalLightweight.g:734:3: ( 'Identity provider' )
                    {
                     before(grammarAccess.getPROVIDERAccess().getIdPEnumLiteralDeclaration_0()); 
                    // InternalLightweight.g:735:3: ( 'Identity provider' )
                    // InternalLightweight.g:735:4: 'Identity provider'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getPROVIDERAccess().getIdPEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:739:2: ( ( 'Self provided' ) )
                    {
                    // InternalLightweight.g:739:2: ( ( 'Self provided' ) )
                    // InternalLightweight.g:740:3: ( 'Self provided' )
                    {
                     before(grammarAccess.getPROVIDERAccess().getSELFEnumLiteralDeclaration_1()); 
                    // InternalLightweight.g:741:3: ( 'Self provided' )
                    // InternalLightweight.g:741:4: 'Self provided'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPROVIDERAccess().getSELFEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLightweight.g:745:2: ( ( 'Institutional' ) )
                    {
                    // InternalLightweight.g:745:2: ( ( 'Institutional' ) )
                    // InternalLightweight.g:746:3: ( 'Institutional' )
                    {
                     before(grammarAccess.getPROVIDERAccess().getINSTITUTIONALEnumLiteralDeclaration_2()); 
                    // InternalLightweight.g:747:3: ( 'Institutional' )
                    // InternalLightweight.g:747:4: 'Institutional'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getPROVIDERAccess().getINSTITUTIONALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PROVIDER__Alternatives"


    // $ANTLR start "rule__CredTYPE__Alternatives"
    // InternalLightweight.g:755:1: rule__CredTYPE__Alternatives : ( ( ( 'Digital' ) ) | ( ( 'Physical' ) ) );
    public final void rule__CredTYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:759:1: ( ( ( 'Digital' ) ) | ( ( 'Physical' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalLightweight.g:760:2: ( ( 'Digital' ) )
                    {
                    // InternalLightweight.g:760:2: ( ( 'Digital' ) )
                    // InternalLightweight.g:761:3: ( 'Digital' )
                    {
                     before(grammarAccess.getCredTYPEAccess().getDIGITALEnumLiteralDeclaration_0()); 
                    // InternalLightweight.g:762:3: ( 'Digital' )
                    // InternalLightweight.g:762:4: 'Digital'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCredTYPEAccess().getDIGITALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:766:2: ( ( 'Physical' ) )
                    {
                    // InternalLightweight.g:766:2: ( ( 'Physical' ) )
                    // InternalLightweight.g:767:3: ( 'Physical' )
                    {
                     before(grammarAccess.getCredTYPEAccess().getPHYSICALEnumLiteralDeclaration_1()); 
                    // InternalLightweight.g:768:3: ( 'Physical' )
                    // InternalLightweight.g:768:4: 'Physical'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getCredTYPEAccess().getPHYSICALEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CredTYPE__Alternatives"


    // $ANTLR start "rule__Protocol__Alternatives"
    // InternalLightweight.g:776:1: rule__Protocol__Alternatives : ( ( ( 'Email-Based' ) ) | ( ( 'MS-based' ) ) | ( ( 'Local' ) ) );
    public final void rule__Protocol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:780:1: ( ( ( 'Email-Based' ) ) | ( ( 'MS-based' ) ) | ( ( 'Local' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalLightweight.g:781:2: ( ( 'Email-Based' ) )
                    {
                    // InternalLightweight.g:781:2: ( ( 'Email-Based' ) )
                    // InternalLightweight.g:782:3: ( 'Email-Based' )
                    {
                     before(grammarAccess.getProtocolAccess().getEBIAEnumLiteralDeclaration_0()); 
                    // InternalLightweight.g:783:3: ( 'Email-Based' )
                    // InternalLightweight.g:783:4: 'Email-Based'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getProtocolAccess().getEBIAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:787:2: ( ( 'MS-based' ) )
                    {
                    // InternalLightweight.g:787:2: ( ( 'MS-based' ) )
                    // InternalLightweight.g:788:3: ( 'MS-based' )
                    {
                     before(grammarAccess.getProtocolAccess().getSMS_BASEDEnumLiteralDeclaration_1()); 
                    // InternalLightweight.g:789:3: ( 'MS-based' )
                    // InternalLightweight.g:789:4: 'MS-based'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getProtocolAccess().getSMS_BASEDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLightweight.g:793:2: ( ( 'Local' ) )
                    {
                    // InternalLightweight.g:793:2: ( ( 'Local' ) )
                    // InternalLightweight.g:794:3: ( 'Local' )
                    {
                     before(grammarAccess.getProtocolAccess().getLOCALEnumLiteralDeclaration_2()); 
                    // InternalLightweight.g:795:3: ( 'Local' )
                    // InternalLightweight.g:795:4: 'Local'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getProtocolAccess().getLOCALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Protocol__Alternatives"


    // $ANTLR start "rule__Bool2__Alternatives"
    // InternalLightweight.g:803:1: rule__Bool2__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__Bool2__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:807:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==11) ) {
                alt9=1;
            }
            else if ( (LA9_0==12) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalLightweight.g:808:2: ( ( 'true' ) )
                    {
                    // InternalLightweight.g:808:2: ( ( 'true' ) )
                    // InternalLightweight.g:809:3: ( 'true' )
                    {
                     before(grammarAccess.getBool2Access().getTRUEEnumLiteralDeclaration_0()); 
                    // InternalLightweight.g:810:3: ( 'true' )
                    // InternalLightweight.g:810:4: 'true'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getBool2Access().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:814:2: ( ( 'false' ) )
                    {
                    // InternalLightweight.g:814:2: ( ( 'false' ) )
                    // InternalLightweight.g:815:3: ( 'false' )
                    {
                     before(grammarAccess.getBool2Access().getFALSEEnumLiteralDeclaration_1()); 
                    // InternalLightweight.g:816:3: ( 'false' )
                    // InternalLightweight.g:816:4: 'false'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getBool2Access().getFALSEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Bool2__Alternatives"


    // $ANTLR start "rule__KVALUE__Alternatives"
    // InternalLightweight.g:824:1: rule__KVALUE__Alternatives : ( ( ( 'High Entropy Text-Based Password' ) ) | ( ( 'Pass phrase' ) ) | ( ( 'Knowledge-based Preferences' ) ) | ( ( 'Low Entropy Text-Based Password' ) ) | ( ( 'Pin Code' ) ) );
    public final void rule__KVALUE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:828:1: ( ( ( 'High Entropy Text-Based Password' ) ) | ( ( 'Pass phrase' ) ) | ( ( 'Knowledge-based Preferences' ) ) | ( ( 'Low Entropy Text-Based Password' ) ) | ( ( 'Pin Code' ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 22:
                {
                alt10=2;
                }
                break;
            case 23:
                {
                alt10=3;
                }
                break;
            case 24:
                {
                alt10=4;
                }
                break;
            case 25:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalLightweight.g:829:2: ( ( 'High Entropy Text-Based Password' ) )
                    {
                    // InternalLightweight.g:829:2: ( ( 'High Entropy Text-Based Password' ) )
                    // InternalLightweight.g:830:3: ( 'High Entropy Text-Based Password' )
                    {
                     before(grammarAccess.getKVALUEAccess().getSTBPEnumLiteralDeclaration_0()); 
                    // InternalLightweight.g:831:3: ( 'High Entropy Text-Based Password' )
                    // InternalLightweight.g:831:4: 'High Entropy Text-Based Password'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getKVALUEAccess().getSTBPEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:835:2: ( ( 'Pass phrase' ) )
                    {
                    // InternalLightweight.g:835:2: ( ( 'Pass phrase' ) )
                    // InternalLightweight.g:836:3: ( 'Pass phrase' )
                    {
                     before(grammarAccess.getKVALUEAccess().getPASSPHRASEEnumLiteralDeclaration_1()); 
                    // InternalLightweight.g:837:3: ( 'Pass phrase' )
                    // InternalLightweight.g:837:4: 'Pass phrase'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getKVALUEAccess().getPASSPHRASEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLightweight.g:841:2: ( ( 'Knowledge-based Preferences' ) )
                    {
                    // InternalLightweight.g:841:2: ( ( 'Knowledge-based Preferences' ) )
                    // InternalLightweight.g:842:3: ( 'Knowledge-based Preferences' )
                    {
                     before(grammarAccess.getKVALUEAccess().getPREFERENCESEnumLiteralDeclaration_2()); 
                    // InternalLightweight.g:843:3: ( 'Knowledge-based Preferences' )
                    // InternalLightweight.g:843:4: 'Knowledge-based Preferences'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getKVALUEAccess().getPREFERENCESEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLightweight.g:847:2: ( ( 'Low Entropy Text-Based Password' ) )
                    {
                    // InternalLightweight.g:847:2: ( ( 'Low Entropy Text-Based Password' ) )
                    // InternalLightweight.g:848:3: ( 'Low Entropy Text-Based Password' )
                    {
                     before(grammarAccess.getKVALUEAccess().getLTBPEnumLiteralDeclaration_3()); 
                    // InternalLightweight.g:849:3: ( 'Low Entropy Text-Based Password' )
                    // InternalLightweight.g:849:4: 'Low Entropy Text-Based Password'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getKVALUEAccess().getLTBPEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLightweight.g:853:2: ( ( 'Pin Code' ) )
                    {
                    // InternalLightweight.g:853:2: ( ( 'Pin Code' ) )
                    // InternalLightweight.g:854:3: ( 'Pin Code' )
                    {
                     before(grammarAccess.getKVALUEAccess().getPINEnumLiteralDeclaration_4()); 
                    // InternalLightweight.g:855:3: ( 'Pin Code' )
                    // InternalLightweight.g:855:4: 'Pin Code'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getKVALUEAccess().getPINEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__KVALUE__Alternatives"


    // $ANTLR start "rule__BVALUE__Alternatives"
    // InternalLightweight.g:863:1: rule__BVALUE__Alternatives : ( ( ( 'Fingerprint Recognition' ) ) | ( ( 'Facial Recognition' ) ) );
    public final void rule__BVALUE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:867:1: ( ( ( 'Fingerprint Recognition' ) ) | ( ( 'Facial Recognition' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==26) ) {
                alt11=1;
            }
            else if ( (LA11_0==27) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalLightweight.g:868:2: ( ( 'Fingerprint Recognition' ) )
                    {
                    // InternalLightweight.g:868:2: ( ( 'Fingerprint Recognition' ) )
                    // InternalLightweight.g:869:3: ( 'Fingerprint Recognition' )
                    {
                     before(grammarAccess.getBVALUEAccess().getFINGERPRINTEnumLiteralDeclaration_0()); 
                    // InternalLightweight.g:870:3: ( 'Fingerprint Recognition' )
                    // InternalLightweight.g:870:4: 'Fingerprint Recognition'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getBVALUEAccess().getFINGERPRINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:874:2: ( ( 'Facial Recognition' ) )
                    {
                    // InternalLightweight.g:874:2: ( ( 'Facial Recognition' ) )
                    // InternalLightweight.g:875:3: ( 'Facial Recognition' )
                    {
                     before(grammarAccess.getBVALUEAccess().getIRISEnumLiteralDeclaration_1()); 
                    // InternalLightweight.g:876:3: ( 'Facial Recognition' )
                    // InternalLightweight.g:876:4: 'Facial Recognition'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getBVALUEAccess().getIRISEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BVALUE__Alternatives"


    // $ANTLR start "rule__PVALUE__Alternatives"
    // InternalLightweight.g:884:1: rule__PVALUE__Alternatives : ( ( ( 'Hard Drive Token' ) ) | ( ( 'Physical device' ) ) );
    public final void rule__PVALUE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:888:1: ( ( ( 'Hard Drive Token' ) ) | ( ( 'Physical device' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            else if ( (LA12_0==29) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLightweight.g:889:2: ( ( 'Hard Drive Token' ) )
                    {
                    // InternalLightweight.g:889:2: ( ( 'Hard Drive Token' ) )
                    // InternalLightweight.g:890:3: ( 'Hard Drive Token' )
                    {
                     before(grammarAccess.getPVALUEAccess().getTOKENEnumLiteralDeclaration_0()); 
                    // InternalLightweight.g:891:3: ( 'Hard Drive Token' )
                    // InternalLightweight.g:891:4: 'Hard Drive Token'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getPVALUEAccess().getTOKENEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:895:2: ( ( 'Physical device' ) )
                    {
                    // InternalLightweight.g:895:2: ( ( 'Physical device' ) )
                    // InternalLightweight.g:896:3: ( 'Physical device' )
                    {
                     before(grammarAccess.getPVALUEAccess().getDEVICEEnumLiteralDeclaration_1()); 
                    // InternalLightweight.g:897:3: ( 'Physical device' )
                    // InternalLightweight.g:897:4: 'Physical device'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getPVALUEAccess().getDEVICEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PVALUE__Alternatives"


    // $ANTLR start "rule__ValidationType__Alternatives"
    // InternalLightweight.g:905:1: rule__ValidationType__Alternatives : ( ( ( 'local validation' ) ) | ( ( 'Remote validation' ) ) );
    public final void rule__ValidationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:909:1: ( ( ( 'local validation' ) ) | ( ( 'Remote validation' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            else if ( (LA13_0==31) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalLightweight.g:910:2: ( ( 'local validation' ) )
                    {
                    // InternalLightweight.g:910:2: ( ( 'local validation' ) )
                    // InternalLightweight.g:911:3: ( 'local validation' )
                    {
                     before(grammarAccess.getValidationTypeAccess().getLOCALEnumLiteralDeclaration_0()); 
                    // InternalLightweight.g:912:3: ( 'local validation' )
                    // InternalLightweight.g:912:4: 'local validation'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidationTypeAccess().getLOCALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:916:2: ( ( 'Remote validation' ) )
                    {
                    // InternalLightweight.g:916:2: ( ( 'Remote validation' ) )
                    // InternalLightweight.g:917:3: ( 'Remote validation' )
                    {
                     before(grammarAccess.getValidationTypeAccess().getREMOTEEnumLiteralDeclaration_1()); 
                    // InternalLightweight.g:918:3: ( 'Remote validation' )
                    // InternalLightweight.g:918:4: 'Remote validation'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidationTypeAccess().getREMOTEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ValidationType__Alternatives"


    // $ANTLR start "rule__App__Group__0"
    // InternalLightweight.g:926:1: rule__App__Group__0 : rule__App__Group__0__Impl rule__App__Group__1 ;
    public final void rule__App__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:930:1: ( rule__App__Group__0__Impl rule__App__Group__1 )
            // InternalLightweight.g:931:2: rule__App__Group__0__Impl rule__App__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__App__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__0"


    // $ANTLR start "rule__App__Group__0__Impl"
    // InternalLightweight.g:938:1: rule__App__Group__0__Impl : ( 'App' ) ;
    public final void rule__App__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:942:1: ( ( 'App' ) )
            // InternalLightweight.g:943:1: ( 'App' )
            {
            // InternalLightweight.g:943:1: ( 'App' )
            // InternalLightweight.g:944:2: 'App'
            {
             before(grammarAccess.getAppAccess().getAppKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getAppKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__0__Impl"


    // $ANTLR start "rule__App__Group__1"
    // InternalLightweight.g:953:1: rule__App__Group__1 : rule__App__Group__1__Impl rule__App__Group__2 ;
    public final void rule__App__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:957:1: ( rule__App__Group__1__Impl rule__App__Group__2 )
            // InternalLightweight.g:958:2: rule__App__Group__1__Impl rule__App__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__App__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__1"


    // $ANTLR start "rule__App__Group__1__Impl"
    // InternalLightweight.g:965:1: rule__App__Group__1__Impl : ( ':' ) ;
    public final void rule__App__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:969:1: ( ( ':' ) )
            // InternalLightweight.g:970:1: ( ':' )
            {
            // InternalLightweight.g:970:1: ( ':' )
            // InternalLightweight.g:971:2: ':'
            {
             before(grammarAccess.getAppAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__1__Impl"


    // $ANTLR start "rule__App__Group__2"
    // InternalLightweight.g:980:1: rule__App__Group__2 : rule__App__Group__2__Impl rule__App__Group__3 ;
    public final void rule__App__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:984:1: ( rule__App__Group__2__Impl rule__App__Group__3 )
            // InternalLightweight.g:985:2: rule__App__Group__2__Impl rule__App__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__App__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__2"


    // $ANTLR start "rule__App__Group__2__Impl"
    // InternalLightweight.g:992:1: rule__App__Group__2__Impl : ( '{' ) ;
    public final void rule__App__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:996:1: ( ( '{' ) )
            // InternalLightweight.g:997:1: ( '{' )
            {
            // InternalLightweight.g:997:1: ( '{' )
            // InternalLightweight.g:998:2: '{'
            {
             before(grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__2__Impl"


    // $ANTLR start "rule__App__Group__3"
    // InternalLightweight.g:1007:1: rule__App__Group__3 : rule__App__Group__3__Impl rule__App__Group__4 ;
    public final void rule__App__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1011:1: ( rule__App__Group__3__Impl rule__App__Group__4 )
            // InternalLightweight.g:1012:2: rule__App__Group__3__Impl rule__App__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__App__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__3"


    // $ANTLR start "rule__App__Group__3__Impl"
    // InternalLightweight.g:1019:1: rule__App__Group__3__Impl : ( 'Authenticators' ) ;
    public final void rule__App__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1023:1: ( ( 'Authenticators' ) )
            // InternalLightweight.g:1024:1: ( 'Authenticators' )
            {
            // InternalLightweight.g:1024:1: ( 'Authenticators' )
            // InternalLightweight.g:1025:2: 'Authenticators'
            {
             before(grammarAccess.getAppAccess().getAuthenticatorsKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getAuthenticatorsKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__3__Impl"


    // $ANTLR start "rule__App__Group__4"
    // InternalLightweight.g:1034:1: rule__App__Group__4 : rule__App__Group__4__Impl rule__App__Group__5 ;
    public final void rule__App__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1038:1: ( rule__App__Group__4__Impl rule__App__Group__5 )
            // InternalLightweight.g:1039:2: rule__App__Group__4__Impl rule__App__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__App__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__4"


    // $ANTLR start "rule__App__Group__4__Impl"
    // InternalLightweight.g:1046:1: rule__App__Group__4__Impl : ( ':' ) ;
    public final void rule__App__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1050:1: ( ( ':' ) )
            // InternalLightweight.g:1051:1: ( ':' )
            {
            // InternalLightweight.g:1051:1: ( ':' )
            // InternalLightweight.g:1052:2: ':'
            {
             before(grammarAccess.getAppAccess().getColonKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__4__Impl"


    // $ANTLR start "rule__App__Group__5"
    // InternalLightweight.g:1061:1: rule__App__Group__5 : rule__App__Group__5__Impl rule__App__Group__6 ;
    public final void rule__App__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1065:1: ( rule__App__Group__5__Impl rule__App__Group__6 )
            // InternalLightweight.g:1066:2: rule__App__Group__5__Impl rule__App__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__App__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__5"


    // $ANTLR start "rule__App__Group__5__Impl"
    // InternalLightweight.g:1073:1: rule__App__Group__5__Impl : ( '[' ) ;
    public final void rule__App__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1077:1: ( ( '[' ) )
            // InternalLightweight.g:1078:1: ( '[' )
            {
            // InternalLightweight.g:1078:1: ( '[' )
            // InternalLightweight.g:1079:2: '['
            {
             before(grammarAccess.getAppAccess().getLeftSquareBracketKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getLeftSquareBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__5__Impl"


    // $ANTLR start "rule__App__Group__6"
    // InternalLightweight.g:1088:1: rule__App__Group__6 : rule__App__Group__6__Impl rule__App__Group__7 ;
    public final void rule__App__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1092:1: ( rule__App__Group__6__Impl rule__App__Group__7 )
            // InternalLightweight.g:1093:2: rule__App__Group__6__Impl rule__App__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__App__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__6"


    // $ANTLR start "rule__App__Group__6__Impl"
    // InternalLightweight.g:1100:1: rule__App__Group__6__Impl : ( ( rule__App__AuthenticatorsAssignment_6 ) ) ;
    public final void rule__App__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1104:1: ( ( ( rule__App__AuthenticatorsAssignment_6 ) ) )
            // InternalLightweight.g:1105:1: ( ( rule__App__AuthenticatorsAssignment_6 ) )
            {
            // InternalLightweight.g:1105:1: ( ( rule__App__AuthenticatorsAssignment_6 ) )
            // InternalLightweight.g:1106:2: ( rule__App__AuthenticatorsAssignment_6 )
            {
             before(grammarAccess.getAppAccess().getAuthenticatorsAssignment_6()); 
            // InternalLightweight.g:1107:2: ( rule__App__AuthenticatorsAssignment_6 )
            // InternalLightweight.g:1107:3: rule__App__AuthenticatorsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__App__AuthenticatorsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getAuthenticatorsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__6__Impl"


    // $ANTLR start "rule__App__Group__7"
    // InternalLightweight.g:1115:1: rule__App__Group__7 : rule__App__Group__7__Impl rule__App__Group__8 ;
    public final void rule__App__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1119:1: ( rule__App__Group__7__Impl rule__App__Group__8 )
            // InternalLightweight.g:1120:2: rule__App__Group__7__Impl rule__App__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__App__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__7"


    // $ANTLR start "rule__App__Group__7__Impl"
    // InternalLightweight.g:1127:1: rule__App__Group__7__Impl : ( ( rule__App__Group_7__0 )* ) ;
    public final void rule__App__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1131:1: ( ( ( rule__App__Group_7__0 )* ) )
            // InternalLightweight.g:1132:1: ( ( rule__App__Group_7__0 )* )
            {
            // InternalLightweight.g:1132:1: ( ( rule__App__Group_7__0 )* )
            // InternalLightweight.g:1133:2: ( rule__App__Group_7__0 )*
            {
             before(grammarAccess.getAppAccess().getGroup_7()); 
            // InternalLightweight.g:1134:2: ( rule__App__Group_7__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==38) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLightweight.g:1134:3: rule__App__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__App__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getAppAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__7__Impl"


    // $ANTLR start "rule__App__Group__8"
    // InternalLightweight.g:1142:1: rule__App__Group__8 : rule__App__Group__8__Impl rule__App__Group__9 ;
    public final void rule__App__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1146:1: ( rule__App__Group__8__Impl rule__App__Group__9 )
            // InternalLightweight.g:1147:2: rule__App__Group__8__Impl rule__App__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__App__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__8"


    // $ANTLR start "rule__App__Group__8__Impl"
    // InternalLightweight.g:1154:1: rule__App__Group__8__Impl : ( ']' ) ;
    public final void rule__App__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1158:1: ( ( ']' ) )
            // InternalLightweight.g:1159:1: ( ']' )
            {
            // InternalLightweight.g:1159:1: ( ']' )
            // InternalLightweight.g:1160:2: ']'
            {
             before(grammarAccess.getAppAccess().getRightSquareBracketKeyword_8()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getRightSquareBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__8__Impl"


    // $ANTLR start "rule__App__Group__9"
    // InternalLightweight.g:1169:1: rule__App__Group__9 : rule__App__Group__9__Impl rule__App__Group__10 ;
    public final void rule__App__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1173:1: ( rule__App__Group__9__Impl rule__App__Group__10 )
            // InternalLightweight.g:1174:2: rule__App__Group__9__Impl rule__App__Group__10
            {
            pushFollow(FOLLOW_11);
            rule__App__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__9"


    // $ANTLR start "rule__App__Group__9__Impl"
    // InternalLightweight.g:1181:1: rule__App__Group__9__Impl : ( ',' ) ;
    public final void rule__App__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1185:1: ( ( ',' ) )
            // InternalLightweight.g:1186:1: ( ',' )
            {
            // InternalLightweight.g:1186:1: ( ',' )
            // InternalLightweight.g:1187:2: ','
            {
             before(grammarAccess.getAppAccess().getCommaKeyword_9()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getCommaKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__9__Impl"


    // $ANTLR start "rule__App__Group__10"
    // InternalLightweight.g:1196:1: rule__App__Group__10 : rule__App__Group__10__Impl rule__App__Group__11 ;
    public final void rule__App__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1200:1: ( rule__App__Group__10__Impl rule__App__Group__11 )
            // InternalLightweight.g:1201:2: rule__App__Group__10__Impl rule__App__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__App__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__10"


    // $ANTLR start "rule__App__Group__10__Impl"
    // InternalLightweight.g:1208:1: rule__App__Group__10__Impl : ( 'Authentications' ) ;
    public final void rule__App__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1212:1: ( ( 'Authentications' ) )
            // InternalLightweight.g:1213:1: ( 'Authentications' )
            {
            // InternalLightweight.g:1213:1: ( 'Authentications' )
            // InternalLightweight.g:1214:2: 'Authentications'
            {
             before(grammarAccess.getAppAccess().getAuthenticationsKeyword_10()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getAuthenticationsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__10__Impl"


    // $ANTLR start "rule__App__Group__11"
    // InternalLightweight.g:1223:1: rule__App__Group__11 : rule__App__Group__11__Impl rule__App__Group__12 ;
    public final void rule__App__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1227:1: ( rule__App__Group__11__Impl rule__App__Group__12 )
            // InternalLightweight.g:1228:2: rule__App__Group__11__Impl rule__App__Group__12
            {
            pushFollow(FOLLOW_6);
            rule__App__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__11"


    // $ANTLR start "rule__App__Group__11__Impl"
    // InternalLightweight.g:1235:1: rule__App__Group__11__Impl : ( ':' ) ;
    public final void rule__App__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1239:1: ( ( ':' ) )
            // InternalLightweight.g:1240:1: ( ':' )
            {
            // InternalLightweight.g:1240:1: ( ':' )
            // InternalLightweight.g:1241:2: ':'
            {
             before(grammarAccess.getAppAccess().getColonKeyword_11()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getColonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__11__Impl"


    // $ANTLR start "rule__App__Group__12"
    // InternalLightweight.g:1250:1: rule__App__Group__12 : rule__App__Group__12__Impl rule__App__Group__13 ;
    public final void rule__App__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1254:1: ( rule__App__Group__12__Impl rule__App__Group__13 )
            // InternalLightweight.g:1255:2: rule__App__Group__12__Impl rule__App__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__App__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__12"


    // $ANTLR start "rule__App__Group__12__Impl"
    // InternalLightweight.g:1262:1: rule__App__Group__12__Impl : ( '[' ) ;
    public final void rule__App__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1266:1: ( ( '[' ) )
            // InternalLightweight.g:1267:1: ( '[' )
            {
            // InternalLightweight.g:1267:1: ( '[' )
            // InternalLightweight.g:1268:2: '['
            {
             before(grammarAccess.getAppAccess().getLeftSquareBracketKeyword_12()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getLeftSquareBracketKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__12__Impl"


    // $ANTLR start "rule__App__Group__13"
    // InternalLightweight.g:1277:1: rule__App__Group__13 : rule__App__Group__13__Impl rule__App__Group__14 ;
    public final void rule__App__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1281:1: ( rule__App__Group__13__Impl rule__App__Group__14 )
            // InternalLightweight.g:1282:2: rule__App__Group__13__Impl rule__App__Group__14
            {
            pushFollow(FOLLOW_8);
            rule__App__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__13"


    // $ANTLR start "rule__App__Group__13__Impl"
    // InternalLightweight.g:1289:1: rule__App__Group__13__Impl : ( ( rule__App__AuthMethodsAssignment_13 ) ) ;
    public final void rule__App__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1293:1: ( ( ( rule__App__AuthMethodsAssignment_13 ) ) )
            // InternalLightweight.g:1294:1: ( ( rule__App__AuthMethodsAssignment_13 ) )
            {
            // InternalLightweight.g:1294:1: ( ( rule__App__AuthMethodsAssignment_13 ) )
            // InternalLightweight.g:1295:2: ( rule__App__AuthMethodsAssignment_13 )
            {
             before(grammarAccess.getAppAccess().getAuthMethodsAssignment_13()); 
            // InternalLightweight.g:1296:2: ( rule__App__AuthMethodsAssignment_13 )
            // InternalLightweight.g:1296:3: rule__App__AuthMethodsAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__App__AuthMethodsAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getAuthMethodsAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__13__Impl"


    // $ANTLR start "rule__App__Group__14"
    // InternalLightweight.g:1304:1: rule__App__Group__14 : rule__App__Group__14__Impl rule__App__Group__15 ;
    public final void rule__App__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1308:1: ( rule__App__Group__14__Impl rule__App__Group__15 )
            // InternalLightweight.g:1309:2: rule__App__Group__14__Impl rule__App__Group__15
            {
            pushFollow(FOLLOW_8);
            rule__App__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__14"


    // $ANTLR start "rule__App__Group__14__Impl"
    // InternalLightweight.g:1316:1: rule__App__Group__14__Impl : ( ( rule__App__Group_14__0 )* ) ;
    public final void rule__App__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1320:1: ( ( ( rule__App__Group_14__0 )* ) )
            // InternalLightweight.g:1321:1: ( ( rule__App__Group_14__0 )* )
            {
            // InternalLightweight.g:1321:1: ( ( rule__App__Group_14__0 )* )
            // InternalLightweight.g:1322:2: ( rule__App__Group_14__0 )*
            {
             before(grammarAccess.getAppAccess().getGroup_14()); 
            // InternalLightweight.g:1323:2: ( rule__App__Group_14__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==38) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLightweight.g:1323:3: rule__App__Group_14__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__App__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getAppAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__14__Impl"


    // $ANTLR start "rule__App__Group__15"
    // InternalLightweight.g:1331:1: rule__App__Group__15 : rule__App__Group__15__Impl rule__App__Group__16 ;
    public final void rule__App__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1335:1: ( rule__App__Group__15__Impl rule__App__Group__16 )
            // InternalLightweight.g:1336:2: rule__App__Group__15__Impl rule__App__Group__16
            {
            pushFollow(FOLLOW_10);
            rule__App__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__15"


    // $ANTLR start "rule__App__Group__15__Impl"
    // InternalLightweight.g:1343:1: rule__App__Group__15__Impl : ( ']' ) ;
    public final void rule__App__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1347:1: ( ( ']' ) )
            // InternalLightweight.g:1348:1: ( ']' )
            {
            // InternalLightweight.g:1348:1: ( ']' )
            // InternalLightweight.g:1349:2: ']'
            {
             before(grammarAccess.getAppAccess().getRightSquareBracketKeyword_15()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getRightSquareBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__15__Impl"


    // $ANTLR start "rule__App__Group__16"
    // InternalLightweight.g:1358:1: rule__App__Group__16 : rule__App__Group__16__Impl rule__App__Group__17 ;
    public final void rule__App__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1362:1: ( rule__App__Group__16__Impl rule__App__Group__17 )
            // InternalLightweight.g:1363:2: rule__App__Group__16__Impl rule__App__Group__17
            {
            pushFollow(FOLLOW_13);
            rule__App__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__16"


    // $ANTLR start "rule__App__Group__16__Impl"
    // InternalLightweight.g:1370:1: rule__App__Group__16__Impl : ( ',' ) ;
    public final void rule__App__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1374:1: ( ( ',' ) )
            // InternalLightweight.g:1375:1: ( ',' )
            {
            // InternalLightweight.g:1375:1: ( ',' )
            // InternalLightweight.g:1376:2: ','
            {
             before(grammarAccess.getAppAccess().getCommaKeyword_16()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getCommaKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__16__Impl"


    // $ANTLR start "rule__App__Group__17"
    // InternalLightweight.g:1385:1: rule__App__Group__17 : rule__App__Group__17__Impl rule__App__Group__18 ;
    public final void rule__App__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1389:1: ( rule__App__Group__17__Impl rule__App__Group__18 )
            // InternalLightweight.g:1390:2: rule__App__Group__17__Impl rule__App__Group__18
            {
            pushFollow(FOLLOW_3);
            rule__App__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__17"


    // $ANTLR start "rule__App__Group__17__Impl"
    // InternalLightweight.g:1397:1: rule__App__Group__17__Impl : ( 'Procedures' ) ;
    public final void rule__App__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1401:1: ( ( 'Procedures' ) )
            // InternalLightweight.g:1402:1: ( 'Procedures' )
            {
            // InternalLightweight.g:1402:1: ( 'Procedures' )
            // InternalLightweight.g:1403:2: 'Procedures'
            {
             before(grammarAccess.getAppAccess().getProceduresKeyword_17()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getProceduresKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__17__Impl"


    // $ANTLR start "rule__App__Group__18"
    // InternalLightweight.g:1412:1: rule__App__Group__18 : rule__App__Group__18__Impl rule__App__Group__19 ;
    public final void rule__App__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1416:1: ( rule__App__Group__18__Impl rule__App__Group__19 )
            // InternalLightweight.g:1417:2: rule__App__Group__18__Impl rule__App__Group__19
            {
            pushFollow(FOLLOW_6);
            rule__App__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__18"


    // $ANTLR start "rule__App__Group__18__Impl"
    // InternalLightweight.g:1424:1: rule__App__Group__18__Impl : ( ':' ) ;
    public final void rule__App__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1428:1: ( ( ':' ) )
            // InternalLightweight.g:1429:1: ( ':' )
            {
            // InternalLightweight.g:1429:1: ( ':' )
            // InternalLightweight.g:1430:2: ':'
            {
             before(grammarAccess.getAppAccess().getColonKeyword_18()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getColonKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__18__Impl"


    // $ANTLR start "rule__App__Group__19"
    // InternalLightweight.g:1439:1: rule__App__Group__19 : rule__App__Group__19__Impl rule__App__Group__20 ;
    public final void rule__App__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1443:1: ( rule__App__Group__19__Impl rule__App__Group__20 )
            // InternalLightweight.g:1444:2: rule__App__Group__19__Impl rule__App__Group__20
            {
            pushFollow(FOLLOW_14);
            rule__App__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__19"


    // $ANTLR start "rule__App__Group__19__Impl"
    // InternalLightweight.g:1451:1: rule__App__Group__19__Impl : ( '[' ) ;
    public final void rule__App__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1455:1: ( ( '[' ) )
            // InternalLightweight.g:1456:1: ( '[' )
            {
            // InternalLightweight.g:1456:1: ( '[' )
            // InternalLightweight.g:1457:2: '['
            {
             before(grammarAccess.getAppAccess().getLeftSquareBracketKeyword_19()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getLeftSquareBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__19__Impl"


    // $ANTLR start "rule__App__Group__20"
    // InternalLightweight.g:1466:1: rule__App__Group__20 : rule__App__Group__20__Impl rule__App__Group__21 ;
    public final void rule__App__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1470:1: ( rule__App__Group__20__Impl rule__App__Group__21 )
            // InternalLightweight.g:1471:2: rule__App__Group__20__Impl rule__App__Group__21
            {
            pushFollow(FOLLOW_8);
            rule__App__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__20"


    // $ANTLR start "rule__App__Group__20__Impl"
    // InternalLightweight.g:1478:1: rule__App__Group__20__Impl : ( ( rule__App__PhasesAssignment_20 ) ) ;
    public final void rule__App__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1482:1: ( ( ( rule__App__PhasesAssignment_20 ) ) )
            // InternalLightweight.g:1483:1: ( ( rule__App__PhasesAssignment_20 ) )
            {
            // InternalLightweight.g:1483:1: ( ( rule__App__PhasesAssignment_20 ) )
            // InternalLightweight.g:1484:2: ( rule__App__PhasesAssignment_20 )
            {
             before(grammarAccess.getAppAccess().getPhasesAssignment_20()); 
            // InternalLightweight.g:1485:2: ( rule__App__PhasesAssignment_20 )
            // InternalLightweight.g:1485:3: rule__App__PhasesAssignment_20
            {
            pushFollow(FOLLOW_2);
            rule__App__PhasesAssignment_20();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getPhasesAssignment_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__20__Impl"


    // $ANTLR start "rule__App__Group__21"
    // InternalLightweight.g:1493:1: rule__App__Group__21 : rule__App__Group__21__Impl rule__App__Group__22 ;
    public final void rule__App__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1497:1: ( rule__App__Group__21__Impl rule__App__Group__22 )
            // InternalLightweight.g:1498:2: rule__App__Group__21__Impl rule__App__Group__22
            {
            pushFollow(FOLLOW_8);
            rule__App__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__21"


    // $ANTLR start "rule__App__Group__21__Impl"
    // InternalLightweight.g:1505:1: rule__App__Group__21__Impl : ( ( rule__App__Group_21__0 )* ) ;
    public final void rule__App__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1509:1: ( ( ( rule__App__Group_21__0 )* ) )
            // InternalLightweight.g:1510:1: ( ( rule__App__Group_21__0 )* )
            {
            // InternalLightweight.g:1510:1: ( ( rule__App__Group_21__0 )* )
            // InternalLightweight.g:1511:2: ( rule__App__Group_21__0 )*
            {
             before(grammarAccess.getAppAccess().getGroup_21()); 
            // InternalLightweight.g:1512:2: ( rule__App__Group_21__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==38) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLightweight.g:1512:3: rule__App__Group_21__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__App__Group_21__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getAppAccess().getGroup_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__21__Impl"


    // $ANTLR start "rule__App__Group__22"
    // InternalLightweight.g:1520:1: rule__App__Group__22 : rule__App__Group__22__Impl rule__App__Group__23 ;
    public final void rule__App__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1524:1: ( rule__App__Group__22__Impl rule__App__Group__23 )
            // InternalLightweight.g:1525:2: rule__App__Group__22__Impl rule__App__Group__23
            {
            pushFollow(FOLLOW_15);
            rule__App__Group__22__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group__23();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__22"


    // $ANTLR start "rule__App__Group__22__Impl"
    // InternalLightweight.g:1532:1: rule__App__Group__22__Impl : ( ']' ) ;
    public final void rule__App__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1536:1: ( ( ']' ) )
            // InternalLightweight.g:1537:1: ( ']' )
            {
            // InternalLightweight.g:1537:1: ( ']' )
            // InternalLightweight.g:1538:2: ']'
            {
             before(grammarAccess.getAppAccess().getRightSquareBracketKeyword_22()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getRightSquareBracketKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__22__Impl"


    // $ANTLR start "rule__App__Group__23"
    // InternalLightweight.g:1547:1: rule__App__Group__23 : rule__App__Group__23__Impl ;
    public final void rule__App__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1551:1: ( rule__App__Group__23__Impl )
            // InternalLightweight.g:1552:2: rule__App__Group__23__Impl
            {
            pushFollow(FOLLOW_2);
            rule__App__Group__23__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__23"


    // $ANTLR start "rule__App__Group__23__Impl"
    // InternalLightweight.g:1558:1: rule__App__Group__23__Impl : ( '}' ) ;
    public final void rule__App__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1562:1: ( ( '}' ) )
            // InternalLightweight.g:1563:1: ( '}' )
            {
            // InternalLightweight.g:1563:1: ( '}' )
            // InternalLightweight.g:1564:2: '}'
            {
             before(grammarAccess.getAppAccess().getRightCurlyBracketKeyword_23()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getRightCurlyBracketKeyword_23()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group__23__Impl"


    // $ANTLR start "rule__App__Group_7__0"
    // InternalLightweight.g:1574:1: rule__App__Group_7__0 : rule__App__Group_7__0__Impl rule__App__Group_7__1 ;
    public final void rule__App__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1578:1: ( rule__App__Group_7__0__Impl rule__App__Group_7__1 )
            // InternalLightweight.g:1579:2: rule__App__Group_7__0__Impl rule__App__Group_7__1
            {
            pushFollow(FOLLOW_7);
            rule__App__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_7__0"


    // $ANTLR start "rule__App__Group_7__0__Impl"
    // InternalLightweight.g:1586:1: rule__App__Group_7__0__Impl : ( ',' ) ;
    public final void rule__App__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1590:1: ( ( ',' ) )
            // InternalLightweight.g:1591:1: ( ',' )
            {
            // InternalLightweight.g:1591:1: ( ',' )
            // InternalLightweight.g:1592:2: ','
            {
             before(grammarAccess.getAppAccess().getCommaKeyword_7_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_7__0__Impl"


    // $ANTLR start "rule__App__Group_7__1"
    // InternalLightweight.g:1601:1: rule__App__Group_7__1 : rule__App__Group_7__1__Impl ;
    public final void rule__App__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1605:1: ( rule__App__Group_7__1__Impl )
            // InternalLightweight.g:1606:2: rule__App__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__App__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_7__1"


    // $ANTLR start "rule__App__Group_7__1__Impl"
    // InternalLightweight.g:1612:1: rule__App__Group_7__1__Impl : ( ( rule__App__AuthenticatorsAssignment_7_1 ) ) ;
    public final void rule__App__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1616:1: ( ( ( rule__App__AuthenticatorsAssignment_7_1 ) ) )
            // InternalLightweight.g:1617:1: ( ( rule__App__AuthenticatorsAssignment_7_1 ) )
            {
            // InternalLightweight.g:1617:1: ( ( rule__App__AuthenticatorsAssignment_7_1 ) )
            // InternalLightweight.g:1618:2: ( rule__App__AuthenticatorsAssignment_7_1 )
            {
             before(grammarAccess.getAppAccess().getAuthenticatorsAssignment_7_1()); 
            // InternalLightweight.g:1619:2: ( rule__App__AuthenticatorsAssignment_7_1 )
            // InternalLightweight.g:1619:3: rule__App__AuthenticatorsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__App__AuthenticatorsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getAuthenticatorsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_7__1__Impl"


    // $ANTLR start "rule__App__Group_14__0"
    // InternalLightweight.g:1628:1: rule__App__Group_14__0 : rule__App__Group_14__0__Impl rule__App__Group_14__1 ;
    public final void rule__App__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1632:1: ( rule__App__Group_14__0__Impl rule__App__Group_14__1 )
            // InternalLightweight.g:1633:2: rule__App__Group_14__0__Impl rule__App__Group_14__1
            {
            pushFollow(FOLLOW_12);
            rule__App__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_14__0"


    // $ANTLR start "rule__App__Group_14__0__Impl"
    // InternalLightweight.g:1640:1: rule__App__Group_14__0__Impl : ( ',' ) ;
    public final void rule__App__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1644:1: ( ( ',' ) )
            // InternalLightweight.g:1645:1: ( ',' )
            {
            // InternalLightweight.g:1645:1: ( ',' )
            // InternalLightweight.g:1646:2: ','
            {
             before(grammarAccess.getAppAccess().getCommaKeyword_14_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getCommaKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_14__0__Impl"


    // $ANTLR start "rule__App__Group_14__1"
    // InternalLightweight.g:1655:1: rule__App__Group_14__1 : rule__App__Group_14__1__Impl ;
    public final void rule__App__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1659:1: ( rule__App__Group_14__1__Impl )
            // InternalLightweight.g:1660:2: rule__App__Group_14__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__App__Group_14__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_14__1"


    // $ANTLR start "rule__App__Group_14__1__Impl"
    // InternalLightweight.g:1666:1: rule__App__Group_14__1__Impl : ( ( rule__App__AuthMethodsAssignment_14_1 ) ) ;
    public final void rule__App__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1670:1: ( ( ( rule__App__AuthMethodsAssignment_14_1 ) ) )
            // InternalLightweight.g:1671:1: ( ( rule__App__AuthMethodsAssignment_14_1 ) )
            {
            // InternalLightweight.g:1671:1: ( ( rule__App__AuthMethodsAssignment_14_1 ) )
            // InternalLightweight.g:1672:2: ( rule__App__AuthMethodsAssignment_14_1 )
            {
             before(grammarAccess.getAppAccess().getAuthMethodsAssignment_14_1()); 
            // InternalLightweight.g:1673:2: ( rule__App__AuthMethodsAssignment_14_1 )
            // InternalLightweight.g:1673:3: rule__App__AuthMethodsAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__App__AuthMethodsAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getAuthMethodsAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_14__1__Impl"


    // $ANTLR start "rule__App__Group_21__0"
    // InternalLightweight.g:1682:1: rule__App__Group_21__0 : rule__App__Group_21__0__Impl rule__App__Group_21__1 ;
    public final void rule__App__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1686:1: ( rule__App__Group_21__0__Impl rule__App__Group_21__1 )
            // InternalLightweight.g:1687:2: rule__App__Group_21__0__Impl rule__App__Group_21__1
            {
            pushFollow(FOLLOW_14);
            rule__App__Group_21__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__App__Group_21__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_21__0"


    // $ANTLR start "rule__App__Group_21__0__Impl"
    // InternalLightweight.g:1694:1: rule__App__Group_21__0__Impl : ( ',' ) ;
    public final void rule__App__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1698:1: ( ( ',' ) )
            // InternalLightweight.g:1699:1: ( ',' )
            {
            // InternalLightweight.g:1699:1: ( ',' )
            // InternalLightweight.g:1700:2: ','
            {
             before(grammarAccess.getAppAccess().getCommaKeyword_21_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAppAccess().getCommaKeyword_21_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_21__0__Impl"


    // $ANTLR start "rule__App__Group_21__1"
    // InternalLightweight.g:1709:1: rule__App__Group_21__1 : rule__App__Group_21__1__Impl ;
    public final void rule__App__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1713:1: ( rule__App__Group_21__1__Impl )
            // InternalLightweight.g:1714:2: rule__App__Group_21__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__App__Group_21__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_21__1"


    // $ANTLR start "rule__App__Group_21__1__Impl"
    // InternalLightweight.g:1720:1: rule__App__Group_21__1__Impl : ( ( rule__App__PhasesAssignment_21_1 ) ) ;
    public final void rule__App__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1724:1: ( ( ( rule__App__PhasesAssignment_21_1 ) ) )
            // InternalLightweight.g:1725:1: ( ( rule__App__PhasesAssignment_21_1 ) )
            {
            // InternalLightweight.g:1725:1: ( ( rule__App__PhasesAssignment_21_1 ) )
            // InternalLightweight.g:1726:2: ( rule__App__PhasesAssignment_21_1 )
            {
             before(grammarAccess.getAppAccess().getPhasesAssignment_21_1()); 
            // InternalLightweight.g:1727:2: ( rule__App__PhasesAssignment_21_1 )
            // InternalLightweight.g:1727:3: rule__App__PhasesAssignment_21_1
            {
            pushFollow(FOLLOW_2);
            rule__App__PhasesAssignment_21_1();

            state._fsp--;


            }

             after(grammarAccess.getAppAccess().getPhasesAssignment_21_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__Group_21__1__Impl"


    // $ANTLR start "rule__MFA__Group__0"
    // InternalLightweight.g:1736:1: rule__MFA__Group__0 : rule__MFA__Group__0__Impl rule__MFA__Group__1 ;
    public final void rule__MFA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1740:1: ( rule__MFA__Group__0__Impl rule__MFA__Group__1 )
            // InternalLightweight.g:1741:2: rule__MFA__Group__0__Impl rule__MFA__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MFA__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MFA__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__0"


    // $ANTLR start "rule__MFA__Group__0__Impl"
    // InternalLightweight.g:1748:1: rule__MFA__Group__0__Impl : ( ( rule__MFA__TypeAssignment_0 ) ) ;
    public final void rule__MFA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1752:1: ( ( ( rule__MFA__TypeAssignment_0 ) ) )
            // InternalLightweight.g:1753:1: ( ( rule__MFA__TypeAssignment_0 ) )
            {
            // InternalLightweight.g:1753:1: ( ( rule__MFA__TypeAssignment_0 ) )
            // InternalLightweight.g:1754:2: ( rule__MFA__TypeAssignment_0 )
            {
             before(grammarAccess.getMFAAccess().getTypeAssignment_0()); 
            // InternalLightweight.g:1755:2: ( rule__MFA__TypeAssignment_0 )
            // InternalLightweight.g:1755:3: rule__MFA__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__MFA__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMFAAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__0__Impl"


    // $ANTLR start "rule__MFA__Group__1"
    // InternalLightweight.g:1763:1: rule__MFA__Group__1 : rule__MFA__Group__1__Impl rule__MFA__Group__2 ;
    public final void rule__MFA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1767:1: ( rule__MFA__Group__1__Impl rule__MFA__Group__2 )
            // InternalLightweight.g:1768:2: rule__MFA__Group__1__Impl rule__MFA__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MFA__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MFA__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__1"


    // $ANTLR start "rule__MFA__Group__1__Impl"
    // InternalLightweight.g:1775:1: rule__MFA__Group__1__Impl : ( ':' ) ;
    public final void rule__MFA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1779:1: ( ( ':' ) )
            // InternalLightweight.g:1780:1: ( ':' )
            {
            // InternalLightweight.g:1780:1: ( ':' )
            // InternalLightweight.g:1781:2: ':'
            {
             before(grammarAccess.getMFAAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMFAAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__1__Impl"


    // $ANTLR start "rule__MFA__Group__2"
    // InternalLightweight.g:1790:1: rule__MFA__Group__2 : rule__MFA__Group__2__Impl rule__MFA__Group__3 ;
    public final void rule__MFA__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1794:1: ( rule__MFA__Group__2__Impl rule__MFA__Group__3 )
            // InternalLightweight.g:1795:2: rule__MFA__Group__2__Impl rule__MFA__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__MFA__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MFA__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__2"


    // $ANTLR start "rule__MFA__Group__2__Impl"
    // InternalLightweight.g:1802:1: rule__MFA__Group__2__Impl : ( '{' ) ;
    public final void rule__MFA__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1806:1: ( ( '{' ) )
            // InternalLightweight.g:1807:1: ( '{' )
            {
            // InternalLightweight.g:1807:1: ( '{' )
            // InternalLightweight.g:1808:2: '{'
            {
             before(grammarAccess.getMFAAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMFAAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__2__Impl"


    // $ANTLR start "rule__MFA__Group__3"
    // InternalLightweight.g:1817:1: rule__MFA__Group__3 : rule__MFA__Group__3__Impl rule__MFA__Group__4 ;
    public final void rule__MFA__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1821:1: ( rule__MFA__Group__3__Impl rule__MFA__Group__4 )
            // InternalLightweight.g:1822:2: rule__MFA__Group__3__Impl rule__MFA__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__MFA__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MFA__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__3"


    // $ANTLR start "rule__MFA__Group__3__Impl"
    // InternalLightweight.g:1829:1: rule__MFA__Group__3__Impl : ( 'name' ) ;
    public final void rule__MFA__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1833:1: ( ( 'name' ) )
            // InternalLightweight.g:1834:1: ( 'name' )
            {
            // InternalLightweight.g:1834:1: ( 'name' )
            // InternalLightweight.g:1835:2: 'name'
            {
             before(grammarAccess.getMFAAccess().getNameKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getMFAAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__3__Impl"


    // $ANTLR start "rule__MFA__Group__4"
    // InternalLightweight.g:1844:1: rule__MFA__Group__4 : rule__MFA__Group__4__Impl rule__MFA__Group__5 ;
    public final void rule__MFA__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1848:1: ( rule__MFA__Group__4__Impl rule__MFA__Group__5 )
            // InternalLightweight.g:1849:2: rule__MFA__Group__4__Impl rule__MFA__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__MFA__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MFA__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__4"


    // $ANTLR start "rule__MFA__Group__4__Impl"
    // InternalLightweight.g:1856:1: rule__MFA__Group__4__Impl : ( ':' ) ;
    public final void rule__MFA__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1860:1: ( ( ':' ) )
            // InternalLightweight.g:1861:1: ( ':' )
            {
            // InternalLightweight.g:1861:1: ( ':' )
            // InternalLightweight.g:1862:2: ':'
            {
             before(grammarAccess.getMFAAccess().getColonKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMFAAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__4__Impl"


    // $ANTLR start "rule__MFA__Group__5"
    // InternalLightweight.g:1871:1: rule__MFA__Group__5 : rule__MFA__Group__5__Impl rule__MFA__Group__6 ;
    public final void rule__MFA__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1875:1: ( rule__MFA__Group__5__Impl rule__MFA__Group__6 )
            // InternalLightweight.g:1876:2: rule__MFA__Group__5__Impl rule__MFA__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__MFA__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MFA__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__5"


    // $ANTLR start "rule__MFA__Group__5__Impl"
    // InternalLightweight.g:1883:1: rule__MFA__Group__5__Impl : ( ( rule__MFA__NameAssignment_5 ) ) ;
    public final void rule__MFA__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1887:1: ( ( ( rule__MFA__NameAssignment_5 ) ) )
            // InternalLightweight.g:1888:1: ( ( rule__MFA__NameAssignment_5 ) )
            {
            // InternalLightweight.g:1888:1: ( ( rule__MFA__NameAssignment_5 ) )
            // InternalLightweight.g:1889:2: ( rule__MFA__NameAssignment_5 )
            {
             before(grammarAccess.getMFAAccess().getNameAssignment_5()); 
            // InternalLightweight.g:1890:2: ( rule__MFA__NameAssignment_5 )
            // InternalLightweight.g:1890:3: rule__MFA__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__MFA__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getMFAAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__5__Impl"


    // $ANTLR start "rule__MFA__Group__6"
    // InternalLightweight.g:1898:1: rule__MFA__Group__6 : rule__MFA__Group__6__Impl rule__MFA__Group__7 ;
    public final void rule__MFA__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1902:1: ( rule__MFA__Group__6__Impl rule__MFA__Group__7 )
            // InternalLightweight.g:1903:2: rule__MFA__Group__6__Impl rule__MFA__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__MFA__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MFA__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__6"


    // $ANTLR start "rule__MFA__Group__6__Impl"
    // InternalLightweight.g:1910:1: rule__MFA__Group__6__Impl : ( ',' ) ;
    public final void rule__MFA__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1914:1: ( ( ',' ) )
            // InternalLightweight.g:1915:1: ( ',' )
            {
            // InternalLightweight.g:1915:1: ( ',' )
            // InternalLightweight.g:1916:2: ','
            {
             before(grammarAccess.getMFAAccess().getCommaKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMFAAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__6__Impl"


    // $ANTLR start "rule__MFA__Group__7"
    // InternalLightweight.g:1925:1: rule__MFA__Group__7 : rule__MFA__Group__7__Impl rule__MFA__Group__8 ;
    public final void rule__MFA__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1929:1: ( rule__MFA__Group__7__Impl rule__MFA__Group__8 )
            // InternalLightweight.g:1930:2: rule__MFA__Group__7__Impl rule__MFA__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__MFA__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MFA__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__7"


    // $ANTLR start "rule__MFA__Group__7__Impl"
    // InternalLightweight.g:1937:1: rule__MFA__Group__7__Impl : ( 'authenticators' ) ;
    public final void rule__MFA__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1941:1: ( ( 'authenticators' ) )
            // InternalLightweight.g:1942:1: ( 'authenticators' )
            {
            // InternalLightweight.g:1942:1: ( 'authenticators' )
            // InternalLightweight.g:1943:2: 'authenticators'
            {
             before(grammarAccess.getMFAAccess().getAuthenticatorsKeyword_7()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMFAAccess().getAuthenticatorsKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__7__Impl"


    // $ANTLR start "rule__MFA__Group__8"
    // InternalLightweight.g:1952:1: rule__MFA__Group__8 : rule__MFA__Group__8__Impl rule__MFA__Group__9 ;
    public final void rule__MFA__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1956:1: ( rule__MFA__Group__8__Impl rule__MFA__Group__9 )
            // InternalLightweight.g:1957:2: rule__MFA__Group__8__Impl rule__MFA__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__MFA__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MFA__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__8"


    // $ANTLR start "rule__MFA__Group__8__Impl"
    // InternalLightweight.g:1964:1: rule__MFA__Group__8__Impl : ( ':' ) ;
    public final void rule__MFA__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1968:1: ( ( ':' ) )
            // InternalLightweight.g:1969:1: ( ':' )
            {
            // InternalLightweight.g:1969:1: ( ':' )
            // InternalLightweight.g:1970:2: ':'
            {
             before(grammarAccess.getMFAAccess().getColonKeyword_8()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMFAAccess().getColonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__8__Impl"


    // $ANTLR start "rule__MFA__Group__9"
    // InternalLightweight.g:1979:1: rule__MFA__Group__9 : rule__MFA__Group__9__Impl rule__MFA__Group__10 ;
    public final void rule__MFA__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1983:1: ( rule__MFA__Group__9__Impl rule__MFA__Group__10 )
            // InternalLightweight.g:1984:2: rule__MFA__Group__9__Impl rule__MFA__Group__10
            {
            pushFollow(FOLLOW_20);
            rule__MFA__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MFA__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__9"


    // $ANTLR start "rule__MFA__Group__9__Impl"
    // InternalLightweight.g:1991:1: rule__MFA__Group__9__Impl : ( ( rule__MFA__AuthenticatorsAssignment_9 ) ) ;
    public final void rule__MFA__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1995:1: ( ( ( rule__MFA__AuthenticatorsAssignment_9 ) ) )
            // InternalLightweight.g:1996:1: ( ( rule__MFA__AuthenticatorsAssignment_9 ) )
            {
            // InternalLightweight.g:1996:1: ( ( rule__MFA__AuthenticatorsAssignment_9 ) )
            // InternalLightweight.g:1997:2: ( rule__MFA__AuthenticatorsAssignment_9 )
            {
             before(grammarAccess.getMFAAccess().getAuthenticatorsAssignment_9()); 
            // InternalLightweight.g:1998:2: ( rule__MFA__AuthenticatorsAssignment_9 )
            // InternalLightweight.g:1998:3: rule__MFA__AuthenticatorsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__MFA__AuthenticatorsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getMFAAccess().getAuthenticatorsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__9__Impl"


    // $ANTLR start "rule__MFA__Group__10"
    // InternalLightweight.g:2006:1: rule__MFA__Group__10 : rule__MFA__Group__10__Impl rule__MFA__Group__11 ;
    public final void rule__MFA__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2010:1: ( rule__MFA__Group__10__Impl rule__MFA__Group__11 )
            // InternalLightweight.g:2011:2: rule__MFA__Group__10__Impl rule__MFA__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__MFA__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MFA__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__10"


    // $ANTLR start "rule__MFA__Group__10__Impl"
    // InternalLightweight.g:2018:1: rule__MFA__Group__10__Impl : ( '&' ) ;
    public final void rule__MFA__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2022:1: ( ( '&' ) )
            // InternalLightweight.g:2023:1: ( '&' )
            {
            // InternalLightweight.g:2023:1: ( '&' )
            // InternalLightweight.g:2024:2: '&'
            {
             before(grammarAccess.getMFAAccess().getAmpersandKeyword_10()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMFAAccess().getAmpersandKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__10__Impl"


    // $ANTLR start "rule__MFA__Group__11"
    // InternalLightweight.g:2033:1: rule__MFA__Group__11 : rule__MFA__Group__11__Impl rule__MFA__Group__12 ;
    public final void rule__MFA__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2037:1: ( rule__MFA__Group__11__Impl rule__MFA__Group__12 )
            // InternalLightweight.g:2038:2: rule__MFA__Group__11__Impl rule__MFA__Group__12
            {
            pushFollow(FOLLOW_21);
            rule__MFA__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MFA__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__11"


    // $ANTLR start "rule__MFA__Group__11__Impl"
    // InternalLightweight.g:2045:1: rule__MFA__Group__11__Impl : ( ( ( rule__MFA__AuthenticatorsAssignment_11 ) ) ( ( rule__MFA__AuthenticatorsAssignment_11 )* ) ) ;
    public final void rule__MFA__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2049:1: ( ( ( ( rule__MFA__AuthenticatorsAssignment_11 ) ) ( ( rule__MFA__AuthenticatorsAssignment_11 )* ) ) )
            // InternalLightweight.g:2050:1: ( ( ( rule__MFA__AuthenticatorsAssignment_11 ) ) ( ( rule__MFA__AuthenticatorsAssignment_11 )* ) )
            {
            // InternalLightweight.g:2050:1: ( ( ( rule__MFA__AuthenticatorsAssignment_11 ) ) ( ( rule__MFA__AuthenticatorsAssignment_11 )* ) )
            // InternalLightweight.g:2051:2: ( ( rule__MFA__AuthenticatorsAssignment_11 ) ) ( ( rule__MFA__AuthenticatorsAssignment_11 )* )
            {
            // InternalLightweight.g:2051:2: ( ( rule__MFA__AuthenticatorsAssignment_11 ) )
            // InternalLightweight.g:2052:3: ( rule__MFA__AuthenticatorsAssignment_11 )
            {
             before(grammarAccess.getMFAAccess().getAuthenticatorsAssignment_11()); 
            // InternalLightweight.g:2053:3: ( rule__MFA__AuthenticatorsAssignment_11 )
            // InternalLightweight.g:2053:4: rule__MFA__AuthenticatorsAssignment_11
            {
            pushFollow(FOLLOW_22);
            rule__MFA__AuthenticatorsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getMFAAccess().getAuthenticatorsAssignment_11()); 

            }

            // InternalLightweight.g:2056:2: ( ( rule__MFA__AuthenticatorsAssignment_11 )* )
            // InternalLightweight.g:2057:3: ( rule__MFA__AuthenticatorsAssignment_11 )*
            {
             before(grammarAccess.getMFAAccess().getAuthenticatorsAssignment_11()); 
            // InternalLightweight.g:2058:3: ( rule__MFA__AuthenticatorsAssignment_11 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalLightweight.g:2058:4: rule__MFA__AuthenticatorsAssignment_11
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__MFA__AuthenticatorsAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getMFAAccess().getAuthenticatorsAssignment_11()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__11__Impl"


    // $ANTLR start "rule__MFA__Group__12"
    // InternalLightweight.g:2067:1: rule__MFA__Group__12 : rule__MFA__Group__12__Impl rule__MFA__Group__13 ;
    public final void rule__MFA__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2071:1: ( rule__MFA__Group__12__Impl rule__MFA__Group__13 )
            // InternalLightweight.g:2072:2: rule__MFA__Group__12__Impl rule__MFA__Group__13
            {
            pushFollow(FOLLOW_21);
            rule__MFA__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MFA__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__12"


    // $ANTLR start "rule__MFA__Group__12__Impl"
    // InternalLightweight.g:2079:1: rule__MFA__Group__12__Impl : ( ( ',' )? ) ;
    public final void rule__MFA__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2083:1: ( ( ( ',' )? ) )
            // InternalLightweight.g:2084:1: ( ( ',' )? )
            {
            // InternalLightweight.g:2084:1: ( ( ',' )? )
            // InternalLightweight.g:2085:2: ( ',' )?
            {
             before(grammarAccess.getMFAAccess().getCommaKeyword_12()); 
            // InternalLightweight.g:2086:2: ( ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalLightweight.g:2086:3: ','
                    {
                    match(input,38,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMFAAccess().getCommaKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__12__Impl"


    // $ANTLR start "rule__MFA__Group__13"
    // InternalLightweight.g:2094:1: rule__MFA__Group__13 : rule__MFA__Group__13__Impl rule__MFA__Group__14 ;
    public final void rule__MFA__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2098:1: ( rule__MFA__Group__13__Impl rule__MFA__Group__14 )
            // InternalLightweight.g:2099:2: rule__MFA__Group__13__Impl rule__MFA__Group__14
            {
            pushFollow(FOLLOW_3);
            rule__MFA__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MFA__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__13"


    // $ANTLR start "rule__MFA__Group__13__Impl"
    // InternalLightweight.g:2106:1: rule__MFA__Group__13__Impl : ( 'correlation' ) ;
    public final void rule__MFA__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2110:1: ( ( 'correlation' ) )
            // InternalLightweight.g:2111:1: ( 'correlation' )
            {
            // InternalLightweight.g:2111:1: ( 'correlation' )
            // InternalLightweight.g:2112:2: 'correlation'
            {
             before(grammarAccess.getMFAAccess().getCorrelationKeyword_13()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMFAAccess().getCorrelationKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__13__Impl"


    // $ANTLR start "rule__MFA__Group__14"
    // InternalLightweight.g:2121:1: rule__MFA__Group__14 : rule__MFA__Group__14__Impl rule__MFA__Group__15 ;
    public final void rule__MFA__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2125:1: ( rule__MFA__Group__14__Impl rule__MFA__Group__15 )
            // InternalLightweight.g:2126:2: rule__MFA__Group__14__Impl rule__MFA__Group__15
            {
            pushFollow(FOLLOW_23);
            rule__MFA__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MFA__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__14"


    // $ANTLR start "rule__MFA__Group__14__Impl"
    // InternalLightweight.g:2133:1: rule__MFA__Group__14__Impl : ( ':' ) ;
    public final void rule__MFA__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2137:1: ( ( ':' ) )
            // InternalLightweight.g:2138:1: ( ':' )
            {
            // InternalLightweight.g:2138:1: ( ':' )
            // InternalLightweight.g:2139:2: ':'
            {
             before(grammarAccess.getMFAAccess().getColonKeyword_14()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMFAAccess().getColonKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__14__Impl"


    // $ANTLR start "rule__MFA__Group__15"
    // InternalLightweight.g:2148:1: rule__MFA__Group__15 : rule__MFA__Group__15__Impl rule__MFA__Group__16 ;
    public final void rule__MFA__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2152:1: ( rule__MFA__Group__15__Impl rule__MFA__Group__16 )
            // InternalLightweight.g:2153:2: rule__MFA__Group__15__Impl rule__MFA__Group__16
            {
            pushFollow(FOLLOW_10);
            rule__MFA__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MFA__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__15"


    // $ANTLR start "rule__MFA__Group__15__Impl"
    // InternalLightweight.g:2160:1: rule__MFA__Group__15__Impl : ( ( rule__MFA__CorrelationAssignment_15 ) ) ;
    public final void rule__MFA__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2164:1: ( ( ( rule__MFA__CorrelationAssignment_15 ) ) )
            // InternalLightweight.g:2165:1: ( ( rule__MFA__CorrelationAssignment_15 ) )
            {
            // InternalLightweight.g:2165:1: ( ( rule__MFA__CorrelationAssignment_15 ) )
            // InternalLightweight.g:2166:2: ( rule__MFA__CorrelationAssignment_15 )
            {
             before(grammarAccess.getMFAAccess().getCorrelationAssignment_15()); 
            // InternalLightweight.g:2167:2: ( rule__MFA__CorrelationAssignment_15 )
            // InternalLightweight.g:2167:3: rule__MFA__CorrelationAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__MFA__CorrelationAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getMFAAccess().getCorrelationAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__15__Impl"


    // $ANTLR start "rule__MFA__Group__16"
    // InternalLightweight.g:2175:1: rule__MFA__Group__16 : rule__MFA__Group__16__Impl rule__MFA__Group__17 ;
    public final void rule__MFA__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2179:1: ( rule__MFA__Group__16__Impl rule__MFA__Group__17 )
            // InternalLightweight.g:2180:2: rule__MFA__Group__16__Impl rule__MFA__Group__17
            {
            pushFollow(FOLLOW_24);
            rule__MFA__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MFA__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__16"


    // $ANTLR start "rule__MFA__Group__16__Impl"
    // InternalLightweight.g:2187:1: rule__MFA__Group__16__Impl : ( ',' ) ;
    public final void rule__MFA__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2191:1: ( ( ',' ) )
            // InternalLightweight.g:2192:1: ( ',' )
            {
            // InternalLightweight.g:2192:1: ( ',' )
            // InternalLightweight.g:2193:2: ','
            {
             before(grammarAccess.getMFAAccess().getCommaKeyword_16()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMFAAccess().getCommaKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__16__Impl"


    // $ANTLR start "rule__MFA__Group__17"
    // InternalLightweight.g:2202:1: rule__MFA__Group__17 : rule__MFA__Group__17__Impl rule__MFA__Group__18 ;
    public final void rule__MFA__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2206:1: ( rule__MFA__Group__17__Impl rule__MFA__Group__18 )
            // InternalLightweight.g:2207:2: rule__MFA__Group__17__Impl rule__MFA__Group__18
            {
            pushFollow(FOLLOW_3);
            rule__MFA__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MFA__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__17"


    // $ANTLR start "rule__MFA__Group__17__Impl"
    // InternalLightweight.g:2214:1: rule__MFA__Group__17__Impl : ( 'validation' ) ;
    public final void rule__MFA__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2218:1: ( ( 'validation' ) )
            // InternalLightweight.g:2219:1: ( 'validation' )
            {
            // InternalLightweight.g:2219:1: ( 'validation' )
            // InternalLightweight.g:2220:2: 'validation'
            {
             before(grammarAccess.getMFAAccess().getValidationKeyword_17()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMFAAccess().getValidationKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__17__Impl"


    // $ANTLR start "rule__MFA__Group__18"
    // InternalLightweight.g:2229:1: rule__MFA__Group__18 : rule__MFA__Group__18__Impl rule__MFA__Group__19 ;
    public final void rule__MFA__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2233:1: ( rule__MFA__Group__18__Impl rule__MFA__Group__19 )
            // InternalLightweight.g:2234:2: rule__MFA__Group__18__Impl rule__MFA__Group__19
            {
            pushFollow(FOLLOW_25);
            rule__MFA__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MFA__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__18"


    // $ANTLR start "rule__MFA__Group__18__Impl"
    // InternalLightweight.g:2241:1: rule__MFA__Group__18__Impl : ( ':' ) ;
    public final void rule__MFA__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2245:1: ( ( ':' ) )
            // InternalLightweight.g:2246:1: ( ':' )
            {
            // InternalLightweight.g:2246:1: ( ':' )
            // InternalLightweight.g:2247:2: ':'
            {
             before(grammarAccess.getMFAAccess().getColonKeyword_18()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMFAAccess().getColonKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__18__Impl"


    // $ANTLR start "rule__MFA__Group__19"
    // InternalLightweight.g:2256:1: rule__MFA__Group__19 : rule__MFA__Group__19__Impl rule__MFA__Group__20 ;
    public final void rule__MFA__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2260:1: ( rule__MFA__Group__19__Impl rule__MFA__Group__20 )
            // InternalLightweight.g:2261:2: rule__MFA__Group__19__Impl rule__MFA__Group__20
            {
            pushFollow(FOLLOW_15);
            rule__MFA__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MFA__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__19"


    // $ANTLR start "rule__MFA__Group__19__Impl"
    // InternalLightweight.g:2268:1: rule__MFA__Group__19__Impl : ( ( rule__MFA__ValidationAssignment_19 ) ) ;
    public final void rule__MFA__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2272:1: ( ( ( rule__MFA__ValidationAssignment_19 ) ) )
            // InternalLightweight.g:2273:1: ( ( rule__MFA__ValidationAssignment_19 ) )
            {
            // InternalLightweight.g:2273:1: ( ( rule__MFA__ValidationAssignment_19 ) )
            // InternalLightweight.g:2274:2: ( rule__MFA__ValidationAssignment_19 )
            {
             before(grammarAccess.getMFAAccess().getValidationAssignment_19()); 
            // InternalLightweight.g:2275:2: ( rule__MFA__ValidationAssignment_19 )
            // InternalLightweight.g:2275:3: rule__MFA__ValidationAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__MFA__ValidationAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getMFAAccess().getValidationAssignment_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__19__Impl"


    // $ANTLR start "rule__MFA__Group__20"
    // InternalLightweight.g:2283:1: rule__MFA__Group__20 : rule__MFA__Group__20__Impl ;
    public final void rule__MFA__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2287:1: ( rule__MFA__Group__20__Impl )
            // InternalLightweight.g:2288:2: rule__MFA__Group__20__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MFA__Group__20__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__20"


    // $ANTLR start "rule__MFA__Group__20__Impl"
    // InternalLightweight.g:2294:1: rule__MFA__Group__20__Impl : ( '}' ) ;
    public final void rule__MFA__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2298:1: ( ( '}' ) )
            // InternalLightweight.g:2299:1: ( '}' )
            {
            // InternalLightweight.g:2299:1: ( '}' )
            // InternalLightweight.g:2300:2: '}'
            {
             before(grammarAccess.getMFAAccess().getRightCurlyBracketKeyword_20()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMFAAccess().getRightCurlyBracketKeyword_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__Group__20__Impl"


    // $ANTLR start "rule__SFA__Group__0"
    // InternalLightweight.g:2310:1: rule__SFA__Group__0 : rule__SFA__Group__0__Impl rule__SFA__Group__1 ;
    public final void rule__SFA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2314:1: ( rule__SFA__Group__0__Impl rule__SFA__Group__1 )
            // InternalLightweight.g:2315:2: rule__SFA__Group__0__Impl rule__SFA__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SFA__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SFA__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__0"


    // $ANTLR start "rule__SFA__Group__0__Impl"
    // InternalLightweight.g:2322:1: rule__SFA__Group__0__Impl : ( ( rule__SFA__TypeAssignment_0 ) ) ;
    public final void rule__SFA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2326:1: ( ( ( rule__SFA__TypeAssignment_0 ) ) )
            // InternalLightweight.g:2327:1: ( ( rule__SFA__TypeAssignment_0 ) )
            {
            // InternalLightweight.g:2327:1: ( ( rule__SFA__TypeAssignment_0 ) )
            // InternalLightweight.g:2328:2: ( rule__SFA__TypeAssignment_0 )
            {
             before(grammarAccess.getSFAAccess().getTypeAssignment_0()); 
            // InternalLightweight.g:2329:2: ( rule__SFA__TypeAssignment_0 )
            // InternalLightweight.g:2329:3: rule__SFA__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SFA__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSFAAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__0__Impl"


    // $ANTLR start "rule__SFA__Group__1"
    // InternalLightweight.g:2337:1: rule__SFA__Group__1 : rule__SFA__Group__1__Impl rule__SFA__Group__2 ;
    public final void rule__SFA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2341:1: ( rule__SFA__Group__1__Impl rule__SFA__Group__2 )
            // InternalLightweight.g:2342:2: rule__SFA__Group__1__Impl rule__SFA__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SFA__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SFA__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__1"


    // $ANTLR start "rule__SFA__Group__1__Impl"
    // InternalLightweight.g:2349:1: rule__SFA__Group__1__Impl : ( ':' ) ;
    public final void rule__SFA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2353:1: ( ( ':' ) )
            // InternalLightweight.g:2354:1: ( ':' )
            {
            // InternalLightweight.g:2354:1: ( ':' )
            // InternalLightweight.g:2355:2: ':'
            {
             before(grammarAccess.getSFAAccess().getColonKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSFAAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__1__Impl"


    // $ANTLR start "rule__SFA__Group__2"
    // InternalLightweight.g:2364:1: rule__SFA__Group__2 : rule__SFA__Group__2__Impl rule__SFA__Group__3 ;
    public final void rule__SFA__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2368:1: ( rule__SFA__Group__2__Impl rule__SFA__Group__3 )
            // InternalLightweight.g:2369:2: rule__SFA__Group__2__Impl rule__SFA__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__SFA__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SFA__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__2"


    // $ANTLR start "rule__SFA__Group__2__Impl"
    // InternalLightweight.g:2376:1: rule__SFA__Group__2__Impl : ( '{' ) ;
    public final void rule__SFA__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2380:1: ( ( '{' ) )
            // InternalLightweight.g:2381:1: ( '{' )
            {
            // InternalLightweight.g:2381:1: ( '{' )
            // InternalLightweight.g:2382:2: '{'
            {
             before(grammarAccess.getSFAAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSFAAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__2__Impl"


    // $ANTLR start "rule__SFA__Group__3"
    // InternalLightweight.g:2391:1: rule__SFA__Group__3 : rule__SFA__Group__3__Impl rule__SFA__Group__4 ;
    public final void rule__SFA__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2395:1: ( rule__SFA__Group__3__Impl rule__SFA__Group__4 )
            // InternalLightweight.g:2396:2: rule__SFA__Group__3__Impl rule__SFA__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__SFA__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SFA__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__3"


    // $ANTLR start "rule__SFA__Group__3__Impl"
    // InternalLightweight.g:2403:1: rule__SFA__Group__3__Impl : ( 'name' ) ;
    public final void rule__SFA__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2407:1: ( ( 'name' ) )
            // InternalLightweight.g:2408:1: ( 'name' )
            {
            // InternalLightweight.g:2408:1: ( 'name' )
            // InternalLightweight.g:2409:2: 'name'
            {
             before(grammarAccess.getSFAAccess().getNameKeyword_3()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSFAAccess().getNameKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__3__Impl"


    // $ANTLR start "rule__SFA__Group__4"
    // InternalLightweight.g:2418:1: rule__SFA__Group__4 : rule__SFA__Group__4__Impl rule__SFA__Group__5 ;
    public final void rule__SFA__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2422:1: ( rule__SFA__Group__4__Impl rule__SFA__Group__5 )
            // InternalLightweight.g:2423:2: rule__SFA__Group__4__Impl rule__SFA__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__SFA__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SFA__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__4"


    // $ANTLR start "rule__SFA__Group__4__Impl"
    // InternalLightweight.g:2430:1: rule__SFA__Group__4__Impl : ( ':' ) ;
    public final void rule__SFA__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2434:1: ( ( ':' ) )
            // InternalLightweight.g:2435:1: ( ':' )
            {
            // InternalLightweight.g:2435:1: ( ':' )
            // InternalLightweight.g:2436:2: ':'
            {
             before(grammarAccess.getSFAAccess().getColonKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSFAAccess().getColonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__4__Impl"


    // $ANTLR start "rule__SFA__Group__5"
    // InternalLightweight.g:2445:1: rule__SFA__Group__5 : rule__SFA__Group__5__Impl rule__SFA__Group__6 ;
    public final void rule__SFA__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2449:1: ( rule__SFA__Group__5__Impl rule__SFA__Group__6 )
            // InternalLightweight.g:2450:2: rule__SFA__Group__5__Impl rule__SFA__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__SFA__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SFA__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__5"


    // $ANTLR start "rule__SFA__Group__5__Impl"
    // InternalLightweight.g:2457:1: rule__SFA__Group__5__Impl : ( ( rule__SFA__NameAssignment_5 ) ) ;
    public final void rule__SFA__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2461:1: ( ( ( rule__SFA__NameAssignment_5 ) ) )
            // InternalLightweight.g:2462:1: ( ( rule__SFA__NameAssignment_5 ) )
            {
            // InternalLightweight.g:2462:1: ( ( rule__SFA__NameAssignment_5 ) )
            // InternalLightweight.g:2463:2: ( rule__SFA__NameAssignment_5 )
            {
             before(grammarAccess.getSFAAccess().getNameAssignment_5()); 
            // InternalLightweight.g:2464:2: ( rule__SFA__NameAssignment_5 )
            // InternalLightweight.g:2464:3: rule__SFA__NameAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SFA__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSFAAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__5__Impl"


    // $ANTLR start "rule__SFA__Group__6"
    // InternalLightweight.g:2472:1: rule__SFA__Group__6 : rule__SFA__Group__6__Impl rule__SFA__Group__7 ;
    public final void rule__SFA__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2476:1: ( rule__SFA__Group__6__Impl rule__SFA__Group__7 )
            // InternalLightweight.g:2477:2: rule__SFA__Group__6__Impl rule__SFA__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__SFA__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SFA__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__6"


    // $ANTLR start "rule__SFA__Group__6__Impl"
    // InternalLightweight.g:2484:1: rule__SFA__Group__6__Impl : ( ',' ) ;
    public final void rule__SFA__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2488:1: ( ( ',' ) )
            // InternalLightweight.g:2489:1: ( ',' )
            {
            // InternalLightweight.g:2489:1: ( ',' )
            // InternalLightweight.g:2490:2: ','
            {
             before(grammarAccess.getSFAAccess().getCommaKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSFAAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__6__Impl"


    // $ANTLR start "rule__SFA__Group__7"
    // InternalLightweight.g:2499:1: rule__SFA__Group__7 : rule__SFA__Group__7__Impl rule__SFA__Group__8 ;
    public final void rule__SFA__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2503:1: ( rule__SFA__Group__7__Impl rule__SFA__Group__8 )
            // InternalLightweight.g:2504:2: rule__SFA__Group__7__Impl rule__SFA__Group__8
            {
            pushFollow(FOLLOW_3);
            rule__SFA__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SFA__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__7"


    // $ANTLR start "rule__SFA__Group__7__Impl"
    // InternalLightweight.g:2511:1: rule__SFA__Group__7__Impl : ( 'authenticator' ) ;
    public final void rule__SFA__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2515:1: ( ( 'authenticator' ) )
            // InternalLightweight.g:2516:1: ( 'authenticator' )
            {
            // InternalLightweight.g:2516:1: ( 'authenticator' )
            // InternalLightweight.g:2517:2: 'authenticator'
            {
             before(grammarAccess.getSFAAccess().getAuthenticatorKeyword_7()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSFAAccess().getAuthenticatorKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__7__Impl"


    // $ANTLR start "rule__SFA__Group__8"
    // InternalLightweight.g:2526:1: rule__SFA__Group__8 : rule__SFA__Group__8__Impl rule__SFA__Group__9 ;
    public final void rule__SFA__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2530:1: ( rule__SFA__Group__8__Impl rule__SFA__Group__9 )
            // InternalLightweight.g:2531:2: rule__SFA__Group__8__Impl rule__SFA__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__SFA__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SFA__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__8"


    // $ANTLR start "rule__SFA__Group__8__Impl"
    // InternalLightweight.g:2538:1: rule__SFA__Group__8__Impl : ( ':' ) ;
    public final void rule__SFA__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2542:1: ( ( ':' ) )
            // InternalLightweight.g:2543:1: ( ':' )
            {
            // InternalLightweight.g:2543:1: ( ':' )
            // InternalLightweight.g:2544:2: ':'
            {
             before(grammarAccess.getSFAAccess().getColonKeyword_8()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSFAAccess().getColonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__8__Impl"


    // $ANTLR start "rule__SFA__Group__9"
    // InternalLightweight.g:2553:1: rule__SFA__Group__9 : rule__SFA__Group__9__Impl rule__SFA__Group__10 ;
    public final void rule__SFA__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2557:1: ( rule__SFA__Group__9__Impl rule__SFA__Group__10 )
            // InternalLightweight.g:2558:2: rule__SFA__Group__9__Impl rule__SFA__Group__10
            {
            pushFollow(FOLLOW_15);
            rule__SFA__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SFA__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__9"


    // $ANTLR start "rule__SFA__Group__9__Impl"
    // InternalLightweight.g:2565:1: rule__SFA__Group__9__Impl : ( ( rule__SFA__AuthenticatorsAssignment_9 ) ) ;
    public final void rule__SFA__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2569:1: ( ( ( rule__SFA__AuthenticatorsAssignment_9 ) ) )
            // InternalLightweight.g:2570:1: ( ( rule__SFA__AuthenticatorsAssignment_9 ) )
            {
            // InternalLightweight.g:2570:1: ( ( rule__SFA__AuthenticatorsAssignment_9 ) )
            // InternalLightweight.g:2571:2: ( rule__SFA__AuthenticatorsAssignment_9 )
            {
             before(grammarAccess.getSFAAccess().getAuthenticatorsAssignment_9()); 
            // InternalLightweight.g:2572:2: ( rule__SFA__AuthenticatorsAssignment_9 )
            // InternalLightweight.g:2572:3: rule__SFA__AuthenticatorsAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__SFA__AuthenticatorsAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getSFAAccess().getAuthenticatorsAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__9__Impl"


    // $ANTLR start "rule__SFA__Group__10"
    // InternalLightweight.g:2580:1: rule__SFA__Group__10 : rule__SFA__Group__10__Impl ;
    public final void rule__SFA__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2584:1: ( rule__SFA__Group__10__Impl )
            // InternalLightweight.g:2585:2: rule__SFA__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SFA__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__10"


    // $ANTLR start "rule__SFA__Group__10__Impl"
    // InternalLightweight.g:2591:1: rule__SFA__Group__10__Impl : ( '}' ) ;
    public final void rule__SFA__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2595:1: ( ( '}' ) )
            // InternalLightweight.g:2596:1: ( '}' )
            {
            // InternalLightweight.g:2596:1: ( '}' )
            // InternalLightweight.g:2597:2: '}'
            {
             before(grammarAccess.getSFAAccess().getRightCurlyBracketKeyword_10()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSFAAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__Group__10__Impl"


    // $ANTLR start "rule__Possession__Group__0"
    // InternalLightweight.g:2607:1: rule__Possession__Group__0 : rule__Possession__Group__0__Impl rule__Possession__Group__1 ;
    public final void rule__Possession__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2611:1: ( rule__Possession__Group__0__Impl rule__Possession__Group__1 )
            // InternalLightweight.g:2612:2: rule__Possession__Group__0__Impl rule__Possession__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Possession__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Possession__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__0"


    // $ANTLR start "rule__Possession__Group__0__Impl"
    // InternalLightweight.g:2619:1: rule__Possession__Group__0__Impl : ( () ) ;
    public final void rule__Possession__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2623:1: ( ( () ) )
            // InternalLightweight.g:2624:1: ( () )
            {
            // InternalLightweight.g:2624:1: ( () )
            // InternalLightweight.g:2625:2: ()
            {
             before(grammarAccess.getPossessionAccess().getPossessionAction_0()); 
            // InternalLightweight.g:2626:2: ()
            // InternalLightweight.g:2626:3: 
            {
            }

             after(grammarAccess.getPossessionAccess().getPossessionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__0__Impl"


    // $ANTLR start "rule__Possession__Group__1"
    // InternalLightweight.g:2634:1: rule__Possession__Group__1 : rule__Possession__Group__1__Impl rule__Possession__Group__2 ;
    public final void rule__Possession__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2638:1: ( rule__Possession__Group__1__Impl rule__Possession__Group__2 )
            // InternalLightweight.g:2639:2: rule__Possession__Group__1__Impl rule__Possession__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Possession__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Possession__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__1"


    // $ANTLR start "rule__Possession__Group__1__Impl"
    // InternalLightweight.g:2646:1: rule__Possession__Group__1__Impl : ( ( rule__Possession__TypeAssignment_1 ) ) ;
    public final void rule__Possession__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2650:1: ( ( ( rule__Possession__TypeAssignment_1 ) ) )
            // InternalLightweight.g:2651:1: ( ( rule__Possession__TypeAssignment_1 ) )
            {
            // InternalLightweight.g:2651:1: ( ( rule__Possession__TypeAssignment_1 ) )
            // InternalLightweight.g:2652:2: ( rule__Possession__TypeAssignment_1 )
            {
             before(grammarAccess.getPossessionAccess().getTypeAssignment_1()); 
            // InternalLightweight.g:2653:2: ( rule__Possession__TypeAssignment_1 )
            // InternalLightweight.g:2653:3: rule__Possession__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Possession__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPossessionAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__1__Impl"


    // $ANTLR start "rule__Possession__Group__2"
    // InternalLightweight.g:2661:1: rule__Possession__Group__2 : rule__Possession__Group__2__Impl rule__Possession__Group__3 ;
    public final void rule__Possession__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2665:1: ( rule__Possession__Group__2__Impl rule__Possession__Group__3 )
            // InternalLightweight.g:2666:2: rule__Possession__Group__2__Impl rule__Possession__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Possession__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Possession__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__2"


    // $ANTLR start "rule__Possession__Group__2__Impl"
    // InternalLightweight.g:2673:1: rule__Possession__Group__2__Impl : ( ':' ) ;
    public final void rule__Possession__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2677:1: ( ( ':' ) )
            // InternalLightweight.g:2678:1: ( ':' )
            {
            // InternalLightweight.g:2678:1: ( ':' )
            // InternalLightweight.g:2679:2: ':'
            {
             before(grammarAccess.getPossessionAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPossessionAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__2__Impl"


    // $ANTLR start "rule__Possession__Group__3"
    // InternalLightweight.g:2688:1: rule__Possession__Group__3 : rule__Possession__Group__3__Impl rule__Possession__Group__4 ;
    public final void rule__Possession__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2692:1: ( rule__Possession__Group__3__Impl rule__Possession__Group__4 )
            // InternalLightweight.g:2693:2: rule__Possession__Group__3__Impl rule__Possession__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Possession__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Possession__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__3"


    // $ANTLR start "rule__Possession__Group__3__Impl"
    // InternalLightweight.g:2700:1: rule__Possession__Group__3__Impl : ( '{' ) ;
    public final void rule__Possession__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2704:1: ( ( '{' ) )
            // InternalLightweight.g:2705:1: ( '{' )
            {
            // InternalLightweight.g:2705:1: ( '{' )
            // InternalLightweight.g:2706:2: '{'
            {
             before(grammarAccess.getPossessionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPossessionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__3__Impl"


    // $ANTLR start "rule__Possession__Group__4"
    // InternalLightweight.g:2715:1: rule__Possession__Group__4 : rule__Possession__Group__4__Impl rule__Possession__Group__5 ;
    public final void rule__Possession__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2719:1: ( rule__Possession__Group__4__Impl rule__Possession__Group__5 )
            // InternalLightweight.g:2720:2: rule__Possession__Group__4__Impl rule__Possession__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Possession__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Possession__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__4"


    // $ANTLR start "rule__Possession__Group__4__Impl"
    // InternalLightweight.g:2727:1: rule__Possession__Group__4__Impl : ( 'name' ) ;
    public final void rule__Possession__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2731:1: ( ( 'name' ) )
            // InternalLightweight.g:2732:1: ( 'name' )
            {
            // InternalLightweight.g:2732:1: ( 'name' )
            // InternalLightweight.g:2733:2: 'name'
            {
             before(grammarAccess.getPossessionAccess().getNameKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPossessionAccess().getNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__4__Impl"


    // $ANTLR start "rule__Possession__Group__5"
    // InternalLightweight.g:2742:1: rule__Possession__Group__5 : rule__Possession__Group__5__Impl rule__Possession__Group__6 ;
    public final void rule__Possession__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2746:1: ( rule__Possession__Group__5__Impl rule__Possession__Group__6 )
            // InternalLightweight.g:2747:2: rule__Possession__Group__5__Impl rule__Possession__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Possession__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Possession__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__5"


    // $ANTLR start "rule__Possession__Group__5__Impl"
    // InternalLightweight.g:2754:1: rule__Possession__Group__5__Impl : ( ':' ) ;
    public final void rule__Possession__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2758:1: ( ( ':' ) )
            // InternalLightweight.g:2759:1: ( ':' )
            {
            // InternalLightweight.g:2759:1: ( ':' )
            // InternalLightweight.g:2760:2: ':'
            {
             before(grammarAccess.getPossessionAccess().getColonKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPossessionAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__5__Impl"


    // $ANTLR start "rule__Possession__Group__6"
    // InternalLightweight.g:2769:1: rule__Possession__Group__6 : rule__Possession__Group__6__Impl rule__Possession__Group__7 ;
    public final void rule__Possession__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2773:1: ( rule__Possession__Group__6__Impl rule__Possession__Group__7 )
            // InternalLightweight.g:2774:2: rule__Possession__Group__6__Impl rule__Possession__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Possession__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Possession__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__6"


    // $ANTLR start "rule__Possession__Group__6__Impl"
    // InternalLightweight.g:2781:1: rule__Possession__Group__6__Impl : ( ( rule__Possession__NameAssignment_6 ) ) ;
    public final void rule__Possession__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2785:1: ( ( ( rule__Possession__NameAssignment_6 ) ) )
            // InternalLightweight.g:2786:1: ( ( rule__Possession__NameAssignment_6 ) )
            {
            // InternalLightweight.g:2786:1: ( ( rule__Possession__NameAssignment_6 ) )
            // InternalLightweight.g:2787:2: ( rule__Possession__NameAssignment_6 )
            {
             before(grammarAccess.getPossessionAccess().getNameAssignment_6()); 
            // InternalLightweight.g:2788:2: ( rule__Possession__NameAssignment_6 )
            // InternalLightweight.g:2788:3: rule__Possession__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Possession__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPossessionAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__6__Impl"


    // $ANTLR start "rule__Possession__Group__7"
    // InternalLightweight.g:2796:1: rule__Possession__Group__7 : rule__Possession__Group__7__Impl rule__Possession__Group__8 ;
    public final void rule__Possession__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2800:1: ( rule__Possession__Group__7__Impl rule__Possession__Group__8 )
            // InternalLightweight.g:2801:2: rule__Possession__Group__7__Impl rule__Possession__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__Possession__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Possession__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__7"


    // $ANTLR start "rule__Possession__Group__7__Impl"
    // InternalLightweight.g:2808:1: rule__Possession__Group__7__Impl : ( ',' ) ;
    public final void rule__Possession__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2812:1: ( ( ',' ) )
            // InternalLightweight.g:2813:1: ( ',' )
            {
            // InternalLightweight.g:2813:1: ( ',' )
            // InternalLightweight.g:2814:2: ','
            {
             before(grammarAccess.getPossessionAccess().getCommaKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPossessionAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__7__Impl"


    // $ANTLR start "rule__Possession__Group__8"
    // InternalLightweight.g:2823:1: rule__Possession__Group__8 : rule__Possession__Group__8__Impl rule__Possession__Group__9 ;
    public final void rule__Possession__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2827:1: ( rule__Possession__Group__8__Impl rule__Possession__Group__9 )
            // InternalLightweight.g:2828:2: rule__Possession__Group__8__Impl rule__Possession__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Possession__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Possession__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__8"


    // $ANTLR start "rule__Possession__Group__8__Impl"
    // InternalLightweight.g:2835:1: rule__Possession__Group__8__Impl : ( 'value' ) ;
    public final void rule__Possession__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2839:1: ( ( 'value' ) )
            // InternalLightweight.g:2840:1: ( 'value' )
            {
            // InternalLightweight.g:2840:1: ( 'value' )
            // InternalLightweight.g:2841:2: 'value'
            {
             before(grammarAccess.getPossessionAccess().getValueKeyword_8()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getPossessionAccess().getValueKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__8__Impl"


    // $ANTLR start "rule__Possession__Group__9"
    // InternalLightweight.g:2850:1: rule__Possession__Group__9 : rule__Possession__Group__9__Impl rule__Possession__Group__10 ;
    public final void rule__Possession__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2854:1: ( rule__Possession__Group__9__Impl rule__Possession__Group__10 )
            // InternalLightweight.g:2855:2: rule__Possession__Group__9__Impl rule__Possession__Group__10
            {
            pushFollow(FOLLOW_29);
            rule__Possession__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Possession__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__9"


    // $ANTLR start "rule__Possession__Group__9__Impl"
    // InternalLightweight.g:2862:1: rule__Possession__Group__9__Impl : ( ':' ) ;
    public final void rule__Possession__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2866:1: ( ( ':' ) )
            // InternalLightweight.g:2867:1: ( ':' )
            {
            // InternalLightweight.g:2867:1: ( ':' )
            // InternalLightweight.g:2868:2: ':'
            {
             before(grammarAccess.getPossessionAccess().getColonKeyword_9()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPossessionAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__9__Impl"


    // $ANTLR start "rule__Possession__Group__10"
    // InternalLightweight.g:2877:1: rule__Possession__Group__10 : rule__Possession__Group__10__Impl rule__Possession__Group__11 ;
    public final void rule__Possession__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2881:1: ( rule__Possession__Group__10__Impl rule__Possession__Group__11 )
            // InternalLightweight.g:2882:2: rule__Possession__Group__10__Impl rule__Possession__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__Possession__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Possession__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__10"


    // $ANTLR start "rule__Possession__Group__10__Impl"
    // InternalLightweight.g:2889:1: rule__Possession__Group__10__Impl : ( ( rule__Possession__ValueAssignment_10 ) ) ;
    public final void rule__Possession__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2893:1: ( ( ( rule__Possession__ValueAssignment_10 ) ) )
            // InternalLightweight.g:2894:1: ( ( rule__Possession__ValueAssignment_10 ) )
            {
            // InternalLightweight.g:2894:1: ( ( rule__Possession__ValueAssignment_10 ) )
            // InternalLightweight.g:2895:2: ( rule__Possession__ValueAssignment_10 )
            {
             before(grammarAccess.getPossessionAccess().getValueAssignment_10()); 
            // InternalLightweight.g:2896:2: ( rule__Possession__ValueAssignment_10 )
            // InternalLightweight.g:2896:3: rule__Possession__ValueAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Possession__ValueAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getPossessionAccess().getValueAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__10__Impl"


    // $ANTLR start "rule__Possession__Group__11"
    // InternalLightweight.g:2904:1: rule__Possession__Group__11 : rule__Possession__Group__11__Impl ;
    public final void rule__Possession__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2908:1: ( rule__Possession__Group__11__Impl )
            // InternalLightweight.g:2909:2: rule__Possession__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Possession__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__11"


    // $ANTLR start "rule__Possession__Group__11__Impl"
    // InternalLightweight.g:2915:1: rule__Possession__Group__11__Impl : ( '}' ) ;
    public final void rule__Possession__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2919:1: ( ( '}' ) )
            // InternalLightweight.g:2920:1: ( '}' )
            {
            // InternalLightweight.g:2920:1: ( '}' )
            // InternalLightweight.g:2921:2: '}'
            {
             before(grammarAccess.getPossessionAccess().getRightCurlyBracketKeyword_11()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPossessionAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__Group__11__Impl"


    // $ANTLR start "rule__Knowledge__Group__0"
    // InternalLightweight.g:2931:1: rule__Knowledge__Group__0 : rule__Knowledge__Group__0__Impl rule__Knowledge__Group__1 ;
    public final void rule__Knowledge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2935:1: ( rule__Knowledge__Group__0__Impl rule__Knowledge__Group__1 )
            // InternalLightweight.g:2936:2: rule__Knowledge__Group__0__Impl rule__Knowledge__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Knowledge__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__0"


    // $ANTLR start "rule__Knowledge__Group__0__Impl"
    // InternalLightweight.g:2943:1: rule__Knowledge__Group__0__Impl : ( () ) ;
    public final void rule__Knowledge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2947:1: ( ( () ) )
            // InternalLightweight.g:2948:1: ( () )
            {
            // InternalLightweight.g:2948:1: ( () )
            // InternalLightweight.g:2949:2: ()
            {
             before(grammarAccess.getKnowledgeAccess().getKnowledgeAction_0()); 
            // InternalLightweight.g:2950:2: ()
            // InternalLightweight.g:2950:3: 
            {
            }

             after(grammarAccess.getKnowledgeAccess().getKnowledgeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__0__Impl"


    // $ANTLR start "rule__Knowledge__Group__1"
    // InternalLightweight.g:2958:1: rule__Knowledge__Group__1 : rule__Knowledge__Group__1__Impl rule__Knowledge__Group__2 ;
    public final void rule__Knowledge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2962:1: ( rule__Knowledge__Group__1__Impl rule__Knowledge__Group__2 )
            // InternalLightweight.g:2963:2: rule__Knowledge__Group__1__Impl rule__Knowledge__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Knowledge__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__1"


    // $ANTLR start "rule__Knowledge__Group__1__Impl"
    // InternalLightweight.g:2970:1: rule__Knowledge__Group__1__Impl : ( ( rule__Knowledge__TypeAssignment_1 ) ) ;
    public final void rule__Knowledge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2974:1: ( ( ( rule__Knowledge__TypeAssignment_1 ) ) )
            // InternalLightweight.g:2975:1: ( ( rule__Knowledge__TypeAssignment_1 ) )
            {
            // InternalLightweight.g:2975:1: ( ( rule__Knowledge__TypeAssignment_1 ) )
            // InternalLightweight.g:2976:2: ( rule__Knowledge__TypeAssignment_1 )
            {
             before(grammarAccess.getKnowledgeAccess().getTypeAssignment_1()); 
            // InternalLightweight.g:2977:2: ( rule__Knowledge__TypeAssignment_1 )
            // InternalLightweight.g:2977:3: rule__Knowledge__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Knowledge__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__1__Impl"


    // $ANTLR start "rule__Knowledge__Group__2"
    // InternalLightweight.g:2985:1: rule__Knowledge__Group__2 : rule__Knowledge__Group__2__Impl rule__Knowledge__Group__3 ;
    public final void rule__Knowledge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2989:1: ( rule__Knowledge__Group__2__Impl rule__Knowledge__Group__3 )
            // InternalLightweight.g:2990:2: rule__Knowledge__Group__2__Impl rule__Knowledge__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Knowledge__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__2"


    // $ANTLR start "rule__Knowledge__Group__2__Impl"
    // InternalLightweight.g:2997:1: rule__Knowledge__Group__2__Impl : ( ':' ) ;
    public final void rule__Knowledge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3001:1: ( ( ':' ) )
            // InternalLightweight.g:3002:1: ( ':' )
            {
            // InternalLightweight.g:3002:1: ( ':' )
            // InternalLightweight.g:3003:2: ':'
            {
             before(grammarAccess.getKnowledgeAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getKnowledgeAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__2__Impl"


    // $ANTLR start "rule__Knowledge__Group__3"
    // InternalLightweight.g:3012:1: rule__Knowledge__Group__3 : rule__Knowledge__Group__3__Impl rule__Knowledge__Group__4 ;
    public final void rule__Knowledge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3016:1: ( rule__Knowledge__Group__3__Impl rule__Knowledge__Group__4 )
            // InternalLightweight.g:3017:2: rule__Knowledge__Group__3__Impl rule__Knowledge__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Knowledge__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__3"


    // $ANTLR start "rule__Knowledge__Group__3__Impl"
    // InternalLightweight.g:3024:1: rule__Knowledge__Group__3__Impl : ( '{' ) ;
    public final void rule__Knowledge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3028:1: ( ( '{' ) )
            // InternalLightweight.g:3029:1: ( '{' )
            {
            // InternalLightweight.g:3029:1: ( '{' )
            // InternalLightweight.g:3030:2: '{'
            {
             before(grammarAccess.getKnowledgeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getKnowledgeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__3__Impl"


    // $ANTLR start "rule__Knowledge__Group__4"
    // InternalLightweight.g:3039:1: rule__Knowledge__Group__4 : rule__Knowledge__Group__4__Impl rule__Knowledge__Group__5 ;
    public final void rule__Knowledge__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3043:1: ( rule__Knowledge__Group__4__Impl rule__Knowledge__Group__5 )
            // InternalLightweight.g:3044:2: rule__Knowledge__Group__4__Impl rule__Knowledge__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Knowledge__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__4"


    // $ANTLR start "rule__Knowledge__Group__4__Impl"
    // InternalLightweight.g:3051:1: rule__Knowledge__Group__4__Impl : ( 'name' ) ;
    public final void rule__Knowledge__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3055:1: ( ( 'name' ) )
            // InternalLightweight.g:3056:1: ( 'name' )
            {
            // InternalLightweight.g:3056:1: ( 'name' )
            // InternalLightweight.g:3057:2: 'name'
            {
             before(grammarAccess.getKnowledgeAccess().getNameKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getKnowledgeAccess().getNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__4__Impl"


    // $ANTLR start "rule__Knowledge__Group__5"
    // InternalLightweight.g:3066:1: rule__Knowledge__Group__5 : rule__Knowledge__Group__5__Impl rule__Knowledge__Group__6 ;
    public final void rule__Knowledge__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3070:1: ( rule__Knowledge__Group__5__Impl rule__Knowledge__Group__6 )
            // InternalLightweight.g:3071:2: rule__Knowledge__Group__5__Impl rule__Knowledge__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Knowledge__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__5"


    // $ANTLR start "rule__Knowledge__Group__5__Impl"
    // InternalLightweight.g:3078:1: rule__Knowledge__Group__5__Impl : ( ':' ) ;
    public final void rule__Knowledge__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3082:1: ( ( ':' ) )
            // InternalLightweight.g:3083:1: ( ':' )
            {
            // InternalLightweight.g:3083:1: ( ':' )
            // InternalLightweight.g:3084:2: ':'
            {
             before(grammarAccess.getKnowledgeAccess().getColonKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getKnowledgeAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__5__Impl"


    // $ANTLR start "rule__Knowledge__Group__6"
    // InternalLightweight.g:3093:1: rule__Knowledge__Group__6 : rule__Knowledge__Group__6__Impl rule__Knowledge__Group__7 ;
    public final void rule__Knowledge__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3097:1: ( rule__Knowledge__Group__6__Impl rule__Knowledge__Group__7 )
            // InternalLightweight.g:3098:2: rule__Knowledge__Group__6__Impl rule__Knowledge__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Knowledge__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__6"


    // $ANTLR start "rule__Knowledge__Group__6__Impl"
    // InternalLightweight.g:3105:1: rule__Knowledge__Group__6__Impl : ( ( rule__Knowledge__NameAssignment_6 ) ) ;
    public final void rule__Knowledge__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3109:1: ( ( ( rule__Knowledge__NameAssignment_6 ) ) )
            // InternalLightweight.g:3110:1: ( ( rule__Knowledge__NameAssignment_6 ) )
            {
            // InternalLightweight.g:3110:1: ( ( rule__Knowledge__NameAssignment_6 ) )
            // InternalLightweight.g:3111:2: ( rule__Knowledge__NameAssignment_6 )
            {
             before(grammarAccess.getKnowledgeAccess().getNameAssignment_6()); 
            // InternalLightweight.g:3112:2: ( rule__Knowledge__NameAssignment_6 )
            // InternalLightweight.g:3112:3: rule__Knowledge__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Knowledge__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__6__Impl"


    // $ANTLR start "rule__Knowledge__Group__7"
    // InternalLightweight.g:3120:1: rule__Knowledge__Group__7 : rule__Knowledge__Group__7__Impl rule__Knowledge__Group__8 ;
    public final void rule__Knowledge__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3124:1: ( rule__Knowledge__Group__7__Impl rule__Knowledge__Group__8 )
            // InternalLightweight.g:3125:2: rule__Knowledge__Group__7__Impl rule__Knowledge__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__Knowledge__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__7"


    // $ANTLR start "rule__Knowledge__Group__7__Impl"
    // InternalLightweight.g:3132:1: rule__Knowledge__Group__7__Impl : ( ',' ) ;
    public final void rule__Knowledge__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3136:1: ( ( ',' ) )
            // InternalLightweight.g:3137:1: ( ',' )
            {
            // InternalLightweight.g:3137:1: ( ',' )
            // InternalLightweight.g:3138:2: ','
            {
             before(grammarAccess.getKnowledgeAccess().getCommaKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getKnowledgeAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__7__Impl"


    // $ANTLR start "rule__Knowledge__Group__8"
    // InternalLightweight.g:3147:1: rule__Knowledge__Group__8 : rule__Knowledge__Group__8__Impl rule__Knowledge__Group__9 ;
    public final void rule__Knowledge__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3151:1: ( rule__Knowledge__Group__8__Impl rule__Knowledge__Group__9 )
            // InternalLightweight.g:3152:2: rule__Knowledge__Group__8__Impl rule__Knowledge__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Knowledge__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__8"


    // $ANTLR start "rule__Knowledge__Group__8__Impl"
    // InternalLightweight.g:3159:1: rule__Knowledge__Group__8__Impl : ( 'value' ) ;
    public final void rule__Knowledge__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3163:1: ( ( 'value' ) )
            // InternalLightweight.g:3164:1: ( 'value' )
            {
            // InternalLightweight.g:3164:1: ( 'value' )
            // InternalLightweight.g:3165:2: 'value'
            {
             before(grammarAccess.getKnowledgeAccess().getValueKeyword_8()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getKnowledgeAccess().getValueKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__8__Impl"


    // $ANTLR start "rule__Knowledge__Group__9"
    // InternalLightweight.g:3174:1: rule__Knowledge__Group__9 : rule__Knowledge__Group__9__Impl rule__Knowledge__Group__10 ;
    public final void rule__Knowledge__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3178:1: ( rule__Knowledge__Group__9__Impl rule__Knowledge__Group__10 )
            // InternalLightweight.g:3179:2: rule__Knowledge__Group__9__Impl rule__Knowledge__Group__10
            {
            pushFollow(FOLLOW_30);
            rule__Knowledge__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__9"


    // $ANTLR start "rule__Knowledge__Group__9__Impl"
    // InternalLightweight.g:3186:1: rule__Knowledge__Group__9__Impl : ( ':' ) ;
    public final void rule__Knowledge__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3190:1: ( ( ':' ) )
            // InternalLightweight.g:3191:1: ( ':' )
            {
            // InternalLightweight.g:3191:1: ( ':' )
            // InternalLightweight.g:3192:2: ':'
            {
             before(grammarAccess.getKnowledgeAccess().getColonKeyword_9()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getKnowledgeAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__9__Impl"


    // $ANTLR start "rule__Knowledge__Group__10"
    // InternalLightweight.g:3201:1: rule__Knowledge__Group__10 : rule__Knowledge__Group__10__Impl rule__Knowledge__Group__11 ;
    public final void rule__Knowledge__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3205:1: ( rule__Knowledge__Group__10__Impl rule__Knowledge__Group__11 )
            // InternalLightweight.g:3206:2: rule__Knowledge__Group__10__Impl rule__Knowledge__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Knowledge__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__10"


    // $ANTLR start "rule__Knowledge__Group__10__Impl"
    // InternalLightweight.g:3213:1: rule__Knowledge__Group__10__Impl : ( ( rule__Knowledge__ValueAssignment_10 ) ) ;
    public final void rule__Knowledge__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3217:1: ( ( ( rule__Knowledge__ValueAssignment_10 ) ) )
            // InternalLightweight.g:3218:1: ( ( rule__Knowledge__ValueAssignment_10 ) )
            {
            // InternalLightweight.g:3218:1: ( ( rule__Knowledge__ValueAssignment_10 ) )
            // InternalLightweight.g:3219:2: ( rule__Knowledge__ValueAssignment_10 )
            {
             before(grammarAccess.getKnowledgeAccess().getValueAssignment_10()); 
            // InternalLightweight.g:3220:2: ( rule__Knowledge__ValueAssignment_10 )
            // InternalLightweight.g:3220:3: rule__Knowledge__ValueAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Knowledge__ValueAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeAccess().getValueAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__10__Impl"


    // $ANTLR start "rule__Knowledge__Group__11"
    // InternalLightweight.g:3228:1: rule__Knowledge__Group__11 : rule__Knowledge__Group__11__Impl rule__Knowledge__Group__12 ;
    public final void rule__Knowledge__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3232:1: ( rule__Knowledge__Group__11__Impl rule__Knowledge__Group__12 )
            // InternalLightweight.g:3233:2: rule__Knowledge__Group__11__Impl rule__Knowledge__Group__12
            {
            pushFollow(FOLLOW_31);
            rule__Knowledge__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__11"


    // $ANTLR start "rule__Knowledge__Group__11__Impl"
    // InternalLightweight.g:3240:1: rule__Knowledge__Group__11__Impl : ( ',' ) ;
    public final void rule__Knowledge__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3244:1: ( ( ',' ) )
            // InternalLightweight.g:3245:1: ( ',' )
            {
            // InternalLightweight.g:3245:1: ( ',' )
            // InternalLightweight.g:3246:2: ','
            {
             before(grammarAccess.getKnowledgeAccess().getCommaKeyword_11()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getKnowledgeAccess().getCommaKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__11__Impl"


    // $ANTLR start "rule__Knowledge__Group__12"
    // InternalLightweight.g:3255:1: rule__Knowledge__Group__12 : rule__Knowledge__Group__12__Impl rule__Knowledge__Group__13 ;
    public final void rule__Knowledge__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3259:1: ( rule__Knowledge__Group__12__Impl rule__Knowledge__Group__13 )
            // InternalLightweight.g:3260:2: rule__Knowledge__Group__12__Impl rule__Knowledge__Group__13
            {
            pushFollow(FOLLOW_3);
            rule__Knowledge__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__12"


    // $ANTLR start "rule__Knowledge__Group__12__Impl"
    // InternalLightweight.g:3267:1: rule__Knowledge__Group__12__Impl : ( 'limitedAttempts' ) ;
    public final void rule__Knowledge__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3271:1: ( ( 'limitedAttempts' ) )
            // InternalLightweight.g:3272:1: ( 'limitedAttempts' )
            {
            // InternalLightweight.g:3272:1: ( 'limitedAttempts' )
            // InternalLightweight.g:3273:2: 'limitedAttempts'
            {
             before(grammarAccess.getKnowledgeAccess().getLimitedAttemptsKeyword_12()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getKnowledgeAccess().getLimitedAttemptsKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__12__Impl"


    // $ANTLR start "rule__Knowledge__Group__13"
    // InternalLightweight.g:3282:1: rule__Knowledge__Group__13 : rule__Knowledge__Group__13__Impl rule__Knowledge__Group__14 ;
    public final void rule__Knowledge__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3286:1: ( rule__Knowledge__Group__13__Impl rule__Knowledge__Group__14 )
            // InternalLightweight.g:3287:2: rule__Knowledge__Group__13__Impl rule__Knowledge__Group__14
            {
            pushFollow(FOLLOW_23);
            rule__Knowledge__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__13"


    // $ANTLR start "rule__Knowledge__Group__13__Impl"
    // InternalLightweight.g:3294:1: rule__Knowledge__Group__13__Impl : ( ':' ) ;
    public final void rule__Knowledge__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3298:1: ( ( ':' ) )
            // InternalLightweight.g:3299:1: ( ':' )
            {
            // InternalLightweight.g:3299:1: ( ':' )
            // InternalLightweight.g:3300:2: ':'
            {
             before(grammarAccess.getKnowledgeAccess().getColonKeyword_13()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getKnowledgeAccess().getColonKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__13__Impl"


    // $ANTLR start "rule__Knowledge__Group__14"
    // InternalLightweight.g:3309:1: rule__Knowledge__Group__14 : rule__Knowledge__Group__14__Impl rule__Knowledge__Group__15 ;
    public final void rule__Knowledge__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3313:1: ( rule__Knowledge__Group__14__Impl rule__Knowledge__Group__15 )
            // InternalLightweight.g:3314:2: rule__Knowledge__Group__14__Impl rule__Knowledge__Group__15
            {
            pushFollow(FOLLOW_10);
            rule__Knowledge__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__14"


    // $ANTLR start "rule__Knowledge__Group__14__Impl"
    // InternalLightweight.g:3321:1: rule__Knowledge__Group__14__Impl : ( ( rule__Knowledge__LimitedAttemptsAssignment_14 ) ) ;
    public final void rule__Knowledge__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3325:1: ( ( ( rule__Knowledge__LimitedAttemptsAssignment_14 ) ) )
            // InternalLightweight.g:3326:1: ( ( rule__Knowledge__LimitedAttemptsAssignment_14 ) )
            {
            // InternalLightweight.g:3326:1: ( ( rule__Knowledge__LimitedAttemptsAssignment_14 ) )
            // InternalLightweight.g:3327:2: ( rule__Knowledge__LimitedAttemptsAssignment_14 )
            {
             before(grammarAccess.getKnowledgeAccess().getLimitedAttemptsAssignment_14()); 
            // InternalLightweight.g:3328:2: ( rule__Knowledge__LimitedAttemptsAssignment_14 )
            // InternalLightweight.g:3328:3: rule__Knowledge__LimitedAttemptsAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Knowledge__LimitedAttemptsAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeAccess().getLimitedAttemptsAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__14__Impl"


    // $ANTLR start "rule__Knowledge__Group__15"
    // InternalLightweight.g:3336:1: rule__Knowledge__Group__15 : rule__Knowledge__Group__15__Impl rule__Knowledge__Group__16 ;
    public final void rule__Knowledge__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3340:1: ( rule__Knowledge__Group__15__Impl rule__Knowledge__Group__16 )
            // InternalLightweight.g:3341:2: rule__Knowledge__Group__15__Impl rule__Knowledge__Group__16
            {
            pushFollow(FOLLOW_32);
            rule__Knowledge__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__15"


    // $ANTLR start "rule__Knowledge__Group__15__Impl"
    // InternalLightweight.g:3348:1: rule__Knowledge__Group__15__Impl : ( ',' ) ;
    public final void rule__Knowledge__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3352:1: ( ( ',' ) )
            // InternalLightweight.g:3353:1: ( ',' )
            {
            // InternalLightweight.g:3353:1: ( ',' )
            // InternalLightweight.g:3354:2: ','
            {
             before(grammarAccess.getKnowledgeAccess().getCommaKeyword_15()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getKnowledgeAccess().getCommaKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__15__Impl"


    // $ANTLR start "rule__Knowledge__Group__16"
    // InternalLightweight.g:3363:1: rule__Knowledge__Group__16 : rule__Knowledge__Group__16__Impl rule__Knowledge__Group__17 ;
    public final void rule__Knowledge__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3367:1: ( rule__Knowledge__Group__16__Impl rule__Knowledge__Group__17 )
            // InternalLightweight.g:3368:2: rule__Knowledge__Group__16__Impl rule__Knowledge__Group__17
            {
            pushFollow(FOLLOW_3);
            rule__Knowledge__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__16"


    // $ANTLR start "rule__Knowledge__Group__16__Impl"
    // InternalLightweight.g:3375:1: rule__Knowledge__Group__16__Impl : ( 'autofillable' ) ;
    public final void rule__Knowledge__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3379:1: ( ( 'autofillable' ) )
            // InternalLightweight.g:3380:1: ( 'autofillable' )
            {
            // InternalLightweight.g:3380:1: ( 'autofillable' )
            // InternalLightweight.g:3381:2: 'autofillable'
            {
             before(grammarAccess.getKnowledgeAccess().getAutofillableKeyword_16()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getKnowledgeAccess().getAutofillableKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__16__Impl"


    // $ANTLR start "rule__Knowledge__Group__17"
    // InternalLightweight.g:3390:1: rule__Knowledge__Group__17 : rule__Knowledge__Group__17__Impl rule__Knowledge__Group__18 ;
    public final void rule__Knowledge__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3394:1: ( rule__Knowledge__Group__17__Impl rule__Knowledge__Group__18 )
            // InternalLightweight.g:3395:2: rule__Knowledge__Group__17__Impl rule__Knowledge__Group__18
            {
            pushFollow(FOLLOW_23);
            rule__Knowledge__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__17"


    // $ANTLR start "rule__Knowledge__Group__17__Impl"
    // InternalLightweight.g:3402:1: rule__Knowledge__Group__17__Impl : ( ':' ) ;
    public final void rule__Knowledge__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3406:1: ( ( ':' ) )
            // InternalLightweight.g:3407:1: ( ':' )
            {
            // InternalLightweight.g:3407:1: ( ':' )
            // InternalLightweight.g:3408:2: ':'
            {
             before(grammarAccess.getKnowledgeAccess().getColonKeyword_17()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getKnowledgeAccess().getColonKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__17__Impl"


    // $ANTLR start "rule__Knowledge__Group__18"
    // InternalLightweight.g:3417:1: rule__Knowledge__Group__18 : rule__Knowledge__Group__18__Impl rule__Knowledge__Group__19 ;
    public final void rule__Knowledge__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3421:1: ( rule__Knowledge__Group__18__Impl rule__Knowledge__Group__19 )
            // InternalLightweight.g:3422:2: rule__Knowledge__Group__18__Impl rule__Knowledge__Group__19
            {
            pushFollow(FOLLOW_15);
            rule__Knowledge__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__18"


    // $ANTLR start "rule__Knowledge__Group__18__Impl"
    // InternalLightweight.g:3429:1: rule__Knowledge__Group__18__Impl : ( ( rule__Knowledge__AutofilledAssignment_18 ) ) ;
    public final void rule__Knowledge__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3433:1: ( ( ( rule__Knowledge__AutofilledAssignment_18 ) ) )
            // InternalLightweight.g:3434:1: ( ( rule__Knowledge__AutofilledAssignment_18 ) )
            {
            // InternalLightweight.g:3434:1: ( ( rule__Knowledge__AutofilledAssignment_18 ) )
            // InternalLightweight.g:3435:2: ( rule__Knowledge__AutofilledAssignment_18 )
            {
             before(grammarAccess.getKnowledgeAccess().getAutofilledAssignment_18()); 
            // InternalLightweight.g:3436:2: ( rule__Knowledge__AutofilledAssignment_18 )
            // InternalLightweight.g:3436:3: rule__Knowledge__AutofilledAssignment_18
            {
            pushFollow(FOLLOW_2);
            rule__Knowledge__AutofilledAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getKnowledgeAccess().getAutofilledAssignment_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__18__Impl"


    // $ANTLR start "rule__Knowledge__Group__19"
    // InternalLightweight.g:3444:1: rule__Knowledge__Group__19 : rule__Knowledge__Group__19__Impl ;
    public final void rule__Knowledge__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3448:1: ( rule__Knowledge__Group__19__Impl )
            // InternalLightweight.g:3449:2: rule__Knowledge__Group__19__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Knowledge__Group__19__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__19"


    // $ANTLR start "rule__Knowledge__Group__19__Impl"
    // InternalLightweight.g:3455:1: rule__Knowledge__Group__19__Impl : ( '}' ) ;
    public final void rule__Knowledge__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3459:1: ( ( '}' ) )
            // InternalLightweight.g:3460:1: ( '}' )
            {
            // InternalLightweight.g:3460:1: ( '}' )
            // InternalLightweight.g:3461:2: '}'
            {
             before(grammarAccess.getKnowledgeAccess().getRightCurlyBracketKeyword_19()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getKnowledgeAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__Group__19__Impl"


    // $ANTLR start "rule__Biometrics__Group__0"
    // InternalLightweight.g:3471:1: rule__Biometrics__Group__0 : rule__Biometrics__Group__0__Impl rule__Biometrics__Group__1 ;
    public final void rule__Biometrics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3475:1: ( rule__Biometrics__Group__0__Impl rule__Biometrics__Group__1 )
            // InternalLightweight.g:3476:2: rule__Biometrics__Group__0__Impl rule__Biometrics__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Biometrics__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Biometrics__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__0"


    // $ANTLR start "rule__Biometrics__Group__0__Impl"
    // InternalLightweight.g:3483:1: rule__Biometrics__Group__0__Impl : ( () ) ;
    public final void rule__Biometrics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3487:1: ( ( () ) )
            // InternalLightweight.g:3488:1: ( () )
            {
            // InternalLightweight.g:3488:1: ( () )
            // InternalLightweight.g:3489:2: ()
            {
             before(grammarAccess.getBiometricsAccess().getBiometricsAction_0()); 
            // InternalLightweight.g:3490:2: ()
            // InternalLightweight.g:3490:3: 
            {
            }

             after(grammarAccess.getBiometricsAccess().getBiometricsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__0__Impl"


    // $ANTLR start "rule__Biometrics__Group__1"
    // InternalLightweight.g:3498:1: rule__Biometrics__Group__1 : rule__Biometrics__Group__1__Impl rule__Biometrics__Group__2 ;
    public final void rule__Biometrics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3502:1: ( rule__Biometrics__Group__1__Impl rule__Biometrics__Group__2 )
            // InternalLightweight.g:3503:2: rule__Biometrics__Group__1__Impl rule__Biometrics__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Biometrics__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Biometrics__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__1"


    // $ANTLR start "rule__Biometrics__Group__1__Impl"
    // InternalLightweight.g:3510:1: rule__Biometrics__Group__1__Impl : ( ( rule__Biometrics__TypeAssignment_1 ) ) ;
    public final void rule__Biometrics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3514:1: ( ( ( rule__Biometrics__TypeAssignment_1 ) ) )
            // InternalLightweight.g:3515:1: ( ( rule__Biometrics__TypeAssignment_1 ) )
            {
            // InternalLightweight.g:3515:1: ( ( rule__Biometrics__TypeAssignment_1 ) )
            // InternalLightweight.g:3516:2: ( rule__Biometrics__TypeAssignment_1 )
            {
             before(grammarAccess.getBiometricsAccess().getTypeAssignment_1()); 
            // InternalLightweight.g:3517:2: ( rule__Biometrics__TypeAssignment_1 )
            // InternalLightweight.g:3517:3: rule__Biometrics__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Biometrics__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBiometricsAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__1__Impl"


    // $ANTLR start "rule__Biometrics__Group__2"
    // InternalLightweight.g:3525:1: rule__Biometrics__Group__2 : rule__Biometrics__Group__2__Impl rule__Biometrics__Group__3 ;
    public final void rule__Biometrics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3529:1: ( rule__Biometrics__Group__2__Impl rule__Biometrics__Group__3 )
            // InternalLightweight.g:3530:2: rule__Biometrics__Group__2__Impl rule__Biometrics__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Biometrics__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Biometrics__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__2"


    // $ANTLR start "rule__Biometrics__Group__2__Impl"
    // InternalLightweight.g:3537:1: rule__Biometrics__Group__2__Impl : ( ':' ) ;
    public final void rule__Biometrics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3541:1: ( ( ':' ) )
            // InternalLightweight.g:3542:1: ( ':' )
            {
            // InternalLightweight.g:3542:1: ( ':' )
            // InternalLightweight.g:3543:2: ':'
            {
             before(grammarAccess.getBiometricsAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBiometricsAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__2__Impl"


    // $ANTLR start "rule__Biometrics__Group__3"
    // InternalLightweight.g:3552:1: rule__Biometrics__Group__3 : rule__Biometrics__Group__3__Impl rule__Biometrics__Group__4 ;
    public final void rule__Biometrics__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3556:1: ( rule__Biometrics__Group__3__Impl rule__Biometrics__Group__4 )
            // InternalLightweight.g:3557:2: rule__Biometrics__Group__3__Impl rule__Biometrics__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Biometrics__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Biometrics__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__3"


    // $ANTLR start "rule__Biometrics__Group__3__Impl"
    // InternalLightweight.g:3564:1: rule__Biometrics__Group__3__Impl : ( '{' ) ;
    public final void rule__Biometrics__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3568:1: ( ( '{' ) )
            // InternalLightweight.g:3569:1: ( '{' )
            {
            // InternalLightweight.g:3569:1: ( '{' )
            // InternalLightweight.g:3570:2: '{'
            {
             before(grammarAccess.getBiometricsAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBiometricsAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__3__Impl"


    // $ANTLR start "rule__Biometrics__Group__4"
    // InternalLightweight.g:3579:1: rule__Biometrics__Group__4 : rule__Biometrics__Group__4__Impl rule__Biometrics__Group__5 ;
    public final void rule__Biometrics__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3583:1: ( rule__Biometrics__Group__4__Impl rule__Biometrics__Group__5 )
            // InternalLightweight.g:3584:2: rule__Biometrics__Group__4__Impl rule__Biometrics__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Biometrics__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Biometrics__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__4"


    // $ANTLR start "rule__Biometrics__Group__4__Impl"
    // InternalLightweight.g:3591:1: rule__Biometrics__Group__4__Impl : ( 'name' ) ;
    public final void rule__Biometrics__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3595:1: ( ( 'name' ) )
            // InternalLightweight.g:3596:1: ( 'name' )
            {
            // InternalLightweight.g:3596:1: ( 'name' )
            // InternalLightweight.g:3597:2: 'name'
            {
             before(grammarAccess.getBiometricsAccess().getNameKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getBiometricsAccess().getNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__4__Impl"


    // $ANTLR start "rule__Biometrics__Group__5"
    // InternalLightweight.g:3606:1: rule__Biometrics__Group__5 : rule__Biometrics__Group__5__Impl rule__Biometrics__Group__6 ;
    public final void rule__Biometrics__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3610:1: ( rule__Biometrics__Group__5__Impl rule__Biometrics__Group__6 )
            // InternalLightweight.g:3611:2: rule__Biometrics__Group__5__Impl rule__Biometrics__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Biometrics__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Biometrics__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__5"


    // $ANTLR start "rule__Biometrics__Group__5__Impl"
    // InternalLightweight.g:3618:1: rule__Biometrics__Group__5__Impl : ( ':' ) ;
    public final void rule__Biometrics__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3622:1: ( ( ':' ) )
            // InternalLightweight.g:3623:1: ( ':' )
            {
            // InternalLightweight.g:3623:1: ( ':' )
            // InternalLightweight.g:3624:2: ':'
            {
             before(grammarAccess.getBiometricsAccess().getColonKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBiometricsAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__5__Impl"


    // $ANTLR start "rule__Biometrics__Group__6"
    // InternalLightweight.g:3633:1: rule__Biometrics__Group__6 : rule__Biometrics__Group__6__Impl rule__Biometrics__Group__7 ;
    public final void rule__Biometrics__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3637:1: ( rule__Biometrics__Group__6__Impl rule__Biometrics__Group__7 )
            // InternalLightweight.g:3638:2: rule__Biometrics__Group__6__Impl rule__Biometrics__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Biometrics__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Biometrics__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__6"


    // $ANTLR start "rule__Biometrics__Group__6__Impl"
    // InternalLightweight.g:3645:1: rule__Biometrics__Group__6__Impl : ( ( rule__Biometrics__NameAssignment_6 ) ) ;
    public final void rule__Biometrics__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3649:1: ( ( ( rule__Biometrics__NameAssignment_6 ) ) )
            // InternalLightweight.g:3650:1: ( ( rule__Biometrics__NameAssignment_6 ) )
            {
            // InternalLightweight.g:3650:1: ( ( rule__Biometrics__NameAssignment_6 ) )
            // InternalLightweight.g:3651:2: ( rule__Biometrics__NameAssignment_6 )
            {
             before(grammarAccess.getBiometricsAccess().getNameAssignment_6()); 
            // InternalLightweight.g:3652:2: ( rule__Biometrics__NameAssignment_6 )
            // InternalLightweight.g:3652:3: rule__Biometrics__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Biometrics__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getBiometricsAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__6__Impl"


    // $ANTLR start "rule__Biometrics__Group__7"
    // InternalLightweight.g:3660:1: rule__Biometrics__Group__7 : rule__Biometrics__Group__7__Impl rule__Biometrics__Group__8 ;
    public final void rule__Biometrics__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3664:1: ( rule__Biometrics__Group__7__Impl rule__Biometrics__Group__8 )
            // InternalLightweight.g:3665:2: rule__Biometrics__Group__7__Impl rule__Biometrics__Group__8
            {
            pushFollow(FOLLOW_28);
            rule__Biometrics__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Biometrics__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__7"


    // $ANTLR start "rule__Biometrics__Group__7__Impl"
    // InternalLightweight.g:3672:1: rule__Biometrics__Group__7__Impl : ( ',' ) ;
    public final void rule__Biometrics__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3676:1: ( ( ',' ) )
            // InternalLightweight.g:3677:1: ( ',' )
            {
            // InternalLightweight.g:3677:1: ( ',' )
            // InternalLightweight.g:3678:2: ','
            {
             before(grammarAccess.getBiometricsAccess().getCommaKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getBiometricsAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__7__Impl"


    // $ANTLR start "rule__Biometrics__Group__8"
    // InternalLightweight.g:3687:1: rule__Biometrics__Group__8 : rule__Biometrics__Group__8__Impl rule__Biometrics__Group__9 ;
    public final void rule__Biometrics__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3691:1: ( rule__Biometrics__Group__8__Impl rule__Biometrics__Group__9 )
            // InternalLightweight.g:3692:2: rule__Biometrics__Group__8__Impl rule__Biometrics__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Biometrics__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Biometrics__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__8"


    // $ANTLR start "rule__Biometrics__Group__8__Impl"
    // InternalLightweight.g:3699:1: rule__Biometrics__Group__8__Impl : ( 'value' ) ;
    public final void rule__Biometrics__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3703:1: ( ( 'value' ) )
            // InternalLightweight.g:3704:1: ( 'value' )
            {
            // InternalLightweight.g:3704:1: ( 'value' )
            // InternalLightweight.g:3705:2: 'value'
            {
             before(grammarAccess.getBiometricsAccess().getValueKeyword_8()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getBiometricsAccess().getValueKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__8__Impl"


    // $ANTLR start "rule__Biometrics__Group__9"
    // InternalLightweight.g:3714:1: rule__Biometrics__Group__9 : rule__Biometrics__Group__9__Impl rule__Biometrics__Group__10 ;
    public final void rule__Biometrics__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3718:1: ( rule__Biometrics__Group__9__Impl rule__Biometrics__Group__10 )
            // InternalLightweight.g:3719:2: rule__Biometrics__Group__9__Impl rule__Biometrics__Group__10
            {
            pushFollow(FOLLOW_34);
            rule__Biometrics__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Biometrics__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__9"


    // $ANTLR start "rule__Biometrics__Group__9__Impl"
    // InternalLightweight.g:3726:1: rule__Biometrics__Group__9__Impl : ( ':' ) ;
    public final void rule__Biometrics__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3730:1: ( ( ':' ) )
            // InternalLightweight.g:3731:1: ( ':' )
            {
            // InternalLightweight.g:3731:1: ( ':' )
            // InternalLightweight.g:3732:2: ':'
            {
             before(grammarAccess.getBiometricsAccess().getColonKeyword_9()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBiometricsAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__9__Impl"


    // $ANTLR start "rule__Biometrics__Group__10"
    // InternalLightweight.g:3741:1: rule__Biometrics__Group__10 : rule__Biometrics__Group__10__Impl rule__Biometrics__Group__11 ;
    public final void rule__Biometrics__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3745:1: ( rule__Biometrics__Group__10__Impl rule__Biometrics__Group__11 )
            // InternalLightweight.g:3746:2: rule__Biometrics__Group__10__Impl rule__Biometrics__Group__11
            {
            pushFollow(FOLLOW_15);
            rule__Biometrics__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Biometrics__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__10"


    // $ANTLR start "rule__Biometrics__Group__10__Impl"
    // InternalLightweight.g:3753:1: rule__Biometrics__Group__10__Impl : ( ( rule__Biometrics__ValueAssignment_10 ) ) ;
    public final void rule__Biometrics__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3757:1: ( ( ( rule__Biometrics__ValueAssignment_10 ) ) )
            // InternalLightweight.g:3758:1: ( ( rule__Biometrics__ValueAssignment_10 ) )
            {
            // InternalLightweight.g:3758:1: ( ( rule__Biometrics__ValueAssignment_10 ) )
            // InternalLightweight.g:3759:2: ( rule__Biometrics__ValueAssignment_10 )
            {
             before(grammarAccess.getBiometricsAccess().getValueAssignment_10()); 
            // InternalLightweight.g:3760:2: ( rule__Biometrics__ValueAssignment_10 )
            // InternalLightweight.g:3760:3: rule__Biometrics__ValueAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Biometrics__ValueAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getBiometricsAccess().getValueAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__10__Impl"


    // $ANTLR start "rule__Biometrics__Group__11"
    // InternalLightweight.g:3768:1: rule__Biometrics__Group__11 : rule__Biometrics__Group__11__Impl ;
    public final void rule__Biometrics__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3772:1: ( rule__Biometrics__Group__11__Impl )
            // InternalLightweight.g:3773:2: rule__Biometrics__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Biometrics__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__11"


    // $ANTLR start "rule__Biometrics__Group__11__Impl"
    // InternalLightweight.g:3779:1: rule__Biometrics__Group__11__Impl : ( '}' ) ;
    public final void rule__Biometrics__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3783:1: ( ( '}' ) )
            // InternalLightweight.g:3784:1: ( '}' )
            {
            // InternalLightweight.g:3784:1: ( '}' )
            // InternalLightweight.g:3785:2: '}'
            {
             before(grammarAccess.getBiometricsAccess().getRightCurlyBracketKeyword_11()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getBiometricsAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__Group__11__Impl"


    // $ANTLR start "rule__Registration__Group__0"
    // InternalLightweight.g:3795:1: rule__Registration__Group__0 : rule__Registration__Group__0__Impl rule__Registration__Group__1 ;
    public final void rule__Registration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3799:1: ( rule__Registration__Group__0__Impl rule__Registration__Group__1 )
            // InternalLightweight.g:3800:2: rule__Registration__Group__0__Impl rule__Registration__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__Registration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__0"


    // $ANTLR start "rule__Registration__Group__0__Impl"
    // InternalLightweight.g:3807:1: rule__Registration__Group__0__Impl : ( () ) ;
    public final void rule__Registration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3811:1: ( ( () ) )
            // InternalLightweight.g:3812:1: ( () )
            {
            // InternalLightweight.g:3812:1: ( () )
            // InternalLightweight.g:3813:2: ()
            {
             before(grammarAccess.getRegistrationAccess().getRegistrationAction_0()); 
            // InternalLightweight.g:3814:2: ()
            // InternalLightweight.g:3814:3: 
            {
            }

             after(grammarAccess.getRegistrationAccess().getRegistrationAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__0__Impl"


    // $ANTLR start "rule__Registration__Group__1"
    // InternalLightweight.g:3822:1: rule__Registration__Group__1 : rule__Registration__Group__1__Impl rule__Registration__Group__2 ;
    public final void rule__Registration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3826:1: ( rule__Registration__Group__1__Impl rule__Registration__Group__2 )
            // InternalLightweight.g:3827:2: rule__Registration__Group__1__Impl rule__Registration__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Registration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__1"


    // $ANTLR start "rule__Registration__Group__1__Impl"
    // InternalLightweight.g:3834:1: rule__Registration__Group__1__Impl : ( ( rule__Registration__TypeAssignment_1 ) ) ;
    public final void rule__Registration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3838:1: ( ( ( rule__Registration__TypeAssignment_1 ) ) )
            // InternalLightweight.g:3839:1: ( ( rule__Registration__TypeAssignment_1 ) )
            {
            // InternalLightweight.g:3839:1: ( ( rule__Registration__TypeAssignment_1 ) )
            // InternalLightweight.g:3840:2: ( rule__Registration__TypeAssignment_1 )
            {
             before(grammarAccess.getRegistrationAccess().getTypeAssignment_1()); 
            // InternalLightweight.g:3841:2: ( rule__Registration__TypeAssignment_1 )
            // InternalLightweight.g:3841:3: rule__Registration__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Registration__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRegistrationAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__1__Impl"


    // $ANTLR start "rule__Registration__Group__2"
    // InternalLightweight.g:3849:1: rule__Registration__Group__2 : rule__Registration__Group__2__Impl rule__Registration__Group__3 ;
    public final void rule__Registration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3853:1: ( rule__Registration__Group__2__Impl rule__Registration__Group__3 )
            // InternalLightweight.g:3854:2: rule__Registration__Group__2__Impl rule__Registration__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Registration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__2"


    // $ANTLR start "rule__Registration__Group__2__Impl"
    // InternalLightweight.g:3861:1: rule__Registration__Group__2__Impl : ( ':' ) ;
    public final void rule__Registration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3865:1: ( ( ':' ) )
            // InternalLightweight.g:3866:1: ( ':' )
            {
            // InternalLightweight.g:3866:1: ( ':' )
            // InternalLightweight.g:3867:2: ':'
            {
             before(grammarAccess.getRegistrationAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRegistrationAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__2__Impl"


    // $ANTLR start "rule__Registration__Group__3"
    // InternalLightweight.g:3876:1: rule__Registration__Group__3 : rule__Registration__Group__3__Impl rule__Registration__Group__4 ;
    public final void rule__Registration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3880:1: ( rule__Registration__Group__3__Impl rule__Registration__Group__4 )
            // InternalLightweight.g:3881:2: rule__Registration__Group__3__Impl rule__Registration__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Registration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__3"


    // $ANTLR start "rule__Registration__Group__3__Impl"
    // InternalLightweight.g:3888:1: rule__Registration__Group__3__Impl : ( '{' ) ;
    public final void rule__Registration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3892:1: ( ( '{' ) )
            // InternalLightweight.g:3893:1: ( '{' )
            {
            // InternalLightweight.g:3893:1: ( '{' )
            // InternalLightweight.g:3894:2: '{'
            {
             before(grammarAccess.getRegistrationAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRegistrationAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__3__Impl"


    // $ANTLR start "rule__Registration__Group__4"
    // InternalLightweight.g:3903:1: rule__Registration__Group__4 : rule__Registration__Group__4__Impl rule__Registration__Group__5 ;
    public final void rule__Registration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3907:1: ( rule__Registration__Group__4__Impl rule__Registration__Group__5 )
            // InternalLightweight.g:3908:2: rule__Registration__Group__4__Impl rule__Registration__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Registration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__4"


    // $ANTLR start "rule__Registration__Group__4__Impl"
    // InternalLightweight.g:3915:1: rule__Registration__Group__4__Impl : ( 'name' ) ;
    public final void rule__Registration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3919:1: ( ( 'name' ) )
            // InternalLightweight.g:3920:1: ( 'name' )
            {
            // InternalLightweight.g:3920:1: ( 'name' )
            // InternalLightweight.g:3921:2: 'name'
            {
             before(grammarAccess.getRegistrationAccess().getNameKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRegistrationAccess().getNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__4__Impl"


    // $ANTLR start "rule__Registration__Group__5"
    // InternalLightweight.g:3930:1: rule__Registration__Group__5 : rule__Registration__Group__5__Impl rule__Registration__Group__6 ;
    public final void rule__Registration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3934:1: ( rule__Registration__Group__5__Impl rule__Registration__Group__6 )
            // InternalLightweight.g:3935:2: rule__Registration__Group__5__Impl rule__Registration__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Registration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__5"


    // $ANTLR start "rule__Registration__Group__5__Impl"
    // InternalLightweight.g:3942:1: rule__Registration__Group__5__Impl : ( ':' ) ;
    public final void rule__Registration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3946:1: ( ( ':' ) )
            // InternalLightweight.g:3947:1: ( ':' )
            {
            // InternalLightweight.g:3947:1: ( ':' )
            // InternalLightweight.g:3948:2: ':'
            {
             before(grammarAccess.getRegistrationAccess().getColonKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRegistrationAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__5__Impl"


    // $ANTLR start "rule__Registration__Group__6"
    // InternalLightweight.g:3957:1: rule__Registration__Group__6 : rule__Registration__Group__6__Impl rule__Registration__Group__7 ;
    public final void rule__Registration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3961:1: ( rule__Registration__Group__6__Impl rule__Registration__Group__7 )
            // InternalLightweight.g:3962:2: rule__Registration__Group__6__Impl rule__Registration__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Registration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__6"


    // $ANTLR start "rule__Registration__Group__6__Impl"
    // InternalLightweight.g:3969:1: rule__Registration__Group__6__Impl : ( ( rule__Registration__NameAssignment_6 ) ) ;
    public final void rule__Registration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3973:1: ( ( ( rule__Registration__NameAssignment_6 ) ) )
            // InternalLightweight.g:3974:1: ( ( rule__Registration__NameAssignment_6 ) )
            {
            // InternalLightweight.g:3974:1: ( ( rule__Registration__NameAssignment_6 ) )
            // InternalLightweight.g:3975:2: ( rule__Registration__NameAssignment_6 )
            {
             before(grammarAccess.getRegistrationAccess().getNameAssignment_6()); 
            // InternalLightweight.g:3976:2: ( rule__Registration__NameAssignment_6 )
            // InternalLightweight.g:3976:3: rule__Registration__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Registration__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRegistrationAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__6__Impl"


    // $ANTLR start "rule__Registration__Group__7"
    // InternalLightweight.g:3984:1: rule__Registration__Group__7 : rule__Registration__Group__7__Impl rule__Registration__Group__8 ;
    public final void rule__Registration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3988:1: ( rule__Registration__Group__7__Impl rule__Registration__Group__8 )
            // InternalLightweight.g:3989:2: rule__Registration__Group__7__Impl rule__Registration__Group__8
            {
            pushFollow(FOLLOW_36);
            rule__Registration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registration__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__7"


    // $ANTLR start "rule__Registration__Group__7__Impl"
    // InternalLightweight.g:3996:1: rule__Registration__Group__7__Impl : ( ',' ) ;
    public final void rule__Registration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4000:1: ( ( ',' ) )
            // InternalLightweight.g:4001:1: ( ',' )
            {
            // InternalLightweight.g:4001:1: ( ',' )
            // InternalLightweight.g:4002:2: ','
            {
             before(grammarAccess.getRegistrationAccess().getCommaKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRegistrationAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__7__Impl"


    // $ANTLR start "rule__Registration__Group__8"
    // InternalLightweight.g:4011:1: rule__Registration__Group__8 : rule__Registration__Group__8__Impl rule__Registration__Group__9 ;
    public final void rule__Registration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4015:1: ( rule__Registration__Group__8__Impl rule__Registration__Group__9 )
            // InternalLightweight.g:4016:2: rule__Registration__Group__8__Impl rule__Registration__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Registration__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registration__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__8"


    // $ANTLR start "rule__Registration__Group__8__Impl"
    // InternalLightweight.g:4023:1: rule__Registration__Group__8__Impl : ( 'attributes' ) ;
    public final void rule__Registration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4027:1: ( ( 'attributes' ) )
            // InternalLightweight.g:4028:1: ( 'attributes' )
            {
            // InternalLightweight.g:4028:1: ( 'attributes' )
            // InternalLightweight.g:4029:2: 'attributes'
            {
             before(grammarAccess.getRegistrationAccess().getAttributesKeyword_8()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getRegistrationAccess().getAttributesKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__8__Impl"


    // $ANTLR start "rule__Registration__Group__9"
    // InternalLightweight.g:4038:1: rule__Registration__Group__9 : rule__Registration__Group__9__Impl rule__Registration__Group__10 ;
    public final void rule__Registration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4042:1: ( rule__Registration__Group__9__Impl rule__Registration__Group__10 )
            // InternalLightweight.g:4043:2: rule__Registration__Group__9__Impl rule__Registration__Group__10
            {
            pushFollow(FOLLOW_6);
            rule__Registration__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registration__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__9"


    // $ANTLR start "rule__Registration__Group__9__Impl"
    // InternalLightweight.g:4050:1: rule__Registration__Group__9__Impl : ( ':' ) ;
    public final void rule__Registration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4054:1: ( ( ':' ) )
            // InternalLightweight.g:4055:1: ( ':' )
            {
            // InternalLightweight.g:4055:1: ( ':' )
            // InternalLightweight.g:4056:2: ':'
            {
             before(grammarAccess.getRegistrationAccess().getColonKeyword_9()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRegistrationAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__9__Impl"


    // $ANTLR start "rule__Registration__Group__10"
    // InternalLightweight.g:4065:1: rule__Registration__Group__10 : rule__Registration__Group__10__Impl rule__Registration__Group__11 ;
    public final void rule__Registration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4069:1: ( rule__Registration__Group__10__Impl rule__Registration__Group__11 )
            // InternalLightweight.g:4070:2: rule__Registration__Group__10__Impl rule__Registration__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__Registration__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registration__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__10"


    // $ANTLR start "rule__Registration__Group__10__Impl"
    // InternalLightweight.g:4077:1: rule__Registration__Group__10__Impl : ( '[' ) ;
    public final void rule__Registration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4081:1: ( ( '[' ) )
            // InternalLightweight.g:4082:1: ( '[' )
            {
            // InternalLightweight.g:4082:1: ( '[' )
            // InternalLightweight.g:4083:2: '['
            {
             before(grammarAccess.getRegistrationAccess().getLeftSquareBracketKeyword_10()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getRegistrationAccess().getLeftSquareBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__10__Impl"


    // $ANTLR start "rule__Registration__Group__11"
    // InternalLightweight.g:4092:1: rule__Registration__Group__11 : rule__Registration__Group__11__Impl rule__Registration__Group__12 ;
    public final void rule__Registration__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4096:1: ( rule__Registration__Group__11__Impl rule__Registration__Group__12 )
            // InternalLightweight.g:4097:2: rule__Registration__Group__11__Impl rule__Registration__Group__12
            {
            pushFollow(FOLLOW_8);
            rule__Registration__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registration__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__11"


    // $ANTLR start "rule__Registration__Group__11__Impl"
    // InternalLightweight.g:4104:1: rule__Registration__Group__11__Impl : ( ( rule__Registration__AttributesAssignment_11 ) ) ;
    public final void rule__Registration__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4108:1: ( ( ( rule__Registration__AttributesAssignment_11 ) ) )
            // InternalLightweight.g:4109:1: ( ( rule__Registration__AttributesAssignment_11 ) )
            {
            // InternalLightweight.g:4109:1: ( ( rule__Registration__AttributesAssignment_11 ) )
            // InternalLightweight.g:4110:2: ( rule__Registration__AttributesAssignment_11 )
            {
             before(grammarAccess.getRegistrationAccess().getAttributesAssignment_11()); 
            // InternalLightweight.g:4111:2: ( rule__Registration__AttributesAssignment_11 )
            // InternalLightweight.g:4111:3: rule__Registration__AttributesAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Registration__AttributesAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getRegistrationAccess().getAttributesAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__11__Impl"


    // $ANTLR start "rule__Registration__Group__12"
    // InternalLightweight.g:4119:1: rule__Registration__Group__12 : rule__Registration__Group__12__Impl rule__Registration__Group__13 ;
    public final void rule__Registration__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4123:1: ( rule__Registration__Group__12__Impl rule__Registration__Group__13 )
            // InternalLightweight.g:4124:2: rule__Registration__Group__12__Impl rule__Registration__Group__13
            {
            pushFollow(FOLLOW_8);
            rule__Registration__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registration__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__12"


    // $ANTLR start "rule__Registration__Group__12__Impl"
    // InternalLightweight.g:4131:1: rule__Registration__Group__12__Impl : ( ( rule__Registration__Group_12__0 )* ) ;
    public final void rule__Registration__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4135:1: ( ( ( rule__Registration__Group_12__0 )* ) )
            // InternalLightweight.g:4136:1: ( ( rule__Registration__Group_12__0 )* )
            {
            // InternalLightweight.g:4136:1: ( ( rule__Registration__Group_12__0 )* )
            // InternalLightweight.g:4137:2: ( rule__Registration__Group_12__0 )*
            {
             before(grammarAccess.getRegistrationAccess().getGroup_12()); 
            // InternalLightweight.g:4138:2: ( rule__Registration__Group_12__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==38) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalLightweight.g:4138:3: rule__Registration__Group_12__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Registration__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getRegistrationAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__12__Impl"


    // $ANTLR start "rule__Registration__Group__13"
    // InternalLightweight.g:4146:1: rule__Registration__Group__13 : rule__Registration__Group__13__Impl rule__Registration__Group__14 ;
    public final void rule__Registration__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4150:1: ( rule__Registration__Group__13__Impl rule__Registration__Group__14 )
            // InternalLightweight.g:4151:2: rule__Registration__Group__13__Impl rule__Registration__Group__14
            {
            pushFollow(FOLLOW_15);
            rule__Registration__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registration__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__13"


    // $ANTLR start "rule__Registration__Group__13__Impl"
    // InternalLightweight.g:4158:1: rule__Registration__Group__13__Impl : ( ']' ) ;
    public final void rule__Registration__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4162:1: ( ( ']' ) )
            // InternalLightweight.g:4163:1: ( ']' )
            {
            // InternalLightweight.g:4163:1: ( ']' )
            // InternalLightweight.g:4164:2: ']'
            {
             before(grammarAccess.getRegistrationAccess().getRightSquareBracketKeyword_13()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getRegistrationAccess().getRightSquareBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__13__Impl"


    // $ANTLR start "rule__Registration__Group__14"
    // InternalLightweight.g:4173:1: rule__Registration__Group__14 : rule__Registration__Group__14__Impl ;
    public final void rule__Registration__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4177:1: ( rule__Registration__Group__14__Impl )
            // InternalLightweight.g:4178:2: rule__Registration__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Registration__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__14"


    // $ANTLR start "rule__Registration__Group__14__Impl"
    // InternalLightweight.g:4184:1: rule__Registration__Group__14__Impl : ( '}' ) ;
    public final void rule__Registration__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4188:1: ( ( '}' ) )
            // InternalLightweight.g:4189:1: ( '}' )
            {
            // InternalLightweight.g:4189:1: ( '}' )
            // InternalLightweight.g:4190:2: '}'
            {
             before(grammarAccess.getRegistrationAccess().getRightCurlyBracketKeyword_14()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getRegistrationAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group__14__Impl"


    // $ANTLR start "rule__Registration__Group_12__0"
    // InternalLightweight.g:4200:1: rule__Registration__Group_12__0 : rule__Registration__Group_12__0__Impl rule__Registration__Group_12__1 ;
    public final void rule__Registration__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4204:1: ( rule__Registration__Group_12__0__Impl rule__Registration__Group_12__1 )
            // InternalLightweight.g:4205:2: rule__Registration__Group_12__0__Impl rule__Registration__Group_12__1
            {
            pushFollow(FOLLOW_4);
            rule__Registration__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Registration__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group_12__0"


    // $ANTLR start "rule__Registration__Group_12__0__Impl"
    // InternalLightweight.g:4212:1: rule__Registration__Group_12__0__Impl : ( ',' ) ;
    public final void rule__Registration__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4216:1: ( ( ',' ) )
            // InternalLightweight.g:4217:1: ( ',' )
            {
            // InternalLightweight.g:4217:1: ( ',' )
            // InternalLightweight.g:4218:2: ','
            {
             before(grammarAccess.getRegistrationAccess().getCommaKeyword_12_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRegistrationAccess().getCommaKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group_12__0__Impl"


    // $ANTLR start "rule__Registration__Group_12__1"
    // InternalLightweight.g:4227:1: rule__Registration__Group_12__1 : rule__Registration__Group_12__1__Impl ;
    public final void rule__Registration__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4231:1: ( rule__Registration__Group_12__1__Impl )
            // InternalLightweight.g:4232:2: rule__Registration__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Registration__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group_12__1"


    // $ANTLR start "rule__Registration__Group_12__1__Impl"
    // InternalLightweight.g:4238:1: rule__Registration__Group_12__1__Impl : ( ( rule__Registration__AttributesAssignment_12_1 ) ) ;
    public final void rule__Registration__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4242:1: ( ( ( rule__Registration__AttributesAssignment_12_1 ) ) )
            // InternalLightweight.g:4243:1: ( ( rule__Registration__AttributesAssignment_12_1 ) )
            {
            // InternalLightweight.g:4243:1: ( ( rule__Registration__AttributesAssignment_12_1 ) )
            // InternalLightweight.g:4244:2: ( rule__Registration__AttributesAssignment_12_1 )
            {
             before(grammarAccess.getRegistrationAccess().getAttributesAssignment_12_1()); 
            // InternalLightweight.g:4245:2: ( rule__Registration__AttributesAssignment_12_1 )
            // InternalLightweight.g:4245:3: rule__Registration__AttributesAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Registration__AttributesAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getRegistrationAccess().getAttributesAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__Group_12__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // InternalLightweight.g:4254:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4258:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalLightweight.g:4259:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // InternalLightweight.g:4266:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4270:1: ( ( () ) )
            // InternalLightweight.g:4271:1: ( () )
            {
            // InternalLightweight.g:4271:1: ( () )
            // InternalLightweight.g:4272:2: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // InternalLightweight.g:4273:2: ()
            // InternalLightweight.g:4273:3: 
            {
            }

             after(grammarAccess.getAttributeAccess().getAttributeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // InternalLightweight.g:4281:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4285:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalLightweight.g:4286:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // InternalLightweight.g:4293:1: rule__Attribute__Group__1__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4297:1: ( ( '{' ) )
            // InternalLightweight.g:4298:1: ( '{' )
            {
            // InternalLightweight.g:4298:1: ( '{' )
            // InternalLightweight.g:4299:2: '{'
            {
             before(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // InternalLightweight.g:4308:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4312:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalLightweight.g:4313:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // InternalLightweight.g:4320:1: rule__Attribute__Group__2__Impl : ( 'name' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4324:1: ( ( 'name' ) )
            // InternalLightweight.g:4325:1: ( 'name' )
            {
            // InternalLightweight.g:4325:1: ( 'name' )
            // InternalLightweight.g:4326:2: 'name'
            {
             before(grammarAccess.getAttributeAccess().getNameKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getNameKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // InternalLightweight.g:4335:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4339:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalLightweight.g:4340:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Attribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // InternalLightweight.g:4347:1: rule__Attribute__Group__3__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4351:1: ( ( ':' ) )
            // InternalLightweight.g:4352:1: ( ':' )
            {
            // InternalLightweight.g:4352:1: ( ':' )
            // InternalLightweight.g:4353:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // InternalLightweight.g:4362:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4366:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalLightweight.g:4367:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // InternalLightweight.g:4374:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__NameAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4378:1: ( ( ( rule__Attribute__NameAssignment_4 ) ) )
            // InternalLightweight.g:4379:1: ( ( rule__Attribute__NameAssignment_4 ) )
            {
            // InternalLightweight.g:4379:1: ( ( rule__Attribute__NameAssignment_4 ) )
            // InternalLightweight.g:4380:2: ( rule__Attribute__NameAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_4()); 
            // InternalLightweight.g:4381:2: ( rule__Attribute__NameAssignment_4 )
            // InternalLightweight.g:4381:3: rule__Attribute__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // InternalLightweight.g:4389:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4393:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalLightweight.g:4394:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
            {
            pushFollow(FOLLOW_37);
            rule__Attribute__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // InternalLightweight.g:4401:1: rule__Attribute__Group__5__Impl : ( ',' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4405:1: ( ( ',' ) )
            // InternalLightweight.g:4406:1: ( ',' )
            {
            // InternalLightweight.g:4406:1: ( ',' )
            // InternalLightweight.g:4407:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group__6"
    // InternalLightweight.g:4416:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4420:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalLightweight.g:4421:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6"


    // $ANTLR start "rule__Attribute__Group__6__Impl"
    // InternalLightweight.g:4428:1: rule__Attribute__Group__6__Impl : ( 'provider' ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4432:1: ( ( 'provider' ) )
            // InternalLightweight.g:4433:1: ( 'provider' )
            {
            // InternalLightweight.g:4433:1: ( 'provider' )
            // InternalLightweight.g:4434:2: 'provider'
            {
             before(grammarAccess.getAttributeAccess().getProviderKeyword_6()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getProviderKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__6__Impl"


    // $ANTLR start "rule__Attribute__Group__7"
    // InternalLightweight.g:4443:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl rule__Attribute__Group__8 ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4447:1: ( rule__Attribute__Group__7__Impl rule__Attribute__Group__8 )
            // InternalLightweight.g:4448:2: rule__Attribute__Group__7__Impl rule__Attribute__Group__8
            {
            pushFollow(FOLLOW_38);
            rule__Attribute__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__7"


    // $ANTLR start "rule__Attribute__Group__7__Impl"
    // InternalLightweight.g:4455:1: rule__Attribute__Group__7__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4459:1: ( ( ':' ) )
            // InternalLightweight.g:4460:1: ( ':' )
            {
            // InternalLightweight.g:4460:1: ( ':' )
            // InternalLightweight.g:4461:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__7__Impl"


    // $ANTLR start "rule__Attribute__Group__8"
    // InternalLightweight.g:4470:1: rule__Attribute__Group__8 : rule__Attribute__Group__8__Impl rule__Attribute__Group__9 ;
    public final void rule__Attribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4474:1: ( rule__Attribute__Group__8__Impl rule__Attribute__Group__9 )
            // InternalLightweight.g:4475:2: rule__Attribute__Group__8__Impl rule__Attribute__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__8"


    // $ANTLR start "rule__Attribute__Group__8__Impl"
    // InternalLightweight.g:4482:1: rule__Attribute__Group__8__Impl : ( ( rule__Attribute__ProviderAssignment_8 ) ) ;
    public final void rule__Attribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4486:1: ( ( ( rule__Attribute__ProviderAssignment_8 ) ) )
            // InternalLightweight.g:4487:1: ( ( rule__Attribute__ProviderAssignment_8 ) )
            {
            // InternalLightweight.g:4487:1: ( ( rule__Attribute__ProviderAssignment_8 ) )
            // InternalLightweight.g:4488:2: ( rule__Attribute__ProviderAssignment_8 )
            {
             before(grammarAccess.getAttributeAccess().getProviderAssignment_8()); 
            // InternalLightweight.g:4489:2: ( rule__Attribute__ProviderAssignment_8 )
            // InternalLightweight.g:4489:3: rule__Attribute__ProviderAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__ProviderAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getProviderAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__8__Impl"


    // $ANTLR start "rule__Attribute__Group__9"
    // InternalLightweight.g:4497:1: rule__Attribute__Group__9 : rule__Attribute__Group__9__Impl rule__Attribute__Group__10 ;
    public final void rule__Attribute__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4501:1: ( rule__Attribute__Group__9__Impl rule__Attribute__Group__10 )
            // InternalLightweight.g:4502:2: rule__Attribute__Group__9__Impl rule__Attribute__Group__10
            {
            pushFollow(FOLLOW_39);
            rule__Attribute__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__9"


    // $ANTLR start "rule__Attribute__Group__9__Impl"
    // InternalLightweight.g:4509:1: rule__Attribute__Group__9__Impl : ( ',' ) ;
    public final void rule__Attribute__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4513:1: ( ( ',' ) )
            // InternalLightweight.g:4514:1: ( ',' )
            {
            // InternalLightweight.g:4514:1: ( ',' )
            // InternalLightweight.g:4515:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_9()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCommaKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__9__Impl"


    // $ANTLR start "rule__Attribute__Group__10"
    // InternalLightweight.g:4524:1: rule__Attribute__Group__10 : rule__Attribute__Group__10__Impl rule__Attribute__Group__11 ;
    public final void rule__Attribute__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4528:1: ( rule__Attribute__Group__10__Impl rule__Attribute__Group__11 )
            // InternalLightweight.g:4529:2: rule__Attribute__Group__10__Impl rule__Attribute__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__10"


    // $ANTLR start "rule__Attribute__Group__10__Impl"
    // InternalLightweight.g:4536:1: rule__Attribute__Group__10__Impl : ( 'type' ) ;
    public final void rule__Attribute__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4540:1: ( ( 'type' ) )
            // InternalLightweight.g:4541:1: ( 'type' )
            {
            // InternalLightweight.g:4541:1: ( 'type' )
            // InternalLightweight.g:4542:2: 'type'
            {
             before(grammarAccess.getAttributeAccess().getTypeKeyword_10()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getTypeKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__10__Impl"


    // $ANTLR start "rule__Attribute__Group__11"
    // InternalLightweight.g:4551:1: rule__Attribute__Group__11 : rule__Attribute__Group__11__Impl rule__Attribute__Group__12 ;
    public final void rule__Attribute__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4555:1: ( rule__Attribute__Group__11__Impl rule__Attribute__Group__12 )
            // InternalLightweight.g:4556:2: rule__Attribute__Group__11__Impl rule__Attribute__Group__12
            {
            pushFollow(FOLLOW_40);
            rule__Attribute__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__11"


    // $ANTLR start "rule__Attribute__Group__11__Impl"
    // InternalLightweight.g:4563:1: rule__Attribute__Group__11__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4567:1: ( ( ':' ) )
            // InternalLightweight.g:4568:1: ( ':' )
            {
            // InternalLightweight.g:4568:1: ( ':' )
            // InternalLightweight.g:4569:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_11()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__11__Impl"


    // $ANTLR start "rule__Attribute__Group__12"
    // InternalLightweight.g:4578:1: rule__Attribute__Group__12 : rule__Attribute__Group__12__Impl rule__Attribute__Group__13 ;
    public final void rule__Attribute__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4582:1: ( rule__Attribute__Group__12__Impl rule__Attribute__Group__13 )
            // InternalLightweight.g:4583:2: rule__Attribute__Group__12__Impl rule__Attribute__Group__13
            {
            pushFollow(FOLLOW_10);
            rule__Attribute__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__12"


    // $ANTLR start "rule__Attribute__Group__12__Impl"
    // InternalLightweight.g:4590:1: rule__Attribute__Group__12__Impl : ( ( rule__Attribute__TypeAssignment_12 ) ) ;
    public final void rule__Attribute__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4594:1: ( ( ( rule__Attribute__TypeAssignment_12 ) ) )
            // InternalLightweight.g:4595:1: ( ( rule__Attribute__TypeAssignment_12 ) )
            {
            // InternalLightweight.g:4595:1: ( ( rule__Attribute__TypeAssignment_12 ) )
            // InternalLightweight.g:4596:2: ( rule__Attribute__TypeAssignment_12 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_12()); 
            // InternalLightweight.g:4597:2: ( rule__Attribute__TypeAssignment_12 )
            // InternalLightweight.g:4597:3: rule__Attribute__TypeAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__TypeAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getTypeAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__12__Impl"


    // $ANTLR start "rule__Attribute__Group__13"
    // InternalLightweight.g:4605:1: rule__Attribute__Group__13 : rule__Attribute__Group__13__Impl rule__Attribute__Group__14 ;
    public final void rule__Attribute__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4609:1: ( rule__Attribute__Group__13__Impl rule__Attribute__Group__14 )
            // InternalLightweight.g:4610:2: rule__Attribute__Group__13__Impl rule__Attribute__Group__14
            {
            pushFollow(FOLLOW_41);
            rule__Attribute__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__13"


    // $ANTLR start "rule__Attribute__Group__13__Impl"
    // InternalLightweight.g:4617:1: rule__Attribute__Group__13__Impl : ( ',' ) ;
    public final void rule__Attribute__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4621:1: ( ( ',' ) )
            // InternalLightweight.g:4622:1: ( ',' )
            {
            // InternalLightweight.g:4622:1: ( ',' )
            // InternalLightweight.g:4623:2: ','
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_13()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getCommaKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__13__Impl"


    // $ANTLR start "rule__Attribute__Group__14"
    // InternalLightweight.g:4632:1: rule__Attribute__Group__14 : rule__Attribute__Group__14__Impl rule__Attribute__Group__15 ;
    public final void rule__Attribute__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4636:1: ( rule__Attribute__Group__14__Impl rule__Attribute__Group__15 )
            // InternalLightweight.g:4637:2: rule__Attribute__Group__14__Impl rule__Attribute__Group__15
            {
            pushFollow(FOLLOW_41);
            rule__Attribute__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__14"


    // $ANTLR start "rule__Attribute__Group__14__Impl"
    // InternalLightweight.g:4644:1: rule__Attribute__Group__14__Impl : ( ( rule__Attribute__Group_14__0 )? ) ;
    public final void rule__Attribute__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4648:1: ( ( ( rule__Attribute__Group_14__0 )? ) )
            // InternalLightweight.g:4649:1: ( ( rule__Attribute__Group_14__0 )? )
            {
            // InternalLightweight.g:4649:1: ( ( rule__Attribute__Group_14__0 )? )
            // InternalLightweight.g:4650:2: ( rule__Attribute__Group_14__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_14()); 
            // InternalLightweight.g:4651:2: ( rule__Attribute__Group_14__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==54) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLightweight.g:4651:3: rule__Attribute__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Attribute__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__14__Impl"


    // $ANTLR start "rule__Attribute__Group__15"
    // InternalLightweight.g:4659:1: rule__Attribute__Group__15 : rule__Attribute__Group__15__Impl ;
    public final void rule__Attribute__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4663:1: ( rule__Attribute__Group__15__Impl )
            // InternalLightweight.g:4664:2: rule__Attribute__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__15"


    // $ANTLR start "rule__Attribute__Group__15__Impl"
    // InternalLightweight.g:4670:1: rule__Attribute__Group__15__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4674:1: ( ( '}' ) )
            // InternalLightweight.g:4675:1: ( '}' )
            {
            // InternalLightweight.g:4675:1: ( '}' )
            // InternalLightweight.g:4676:2: '}'
            {
             before(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_15()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__15__Impl"


    // $ANTLR start "rule__Attribute__Group_14__0"
    // InternalLightweight.g:4686:1: rule__Attribute__Group_14__0 : rule__Attribute__Group_14__0__Impl rule__Attribute__Group_14__1 ;
    public final void rule__Attribute__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4690:1: ( rule__Attribute__Group_14__0__Impl rule__Attribute__Group_14__1 )
            // InternalLightweight.g:4691:2: rule__Attribute__Group_14__0__Impl rule__Attribute__Group_14__1
            {
            pushFollow(FOLLOW_3);
            rule__Attribute__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_14__0"


    // $ANTLR start "rule__Attribute__Group_14__0__Impl"
    // InternalLightweight.g:4698:1: rule__Attribute__Group_14__0__Impl : ( 'verification' ) ;
    public final void rule__Attribute__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4702:1: ( ( 'verification' ) )
            // InternalLightweight.g:4703:1: ( 'verification' )
            {
            // InternalLightweight.g:4703:1: ( 'verification' )
            // InternalLightweight.g:4704:2: 'verification'
            {
             before(grammarAccess.getAttributeAccess().getVerificationKeyword_14_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getVerificationKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_14__0__Impl"


    // $ANTLR start "rule__Attribute__Group_14__1"
    // InternalLightweight.g:4713:1: rule__Attribute__Group_14__1 : rule__Attribute__Group_14__1__Impl rule__Attribute__Group_14__2 ;
    public final void rule__Attribute__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4717:1: ( rule__Attribute__Group_14__1__Impl rule__Attribute__Group_14__2 )
            // InternalLightweight.g:4718:2: rule__Attribute__Group_14__1__Impl rule__Attribute__Group_14__2
            {
            pushFollow(FOLLOW_4);
            rule__Attribute__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Attribute__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_14__1"


    // $ANTLR start "rule__Attribute__Group_14__1__Impl"
    // InternalLightweight.g:4725:1: rule__Attribute__Group_14__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4729:1: ( ( ':' ) )
            // InternalLightweight.g:4730:1: ( ':' )
            {
            // InternalLightweight.g:4730:1: ( ':' )
            // InternalLightweight.g:4731:2: ':'
            {
             before(grammarAccess.getAttributeAccess().getColonKeyword_14_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getAttributeAccess().getColonKeyword_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_14__1__Impl"


    // $ANTLR start "rule__Attribute__Group_14__2"
    // InternalLightweight.g:4740:1: rule__Attribute__Group_14__2 : rule__Attribute__Group_14__2__Impl ;
    public final void rule__Attribute__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4744:1: ( rule__Attribute__Group_14__2__Impl )
            // InternalLightweight.g:4745:2: rule__Attribute__Group_14__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__Group_14__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_14__2"


    // $ANTLR start "rule__Attribute__Group_14__2__Impl"
    // InternalLightweight.g:4751:1: rule__Attribute__Group_14__2__Impl : ( ( rule__Attribute__VerifmethodAssignment_14_2 ) ) ;
    public final void rule__Attribute__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4755:1: ( ( ( rule__Attribute__VerifmethodAssignment_14_2 ) ) )
            // InternalLightweight.g:4756:1: ( ( rule__Attribute__VerifmethodAssignment_14_2 ) )
            {
            // InternalLightweight.g:4756:1: ( ( rule__Attribute__VerifmethodAssignment_14_2 ) )
            // InternalLightweight.g:4757:2: ( rule__Attribute__VerifmethodAssignment_14_2 )
            {
             before(grammarAccess.getAttributeAccess().getVerifmethodAssignment_14_2()); 
            // InternalLightweight.g:4758:2: ( rule__Attribute__VerifmethodAssignment_14_2 )
            // InternalLightweight.g:4758:3: rule__Attribute__VerifmethodAssignment_14_2
            {
            pushFollow(FOLLOW_2);
            rule__Attribute__VerifmethodAssignment_14_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getVerifmethodAssignment_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_14__2__Impl"


    // $ANTLR start "rule__VerifMethod__Group__0"
    // InternalLightweight.g:4767:1: rule__VerifMethod__Group__0 : rule__VerifMethod__Group__0__Impl rule__VerifMethod__Group__1 ;
    public final void rule__VerifMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4771:1: ( rule__VerifMethod__Group__0__Impl rule__VerifMethod__Group__1 )
            // InternalLightweight.g:4772:2: rule__VerifMethod__Group__0__Impl rule__VerifMethod__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__VerifMethod__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifMethod__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__0"


    // $ANTLR start "rule__VerifMethod__Group__0__Impl"
    // InternalLightweight.g:4779:1: rule__VerifMethod__Group__0__Impl : ( () ) ;
    public final void rule__VerifMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4783:1: ( ( () ) )
            // InternalLightweight.g:4784:1: ( () )
            {
            // InternalLightweight.g:4784:1: ( () )
            // InternalLightweight.g:4785:2: ()
            {
             before(grammarAccess.getVerifMethodAccess().getVerifMethodAction_0()); 
            // InternalLightweight.g:4786:2: ()
            // InternalLightweight.g:4786:3: 
            {
            }

             after(grammarAccess.getVerifMethodAccess().getVerifMethodAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__0__Impl"


    // $ANTLR start "rule__VerifMethod__Group__1"
    // InternalLightweight.g:4794:1: rule__VerifMethod__Group__1 : rule__VerifMethod__Group__1__Impl rule__VerifMethod__Group__2 ;
    public final void rule__VerifMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4798:1: ( rule__VerifMethod__Group__1__Impl rule__VerifMethod__Group__2 )
            // InternalLightweight.g:4799:2: rule__VerifMethod__Group__1__Impl rule__VerifMethod__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__VerifMethod__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifMethod__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__1"


    // $ANTLR start "rule__VerifMethod__Group__1__Impl"
    // InternalLightweight.g:4806:1: rule__VerifMethod__Group__1__Impl : ( '{' ) ;
    public final void rule__VerifMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4810:1: ( ( '{' ) )
            // InternalLightweight.g:4811:1: ( '{' )
            {
            // InternalLightweight.g:4811:1: ( '{' )
            // InternalLightweight.g:4812:2: '{'
            {
             before(grammarAccess.getVerifMethodAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getVerifMethodAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__1__Impl"


    // $ANTLR start "rule__VerifMethod__Group__2"
    // InternalLightweight.g:4821:1: rule__VerifMethod__Group__2 : rule__VerifMethod__Group__2__Impl rule__VerifMethod__Group__3 ;
    public final void rule__VerifMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4825:1: ( rule__VerifMethod__Group__2__Impl rule__VerifMethod__Group__3 )
            // InternalLightweight.g:4826:2: rule__VerifMethod__Group__2__Impl rule__VerifMethod__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__VerifMethod__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifMethod__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__2"


    // $ANTLR start "rule__VerifMethod__Group__2__Impl"
    // InternalLightweight.g:4833:1: rule__VerifMethod__Group__2__Impl : ( 'validity' ) ;
    public final void rule__VerifMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4837:1: ( ( 'validity' ) )
            // InternalLightweight.g:4838:1: ( 'validity' )
            {
            // InternalLightweight.g:4838:1: ( 'validity' )
            // InternalLightweight.g:4839:2: 'validity'
            {
             before(grammarAccess.getVerifMethodAccess().getValidityKeyword_2()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getVerifMethodAccess().getValidityKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__2__Impl"


    // $ANTLR start "rule__VerifMethod__Group__3"
    // InternalLightweight.g:4848:1: rule__VerifMethod__Group__3 : rule__VerifMethod__Group__3__Impl rule__VerifMethod__Group__4 ;
    public final void rule__VerifMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4852:1: ( rule__VerifMethod__Group__3__Impl rule__VerifMethod__Group__4 )
            // InternalLightweight.g:4853:2: rule__VerifMethod__Group__3__Impl rule__VerifMethod__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__VerifMethod__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifMethod__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__3"


    // $ANTLR start "rule__VerifMethod__Group__3__Impl"
    // InternalLightweight.g:4860:1: rule__VerifMethod__Group__3__Impl : ( ':' ) ;
    public final void rule__VerifMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4864:1: ( ( ':' ) )
            // InternalLightweight.g:4865:1: ( ':' )
            {
            // InternalLightweight.g:4865:1: ( ':' )
            // InternalLightweight.g:4866:2: ':'
            {
             before(grammarAccess.getVerifMethodAccess().getColonKeyword_3()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVerifMethodAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__3__Impl"


    // $ANTLR start "rule__VerifMethod__Group__4"
    // InternalLightweight.g:4875:1: rule__VerifMethod__Group__4 : rule__VerifMethod__Group__4__Impl rule__VerifMethod__Group__5 ;
    public final void rule__VerifMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4879:1: ( rule__VerifMethod__Group__4__Impl rule__VerifMethod__Group__5 )
            // InternalLightweight.g:4880:2: rule__VerifMethod__Group__4__Impl rule__VerifMethod__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__VerifMethod__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifMethod__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__4"


    // $ANTLR start "rule__VerifMethod__Group__4__Impl"
    // InternalLightweight.g:4887:1: rule__VerifMethod__Group__4__Impl : ( ( rule__VerifMethod__ValidityAssignment_4 ) ) ;
    public final void rule__VerifMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4891:1: ( ( ( rule__VerifMethod__ValidityAssignment_4 ) ) )
            // InternalLightweight.g:4892:1: ( ( rule__VerifMethod__ValidityAssignment_4 ) )
            {
            // InternalLightweight.g:4892:1: ( ( rule__VerifMethod__ValidityAssignment_4 ) )
            // InternalLightweight.g:4893:2: ( rule__VerifMethod__ValidityAssignment_4 )
            {
             before(grammarAccess.getVerifMethodAccess().getValidityAssignment_4()); 
            // InternalLightweight.g:4894:2: ( rule__VerifMethod__ValidityAssignment_4 )
            // InternalLightweight.g:4894:3: rule__VerifMethod__ValidityAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__VerifMethod__ValidityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVerifMethodAccess().getValidityAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__4__Impl"


    // $ANTLR start "rule__VerifMethod__Group__5"
    // InternalLightweight.g:4902:1: rule__VerifMethod__Group__5 : rule__VerifMethod__Group__5__Impl rule__VerifMethod__Group__6 ;
    public final void rule__VerifMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4906:1: ( rule__VerifMethod__Group__5__Impl rule__VerifMethod__Group__6 )
            // InternalLightweight.g:4907:2: rule__VerifMethod__Group__5__Impl rule__VerifMethod__Group__6
            {
            pushFollow(FOLLOW_43);
            rule__VerifMethod__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifMethod__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__5"


    // $ANTLR start "rule__VerifMethod__Group__5__Impl"
    // InternalLightweight.g:4914:1: rule__VerifMethod__Group__5__Impl : ( ',' ) ;
    public final void rule__VerifMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4918:1: ( ( ',' ) )
            // InternalLightweight.g:4919:1: ( ',' )
            {
            // InternalLightweight.g:4919:1: ( ',' )
            // InternalLightweight.g:4920:2: ','
            {
             before(grammarAccess.getVerifMethodAccess().getCommaKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVerifMethodAccess().getCommaKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__5__Impl"


    // $ANTLR start "rule__VerifMethod__Group__6"
    // InternalLightweight.g:4929:1: rule__VerifMethod__Group__6 : rule__VerifMethod__Group__6__Impl rule__VerifMethod__Group__7 ;
    public final void rule__VerifMethod__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4933:1: ( rule__VerifMethod__Group__6__Impl rule__VerifMethod__Group__7 )
            // InternalLightweight.g:4934:2: rule__VerifMethod__Group__6__Impl rule__VerifMethod__Group__7
            {
            pushFollow(FOLLOW_3);
            rule__VerifMethod__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifMethod__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__6"


    // $ANTLR start "rule__VerifMethod__Group__6__Impl"
    // InternalLightweight.g:4941:1: rule__VerifMethod__Group__6__Impl : ( 'uniqueness' ) ;
    public final void rule__VerifMethod__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4945:1: ( ( 'uniqueness' ) )
            // InternalLightweight.g:4946:1: ( 'uniqueness' )
            {
            // InternalLightweight.g:4946:1: ( 'uniqueness' )
            // InternalLightweight.g:4947:2: 'uniqueness'
            {
             before(grammarAccess.getVerifMethodAccess().getUniquenessKeyword_6()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getVerifMethodAccess().getUniquenessKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__6__Impl"


    // $ANTLR start "rule__VerifMethod__Group__7"
    // InternalLightweight.g:4956:1: rule__VerifMethod__Group__7 : rule__VerifMethod__Group__7__Impl rule__VerifMethod__Group__8 ;
    public final void rule__VerifMethod__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4960:1: ( rule__VerifMethod__Group__7__Impl rule__VerifMethod__Group__8 )
            // InternalLightweight.g:4961:2: rule__VerifMethod__Group__7__Impl rule__VerifMethod__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__VerifMethod__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifMethod__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__7"


    // $ANTLR start "rule__VerifMethod__Group__7__Impl"
    // InternalLightweight.g:4968:1: rule__VerifMethod__Group__7__Impl : ( ':' ) ;
    public final void rule__VerifMethod__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4972:1: ( ( ':' ) )
            // InternalLightweight.g:4973:1: ( ':' )
            {
            // InternalLightweight.g:4973:1: ( ':' )
            // InternalLightweight.g:4974:2: ':'
            {
             before(grammarAccess.getVerifMethodAccess().getColonKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVerifMethodAccess().getColonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__7__Impl"


    // $ANTLR start "rule__VerifMethod__Group__8"
    // InternalLightweight.g:4983:1: rule__VerifMethod__Group__8 : rule__VerifMethod__Group__8__Impl rule__VerifMethod__Group__9 ;
    public final void rule__VerifMethod__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4987:1: ( rule__VerifMethod__Group__8__Impl rule__VerifMethod__Group__9 )
            // InternalLightweight.g:4988:2: rule__VerifMethod__Group__8__Impl rule__VerifMethod__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__VerifMethod__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifMethod__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__8"


    // $ANTLR start "rule__VerifMethod__Group__8__Impl"
    // InternalLightweight.g:4995:1: rule__VerifMethod__Group__8__Impl : ( ( rule__VerifMethod__UniquenessAssignment_8 ) ) ;
    public final void rule__VerifMethod__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4999:1: ( ( ( rule__VerifMethod__UniquenessAssignment_8 ) ) )
            // InternalLightweight.g:5000:1: ( ( rule__VerifMethod__UniquenessAssignment_8 ) )
            {
            // InternalLightweight.g:5000:1: ( ( rule__VerifMethod__UniquenessAssignment_8 ) )
            // InternalLightweight.g:5001:2: ( rule__VerifMethod__UniquenessAssignment_8 )
            {
             before(grammarAccess.getVerifMethodAccess().getUniquenessAssignment_8()); 
            // InternalLightweight.g:5002:2: ( rule__VerifMethod__UniquenessAssignment_8 )
            // InternalLightweight.g:5002:3: rule__VerifMethod__UniquenessAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__VerifMethod__UniquenessAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getVerifMethodAccess().getUniquenessAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__8__Impl"


    // $ANTLR start "rule__VerifMethod__Group__9"
    // InternalLightweight.g:5010:1: rule__VerifMethod__Group__9 : rule__VerifMethod__Group__9__Impl rule__VerifMethod__Group__10 ;
    public final void rule__VerifMethod__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5014:1: ( rule__VerifMethod__Group__9__Impl rule__VerifMethod__Group__10 )
            // InternalLightweight.g:5015:2: rule__VerifMethod__Group__9__Impl rule__VerifMethod__Group__10
            {
            pushFollow(FOLLOW_44);
            rule__VerifMethod__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifMethod__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__9"


    // $ANTLR start "rule__VerifMethod__Group__9__Impl"
    // InternalLightweight.g:5022:1: rule__VerifMethod__Group__9__Impl : ( ',' ) ;
    public final void rule__VerifMethod__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5026:1: ( ( ',' ) )
            // InternalLightweight.g:5027:1: ( ',' )
            {
            // InternalLightweight.g:5027:1: ( ',' )
            // InternalLightweight.g:5028:2: ','
            {
             before(grammarAccess.getVerifMethodAccess().getCommaKeyword_9()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVerifMethodAccess().getCommaKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__9__Impl"


    // $ANTLR start "rule__VerifMethod__Group__10"
    // InternalLightweight.g:5037:1: rule__VerifMethod__Group__10 : rule__VerifMethod__Group__10__Impl rule__VerifMethod__Group__11 ;
    public final void rule__VerifMethod__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5041:1: ( rule__VerifMethod__Group__10__Impl rule__VerifMethod__Group__11 )
            // InternalLightweight.g:5042:2: rule__VerifMethod__Group__10__Impl rule__VerifMethod__Group__11
            {
            pushFollow(FOLLOW_3);
            rule__VerifMethod__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifMethod__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__10"


    // $ANTLR start "rule__VerifMethod__Group__10__Impl"
    // InternalLightweight.g:5049:1: rule__VerifMethod__Group__10__Impl : ( 'bindings' ) ;
    public final void rule__VerifMethod__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5053:1: ( ( 'bindings' ) )
            // InternalLightweight.g:5054:1: ( 'bindings' )
            {
            // InternalLightweight.g:5054:1: ( 'bindings' )
            // InternalLightweight.g:5055:2: 'bindings'
            {
             before(grammarAccess.getVerifMethodAccess().getBindingsKeyword_10()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getVerifMethodAccess().getBindingsKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__10__Impl"


    // $ANTLR start "rule__VerifMethod__Group__11"
    // InternalLightweight.g:5064:1: rule__VerifMethod__Group__11 : rule__VerifMethod__Group__11__Impl rule__VerifMethod__Group__12 ;
    public final void rule__VerifMethod__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5068:1: ( rule__VerifMethod__Group__11__Impl rule__VerifMethod__Group__12 )
            // InternalLightweight.g:5069:2: rule__VerifMethod__Group__11__Impl rule__VerifMethod__Group__12
            {
            pushFollow(FOLLOW_23);
            rule__VerifMethod__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifMethod__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__11"


    // $ANTLR start "rule__VerifMethod__Group__11__Impl"
    // InternalLightweight.g:5076:1: rule__VerifMethod__Group__11__Impl : ( ':' ) ;
    public final void rule__VerifMethod__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5080:1: ( ( ':' ) )
            // InternalLightweight.g:5081:1: ( ':' )
            {
            // InternalLightweight.g:5081:1: ( ':' )
            // InternalLightweight.g:5082:2: ':'
            {
             before(grammarAccess.getVerifMethodAccess().getColonKeyword_11()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVerifMethodAccess().getColonKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__11__Impl"


    // $ANTLR start "rule__VerifMethod__Group__12"
    // InternalLightweight.g:5091:1: rule__VerifMethod__Group__12 : rule__VerifMethod__Group__12__Impl rule__VerifMethod__Group__13 ;
    public final void rule__VerifMethod__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5095:1: ( rule__VerifMethod__Group__12__Impl rule__VerifMethod__Group__13 )
            // InternalLightweight.g:5096:2: rule__VerifMethod__Group__12__Impl rule__VerifMethod__Group__13
            {
            pushFollow(FOLLOW_15);
            rule__VerifMethod__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VerifMethod__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__12"


    // $ANTLR start "rule__VerifMethod__Group__12__Impl"
    // InternalLightweight.g:5103:1: rule__VerifMethod__Group__12__Impl : ( ( rule__VerifMethod__BindingsAssignment_12 ) ) ;
    public final void rule__VerifMethod__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5107:1: ( ( ( rule__VerifMethod__BindingsAssignment_12 ) ) )
            // InternalLightweight.g:5108:1: ( ( rule__VerifMethod__BindingsAssignment_12 ) )
            {
            // InternalLightweight.g:5108:1: ( ( rule__VerifMethod__BindingsAssignment_12 ) )
            // InternalLightweight.g:5109:2: ( rule__VerifMethod__BindingsAssignment_12 )
            {
             before(grammarAccess.getVerifMethodAccess().getBindingsAssignment_12()); 
            // InternalLightweight.g:5110:2: ( rule__VerifMethod__BindingsAssignment_12 )
            // InternalLightweight.g:5110:3: rule__VerifMethod__BindingsAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__VerifMethod__BindingsAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getVerifMethodAccess().getBindingsAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__12__Impl"


    // $ANTLR start "rule__VerifMethod__Group__13"
    // InternalLightweight.g:5118:1: rule__VerifMethod__Group__13 : rule__VerifMethod__Group__13__Impl ;
    public final void rule__VerifMethod__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5122:1: ( rule__VerifMethod__Group__13__Impl )
            // InternalLightweight.g:5123:2: rule__VerifMethod__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VerifMethod__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__13"


    // $ANTLR start "rule__VerifMethod__Group__13__Impl"
    // InternalLightweight.g:5129:1: rule__VerifMethod__Group__13__Impl : ( '}' ) ;
    public final void rule__VerifMethod__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5133:1: ( ( '}' ) )
            // InternalLightweight.g:5134:1: ( '}' )
            {
            // InternalLightweight.g:5134:1: ( '}' )
            // InternalLightweight.g:5135:2: '}'
            {
             before(grammarAccess.getVerifMethodAccess().getRightCurlyBracketKeyword_13()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getVerifMethodAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__Group__13__Impl"


    // $ANTLR start "rule__Recovery__Group__0"
    // InternalLightweight.g:5145:1: rule__Recovery__Group__0 : rule__Recovery__Group__0__Impl rule__Recovery__Group__1 ;
    public final void rule__Recovery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5149:1: ( rule__Recovery__Group__0__Impl rule__Recovery__Group__1 )
            // InternalLightweight.g:5150:2: rule__Recovery__Group__0__Impl rule__Recovery__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__Recovery__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__0"


    // $ANTLR start "rule__Recovery__Group__0__Impl"
    // InternalLightweight.g:5157:1: rule__Recovery__Group__0__Impl : ( () ) ;
    public final void rule__Recovery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5161:1: ( ( () ) )
            // InternalLightweight.g:5162:1: ( () )
            {
            // InternalLightweight.g:5162:1: ( () )
            // InternalLightweight.g:5163:2: ()
            {
             before(grammarAccess.getRecoveryAccess().getRecoveryAction_0()); 
            // InternalLightweight.g:5164:2: ()
            // InternalLightweight.g:5164:3: 
            {
            }

             after(grammarAccess.getRecoveryAccess().getRecoveryAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__0__Impl"


    // $ANTLR start "rule__Recovery__Group__1"
    // InternalLightweight.g:5172:1: rule__Recovery__Group__1 : rule__Recovery__Group__1__Impl rule__Recovery__Group__2 ;
    public final void rule__Recovery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5176:1: ( rule__Recovery__Group__1__Impl rule__Recovery__Group__2 )
            // InternalLightweight.g:5177:2: rule__Recovery__Group__1__Impl rule__Recovery__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Recovery__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__1"


    // $ANTLR start "rule__Recovery__Group__1__Impl"
    // InternalLightweight.g:5184:1: rule__Recovery__Group__1__Impl : ( ( rule__Recovery__TypeAssignment_1 ) ) ;
    public final void rule__Recovery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5188:1: ( ( ( rule__Recovery__TypeAssignment_1 ) ) )
            // InternalLightweight.g:5189:1: ( ( rule__Recovery__TypeAssignment_1 ) )
            {
            // InternalLightweight.g:5189:1: ( ( rule__Recovery__TypeAssignment_1 ) )
            // InternalLightweight.g:5190:2: ( rule__Recovery__TypeAssignment_1 )
            {
             before(grammarAccess.getRecoveryAccess().getTypeAssignment_1()); 
            // InternalLightweight.g:5191:2: ( rule__Recovery__TypeAssignment_1 )
            // InternalLightweight.g:5191:3: rule__Recovery__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Recovery__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRecoveryAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__1__Impl"


    // $ANTLR start "rule__Recovery__Group__2"
    // InternalLightweight.g:5199:1: rule__Recovery__Group__2 : rule__Recovery__Group__2__Impl rule__Recovery__Group__3 ;
    public final void rule__Recovery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5203:1: ( rule__Recovery__Group__2__Impl rule__Recovery__Group__3 )
            // InternalLightweight.g:5204:2: rule__Recovery__Group__2__Impl rule__Recovery__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Recovery__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__2"


    // $ANTLR start "rule__Recovery__Group__2__Impl"
    // InternalLightweight.g:5211:1: rule__Recovery__Group__2__Impl : ( ':' ) ;
    public final void rule__Recovery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5215:1: ( ( ':' ) )
            // InternalLightweight.g:5216:1: ( ':' )
            {
            // InternalLightweight.g:5216:1: ( ':' )
            // InternalLightweight.g:5217:2: ':'
            {
             before(grammarAccess.getRecoveryAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__2__Impl"


    // $ANTLR start "rule__Recovery__Group__3"
    // InternalLightweight.g:5226:1: rule__Recovery__Group__3 : rule__Recovery__Group__3__Impl rule__Recovery__Group__4 ;
    public final void rule__Recovery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5230:1: ( rule__Recovery__Group__3__Impl rule__Recovery__Group__4 )
            // InternalLightweight.g:5231:2: rule__Recovery__Group__3__Impl rule__Recovery__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Recovery__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__3"


    // $ANTLR start "rule__Recovery__Group__3__Impl"
    // InternalLightweight.g:5238:1: rule__Recovery__Group__3__Impl : ( '{' ) ;
    public final void rule__Recovery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5242:1: ( ( '{' ) )
            // InternalLightweight.g:5243:1: ( '{' )
            {
            // InternalLightweight.g:5243:1: ( '{' )
            // InternalLightweight.g:5244:2: '{'
            {
             before(grammarAccess.getRecoveryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__3__Impl"


    // $ANTLR start "rule__Recovery__Group__4"
    // InternalLightweight.g:5253:1: rule__Recovery__Group__4 : rule__Recovery__Group__4__Impl rule__Recovery__Group__5 ;
    public final void rule__Recovery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5257:1: ( rule__Recovery__Group__4__Impl rule__Recovery__Group__5 )
            // InternalLightweight.g:5258:2: rule__Recovery__Group__4__Impl rule__Recovery__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Recovery__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__4"


    // $ANTLR start "rule__Recovery__Group__4__Impl"
    // InternalLightweight.g:5265:1: rule__Recovery__Group__4__Impl : ( 'name' ) ;
    public final void rule__Recovery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5269:1: ( ( 'name' ) )
            // InternalLightweight.g:5270:1: ( 'name' )
            {
            // InternalLightweight.g:5270:1: ( 'name' )
            // InternalLightweight.g:5271:2: 'name'
            {
             before(grammarAccess.getRecoveryAccess().getNameKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__4__Impl"


    // $ANTLR start "rule__Recovery__Group__5"
    // InternalLightweight.g:5280:1: rule__Recovery__Group__5 : rule__Recovery__Group__5__Impl rule__Recovery__Group__6 ;
    public final void rule__Recovery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5284:1: ( rule__Recovery__Group__5__Impl rule__Recovery__Group__6 )
            // InternalLightweight.g:5285:2: rule__Recovery__Group__5__Impl rule__Recovery__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Recovery__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__5"


    // $ANTLR start "rule__Recovery__Group__5__Impl"
    // InternalLightweight.g:5292:1: rule__Recovery__Group__5__Impl : ( ':' ) ;
    public final void rule__Recovery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5296:1: ( ( ':' ) )
            // InternalLightweight.g:5297:1: ( ':' )
            {
            // InternalLightweight.g:5297:1: ( ':' )
            // InternalLightweight.g:5298:2: ':'
            {
             before(grammarAccess.getRecoveryAccess().getColonKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__5__Impl"


    // $ANTLR start "rule__Recovery__Group__6"
    // InternalLightweight.g:5307:1: rule__Recovery__Group__6 : rule__Recovery__Group__6__Impl rule__Recovery__Group__7 ;
    public final void rule__Recovery__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5311:1: ( rule__Recovery__Group__6__Impl rule__Recovery__Group__7 )
            // InternalLightweight.g:5312:2: rule__Recovery__Group__6__Impl rule__Recovery__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Recovery__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__6"


    // $ANTLR start "rule__Recovery__Group__6__Impl"
    // InternalLightweight.g:5319:1: rule__Recovery__Group__6__Impl : ( ( rule__Recovery__NameAssignment_6 ) ) ;
    public final void rule__Recovery__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5323:1: ( ( ( rule__Recovery__NameAssignment_6 ) ) )
            // InternalLightweight.g:5324:1: ( ( rule__Recovery__NameAssignment_6 ) )
            {
            // InternalLightweight.g:5324:1: ( ( rule__Recovery__NameAssignment_6 ) )
            // InternalLightweight.g:5325:2: ( rule__Recovery__NameAssignment_6 )
            {
             before(grammarAccess.getRecoveryAccess().getNameAssignment_6()); 
            // InternalLightweight.g:5326:2: ( rule__Recovery__NameAssignment_6 )
            // InternalLightweight.g:5326:3: rule__Recovery__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Recovery__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRecoveryAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__6__Impl"


    // $ANTLR start "rule__Recovery__Group__7"
    // InternalLightweight.g:5334:1: rule__Recovery__Group__7 : rule__Recovery__Group__7__Impl rule__Recovery__Group__8 ;
    public final void rule__Recovery__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5338:1: ( rule__Recovery__Group__7__Impl rule__Recovery__Group__8 )
            // InternalLightweight.g:5339:2: rule__Recovery__Group__7__Impl rule__Recovery__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Recovery__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__7"


    // $ANTLR start "rule__Recovery__Group__7__Impl"
    // InternalLightweight.g:5346:1: rule__Recovery__Group__7__Impl : ( ',' ) ;
    public final void rule__Recovery__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5350:1: ( ( ',' ) )
            // InternalLightweight.g:5351:1: ( ',' )
            {
            // InternalLightweight.g:5351:1: ( ',' )
            // InternalLightweight.g:5352:2: ','
            {
             before(grammarAccess.getRecoveryAccess().getCommaKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__7__Impl"


    // $ANTLR start "rule__Recovery__Group__8"
    // InternalLightweight.g:5361:1: rule__Recovery__Group__8 : rule__Recovery__Group__8__Impl rule__Recovery__Group__9 ;
    public final void rule__Recovery__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5365:1: ( rule__Recovery__Group__8__Impl rule__Recovery__Group__9 )
            // InternalLightweight.g:5366:2: rule__Recovery__Group__8__Impl rule__Recovery__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Recovery__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__8"


    // $ANTLR start "rule__Recovery__Group__8__Impl"
    // InternalLightweight.g:5373:1: rule__Recovery__Group__8__Impl : ( 'authenticator' ) ;
    public final void rule__Recovery__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5377:1: ( ( 'authenticator' ) )
            // InternalLightweight.g:5378:1: ( 'authenticator' )
            {
            // InternalLightweight.g:5378:1: ( 'authenticator' )
            // InternalLightweight.g:5379:2: 'authenticator'
            {
             before(grammarAccess.getRecoveryAccess().getAuthenticatorKeyword_8()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getAuthenticatorKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__8__Impl"


    // $ANTLR start "rule__Recovery__Group__9"
    // InternalLightweight.g:5388:1: rule__Recovery__Group__9 : rule__Recovery__Group__9__Impl rule__Recovery__Group__10 ;
    public final void rule__Recovery__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5392:1: ( rule__Recovery__Group__9__Impl rule__Recovery__Group__10 )
            // InternalLightweight.g:5393:2: rule__Recovery__Group__9__Impl rule__Recovery__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__Recovery__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__9"


    // $ANTLR start "rule__Recovery__Group__9__Impl"
    // InternalLightweight.g:5400:1: rule__Recovery__Group__9__Impl : ( ':' ) ;
    public final void rule__Recovery__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5404:1: ( ( ':' ) )
            // InternalLightweight.g:5405:1: ( ':' )
            {
            // InternalLightweight.g:5405:1: ( ':' )
            // InternalLightweight.g:5406:2: ':'
            {
             before(grammarAccess.getRecoveryAccess().getColonKeyword_9()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__9__Impl"


    // $ANTLR start "rule__Recovery__Group__10"
    // InternalLightweight.g:5415:1: rule__Recovery__Group__10 : rule__Recovery__Group__10__Impl rule__Recovery__Group__11 ;
    public final void rule__Recovery__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5419:1: ( rule__Recovery__Group__10__Impl rule__Recovery__Group__11 )
            // InternalLightweight.g:5420:2: rule__Recovery__Group__10__Impl rule__Recovery__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Recovery__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__10"


    // $ANTLR start "rule__Recovery__Group__10__Impl"
    // InternalLightweight.g:5427:1: rule__Recovery__Group__10__Impl : ( ( rule__Recovery__AuthenticatorAssignment_10 ) ) ;
    public final void rule__Recovery__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5431:1: ( ( ( rule__Recovery__AuthenticatorAssignment_10 ) ) )
            // InternalLightweight.g:5432:1: ( ( rule__Recovery__AuthenticatorAssignment_10 ) )
            {
            // InternalLightweight.g:5432:1: ( ( rule__Recovery__AuthenticatorAssignment_10 ) )
            // InternalLightweight.g:5433:2: ( rule__Recovery__AuthenticatorAssignment_10 )
            {
             before(grammarAccess.getRecoveryAccess().getAuthenticatorAssignment_10()); 
            // InternalLightweight.g:5434:2: ( rule__Recovery__AuthenticatorAssignment_10 )
            // InternalLightweight.g:5434:3: rule__Recovery__AuthenticatorAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Recovery__AuthenticatorAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getRecoveryAccess().getAuthenticatorAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__10__Impl"


    // $ANTLR start "rule__Recovery__Group__11"
    // InternalLightweight.g:5442:1: rule__Recovery__Group__11 : rule__Recovery__Group__11__Impl rule__Recovery__Group__12 ;
    public final void rule__Recovery__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5446:1: ( rule__Recovery__Group__11__Impl rule__Recovery__Group__12 )
            // InternalLightweight.g:5447:2: rule__Recovery__Group__11__Impl rule__Recovery__Group__12
            {
            pushFollow(FOLLOW_46);
            rule__Recovery__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__11"


    // $ANTLR start "rule__Recovery__Group__11__Impl"
    // InternalLightweight.g:5454:1: rule__Recovery__Group__11__Impl : ( ',' ) ;
    public final void rule__Recovery__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5458:1: ( ( ',' ) )
            // InternalLightweight.g:5459:1: ( ',' )
            {
            // InternalLightweight.g:5459:1: ( ',' )
            // InternalLightweight.g:5460:2: ','
            {
             before(grammarAccess.getRecoveryAccess().getCommaKeyword_11()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getCommaKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__11__Impl"


    // $ANTLR start "rule__Recovery__Group__12"
    // InternalLightweight.g:5469:1: rule__Recovery__Group__12 : rule__Recovery__Group__12__Impl rule__Recovery__Group__13 ;
    public final void rule__Recovery__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5473:1: ( rule__Recovery__Group__12__Impl rule__Recovery__Group__13 )
            // InternalLightweight.g:5474:2: rule__Recovery__Group__12__Impl rule__Recovery__Group__13
            {
            pushFollow(FOLLOW_46);
            rule__Recovery__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__12"


    // $ANTLR start "rule__Recovery__Group__12__Impl"
    // InternalLightweight.g:5481:1: rule__Recovery__Group__12__Impl : ( ( rule__Recovery__Group_12__0 )? ) ;
    public final void rule__Recovery__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5485:1: ( ( ( rule__Recovery__Group_12__0 )? ) )
            // InternalLightweight.g:5486:1: ( ( rule__Recovery__Group_12__0 )? )
            {
            // InternalLightweight.g:5486:1: ( ( rule__Recovery__Group_12__0 )? )
            // InternalLightweight.g:5487:2: ( rule__Recovery__Group_12__0 )?
            {
             before(grammarAccess.getRecoveryAccess().getGroup_12()); 
            // InternalLightweight.g:5488:2: ( rule__Recovery__Group_12__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==58) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLightweight.g:5488:3: rule__Recovery__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Recovery__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecoveryAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__12__Impl"


    // $ANTLR start "rule__Recovery__Group__13"
    // InternalLightweight.g:5496:1: rule__Recovery__Group__13 : rule__Recovery__Group__13__Impl rule__Recovery__Group__14 ;
    public final void rule__Recovery__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5500:1: ( rule__Recovery__Group__13__Impl rule__Recovery__Group__14 )
            // InternalLightweight.g:5501:2: rule__Recovery__Group__13__Impl rule__Recovery__Group__14
            {
            pushFollow(FOLLOW_46);
            rule__Recovery__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__13"


    // $ANTLR start "rule__Recovery__Group__13__Impl"
    // InternalLightweight.g:5508:1: rule__Recovery__Group__13__Impl : ( ( rule__Recovery__Group_13__0 )? ) ;
    public final void rule__Recovery__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5512:1: ( ( ( rule__Recovery__Group_13__0 )? ) )
            // InternalLightweight.g:5513:1: ( ( rule__Recovery__Group_13__0 )? )
            {
            // InternalLightweight.g:5513:1: ( ( rule__Recovery__Group_13__0 )? )
            // InternalLightweight.g:5514:2: ( rule__Recovery__Group_13__0 )?
            {
             before(grammarAccess.getRecoveryAccess().getGroup_13()); 
            // InternalLightweight.g:5515:2: ( rule__Recovery__Group_13__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==60) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalLightweight.g:5515:3: rule__Recovery__Group_13__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Recovery__Group_13__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRecoveryAccess().getGroup_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__13__Impl"


    // $ANTLR start "rule__Recovery__Group__14"
    // InternalLightweight.g:5523:1: rule__Recovery__Group__14 : rule__Recovery__Group__14__Impl ;
    public final void rule__Recovery__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5527:1: ( rule__Recovery__Group__14__Impl )
            // InternalLightweight.g:5528:2: rule__Recovery__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recovery__Group__14__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__14"


    // $ANTLR start "rule__Recovery__Group__14__Impl"
    // InternalLightweight.g:5534:1: rule__Recovery__Group__14__Impl : ( '}' ) ;
    public final void rule__Recovery__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5538:1: ( ( '}' ) )
            // InternalLightweight.g:5539:1: ( '}' )
            {
            // InternalLightweight.g:5539:1: ( '}' )
            // InternalLightweight.g:5540:2: '}'
            {
             before(grammarAccess.getRecoveryAccess().getRightCurlyBracketKeyword_14()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getRightCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group__14__Impl"


    // $ANTLR start "rule__Recovery__Group_12__0"
    // InternalLightweight.g:5550:1: rule__Recovery__Group_12__0 : rule__Recovery__Group_12__0__Impl rule__Recovery__Group_12__1 ;
    public final void rule__Recovery__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5554:1: ( rule__Recovery__Group_12__0__Impl rule__Recovery__Group_12__1 )
            // InternalLightweight.g:5555:2: rule__Recovery__Group_12__0__Impl rule__Recovery__Group_12__1
            {
            pushFollow(FOLLOW_3);
            rule__Recovery__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_12__0"


    // $ANTLR start "rule__Recovery__Group_12__0__Impl"
    // InternalLightweight.g:5562:1: rule__Recovery__Group_12__0__Impl : ( 'authentication' ) ;
    public final void rule__Recovery__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5566:1: ( ( 'authentication' ) )
            // InternalLightweight.g:5567:1: ( 'authentication' )
            {
            // InternalLightweight.g:5567:1: ( 'authentication' )
            // InternalLightweight.g:5568:2: 'authentication'
            {
             before(grammarAccess.getRecoveryAccess().getAuthenticationKeyword_12_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getAuthenticationKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_12__0__Impl"


    // $ANTLR start "rule__Recovery__Group_12__1"
    // InternalLightweight.g:5577:1: rule__Recovery__Group_12__1 : rule__Recovery__Group_12__1__Impl rule__Recovery__Group_12__2 ;
    public final void rule__Recovery__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5581:1: ( rule__Recovery__Group_12__1__Impl rule__Recovery__Group_12__2 )
            // InternalLightweight.g:5582:2: rule__Recovery__Group_12__1__Impl rule__Recovery__Group_12__2
            {
            pushFollow(FOLLOW_19);
            rule__Recovery__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_12__1"


    // $ANTLR start "rule__Recovery__Group_12__1__Impl"
    // InternalLightweight.g:5589:1: rule__Recovery__Group_12__1__Impl : ( ':' ) ;
    public final void rule__Recovery__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5593:1: ( ( ':' ) )
            // InternalLightweight.g:5594:1: ( ':' )
            {
            // InternalLightweight.g:5594:1: ( ':' )
            // InternalLightweight.g:5595:2: ':'
            {
             before(grammarAccess.getRecoveryAccess().getColonKeyword_12_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getColonKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_12__1__Impl"


    // $ANTLR start "rule__Recovery__Group_12__2"
    // InternalLightweight.g:5604:1: rule__Recovery__Group_12__2 : rule__Recovery__Group_12__2__Impl rule__Recovery__Group_12__3 ;
    public final void rule__Recovery__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5608:1: ( rule__Recovery__Group_12__2__Impl rule__Recovery__Group_12__3 )
            // InternalLightweight.g:5609:2: rule__Recovery__Group_12__2__Impl rule__Recovery__Group_12__3
            {
            pushFollow(FOLLOW_47);
            rule__Recovery__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_12__2"


    // $ANTLR start "rule__Recovery__Group_12__2__Impl"
    // InternalLightweight.g:5616:1: rule__Recovery__Group_12__2__Impl : ( ( rule__Recovery__AuthMethodsAssignment_12_2 ) ) ;
    public final void rule__Recovery__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5620:1: ( ( ( rule__Recovery__AuthMethodsAssignment_12_2 ) ) )
            // InternalLightweight.g:5621:1: ( ( rule__Recovery__AuthMethodsAssignment_12_2 ) )
            {
            // InternalLightweight.g:5621:1: ( ( rule__Recovery__AuthMethodsAssignment_12_2 ) )
            // InternalLightweight.g:5622:2: ( rule__Recovery__AuthMethodsAssignment_12_2 )
            {
             before(grammarAccess.getRecoveryAccess().getAuthMethodsAssignment_12_2()); 
            // InternalLightweight.g:5623:2: ( rule__Recovery__AuthMethodsAssignment_12_2 )
            // InternalLightweight.g:5623:3: rule__Recovery__AuthMethodsAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__Recovery__AuthMethodsAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getRecoveryAccess().getAuthMethodsAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_12__2__Impl"


    // $ANTLR start "rule__Recovery__Group_12__3"
    // InternalLightweight.g:5631:1: rule__Recovery__Group_12__3 : rule__Recovery__Group_12__3__Impl ;
    public final void rule__Recovery__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5635:1: ( rule__Recovery__Group_12__3__Impl )
            // InternalLightweight.g:5636:2: rule__Recovery__Group_12__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recovery__Group_12__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_12__3"


    // $ANTLR start "rule__Recovery__Group_12__3__Impl"
    // InternalLightweight.g:5642:1: rule__Recovery__Group_12__3__Impl : ( ( rule__Recovery__Group_12_3__0 )* ) ;
    public final void rule__Recovery__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5646:1: ( ( ( rule__Recovery__Group_12_3__0 )* ) )
            // InternalLightweight.g:5647:1: ( ( rule__Recovery__Group_12_3__0 )* )
            {
            // InternalLightweight.g:5647:1: ( ( rule__Recovery__Group_12_3__0 )* )
            // InternalLightweight.g:5648:2: ( rule__Recovery__Group_12_3__0 )*
            {
             before(grammarAccess.getRecoveryAccess().getGroup_12_3()); 
            // InternalLightweight.g:5649:2: ( rule__Recovery__Group_12_3__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==59) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalLightweight.g:5649:3: rule__Recovery__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__Recovery__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getRecoveryAccess().getGroup_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_12__3__Impl"


    // $ANTLR start "rule__Recovery__Group_12_3__0"
    // InternalLightweight.g:5658:1: rule__Recovery__Group_12_3__0 : rule__Recovery__Group_12_3__0__Impl rule__Recovery__Group_12_3__1 ;
    public final void rule__Recovery__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5662:1: ( rule__Recovery__Group_12_3__0__Impl rule__Recovery__Group_12_3__1 )
            // InternalLightweight.g:5663:2: rule__Recovery__Group_12_3__0__Impl rule__Recovery__Group_12_3__1
            {
            pushFollow(FOLLOW_19);
            rule__Recovery__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group_12_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_12_3__0"


    // $ANTLR start "rule__Recovery__Group_12_3__0__Impl"
    // InternalLightweight.g:5670:1: rule__Recovery__Group_12_3__0__Impl : ( '||' ) ;
    public final void rule__Recovery__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5674:1: ( ( '||' ) )
            // InternalLightweight.g:5675:1: ( '||' )
            {
            // InternalLightweight.g:5675:1: ( '||' )
            // InternalLightweight.g:5676:2: '||'
            {
             before(grammarAccess.getRecoveryAccess().getVerticalLineVerticalLineKeyword_12_3_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getVerticalLineVerticalLineKeyword_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_12_3__0__Impl"


    // $ANTLR start "rule__Recovery__Group_12_3__1"
    // InternalLightweight.g:5685:1: rule__Recovery__Group_12_3__1 : rule__Recovery__Group_12_3__1__Impl ;
    public final void rule__Recovery__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5689:1: ( rule__Recovery__Group_12_3__1__Impl )
            // InternalLightweight.g:5690:2: rule__Recovery__Group_12_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recovery__Group_12_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_12_3__1"


    // $ANTLR start "rule__Recovery__Group_12_3__1__Impl"
    // InternalLightweight.g:5696:1: rule__Recovery__Group_12_3__1__Impl : ( ( rule__Recovery__AuthMethodsAssignment_12_3_1 ) ) ;
    public final void rule__Recovery__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5700:1: ( ( ( rule__Recovery__AuthMethodsAssignment_12_3_1 ) ) )
            // InternalLightweight.g:5701:1: ( ( rule__Recovery__AuthMethodsAssignment_12_3_1 ) )
            {
            // InternalLightweight.g:5701:1: ( ( rule__Recovery__AuthMethodsAssignment_12_3_1 ) )
            // InternalLightweight.g:5702:2: ( rule__Recovery__AuthMethodsAssignment_12_3_1 )
            {
             before(grammarAccess.getRecoveryAccess().getAuthMethodsAssignment_12_3_1()); 
            // InternalLightweight.g:5703:2: ( rule__Recovery__AuthMethodsAssignment_12_3_1 )
            // InternalLightweight.g:5703:3: rule__Recovery__AuthMethodsAssignment_12_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Recovery__AuthMethodsAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRecoveryAccess().getAuthMethodsAssignment_12_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_12_3__1__Impl"


    // $ANTLR start "rule__Recovery__Group_13__0"
    // InternalLightweight.g:5712:1: rule__Recovery__Group_13__0 : rule__Recovery__Group_13__0__Impl rule__Recovery__Group_13__1 ;
    public final void rule__Recovery__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5716:1: ( rule__Recovery__Group_13__0__Impl rule__Recovery__Group_13__1 )
            // InternalLightweight.g:5717:2: rule__Recovery__Group_13__0__Impl rule__Recovery__Group_13__1
            {
            pushFollow(FOLLOW_3);
            rule__Recovery__Group_13__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group_13__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_13__0"


    // $ANTLR start "rule__Recovery__Group_13__0__Impl"
    // InternalLightweight.g:5724:1: rule__Recovery__Group_13__0__Impl : ( 'protocol' ) ;
    public final void rule__Recovery__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5728:1: ( ( 'protocol' ) )
            // InternalLightweight.g:5729:1: ( 'protocol' )
            {
            // InternalLightweight.g:5729:1: ( 'protocol' )
            // InternalLightweight.g:5730:2: 'protocol'
            {
             before(grammarAccess.getRecoveryAccess().getProtocolKeyword_13_0()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getProtocolKeyword_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_13__0__Impl"


    // $ANTLR start "rule__Recovery__Group_13__1"
    // InternalLightweight.g:5739:1: rule__Recovery__Group_13__1 : rule__Recovery__Group_13__1__Impl rule__Recovery__Group_13__2 ;
    public final void rule__Recovery__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5743:1: ( rule__Recovery__Group_13__1__Impl rule__Recovery__Group_13__2 )
            // InternalLightweight.g:5744:2: rule__Recovery__Group_13__1__Impl rule__Recovery__Group_13__2
            {
            pushFollow(FOLLOW_49);
            rule__Recovery__Group_13__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group_13__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_13__1"


    // $ANTLR start "rule__Recovery__Group_13__1__Impl"
    // InternalLightweight.g:5751:1: rule__Recovery__Group_13__1__Impl : ( ':' ) ;
    public final void rule__Recovery__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5755:1: ( ( ':' ) )
            // InternalLightweight.g:5756:1: ( ':' )
            {
            // InternalLightweight.g:5756:1: ( ':' )
            // InternalLightweight.g:5757:2: ':'
            {
             before(grammarAccess.getRecoveryAccess().getColonKeyword_13_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getColonKeyword_13_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_13__1__Impl"


    // $ANTLR start "rule__Recovery__Group_13__2"
    // InternalLightweight.g:5766:1: rule__Recovery__Group_13__2 : rule__Recovery__Group_13__2__Impl ;
    public final void rule__Recovery__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5770:1: ( rule__Recovery__Group_13__2__Impl )
            // InternalLightweight.g:5771:2: rule__Recovery__Group_13__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recovery__Group_13__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_13__2"


    // $ANTLR start "rule__Recovery__Group_13__2__Impl"
    // InternalLightweight.g:5777:1: rule__Recovery__Group_13__2__Impl : ( ( rule__Recovery__ProtocolAssignment_13_2 ) ) ;
    public final void rule__Recovery__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5781:1: ( ( ( rule__Recovery__ProtocolAssignment_13_2 ) ) )
            // InternalLightweight.g:5782:1: ( ( rule__Recovery__ProtocolAssignment_13_2 ) )
            {
            // InternalLightweight.g:5782:1: ( ( rule__Recovery__ProtocolAssignment_13_2 ) )
            // InternalLightweight.g:5783:2: ( rule__Recovery__ProtocolAssignment_13_2 )
            {
             before(grammarAccess.getRecoveryAccess().getProtocolAssignment_13_2()); 
            // InternalLightweight.g:5784:2: ( rule__Recovery__ProtocolAssignment_13_2 )
            // InternalLightweight.g:5784:3: rule__Recovery__ProtocolAssignment_13_2
            {
            pushFollow(FOLLOW_2);
            rule__Recovery__ProtocolAssignment_13_2();

            state._fsp--;


            }

             after(grammarAccess.getRecoveryAccess().getProtocolAssignment_13_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_13__2__Impl"


    // $ANTLR start "rule__Login__Group__0"
    // InternalLightweight.g:5793:1: rule__Login__Group__0 : rule__Login__Group__0__Impl rule__Login__Group__1 ;
    public final void rule__Login__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5797:1: ( rule__Login__Group__0__Impl rule__Login__Group__1 )
            // InternalLightweight.g:5798:2: rule__Login__Group__0__Impl rule__Login__Group__1
            {
            pushFollow(FOLLOW_50);
            rule__Login__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__0"


    // $ANTLR start "rule__Login__Group__0__Impl"
    // InternalLightweight.g:5805:1: rule__Login__Group__0__Impl : ( () ) ;
    public final void rule__Login__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5809:1: ( ( () ) )
            // InternalLightweight.g:5810:1: ( () )
            {
            // InternalLightweight.g:5810:1: ( () )
            // InternalLightweight.g:5811:2: ()
            {
             before(grammarAccess.getLoginAccess().getLoginAction_0()); 
            // InternalLightweight.g:5812:2: ()
            // InternalLightweight.g:5812:3: 
            {
            }

             after(grammarAccess.getLoginAccess().getLoginAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__0__Impl"


    // $ANTLR start "rule__Login__Group__1"
    // InternalLightweight.g:5820:1: rule__Login__Group__1 : rule__Login__Group__1__Impl rule__Login__Group__2 ;
    public final void rule__Login__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5824:1: ( rule__Login__Group__1__Impl rule__Login__Group__2 )
            // InternalLightweight.g:5825:2: rule__Login__Group__1__Impl rule__Login__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Login__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__1"


    // $ANTLR start "rule__Login__Group__1__Impl"
    // InternalLightweight.g:5832:1: rule__Login__Group__1__Impl : ( ( rule__Login__TypeAssignment_1 ) ) ;
    public final void rule__Login__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5836:1: ( ( ( rule__Login__TypeAssignment_1 ) ) )
            // InternalLightweight.g:5837:1: ( ( rule__Login__TypeAssignment_1 ) )
            {
            // InternalLightweight.g:5837:1: ( ( rule__Login__TypeAssignment_1 ) )
            // InternalLightweight.g:5838:2: ( rule__Login__TypeAssignment_1 )
            {
             before(grammarAccess.getLoginAccess().getTypeAssignment_1()); 
            // InternalLightweight.g:5839:2: ( rule__Login__TypeAssignment_1 )
            // InternalLightweight.g:5839:3: rule__Login__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Login__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLoginAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__1__Impl"


    // $ANTLR start "rule__Login__Group__2"
    // InternalLightweight.g:5847:1: rule__Login__Group__2 : rule__Login__Group__2__Impl rule__Login__Group__3 ;
    public final void rule__Login__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5851:1: ( rule__Login__Group__2__Impl rule__Login__Group__3 )
            // InternalLightweight.g:5852:2: rule__Login__Group__2__Impl rule__Login__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Login__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__2"


    // $ANTLR start "rule__Login__Group__2__Impl"
    // InternalLightweight.g:5859:1: rule__Login__Group__2__Impl : ( ':' ) ;
    public final void rule__Login__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5863:1: ( ( ':' ) )
            // InternalLightweight.g:5864:1: ( ':' )
            {
            // InternalLightweight.g:5864:1: ( ':' )
            // InternalLightweight.g:5865:2: ':'
            {
             before(grammarAccess.getLoginAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__2__Impl"


    // $ANTLR start "rule__Login__Group__3"
    // InternalLightweight.g:5874:1: rule__Login__Group__3 : rule__Login__Group__3__Impl rule__Login__Group__4 ;
    public final void rule__Login__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5878:1: ( rule__Login__Group__3__Impl rule__Login__Group__4 )
            // InternalLightweight.g:5879:2: rule__Login__Group__3__Impl rule__Login__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Login__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__3"


    // $ANTLR start "rule__Login__Group__3__Impl"
    // InternalLightweight.g:5886:1: rule__Login__Group__3__Impl : ( '{' ) ;
    public final void rule__Login__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5890:1: ( ( '{' ) )
            // InternalLightweight.g:5891:1: ( '{' )
            {
            // InternalLightweight.g:5891:1: ( '{' )
            // InternalLightweight.g:5892:2: '{'
            {
             before(grammarAccess.getLoginAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__3__Impl"


    // $ANTLR start "rule__Login__Group__4"
    // InternalLightweight.g:5901:1: rule__Login__Group__4 : rule__Login__Group__4__Impl rule__Login__Group__5 ;
    public final void rule__Login__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5905:1: ( rule__Login__Group__4__Impl rule__Login__Group__5 )
            // InternalLightweight.g:5906:2: rule__Login__Group__4__Impl rule__Login__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Login__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__4"


    // $ANTLR start "rule__Login__Group__4__Impl"
    // InternalLightweight.g:5913:1: rule__Login__Group__4__Impl : ( 'name' ) ;
    public final void rule__Login__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5917:1: ( ( 'name' ) )
            // InternalLightweight.g:5918:1: ( 'name' )
            {
            // InternalLightweight.g:5918:1: ( 'name' )
            // InternalLightweight.g:5919:2: 'name'
            {
             before(grammarAccess.getLoginAccess().getNameKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__4__Impl"


    // $ANTLR start "rule__Login__Group__5"
    // InternalLightweight.g:5928:1: rule__Login__Group__5 : rule__Login__Group__5__Impl rule__Login__Group__6 ;
    public final void rule__Login__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5932:1: ( rule__Login__Group__5__Impl rule__Login__Group__6 )
            // InternalLightweight.g:5933:2: rule__Login__Group__5__Impl rule__Login__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Login__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__5"


    // $ANTLR start "rule__Login__Group__5__Impl"
    // InternalLightweight.g:5940:1: rule__Login__Group__5__Impl : ( ':' ) ;
    public final void rule__Login__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5944:1: ( ( ':' ) )
            // InternalLightweight.g:5945:1: ( ':' )
            {
            // InternalLightweight.g:5945:1: ( ':' )
            // InternalLightweight.g:5946:2: ':'
            {
             before(grammarAccess.getLoginAccess().getColonKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__5__Impl"


    // $ANTLR start "rule__Login__Group__6"
    // InternalLightweight.g:5955:1: rule__Login__Group__6 : rule__Login__Group__6__Impl rule__Login__Group__7 ;
    public final void rule__Login__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5959:1: ( rule__Login__Group__6__Impl rule__Login__Group__7 )
            // InternalLightweight.g:5960:2: rule__Login__Group__6__Impl rule__Login__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Login__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__6"


    // $ANTLR start "rule__Login__Group__6__Impl"
    // InternalLightweight.g:5967:1: rule__Login__Group__6__Impl : ( ( rule__Login__NameAssignment_6 ) ) ;
    public final void rule__Login__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5971:1: ( ( ( rule__Login__NameAssignment_6 ) ) )
            // InternalLightweight.g:5972:1: ( ( rule__Login__NameAssignment_6 ) )
            {
            // InternalLightweight.g:5972:1: ( ( rule__Login__NameAssignment_6 ) )
            // InternalLightweight.g:5973:2: ( rule__Login__NameAssignment_6 )
            {
             before(grammarAccess.getLoginAccess().getNameAssignment_6()); 
            // InternalLightweight.g:5974:2: ( rule__Login__NameAssignment_6 )
            // InternalLightweight.g:5974:3: rule__Login__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Login__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLoginAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__6__Impl"


    // $ANTLR start "rule__Login__Group__7"
    // InternalLightweight.g:5982:1: rule__Login__Group__7 : rule__Login__Group__7__Impl rule__Login__Group__8 ;
    public final void rule__Login__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5986:1: ( rule__Login__Group__7__Impl rule__Login__Group__8 )
            // InternalLightweight.g:5987:2: rule__Login__Group__7__Impl rule__Login__Group__8
            {
            pushFollow(FOLLOW_51);
            rule__Login__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__7"


    // $ANTLR start "rule__Login__Group__7__Impl"
    // InternalLightweight.g:5994:1: rule__Login__Group__7__Impl : ( ',' ) ;
    public final void rule__Login__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5998:1: ( ( ',' ) )
            // InternalLightweight.g:5999:1: ( ',' )
            {
            // InternalLightweight.g:5999:1: ( ',' )
            // InternalLightweight.g:6000:2: ','
            {
             before(grammarAccess.getLoginAccess().getCommaKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__7__Impl"


    // $ANTLR start "rule__Login__Group__8"
    // InternalLightweight.g:6009:1: rule__Login__Group__8 : rule__Login__Group__8__Impl rule__Login__Group__9 ;
    public final void rule__Login__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6013:1: ( rule__Login__Group__8__Impl rule__Login__Group__9 )
            // InternalLightweight.g:6014:2: rule__Login__Group__8__Impl rule__Login__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Login__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__8"


    // $ANTLR start "rule__Login__Group__8__Impl"
    // InternalLightweight.g:6021:1: rule__Login__Group__8__Impl : ( 'persistedSession' ) ;
    public final void rule__Login__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6025:1: ( ( 'persistedSession' ) )
            // InternalLightweight.g:6026:1: ( 'persistedSession' )
            {
            // InternalLightweight.g:6026:1: ( 'persistedSession' )
            // InternalLightweight.g:6027:2: 'persistedSession'
            {
             before(grammarAccess.getLoginAccess().getPersistedSessionKeyword_8()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getPersistedSessionKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__8__Impl"


    // $ANTLR start "rule__Login__Group__9"
    // InternalLightweight.g:6036:1: rule__Login__Group__9 : rule__Login__Group__9__Impl rule__Login__Group__10 ;
    public final void rule__Login__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6040:1: ( rule__Login__Group__9__Impl rule__Login__Group__10 )
            // InternalLightweight.g:6041:2: rule__Login__Group__9__Impl rule__Login__Group__10
            {
            pushFollow(FOLLOW_23);
            rule__Login__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__9"


    // $ANTLR start "rule__Login__Group__9__Impl"
    // InternalLightweight.g:6048:1: rule__Login__Group__9__Impl : ( ':' ) ;
    public final void rule__Login__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6052:1: ( ( ':' ) )
            // InternalLightweight.g:6053:1: ( ':' )
            {
            // InternalLightweight.g:6053:1: ( ':' )
            // InternalLightweight.g:6054:2: ':'
            {
             before(grammarAccess.getLoginAccess().getColonKeyword_9()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__9__Impl"


    // $ANTLR start "rule__Login__Group__10"
    // InternalLightweight.g:6063:1: rule__Login__Group__10 : rule__Login__Group__10__Impl rule__Login__Group__11 ;
    public final void rule__Login__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6067:1: ( rule__Login__Group__10__Impl rule__Login__Group__11 )
            // InternalLightweight.g:6068:2: rule__Login__Group__10__Impl rule__Login__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Login__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__10"


    // $ANTLR start "rule__Login__Group__10__Impl"
    // InternalLightweight.g:6075:1: rule__Login__Group__10__Impl : ( ( rule__Login__SessionAssignment_10 ) ) ;
    public final void rule__Login__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6079:1: ( ( ( rule__Login__SessionAssignment_10 ) ) )
            // InternalLightweight.g:6080:1: ( ( rule__Login__SessionAssignment_10 ) )
            {
            // InternalLightweight.g:6080:1: ( ( rule__Login__SessionAssignment_10 ) )
            // InternalLightweight.g:6081:2: ( rule__Login__SessionAssignment_10 )
            {
             before(grammarAccess.getLoginAccess().getSessionAssignment_10()); 
            // InternalLightweight.g:6082:2: ( rule__Login__SessionAssignment_10 )
            // InternalLightweight.g:6082:3: rule__Login__SessionAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Login__SessionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getLoginAccess().getSessionAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__10__Impl"


    // $ANTLR start "rule__Login__Group__11"
    // InternalLightweight.g:6090:1: rule__Login__Group__11 : rule__Login__Group__11__Impl rule__Login__Group__12 ;
    public final void rule__Login__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6094:1: ( rule__Login__Group__11__Impl rule__Login__Group__12 )
            // InternalLightweight.g:6095:2: rule__Login__Group__11__Impl rule__Login__Group__12
            {
            pushFollow(FOLLOW_52);
            rule__Login__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__11"


    // $ANTLR start "rule__Login__Group__11__Impl"
    // InternalLightweight.g:6102:1: rule__Login__Group__11__Impl : ( ',' ) ;
    public final void rule__Login__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6106:1: ( ( ',' ) )
            // InternalLightweight.g:6107:1: ( ',' )
            {
            // InternalLightweight.g:6107:1: ( ',' )
            // InternalLightweight.g:6108:2: ','
            {
             before(grammarAccess.getLoginAccess().getCommaKeyword_11()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getCommaKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__11__Impl"


    // $ANTLR start "rule__Login__Group__12"
    // InternalLightweight.g:6117:1: rule__Login__Group__12 : rule__Login__Group__12__Impl rule__Login__Group__13 ;
    public final void rule__Login__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6121:1: ( rule__Login__Group__12__Impl rule__Login__Group__13 )
            // InternalLightweight.g:6122:2: rule__Login__Group__12__Impl rule__Login__Group__13
            {
            pushFollow(FOLLOW_3);
            rule__Login__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__12"


    // $ANTLR start "rule__Login__Group__12__Impl"
    // InternalLightweight.g:6129:1: rule__Login__Group__12__Impl : ( 'authentication' ) ;
    public final void rule__Login__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6133:1: ( ( 'authentication' ) )
            // InternalLightweight.g:6134:1: ( 'authentication' )
            {
            // InternalLightweight.g:6134:1: ( 'authentication' )
            // InternalLightweight.g:6135:2: 'authentication'
            {
             before(grammarAccess.getLoginAccess().getAuthenticationKeyword_12()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getAuthenticationKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__12__Impl"


    // $ANTLR start "rule__Login__Group__13"
    // InternalLightweight.g:6144:1: rule__Login__Group__13 : rule__Login__Group__13__Impl rule__Login__Group__14 ;
    public final void rule__Login__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6148:1: ( rule__Login__Group__13__Impl rule__Login__Group__14 )
            // InternalLightweight.g:6149:2: rule__Login__Group__13__Impl rule__Login__Group__14
            {
            pushFollow(FOLLOW_19);
            rule__Login__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__13"


    // $ANTLR start "rule__Login__Group__13__Impl"
    // InternalLightweight.g:6156:1: rule__Login__Group__13__Impl : ( ':' ) ;
    public final void rule__Login__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6160:1: ( ( ':' ) )
            // InternalLightweight.g:6161:1: ( ':' )
            {
            // InternalLightweight.g:6161:1: ( ':' )
            // InternalLightweight.g:6162:2: ':'
            {
             before(grammarAccess.getLoginAccess().getColonKeyword_13()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getColonKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__13__Impl"


    // $ANTLR start "rule__Login__Group__14"
    // InternalLightweight.g:6171:1: rule__Login__Group__14 : rule__Login__Group__14__Impl rule__Login__Group__15 ;
    public final void rule__Login__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6175:1: ( rule__Login__Group__14__Impl rule__Login__Group__15 )
            // InternalLightweight.g:6176:2: rule__Login__Group__14__Impl rule__Login__Group__15
            {
            pushFollow(FOLLOW_53);
            rule__Login__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__14"


    // $ANTLR start "rule__Login__Group__14__Impl"
    // InternalLightweight.g:6183:1: rule__Login__Group__14__Impl : ( ( rule__Login__AuthMethodsAssignment_14 ) ) ;
    public final void rule__Login__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6187:1: ( ( ( rule__Login__AuthMethodsAssignment_14 ) ) )
            // InternalLightweight.g:6188:1: ( ( rule__Login__AuthMethodsAssignment_14 ) )
            {
            // InternalLightweight.g:6188:1: ( ( rule__Login__AuthMethodsAssignment_14 ) )
            // InternalLightweight.g:6189:2: ( rule__Login__AuthMethodsAssignment_14 )
            {
             before(grammarAccess.getLoginAccess().getAuthMethodsAssignment_14()); 
            // InternalLightweight.g:6190:2: ( rule__Login__AuthMethodsAssignment_14 )
            // InternalLightweight.g:6190:3: rule__Login__AuthMethodsAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Login__AuthMethodsAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getLoginAccess().getAuthMethodsAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__14__Impl"


    // $ANTLR start "rule__Login__Group__15"
    // InternalLightweight.g:6198:1: rule__Login__Group__15 : rule__Login__Group__15__Impl rule__Login__Group__16 ;
    public final void rule__Login__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6202:1: ( rule__Login__Group__15__Impl rule__Login__Group__16 )
            // InternalLightweight.g:6203:2: rule__Login__Group__15__Impl rule__Login__Group__16
            {
            pushFollow(FOLLOW_53);
            rule__Login__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__15"


    // $ANTLR start "rule__Login__Group__15__Impl"
    // InternalLightweight.g:6210:1: rule__Login__Group__15__Impl : ( ( rule__Login__Group_15__0 )* ) ;
    public final void rule__Login__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6214:1: ( ( ( rule__Login__Group_15__0 )* ) )
            // InternalLightweight.g:6215:1: ( ( rule__Login__Group_15__0 )* )
            {
            // InternalLightweight.g:6215:1: ( ( rule__Login__Group_15__0 )* )
            // InternalLightweight.g:6216:2: ( rule__Login__Group_15__0 )*
            {
             before(grammarAccess.getLoginAccess().getGroup_15()); 
            // InternalLightweight.g:6217:2: ( rule__Login__Group_15__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==59) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalLightweight.g:6217:3: rule__Login__Group_15__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__Login__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getLoginAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__15__Impl"


    // $ANTLR start "rule__Login__Group__16"
    // InternalLightweight.g:6225:1: rule__Login__Group__16 : rule__Login__Group__16__Impl ;
    public final void rule__Login__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6229:1: ( rule__Login__Group__16__Impl )
            // InternalLightweight.g:6230:2: rule__Login__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Login__Group__16__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__16"


    // $ANTLR start "rule__Login__Group__16__Impl"
    // InternalLightweight.g:6236:1: rule__Login__Group__16__Impl : ( '}' ) ;
    public final void rule__Login__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6240:1: ( ( '}' ) )
            // InternalLightweight.g:6241:1: ( '}' )
            {
            // InternalLightweight.g:6241:1: ( '}' )
            // InternalLightweight.g:6242:2: '}'
            {
             before(grammarAccess.getLoginAccess().getRightCurlyBracketKeyword_16()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group__16__Impl"


    // $ANTLR start "rule__Login__Group_15__0"
    // InternalLightweight.g:6252:1: rule__Login__Group_15__0 : rule__Login__Group_15__0__Impl rule__Login__Group_15__1 ;
    public final void rule__Login__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6256:1: ( rule__Login__Group_15__0__Impl rule__Login__Group_15__1 )
            // InternalLightweight.g:6257:2: rule__Login__Group_15__0__Impl rule__Login__Group_15__1
            {
            pushFollow(FOLLOW_19);
            rule__Login__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Login__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_15__0"


    // $ANTLR start "rule__Login__Group_15__0__Impl"
    // InternalLightweight.g:6264:1: rule__Login__Group_15__0__Impl : ( '||' ) ;
    public final void rule__Login__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6268:1: ( ( '||' ) )
            // InternalLightweight.g:6269:1: ( '||' )
            {
            // InternalLightweight.g:6269:1: ( '||' )
            // InternalLightweight.g:6270:2: '||'
            {
             before(grammarAccess.getLoginAccess().getVerticalLineVerticalLineKeyword_15_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getVerticalLineVerticalLineKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_15__0__Impl"


    // $ANTLR start "rule__Login__Group_15__1"
    // InternalLightweight.g:6279:1: rule__Login__Group_15__1 : rule__Login__Group_15__1__Impl ;
    public final void rule__Login__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6283:1: ( rule__Login__Group_15__1__Impl )
            // InternalLightweight.g:6284:2: rule__Login__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Login__Group_15__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_15__1"


    // $ANTLR start "rule__Login__Group_15__1__Impl"
    // InternalLightweight.g:6290:1: rule__Login__Group_15__1__Impl : ( ( rule__Login__AuthMethodsAssignment_15_1 ) ) ;
    public final void rule__Login__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6294:1: ( ( ( rule__Login__AuthMethodsAssignment_15_1 ) ) )
            // InternalLightweight.g:6295:1: ( ( rule__Login__AuthMethodsAssignment_15_1 ) )
            {
            // InternalLightweight.g:6295:1: ( ( rule__Login__AuthMethodsAssignment_15_1 ) )
            // InternalLightweight.g:6296:2: ( rule__Login__AuthMethodsAssignment_15_1 )
            {
             before(grammarAccess.getLoginAccess().getAuthMethodsAssignment_15_1()); 
            // InternalLightweight.g:6297:2: ( rule__Login__AuthMethodsAssignment_15_1 )
            // InternalLightweight.g:6297:3: rule__Login__AuthMethodsAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__Login__AuthMethodsAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getLoginAccess().getAuthMethodsAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__Group_15__1__Impl"


    // $ANTLR start "rule__Reset__Group__0"
    // InternalLightweight.g:6306:1: rule__Reset__Group__0 : rule__Reset__Group__0__Impl rule__Reset__Group__1 ;
    public final void rule__Reset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6310:1: ( rule__Reset__Group__0__Impl rule__Reset__Group__1 )
            // InternalLightweight.g:6311:2: rule__Reset__Group__0__Impl rule__Reset__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Reset__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__0"


    // $ANTLR start "rule__Reset__Group__0__Impl"
    // InternalLightweight.g:6318:1: rule__Reset__Group__0__Impl : ( () ) ;
    public final void rule__Reset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6322:1: ( ( () ) )
            // InternalLightweight.g:6323:1: ( () )
            {
            // InternalLightweight.g:6323:1: ( () )
            // InternalLightweight.g:6324:2: ()
            {
             before(grammarAccess.getResetAccess().getResetAction_0()); 
            // InternalLightweight.g:6325:2: ()
            // InternalLightweight.g:6325:3: 
            {
            }

             after(grammarAccess.getResetAccess().getResetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__0__Impl"


    // $ANTLR start "rule__Reset__Group__1"
    // InternalLightweight.g:6333:1: rule__Reset__Group__1 : rule__Reset__Group__1__Impl rule__Reset__Group__2 ;
    public final void rule__Reset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6337:1: ( rule__Reset__Group__1__Impl rule__Reset__Group__2 )
            // InternalLightweight.g:6338:2: rule__Reset__Group__1__Impl rule__Reset__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Reset__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__1"


    // $ANTLR start "rule__Reset__Group__1__Impl"
    // InternalLightweight.g:6345:1: rule__Reset__Group__1__Impl : ( ( rule__Reset__TypeAssignment_1 ) ) ;
    public final void rule__Reset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6349:1: ( ( ( rule__Reset__TypeAssignment_1 ) ) )
            // InternalLightweight.g:6350:1: ( ( rule__Reset__TypeAssignment_1 ) )
            {
            // InternalLightweight.g:6350:1: ( ( rule__Reset__TypeAssignment_1 ) )
            // InternalLightweight.g:6351:2: ( rule__Reset__TypeAssignment_1 )
            {
             before(grammarAccess.getResetAccess().getTypeAssignment_1()); 
            // InternalLightweight.g:6352:2: ( rule__Reset__TypeAssignment_1 )
            // InternalLightweight.g:6352:3: rule__Reset__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reset__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getResetAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__1__Impl"


    // $ANTLR start "rule__Reset__Group__2"
    // InternalLightweight.g:6360:1: rule__Reset__Group__2 : rule__Reset__Group__2__Impl rule__Reset__Group__3 ;
    public final void rule__Reset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6364:1: ( rule__Reset__Group__2__Impl rule__Reset__Group__3 )
            // InternalLightweight.g:6365:2: rule__Reset__Group__2__Impl rule__Reset__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Reset__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__2"


    // $ANTLR start "rule__Reset__Group__2__Impl"
    // InternalLightweight.g:6372:1: rule__Reset__Group__2__Impl : ( ':' ) ;
    public final void rule__Reset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6376:1: ( ( ':' ) )
            // InternalLightweight.g:6377:1: ( ':' )
            {
            // InternalLightweight.g:6377:1: ( ':' )
            // InternalLightweight.g:6378:2: ':'
            {
             before(grammarAccess.getResetAccess().getColonKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getColonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__2__Impl"


    // $ANTLR start "rule__Reset__Group__3"
    // InternalLightweight.g:6387:1: rule__Reset__Group__3 : rule__Reset__Group__3__Impl rule__Reset__Group__4 ;
    public final void rule__Reset__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6391:1: ( rule__Reset__Group__3__Impl rule__Reset__Group__4 )
            // InternalLightweight.g:6392:2: rule__Reset__Group__3__Impl rule__Reset__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Reset__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__3"


    // $ANTLR start "rule__Reset__Group__3__Impl"
    // InternalLightweight.g:6399:1: rule__Reset__Group__3__Impl : ( '{' ) ;
    public final void rule__Reset__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6403:1: ( ( '{' ) )
            // InternalLightweight.g:6404:1: ( '{' )
            {
            // InternalLightweight.g:6404:1: ( '{' )
            // InternalLightweight.g:6405:2: '{'
            {
             before(grammarAccess.getResetAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__3__Impl"


    // $ANTLR start "rule__Reset__Group__4"
    // InternalLightweight.g:6414:1: rule__Reset__Group__4 : rule__Reset__Group__4__Impl rule__Reset__Group__5 ;
    public final void rule__Reset__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6418:1: ( rule__Reset__Group__4__Impl rule__Reset__Group__5 )
            // InternalLightweight.g:6419:2: rule__Reset__Group__4__Impl rule__Reset__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__Reset__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__4"


    // $ANTLR start "rule__Reset__Group__4__Impl"
    // InternalLightweight.g:6426:1: rule__Reset__Group__4__Impl : ( 'name' ) ;
    public final void rule__Reset__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6430:1: ( ( 'name' ) )
            // InternalLightweight.g:6431:1: ( 'name' )
            {
            // InternalLightweight.g:6431:1: ( 'name' )
            // InternalLightweight.g:6432:2: 'name'
            {
             before(grammarAccess.getResetAccess().getNameKeyword_4()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getNameKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__4__Impl"


    // $ANTLR start "rule__Reset__Group__5"
    // InternalLightweight.g:6441:1: rule__Reset__Group__5 : rule__Reset__Group__5__Impl rule__Reset__Group__6 ;
    public final void rule__Reset__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6445:1: ( rule__Reset__Group__5__Impl rule__Reset__Group__6 )
            // InternalLightweight.g:6446:2: rule__Reset__Group__5__Impl rule__Reset__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Reset__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__5"


    // $ANTLR start "rule__Reset__Group__5__Impl"
    // InternalLightweight.g:6453:1: rule__Reset__Group__5__Impl : ( ':' ) ;
    public final void rule__Reset__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6457:1: ( ( ':' ) )
            // InternalLightweight.g:6458:1: ( ':' )
            {
            // InternalLightweight.g:6458:1: ( ':' )
            // InternalLightweight.g:6459:2: ':'
            {
             before(grammarAccess.getResetAccess().getColonKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__5__Impl"


    // $ANTLR start "rule__Reset__Group__6"
    // InternalLightweight.g:6468:1: rule__Reset__Group__6 : rule__Reset__Group__6__Impl rule__Reset__Group__7 ;
    public final void rule__Reset__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6472:1: ( rule__Reset__Group__6__Impl rule__Reset__Group__7 )
            // InternalLightweight.g:6473:2: rule__Reset__Group__6__Impl rule__Reset__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Reset__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__6"


    // $ANTLR start "rule__Reset__Group__6__Impl"
    // InternalLightweight.g:6480:1: rule__Reset__Group__6__Impl : ( ( rule__Reset__NameAssignment_6 ) ) ;
    public final void rule__Reset__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6484:1: ( ( ( rule__Reset__NameAssignment_6 ) ) )
            // InternalLightweight.g:6485:1: ( ( rule__Reset__NameAssignment_6 ) )
            {
            // InternalLightweight.g:6485:1: ( ( rule__Reset__NameAssignment_6 ) )
            // InternalLightweight.g:6486:2: ( rule__Reset__NameAssignment_6 )
            {
             before(grammarAccess.getResetAccess().getNameAssignment_6()); 
            // InternalLightweight.g:6487:2: ( rule__Reset__NameAssignment_6 )
            // InternalLightweight.g:6487:3: rule__Reset__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Reset__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getResetAccess().getNameAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__6__Impl"


    // $ANTLR start "rule__Reset__Group__7"
    // InternalLightweight.g:6495:1: rule__Reset__Group__7 : rule__Reset__Group__7__Impl rule__Reset__Group__8 ;
    public final void rule__Reset__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6499:1: ( rule__Reset__Group__7__Impl rule__Reset__Group__8 )
            // InternalLightweight.g:6500:2: rule__Reset__Group__7__Impl rule__Reset__Group__8
            {
            pushFollow(FOLLOW_26);
            rule__Reset__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__7"


    // $ANTLR start "rule__Reset__Group__7__Impl"
    // InternalLightweight.g:6507:1: rule__Reset__Group__7__Impl : ( ',' ) ;
    public final void rule__Reset__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6511:1: ( ( ',' ) )
            // InternalLightweight.g:6512:1: ( ',' )
            {
            // InternalLightweight.g:6512:1: ( ',' )
            // InternalLightweight.g:6513:2: ','
            {
             before(grammarAccess.getResetAccess().getCommaKeyword_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getCommaKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__7__Impl"


    // $ANTLR start "rule__Reset__Group__8"
    // InternalLightweight.g:6522:1: rule__Reset__Group__8 : rule__Reset__Group__8__Impl rule__Reset__Group__9 ;
    public final void rule__Reset__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6526:1: ( rule__Reset__Group__8__Impl rule__Reset__Group__9 )
            // InternalLightweight.g:6527:2: rule__Reset__Group__8__Impl rule__Reset__Group__9
            {
            pushFollow(FOLLOW_3);
            rule__Reset__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__8"


    // $ANTLR start "rule__Reset__Group__8__Impl"
    // InternalLightweight.g:6534:1: rule__Reset__Group__8__Impl : ( 'authenticator' ) ;
    public final void rule__Reset__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6538:1: ( ( 'authenticator' ) )
            // InternalLightweight.g:6539:1: ( 'authenticator' )
            {
            // InternalLightweight.g:6539:1: ( 'authenticator' )
            // InternalLightweight.g:6540:2: 'authenticator'
            {
             before(grammarAccess.getResetAccess().getAuthenticatorKeyword_8()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getAuthenticatorKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__8__Impl"


    // $ANTLR start "rule__Reset__Group__9"
    // InternalLightweight.g:6549:1: rule__Reset__Group__9 : rule__Reset__Group__9__Impl rule__Reset__Group__10 ;
    public final void rule__Reset__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6553:1: ( rule__Reset__Group__9__Impl rule__Reset__Group__10 )
            // InternalLightweight.g:6554:2: rule__Reset__Group__9__Impl rule__Reset__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__Reset__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__9"


    // $ANTLR start "rule__Reset__Group__9__Impl"
    // InternalLightweight.g:6561:1: rule__Reset__Group__9__Impl : ( ':' ) ;
    public final void rule__Reset__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6565:1: ( ( ':' ) )
            // InternalLightweight.g:6566:1: ( ':' )
            {
            // InternalLightweight.g:6566:1: ( ':' )
            // InternalLightweight.g:6567:2: ':'
            {
             before(grammarAccess.getResetAccess().getColonKeyword_9()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getColonKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__9__Impl"


    // $ANTLR start "rule__Reset__Group__10"
    // InternalLightweight.g:6576:1: rule__Reset__Group__10 : rule__Reset__Group__10__Impl rule__Reset__Group__11 ;
    public final void rule__Reset__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6580:1: ( rule__Reset__Group__10__Impl rule__Reset__Group__11 )
            // InternalLightweight.g:6581:2: rule__Reset__Group__10__Impl rule__Reset__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Reset__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__10"


    // $ANTLR start "rule__Reset__Group__10__Impl"
    // InternalLightweight.g:6588:1: rule__Reset__Group__10__Impl : ( ( rule__Reset__AuthenticatorAssignment_10 ) ) ;
    public final void rule__Reset__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6592:1: ( ( ( rule__Reset__AuthenticatorAssignment_10 ) ) )
            // InternalLightweight.g:6593:1: ( ( rule__Reset__AuthenticatorAssignment_10 ) )
            {
            // InternalLightweight.g:6593:1: ( ( rule__Reset__AuthenticatorAssignment_10 ) )
            // InternalLightweight.g:6594:2: ( rule__Reset__AuthenticatorAssignment_10 )
            {
             before(grammarAccess.getResetAccess().getAuthenticatorAssignment_10()); 
            // InternalLightweight.g:6595:2: ( rule__Reset__AuthenticatorAssignment_10 )
            // InternalLightweight.g:6595:3: rule__Reset__AuthenticatorAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Reset__AuthenticatorAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getResetAccess().getAuthenticatorAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__10__Impl"


    // $ANTLR start "rule__Reset__Group__11"
    // InternalLightweight.g:6603:1: rule__Reset__Group__11 : rule__Reset__Group__11__Impl rule__Reset__Group__12 ;
    public final void rule__Reset__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6607:1: ( rule__Reset__Group__11__Impl rule__Reset__Group__12 )
            // InternalLightweight.g:6608:2: rule__Reset__Group__11__Impl rule__Reset__Group__12
            {
            pushFollow(FOLLOW_54);
            rule__Reset__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__11"


    // $ANTLR start "rule__Reset__Group__11__Impl"
    // InternalLightweight.g:6615:1: rule__Reset__Group__11__Impl : ( ',' ) ;
    public final void rule__Reset__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6619:1: ( ( ',' ) )
            // InternalLightweight.g:6620:1: ( ',' )
            {
            // InternalLightweight.g:6620:1: ( ',' )
            // InternalLightweight.g:6621:2: ','
            {
             before(grammarAccess.getResetAccess().getCommaKeyword_11()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getCommaKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__11__Impl"


    // $ANTLR start "rule__Reset__Group__12"
    // InternalLightweight.g:6630:1: rule__Reset__Group__12 : rule__Reset__Group__12__Impl rule__Reset__Group__13 ;
    public final void rule__Reset__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6634:1: ( rule__Reset__Group__12__Impl rule__Reset__Group__13 )
            // InternalLightweight.g:6635:2: rule__Reset__Group__12__Impl rule__Reset__Group__13
            {
            pushFollow(FOLLOW_54);
            rule__Reset__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__12"


    // $ANTLR start "rule__Reset__Group__12__Impl"
    // InternalLightweight.g:6642:1: rule__Reset__Group__12__Impl : ( ( rule__Reset__Group_12__0 )? ) ;
    public final void rule__Reset__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6646:1: ( ( ( rule__Reset__Group_12__0 )? ) )
            // InternalLightweight.g:6647:1: ( ( rule__Reset__Group_12__0 )? )
            {
            // InternalLightweight.g:6647:1: ( ( rule__Reset__Group_12__0 )? )
            // InternalLightweight.g:6648:2: ( rule__Reset__Group_12__0 )?
            {
             before(grammarAccess.getResetAccess().getGroup_12()); 
            // InternalLightweight.g:6649:2: ( rule__Reset__Group_12__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==58) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalLightweight.g:6649:3: rule__Reset__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reset__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResetAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__12__Impl"


    // $ANTLR start "rule__Reset__Group__13"
    // InternalLightweight.g:6657:1: rule__Reset__Group__13 : rule__Reset__Group__13__Impl ;
    public final void rule__Reset__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6661:1: ( rule__Reset__Group__13__Impl )
            // InternalLightweight.g:6662:2: rule__Reset__Group__13__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reset__Group__13__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__13"


    // $ANTLR start "rule__Reset__Group__13__Impl"
    // InternalLightweight.g:6668:1: rule__Reset__Group__13__Impl : ( '}' ) ;
    public final void rule__Reset__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6672:1: ( ( '}' ) )
            // InternalLightweight.g:6673:1: ( '}' )
            {
            // InternalLightweight.g:6673:1: ( '}' )
            // InternalLightweight.g:6674:2: '}'
            {
             before(grammarAccess.getResetAccess().getRightCurlyBracketKeyword_13()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__13__Impl"


    // $ANTLR start "rule__Reset__Group_12__0"
    // InternalLightweight.g:6684:1: rule__Reset__Group_12__0 : rule__Reset__Group_12__0__Impl rule__Reset__Group_12__1 ;
    public final void rule__Reset__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6688:1: ( rule__Reset__Group_12__0__Impl rule__Reset__Group_12__1 )
            // InternalLightweight.g:6689:2: rule__Reset__Group_12__0__Impl rule__Reset__Group_12__1
            {
            pushFollow(FOLLOW_3);
            rule__Reset__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group_12__0"


    // $ANTLR start "rule__Reset__Group_12__0__Impl"
    // InternalLightweight.g:6696:1: rule__Reset__Group_12__0__Impl : ( 'authentication' ) ;
    public final void rule__Reset__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6700:1: ( ( 'authentication' ) )
            // InternalLightweight.g:6701:1: ( 'authentication' )
            {
            // InternalLightweight.g:6701:1: ( 'authentication' )
            // InternalLightweight.g:6702:2: 'authentication'
            {
             before(grammarAccess.getResetAccess().getAuthenticationKeyword_12_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getAuthenticationKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group_12__0__Impl"


    // $ANTLR start "rule__Reset__Group_12__1"
    // InternalLightweight.g:6711:1: rule__Reset__Group_12__1 : rule__Reset__Group_12__1__Impl rule__Reset__Group_12__2 ;
    public final void rule__Reset__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6715:1: ( rule__Reset__Group_12__1__Impl rule__Reset__Group_12__2 )
            // InternalLightweight.g:6716:2: rule__Reset__Group_12__1__Impl rule__Reset__Group_12__2
            {
            pushFollow(FOLLOW_19);
            rule__Reset__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group_12__1"


    // $ANTLR start "rule__Reset__Group_12__1__Impl"
    // InternalLightweight.g:6723:1: rule__Reset__Group_12__1__Impl : ( ':' ) ;
    public final void rule__Reset__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6727:1: ( ( ':' ) )
            // InternalLightweight.g:6728:1: ( ':' )
            {
            // InternalLightweight.g:6728:1: ( ':' )
            // InternalLightweight.g:6729:2: ':'
            {
             before(grammarAccess.getResetAccess().getColonKeyword_12_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getColonKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group_12__1__Impl"


    // $ANTLR start "rule__Reset__Group_12__2"
    // InternalLightweight.g:6738:1: rule__Reset__Group_12__2 : rule__Reset__Group_12__2__Impl rule__Reset__Group_12__3 ;
    public final void rule__Reset__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6742:1: ( rule__Reset__Group_12__2__Impl rule__Reset__Group_12__3 )
            // InternalLightweight.g:6743:2: rule__Reset__Group_12__2__Impl rule__Reset__Group_12__3
            {
            pushFollow(FOLLOW_47);
            rule__Reset__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group_12__2"


    // $ANTLR start "rule__Reset__Group_12__2__Impl"
    // InternalLightweight.g:6750:1: rule__Reset__Group_12__2__Impl : ( ( rule__Reset__AuthMethodsAssignment_12_2 ) ) ;
    public final void rule__Reset__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6754:1: ( ( ( rule__Reset__AuthMethodsAssignment_12_2 ) ) )
            // InternalLightweight.g:6755:1: ( ( rule__Reset__AuthMethodsAssignment_12_2 ) )
            {
            // InternalLightweight.g:6755:1: ( ( rule__Reset__AuthMethodsAssignment_12_2 ) )
            // InternalLightweight.g:6756:2: ( rule__Reset__AuthMethodsAssignment_12_2 )
            {
             before(grammarAccess.getResetAccess().getAuthMethodsAssignment_12_2()); 
            // InternalLightweight.g:6757:2: ( rule__Reset__AuthMethodsAssignment_12_2 )
            // InternalLightweight.g:6757:3: rule__Reset__AuthMethodsAssignment_12_2
            {
            pushFollow(FOLLOW_2);
            rule__Reset__AuthMethodsAssignment_12_2();

            state._fsp--;


            }

             after(grammarAccess.getResetAccess().getAuthMethodsAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group_12__2__Impl"


    // $ANTLR start "rule__Reset__Group_12__3"
    // InternalLightweight.g:6765:1: rule__Reset__Group_12__3 : rule__Reset__Group_12__3__Impl ;
    public final void rule__Reset__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6769:1: ( rule__Reset__Group_12__3__Impl )
            // InternalLightweight.g:6770:2: rule__Reset__Group_12__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reset__Group_12__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group_12__3"


    // $ANTLR start "rule__Reset__Group_12__3__Impl"
    // InternalLightweight.g:6776:1: rule__Reset__Group_12__3__Impl : ( ( rule__Reset__Group_12_3__0 )* ) ;
    public final void rule__Reset__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6780:1: ( ( ( rule__Reset__Group_12_3__0 )* ) )
            // InternalLightweight.g:6781:1: ( ( rule__Reset__Group_12_3__0 )* )
            {
            // InternalLightweight.g:6781:1: ( ( rule__Reset__Group_12_3__0 )* )
            // InternalLightweight.g:6782:2: ( rule__Reset__Group_12_3__0 )*
            {
             before(grammarAccess.getResetAccess().getGroup_12_3()); 
            // InternalLightweight.g:6783:2: ( rule__Reset__Group_12_3__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==59) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalLightweight.g:6783:3: rule__Reset__Group_12_3__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__Reset__Group_12_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getResetAccess().getGroup_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group_12__3__Impl"


    // $ANTLR start "rule__Reset__Group_12_3__0"
    // InternalLightweight.g:6792:1: rule__Reset__Group_12_3__0 : rule__Reset__Group_12_3__0__Impl rule__Reset__Group_12_3__1 ;
    public final void rule__Reset__Group_12_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6796:1: ( rule__Reset__Group_12_3__0__Impl rule__Reset__Group_12_3__1 )
            // InternalLightweight.g:6797:2: rule__Reset__Group_12_3__0__Impl rule__Reset__Group_12_3__1
            {
            pushFollow(FOLLOW_19);
            rule__Reset__Group_12_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group_12_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group_12_3__0"


    // $ANTLR start "rule__Reset__Group_12_3__0__Impl"
    // InternalLightweight.g:6804:1: rule__Reset__Group_12_3__0__Impl : ( '||' ) ;
    public final void rule__Reset__Group_12_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6808:1: ( ( '||' ) )
            // InternalLightweight.g:6809:1: ( '||' )
            {
            // InternalLightweight.g:6809:1: ( '||' )
            // InternalLightweight.g:6810:2: '||'
            {
             before(grammarAccess.getResetAccess().getVerticalLineVerticalLineKeyword_12_3_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getVerticalLineVerticalLineKeyword_12_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group_12_3__0__Impl"


    // $ANTLR start "rule__Reset__Group_12_3__1"
    // InternalLightweight.g:6819:1: rule__Reset__Group_12_3__1 : rule__Reset__Group_12_3__1__Impl ;
    public final void rule__Reset__Group_12_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6823:1: ( rule__Reset__Group_12_3__1__Impl )
            // InternalLightweight.g:6824:2: rule__Reset__Group_12_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reset__Group_12_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group_12_3__1"


    // $ANTLR start "rule__Reset__Group_12_3__1__Impl"
    // InternalLightweight.g:6830:1: rule__Reset__Group_12_3__1__Impl : ( ( rule__Reset__AuthMethodsAssignment_12_3_1 ) ) ;
    public final void rule__Reset__Group_12_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6834:1: ( ( ( rule__Reset__AuthMethodsAssignment_12_3_1 ) ) )
            // InternalLightweight.g:6835:1: ( ( rule__Reset__AuthMethodsAssignment_12_3_1 ) )
            {
            // InternalLightweight.g:6835:1: ( ( rule__Reset__AuthMethodsAssignment_12_3_1 ) )
            // InternalLightweight.g:6836:2: ( rule__Reset__AuthMethodsAssignment_12_3_1 )
            {
             before(grammarAccess.getResetAccess().getAuthMethodsAssignment_12_3_1()); 
            // InternalLightweight.g:6837:2: ( rule__Reset__AuthMethodsAssignment_12_3_1 )
            // InternalLightweight.g:6837:3: rule__Reset__AuthMethodsAssignment_12_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Reset__AuthMethodsAssignment_12_3_1();

            state._fsp--;


            }

             after(grammarAccess.getResetAccess().getAuthMethodsAssignment_12_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group_12_3__1__Impl"


    // $ANTLR start "rule__App__AuthenticatorsAssignment_6"
    // InternalLightweight.g:6846:1: rule__App__AuthenticatorsAssignment_6 : ( ruleAuthenticator ) ;
    public final void rule__App__AuthenticatorsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6850:1: ( ( ruleAuthenticator ) )
            // InternalLightweight.g:6851:2: ( ruleAuthenticator )
            {
            // InternalLightweight.g:6851:2: ( ruleAuthenticator )
            // InternalLightweight.g:6852:3: ruleAuthenticator
            {
             before(grammarAccess.getAppAccess().getAuthenticatorsAuthenticatorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAuthenticator();

            state._fsp--;

             after(grammarAccess.getAppAccess().getAuthenticatorsAuthenticatorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__AuthenticatorsAssignment_6"


    // $ANTLR start "rule__App__AuthenticatorsAssignment_7_1"
    // InternalLightweight.g:6861:1: rule__App__AuthenticatorsAssignment_7_1 : ( ruleAuthenticator ) ;
    public final void rule__App__AuthenticatorsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6865:1: ( ( ruleAuthenticator ) )
            // InternalLightweight.g:6866:2: ( ruleAuthenticator )
            {
            // InternalLightweight.g:6866:2: ( ruleAuthenticator )
            // InternalLightweight.g:6867:3: ruleAuthenticator
            {
             before(grammarAccess.getAppAccess().getAuthenticatorsAuthenticatorParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAuthenticator();

            state._fsp--;

             after(grammarAccess.getAppAccess().getAuthenticatorsAuthenticatorParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__AuthenticatorsAssignment_7_1"


    // $ANTLR start "rule__App__AuthMethodsAssignment_13"
    // InternalLightweight.g:6876:1: rule__App__AuthMethodsAssignment_13 : ( ruleAuthMethod ) ;
    public final void rule__App__AuthMethodsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6880:1: ( ( ruleAuthMethod ) )
            // InternalLightweight.g:6881:2: ( ruleAuthMethod )
            {
            // InternalLightweight.g:6881:2: ( ruleAuthMethod )
            // InternalLightweight.g:6882:3: ruleAuthMethod
            {
             before(grammarAccess.getAppAccess().getAuthMethodsAuthMethodParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleAuthMethod();

            state._fsp--;

             after(grammarAccess.getAppAccess().getAuthMethodsAuthMethodParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__AuthMethodsAssignment_13"


    // $ANTLR start "rule__App__AuthMethodsAssignment_14_1"
    // InternalLightweight.g:6891:1: rule__App__AuthMethodsAssignment_14_1 : ( ruleAuthMethod ) ;
    public final void rule__App__AuthMethodsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6895:1: ( ( ruleAuthMethod ) )
            // InternalLightweight.g:6896:2: ( ruleAuthMethod )
            {
            // InternalLightweight.g:6896:2: ( ruleAuthMethod )
            // InternalLightweight.g:6897:3: ruleAuthMethod
            {
             before(grammarAccess.getAppAccess().getAuthMethodsAuthMethodParserRuleCall_14_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAuthMethod();

            state._fsp--;

             after(grammarAccess.getAppAccess().getAuthMethodsAuthMethodParserRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__AuthMethodsAssignment_14_1"


    // $ANTLR start "rule__App__PhasesAssignment_20"
    // InternalLightweight.g:6906:1: rule__App__PhasesAssignment_20 : ( rulePhase ) ;
    public final void rule__App__PhasesAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6910:1: ( ( rulePhase ) )
            // InternalLightweight.g:6911:2: ( rulePhase )
            {
            // InternalLightweight.g:6911:2: ( rulePhase )
            // InternalLightweight.g:6912:3: rulePhase
            {
             before(grammarAccess.getAppAccess().getPhasesPhaseParserRuleCall_20_0()); 
            pushFollow(FOLLOW_2);
            rulePhase();

            state._fsp--;

             after(grammarAccess.getAppAccess().getPhasesPhaseParserRuleCall_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__PhasesAssignment_20"


    // $ANTLR start "rule__App__PhasesAssignment_21_1"
    // InternalLightweight.g:6921:1: rule__App__PhasesAssignment_21_1 : ( rulePhase ) ;
    public final void rule__App__PhasesAssignment_21_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6925:1: ( ( rulePhase ) )
            // InternalLightweight.g:6926:2: ( rulePhase )
            {
            // InternalLightweight.g:6926:2: ( rulePhase )
            // InternalLightweight.g:6927:3: rulePhase
            {
             before(grammarAccess.getAppAccess().getPhasesPhaseParserRuleCall_21_1_0()); 
            pushFollow(FOLLOW_2);
            rulePhase();

            state._fsp--;

             after(grammarAccess.getAppAccess().getPhasesPhaseParserRuleCall_21_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__App__PhasesAssignment_21_1"


    // $ANTLR start "rule__MFA__TypeAssignment_0"
    // InternalLightweight.g:6936:1: rule__MFA__TypeAssignment_0 : ( ( 'MFA' ) ) ;
    public final void rule__MFA__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6940:1: ( ( ( 'MFA' ) ) )
            // InternalLightweight.g:6941:2: ( ( 'MFA' ) )
            {
            // InternalLightweight.g:6941:2: ( ( 'MFA' ) )
            // InternalLightweight.g:6942:3: ( 'MFA' )
            {
             before(grammarAccess.getMFAAccess().getTypeMFAKeyword_0_0()); 
            // InternalLightweight.g:6943:3: ( 'MFA' )
            // InternalLightweight.g:6944:4: 'MFA'
            {
             before(grammarAccess.getMFAAccess().getTypeMFAKeyword_0_0()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getMFAAccess().getTypeMFAKeyword_0_0()); 

            }

             after(grammarAccess.getMFAAccess().getTypeMFAKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__TypeAssignment_0"


    // $ANTLR start "rule__MFA__NameAssignment_5"
    // InternalLightweight.g:6955:1: rule__MFA__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__MFA__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6959:1: ( ( ruleEString ) )
            // InternalLightweight.g:6960:2: ( ruleEString )
            {
            // InternalLightweight.g:6960:2: ( ruleEString )
            // InternalLightweight.g:6961:3: ruleEString
            {
             before(grammarAccess.getMFAAccess().getNameEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMFAAccess().getNameEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__NameAssignment_5"


    // $ANTLR start "rule__MFA__AuthenticatorsAssignment_9"
    // InternalLightweight.g:6970:1: rule__MFA__AuthenticatorsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__MFA__AuthenticatorsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6974:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:6975:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:6975:2: ( ( RULE_ID ) )
            // InternalLightweight.g:6976:3: ( RULE_ID )
            {
             before(grammarAccess.getMFAAccess().getAuthenticatorsAuthenticatorCrossReference_9_0()); 
            // InternalLightweight.g:6977:3: ( RULE_ID )
            // InternalLightweight.g:6978:4: RULE_ID
            {
             before(grammarAccess.getMFAAccess().getAuthenticatorsAuthenticatorIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMFAAccess().getAuthenticatorsAuthenticatorIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getMFAAccess().getAuthenticatorsAuthenticatorCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__AuthenticatorsAssignment_9"


    // $ANTLR start "rule__MFA__AuthenticatorsAssignment_11"
    // InternalLightweight.g:6989:1: rule__MFA__AuthenticatorsAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__MFA__AuthenticatorsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6993:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:6994:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:6994:2: ( ( RULE_ID ) )
            // InternalLightweight.g:6995:3: ( RULE_ID )
            {
             before(grammarAccess.getMFAAccess().getAuthenticatorsAuthenticatorCrossReference_11_0()); 
            // InternalLightweight.g:6996:3: ( RULE_ID )
            // InternalLightweight.g:6997:4: RULE_ID
            {
             before(grammarAccess.getMFAAccess().getAuthenticatorsAuthenticatorIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMFAAccess().getAuthenticatorsAuthenticatorIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getMFAAccess().getAuthenticatorsAuthenticatorCrossReference_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__AuthenticatorsAssignment_11"


    // $ANTLR start "rule__MFA__CorrelationAssignment_15"
    // InternalLightweight.g:7008:1: rule__MFA__CorrelationAssignment_15 : ( ruleEBoolean ) ;
    public final void rule__MFA__CorrelationAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7012:1: ( ( ruleEBoolean ) )
            // InternalLightweight.g:7013:2: ( ruleEBoolean )
            {
            // InternalLightweight.g:7013:2: ( ruleEBoolean )
            // InternalLightweight.g:7014:3: ruleEBoolean
            {
             before(grammarAccess.getMFAAccess().getCorrelationEBooleanParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getMFAAccess().getCorrelationEBooleanParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__CorrelationAssignment_15"


    // $ANTLR start "rule__MFA__ValidationAssignment_19"
    // InternalLightweight.g:7023:1: rule__MFA__ValidationAssignment_19 : ( ruleValidationType ) ;
    public final void rule__MFA__ValidationAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7027:1: ( ( ruleValidationType ) )
            // InternalLightweight.g:7028:2: ( ruleValidationType )
            {
            // InternalLightweight.g:7028:2: ( ruleValidationType )
            // InternalLightweight.g:7029:3: ruleValidationType
            {
             before(grammarAccess.getMFAAccess().getValidationValidationTypeEnumRuleCall_19_0()); 
            pushFollow(FOLLOW_2);
            ruleValidationType();

            state._fsp--;

             after(grammarAccess.getMFAAccess().getValidationValidationTypeEnumRuleCall_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MFA__ValidationAssignment_19"


    // $ANTLR start "rule__SFA__TypeAssignment_0"
    // InternalLightweight.g:7038:1: rule__SFA__TypeAssignment_0 : ( ( 'SFA' ) ) ;
    public final void rule__SFA__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7042:1: ( ( ( 'SFA' ) ) )
            // InternalLightweight.g:7043:2: ( ( 'SFA' ) )
            {
            // InternalLightweight.g:7043:2: ( ( 'SFA' ) )
            // InternalLightweight.g:7044:3: ( 'SFA' )
            {
             before(grammarAccess.getSFAAccess().getTypeSFAKeyword_0_0()); 
            // InternalLightweight.g:7045:3: ( 'SFA' )
            // InternalLightweight.g:7046:4: 'SFA'
            {
             before(grammarAccess.getSFAAccess().getTypeSFAKeyword_0_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getSFAAccess().getTypeSFAKeyword_0_0()); 

            }

             after(grammarAccess.getSFAAccess().getTypeSFAKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__TypeAssignment_0"


    // $ANTLR start "rule__SFA__NameAssignment_5"
    // InternalLightweight.g:7057:1: rule__SFA__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__SFA__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7061:1: ( ( ruleEString ) )
            // InternalLightweight.g:7062:2: ( ruleEString )
            {
            // InternalLightweight.g:7062:2: ( ruleEString )
            // InternalLightweight.g:7063:3: ruleEString
            {
             before(grammarAccess.getSFAAccess().getNameEStringParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSFAAccess().getNameEStringParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__NameAssignment_5"


    // $ANTLR start "rule__SFA__AuthenticatorsAssignment_9"
    // InternalLightweight.g:7072:1: rule__SFA__AuthenticatorsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__SFA__AuthenticatorsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7076:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:7077:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:7077:2: ( ( RULE_ID ) )
            // InternalLightweight.g:7078:3: ( RULE_ID )
            {
             before(grammarAccess.getSFAAccess().getAuthenticatorsAuthenticatorCrossReference_9_0()); 
            // InternalLightweight.g:7079:3: ( RULE_ID )
            // InternalLightweight.g:7080:4: RULE_ID
            {
             before(grammarAccess.getSFAAccess().getAuthenticatorsAuthenticatorIDTerminalRuleCall_9_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSFAAccess().getAuthenticatorsAuthenticatorIDTerminalRuleCall_9_0_1()); 

            }

             after(grammarAccess.getSFAAccess().getAuthenticatorsAuthenticatorCrossReference_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SFA__AuthenticatorsAssignment_9"


    // $ANTLR start "rule__Possession__TypeAssignment_1"
    // InternalLightweight.g:7091:1: rule__Possession__TypeAssignment_1 : ( ( 'Possession' ) ) ;
    public final void rule__Possession__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7095:1: ( ( ( 'Possession' ) ) )
            // InternalLightweight.g:7096:2: ( ( 'Possession' ) )
            {
            // InternalLightweight.g:7096:2: ( ( 'Possession' ) )
            // InternalLightweight.g:7097:3: ( 'Possession' )
            {
             before(grammarAccess.getPossessionAccess().getTypePossessionKeyword_1_0()); 
            // InternalLightweight.g:7098:3: ( 'Possession' )
            // InternalLightweight.g:7099:4: 'Possession'
            {
             before(grammarAccess.getPossessionAccess().getTypePossessionKeyword_1_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getPossessionAccess().getTypePossessionKeyword_1_0()); 

            }

             after(grammarAccess.getPossessionAccess().getTypePossessionKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__TypeAssignment_1"


    // $ANTLR start "rule__Possession__NameAssignment_6"
    // InternalLightweight.g:7110:1: rule__Possession__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Possession__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7114:1: ( ( ruleEString ) )
            // InternalLightweight.g:7115:2: ( ruleEString )
            {
            // InternalLightweight.g:7115:2: ( ruleEString )
            // InternalLightweight.g:7116:3: ruleEString
            {
             before(grammarAccess.getPossessionAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPossessionAccess().getNameEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__NameAssignment_6"


    // $ANTLR start "rule__Possession__ValueAssignment_10"
    // InternalLightweight.g:7125:1: rule__Possession__ValueAssignment_10 : ( rulePVALUE ) ;
    public final void rule__Possession__ValueAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7129:1: ( ( rulePVALUE ) )
            // InternalLightweight.g:7130:2: ( rulePVALUE )
            {
            // InternalLightweight.g:7130:2: ( rulePVALUE )
            // InternalLightweight.g:7131:3: rulePVALUE
            {
             before(grammarAccess.getPossessionAccess().getValuePVALUEEnumRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            rulePVALUE();

            state._fsp--;

             after(grammarAccess.getPossessionAccess().getValuePVALUEEnumRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Possession__ValueAssignment_10"


    // $ANTLR start "rule__Knowledge__TypeAssignment_1"
    // InternalLightweight.g:7140:1: rule__Knowledge__TypeAssignment_1 : ( ( 'Knowledge' ) ) ;
    public final void rule__Knowledge__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7144:1: ( ( ( 'Knowledge' ) ) )
            // InternalLightweight.g:7145:2: ( ( 'Knowledge' ) )
            {
            // InternalLightweight.g:7145:2: ( ( 'Knowledge' ) )
            // InternalLightweight.g:7146:3: ( 'Knowledge' )
            {
             before(grammarAccess.getKnowledgeAccess().getTypeKnowledgeKeyword_1_0()); 
            // InternalLightweight.g:7147:3: ( 'Knowledge' )
            // InternalLightweight.g:7148:4: 'Knowledge'
            {
             before(grammarAccess.getKnowledgeAccess().getTypeKnowledgeKeyword_1_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getKnowledgeAccess().getTypeKnowledgeKeyword_1_0()); 

            }

             after(grammarAccess.getKnowledgeAccess().getTypeKnowledgeKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__TypeAssignment_1"


    // $ANTLR start "rule__Knowledge__NameAssignment_6"
    // InternalLightweight.g:7159:1: rule__Knowledge__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Knowledge__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7163:1: ( ( ruleEString ) )
            // InternalLightweight.g:7164:2: ( ruleEString )
            {
            // InternalLightweight.g:7164:2: ( ruleEString )
            // InternalLightweight.g:7165:3: ruleEString
            {
             before(grammarAccess.getKnowledgeAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getKnowledgeAccess().getNameEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__NameAssignment_6"


    // $ANTLR start "rule__Knowledge__ValueAssignment_10"
    // InternalLightweight.g:7174:1: rule__Knowledge__ValueAssignment_10 : ( ruleKVALUE ) ;
    public final void rule__Knowledge__ValueAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7178:1: ( ( ruleKVALUE ) )
            // InternalLightweight.g:7179:2: ( ruleKVALUE )
            {
            // InternalLightweight.g:7179:2: ( ruleKVALUE )
            // InternalLightweight.g:7180:3: ruleKVALUE
            {
             before(grammarAccess.getKnowledgeAccess().getValueKVALUEEnumRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleKVALUE();

            state._fsp--;

             after(grammarAccess.getKnowledgeAccess().getValueKVALUEEnumRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__ValueAssignment_10"


    // $ANTLR start "rule__Knowledge__LimitedAttemptsAssignment_14"
    // InternalLightweight.g:7189:1: rule__Knowledge__LimitedAttemptsAssignment_14 : ( ruleBool2 ) ;
    public final void rule__Knowledge__LimitedAttemptsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7193:1: ( ( ruleBool2 ) )
            // InternalLightweight.g:7194:2: ( ruleBool2 )
            {
            // InternalLightweight.g:7194:2: ( ruleBool2 )
            // InternalLightweight.g:7195:3: ruleBool2
            {
             before(grammarAccess.getKnowledgeAccess().getLimitedAttemptsBool2EnumRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleBool2();

            state._fsp--;

             after(grammarAccess.getKnowledgeAccess().getLimitedAttemptsBool2EnumRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__LimitedAttemptsAssignment_14"


    // $ANTLR start "rule__Knowledge__AutofilledAssignment_18"
    // InternalLightweight.g:7204:1: rule__Knowledge__AutofilledAssignment_18 : ( ruleBool2 ) ;
    public final void rule__Knowledge__AutofilledAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7208:1: ( ( ruleBool2 ) )
            // InternalLightweight.g:7209:2: ( ruleBool2 )
            {
            // InternalLightweight.g:7209:2: ( ruleBool2 )
            // InternalLightweight.g:7210:3: ruleBool2
            {
             before(grammarAccess.getKnowledgeAccess().getAutofilledBool2EnumRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleBool2();

            state._fsp--;

             after(grammarAccess.getKnowledgeAccess().getAutofilledBool2EnumRuleCall_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Knowledge__AutofilledAssignment_18"


    // $ANTLR start "rule__Biometrics__TypeAssignment_1"
    // InternalLightweight.g:7219:1: rule__Biometrics__TypeAssignment_1 : ( ( 'Biometrics' ) ) ;
    public final void rule__Biometrics__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7223:1: ( ( ( 'Biometrics' ) ) )
            // InternalLightweight.g:7224:2: ( ( 'Biometrics' ) )
            {
            // InternalLightweight.g:7224:2: ( ( 'Biometrics' ) )
            // InternalLightweight.g:7225:3: ( 'Biometrics' )
            {
             before(grammarAccess.getBiometricsAccess().getTypeBiometricsKeyword_1_0()); 
            // InternalLightweight.g:7226:3: ( 'Biometrics' )
            // InternalLightweight.g:7227:4: 'Biometrics'
            {
             before(grammarAccess.getBiometricsAccess().getTypeBiometricsKeyword_1_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getBiometricsAccess().getTypeBiometricsKeyword_1_0()); 

            }

             after(grammarAccess.getBiometricsAccess().getTypeBiometricsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__TypeAssignment_1"


    // $ANTLR start "rule__Biometrics__NameAssignment_6"
    // InternalLightweight.g:7238:1: rule__Biometrics__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Biometrics__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7242:1: ( ( ruleEString ) )
            // InternalLightweight.g:7243:2: ( ruleEString )
            {
            // InternalLightweight.g:7243:2: ( ruleEString )
            // InternalLightweight.g:7244:3: ruleEString
            {
             before(grammarAccess.getBiometricsAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBiometricsAccess().getNameEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__NameAssignment_6"


    // $ANTLR start "rule__Biometrics__ValueAssignment_10"
    // InternalLightweight.g:7253:1: rule__Biometrics__ValueAssignment_10 : ( ruleBVALUE ) ;
    public final void rule__Biometrics__ValueAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7257:1: ( ( ruleBVALUE ) )
            // InternalLightweight.g:7258:2: ( ruleBVALUE )
            {
            // InternalLightweight.g:7258:2: ( ruleBVALUE )
            // InternalLightweight.g:7259:3: ruleBVALUE
            {
             before(grammarAccess.getBiometricsAccess().getValueBVALUEEnumRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleBVALUE();

            state._fsp--;

             after(grammarAccess.getBiometricsAccess().getValueBVALUEEnumRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Biometrics__ValueAssignment_10"


    // $ANTLR start "rule__Registration__TypeAssignment_1"
    // InternalLightweight.g:7268:1: rule__Registration__TypeAssignment_1 : ( ( 'Registration' ) ) ;
    public final void rule__Registration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7272:1: ( ( ( 'Registration' ) ) )
            // InternalLightweight.g:7273:2: ( ( 'Registration' ) )
            {
            // InternalLightweight.g:7273:2: ( ( 'Registration' ) )
            // InternalLightweight.g:7274:3: ( 'Registration' )
            {
             before(grammarAccess.getRegistrationAccess().getTypeRegistrationKeyword_1_0()); 
            // InternalLightweight.g:7275:3: ( 'Registration' )
            // InternalLightweight.g:7276:4: 'Registration'
            {
             before(grammarAccess.getRegistrationAccess().getTypeRegistrationKeyword_1_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getRegistrationAccess().getTypeRegistrationKeyword_1_0()); 

            }

             after(grammarAccess.getRegistrationAccess().getTypeRegistrationKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__TypeAssignment_1"


    // $ANTLR start "rule__Registration__NameAssignment_6"
    // InternalLightweight.g:7287:1: rule__Registration__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Registration__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7291:1: ( ( ruleEString ) )
            // InternalLightweight.g:7292:2: ( ruleEString )
            {
            // InternalLightweight.g:7292:2: ( ruleEString )
            // InternalLightweight.g:7293:3: ruleEString
            {
             before(grammarAccess.getRegistrationAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRegistrationAccess().getNameEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__NameAssignment_6"


    // $ANTLR start "rule__Registration__AttributesAssignment_11"
    // InternalLightweight.g:7302:1: rule__Registration__AttributesAssignment_11 : ( ruleAttribute ) ;
    public final void rule__Registration__AttributesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7306:1: ( ( ruleAttribute ) )
            // InternalLightweight.g:7307:2: ( ruleAttribute )
            {
            // InternalLightweight.g:7307:2: ( ruleAttribute )
            // InternalLightweight.g:7308:3: ruleAttribute
            {
             before(grammarAccess.getRegistrationAccess().getAttributesAttributeParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRegistrationAccess().getAttributesAttributeParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__AttributesAssignment_11"


    // $ANTLR start "rule__Registration__AttributesAssignment_12_1"
    // InternalLightweight.g:7317:1: rule__Registration__AttributesAssignment_12_1 : ( ruleAttribute ) ;
    public final void rule__Registration__AttributesAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7321:1: ( ( ruleAttribute ) )
            // InternalLightweight.g:7322:2: ( ruleAttribute )
            {
            // InternalLightweight.g:7322:2: ( ruleAttribute )
            // InternalLightweight.g:7323:3: ruleAttribute
            {
             before(grammarAccess.getRegistrationAccess().getAttributesAttributeParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getRegistrationAccess().getAttributesAttributeParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Registration__AttributesAssignment_12_1"


    // $ANTLR start "rule__Attribute__NameAssignment_4"
    // InternalLightweight.g:7332:1: rule__Attribute__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7336:1: ( ( ruleEString ) )
            // InternalLightweight.g:7337:2: ( ruleEString )
            {
            // InternalLightweight.g:7337:2: ( ruleEString )
            // InternalLightweight.g:7338:3: ruleEString
            {
             before(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_4"


    // $ANTLR start "rule__Attribute__ProviderAssignment_8"
    // InternalLightweight.g:7347:1: rule__Attribute__ProviderAssignment_8 : ( rulePROVIDER ) ;
    public final void rule__Attribute__ProviderAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7351:1: ( ( rulePROVIDER ) )
            // InternalLightweight.g:7352:2: ( rulePROVIDER )
            {
            // InternalLightweight.g:7352:2: ( rulePROVIDER )
            // InternalLightweight.g:7353:3: rulePROVIDER
            {
             before(grammarAccess.getAttributeAccess().getProviderPROVIDEREnumRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            rulePROVIDER();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getProviderPROVIDEREnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ProviderAssignment_8"


    // $ANTLR start "rule__Attribute__TypeAssignment_12"
    // InternalLightweight.g:7362:1: rule__Attribute__TypeAssignment_12 : ( ruleCredTYPE ) ;
    public final void rule__Attribute__TypeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7366:1: ( ( ruleCredTYPE ) )
            // InternalLightweight.g:7367:2: ( ruleCredTYPE )
            {
            // InternalLightweight.g:7367:2: ( ruleCredTYPE )
            // InternalLightweight.g:7368:3: ruleCredTYPE
            {
             before(grammarAccess.getAttributeAccess().getTypeCredTYPEEnumRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleCredTYPE();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getTypeCredTYPEEnumRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__TypeAssignment_12"


    // $ANTLR start "rule__Attribute__VerifmethodAssignment_14_2"
    // InternalLightweight.g:7377:1: rule__Attribute__VerifmethodAssignment_14_2 : ( ruleVerifMethod ) ;
    public final void rule__Attribute__VerifmethodAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7381:1: ( ( ruleVerifMethod ) )
            // InternalLightweight.g:7382:2: ( ruleVerifMethod )
            {
            // InternalLightweight.g:7382:2: ( ruleVerifMethod )
            // InternalLightweight.g:7383:3: ruleVerifMethod
            {
             before(grammarAccess.getAttributeAccess().getVerifmethodVerifMethodParserRuleCall_14_2_0()); 
            pushFollow(FOLLOW_2);
            ruleVerifMethod();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getVerifmethodVerifMethodParserRuleCall_14_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__VerifmethodAssignment_14_2"


    // $ANTLR start "rule__VerifMethod__ValidityAssignment_4"
    // InternalLightweight.g:7392:1: rule__VerifMethod__ValidityAssignment_4 : ( ruleEBoolean ) ;
    public final void rule__VerifMethod__ValidityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7396:1: ( ( ruleEBoolean ) )
            // InternalLightweight.g:7397:2: ( ruleEBoolean )
            {
            // InternalLightweight.g:7397:2: ( ruleEBoolean )
            // InternalLightweight.g:7398:3: ruleEBoolean
            {
             before(grammarAccess.getVerifMethodAccess().getValidityEBooleanParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getVerifMethodAccess().getValidityEBooleanParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__ValidityAssignment_4"


    // $ANTLR start "rule__VerifMethod__UniquenessAssignment_8"
    // InternalLightweight.g:7407:1: rule__VerifMethod__UniquenessAssignment_8 : ( ruleEBoolean ) ;
    public final void rule__VerifMethod__UniquenessAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7411:1: ( ( ruleEBoolean ) )
            // InternalLightweight.g:7412:2: ( ruleEBoolean )
            {
            // InternalLightweight.g:7412:2: ( ruleEBoolean )
            // InternalLightweight.g:7413:3: ruleEBoolean
            {
             before(grammarAccess.getVerifMethodAccess().getUniquenessEBooleanParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getVerifMethodAccess().getUniquenessEBooleanParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__UniquenessAssignment_8"


    // $ANTLR start "rule__VerifMethod__BindingsAssignment_12"
    // InternalLightweight.g:7422:1: rule__VerifMethod__BindingsAssignment_12 : ( ruleEBoolean ) ;
    public final void rule__VerifMethod__BindingsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7426:1: ( ( ruleEBoolean ) )
            // InternalLightweight.g:7427:2: ( ruleEBoolean )
            {
            // InternalLightweight.g:7427:2: ( ruleEBoolean )
            // InternalLightweight.g:7428:3: ruleEBoolean
            {
             before(grammarAccess.getVerifMethodAccess().getBindingsEBooleanParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getVerifMethodAccess().getBindingsEBooleanParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VerifMethod__BindingsAssignment_12"


    // $ANTLR start "rule__Recovery__TypeAssignment_1"
    // InternalLightweight.g:7437:1: rule__Recovery__TypeAssignment_1 : ( ( 'Recovery' ) ) ;
    public final void rule__Recovery__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7441:1: ( ( ( 'Recovery' ) ) )
            // InternalLightweight.g:7442:2: ( ( 'Recovery' ) )
            {
            // InternalLightweight.g:7442:2: ( ( 'Recovery' ) )
            // InternalLightweight.g:7443:3: ( 'Recovery' )
            {
             before(grammarAccess.getRecoveryAccess().getTypeRecoveryKeyword_1_0()); 
            // InternalLightweight.g:7444:3: ( 'Recovery' )
            // InternalLightweight.g:7445:4: 'Recovery'
            {
             before(grammarAccess.getRecoveryAccess().getTypeRecoveryKeyword_1_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getTypeRecoveryKeyword_1_0()); 

            }

             after(grammarAccess.getRecoveryAccess().getTypeRecoveryKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__TypeAssignment_1"


    // $ANTLR start "rule__Recovery__NameAssignment_6"
    // InternalLightweight.g:7456:1: rule__Recovery__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Recovery__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7460:1: ( ( ruleEString ) )
            // InternalLightweight.g:7461:2: ( ruleEString )
            {
            // InternalLightweight.g:7461:2: ( ruleEString )
            // InternalLightweight.g:7462:3: ruleEString
            {
             before(grammarAccess.getRecoveryAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRecoveryAccess().getNameEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__NameAssignment_6"


    // $ANTLR start "rule__Recovery__AuthenticatorAssignment_10"
    // InternalLightweight.g:7471:1: rule__Recovery__AuthenticatorAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Recovery__AuthenticatorAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7475:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:7476:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:7476:2: ( ( RULE_ID ) )
            // InternalLightweight.g:7477:3: ( RULE_ID )
            {
             before(grammarAccess.getRecoveryAccess().getAuthenticatorAuthenticatorCrossReference_10_0()); 
            // InternalLightweight.g:7478:3: ( RULE_ID )
            // InternalLightweight.g:7479:4: RULE_ID
            {
             before(grammarAccess.getRecoveryAccess().getAuthenticatorAuthenticatorIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getAuthenticatorAuthenticatorIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getRecoveryAccess().getAuthenticatorAuthenticatorCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__AuthenticatorAssignment_10"


    // $ANTLR start "rule__Recovery__AuthMethodsAssignment_12_2"
    // InternalLightweight.g:7490:1: rule__Recovery__AuthMethodsAssignment_12_2 : ( ( RULE_ID ) ) ;
    public final void rule__Recovery__AuthMethodsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7494:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:7495:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:7495:2: ( ( RULE_ID ) )
            // InternalLightweight.g:7496:3: ( RULE_ID )
            {
             before(grammarAccess.getRecoveryAccess().getAuthMethodsAuthMethodCrossReference_12_2_0()); 
            // InternalLightweight.g:7497:3: ( RULE_ID )
            // InternalLightweight.g:7498:4: RULE_ID
            {
             before(grammarAccess.getRecoveryAccess().getAuthMethodsAuthMethodIDTerminalRuleCall_12_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getAuthMethodsAuthMethodIDTerminalRuleCall_12_2_0_1()); 

            }

             after(grammarAccess.getRecoveryAccess().getAuthMethodsAuthMethodCrossReference_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__AuthMethodsAssignment_12_2"


    // $ANTLR start "rule__Recovery__AuthMethodsAssignment_12_3_1"
    // InternalLightweight.g:7509:1: rule__Recovery__AuthMethodsAssignment_12_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Recovery__AuthMethodsAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7513:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:7514:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:7514:2: ( ( RULE_ID ) )
            // InternalLightweight.g:7515:3: ( RULE_ID )
            {
             before(grammarAccess.getRecoveryAccess().getAuthMethodsAuthMethodCrossReference_12_3_1_0()); 
            // InternalLightweight.g:7516:3: ( RULE_ID )
            // InternalLightweight.g:7517:4: RULE_ID
            {
             before(grammarAccess.getRecoveryAccess().getAuthMethodsAuthMethodIDTerminalRuleCall_12_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getAuthMethodsAuthMethodIDTerminalRuleCall_12_3_1_0_1()); 

            }

             after(grammarAccess.getRecoveryAccess().getAuthMethodsAuthMethodCrossReference_12_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__AuthMethodsAssignment_12_3_1"


    // $ANTLR start "rule__Recovery__ProtocolAssignment_13_2"
    // InternalLightweight.g:7528:1: rule__Recovery__ProtocolAssignment_13_2 : ( ruleProtocol ) ;
    public final void rule__Recovery__ProtocolAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7532:1: ( ( ruleProtocol ) )
            // InternalLightweight.g:7533:2: ( ruleProtocol )
            {
            // InternalLightweight.g:7533:2: ( ruleProtocol )
            // InternalLightweight.g:7534:3: ruleProtocol
            {
             before(grammarAccess.getRecoveryAccess().getProtocolProtocolEnumRuleCall_13_2_0()); 
            pushFollow(FOLLOW_2);
            ruleProtocol();

            state._fsp--;

             after(grammarAccess.getRecoveryAccess().getProtocolProtocolEnumRuleCall_13_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__ProtocolAssignment_13_2"


    // $ANTLR start "rule__Login__TypeAssignment_1"
    // InternalLightweight.g:7543:1: rule__Login__TypeAssignment_1 : ( ( 'Login' ) ) ;
    public final void rule__Login__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7547:1: ( ( ( 'Login' ) ) )
            // InternalLightweight.g:7548:2: ( ( 'Login' ) )
            {
            // InternalLightweight.g:7548:2: ( ( 'Login' ) )
            // InternalLightweight.g:7549:3: ( 'Login' )
            {
             before(grammarAccess.getLoginAccess().getTypeLoginKeyword_1_0()); 
            // InternalLightweight.g:7550:3: ( 'Login' )
            // InternalLightweight.g:7551:4: 'Login'
            {
             before(grammarAccess.getLoginAccess().getTypeLoginKeyword_1_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getTypeLoginKeyword_1_0()); 

            }

             after(grammarAccess.getLoginAccess().getTypeLoginKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__TypeAssignment_1"


    // $ANTLR start "rule__Login__NameAssignment_6"
    // InternalLightweight.g:7562:1: rule__Login__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Login__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7566:1: ( ( ruleEString ) )
            // InternalLightweight.g:7567:2: ( ruleEString )
            {
            // InternalLightweight.g:7567:2: ( ruleEString )
            // InternalLightweight.g:7568:3: ruleEString
            {
             before(grammarAccess.getLoginAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLoginAccess().getNameEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__NameAssignment_6"


    // $ANTLR start "rule__Login__SessionAssignment_10"
    // InternalLightweight.g:7577:1: rule__Login__SessionAssignment_10 : ( ruleEBoolean ) ;
    public final void rule__Login__SessionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7581:1: ( ( ruleEBoolean ) )
            // InternalLightweight.g:7582:2: ( ruleEBoolean )
            {
            // InternalLightweight.g:7582:2: ( ruleEBoolean )
            // InternalLightweight.g:7583:3: ruleEBoolean
            {
             before(grammarAccess.getLoginAccess().getSessionEBooleanParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getLoginAccess().getSessionEBooleanParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__SessionAssignment_10"


    // $ANTLR start "rule__Login__AuthMethodsAssignment_14"
    // InternalLightweight.g:7592:1: rule__Login__AuthMethodsAssignment_14 : ( ( RULE_ID ) ) ;
    public final void rule__Login__AuthMethodsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7596:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:7597:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:7597:2: ( ( RULE_ID ) )
            // InternalLightweight.g:7598:3: ( RULE_ID )
            {
             before(grammarAccess.getLoginAccess().getAuthMethodsAuthMethodCrossReference_14_0()); 
            // InternalLightweight.g:7599:3: ( RULE_ID )
            // InternalLightweight.g:7600:4: RULE_ID
            {
             before(grammarAccess.getLoginAccess().getAuthMethodsAuthMethodIDTerminalRuleCall_14_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getAuthMethodsAuthMethodIDTerminalRuleCall_14_0_1()); 

            }

             after(grammarAccess.getLoginAccess().getAuthMethodsAuthMethodCrossReference_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__AuthMethodsAssignment_14"


    // $ANTLR start "rule__Login__AuthMethodsAssignment_15_1"
    // InternalLightweight.g:7611:1: rule__Login__AuthMethodsAssignment_15_1 : ( ( RULE_ID ) ) ;
    public final void rule__Login__AuthMethodsAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7615:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:7616:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:7616:2: ( ( RULE_ID ) )
            // InternalLightweight.g:7617:3: ( RULE_ID )
            {
             before(grammarAccess.getLoginAccess().getAuthMethodsAuthMethodCrossReference_15_1_0()); 
            // InternalLightweight.g:7618:3: ( RULE_ID )
            // InternalLightweight.g:7619:4: RULE_ID
            {
             before(grammarAccess.getLoginAccess().getAuthMethodsAuthMethodIDTerminalRuleCall_15_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLoginAccess().getAuthMethodsAuthMethodIDTerminalRuleCall_15_1_0_1()); 

            }

             after(grammarAccess.getLoginAccess().getAuthMethodsAuthMethodCrossReference_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Login__AuthMethodsAssignment_15_1"


    // $ANTLR start "rule__Reset__TypeAssignment_1"
    // InternalLightweight.g:7630:1: rule__Reset__TypeAssignment_1 : ( ( 'Reset' ) ) ;
    public final void rule__Reset__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7634:1: ( ( ( 'Reset' ) ) )
            // InternalLightweight.g:7635:2: ( ( 'Reset' ) )
            {
            // InternalLightweight.g:7635:2: ( ( 'Reset' ) )
            // InternalLightweight.g:7636:3: ( 'Reset' )
            {
             before(grammarAccess.getResetAccess().getTypeResetKeyword_1_0()); 
            // InternalLightweight.g:7637:3: ( 'Reset' )
            // InternalLightweight.g:7638:4: 'Reset'
            {
             before(grammarAccess.getResetAccess().getTypeResetKeyword_1_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getTypeResetKeyword_1_0()); 

            }

             after(grammarAccess.getResetAccess().getTypeResetKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__TypeAssignment_1"


    // $ANTLR start "rule__Reset__NameAssignment_6"
    // InternalLightweight.g:7649:1: rule__Reset__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Reset__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7653:1: ( ( ruleEString ) )
            // InternalLightweight.g:7654:2: ( ruleEString )
            {
            // InternalLightweight.g:7654:2: ( ruleEString )
            // InternalLightweight.g:7655:3: ruleEString
            {
             before(grammarAccess.getResetAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResetAccess().getNameEStringParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__NameAssignment_6"


    // $ANTLR start "rule__Reset__AuthenticatorAssignment_10"
    // InternalLightweight.g:7664:1: rule__Reset__AuthenticatorAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Reset__AuthenticatorAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7668:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:7669:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:7669:2: ( ( RULE_ID ) )
            // InternalLightweight.g:7670:3: ( RULE_ID )
            {
             before(grammarAccess.getResetAccess().getAuthenticatorAuthenticatorCrossReference_10_0()); 
            // InternalLightweight.g:7671:3: ( RULE_ID )
            // InternalLightweight.g:7672:4: RULE_ID
            {
             before(grammarAccess.getResetAccess().getAuthenticatorAuthenticatorIDTerminalRuleCall_10_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getAuthenticatorAuthenticatorIDTerminalRuleCall_10_0_1()); 

            }

             after(grammarAccess.getResetAccess().getAuthenticatorAuthenticatorCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__AuthenticatorAssignment_10"


    // $ANTLR start "rule__Reset__AuthMethodsAssignment_12_2"
    // InternalLightweight.g:7683:1: rule__Reset__AuthMethodsAssignment_12_2 : ( ( RULE_ID ) ) ;
    public final void rule__Reset__AuthMethodsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7687:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:7688:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:7688:2: ( ( RULE_ID ) )
            // InternalLightweight.g:7689:3: ( RULE_ID )
            {
             before(grammarAccess.getResetAccess().getAuthMethodsAuthMethodCrossReference_12_2_0()); 
            // InternalLightweight.g:7690:3: ( RULE_ID )
            // InternalLightweight.g:7691:4: RULE_ID
            {
             before(grammarAccess.getResetAccess().getAuthMethodsAuthMethodIDTerminalRuleCall_12_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getAuthMethodsAuthMethodIDTerminalRuleCall_12_2_0_1()); 

            }

             after(grammarAccess.getResetAccess().getAuthMethodsAuthMethodCrossReference_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__AuthMethodsAssignment_12_2"


    // $ANTLR start "rule__Reset__AuthMethodsAssignment_12_3_1"
    // InternalLightweight.g:7702:1: rule__Reset__AuthMethodsAssignment_12_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reset__AuthMethodsAssignment_12_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7706:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:7707:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:7707:2: ( ( RULE_ID ) )
            // InternalLightweight.g:7708:3: ( RULE_ID )
            {
             before(grammarAccess.getResetAccess().getAuthMethodsAuthMethodCrossReference_12_3_1_0()); 
            // InternalLightweight.g:7709:3: ( RULE_ID )
            // InternalLightweight.g:7710:4: RULE_ID
            {
             before(grammarAccess.getResetAccess().getAuthMethodsAuthMethodIDTerminalRuleCall_12_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getAuthMethodsAuthMethodIDTerminalRuleCall_12_3_1_0_1()); 

            }

             after(grammarAccess.getResetAccess().getAuthMethodsAuthMethodCrossReference_12_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__AuthMethodsAssignment_12_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000204000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0040020000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1400020000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0800020000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0400020000000000L});

}
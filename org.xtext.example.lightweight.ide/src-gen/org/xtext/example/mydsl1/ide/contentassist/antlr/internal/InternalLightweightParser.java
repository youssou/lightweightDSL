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


    // $ANTLR start "ruleKVALUE"
    // InternalLightweight.g:526:1: ruleKVALUE : ( ( rule__KVALUE__Alternatives ) ) ;
    public final void ruleKVALUE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:530:1: ( ( ( rule__KVALUE__Alternatives ) ) )
            // InternalLightweight.g:531:2: ( ( rule__KVALUE__Alternatives ) )
            {
            // InternalLightweight.g:531:2: ( ( rule__KVALUE__Alternatives ) )
            // InternalLightweight.g:532:3: ( rule__KVALUE__Alternatives )
            {
             before(grammarAccess.getKVALUEAccess().getAlternatives()); 
            // InternalLightweight.g:533:3: ( rule__KVALUE__Alternatives )
            // InternalLightweight.g:533:4: rule__KVALUE__Alternatives
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
    // InternalLightweight.g:542:1: ruleBVALUE : ( ( rule__BVALUE__Alternatives ) ) ;
    public final void ruleBVALUE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:546:1: ( ( ( rule__BVALUE__Alternatives ) ) )
            // InternalLightweight.g:547:2: ( ( rule__BVALUE__Alternatives ) )
            {
            // InternalLightweight.g:547:2: ( ( rule__BVALUE__Alternatives ) )
            // InternalLightweight.g:548:3: ( rule__BVALUE__Alternatives )
            {
             before(grammarAccess.getBVALUEAccess().getAlternatives()); 
            // InternalLightweight.g:549:3: ( rule__BVALUE__Alternatives )
            // InternalLightweight.g:549:4: rule__BVALUE__Alternatives
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
    // InternalLightweight.g:558:1: rulePVALUE : ( ( rule__PVALUE__Alternatives ) ) ;
    public final void rulePVALUE() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:562:1: ( ( ( rule__PVALUE__Alternatives ) ) )
            // InternalLightweight.g:563:2: ( ( rule__PVALUE__Alternatives ) )
            {
            // InternalLightweight.g:563:2: ( ( rule__PVALUE__Alternatives ) )
            // InternalLightweight.g:564:3: ( rule__PVALUE__Alternatives )
            {
             before(grammarAccess.getPVALUEAccess().getAlternatives()); 
            // InternalLightweight.g:565:3: ( rule__PVALUE__Alternatives )
            // InternalLightweight.g:565:4: rule__PVALUE__Alternatives
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
    // InternalLightweight.g:574:1: ruleValidationType : ( ( rule__ValidationType__Alternatives ) ) ;
    public final void ruleValidationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:578:1: ( ( ( rule__ValidationType__Alternatives ) ) )
            // InternalLightweight.g:579:2: ( ( rule__ValidationType__Alternatives ) )
            {
            // InternalLightweight.g:579:2: ( ( rule__ValidationType__Alternatives ) )
            // InternalLightweight.g:580:3: ( rule__ValidationType__Alternatives )
            {
             before(grammarAccess.getValidationTypeAccess().getAlternatives()); 
            // InternalLightweight.g:581:3: ( rule__ValidationType__Alternatives )
            // InternalLightweight.g:581:4: rule__ValidationType__Alternatives
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
    // InternalLightweight.g:589:1: rule__AuthMethod__Alternatives : ( ( ruleMFA ) | ( ruleSFA ) );
    public final void rule__AuthMethod__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:593:1: ( ( ruleMFA ) | ( ruleSFA ) )
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
                    // InternalLightweight.g:594:2: ( ruleMFA )
                    {
                    // InternalLightweight.g:594:2: ( ruleMFA )
                    // InternalLightweight.g:595:3: ruleMFA
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
                    // InternalLightweight.g:600:2: ( ruleSFA )
                    {
                    // InternalLightweight.g:600:2: ( ruleSFA )
                    // InternalLightweight.g:601:3: ruleSFA
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
    // InternalLightweight.g:610:1: rule__Authenticator__Alternatives : ( ( rulePossession ) | ( ruleBiometrics ) | ( ruleKnowledge ) );
    public final void rule__Authenticator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:614:1: ( ( rulePossession ) | ( ruleBiometrics ) | ( ruleKnowledge ) )
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
                    // InternalLightweight.g:615:2: ( rulePossession )
                    {
                    // InternalLightweight.g:615:2: ( rulePossession )
                    // InternalLightweight.g:616:3: rulePossession
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
                    // InternalLightweight.g:621:2: ( ruleBiometrics )
                    {
                    // InternalLightweight.g:621:2: ( ruleBiometrics )
                    // InternalLightweight.g:622:3: ruleBiometrics
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
                    // InternalLightweight.g:627:2: ( ruleKnowledge )
                    {
                    // InternalLightweight.g:627:2: ( ruleKnowledge )
                    // InternalLightweight.g:628:3: ruleKnowledge
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
    // InternalLightweight.g:637:1: rule__Phase__Alternatives : ( ( ruleRegistration ) | ( ruleRecovery ) | ( ruleLogin ) | ( ruleReset ) );
    public final void rule__Phase__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:641:1: ( ( ruleRegistration ) | ( ruleRecovery ) | ( ruleLogin ) | ( ruleReset ) )
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
                    // InternalLightweight.g:642:2: ( ruleRegistration )
                    {
                    // InternalLightweight.g:642:2: ( ruleRegistration )
                    // InternalLightweight.g:643:3: ruleRegistration
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
                    // InternalLightweight.g:648:2: ( ruleRecovery )
                    {
                    // InternalLightweight.g:648:2: ( ruleRecovery )
                    // InternalLightweight.g:649:3: ruleRecovery
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
                    // InternalLightweight.g:654:2: ( ruleLogin )
                    {
                    // InternalLightweight.g:654:2: ( ruleLogin )
                    // InternalLightweight.g:655:3: ruleLogin
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
                    // InternalLightweight.g:660:2: ( ruleReset )
                    {
                    // InternalLightweight.g:660:2: ( ruleReset )
                    // InternalLightweight.g:661:3: ruleReset
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
    // InternalLightweight.g:670:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:674:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalLightweight.g:675:2: ( RULE_STRING )
                    {
                    // InternalLightweight.g:675:2: ( RULE_STRING )
                    // InternalLightweight.g:676:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:681:2: ( RULE_ID )
                    {
                    // InternalLightweight.g:681:2: ( RULE_ID )
                    // InternalLightweight.g:682:3: RULE_ID
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
    // InternalLightweight.g:691:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:695:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalLightweight.g:696:2: ( 'true' )
                    {
                    // InternalLightweight.g:696:2: ( 'true' )
                    // InternalLightweight.g:697:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:702:2: ( 'false' )
                    {
                    // InternalLightweight.g:702:2: ( 'false' )
                    // InternalLightweight.g:703:3: 'false'
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
    // InternalLightweight.g:712:1: rule__PROVIDER__Alternatives : ( ( ( 'Identity provider' ) ) | ( ( 'Self provided' ) ) | ( ( 'Institutional' ) ) );
    public final void rule__PROVIDER__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:716:1: ( ( ( 'Identity provider' ) ) | ( ( 'Self provided' ) ) | ( ( 'Institutional' ) ) )
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
                    // InternalLightweight.g:717:2: ( ( 'Identity provider' ) )
                    {
                    // InternalLightweight.g:717:2: ( ( 'Identity provider' ) )
                    // InternalLightweight.g:718:3: ( 'Identity provider' )
                    {
                     before(grammarAccess.getPROVIDERAccess().getIdPEnumLiteralDeclaration_0()); 
                    // InternalLightweight.g:719:3: ( 'Identity provider' )
                    // InternalLightweight.g:719:4: 'Identity provider'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getPROVIDERAccess().getIdPEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:723:2: ( ( 'Self provided' ) )
                    {
                    // InternalLightweight.g:723:2: ( ( 'Self provided' ) )
                    // InternalLightweight.g:724:3: ( 'Self provided' )
                    {
                     before(grammarAccess.getPROVIDERAccess().getSELFEnumLiteralDeclaration_1()); 
                    // InternalLightweight.g:725:3: ( 'Self provided' )
                    // InternalLightweight.g:725:4: 'Self provided'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getPROVIDERAccess().getSELFEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLightweight.g:729:2: ( ( 'Institutional' ) )
                    {
                    // InternalLightweight.g:729:2: ( ( 'Institutional' ) )
                    // InternalLightweight.g:730:3: ( 'Institutional' )
                    {
                     before(grammarAccess.getPROVIDERAccess().getINSTITUTIONALEnumLiteralDeclaration_2()); 
                    // InternalLightweight.g:731:3: ( 'Institutional' )
                    // InternalLightweight.g:731:4: 'Institutional'
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
    // InternalLightweight.g:739:1: rule__CredTYPE__Alternatives : ( ( ( 'Digital' ) ) | ( ( 'Physical' ) ) );
    public final void rule__CredTYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:743:1: ( ( ( 'Digital' ) ) | ( ( 'Physical' ) ) )
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
                    // InternalLightweight.g:744:2: ( ( 'Digital' ) )
                    {
                    // InternalLightweight.g:744:2: ( ( 'Digital' ) )
                    // InternalLightweight.g:745:3: ( 'Digital' )
                    {
                     before(grammarAccess.getCredTYPEAccess().getDIGITALEnumLiteralDeclaration_0()); 
                    // InternalLightweight.g:746:3: ( 'Digital' )
                    // InternalLightweight.g:746:4: 'Digital'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getCredTYPEAccess().getDIGITALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:750:2: ( ( 'Physical' ) )
                    {
                    // InternalLightweight.g:750:2: ( ( 'Physical' ) )
                    // InternalLightweight.g:751:3: ( 'Physical' )
                    {
                     before(grammarAccess.getCredTYPEAccess().getPHYSICALEnumLiteralDeclaration_1()); 
                    // InternalLightweight.g:752:3: ( 'Physical' )
                    // InternalLightweight.g:752:4: 'Physical'
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
    // InternalLightweight.g:760:1: rule__Protocol__Alternatives : ( ( ( 'Email-Based' ) ) | ( ( 'MS-based' ) ) | ( ( 'Local' ) ) );
    public final void rule__Protocol__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:764:1: ( ( ( 'Email-Based' ) ) | ( ( 'MS-based' ) ) | ( ( 'Local' ) ) )
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
                    // InternalLightweight.g:765:2: ( ( 'Email-Based' ) )
                    {
                    // InternalLightweight.g:765:2: ( ( 'Email-Based' ) )
                    // InternalLightweight.g:766:3: ( 'Email-Based' )
                    {
                     before(grammarAccess.getProtocolAccess().getEBIAEnumLiteralDeclaration_0()); 
                    // InternalLightweight.g:767:3: ( 'Email-Based' )
                    // InternalLightweight.g:767:4: 'Email-Based'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getProtocolAccess().getEBIAEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:771:2: ( ( 'MS-based' ) )
                    {
                    // InternalLightweight.g:771:2: ( ( 'MS-based' ) )
                    // InternalLightweight.g:772:3: ( 'MS-based' )
                    {
                     before(grammarAccess.getProtocolAccess().getSMS_BASEDEnumLiteralDeclaration_1()); 
                    // InternalLightweight.g:773:3: ( 'MS-based' )
                    // InternalLightweight.g:773:4: 'MS-based'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getProtocolAccess().getSMS_BASEDEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLightweight.g:777:2: ( ( 'Local' ) )
                    {
                    // InternalLightweight.g:777:2: ( ( 'Local' ) )
                    // InternalLightweight.g:778:3: ( 'Local' )
                    {
                     before(grammarAccess.getProtocolAccess().getLOCALEnumLiteralDeclaration_2()); 
                    // InternalLightweight.g:779:3: ( 'Local' )
                    // InternalLightweight.g:779:4: 'Local'
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


    // $ANTLR start "rule__KVALUE__Alternatives"
    // InternalLightweight.g:787:1: rule__KVALUE__Alternatives : ( ( ( 'High Entropy Text-Based Password' ) ) | ( ( 'Pass phrase' ) ) | ( ( 'Knowledge-based Preferences' ) ) | ( ( 'Low Entropy Text-Based Password' ) ) | ( ( 'Pin Code' ) ) );
    public final void rule__KVALUE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:791:1: ( ( ( 'High Entropy Text-Based Password' ) ) | ( ( 'Pass phrase' ) ) | ( ( 'Knowledge-based Preferences' ) ) | ( ( 'Low Entropy Text-Based Password' ) ) | ( ( 'Pin Code' ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt9=1;
                }
                break;
            case 22:
                {
                alt9=2;
                }
                break;
            case 23:
                {
                alt9=3;
                }
                break;
            case 24:
                {
                alt9=4;
                }
                break;
            case 25:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalLightweight.g:792:2: ( ( 'High Entropy Text-Based Password' ) )
                    {
                    // InternalLightweight.g:792:2: ( ( 'High Entropy Text-Based Password' ) )
                    // InternalLightweight.g:793:3: ( 'High Entropy Text-Based Password' )
                    {
                     before(grammarAccess.getKVALUEAccess().getSTBPEnumLiteralDeclaration_0()); 
                    // InternalLightweight.g:794:3: ( 'High Entropy Text-Based Password' )
                    // InternalLightweight.g:794:4: 'High Entropy Text-Based Password'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getKVALUEAccess().getSTBPEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:798:2: ( ( 'Pass phrase' ) )
                    {
                    // InternalLightweight.g:798:2: ( ( 'Pass phrase' ) )
                    // InternalLightweight.g:799:3: ( 'Pass phrase' )
                    {
                     before(grammarAccess.getKVALUEAccess().getPASSPHRASEEnumLiteralDeclaration_1()); 
                    // InternalLightweight.g:800:3: ( 'Pass phrase' )
                    // InternalLightweight.g:800:4: 'Pass phrase'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getKVALUEAccess().getPASSPHRASEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalLightweight.g:804:2: ( ( 'Knowledge-based Preferences' ) )
                    {
                    // InternalLightweight.g:804:2: ( ( 'Knowledge-based Preferences' ) )
                    // InternalLightweight.g:805:3: ( 'Knowledge-based Preferences' )
                    {
                     before(grammarAccess.getKVALUEAccess().getPREFERENCESEnumLiteralDeclaration_2()); 
                    // InternalLightweight.g:806:3: ( 'Knowledge-based Preferences' )
                    // InternalLightweight.g:806:4: 'Knowledge-based Preferences'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getKVALUEAccess().getPREFERENCESEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalLightweight.g:810:2: ( ( 'Low Entropy Text-Based Password' ) )
                    {
                    // InternalLightweight.g:810:2: ( ( 'Low Entropy Text-Based Password' ) )
                    // InternalLightweight.g:811:3: ( 'Low Entropy Text-Based Password' )
                    {
                     before(grammarAccess.getKVALUEAccess().getLTBPEnumLiteralDeclaration_3()); 
                    // InternalLightweight.g:812:3: ( 'Low Entropy Text-Based Password' )
                    // InternalLightweight.g:812:4: 'Low Entropy Text-Based Password'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getKVALUEAccess().getLTBPEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalLightweight.g:816:2: ( ( 'Pin Code' ) )
                    {
                    // InternalLightweight.g:816:2: ( ( 'Pin Code' ) )
                    // InternalLightweight.g:817:3: ( 'Pin Code' )
                    {
                     before(grammarAccess.getKVALUEAccess().getPINEnumLiteralDeclaration_4()); 
                    // InternalLightweight.g:818:3: ( 'Pin Code' )
                    // InternalLightweight.g:818:4: 'Pin Code'
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
    // InternalLightweight.g:826:1: rule__BVALUE__Alternatives : ( ( ( 'Fingerprint Recognition' ) ) | ( ( 'Facial Recognition' ) ) );
    public final void rule__BVALUE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:830:1: ( ( ( 'Fingerprint Recognition' ) ) | ( ( 'Facial Recognition' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            else if ( (LA10_0==27) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalLightweight.g:831:2: ( ( 'Fingerprint Recognition' ) )
                    {
                    // InternalLightweight.g:831:2: ( ( 'Fingerprint Recognition' ) )
                    // InternalLightweight.g:832:3: ( 'Fingerprint Recognition' )
                    {
                     before(grammarAccess.getBVALUEAccess().getFINGERPRINTEnumLiteralDeclaration_0()); 
                    // InternalLightweight.g:833:3: ( 'Fingerprint Recognition' )
                    // InternalLightweight.g:833:4: 'Fingerprint Recognition'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getBVALUEAccess().getFINGERPRINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:837:2: ( ( 'Facial Recognition' ) )
                    {
                    // InternalLightweight.g:837:2: ( ( 'Facial Recognition' ) )
                    // InternalLightweight.g:838:3: ( 'Facial Recognition' )
                    {
                     before(grammarAccess.getBVALUEAccess().getIRISEnumLiteralDeclaration_1()); 
                    // InternalLightweight.g:839:3: ( 'Facial Recognition' )
                    // InternalLightweight.g:839:4: 'Facial Recognition'
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
    // InternalLightweight.g:847:1: rule__PVALUE__Alternatives : ( ( ( 'Hard Drive Token' ) ) | ( ( 'Physical device' ) ) );
    public final void rule__PVALUE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:851:1: ( ( ( 'Hard Drive Token' ) ) | ( ( 'Physical device' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            else if ( (LA11_0==29) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalLightweight.g:852:2: ( ( 'Hard Drive Token' ) )
                    {
                    // InternalLightweight.g:852:2: ( ( 'Hard Drive Token' ) )
                    // InternalLightweight.g:853:3: ( 'Hard Drive Token' )
                    {
                     before(grammarAccess.getPVALUEAccess().getTOKENEnumLiteralDeclaration_0()); 
                    // InternalLightweight.g:854:3: ( 'Hard Drive Token' )
                    // InternalLightweight.g:854:4: 'Hard Drive Token'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getPVALUEAccess().getTOKENEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:858:2: ( ( 'Physical device' ) )
                    {
                    // InternalLightweight.g:858:2: ( ( 'Physical device' ) )
                    // InternalLightweight.g:859:3: ( 'Physical device' )
                    {
                     before(grammarAccess.getPVALUEAccess().getDEVICEEnumLiteralDeclaration_1()); 
                    // InternalLightweight.g:860:3: ( 'Physical device' )
                    // InternalLightweight.g:860:4: 'Physical device'
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
    // InternalLightweight.g:868:1: rule__ValidationType__Alternatives : ( ( ( 'local validation' ) ) | ( ( 'Remote validation' ) ) );
    public final void rule__ValidationType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:872:1: ( ( ( 'local validation' ) ) | ( ( 'Remote validation' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            else if ( (LA12_0==31) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalLightweight.g:873:2: ( ( 'local validation' ) )
                    {
                    // InternalLightweight.g:873:2: ( ( 'local validation' ) )
                    // InternalLightweight.g:874:3: ( 'local validation' )
                    {
                     before(grammarAccess.getValidationTypeAccess().getLOCALEnumLiteralDeclaration_0()); 
                    // InternalLightweight.g:875:3: ( 'local validation' )
                    // InternalLightweight.g:875:4: 'local validation'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getValidationTypeAccess().getLOCALEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:879:2: ( ( 'Remote validation' ) )
                    {
                    // InternalLightweight.g:879:2: ( ( 'Remote validation' ) )
                    // InternalLightweight.g:880:3: ( 'Remote validation' )
                    {
                     before(grammarAccess.getValidationTypeAccess().getREMOTEEnumLiteralDeclaration_1()); 
                    // InternalLightweight.g:881:3: ( 'Remote validation' )
                    // InternalLightweight.g:881:4: 'Remote validation'
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
    // InternalLightweight.g:889:1: rule__App__Group__0 : rule__App__Group__0__Impl rule__App__Group__1 ;
    public final void rule__App__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:893:1: ( rule__App__Group__0__Impl rule__App__Group__1 )
            // InternalLightweight.g:894:2: rule__App__Group__0__Impl rule__App__Group__1
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
    // InternalLightweight.g:901:1: rule__App__Group__0__Impl : ( 'App' ) ;
    public final void rule__App__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:905:1: ( ( 'App' ) )
            // InternalLightweight.g:906:1: ( 'App' )
            {
            // InternalLightweight.g:906:1: ( 'App' )
            // InternalLightweight.g:907:2: 'App'
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
    // InternalLightweight.g:916:1: rule__App__Group__1 : rule__App__Group__1__Impl rule__App__Group__2 ;
    public final void rule__App__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:920:1: ( rule__App__Group__1__Impl rule__App__Group__2 )
            // InternalLightweight.g:921:2: rule__App__Group__1__Impl rule__App__Group__2
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
    // InternalLightweight.g:928:1: rule__App__Group__1__Impl : ( ':' ) ;
    public final void rule__App__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:932:1: ( ( ':' ) )
            // InternalLightweight.g:933:1: ( ':' )
            {
            // InternalLightweight.g:933:1: ( ':' )
            // InternalLightweight.g:934:2: ':'
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
    // InternalLightweight.g:943:1: rule__App__Group__2 : rule__App__Group__2__Impl rule__App__Group__3 ;
    public final void rule__App__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:947:1: ( rule__App__Group__2__Impl rule__App__Group__3 )
            // InternalLightweight.g:948:2: rule__App__Group__2__Impl rule__App__Group__3
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
    // InternalLightweight.g:955:1: rule__App__Group__2__Impl : ( '{' ) ;
    public final void rule__App__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:959:1: ( ( '{' ) )
            // InternalLightweight.g:960:1: ( '{' )
            {
            // InternalLightweight.g:960:1: ( '{' )
            // InternalLightweight.g:961:2: '{'
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
    // InternalLightweight.g:970:1: rule__App__Group__3 : rule__App__Group__3__Impl rule__App__Group__4 ;
    public final void rule__App__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:974:1: ( rule__App__Group__3__Impl rule__App__Group__4 )
            // InternalLightweight.g:975:2: rule__App__Group__3__Impl rule__App__Group__4
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
    // InternalLightweight.g:982:1: rule__App__Group__3__Impl : ( 'Authenticators' ) ;
    public final void rule__App__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:986:1: ( ( 'Authenticators' ) )
            // InternalLightweight.g:987:1: ( 'Authenticators' )
            {
            // InternalLightweight.g:987:1: ( 'Authenticators' )
            // InternalLightweight.g:988:2: 'Authenticators'
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
    // InternalLightweight.g:997:1: rule__App__Group__4 : rule__App__Group__4__Impl rule__App__Group__5 ;
    public final void rule__App__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1001:1: ( rule__App__Group__4__Impl rule__App__Group__5 )
            // InternalLightweight.g:1002:2: rule__App__Group__4__Impl rule__App__Group__5
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
    // InternalLightweight.g:1009:1: rule__App__Group__4__Impl : ( ':' ) ;
    public final void rule__App__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1013:1: ( ( ':' ) )
            // InternalLightweight.g:1014:1: ( ':' )
            {
            // InternalLightweight.g:1014:1: ( ':' )
            // InternalLightweight.g:1015:2: ':'
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
    // InternalLightweight.g:1024:1: rule__App__Group__5 : rule__App__Group__5__Impl rule__App__Group__6 ;
    public final void rule__App__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1028:1: ( rule__App__Group__5__Impl rule__App__Group__6 )
            // InternalLightweight.g:1029:2: rule__App__Group__5__Impl rule__App__Group__6
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
    // InternalLightweight.g:1036:1: rule__App__Group__5__Impl : ( '[' ) ;
    public final void rule__App__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1040:1: ( ( '[' ) )
            // InternalLightweight.g:1041:1: ( '[' )
            {
            // InternalLightweight.g:1041:1: ( '[' )
            // InternalLightweight.g:1042:2: '['
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
    // InternalLightweight.g:1051:1: rule__App__Group__6 : rule__App__Group__6__Impl rule__App__Group__7 ;
    public final void rule__App__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1055:1: ( rule__App__Group__6__Impl rule__App__Group__7 )
            // InternalLightweight.g:1056:2: rule__App__Group__6__Impl rule__App__Group__7
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
    // InternalLightweight.g:1063:1: rule__App__Group__6__Impl : ( ( rule__App__AuthenticatorsAssignment_6 ) ) ;
    public final void rule__App__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1067:1: ( ( ( rule__App__AuthenticatorsAssignment_6 ) ) )
            // InternalLightweight.g:1068:1: ( ( rule__App__AuthenticatorsAssignment_6 ) )
            {
            // InternalLightweight.g:1068:1: ( ( rule__App__AuthenticatorsAssignment_6 ) )
            // InternalLightweight.g:1069:2: ( rule__App__AuthenticatorsAssignment_6 )
            {
             before(grammarAccess.getAppAccess().getAuthenticatorsAssignment_6()); 
            // InternalLightweight.g:1070:2: ( rule__App__AuthenticatorsAssignment_6 )
            // InternalLightweight.g:1070:3: rule__App__AuthenticatorsAssignment_6
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
    // InternalLightweight.g:1078:1: rule__App__Group__7 : rule__App__Group__7__Impl rule__App__Group__8 ;
    public final void rule__App__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1082:1: ( rule__App__Group__7__Impl rule__App__Group__8 )
            // InternalLightweight.g:1083:2: rule__App__Group__7__Impl rule__App__Group__8
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
    // InternalLightweight.g:1090:1: rule__App__Group__7__Impl : ( ( rule__App__Group_7__0 )* ) ;
    public final void rule__App__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1094:1: ( ( ( rule__App__Group_7__0 )* ) )
            // InternalLightweight.g:1095:1: ( ( rule__App__Group_7__0 )* )
            {
            // InternalLightweight.g:1095:1: ( ( rule__App__Group_7__0 )* )
            // InternalLightweight.g:1096:2: ( rule__App__Group_7__0 )*
            {
             before(grammarAccess.getAppAccess().getGroup_7()); 
            // InternalLightweight.g:1097:2: ( rule__App__Group_7__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==38) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalLightweight.g:1097:3: rule__App__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__App__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalLightweight.g:1105:1: rule__App__Group__8 : rule__App__Group__8__Impl rule__App__Group__9 ;
    public final void rule__App__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1109:1: ( rule__App__Group__8__Impl rule__App__Group__9 )
            // InternalLightweight.g:1110:2: rule__App__Group__8__Impl rule__App__Group__9
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
    // InternalLightweight.g:1117:1: rule__App__Group__8__Impl : ( ']' ) ;
    public final void rule__App__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1121:1: ( ( ']' ) )
            // InternalLightweight.g:1122:1: ( ']' )
            {
            // InternalLightweight.g:1122:1: ( ']' )
            // InternalLightweight.g:1123:2: ']'
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
    // InternalLightweight.g:1132:1: rule__App__Group__9 : rule__App__Group__9__Impl rule__App__Group__10 ;
    public final void rule__App__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1136:1: ( rule__App__Group__9__Impl rule__App__Group__10 )
            // InternalLightweight.g:1137:2: rule__App__Group__9__Impl rule__App__Group__10
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
    // InternalLightweight.g:1144:1: rule__App__Group__9__Impl : ( ',' ) ;
    public final void rule__App__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1148:1: ( ( ',' ) )
            // InternalLightweight.g:1149:1: ( ',' )
            {
            // InternalLightweight.g:1149:1: ( ',' )
            // InternalLightweight.g:1150:2: ','
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
    // InternalLightweight.g:1159:1: rule__App__Group__10 : rule__App__Group__10__Impl rule__App__Group__11 ;
    public final void rule__App__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1163:1: ( rule__App__Group__10__Impl rule__App__Group__11 )
            // InternalLightweight.g:1164:2: rule__App__Group__10__Impl rule__App__Group__11
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
    // InternalLightweight.g:1171:1: rule__App__Group__10__Impl : ( 'Authentications' ) ;
    public final void rule__App__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1175:1: ( ( 'Authentications' ) )
            // InternalLightweight.g:1176:1: ( 'Authentications' )
            {
            // InternalLightweight.g:1176:1: ( 'Authentications' )
            // InternalLightweight.g:1177:2: 'Authentications'
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
    // InternalLightweight.g:1186:1: rule__App__Group__11 : rule__App__Group__11__Impl rule__App__Group__12 ;
    public final void rule__App__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1190:1: ( rule__App__Group__11__Impl rule__App__Group__12 )
            // InternalLightweight.g:1191:2: rule__App__Group__11__Impl rule__App__Group__12
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
    // InternalLightweight.g:1198:1: rule__App__Group__11__Impl : ( ':' ) ;
    public final void rule__App__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1202:1: ( ( ':' ) )
            // InternalLightweight.g:1203:1: ( ':' )
            {
            // InternalLightweight.g:1203:1: ( ':' )
            // InternalLightweight.g:1204:2: ':'
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
    // InternalLightweight.g:1213:1: rule__App__Group__12 : rule__App__Group__12__Impl rule__App__Group__13 ;
    public final void rule__App__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1217:1: ( rule__App__Group__12__Impl rule__App__Group__13 )
            // InternalLightweight.g:1218:2: rule__App__Group__12__Impl rule__App__Group__13
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
    // InternalLightweight.g:1225:1: rule__App__Group__12__Impl : ( '[' ) ;
    public final void rule__App__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1229:1: ( ( '[' ) )
            // InternalLightweight.g:1230:1: ( '[' )
            {
            // InternalLightweight.g:1230:1: ( '[' )
            // InternalLightweight.g:1231:2: '['
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
    // InternalLightweight.g:1240:1: rule__App__Group__13 : rule__App__Group__13__Impl rule__App__Group__14 ;
    public final void rule__App__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1244:1: ( rule__App__Group__13__Impl rule__App__Group__14 )
            // InternalLightweight.g:1245:2: rule__App__Group__13__Impl rule__App__Group__14
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
    // InternalLightweight.g:1252:1: rule__App__Group__13__Impl : ( ( rule__App__AuthMethodsAssignment_13 ) ) ;
    public final void rule__App__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1256:1: ( ( ( rule__App__AuthMethodsAssignment_13 ) ) )
            // InternalLightweight.g:1257:1: ( ( rule__App__AuthMethodsAssignment_13 ) )
            {
            // InternalLightweight.g:1257:1: ( ( rule__App__AuthMethodsAssignment_13 ) )
            // InternalLightweight.g:1258:2: ( rule__App__AuthMethodsAssignment_13 )
            {
             before(grammarAccess.getAppAccess().getAuthMethodsAssignment_13()); 
            // InternalLightweight.g:1259:2: ( rule__App__AuthMethodsAssignment_13 )
            // InternalLightweight.g:1259:3: rule__App__AuthMethodsAssignment_13
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
    // InternalLightweight.g:1267:1: rule__App__Group__14 : rule__App__Group__14__Impl rule__App__Group__15 ;
    public final void rule__App__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1271:1: ( rule__App__Group__14__Impl rule__App__Group__15 )
            // InternalLightweight.g:1272:2: rule__App__Group__14__Impl rule__App__Group__15
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
    // InternalLightweight.g:1279:1: rule__App__Group__14__Impl : ( ( rule__App__Group_14__0 )* ) ;
    public final void rule__App__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1283:1: ( ( ( rule__App__Group_14__0 )* ) )
            // InternalLightweight.g:1284:1: ( ( rule__App__Group_14__0 )* )
            {
            // InternalLightweight.g:1284:1: ( ( rule__App__Group_14__0 )* )
            // InternalLightweight.g:1285:2: ( rule__App__Group_14__0 )*
            {
             before(grammarAccess.getAppAccess().getGroup_14()); 
            // InternalLightweight.g:1286:2: ( rule__App__Group_14__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==38) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLightweight.g:1286:3: rule__App__Group_14__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__App__Group_14__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalLightweight.g:1294:1: rule__App__Group__15 : rule__App__Group__15__Impl rule__App__Group__16 ;
    public final void rule__App__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1298:1: ( rule__App__Group__15__Impl rule__App__Group__16 )
            // InternalLightweight.g:1299:2: rule__App__Group__15__Impl rule__App__Group__16
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
    // InternalLightweight.g:1306:1: rule__App__Group__15__Impl : ( ']' ) ;
    public final void rule__App__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1310:1: ( ( ']' ) )
            // InternalLightweight.g:1311:1: ( ']' )
            {
            // InternalLightweight.g:1311:1: ( ']' )
            // InternalLightweight.g:1312:2: ']'
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
    // InternalLightweight.g:1321:1: rule__App__Group__16 : rule__App__Group__16__Impl rule__App__Group__17 ;
    public final void rule__App__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1325:1: ( rule__App__Group__16__Impl rule__App__Group__17 )
            // InternalLightweight.g:1326:2: rule__App__Group__16__Impl rule__App__Group__17
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
    // InternalLightweight.g:1333:1: rule__App__Group__16__Impl : ( ',' ) ;
    public final void rule__App__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1337:1: ( ( ',' ) )
            // InternalLightweight.g:1338:1: ( ',' )
            {
            // InternalLightweight.g:1338:1: ( ',' )
            // InternalLightweight.g:1339:2: ','
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
    // InternalLightweight.g:1348:1: rule__App__Group__17 : rule__App__Group__17__Impl rule__App__Group__18 ;
    public final void rule__App__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1352:1: ( rule__App__Group__17__Impl rule__App__Group__18 )
            // InternalLightweight.g:1353:2: rule__App__Group__17__Impl rule__App__Group__18
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
    // InternalLightweight.g:1360:1: rule__App__Group__17__Impl : ( 'Procedures' ) ;
    public final void rule__App__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1364:1: ( ( 'Procedures' ) )
            // InternalLightweight.g:1365:1: ( 'Procedures' )
            {
            // InternalLightweight.g:1365:1: ( 'Procedures' )
            // InternalLightweight.g:1366:2: 'Procedures'
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
    // InternalLightweight.g:1375:1: rule__App__Group__18 : rule__App__Group__18__Impl rule__App__Group__19 ;
    public final void rule__App__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1379:1: ( rule__App__Group__18__Impl rule__App__Group__19 )
            // InternalLightweight.g:1380:2: rule__App__Group__18__Impl rule__App__Group__19
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
    // InternalLightweight.g:1387:1: rule__App__Group__18__Impl : ( ':' ) ;
    public final void rule__App__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1391:1: ( ( ':' ) )
            // InternalLightweight.g:1392:1: ( ':' )
            {
            // InternalLightweight.g:1392:1: ( ':' )
            // InternalLightweight.g:1393:2: ':'
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
    // InternalLightweight.g:1402:1: rule__App__Group__19 : rule__App__Group__19__Impl rule__App__Group__20 ;
    public final void rule__App__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1406:1: ( rule__App__Group__19__Impl rule__App__Group__20 )
            // InternalLightweight.g:1407:2: rule__App__Group__19__Impl rule__App__Group__20
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
    // InternalLightweight.g:1414:1: rule__App__Group__19__Impl : ( '[' ) ;
    public final void rule__App__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1418:1: ( ( '[' ) )
            // InternalLightweight.g:1419:1: ( '[' )
            {
            // InternalLightweight.g:1419:1: ( '[' )
            // InternalLightweight.g:1420:2: '['
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
    // InternalLightweight.g:1429:1: rule__App__Group__20 : rule__App__Group__20__Impl rule__App__Group__21 ;
    public final void rule__App__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1433:1: ( rule__App__Group__20__Impl rule__App__Group__21 )
            // InternalLightweight.g:1434:2: rule__App__Group__20__Impl rule__App__Group__21
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
    // InternalLightweight.g:1441:1: rule__App__Group__20__Impl : ( ( rule__App__PhasesAssignment_20 ) ) ;
    public final void rule__App__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1445:1: ( ( ( rule__App__PhasesAssignment_20 ) ) )
            // InternalLightweight.g:1446:1: ( ( rule__App__PhasesAssignment_20 ) )
            {
            // InternalLightweight.g:1446:1: ( ( rule__App__PhasesAssignment_20 ) )
            // InternalLightweight.g:1447:2: ( rule__App__PhasesAssignment_20 )
            {
             before(grammarAccess.getAppAccess().getPhasesAssignment_20()); 
            // InternalLightweight.g:1448:2: ( rule__App__PhasesAssignment_20 )
            // InternalLightweight.g:1448:3: rule__App__PhasesAssignment_20
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
    // InternalLightweight.g:1456:1: rule__App__Group__21 : rule__App__Group__21__Impl rule__App__Group__22 ;
    public final void rule__App__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1460:1: ( rule__App__Group__21__Impl rule__App__Group__22 )
            // InternalLightweight.g:1461:2: rule__App__Group__21__Impl rule__App__Group__22
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
    // InternalLightweight.g:1468:1: rule__App__Group__21__Impl : ( ( rule__App__Group_21__0 )* ) ;
    public final void rule__App__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1472:1: ( ( ( rule__App__Group_21__0 )* ) )
            // InternalLightweight.g:1473:1: ( ( rule__App__Group_21__0 )* )
            {
            // InternalLightweight.g:1473:1: ( ( rule__App__Group_21__0 )* )
            // InternalLightweight.g:1474:2: ( rule__App__Group_21__0 )*
            {
             before(grammarAccess.getAppAccess().getGroup_21()); 
            // InternalLightweight.g:1475:2: ( rule__App__Group_21__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==38) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLightweight.g:1475:3: rule__App__Group_21__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__App__Group_21__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalLightweight.g:1483:1: rule__App__Group__22 : rule__App__Group__22__Impl rule__App__Group__23 ;
    public final void rule__App__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1487:1: ( rule__App__Group__22__Impl rule__App__Group__23 )
            // InternalLightweight.g:1488:2: rule__App__Group__22__Impl rule__App__Group__23
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
    // InternalLightweight.g:1495:1: rule__App__Group__22__Impl : ( ']' ) ;
    public final void rule__App__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1499:1: ( ( ']' ) )
            // InternalLightweight.g:1500:1: ( ']' )
            {
            // InternalLightweight.g:1500:1: ( ']' )
            // InternalLightweight.g:1501:2: ']'
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
    // InternalLightweight.g:1510:1: rule__App__Group__23 : rule__App__Group__23__Impl ;
    public final void rule__App__Group__23() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1514:1: ( rule__App__Group__23__Impl )
            // InternalLightweight.g:1515:2: rule__App__Group__23__Impl
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
    // InternalLightweight.g:1521:1: rule__App__Group__23__Impl : ( '}' ) ;
    public final void rule__App__Group__23__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1525:1: ( ( '}' ) )
            // InternalLightweight.g:1526:1: ( '}' )
            {
            // InternalLightweight.g:1526:1: ( '}' )
            // InternalLightweight.g:1527:2: '}'
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
    // InternalLightweight.g:1537:1: rule__App__Group_7__0 : rule__App__Group_7__0__Impl rule__App__Group_7__1 ;
    public final void rule__App__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1541:1: ( rule__App__Group_7__0__Impl rule__App__Group_7__1 )
            // InternalLightweight.g:1542:2: rule__App__Group_7__0__Impl rule__App__Group_7__1
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
    // InternalLightweight.g:1549:1: rule__App__Group_7__0__Impl : ( ',' ) ;
    public final void rule__App__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1553:1: ( ( ',' ) )
            // InternalLightweight.g:1554:1: ( ',' )
            {
            // InternalLightweight.g:1554:1: ( ',' )
            // InternalLightweight.g:1555:2: ','
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
    // InternalLightweight.g:1564:1: rule__App__Group_7__1 : rule__App__Group_7__1__Impl ;
    public final void rule__App__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1568:1: ( rule__App__Group_7__1__Impl )
            // InternalLightweight.g:1569:2: rule__App__Group_7__1__Impl
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
    // InternalLightweight.g:1575:1: rule__App__Group_7__1__Impl : ( ( rule__App__AuthenticatorsAssignment_7_1 ) ) ;
    public final void rule__App__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1579:1: ( ( ( rule__App__AuthenticatorsAssignment_7_1 ) ) )
            // InternalLightweight.g:1580:1: ( ( rule__App__AuthenticatorsAssignment_7_1 ) )
            {
            // InternalLightweight.g:1580:1: ( ( rule__App__AuthenticatorsAssignment_7_1 ) )
            // InternalLightweight.g:1581:2: ( rule__App__AuthenticatorsAssignment_7_1 )
            {
             before(grammarAccess.getAppAccess().getAuthenticatorsAssignment_7_1()); 
            // InternalLightweight.g:1582:2: ( rule__App__AuthenticatorsAssignment_7_1 )
            // InternalLightweight.g:1582:3: rule__App__AuthenticatorsAssignment_7_1
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
    // InternalLightweight.g:1591:1: rule__App__Group_14__0 : rule__App__Group_14__0__Impl rule__App__Group_14__1 ;
    public final void rule__App__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1595:1: ( rule__App__Group_14__0__Impl rule__App__Group_14__1 )
            // InternalLightweight.g:1596:2: rule__App__Group_14__0__Impl rule__App__Group_14__1
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
    // InternalLightweight.g:1603:1: rule__App__Group_14__0__Impl : ( ',' ) ;
    public final void rule__App__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1607:1: ( ( ',' ) )
            // InternalLightweight.g:1608:1: ( ',' )
            {
            // InternalLightweight.g:1608:1: ( ',' )
            // InternalLightweight.g:1609:2: ','
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
    // InternalLightweight.g:1618:1: rule__App__Group_14__1 : rule__App__Group_14__1__Impl ;
    public final void rule__App__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1622:1: ( rule__App__Group_14__1__Impl )
            // InternalLightweight.g:1623:2: rule__App__Group_14__1__Impl
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
    // InternalLightweight.g:1629:1: rule__App__Group_14__1__Impl : ( ( rule__App__AuthMethodsAssignment_14_1 ) ) ;
    public final void rule__App__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1633:1: ( ( ( rule__App__AuthMethodsAssignment_14_1 ) ) )
            // InternalLightweight.g:1634:1: ( ( rule__App__AuthMethodsAssignment_14_1 ) )
            {
            // InternalLightweight.g:1634:1: ( ( rule__App__AuthMethodsAssignment_14_1 ) )
            // InternalLightweight.g:1635:2: ( rule__App__AuthMethodsAssignment_14_1 )
            {
             before(grammarAccess.getAppAccess().getAuthMethodsAssignment_14_1()); 
            // InternalLightweight.g:1636:2: ( rule__App__AuthMethodsAssignment_14_1 )
            // InternalLightweight.g:1636:3: rule__App__AuthMethodsAssignment_14_1
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
    // InternalLightweight.g:1645:1: rule__App__Group_21__0 : rule__App__Group_21__0__Impl rule__App__Group_21__1 ;
    public final void rule__App__Group_21__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1649:1: ( rule__App__Group_21__0__Impl rule__App__Group_21__1 )
            // InternalLightweight.g:1650:2: rule__App__Group_21__0__Impl rule__App__Group_21__1
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
    // InternalLightweight.g:1657:1: rule__App__Group_21__0__Impl : ( ',' ) ;
    public final void rule__App__Group_21__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1661:1: ( ( ',' ) )
            // InternalLightweight.g:1662:1: ( ',' )
            {
            // InternalLightweight.g:1662:1: ( ',' )
            // InternalLightweight.g:1663:2: ','
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
    // InternalLightweight.g:1672:1: rule__App__Group_21__1 : rule__App__Group_21__1__Impl ;
    public final void rule__App__Group_21__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1676:1: ( rule__App__Group_21__1__Impl )
            // InternalLightweight.g:1677:2: rule__App__Group_21__1__Impl
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
    // InternalLightweight.g:1683:1: rule__App__Group_21__1__Impl : ( ( rule__App__PhasesAssignment_21_1 ) ) ;
    public final void rule__App__Group_21__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1687:1: ( ( ( rule__App__PhasesAssignment_21_1 ) ) )
            // InternalLightweight.g:1688:1: ( ( rule__App__PhasesAssignment_21_1 ) )
            {
            // InternalLightweight.g:1688:1: ( ( rule__App__PhasesAssignment_21_1 ) )
            // InternalLightweight.g:1689:2: ( rule__App__PhasesAssignment_21_1 )
            {
             before(grammarAccess.getAppAccess().getPhasesAssignment_21_1()); 
            // InternalLightweight.g:1690:2: ( rule__App__PhasesAssignment_21_1 )
            // InternalLightweight.g:1690:3: rule__App__PhasesAssignment_21_1
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
    // InternalLightweight.g:1699:1: rule__MFA__Group__0 : rule__MFA__Group__0__Impl rule__MFA__Group__1 ;
    public final void rule__MFA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1703:1: ( rule__MFA__Group__0__Impl rule__MFA__Group__1 )
            // InternalLightweight.g:1704:2: rule__MFA__Group__0__Impl rule__MFA__Group__1
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
    // InternalLightweight.g:1711:1: rule__MFA__Group__0__Impl : ( ( rule__MFA__TypeAssignment_0 ) ) ;
    public final void rule__MFA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1715:1: ( ( ( rule__MFA__TypeAssignment_0 ) ) )
            // InternalLightweight.g:1716:1: ( ( rule__MFA__TypeAssignment_0 ) )
            {
            // InternalLightweight.g:1716:1: ( ( rule__MFA__TypeAssignment_0 ) )
            // InternalLightweight.g:1717:2: ( rule__MFA__TypeAssignment_0 )
            {
             before(grammarAccess.getMFAAccess().getTypeAssignment_0()); 
            // InternalLightweight.g:1718:2: ( rule__MFA__TypeAssignment_0 )
            // InternalLightweight.g:1718:3: rule__MFA__TypeAssignment_0
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
    // InternalLightweight.g:1726:1: rule__MFA__Group__1 : rule__MFA__Group__1__Impl rule__MFA__Group__2 ;
    public final void rule__MFA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1730:1: ( rule__MFA__Group__1__Impl rule__MFA__Group__2 )
            // InternalLightweight.g:1731:2: rule__MFA__Group__1__Impl rule__MFA__Group__2
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
    // InternalLightweight.g:1738:1: rule__MFA__Group__1__Impl : ( ':' ) ;
    public final void rule__MFA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1742:1: ( ( ':' ) )
            // InternalLightweight.g:1743:1: ( ':' )
            {
            // InternalLightweight.g:1743:1: ( ':' )
            // InternalLightweight.g:1744:2: ':'
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
    // InternalLightweight.g:1753:1: rule__MFA__Group__2 : rule__MFA__Group__2__Impl rule__MFA__Group__3 ;
    public final void rule__MFA__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1757:1: ( rule__MFA__Group__2__Impl rule__MFA__Group__3 )
            // InternalLightweight.g:1758:2: rule__MFA__Group__2__Impl rule__MFA__Group__3
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
    // InternalLightweight.g:1765:1: rule__MFA__Group__2__Impl : ( '{' ) ;
    public final void rule__MFA__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1769:1: ( ( '{' ) )
            // InternalLightweight.g:1770:1: ( '{' )
            {
            // InternalLightweight.g:1770:1: ( '{' )
            // InternalLightweight.g:1771:2: '{'
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
    // InternalLightweight.g:1780:1: rule__MFA__Group__3 : rule__MFA__Group__3__Impl rule__MFA__Group__4 ;
    public final void rule__MFA__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1784:1: ( rule__MFA__Group__3__Impl rule__MFA__Group__4 )
            // InternalLightweight.g:1785:2: rule__MFA__Group__3__Impl rule__MFA__Group__4
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
    // InternalLightweight.g:1792:1: rule__MFA__Group__3__Impl : ( 'name' ) ;
    public final void rule__MFA__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1796:1: ( ( 'name' ) )
            // InternalLightweight.g:1797:1: ( 'name' )
            {
            // InternalLightweight.g:1797:1: ( 'name' )
            // InternalLightweight.g:1798:2: 'name'
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
    // InternalLightweight.g:1807:1: rule__MFA__Group__4 : rule__MFA__Group__4__Impl rule__MFA__Group__5 ;
    public final void rule__MFA__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1811:1: ( rule__MFA__Group__4__Impl rule__MFA__Group__5 )
            // InternalLightweight.g:1812:2: rule__MFA__Group__4__Impl rule__MFA__Group__5
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
    // InternalLightweight.g:1819:1: rule__MFA__Group__4__Impl : ( ':' ) ;
    public final void rule__MFA__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1823:1: ( ( ':' ) )
            // InternalLightweight.g:1824:1: ( ':' )
            {
            // InternalLightweight.g:1824:1: ( ':' )
            // InternalLightweight.g:1825:2: ':'
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
    // InternalLightweight.g:1834:1: rule__MFA__Group__5 : rule__MFA__Group__5__Impl rule__MFA__Group__6 ;
    public final void rule__MFA__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1838:1: ( rule__MFA__Group__5__Impl rule__MFA__Group__6 )
            // InternalLightweight.g:1839:2: rule__MFA__Group__5__Impl rule__MFA__Group__6
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
    // InternalLightweight.g:1846:1: rule__MFA__Group__5__Impl : ( ( rule__MFA__NameAssignment_5 ) ) ;
    public final void rule__MFA__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1850:1: ( ( ( rule__MFA__NameAssignment_5 ) ) )
            // InternalLightweight.g:1851:1: ( ( rule__MFA__NameAssignment_5 ) )
            {
            // InternalLightweight.g:1851:1: ( ( rule__MFA__NameAssignment_5 ) )
            // InternalLightweight.g:1852:2: ( rule__MFA__NameAssignment_5 )
            {
             before(grammarAccess.getMFAAccess().getNameAssignment_5()); 
            // InternalLightweight.g:1853:2: ( rule__MFA__NameAssignment_5 )
            // InternalLightweight.g:1853:3: rule__MFA__NameAssignment_5
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
    // InternalLightweight.g:1861:1: rule__MFA__Group__6 : rule__MFA__Group__6__Impl rule__MFA__Group__7 ;
    public final void rule__MFA__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1865:1: ( rule__MFA__Group__6__Impl rule__MFA__Group__7 )
            // InternalLightweight.g:1866:2: rule__MFA__Group__6__Impl rule__MFA__Group__7
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
    // InternalLightweight.g:1873:1: rule__MFA__Group__6__Impl : ( ',' ) ;
    public final void rule__MFA__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1877:1: ( ( ',' ) )
            // InternalLightweight.g:1878:1: ( ',' )
            {
            // InternalLightweight.g:1878:1: ( ',' )
            // InternalLightweight.g:1879:2: ','
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
    // InternalLightweight.g:1888:1: rule__MFA__Group__7 : rule__MFA__Group__7__Impl rule__MFA__Group__8 ;
    public final void rule__MFA__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1892:1: ( rule__MFA__Group__7__Impl rule__MFA__Group__8 )
            // InternalLightweight.g:1893:2: rule__MFA__Group__7__Impl rule__MFA__Group__8
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
    // InternalLightweight.g:1900:1: rule__MFA__Group__7__Impl : ( 'authenticators' ) ;
    public final void rule__MFA__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1904:1: ( ( 'authenticators' ) )
            // InternalLightweight.g:1905:1: ( 'authenticators' )
            {
            // InternalLightweight.g:1905:1: ( 'authenticators' )
            // InternalLightweight.g:1906:2: 'authenticators'
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
    // InternalLightweight.g:1915:1: rule__MFA__Group__8 : rule__MFA__Group__8__Impl rule__MFA__Group__9 ;
    public final void rule__MFA__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1919:1: ( rule__MFA__Group__8__Impl rule__MFA__Group__9 )
            // InternalLightweight.g:1920:2: rule__MFA__Group__8__Impl rule__MFA__Group__9
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
    // InternalLightweight.g:1927:1: rule__MFA__Group__8__Impl : ( ':' ) ;
    public final void rule__MFA__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1931:1: ( ( ':' ) )
            // InternalLightweight.g:1932:1: ( ':' )
            {
            // InternalLightweight.g:1932:1: ( ':' )
            // InternalLightweight.g:1933:2: ':'
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
    // InternalLightweight.g:1942:1: rule__MFA__Group__9 : rule__MFA__Group__9__Impl rule__MFA__Group__10 ;
    public final void rule__MFA__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1946:1: ( rule__MFA__Group__9__Impl rule__MFA__Group__10 )
            // InternalLightweight.g:1947:2: rule__MFA__Group__9__Impl rule__MFA__Group__10
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
    // InternalLightweight.g:1954:1: rule__MFA__Group__9__Impl : ( ( rule__MFA__AuthenticatorsAssignment_9 ) ) ;
    public final void rule__MFA__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1958:1: ( ( ( rule__MFA__AuthenticatorsAssignment_9 ) ) )
            // InternalLightweight.g:1959:1: ( ( rule__MFA__AuthenticatorsAssignment_9 ) )
            {
            // InternalLightweight.g:1959:1: ( ( rule__MFA__AuthenticatorsAssignment_9 ) )
            // InternalLightweight.g:1960:2: ( rule__MFA__AuthenticatorsAssignment_9 )
            {
             before(grammarAccess.getMFAAccess().getAuthenticatorsAssignment_9()); 
            // InternalLightweight.g:1961:2: ( rule__MFA__AuthenticatorsAssignment_9 )
            // InternalLightweight.g:1961:3: rule__MFA__AuthenticatorsAssignment_9
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
    // InternalLightweight.g:1969:1: rule__MFA__Group__10 : rule__MFA__Group__10__Impl rule__MFA__Group__11 ;
    public final void rule__MFA__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1973:1: ( rule__MFA__Group__10__Impl rule__MFA__Group__11 )
            // InternalLightweight.g:1974:2: rule__MFA__Group__10__Impl rule__MFA__Group__11
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
    // InternalLightweight.g:1981:1: rule__MFA__Group__10__Impl : ( '&' ) ;
    public final void rule__MFA__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:1985:1: ( ( '&' ) )
            // InternalLightweight.g:1986:1: ( '&' )
            {
            // InternalLightweight.g:1986:1: ( '&' )
            // InternalLightweight.g:1987:2: '&'
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
    // InternalLightweight.g:1996:1: rule__MFA__Group__11 : rule__MFA__Group__11__Impl rule__MFA__Group__12 ;
    public final void rule__MFA__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2000:1: ( rule__MFA__Group__11__Impl rule__MFA__Group__12 )
            // InternalLightweight.g:2001:2: rule__MFA__Group__11__Impl rule__MFA__Group__12
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
    // InternalLightweight.g:2008:1: rule__MFA__Group__11__Impl : ( ( ( rule__MFA__AuthenticatorsAssignment_11 ) ) ( ( rule__MFA__AuthenticatorsAssignment_11 )* ) ) ;
    public final void rule__MFA__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2012:1: ( ( ( ( rule__MFA__AuthenticatorsAssignment_11 ) ) ( ( rule__MFA__AuthenticatorsAssignment_11 )* ) ) )
            // InternalLightweight.g:2013:1: ( ( ( rule__MFA__AuthenticatorsAssignment_11 ) ) ( ( rule__MFA__AuthenticatorsAssignment_11 )* ) )
            {
            // InternalLightweight.g:2013:1: ( ( ( rule__MFA__AuthenticatorsAssignment_11 ) ) ( ( rule__MFA__AuthenticatorsAssignment_11 )* ) )
            // InternalLightweight.g:2014:2: ( ( rule__MFA__AuthenticatorsAssignment_11 ) ) ( ( rule__MFA__AuthenticatorsAssignment_11 )* )
            {
            // InternalLightweight.g:2014:2: ( ( rule__MFA__AuthenticatorsAssignment_11 ) )
            // InternalLightweight.g:2015:3: ( rule__MFA__AuthenticatorsAssignment_11 )
            {
             before(grammarAccess.getMFAAccess().getAuthenticatorsAssignment_11()); 
            // InternalLightweight.g:2016:3: ( rule__MFA__AuthenticatorsAssignment_11 )
            // InternalLightweight.g:2016:4: rule__MFA__AuthenticatorsAssignment_11
            {
            pushFollow(FOLLOW_22);
            rule__MFA__AuthenticatorsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getMFAAccess().getAuthenticatorsAssignment_11()); 

            }

            // InternalLightweight.g:2019:2: ( ( rule__MFA__AuthenticatorsAssignment_11 )* )
            // InternalLightweight.g:2020:3: ( rule__MFA__AuthenticatorsAssignment_11 )*
            {
             before(grammarAccess.getMFAAccess().getAuthenticatorsAssignment_11()); 
            // InternalLightweight.g:2021:3: ( rule__MFA__AuthenticatorsAssignment_11 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLightweight.g:2021:4: rule__MFA__AuthenticatorsAssignment_11
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__MFA__AuthenticatorsAssignment_11();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalLightweight.g:2030:1: rule__MFA__Group__12 : rule__MFA__Group__12__Impl rule__MFA__Group__13 ;
    public final void rule__MFA__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2034:1: ( rule__MFA__Group__12__Impl rule__MFA__Group__13 )
            // InternalLightweight.g:2035:2: rule__MFA__Group__12__Impl rule__MFA__Group__13
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
    // InternalLightweight.g:2042:1: rule__MFA__Group__12__Impl : ( ( ',' )? ) ;
    public final void rule__MFA__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2046:1: ( ( ( ',' )? ) )
            // InternalLightweight.g:2047:1: ( ( ',' )? )
            {
            // InternalLightweight.g:2047:1: ( ( ',' )? )
            // InternalLightweight.g:2048:2: ( ',' )?
            {
             before(grammarAccess.getMFAAccess().getCommaKeyword_12()); 
            // InternalLightweight.g:2049:2: ( ',' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalLightweight.g:2049:3: ','
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
    // InternalLightweight.g:2057:1: rule__MFA__Group__13 : rule__MFA__Group__13__Impl rule__MFA__Group__14 ;
    public final void rule__MFA__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2061:1: ( rule__MFA__Group__13__Impl rule__MFA__Group__14 )
            // InternalLightweight.g:2062:2: rule__MFA__Group__13__Impl rule__MFA__Group__14
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
    // InternalLightweight.g:2069:1: rule__MFA__Group__13__Impl : ( 'correlation' ) ;
    public final void rule__MFA__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2073:1: ( ( 'correlation' ) )
            // InternalLightweight.g:2074:1: ( 'correlation' )
            {
            // InternalLightweight.g:2074:1: ( 'correlation' )
            // InternalLightweight.g:2075:2: 'correlation'
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
    // InternalLightweight.g:2084:1: rule__MFA__Group__14 : rule__MFA__Group__14__Impl rule__MFA__Group__15 ;
    public final void rule__MFA__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2088:1: ( rule__MFA__Group__14__Impl rule__MFA__Group__15 )
            // InternalLightweight.g:2089:2: rule__MFA__Group__14__Impl rule__MFA__Group__15
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
    // InternalLightweight.g:2096:1: rule__MFA__Group__14__Impl : ( ':' ) ;
    public final void rule__MFA__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2100:1: ( ( ':' ) )
            // InternalLightweight.g:2101:1: ( ':' )
            {
            // InternalLightweight.g:2101:1: ( ':' )
            // InternalLightweight.g:2102:2: ':'
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
    // InternalLightweight.g:2111:1: rule__MFA__Group__15 : rule__MFA__Group__15__Impl rule__MFA__Group__16 ;
    public final void rule__MFA__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2115:1: ( rule__MFA__Group__15__Impl rule__MFA__Group__16 )
            // InternalLightweight.g:2116:2: rule__MFA__Group__15__Impl rule__MFA__Group__16
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
    // InternalLightweight.g:2123:1: rule__MFA__Group__15__Impl : ( ( rule__MFA__CorrelationAssignment_15 ) ) ;
    public final void rule__MFA__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2127:1: ( ( ( rule__MFA__CorrelationAssignment_15 ) ) )
            // InternalLightweight.g:2128:1: ( ( rule__MFA__CorrelationAssignment_15 ) )
            {
            // InternalLightweight.g:2128:1: ( ( rule__MFA__CorrelationAssignment_15 ) )
            // InternalLightweight.g:2129:2: ( rule__MFA__CorrelationAssignment_15 )
            {
             before(grammarAccess.getMFAAccess().getCorrelationAssignment_15()); 
            // InternalLightweight.g:2130:2: ( rule__MFA__CorrelationAssignment_15 )
            // InternalLightweight.g:2130:3: rule__MFA__CorrelationAssignment_15
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
    // InternalLightweight.g:2138:1: rule__MFA__Group__16 : rule__MFA__Group__16__Impl rule__MFA__Group__17 ;
    public final void rule__MFA__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2142:1: ( rule__MFA__Group__16__Impl rule__MFA__Group__17 )
            // InternalLightweight.g:2143:2: rule__MFA__Group__16__Impl rule__MFA__Group__17
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
    // InternalLightweight.g:2150:1: rule__MFA__Group__16__Impl : ( ',' ) ;
    public final void rule__MFA__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2154:1: ( ( ',' ) )
            // InternalLightweight.g:2155:1: ( ',' )
            {
            // InternalLightweight.g:2155:1: ( ',' )
            // InternalLightweight.g:2156:2: ','
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
    // InternalLightweight.g:2165:1: rule__MFA__Group__17 : rule__MFA__Group__17__Impl rule__MFA__Group__18 ;
    public final void rule__MFA__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2169:1: ( rule__MFA__Group__17__Impl rule__MFA__Group__18 )
            // InternalLightweight.g:2170:2: rule__MFA__Group__17__Impl rule__MFA__Group__18
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
    // InternalLightweight.g:2177:1: rule__MFA__Group__17__Impl : ( 'validation' ) ;
    public final void rule__MFA__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2181:1: ( ( 'validation' ) )
            // InternalLightweight.g:2182:1: ( 'validation' )
            {
            // InternalLightweight.g:2182:1: ( 'validation' )
            // InternalLightweight.g:2183:2: 'validation'
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
    // InternalLightweight.g:2192:1: rule__MFA__Group__18 : rule__MFA__Group__18__Impl rule__MFA__Group__19 ;
    public final void rule__MFA__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2196:1: ( rule__MFA__Group__18__Impl rule__MFA__Group__19 )
            // InternalLightweight.g:2197:2: rule__MFA__Group__18__Impl rule__MFA__Group__19
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
    // InternalLightweight.g:2204:1: rule__MFA__Group__18__Impl : ( ':' ) ;
    public final void rule__MFA__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2208:1: ( ( ':' ) )
            // InternalLightweight.g:2209:1: ( ':' )
            {
            // InternalLightweight.g:2209:1: ( ':' )
            // InternalLightweight.g:2210:2: ':'
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
    // InternalLightweight.g:2219:1: rule__MFA__Group__19 : rule__MFA__Group__19__Impl rule__MFA__Group__20 ;
    public final void rule__MFA__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2223:1: ( rule__MFA__Group__19__Impl rule__MFA__Group__20 )
            // InternalLightweight.g:2224:2: rule__MFA__Group__19__Impl rule__MFA__Group__20
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
    // InternalLightweight.g:2231:1: rule__MFA__Group__19__Impl : ( ( rule__MFA__ValidationAssignment_19 ) ) ;
    public final void rule__MFA__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2235:1: ( ( ( rule__MFA__ValidationAssignment_19 ) ) )
            // InternalLightweight.g:2236:1: ( ( rule__MFA__ValidationAssignment_19 ) )
            {
            // InternalLightweight.g:2236:1: ( ( rule__MFA__ValidationAssignment_19 ) )
            // InternalLightweight.g:2237:2: ( rule__MFA__ValidationAssignment_19 )
            {
             before(grammarAccess.getMFAAccess().getValidationAssignment_19()); 
            // InternalLightweight.g:2238:2: ( rule__MFA__ValidationAssignment_19 )
            // InternalLightweight.g:2238:3: rule__MFA__ValidationAssignment_19
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
    // InternalLightweight.g:2246:1: rule__MFA__Group__20 : rule__MFA__Group__20__Impl ;
    public final void rule__MFA__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2250:1: ( rule__MFA__Group__20__Impl )
            // InternalLightweight.g:2251:2: rule__MFA__Group__20__Impl
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
    // InternalLightweight.g:2257:1: rule__MFA__Group__20__Impl : ( '}' ) ;
    public final void rule__MFA__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2261:1: ( ( '}' ) )
            // InternalLightweight.g:2262:1: ( '}' )
            {
            // InternalLightweight.g:2262:1: ( '}' )
            // InternalLightweight.g:2263:2: '}'
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
    // InternalLightweight.g:2273:1: rule__SFA__Group__0 : rule__SFA__Group__0__Impl rule__SFA__Group__1 ;
    public final void rule__SFA__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2277:1: ( rule__SFA__Group__0__Impl rule__SFA__Group__1 )
            // InternalLightweight.g:2278:2: rule__SFA__Group__0__Impl rule__SFA__Group__1
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
    // InternalLightweight.g:2285:1: rule__SFA__Group__0__Impl : ( ( rule__SFA__TypeAssignment_0 ) ) ;
    public final void rule__SFA__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2289:1: ( ( ( rule__SFA__TypeAssignment_0 ) ) )
            // InternalLightweight.g:2290:1: ( ( rule__SFA__TypeAssignment_0 ) )
            {
            // InternalLightweight.g:2290:1: ( ( rule__SFA__TypeAssignment_0 ) )
            // InternalLightweight.g:2291:2: ( rule__SFA__TypeAssignment_0 )
            {
             before(grammarAccess.getSFAAccess().getTypeAssignment_0()); 
            // InternalLightweight.g:2292:2: ( rule__SFA__TypeAssignment_0 )
            // InternalLightweight.g:2292:3: rule__SFA__TypeAssignment_0
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
    // InternalLightweight.g:2300:1: rule__SFA__Group__1 : rule__SFA__Group__1__Impl rule__SFA__Group__2 ;
    public final void rule__SFA__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2304:1: ( rule__SFA__Group__1__Impl rule__SFA__Group__2 )
            // InternalLightweight.g:2305:2: rule__SFA__Group__1__Impl rule__SFA__Group__2
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
    // InternalLightweight.g:2312:1: rule__SFA__Group__1__Impl : ( ':' ) ;
    public final void rule__SFA__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2316:1: ( ( ':' ) )
            // InternalLightweight.g:2317:1: ( ':' )
            {
            // InternalLightweight.g:2317:1: ( ':' )
            // InternalLightweight.g:2318:2: ':'
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
    // InternalLightweight.g:2327:1: rule__SFA__Group__2 : rule__SFA__Group__2__Impl rule__SFA__Group__3 ;
    public final void rule__SFA__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2331:1: ( rule__SFA__Group__2__Impl rule__SFA__Group__3 )
            // InternalLightweight.g:2332:2: rule__SFA__Group__2__Impl rule__SFA__Group__3
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
    // InternalLightweight.g:2339:1: rule__SFA__Group__2__Impl : ( '{' ) ;
    public final void rule__SFA__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2343:1: ( ( '{' ) )
            // InternalLightweight.g:2344:1: ( '{' )
            {
            // InternalLightweight.g:2344:1: ( '{' )
            // InternalLightweight.g:2345:2: '{'
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
    // InternalLightweight.g:2354:1: rule__SFA__Group__3 : rule__SFA__Group__3__Impl rule__SFA__Group__4 ;
    public final void rule__SFA__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2358:1: ( rule__SFA__Group__3__Impl rule__SFA__Group__4 )
            // InternalLightweight.g:2359:2: rule__SFA__Group__3__Impl rule__SFA__Group__4
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
    // InternalLightweight.g:2366:1: rule__SFA__Group__3__Impl : ( 'name' ) ;
    public final void rule__SFA__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2370:1: ( ( 'name' ) )
            // InternalLightweight.g:2371:1: ( 'name' )
            {
            // InternalLightweight.g:2371:1: ( 'name' )
            // InternalLightweight.g:2372:2: 'name'
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
    // InternalLightweight.g:2381:1: rule__SFA__Group__4 : rule__SFA__Group__4__Impl rule__SFA__Group__5 ;
    public final void rule__SFA__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2385:1: ( rule__SFA__Group__4__Impl rule__SFA__Group__5 )
            // InternalLightweight.g:2386:2: rule__SFA__Group__4__Impl rule__SFA__Group__5
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
    // InternalLightweight.g:2393:1: rule__SFA__Group__4__Impl : ( ':' ) ;
    public final void rule__SFA__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2397:1: ( ( ':' ) )
            // InternalLightweight.g:2398:1: ( ':' )
            {
            // InternalLightweight.g:2398:1: ( ':' )
            // InternalLightweight.g:2399:2: ':'
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
    // InternalLightweight.g:2408:1: rule__SFA__Group__5 : rule__SFA__Group__5__Impl rule__SFA__Group__6 ;
    public final void rule__SFA__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2412:1: ( rule__SFA__Group__5__Impl rule__SFA__Group__6 )
            // InternalLightweight.g:2413:2: rule__SFA__Group__5__Impl rule__SFA__Group__6
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
    // InternalLightweight.g:2420:1: rule__SFA__Group__5__Impl : ( ( rule__SFA__NameAssignment_5 ) ) ;
    public final void rule__SFA__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2424:1: ( ( ( rule__SFA__NameAssignment_5 ) ) )
            // InternalLightweight.g:2425:1: ( ( rule__SFA__NameAssignment_5 ) )
            {
            // InternalLightweight.g:2425:1: ( ( rule__SFA__NameAssignment_5 ) )
            // InternalLightweight.g:2426:2: ( rule__SFA__NameAssignment_5 )
            {
             before(grammarAccess.getSFAAccess().getNameAssignment_5()); 
            // InternalLightweight.g:2427:2: ( rule__SFA__NameAssignment_5 )
            // InternalLightweight.g:2427:3: rule__SFA__NameAssignment_5
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
    // InternalLightweight.g:2435:1: rule__SFA__Group__6 : rule__SFA__Group__6__Impl rule__SFA__Group__7 ;
    public final void rule__SFA__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2439:1: ( rule__SFA__Group__6__Impl rule__SFA__Group__7 )
            // InternalLightweight.g:2440:2: rule__SFA__Group__6__Impl rule__SFA__Group__7
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
    // InternalLightweight.g:2447:1: rule__SFA__Group__6__Impl : ( ',' ) ;
    public final void rule__SFA__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2451:1: ( ( ',' ) )
            // InternalLightweight.g:2452:1: ( ',' )
            {
            // InternalLightweight.g:2452:1: ( ',' )
            // InternalLightweight.g:2453:2: ','
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
    // InternalLightweight.g:2462:1: rule__SFA__Group__7 : rule__SFA__Group__7__Impl rule__SFA__Group__8 ;
    public final void rule__SFA__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2466:1: ( rule__SFA__Group__7__Impl rule__SFA__Group__8 )
            // InternalLightweight.g:2467:2: rule__SFA__Group__7__Impl rule__SFA__Group__8
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
    // InternalLightweight.g:2474:1: rule__SFA__Group__7__Impl : ( 'authenticator' ) ;
    public final void rule__SFA__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2478:1: ( ( 'authenticator' ) )
            // InternalLightweight.g:2479:1: ( 'authenticator' )
            {
            // InternalLightweight.g:2479:1: ( 'authenticator' )
            // InternalLightweight.g:2480:2: 'authenticator'
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
    // InternalLightweight.g:2489:1: rule__SFA__Group__8 : rule__SFA__Group__8__Impl rule__SFA__Group__9 ;
    public final void rule__SFA__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2493:1: ( rule__SFA__Group__8__Impl rule__SFA__Group__9 )
            // InternalLightweight.g:2494:2: rule__SFA__Group__8__Impl rule__SFA__Group__9
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
    // InternalLightweight.g:2501:1: rule__SFA__Group__8__Impl : ( ':' ) ;
    public final void rule__SFA__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2505:1: ( ( ':' ) )
            // InternalLightweight.g:2506:1: ( ':' )
            {
            // InternalLightweight.g:2506:1: ( ':' )
            // InternalLightweight.g:2507:2: ':'
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
    // InternalLightweight.g:2516:1: rule__SFA__Group__9 : rule__SFA__Group__9__Impl rule__SFA__Group__10 ;
    public final void rule__SFA__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2520:1: ( rule__SFA__Group__9__Impl rule__SFA__Group__10 )
            // InternalLightweight.g:2521:2: rule__SFA__Group__9__Impl rule__SFA__Group__10
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
    // InternalLightweight.g:2528:1: rule__SFA__Group__9__Impl : ( ( rule__SFA__AuthenticatorsAssignment_9 ) ) ;
    public final void rule__SFA__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2532:1: ( ( ( rule__SFA__AuthenticatorsAssignment_9 ) ) )
            // InternalLightweight.g:2533:1: ( ( rule__SFA__AuthenticatorsAssignment_9 ) )
            {
            // InternalLightweight.g:2533:1: ( ( rule__SFA__AuthenticatorsAssignment_9 ) )
            // InternalLightweight.g:2534:2: ( rule__SFA__AuthenticatorsAssignment_9 )
            {
             before(grammarAccess.getSFAAccess().getAuthenticatorsAssignment_9()); 
            // InternalLightweight.g:2535:2: ( rule__SFA__AuthenticatorsAssignment_9 )
            // InternalLightweight.g:2535:3: rule__SFA__AuthenticatorsAssignment_9
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
    // InternalLightweight.g:2543:1: rule__SFA__Group__10 : rule__SFA__Group__10__Impl ;
    public final void rule__SFA__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2547:1: ( rule__SFA__Group__10__Impl )
            // InternalLightweight.g:2548:2: rule__SFA__Group__10__Impl
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
    // InternalLightweight.g:2554:1: rule__SFA__Group__10__Impl : ( '}' ) ;
    public final void rule__SFA__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2558:1: ( ( '}' ) )
            // InternalLightweight.g:2559:1: ( '}' )
            {
            // InternalLightweight.g:2559:1: ( '}' )
            // InternalLightweight.g:2560:2: '}'
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
    // InternalLightweight.g:2570:1: rule__Possession__Group__0 : rule__Possession__Group__0__Impl rule__Possession__Group__1 ;
    public final void rule__Possession__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2574:1: ( rule__Possession__Group__0__Impl rule__Possession__Group__1 )
            // InternalLightweight.g:2575:2: rule__Possession__Group__0__Impl rule__Possession__Group__1
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
    // InternalLightweight.g:2582:1: rule__Possession__Group__0__Impl : ( () ) ;
    public final void rule__Possession__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2586:1: ( ( () ) )
            // InternalLightweight.g:2587:1: ( () )
            {
            // InternalLightweight.g:2587:1: ( () )
            // InternalLightweight.g:2588:2: ()
            {
             before(grammarAccess.getPossessionAccess().getPossessionAction_0()); 
            // InternalLightweight.g:2589:2: ()
            // InternalLightweight.g:2589:3: 
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
    // InternalLightweight.g:2597:1: rule__Possession__Group__1 : rule__Possession__Group__1__Impl rule__Possession__Group__2 ;
    public final void rule__Possession__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2601:1: ( rule__Possession__Group__1__Impl rule__Possession__Group__2 )
            // InternalLightweight.g:2602:2: rule__Possession__Group__1__Impl rule__Possession__Group__2
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
    // InternalLightweight.g:2609:1: rule__Possession__Group__1__Impl : ( ( rule__Possession__TypeAssignment_1 ) ) ;
    public final void rule__Possession__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2613:1: ( ( ( rule__Possession__TypeAssignment_1 ) ) )
            // InternalLightweight.g:2614:1: ( ( rule__Possession__TypeAssignment_1 ) )
            {
            // InternalLightweight.g:2614:1: ( ( rule__Possession__TypeAssignment_1 ) )
            // InternalLightweight.g:2615:2: ( rule__Possession__TypeAssignment_1 )
            {
             before(grammarAccess.getPossessionAccess().getTypeAssignment_1()); 
            // InternalLightweight.g:2616:2: ( rule__Possession__TypeAssignment_1 )
            // InternalLightweight.g:2616:3: rule__Possession__TypeAssignment_1
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
    // InternalLightweight.g:2624:1: rule__Possession__Group__2 : rule__Possession__Group__2__Impl rule__Possession__Group__3 ;
    public final void rule__Possession__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2628:1: ( rule__Possession__Group__2__Impl rule__Possession__Group__3 )
            // InternalLightweight.g:2629:2: rule__Possession__Group__2__Impl rule__Possession__Group__3
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
    // InternalLightweight.g:2636:1: rule__Possession__Group__2__Impl : ( ':' ) ;
    public final void rule__Possession__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2640:1: ( ( ':' ) )
            // InternalLightweight.g:2641:1: ( ':' )
            {
            // InternalLightweight.g:2641:1: ( ':' )
            // InternalLightweight.g:2642:2: ':'
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
    // InternalLightweight.g:2651:1: rule__Possession__Group__3 : rule__Possession__Group__3__Impl rule__Possession__Group__4 ;
    public final void rule__Possession__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2655:1: ( rule__Possession__Group__3__Impl rule__Possession__Group__4 )
            // InternalLightweight.g:2656:2: rule__Possession__Group__3__Impl rule__Possession__Group__4
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
    // InternalLightweight.g:2663:1: rule__Possession__Group__3__Impl : ( '{' ) ;
    public final void rule__Possession__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2667:1: ( ( '{' ) )
            // InternalLightweight.g:2668:1: ( '{' )
            {
            // InternalLightweight.g:2668:1: ( '{' )
            // InternalLightweight.g:2669:2: '{'
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
    // InternalLightweight.g:2678:1: rule__Possession__Group__4 : rule__Possession__Group__4__Impl rule__Possession__Group__5 ;
    public final void rule__Possession__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2682:1: ( rule__Possession__Group__4__Impl rule__Possession__Group__5 )
            // InternalLightweight.g:2683:2: rule__Possession__Group__4__Impl rule__Possession__Group__5
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
    // InternalLightweight.g:2690:1: rule__Possession__Group__4__Impl : ( 'name' ) ;
    public final void rule__Possession__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2694:1: ( ( 'name' ) )
            // InternalLightweight.g:2695:1: ( 'name' )
            {
            // InternalLightweight.g:2695:1: ( 'name' )
            // InternalLightweight.g:2696:2: 'name'
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
    // InternalLightweight.g:2705:1: rule__Possession__Group__5 : rule__Possession__Group__5__Impl rule__Possession__Group__6 ;
    public final void rule__Possession__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2709:1: ( rule__Possession__Group__5__Impl rule__Possession__Group__6 )
            // InternalLightweight.g:2710:2: rule__Possession__Group__5__Impl rule__Possession__Group__6
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
    // InternalLightweight.g:2717:1: rule__Possession__Group__5__Impl : ( ':' ) ;
    public final void rule__Possession__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2721:1: ( ( ':' ) )
            // InternalLightweight.g:2722:1: ( ':' )
            {
            // InternalLightweight.g:2722:1: ( ':' )
            // InternalLightweight.g:2723:2: ':'
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
    // InternalLightweight.g:2732:1: rule__Possession__Group__6 : rule__Possession__Group__6__Impl rule__Possession__Group__7 ;
    public final void rule__Possession__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2736:1: ( rule__Possession__Group__6__Impl rule__Possession__Group__7 )
            // InternalLightweight.g:2737:2: rule__Possession__Group__6__Impl rule__Possession__Group__7
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
    // InternalLightweight.g:2744:1: rule__Possession__Group__6__Impl : ( ( rule__Possession__NameAssignment_6 ) ) ;
    public final void rule__Possession__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2748:1: ( ( ( rule__Possession__NameAssignment_6 ) ) )
            // InternalLightweight.g:2749:1: ( ( rule__Possession__NameAssignment_6 ) )
            {
            // InternalLightweight.g:2749:1: ( ( rule__Possession__NameAssignment_6 ) )
            // InternalLightweight.g:2750:2: ( rule__Possession__NameAssignment_6 )
            {
             before(grammarAccess.getPossessionAccess().getNameAssignment_6()); 
            // InternalLightweight.g:2751:2: ( rule__Possession__NameAssignment_6 )
            // InternalLightweight.g:2751:3: rule__Possession__NameAssignment_6
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
    // InternalLightweight.g:2759:1: rule__Possession__Group__7 : rule__Possession__Group__7__Impl rule__Possession__Group__8 ;
    public final void rule__Possession__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2763:1: ( rule__Possession__Group__7__Impl rule__Possession__Group__8 )
            // InternalLightweight.g:2764:2: rule__Possession__Group__7__Impl rule__Possession__Group__8
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
    // InternalLightweight.g:2771:1: rule__Possession__Group__7__Impl : ( ',' ) ;
    public final void rule__Possession__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2775:1: ( ( ',' ) )
            // InternalLightweight.g:2776:1: ( ',' )
            {
            // InternalLightweight.g:2776:1: ( ',' )
            // InternalLightweight.g:2777:2: ','
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
    // InternalLightweight.g:2786:1: rule__Possession__Group__8 : rule__Possession__Group__8__Impl rule__Possession__Group__9 ;
    public final void rule__Possession__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2790:1: ( rule__Possession__Group__8__Impl rule__Possession__Group__9 )
            // InternalLightweight.g:2791:2: rule__Possession__Group__8__Impl rule__Possession__Group__9
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
    // InternalLightweight.g:2798:1: rule__Possession__Group__8__Impl : ( 'value' ) ;
    public final void rule__Possession__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2802:1: ( ( 'value' ) )
            // InternalLightweight.g:2803:1: ( 'value' )
            {
            // InternalLightweight.g:2803:1: ( 'value' )
            // InternalLightweight.g:2804:2: 'value'
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
    // InternalLightweight.g:2813:1: rule__Possession__Group__9 : rule__Possession__Group__9__Impl rule__Possession__Group__10 ;
    public final void rule__Possession__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2817:1: ( rule__Possession__Group__9__Impl rule__Possession__Group__10 )
            // InternalLightweight.g:2818:2: rule__Possession__Group__9__Impl rule__Possession__Group__10
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
    // InternalLightweight.g:2825:1: rule__Possession__Group__9__Impl : ( ':' ) ;
    public final void rule__Possession__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2829:1: ( ( ':' ) )
            // InternalLightweight.g:2830:1: ( ':' )
            {
            // InternalLightweight.g:2830:1: ( ':' )
            // InternalLightweight.g:2831:2: ':'
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
    // InternalLightweight.g:2840:1: rule__Possession__Group__10 : rule__Possession__Group__10__Impl rule__Possession__Group__11 ;
    public final void rule__Possession__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2844:1: ( rule__Possession__Group__10__Impl rule__Possession__Group__11 )
            // InternalLightweight.g:2845:2: rule__Possession__Group__10__Impl rule__Possession__Group__11
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
    // InternalLightweight.g:2852:1: rule__Possession__Group__10__Impl : ( ( rule__Possession__ValueAssignment_10 ) ) ;
    public final void rule__Possession__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2856:1: ( ( ( rule__Possession__ValueAssignment_10 ) ) )
            // InternalLightweight.g:2857:1: ( ( rule__Possession__ValueAssignment_10 ) )
            {
            // InternalLightweight.g:2857:1: ( ( rule__Possession__ValueAssignment_10 ) )
            // InternalLightweight.g:2858:2: ( rule__Possession__ValueAssignment_10 )
            {
             before(grammarAccess.getPossessionAccess().getValueAssignment_10()); 
            // InternalLightweight.g:2859:2: ( rule__Possession__ValueAssignment_10 )
            // InternalLightweight.g:2859:3: rule__Possession__ValueAssignment_10
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
    // InternalLightweight.g:2867:1: rule__Possession__Group__11 : rule__Possession__Group__11__Impl ;
    public final void rule__Possession__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2871:1: ( rule__Possession__Group__11__Impl )
            // InternalLightweight.g:2872:2: rule__Possession__Group__11__Impl
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
    // InternalLightweight.g:2878:1: rule__Possession__Group__11__Impl : ( '}' ) ;
    public final void rule__Possession__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2882:1: ( ( '}' ) )
            // InternalLightweight.g:2883:1: ( '}' )
            {
            // InternalLightweight.g:2883:1: ( '}' )
            // InternalLightweight.g:2884:2: '}'
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
    // InternalLightweight.g:2894:1: rule__Knowledge__Group__0 : rule__Knowledge__Group__0__Impl rule__Knowledge__Group__1 ;
    public final void rule__Knowledge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2898:1: ( rule__Knowledge__Group__0__Impl rule__Knowledge__Group__1 )
            // InternalLightweight.g:2899:2: rule__Knowledge__Group__0__Impl rule__Knowledge__Group__1
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
    // InternalLightweight.g:2906:1: rule__Knowledge__Group__0__Impl : ( () ) ;
    public final void rule__Knowledge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2910:1: ( ( () ) )
            // InternalLightweight.g:2911:1: ( () )
            {
            // InternalLightweight.g:2911:1: ( () )
            // InternalLightweight.g:2912:2: ()
            {
             before(grammarAccess.getKnowledgeAccess().getKnowledgeAction_0()); 
            // InternalLightweight.g:2913:2: ()
            // InternalLightweight.g:2913:3: 
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
    // InternalLightweight.g:2921:1: rule__Knowledge__Group__1 : rule__Knowledge__Group__1__Impl rule__Knowledge__Group__2 ;
    public final void rule__Knowledge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2925:1: ( rule__Knowledge__Group__1__Impl rule__Knowledge__Group__2 )
            // InternalLightweight.g:2926:2: rule__Knowledge__Group__1__Impl rule__Knowledge__Group__2
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
    // InternalLightweight.g:2933:1: rule__Knowledge__Group__1__Impl : ( ( rule__Knowledge__TypeAssignment_1 ) ) ;
    public final void rule__Knowledge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2937:1: ( ( ( rule__Knowledge__TypeAssignment_1 ) ) )
            // InternalLightweight.g:2938:1: ( ( rule__Knowledge__TypeAssignment_1 ) )
            {
            // InternalLightweight.g:2938:1: ( ( rule__Knowledge__TypeAssignment_1 ) )
            // InternalLightweight.g:2939:2: ( rule__Knowledge__TypeAssignment_1 )
            {
             before(grammarAccess.getKnowledgeAccess().getTypeAssignment_1()); 
            // InternalLightweight.g:2940:2: ( rule__Knowledge__TypeAssignment_1 )
            // InternalLightweight.g:2940:3: rule__Knowledge__TypeAssignment_1
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
    // InternalLightweight.g:2948:1: rule__Knowledge__Group__2 : rule__Knowledge__Group__2__Impl rule__Knowledge__Group__3 ;
    public final void rule__Knowledge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2952:1: ( rule__Knowledge__Group__2__Impl rule__Knowledge__Group__3 )
            // InternalLightweight.g:2953:2: rule__Knowledge__Group__2__Impl rule__Knowledge__Group__3
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
    // InternalLightweight.g:2960:1: rule__Knowledge__Group__2__Impl : ( ':' ) ;
    public final void rule__Knowledge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2964:1: ( ( ':' ) )
            // InternalLightweight.g:2965:1: ( ':' )
            {
            // InternalLightweight.g:2965:1: ( ':' )
            // InternalLightweight.g:2966:2: ':'
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
    // InternalLightweight.g:2975:1: rule__Knowledge__Group__3 : rule__Knowledge__Group__3__Impl rule__Knowledge__Group__4 ;
    public final void rule__Knowledge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2979:1: ( rule__Knowledge__Group__3__Impl rule__Knowledge__Group__4 )
            // InternalLightweight.g:2980:2: rule__Knowledge__Group__3__Impl rule__Knowledge__Group__4
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
    // InternalLightweight.g:2987:1: rule__Knowledge__Group__3__Impl : ( '{' ) ;
    public final void rule__Knowledge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:2991:1: ( ( '{' ) )
            // InternalLightweight.g:2992:1: ( '{' )
            {
            // InternalLightweight.g:2992:1: ( '{' )
            // InternalLightweight.g:2993:2: '{'
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
    // InternalLightweight.g:3002:1: rule__Knowledge__Group__4 : rule__Knowledge__Group__4__Impl rule__Knowledge__Group__5 ;
    public final void rule__Knowledge__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3006:1: ( rule__Knowledge__Group__4__Impl rule__Knowledge__Group__5 )
            // InternalLightweight.g:3007:2: rule__Knowledge__Group__4__Impl rule__Knowledge__Group__5
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
    // InternalLightweight.g:3014:1: rule__Knowledge__Group__4__Impl : ( 'name' ) ;
    public final void rule__Knowledge__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3018:1: ( ( 'name' ) )
            // InternalLightweight.g:3019:1: ( 'name' )
            {
            // InternalLightweight.g:3019:1: ( 'name' )
            // InternalLightweight.g:3020:2: 'name'
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
    // InternalLightweight.g:3029:1: rule__Knowledge__Group__5 : rule__Knowledge__Group__5__Impl rule__Knowledge__Group__6 ;
    public final void rule__Knowledge__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3033:1: ( rule__Knowledge__Group__5__Impl rule__Knowledge__Group__6 )
            // InternalLightweight.g:3034:2: rule__Knowledge__Group__5__Impl rule__Knowledge__Group__6
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
    // InternalLightweight.g:3041:1: rule__Knowledge__Group__5__Impl : ( ':' ) ;
    public final void rule__Knowledge__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3045:1: ( ( ':' ) )
            // InternalLightweight.g:3046:1: ( ':' )
            {
            // InternalLightweight.g:3046:1: ( ':' )
            // InternalLightweight.g:3047:2: ':'
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
    // InternalLightweight.g:3056:1: rule__Knowledge__Group__6 : rule__Knowledge__Group__6__Impl rule__Knowledge__Group__7 ;
    public final void rule__Knowledge__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3060:1: ( rule__Knowledge__Group__6__Impl rule__Knowledge__Group__7 )
            // InternalLightweight.g:3061:2: rule__Knowledge__Group__6__Impl rule__Knowledge__Group__7
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
    // InternalLightweight.g:3068:1: rule__Knowledge__Group__6__Impl : ( ( rule__Knowledge__NameAssignment_6 ) ) ;
    public final void rule__Knowledge__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3072:1: ( ( ( rule__Knowledge__NameAssignment_6 ) ) )
            // InternalLightweight.g:3073:1: ( ( rule__Knowledge__NameAssignment_6 ) )
            {
            // InternalLightweight.g:3073:1: ( ( rule__Knowledge__NameAssignment_6 ) )
            // InternalLightweight.g:3074:2: ( rule__Knowledge__NameAssignment_6 )
            {
             before(grammarAccess.getKnowledgeAccess().getNameAssignment_6()); 
            // InternalLightweight.g:3075:2: ( rule__Knowledge__NameAssignment_6 )
            // InternalLightweight.g:3075:3: rule__Knowledge__NameAssignment_6
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
    // InternalLightweight.g:3083:1: rule__Knowledge__Group__7 : rule__Knowledge__Group__7__Impl rule__Knowledge__Group__8 ;
    public final void rule__Knowledge__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3087:1: ( rule__Knowledge__Group__7__Impl rule__Knowledge__Group__8 )
            // InternalLightweight.g:3088:2: rule__Knowledge__Group__7__Impl rule__Knowledge__Group__8
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
    // InternalLightweight.g:3095:1: rule__Knowledge__Group__7__Impl : ( ',' ) ;
    public final void rule__Knowledge__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3099:1: ( ( ',' ) )
            // InternalLightweight.g:3100:1: ( ',' )
            {
            // InternalLightweight.g:3100:1: ( ',' )
            // InternalLightweight.g:3101:2: ','
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
    // InternalLightweight.g:3110:1: rule__Knowledge__Group__8 : rule__Knowledge__Group__8__Impl rule__Knowledge__Group__9 ;
    public final void rule__Knowledge__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3114:1: ( rule__Knowledge__Group__8__Impl rule__Knowledge__Group__9 )
            // InternalLightweight.g:3115:2: rule__Knowledge__Group__8__Impl rule__Knowledge__Group__9
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
    // InternalLightweight.g:3122:1: rule__Knowledge__Group__8__Impl : ( 'value' ) ;
    public final void rule__Knowledge__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3126:1: ( ( 'value' ) )
            // InternalLightweight.g:3127:1: ( 'value' )
            {
            // InternalLightweight.g:3127:1: ( 'value' )
            // InternalLightweight.g:3128:2: 'value'
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
    // InternalLightweight.g:3137:1: rule__Knowledge__Group__9 : rule__Knowledge__Group__9__Impl rule__Knowledge__Group__10 ;
    public final void rule__Knowledge__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3141:1: ( rule__Knowledge__Group__9__Impl rule__Knowledge__Group__10 )
            // InternalLightweight.g:3142:2: rule__Knowledge__Group__9__Impl rule__Knowledge__Group__10
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
    // InternalLightweight.g:3149:1: rule__Knowledge__Group__9__Impl : ( ':' ) ;
    public final void rule__Knowledge__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3153:1: ( ( ':' ) )
            // InternalLightweight.g:3154:1: ( ':' )
            {
            // InternalLightweight.g:3154:1: ( ':' )
            // InternalLightweight.g:3155:2: ':'
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
    // InternalLightweight.g:3164:1: rule__Knowledge__Group__10 : rule__Knowledge__Group__10__Impl rule__Knowledge__Group__11 ;
    public final void rule__Knowledge__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3168:1: ( rule__Knowledge__Group__10__Impl rule__Knowledge__Group__11 )
            // InternalLightweight.g:3169:2: rule__Knowledge__Group__10__Impl rule__Knowledge__Group__11
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
    // InternalLightweight.g:3176:1: rule__Knowledge__Group__10__Impl : ( ( rule__Knowledge__ValueAssignment_10 ) ) ;
    public final void rule__Knowledge__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3180:1: ( ( ( rule__Knowledge__ValueAssignment_10 ) ) )
            // InternalLightweight.g:3181:1: ( ( rule__Knowledge__ValueAssignment_10 ) )
            {
            // InternalLightweight.g:3181:1: ( ( rule__Knowledge__ValueAssignment_10 ) )
            // InternalLightweight.g:3182:2: ( rule__Knowledge__ValueAssignment_10 )
            {
             before(grammarAccess.getKnowledgeAccess().getValueAssignment_10()); 
            // InternalLightweight.g:3183:2: ( rule__Knowledge__ValueAssignment_10 )
            // InternalLightweight.g:3183:3: rule__Knowledge__ValueAssignment_10
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
    // InternalLightweight.g:3191:1: rule__Knowledge__Group__11 : rule__Knowledge__Group__11__Impl rule__Knowledge__Group__12 ;
    public final void rule__Knowledge__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3195:1: ( rule__Knowledge__Group__11__Impl rule__Knowledge__Group__12 )
            // InternalLightweight.g:3196:2: rule__Knowledge__Group__11__Impl rule__Knowledge__Group__12
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
    // InternalLightweight.g:3203:1: rule__Knowledge__Group__11__Impl : ( ',' ) ;
    public final void rule__Knowledge__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3207:1: ( ( ',' ) )
            // InternalLightweight.g:3208:1: ( ',' )
            {
            // InternalLightweight.g:3208:1: ( ',' )
            // InternalLightweight.g:3209:2: ','
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
    // InternalLightweight.g:3218:1: rule__Knowledge__Group__12 : rule__Knowledge__Group__12__Impl rule__Knowledge__Group__13 ;
    public final void rule__Knowledge__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3222:1: ( rule__Knowledge__Group__12__Impl rule__Knowledge__Group__13 )
            // InternalLightweight.g:3223:2: rule__Knowledge__Group__12__Impl rule__Knowledge__Group__13
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
    // InternalLightweight.g:3230:1: rule__Knowledge__Group__12__Impl : ( 'limitedAttempts' ) ;
    public final void rule__Knowledge__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3234:1: ( ( 'limitedAttempts' ) )
            // InternalLightweight.g:3235:1: ( 'limitedAttempts' )
            {
            // InternalLightweight.g:3235:1: ( 'limitedAttempts' )
            // InternalLightweight.g:3236:2: 'limitedAttempts'
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
    // InternalLightweight.g:3245:1: rule__Knowledge__Group__13 : rule__Knowledge__Group__13__Impl rule__Knowledge__Group__14 ;
    public final void rule__Knowledge__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3249:1: ( rule__Knowledge__Group__13__Impl rule__Knowledge__Group__14 )
            // InternalLightweight.g:3250:2: rule__Knowledge__Group__13__Impl rule__Knowledge__Group__14
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
    // InternalLightweight.g:3257:1: rule__Knowledge__Group__13__Impl : ( ':' ) ;
    public final void rule__Knowledge__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3261:1: ( ( ':' ) )
            // InternalLightweight.g:3262:1: ( ':' )
            {
            // InternalLightweight.g:3262:1: ( ':' )
            // InternalLightweight.g:3263:2: ':'
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
    // InternalLightweight.g:3272:1: rule__Knowledge__Group__14 : rule__Knowledge__Group__14__Impl rule__Knowledge__Group__15 ;
    public final void rule__Knowledge__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3276:1: ( rule__Knowledge__Group__14__Impl rule__Knowledge__Group__15 )
            // InternalLightweight.g:3277:2: rule__Knowledge__Group__14__Impl rule__Knowledge__Group__15
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
    // InternalLightweight.g:3284:1: rule__Knowledge__Group__14__Impl : ( ( rule__Knowledge__LimitedAttemptsAssignment_14 ) ) ;
    public final void rule__Knowledge__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3288:1: ( ( ( rule__Knowledge__LimitedAttemptsAssignment_14 ) ) )
            // InternalLightweight.g:3289:1: ( ( rule__Knowledge__LimitedAttemptsAssignment_14 ) )
            {
            // InternalLightweight.g:3289:1: ( ( rule__Knowledge__LimitedAttemptsAssignment_14 ) )
            // InternalLightweight.g:3290:2: ( rule__Knowledge__LimitedAttemptsAssignment_14 )
            {
             before(grammarAccess.getKnowledgeAccess().getLimitedAttemptsAssignment_14()); 
            // InternalLightweight.g:3291:2: ( rule__Knowledge__LimitedAttemptsAssignment_14 )
            // InternalLightweight.g:3291:3: rule__Knowledge__LimitedAttemptsAssignment_14
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
    // InternalLightweight.g:3299:1: rule__Knowledge__Group__15 : rule__Knowledge__Group__15__Impl rule__Knowledge__Group__16 ;
    public final void rule__Knowledge__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3303:1: ( rule__Knowledge__Group__15__Impl rule__Knowledge__Group__16 )
            // InternalLightweight.g:3304:2: rule__Knowledge__Group__15__Impl rule__Knowledge__Group__16
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
    // InternalLightweight.g:3311:1: rule__Knowledge__Group__15__Impl : ( ',' ) ;
    public final void rule__Knowledge__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3315:1: ( ( ',' ) )
            // InternalLightweight.g:3316:1: ( ',' )
            {
            // InternalLightweight.g:3316:1: ( ',' )
            // InternalLightweight.g:3317:2: ','
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
    // InternalLightweight.g:3326:1: rule__Knowledge__Group__16 : rule__Knowledge__Group__16__Impl rule__Knowledge__Group__17 ;
    public final void rule__Knowledge__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3330:1: ( rule__Knowledge__Group__16__Impl rule__Knowledge__Group__17 )
            // InternalLightweight.g:3331:2: rule__Knowledge__Group__16__Impl rule__Knowledge__Group__17
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
    // InternalLightweight.g:3338:1: rule__Knowledge__Group__16__Impl : ( 'autofillable' ) ;
    public final void rule__Knowledge__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3342:1: ( ( 'autofillable' ) )
            // InternalLightweight.g:3343:1: ( 'autofillable' )
            {
            // InternalLightweight.g:3343:1: ( 'autofillable' )
            // InternalLightweight.g:3344:2: 'autofillable'
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
    // InternalLightweight.g:3353:1: rule__Knowledge__Group__17 : rule__Knowledge__Group__17__Impl rule__Knowledge__Group__18 ;
    public final void rule__Knowledge__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3357:1: ( rule__Knowledge__Group__17__Impl rule__Knowledge__Group__18 )
            // InternalLightweight.g:3358:2: rule__Knowledge__Group__17__Impl rule__Knowledge__Group__18
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
    // InternalLightweight.g:3365:1: rule__Knowledge__Group__17__Impl : ( ':' ) ;
    public final void rule__Knowledge__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3369:1: ( ( ':' ) )
            // InternalLightweight.g:3370:1: ( ':' )
            {
            // InternalLightweight.g:3370:1: ( ':' )
            // InternalLightweight.g:3371:2: ':'
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
    // InternalLightweight.g:3380:1: rule__Knowledge__Group__18 : rule__Knowledge__Group__18__Impl rule__Knowledge__Group__19 ;
    public final void rule__Knowledge__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3384:1: ( rule__Knowledge__Group__18__Impl rule__Knowledge__Group__19 )
            // InternalLightweight.g:3385:2: rule__Knowledge__Group__18__Impl rule__Knowledge__Group__19
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
    // InternalLightweight.g:3392:1: rule__Knowledge__Group__18__Impl : ( ( rule__Knowledge__AutofilledAssignment_18 ) ) ;
    public final void rule__Knowledge__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3396:1: ( ( ( rule__Knowledge__AutofilledAssignment_18 ) ) )
            // InternalLightweight.g:3397:1: ( ( rule__Knowledge__AutofilledAssignment_18 ) )
            {
            // InternalLightweight.g:3397:1: ( ( rule__Knowledge__AutofilledAssignment_18 ) )
            // InternalLightweight.g:3398:2: ( rule__Knowledge__AutofilledAssignment_18 )
            {
             before(grammarAccess.getKnowledgeAccess().getAutofilledAssignment_18()); 
            // InternalLightweight.g:3399:2: ( rule__Knowledge__AutofilledAssignment_18 )
            // InternalLightweight.g:3399:3: rule__Knowledge__AutofilledAssignment_18
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
    // InternalLightweight.g:3407:1: rule__Knowledge__Group__19 : rule__Knowledge__Group__19__Impl ;
    public final void rule__Knowledge__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3411:1: ( rule__Knowledge__Group__19__Impl )
            // InternalLightweight.g:3412:2: rule__Knowledge__Group__19__Impl
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
    // InternalLightweight.g:3418:1: rule__Knowledge__Group__19__Impl : ( '}' ) ;
    public final void rule__Knowledge__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3422:1: ( ( '}' ) )
            // InternalLightweight.g:3423:1: ( '}' )
            {
            // InternalLightweight.g:3423:1: ( '}' )
            // InternalLightweight.g:3424:2: '}'
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
    // InternalLightweight.g:3434:1: rule__Biometrics__Group__0 : rule__Biometrics__Group__0__Impl rule__Biometrics__Group__1 ;
    public final void rule__Biometrics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3438:1: ( rule__Biometrics__Group__0__Impl rule__Biometrics__Group__1 )
            // InternalLightweight.g:3439:2: rule__Biometrics__Group__0__Impl rule__Biometrics__Group__1
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
    // InternalLightweight.g:3446:1: rule__Biometrics__Group__0__Impl : ( () ) ;
    public final void rule__Biometrics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3450:1: ( ( () ) )
            // InternalLightweight.g:3451:1: ( () )
            {
            // InternalLightweight.g:3451:1: ( () )
            // InternalLightweight.g:3452:2: ()
            {
             before(grammarAccess.getBiometricsAccess().getBiometricsAction_0()); 
            // InternalLightweight.g:3453:2: ()
            // InternalLightweight.g:3453:3: 
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
    // InternalLightweight.g:3461:1: rule__Biometrics__Group__1 : rule__Biometrics__Group__1__Impl rule__Biometrics__Group__2 ;
    public final void rule__Biometrics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3465:1: ( rule__Biometrics__Group__1__Impl rule__Biometrics__Group__2 )
            // InternalLightweight.g:3466:2: rule__Biometrics__Group__1__Impl rule__Biometrics__Group__2
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
    // InternalLightweight.g:3473:1: rule__Biometrics__Group__1__Impl : ( ( rule__Biometrics__TypeAssignment_1 ) ) ;
    public final void rule__Biometrics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3477:1: ( ( ( rule__Biometrics__TypeAssignment_1 ) ) )
            // InternalLightweight.g:3478:1: ( ( rule__Biometrics__TypeAssignment_1 ) )
            {
            // InternalLightweight.g:3478:1: ( ( rule__Biometrics__TypeAssignment_1 ) )
            // InternalLightweight.g:3479:2: ( rule__Biometrics__TypeAssignment_1 )
            {
             before(grammarAccess.getBiometricsAccess().getTypeAssignment_1()); 
            // InternalLightweight.g:3480:2: ( rule__Biometrics__TypeAssignment_1 )
            // InternalLightweight.g:3480:3: rule__Biometrics__TypeAssignment_1
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
    // InternalLightweight.g:3488:1: rule__Biometrics__Group__2 : rule__Biometrics__Group__2__Impl rule__Biometrics__Group__3 ;
    public final void rule__Biometrics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3492:1: ( rule__Biometrics__Group__2__Impl rule__Biometrics__Group__3 )
            // InternalLightweight.g:3493:2: rule__Biometrics__Group__2__Impl rule__Biometrics__Group__3
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
    // InternalLightweight.g:3500:1: rule__Biometrics__Group__2__Impl : ( ':' ) ;
    public final void rule__Biometrics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3504:1: ( ( ':' ) )
            // InternalLightweight.g:3505:1: ( ':' )
            {
            // InternalLightweight.g:3505:1: ( ':' )
            // InternalLightweight.g:3506:2: ':'
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
    // InternalLightweight.g:3515:1: rule__Biometrics__Group__3 : rule__Biometrics__Group__3__Impl rule__Biometrics__Group__4 ;
    public final void rule__Biometrics__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3519:1: ( rule__Biometrics__Group__3__Impl rule__Biometrics__Group__4 )
            // InternalLightweight.g:3520:2: rule__Biometrics__Group__3__Impl rule__Biometrics__Group__4
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
    // InternalLightweight.g:3527:1: rule__Biometrics__Group__3__Impl : ( '{' ) ;
    public final void rule__Biometrics__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3531:1: ( ( '{' ) )
            // InternalLightweight.g:3532:1: ( '{' )
            {
            // InternalLightweight.g:3532:1: ( '{' )
            // InternalLightweight.g:3533:2: '{'
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
    // InternalLightweight.g:3542:1: rule__Biometrics__Group__4 : rule__Biometrics__Group__4__Impl rule__Biometrics__Group__5 ;
    public final void rule__Biometrics__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3546:1: ( rule__Biometrics__Group__4__Impl rule__Biometrics__Group__5 )
            // InternalLightweight.g:3547:2: rule__Biometrics__Group__4__Impl rule__Biometrics__Group__5
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
    // InternalLightweight.g:3554:1: rule__Biometrics__Group__4__Impl : ( 'name' ) ;
    public final void rule__Biometrics__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3558:1: ( ( 'name' ) )
            // InternalLightweight.g:3559:1: ( 'name' )
            {
            // InternalLightweight.g:3559:1: ( 'name' )
            // InternalLightweight.g:3560:2: 'name'
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
    // InternalLightweight.g:3569:1: rule__Biometrics__Group__5 : rule__Biometrics__Group__5__Impl rule__Biometrics__Group__6 ;
    public final void rule__Biometrics__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3573:1: ( rule__Biometrics__Group__5__Impl rule__Biometrics__Group__6 )
            // InternalLightweight.g:3574:2: rule__Biometrics__Group__5__Impl rule__Biometrics__Group__6
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
    // InternalLightweight.g:3581:1: rule__Biometrics__Group__5__Impl : ( ':' ) ;
    public final void rule__Biometrics__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3585:1: ( ( ':' ) )
            // InternalLightweight.g:3586:1: ( ':' )
            {
            // InternalLightweight.g:3586:1: ( ':' )
            // InternalLightweight.g:3587:2: ':'
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
    // InternalLightweight.g:3596:1: rule__Biometrics__Group__6 : rule__Biometrics__Group__6__Impl rule__Biometrics__Group__7 ;
    public final void rule__Biometrics__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3600:1: ( rule__Biometrics__Group__6__Impl rule__Biometrics__Group__7 )
            // InternalLightweight.g:3601:2: rule__Biometrics__Group__6__Impl rule__Biometrics__Group__7
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
    // InternalLightweight.g:3608:1: rule__Biometrics__Group__6__Impl : ( ( rule__Biometrics__NameAssignment_6 ) ) ;
    public final void rule__Biometrics__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3612:1: ( ( ( rule__Biometrics__NameAssignment_6 ) ) )
            // InternalLightweight.g:3613:1: ( ( rule__Biometrics__NameAssignment_6 ) )
            {
            // InternalLightweight.g:3613:1: ( ( rule__Biometrics__NameAssignment_6 ) )
            // InternalLightweight.g:3614:2: ( rule__Biometrics__NameAssignment_6 )
            {
             before(grammarAccess.getBiometricsAccess().getNameAssignment_6()); 
            // InternalLightweight.g:3615:2: ( rule__Biometrics__NameAssignment_6 )
            // InternalLightweight.g:3615:3: rule__Biometrics__NameAssignment_6
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
    // InternalLightweight.g:3623:1: rule__Biometrics__Group__7 : rule__Biometrics__Group__7__Impl rule__Biometrics__Group__8 ;
    public final void rule__Biometrics__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3627:1: ( rule__Biometrics__Group__7__Impl rule__Biometrics__Group__8 )
            // InternalLightweight.g:3628:2: rule__Biometrics__Group__7__Impl rule__Biometrics__Group__8
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
    // InternalLightweight.g:3635:1: rule__Biometrics__Group__7__Impl : ( ',' ) ;
    public final void rule__Biometrics__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3639:1: ( ( ',' ) )
            // InternalLightweight.g:3640:1: ( ',' )
            {
            // InternalLightweight.g:3640:1: ( ',' )
            // InternalLightweight.g:3641:2: ','
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
    // InternalLightweight.g:3650:1: rule__Biometrics__Group__8 : rule__Biometrics__Group__8__Impl rule__Biometrics__Group__9 ;
    public final void rule__Biometrics__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3654:1: ( rule__Biometrics__Group__8__Impl rule__Biometrics__Group__9 )
            // InternalLightweight.g:3655:2: rule__Biometrics__Group__8__Impl rule__Biometrics__Group__9
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
    // InternalLightweight.g:3662:1: rule__Biometrics__Group__8__Impl : ( 'value' ) ;
    public final void rule__Biometrics__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3666:1: ( ( 'value' ) )
            // InternalLightweight.g:3667:1: ( 'value' )
            {
            // InternalLightweight.g:3667:1: ( 'value' )
            // InternalLightweight.g:3668:2: 'value'
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
    // InternalLightweight.g:3677:1: rule__Biometrics__Group__9 : rule__Biometrics__Group__9__Impl rule__Biometrics__Group__10 ;
    public final void rule__Biometrics__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3681:1: ( rule__Biometrics__Group__9__Impl rule__Biometrics__Group__10 )
            // InternalLightweight.g:3682:2: rule__Biometrics__Group__9__Impl rule__Biometrics__Group__10
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
    // InternalLightweight.g:3689:1: rule__Biometrics__Group__9__Impl : ( ':' ) ;
    public final void rule__Biometrics__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3693:1: ( ( ':' ) )
            // InternalLightweight.g:3694:1: ( ':' )
            {
            // InternalLightweight.g:3694:1: ( ':' )
            // InternalLightweight.g:3695:2: ':'
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
    // InternalLightweight.g:3704:1: rule__Biometrics__Group__10 : rule__Biometrics__Group__10__Impl rule__Biometrics__Group__11 ;
    public final void rule__Biometrics__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3708:1: ( rule__Biometrics__Group__10__Impl rule__Biometrics__Group__11 )
            // InternalLightweight.g:3709:2: rule__Biometrics__Group__10__Impl rule__Biometrics__Group__11
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
    // InternalLightweight.g:3716:1: rule__Biometrics__Group__10__Impl : ( ( rule__Biometrics__ValueAssignment_10 ) ) ;
    public final void rule__Biometrics__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3720:1: ( ( ( rule__Biometrics__ValueAssignment_10 ) ) )
            // InternalLightweight.g:3721:1: ( ( rule__Biometrics__ValueAssignment_10 ) )
            {
            // InternalLightweight.g:3721:1: ( ( rule__Biometrics__ValueAssignment_10 ) )
            // InternalLightweight.g:3722:2: ( rule__Biometrics__ValueAssignment_10 )
            {
             before(grammarAccess.getBiometricsAccess().getValueAssignment_10()); 
            // InternalLightweight.g:3723:2: ( rule__Biometrics__ValueAssignment_10 )
            // InternalLightweight.g:3723:3: rule__Biometrics__ValueAssignment_10
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
    // InternalLightweight.g:3731:1: rule__Biometrics__Group__11 : rule__Biometrics__Group__11__Impl ;
    public final void rule__Biometrics__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3735:1: ( rule__Biometrics__Group__11__Impl )
            // InternalLightweight.g:3736:2: rule__Biometrics__Group__11__Impl
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
    // InternalLightweight.g:3742:1: rule__Biometrics__Group__11__Impl : ( '}' ) ;
    public final void rule__Biometrics__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3746:1: ( ( '}' ) )
            // InternalLightweight.g:3747:1: ( '}' )
            {
            // InternalLightweight.g:3747:1: ( '}' )
            // InternalLightweight.g:3748:2: '}'
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
    // InternalLightweight.g:3758:1: rule__Registration__Group__0 : rule__Registration__Group__0__Impl rule__Registration__Group__1 ;
    public final void rule__Registration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3762:1: ( rule__Registration__Group__0__Impl rule__Registration__Group__1 )
            // InternalLightweight.g:3763:2: rule__Registration__Group__0__Impl rule__Registration__Group__1
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
    // InternalLightweight.g:3770:1: rule__Registration__Group__0__Impl : ( () ) ;
    public final void rule__Registration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3774:1: ( ( () ) )
            // InternalLightweight.g:3775:1: ( () )
            {
            // InternalLightweight.g:3775:1: ( () )
            // InternalLightweight.g:3776:2: ()
            {
             before(grammarAccess.getRegistrationAccess().getRegistrationAction_0()); 
            // InternalLightweight.g:3777:2: ()
            // InternalLightweight.g:3777:3: 
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
    // InternalLightweight.g:3785:1: rule__Registration__Group__1 : rule__Registration__Group__1__Impl rule__Registration__Group__2 ;
    public final void rule__Registration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3789:1: ( rule__Registration__Group__1__Impl rule__Registration__Group__2 )
            // InternalLightweight.g:3790:2: rule__Registration__Group__1__Impl rule__Registration__Group__2
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
    // InternalLightweight.g:3797:1: rule__Registration__Group__1__Impl : ( ( rule__Registration__TypeAssignment_1 ) ) ;
    public final void rule__Registration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3801:1: ( ( ( rule__Registration__TypeAssignment_1 ) ) )
            // InternalLightweight.g:3802:1: ( ( rule__Registration__TypeAssignment_1 ) )
            {
            // InternalLightweight.g:3802:1: ( ( rule__Registration__TypeAssignment_1 ) )
            // InternalLightweight.g:3803:2: ( rule__Registration__TypeAssignment_1 )
            {
             before(grammarAccess.getRegistrationAccess().getTypeAssignment_1()); 
            // InternalLightweight.g:3804:2: ( rule__Registration__TypeAssignment_1 )
            // InternalLightweight.g:3804:3: rule__Registration__TypeAssignment_1
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
    // InternalLightweight.g:3812:1: rule__Registration__Group__2 : rule__Registration__Group__2__Impl rule__Registration__Group__3 ;
    public final void rule__Registration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3816:1: ( rule__Registration__Group__2__Impl rule__Registration__Group__3 )
            // InternalLightweight.g:3817:2: rule__Registration__Group__2__Impl rule__Registration__Group__3
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
    // InternalLightweight.g:3824:1: rule__Registration__Group__2__Impl : ( ':' ) ;
    public final void rule__Registration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3828:1: ( ( ':' ) )
            // InternalLightweight.g:3829:1: ( ':' )
            {
            // InternalLightweight.g:3829:1: ( ':' )
            // InternalLightweight.g:3830:2: ':'
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
    // InternalLightweight.g:3839:1: rule__Registration__Group__3 : rule__Registration__Group__3__Impl rule__Registration__Group__4 ;
    public final void rule__Registration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3843:1: ( rule__Registration__Group__3__Impl rule__Registration__Group__4 )
            // InternalLightweight.g:3844:2: rule__Registration__Group__3__Impl rule__Registration__Group__4
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
    // InternalLightweight.g:3851:1: rule__Registration__Group__3__Impl : ( '{' ) ;
    public final void rule__Registration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3855:1: ( ( '{' ) )
            // InternalLightweight.g:3856:1: ( '{' )
            {
            // InternalLightweight.g:3856:1: ( '{' )
            // InternalLightweight.g:3857:2: '{'
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
    // InternalLightweight.g:3866:1: rule__Registration__Group__4 : rule__Registration__Group__4__Impl rule__Registration__Group__5 ;
    public final void rule__Registration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3870:1: ( rule__Registration__Group__4__Impl rule__Registration__Group__5 )
            // InternalLightweight.g:3871:2: rule__Registration__Group__4__Impl rule__Registration__Group__5
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
    // InternalLightweight.g:3878:1: rule__Registration__Group__4__Impl : ( 'name' ) ;
    public final void rule__Registration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3882:1: ( ( 'name' ) )
            // InternalLightweight.g:3883:1: ( 'name' )
            {
            // InternalLightweight.g:3883:1: ( 'name' )
            // InternalLightweight.g:3884:2: 'name'
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
    // InternalLightweight.g:3893:1: rule__Registration__Group__5 : rule__Registration__Group__5__Impl rule__Registration__Group__6 ;
    public final void rule__Registration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3897:1: ( rule__Registration__Group__5__Impl rule__Registration__Group__6 )
            // InternalLightweight.g:3898:2: rule__Registration__Group__5__Impl rule__Registration__Group__6
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
    // InternalLightweight.g:3905:1: rule__Registration__Group__5__Impl : ( ':' ) ;
    public final void rule__Registration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3909:1: ( ( ':' ) )
            // InternalLightweight.g:3910:1: ( ':' )
            {
            // InternalLightweight.g:3910:1: ( ':' )
            // InternalLightweight.g:3911:2: ':'
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
    // InternalLightweight.g:3920:1: rule__Registration__Group__6 : rule__Registration__Group__6__Impl rule__Registration__Group__7 ;
    public final void rule__Registration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3924:1: ( rule__Registration__Group__6__Impl rule__Registration__Group__7 )
            // InternalLightweight.g:3925:2: rule__Registration__Group__6__Impl rule__Registration__Group__7
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
    // InternalLightweight.g:3932:1: rule__Registration__Group__6__Impl : ( ( rule__Registration__NameAssignment_6 ) ) ;
    public final void rule__Registration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3936:1: ( ( ( rule__Registration__NameAssignment_6 ) ) )
            // InternalLightweight.g:3937:1: ( ( rule__Registration__NameAssignment_6 ) )
            {
            // InternalLightweight.g:3937:1: ( ( rule__Registration__NameAssignment_6 ) )
            // InternalLightweight.g:3938:2: ( rule__Registration__NameAssignment_6 )
            {
             before(grammarAccess.getRegistrationAccess().getNameAssignment_6()); 
            // InternalLightweight.g:3939:2: ( rule__Registration__NameAssignment_6 )
            // InternalLightweight.g:3939:3: rule__Registration__NameAssignment_6
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
    // InternalLightweight.g:3947:1: rule__Registration__Group__7 : rule__Registration__Group__7__Impl rule__Registration__Group__8 ;
    public final void rule__Registration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3951:1: ( rule__Registration__Group__7__Impl rule__Registration__Group__8 )
            // InternalLightweight.g:3952:2: rule__Registration__Group__7__Impl rule__Registration__Group__8
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
    // InternalLightweight.g:3959:1: rule__Registration__Group__7__Impl : ( ',' ) ;
    public final void rule__Registration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3963:1: ( ( ',' ) )
            // InternalLightweight.g:3964:1: ( ',' )
            {
            // InternalLightweight.g:3964:1: ( ',' )
            // InternalLightweight.g:3965:2: ','
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
    // InternalLightweight.g:3974:1: rule__Registration__Group__8 : rule__Registration__Group__8__Impl rule__Registration__Group__9 ;
    public final void rule__Registration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3978:1: ( rule__Registration__Group__8__Impl rule__Registration__Group__9 )
            // InternalLightweight.g:3979:2: rule__Registration__Group__8__Impl rule__Registration__Group__9
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
    // InternalLightweight.g:3986:1: rule__Registration__Group__8__Impl : ( 'attributes' ) ;
    public final void rule__Registration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:3990:1: ( ( 'attributes' ) )
            // InternalLightweight.g:3991:1: ( 'attributes' )
            {
            // InternalLightweight.g:3991:1: ( 'attributes' )
            // InternalLightweight.g:3992:2: 'attributes'
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
    // InternalLightweight.g:4001:1: rule__Registration__Group__9 : rule__Registration__Group__9__Impl rule__Registration__Group__10 ;
    public final void rule__Registration__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4005:1: ( rule__Registration__Group__9__Impl rule__Registration__Group__10 )
            // InternalLightweight.g:4006:2: rule__Registration__Group__9__Impl rule__Registration__Group__10
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
    // InternalLightweight.g:4013:1: rule__Registration__Group__9__Impl : ( ':' ) ;
    public final void rule__Registration__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4017:1: ( ( ':' ) )
            // InternalLightweight.g:4018:1: ( ':' )
            {
            // InternalLightweight.g:4018:1: ( ':' )
            // InternalLightweight.g:4019:2: ':'
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
    // InternalLightweight.g:4028:1: rule__Registration__Group__10 : rule__Registration__Group__10__Impl rule__Registration__Group__11 ;
    public final void rule__Registration__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4032:1: ( rule__Registration__Group__10__Impl rule__Registration__Group__11 )
            // InternalLightweight.g:4033:2: rule__Registration__Group__10__Impl rule__Registration__Group__11
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
    // InternalLightweight.g:4040:1: rule__Registration__Group__10__Impl : ( '[' ) ;
    public final void rule__Registration__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4044:1: ( ( '[' ) )
            // InternalLightweight.g:4045:1: ( '[' )
            {
            // InternalLightweight.g:4045:1: ( '[' )
            // InternalLightweight.g:4046:2: '['
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
    // InternalLightweight.g:4055:1: rule__Registration__Group__11 : rule__Registration__Group__11__Impl rule__Registration__Group__12 ;
    public final void rule__Registration__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4059:1: ( rule__Registration__Group__11__Impl rule__Registration__Group__12 )
            // InternalLightweight.g:4060:2: rule__Registration__Group__11__Impl rule__Registration__Group__12
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
    // InternalLightweight.g:4067:1: rule__Registration__Group__11__Impl : ( ( rule__Registration__AttributesAssignment_11 ) ) ;
    public final void rule__Registration__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4071:1: ( ( ( rule__Registration__AttributesAssignment_11 ) ) )
            // InternalLightweight.g:4072:1: ( ( rule__Registration__AttributesAssignment_11 ) )
            {
            // InternalLightweight.g:4072:1: ( ( rule__Registration__AttributesAssignment_11 ) )
            // InternalLightweight.g:4073:2: ( rule__Registration__AttributesAssignment_11 )
            {
             before(grammarAccess.getRegistrationAccess().getAttributesAssignment_11()); 
            // InternalLightweight.g:4074:2: ( rule__Registration__AttributesAssignment_11 )
            // InternalLightweight.g:4074:3: rule__Registration__AttributesAssignment_11
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
    // InternalLightweight.g:4082:1: rule__Registration__Group__12 : rule__Registration__Group__12__Impl rule__Registration__Group__13 ;
    public final void rule__Registration__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4086:1: ( rule__Registration__Group__12__Impl rule__Registration__Group__13 )
            // InternalLightweight.g:4087:2: rule__Registration__Group__12__Impl rule__Registration__Group__13
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
    // InternalLightweight.g:4094:1: rule__Registration__Group__12__Impl : ( ( rule__Registration__Group_12__0 )* ) ;
    public final void rule__Registration__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4098:1: ( ( ( rule__Registration__Group_12__0 )* ) )
            // InternalLightweight.g:4099:1: ( ( rule__Registration__Group_12__0 )* )
            {
            // InternalLightweight.g:4099:1: ( ( rule__Registration__Group_12__0 )* )
            // InternalLightweight.g:4100:2: ( rule__Registration__Group_12__0 )*
            {
             before(grammarAccess.getRegistrationAccess().getGroup_12()); 
            // InternalLightweight.g:4101:2: ( rule__Registration__Group_12__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalLightweight.g:4101:3: rule__Registration__Group_12__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Registration__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalLightweight.g:4109:1: rule__Registration__Group__13 : rule__Registration__Group__13__Impl rule__Registration__Group__14 ;
    public final void rule__Registration__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4113:1: ( rule__Registration__Group__13__Impl rule__Registration__Group__14 )
            // InternalLightweight.g:4114:2: rule__Registration__Group__13__Impl rule__Registration__Group__14
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
    // InternalLightweight.g:4121:1: rule__Registration__Group__13__Impl : ( ']' ) ;
    public final void rule__Registration__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4125:1: ( ( ']' ) )
            // InternalLightweight.g:4126:1: ( ']' )
            {
            // InternalLightweight.g:4126:1: ( ']' )
            // InternalLightweight.g:4127:2: ']'
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
    // InternalLightweight.g:4136:1: rule__Registration__Group__14 : rule__Registration__Group__14__Impl ;
    public final void rule__Registration__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4140:1: ( rule__Registration__Group__14__Impl )
            // InternalLightweight.g:4141:2: rule__Registration__Group__14__Impl
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
    // InternalLightweight.g:4147:1: rule__Registration__Group__14__Impl : ( '}' ) ;
    public final void rule__Registration__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4151:1: ( ( '}' ) )
            // InternalLightweight.g:4152:1: ( '}' )
            {
            // InternalLightweight.g:4152:1: ( '}' )
            // InternalLightweight.g:4153:2: '}'
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
    // InternalLightweight.g:4163:1: rule__Registration__Group_12__0 : rule__Registration__Group_12__0__Impl rule__Registration__Group_12__1 ;
    public final void rule__Registration__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4167:1: ( rule__Registration__Group_12__0__Impl rule__Registration__Group_12__1 )
            // InternalLightweight.g:4168:2: rule__Registration__Group_12__0__Impl rule__Registration__Group_12__1
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
    // InternalLightweight.g:4175:1: rule__Registration__Group_12__0__Impl : ( ',' ) ;
    public final void rule__Registration__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4179:1: ( ( ',' ) )
            // InternalLightweight.g:4180:1: ( ',' )
            {
            // InternalLightweight.g:4180:1: ( ',' )
            // InternalLightweight.g:4181:2: ','
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
    // InternalLightweight.g:4190:1: rule__Registration__Group_12__1 : rule__Registration__Group_12__1__Impl ;
    public final void rule__Registration__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4194:1: ( rule__Registration__Group_12__1__Impl )
            // InternalLightweight.g:4195:2: rule__Registration__Group_12__1__Impl
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
    // InternalLightweight.g:4201:1: rule__Registration__Group_12__1__Impl : ( ( rule__Registration__AttributesAssignment_12_1 ) ) ;
    public final void rule__Registration__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4205:1: ( ( ( rule__Registration__AttributesAssignment_12_1 ) ) )
            // InternalLightweight.g:4206:1: ( ( rule__Registration__AttributesAssignment_12_1 ) )
            {
            // InternalLightweight.g:4206:1: ( ( rule__Registration__AttributesAssignment_12_1 ) )
            // InternalLightweight.g:4207:2: ( rule__Registration__AttributesAssignment_12_1 )
            {
             before(grammarAccess.getRegistrationAccess().getAttributesAssignment_12_1()); 
            // InternalLightweight.g:4208:2: ( rule__Registration__AttributesAssignment_12_1 )
            // InternalLightweight.g:4208:3: rule__Registration__AttributesAssignment_12_1
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
    // InternalLightweight.g:4217:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4221:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // InternalLightweight.g:4222:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
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
    // InternalLightweight.g:4229:1: rule__Attribute__Group__0__Impl : ( () ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4233:1: ( ( () ) )
            // InternalLightweight.g:4234:1: ( () )
            {
            // InternalLightweight.g:4234:1: ( () )
            // InternalLightweight.g:4235:2: ()
            {
             before(grammarAccess.getAttributeAccess().getAttributeAction_0()); 
            // InternalLightweight.g:4236:2: ()
            // InternalLightweight.g:4236:3: 
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
    // InternalLightweight.g:4244:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4248:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // InternalLightweight.g:4249:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
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
    // InternalLightweight.g:4256:1: rule__Attribute__Group__1__Impl : ( '{' ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4260:1: ( ( '{' ) )
            // InternalLightweight.g:4261:1: ( '{' )
            {
            // InternalLightweight.g:4261:1: ( '{' )
            // InternalLightweight.g:4262:2: '{'
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
    // InternalLightweight.g:4271:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4275:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // InternalLightweight.g:4276:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
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
    // InternalLightweight.g:4283:1: rule__Attribute__Group__2__Impl : ( 'name' ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4287:1: ( ( 'name' ) )
            // InternalLightweight.g:4288:1: ( 'name' )
            {
            // InternalLightweight.g:4288:1: ( 'name' )
            // InternalLightweight.g:4289:2: 'name'
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
    // InternalLightweight.g:4298:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4302:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // InternalLightweight.g:4303:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
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
    // InternalLightweight.g:4310:1: rule__Attribute__Group__3__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4314:1: ( ( ':' ) )
            // InternalLightweight.g:4315:1: ( ':' )
            {
            // InternalLightweight.g:4315:1: ( ':' )
            // InternalLightweight.g:4316:2: ':'
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
    // InternalLightweight.g:4325:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4329:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // InternalLightweight.g:4330:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
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
    // InternalLightweight.g:4337:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__NameAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4341:1: ( ( ( rule__Attribute__NameAssignment_4 ) ) )
            // InternalLightweight.g:4342:1: ( ( rule__Attribute__NameAssignment_4 ) )
            {
            // InternalLightweight.g:4342:1: ( ( rule__Attribute__NameAssignment_4 ) )
            // InternalLightweight.g:4343:2: ( rule__Attribute__NameAssignment_4 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_4()); 
            // InternalLightweight.g:4344:2: ( rule__Attribute__NameAssignment_4 )
            // InternalLightweight.g:4344:3: rule__Attribute__NameAssignment_4
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
    // InternalLightweight.g:4352:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl rule__Attribute__Group__6 ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4356:1: ( rule__Attribute__Group__5__Impl rule__Attribute__Group__6 )
            // InternalLightweight.g:4357:2: rule__Attribute__Group__5__Impl rule__Attribute__Group__6
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
    // InternalLightweight.g:4364:1: rule__Attribute__Group__5__Impl : ( ',' ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4368:1: ( ( ',' ) )
            // InternalLightweight.g:4369:1: ( ',' )
            {
            // InternalLightweight.g:4369:1: ( ',' )
            // InternalLightweight.g:4370:2: ','
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
    // InternalLightweight.g:4379:1: rule__Attribute__Group__6 : rule__Attribute__Group__6__Impl rule__Attribute__Group__7 ;
    public final void rule__Attribute__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4383:1: ( rule__Attribute__Group__6__Impl rule__Attribute__Group__7 )
            // InternalLightweight.g:4384:2: rule__Attribute__Group__6__Impl rule__Attribute__Group__7
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
    // InternalLightweight.g:4391:1: rule__Attribute__Group__6__Impl : ( 'provider' ) ;
    public final void rule__Attribute__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4395:1: ( ( 'provider' ) )
            // InternalLightweight.g:4396:1: ( 'provider' )
            {
            // InternalLightweight.g:4396:1: ( 'provider' )
            // InternalLightweight.g:4397:2: 'provider'
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
    // InternalLightweight.g:4406:1: rule__Attribute__Group__7 : rule__Attribute__Group__7__Impl rule__Attribute__Group__8 ;
    public final void rule__Attribute__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4410:1: ( rule__Attribute__Group__7__Impl rule__Attribute__Group__8 )
            // InternalLightweight.g:4411:2: rule__Attribute__Group__7__Impl rule__Attribute__Group__8
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
    // InternalLightweight.g:4418:1: rule__Attribute__Group__7__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4422:1: ( ( ':' ) )
            // InternalLightweight.g:4423:1: ( ':' )
            {
            // InternalLightweight.g:4423:1: ( ':' )
            // InternalLightweight.g:4424:2: ':'
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
    // InternalLightweight.g:4433:1: rule__Attribute__Group__8 : rule__Attribute__Group__8__Impl rule__Attribute__Group__9 ;
    public final void rule__Attribute__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4437:1: ( rule__Attribute__Group__8__Impl rule__Attribute__Group__9 )
            // InternalLightweight.g:4438:2: rule__Attribute__Group__8__Impl rule__Attribute__Group__9
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
    // InternalLightweight.g:4445:1: rule__Attribute__Group__8__Impl : ( ( rule__Attribute__ProviderAssignment_8 ) ) ;
    public final void rule__Attribute__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4449:1: ( ( ( rule__Attribute__ProviderAssignment_8 ) ) )
            // InternalLightweight.g:4450:1: ( ( rule__Attribute__ProviderAssignment_8 ) )
            {
            // InternalLightweight.g:4450:1: ( ( rule__Attribute__ProviderAssignment_8 ) )
            // InternalLightweight.g:4451:2: ( rule__Attribute__ProviderAssignment_8 )
            {
             before(grammarAccess.getAttributeAccess().getProviderAssignment_8()); 
            // InternalLightweight.g:4452:2: ( rule__Attribute__ProviderAssignment_8 )
            // InternalLightweight.g:4452:3: rule__Attribute__ProviderAssignment_8
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
    // InternalLightweight.g:4460:1: rule__Attribute__Group__9 : rule__Attribute__Group__9__Impl rule__Attribute__Group__10 ;
    public final void rule__Attribute__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4464:1: ( rule__Attribute__Group__9__Impl rule__Attribute__Group__10 )
            // InternalLightweight.g:4465:2: rule__Attribute__Group__9__Impl rule__Attribute__Group__10
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
    // InternalLightweight.g:4472:1: rule__Attribute__Group__9__Impl : ( ',' ) ;
    public final void rule__Attribute__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4476:1: ( ( ',' ) )
            // InternalLightweight.g:4477:1: ( ',' )
            {
            // InternalLightweight.g:4477:1: ( ',' )
            // InternalLightweight.g:4478:2: ','
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
    // InternalLightweight.g:4487:1: rule__Attribute__Group__10 : rule__Attribute__Group__10__Impl rule__Attribute__Group__11 ;
    public final void rule__Attribute__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4491:1: ( rule__Attribute__Group__10__Impl rule__Attribute__Group__11 )
            // InternalLightweight.g:4492:2: rule__Attribute__Group__10__Impl rule__Attribute__Group__11
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
    // InternalLightweight.g:4499:1: rule__Attribute__Group__10__Impl : ( 'type' ) ;
    public final void rule__Attribute__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4503:1: ( ( 'type' ) )
            // InternalLightweight.g:4504:1: ( 'type' )
            {
            // InternalLightweight.g:4504:1: ( 'type' )
            // InternalLightweight.g:4505:2: 'type'
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
    // InternalLightweight.g:4514:1: rule__Attribute__Group__11 : rule__Attribute__Group__11__Impl rule__Attribute__Group__12 ;
    public final void rule__Attribute__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4518:1: ( rule__Attribute__Group__11__Impl rule__Attribute__Group__12 )
            // InternalLightweight.g:4519:2: rule__Attribute__Group__11__Impl rule__Attribute__Group__12
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
    // InternalLightweight.g:4526:1: rule__Attribute__Group__11__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4530:1: ( ( ':' ) )
            // InternalLightweight.g:4531:1: ( ':' )
            {
            // InternalLightweight.g:4531:1: ( ':' )
            // InternalLightweight.g:4532:2: ':'
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
    // InternalLightweight.g:4541:1: rule__Attribute__Group__12 : rule__Attribute__Group__12__Impl rule__Attribute__Group__13 ;
    public final void rule__Attribute__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4545:1: ( rule__Attribute__Group__12__Impl rule__Attribute__Group__13 )
            // InternalLightweight.g:4546:2: rule__Attribute__Group__12__Impl rule__Attribute__Group__13
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
    // InternalLightweight.g:4553:1: rule__Attribute__Group__12__Impl : ( ( rule__Attribute__TypeAssignment_12 ) ) ;
    public final void rule__Attribute__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4557:1: ( ( ( rule__Attribute__TypeAssignment_12 ) ) )
            // InternalLightweight.g:4558:1: ( ( rule__Attribute__TypeAssignment_12 ) )
            {
            // InternalLightweight.g:4558:1: ( ( rule__Attribute__TypeAssignment_12 ) )
            // InternalLightweight.g:4559:2: ( rule__Attribute__TypeAssignment_12 )
            {
             before(grammarAccess.getAttributeAccess().getTypeAssignment_12()); 
            // InternalLightweight.g:4560:2: ( rule__Attribute__TypeAssignment_12 )
            // InternalLightweight.g:4560:3: rule__Attribute__TypeAssignment_12
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
    // InternalLightweight.g:4568:1: rule__Attribute__Group__13 : rule__Attribute__Group__13__Impl rule__Attribute__Group__14 ;
    public final void rule__Attribute__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4572:1: ( rule__Attribute__Group__13__Impl rule__Attribute__Group__14 )
            // InternalLightweight.g:4573:2: rule__Attribute__Group__13__Impl rule__Attribute__Group__14
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
    // InternalLightweight.g:4580:1: rule__Attribute__Group__13__Impl : ( ',' ) ;
    public final void rule__Attribute__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4584:1: ( ( ',' ) )
            // InternalLightweight.g:4585:1: ( ',' )
            {
            // InternalLightweight.g:4585:1: ( ',' )
            // InternalLightweight.g:4586:2: ','
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
    // InternalLightweight.g:4595:1: rule__Attribute__Group__14 : rule__Attribute__Group__14__Impl rule__Attribute__Group__15 ;
    public final void rule__Attribute__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4599:1: ( rule__Attribute__Group__14__Impl rule__Attribute__Group__15 )
            // InternalLightweight.g:4600:2: rule__Attribute__Group__14__Impl rule__Attribute__Group__15
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
    // InternalLightweight.g:4607:1: rule__Attribute__Group__14__Impl : ( ( rule__Attribute__Group_14__0 )? ) ;
    public final void rule__Attribute__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4611:1: ( ( ( rule__Attribute__Group_14__0 )? ) )
            // InternalLightweight.g:4612:1: ( ( rule__Attribute__Group_14__0 )? )
            {
            // InternalLightweight.g:4612:1: ( ( rule__Attribute__Group_14__0 )? )
            // InternalLightweight.g:4613:2: ( rule__Attribute__Group_14__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_14()); 
            // InternalLightweight.g:4614:2: ( rule__Attribute__Group_14__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==54) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLightweight.g:4614:3: rule__Attribute__Group_14__0
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
    // InternalLightweight.g:4622:1: rule__Attribute__Group__15 : rule__Attribute__Group__15__Impl ;
    public final void rule__Attribute__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4626:1: ( rule__Attribute__Group__15__Impl )
            // InternalLightweight.g:4627:2: rule__Attribute__Group__15__Impl
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
    // InternalLightweight.g:4633:1: rule__Attribute__Group__15__Impl : ( '}' ) ;
    public final void rule__Attribute__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4637:1: ( ( '}' ) )
            // InternalLightweight.g:4638:1: ( '}' )
            {
            // InternalLightweight.g:4638:1: ( '}' )
            // InternalLightweight.g:4639:2: '}'
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
    // InternalLightweight.g:4649:1: rule__Attribute__Group_14__0 : rule__Attribute__Group_14__0__Impl rule__Attribute__Group_14__1 ;
    public final void rule__Attribute__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4653:1: ( rule__Attribute__Group_14__0__Impl rule__Attribute__Group_14__1 )
            // InternalLightweight.g:4654:2: rule__Attribute__Group_14__0__Impl rule__Attribute__Group_14__1
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
    // InternalLightweight.g:4661:1: rule__Attribute__Group_14__0__Impl : ( 'verification' ) ;
    public final void rule__Attribute__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4665:1: ( ( 'verification' ) )
            // InternalLightweight.g:4666:1: ( 'verification' )
            {
            // InternalLightweight.g:4666:1: ( 'verification' )
            // InternalLightweight.g:4667:2: 'verification'
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
    // InternalLightweight.g:4676:1: rule__Attribute__Group_14__1 : rule__Attribute__Group_14__1__Impl rule__Attribute__Group_14__2 ;
    public final void rule__Attribute__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4680:1: ( rule__Attribute__Group_14__1__Impl rule__Attribute__Group_14__2 )
            // InternalLightweight.g:4681:2: rule__Attribute__Group_14__1__Impl rule__Attribute__Group_14__2
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
    // InternalLightweight.g:4688:1: rule__Attribute__Group_14__1__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4692:1: ( ( ':' ) )
            // InternalLightweight.g:4693:1: ( ':' )
            {
            // InternalLightweight.g:4693:1: ( ':' )
            // InternalLightweight.g:4694:2: ':'
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
    // InternalLightweight.g:4703:1: rule__Attribute__Group_14__2 : rule__Attribute__Group_14__2__Impl ;
    public final void rule__Attribute__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4707:1: ( rule__Attribute__Group_14__2__Impl )
            // InternalLightweight.g:4708:2: rule__Attribute__Group_14__2__Impl
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
    // InternalLightweight.g:4714:1: rule__Attribute__Group_14__2__Impl : ( ( rule__Attribute__VerifmethodAssignment_14_2 ) ) ;
    public final void rule__Attribute__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4718:1: ( ( ( rule__Attribute__VerifmethodAssignment_14_2 ) ) )
            // InternalLightweight.g:4719:1: ( ( rule__Attribute__VerifmethodAssignment_14_2 ) )
            {
            // InternalLightweight.g:4719:1: ( ( rule__Attribute__VerifmethodAssignment_14_2 ) )
            // InternalLightweight.g:4720:2: ( rule__Attribute__VerifmethodAssignment_14_2 )
            {
             before(grammarAccess.getAttributeAccess().getVerifmethodAssignment_14_2()); 
            // InternalLightweight.g:4721:2: ( rule__Attribute__VerifmethodAssignment_14_2 )
            // InternalLightweight.g:4721:3: rule__Attribute__VerifmethodAssignment_14_2
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
    // InternalLightweight.g:4730:1: rule__VerifMethod__Group__0 : rule__VerifMethod__Group__0__Impl rule__VerifMethod__Group__1 ;
    public final void rule__VerifMethod__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4734:1: ( rule__VerifMethod__Group__0__Impl rule__VerifMethod__Group__1 )
            // InternalLightweight.g:4735:2: rule__VerifMethod__Group__0__Impl rule__VerifMethod__Group__1
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
    // InternalLightweight.g:4742:1: rule__VerifMethod__Group__0__Impl : ( () ) ;
    public final void rule__VerifMethod__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4746:1: ( ( () ) )
            // InternalLightweight.g:4747:1: ( () )
            {
            // InternalLightweight.g:4747:1: ( () )
            // InternalLightweight.g:4748:2: ()
            {
             before(grammarAccess.getVerifMethodAccess().getVerifMethodAction_0()); 
            // InternalLightweight.g:4749:2: ()
            // InternalLightweight.g:4749:3: 
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
    // InternalLightweight.g:4757:1: rule__VerifMethod__Group__1 : rule__VerifMethod__Group__1__Impl rule__VerifMethod__Group__2 ;
    public final void rule__VerifMethod__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4761:1: ( rule__VerifMethod__Group__1__Impl rule__VerifMethod__Group__2 )
            // InternalLightweight.g:4762:2: rule__VerifMethod__Group__1__Impl rule__VerifMethod__Group__2
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
    // InternalLightweight.g:4769:1: rule__VerifMethod__Group__1__Impl : ( '{' ) ;
    public final void rule__VerifMethod__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4773:1: ( ( '{' ) )
            // InternalLightweight.g:4774:1: ( '{' )
            {
            // InternalLightweight.g:4774:1: ( '{' )
            // InternalLightweight.g:4775:2: '{'
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
    // InternalLightweight.g:4784:1: rule__VerifMethod__Group__2 : rule__VerifMethod__Group__2__Impl rule__VerifMethod__Group__3 ;
    public final void rule__VerifMethod__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4788:1: ( rule__VerifMethod__Group__2__Impl rule__VerifMethod__Group__3 )
            // InternalLightweight.g:4789:2: rule__VerifMethod__Group__2__Impl rule__VerifMethod__Group__3
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
    // InternalLightweight.g:4796:1: rule__VerifMethod__Group__2__Impl : ( 'validity' ) ;
    public final void rule__VerifMethod__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4800:1: ( ( 'validity' ) )
            // InternalLightweight.g:4801:1: ( 'validity' )
            {
            // InternalLightweight.g:4801:1: ( 'validity' )
            // InternalLightweight.g:4802:2: 'validity'
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
    // InternalLightweight.g:4811:1: rule__VerifMethod__Group__3 : rule__VerifMethod__Group__3__Impl rule__VerifMethod__Group__4 ;
    public final void rule__VerifMethod__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4815:1: ( rule__VerifMethod__Group__3__Impl rule__VerifMethod__Group__4 )
            // InternalLightweight.g:4816:2: rule__VerifMethod__Group__3__Impl rule__VerifMethod__Group__4
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
    // InternalLightweight.g:4823:1: rule__VerifMethod__Group__3__Impl : ( ':' ) ;
    public final void rule__VerifMethod__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4827:1: ( ( ':' ) )
            // InternalLightweight.g:4828:1: ( ':' )
            {
            // InternalLightweight.g:4828:1: ( ':' )
            // InternalLightweight.g:4829:2: ':'
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
    // InternalLightweight.g:4838:1: rule__VerifMethod__Group__4 : rule__VerifMethod__Group__4__Impl rule__VerifMethod__Group__5 ;
    public final void rule__VerifMethod__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4842:1: ( rule__VerifMethod__Group__4__Impl rule__VerifMethod__Group__5 )
            // InternalLightweight.g:4843:2: rule__VerifMethod__Group__4__Impl rule__VerifMethod__Group__5
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
    // InternalLightweight.g:4850:1: rule__VerifMethod__Group__4__Impl : ( ( rule__VerifMethod__ValidityAssignment_4 ) ) ;
    public final void rule__VerifMethod__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4854:1: ( ( ( rule__VerifMethod__ValidityAssignment_4 ) ) )
            // InternalLightweight.g:4855:1: ( ( rule__VerifMethod__ValidityAssignment_4 ) )
            {
            // InternalLightweight.g:4855:1: ( ( rule__VerifMethod__ValidityAssignment_4 ) )
            // InternalLightweight.g:4856:2: ( rule__VerifMethod__ValidityAssignment_4 )
            {
             before(grammarAccess.getVerifMethodAccess().getValidityAssignment_4()); 
            // InternalLightweight.g:4857:2: ( rule__VerifMethod__ValidityAssignment_4 )
            // InternalLightweight.g:4857:3: rule__VerifMethod__ValidityAssignment_4
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
    // InternalLightweight.g:4865:1: rule__VerifMethod__Group__5 : rule__VerifMethod__Group__5__Impl rule__VerifMethod__Group__6 ;
    public final void rule__VerifMethod__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4869:1: ( rule__VerifMethod__Group__5__Impl rule__VerifMethod__Group__6 )
            // InternalLightweight.g:4870:2: rule__VerifMethod__Group__5__Impl rule__VerifMethod__Group__6
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
    // InternalLightweight.g:4877:1: rule__VerifMethod__Group__5__Impl : ( ',' ) ;
    public final void rule__VerifMethod__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4881:1: ( ( ',' ) )
            // InternalLightweight.g:4882:1: ( ',' )
            {
            // InternalLightweight.g:4882:1: ( ',' )
            // InternalLightweight.g:4883:2: ','
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
    // InternalLightweight.g:4892:1: rule__VerifMethod__Group__6 : rule__VerifMethod__Group__6__Impl rule__VerifMethod__Group__7 ;
    public final void rule__VerifMethod__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4896:1: ( rule__VerifMethod__Group__6__Impl rule__VerifMethod__Group__7 )
            // InternalLightweight.g:4897:2: rule__VerifMethod__Group__6__Impl rule__VerifMethod__Group__7
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
    // InternalLightweight.g:4904:1: rule__VerifMethod__Group__6__Impl : ( 'uniqueness' ) ;
    public final void rule__VerifMethod__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4908:1: ( ( 'uniqueness' ) )
            // InternalLightweight.g:4909:1: ( 'uniqueness' )
            {
            // InternalLightweight.g:4909:1: ( 'uniqueness' )
            // InternalLightweight.g:4910:2: 'uniqueness'
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
    // InternalLightweight.g:4919:1: rule__VerifMethod__Group__7 : rule__VerifMethod__Group__7__Impl rule__VerifMethod__Group__8 ;
    public final void rule__VerifMethod__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4923:1: ( rule__VerifMethod__Group__7__Impl rule__VerifMethod__Group__8 )
            // InternalLightweight.g:4924:2: rule__VerifMethod__Group__7__Impl rule__VerifMethod__Group__8
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
    // InternalLightweight.g:4931:1: rule__VerifMethod__Group__7__Impl : ( ':' ) ;
    public final void rule__VerifMethod__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4935:1: ( ( ':' ) )
            // InternalLightweight.g:4936:1: ( ':' )
            {
            // InternalLightweight.g:4936:1: ( ':' )
            // InternalLightweight.g:4937:2: ':'
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
    // InternalLightweight.g:4946:1: rule__VerifMethod__Group__8 : rule__VerifMethod__Group__8__Impl rule__VerifMethod__Group__9 ;
    public final void rule__VerifMethod__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4950:1: ( rule__VerifMethod__Group__8__Impl rule__VerifMethod__Group__9 )
            // InternalLightweight.g:4951:2: rule__VerifMethod__Group__8__Impl rule__VerifMethod__Group__9
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
    // InternalLightweight.g:4958:1: rule__VerifMethod__Group__8__Impl : ( ( rule__VerifMethod__UniquenessAssignment_8 ) ) ;
    public final void rule__VerifMethod__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4962:1: ( ( ( rule__VerifMethod__UniquenessAssignment_8 ) ) )
            // InternalLightweight.g:4963:1: ( ( rule__VerifMethod__UniquenessAssignment_8 ) )
            {
            // InternalLightweight.g:4963:1: ( ( rule__VerifMethod__UniquenessAssignment_8 ) )
            // InternalLightweight.g:4964:2: ( rule__VerifMethod__UniquenessAssignment_8 )
            {
             before(grammarAccess.getVerifMethodAccess().getUniquenessAssignment_8()); 
            // InternalLightweight.g:4965:2: ( rule__VerifMethod__UniquenessAssignment_8 )
            // InternalLightweight.g:4965:3: rule__VerifMethod__UniquenessAssignment_8
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
    // InternalLightweight.g:4973:1: rule__VerifMethod__Group__9 : rule__VerifMethod__Group__9__Impl rule__VerifMethod__Group__10 ;
    public final void rule__VerifMethod__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4977:1: ( rule__VerifMethod__Group__9__Impl rule__VerifMethod__Group__10 )
            // InternalLightweight.g:4978:2: rule__VerifMethod__Group__9__Impl rule__VerifMethod__Group__10
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
    // InternalLightweight.g:4985:1: rule__VerifMethod__Group__9__Impl : ( ',' ) ;
    public final void rule__VerifMethod__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:4989:1: ( ( ',' ) )
            // InternalLightweight.g:4990:1: ( ',' )
            {
            // InternalLightweight.g:4990:1: ( ',' )
            // InternalLightweight.g:4991:2: ','
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
    // InternalLightweight.g:5000:1: rule__VerifMethod__Group__10 : rule__VerifMethod__Group__10__Impl rule__VerifMethod__Group__11 ;
    public final void rule__VerifMethod__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5004:1: ( rule__VerifMethod__Group__10__Impl rule__VerifMethod__Group__11 )
            // InternalLightweight.g:5005:2: rule__VerifMethod__Group__10__Impl rule__VerifMethod__Group__11
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
    // InternalLightweight.g:5012:1: rule__VerifMethod__Group__10__Impl : ( 'bindings' ) ;
    public final void rule__VerifMethod__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5016:1: ( ( 'bindings' ) )
            // InternalLightweight.g:5017:1: ( 'bindings' )
            {
            // InternalLightweight.g:5017:1: ( 'bindings' )
            // InternalLightweight.g:5018:2: 'bindings'
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
    // InternalLightweight.g:5027:1: rule__VerifMethod__Group__11 : rule__VerifMethod__Group__11__Impl rule__VerifMethod__Group__12 ;
    public final void rule__VerifMethod__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5031:1: ( rule__VerifMethod__Group__11__Impl rule__VerifMethod__Group__12 )
            // InternalLightweight.g:5032:2: rule__VerifMethod__Group__11__Impl rule__VerifMethod__Group__12
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
    // InternalLightweight.g:5039:1: rule__VerifMethod__Group__11__Impl : ( ':' ) ;
    public final void rule__VerifMethod__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5043:1: ( ( ':' ) )
            // InternalLightweight.g:5044:1: ( ':' )
            {
            // InternalLightweight.g:5044:1: ( ':' )
            // InternalLightweight.g:5045:2: ':'
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
    // InternalLightweight.g:5054:1: rule__VerifMethod__Group__12 : rule__VerifMethod__Group__12__Impl rule__VerifMethod__Group__13 ;
    public final void rule__VerifMethod__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5058:1: ( rule__VerifMethod__Group__12__Impl rule__VerifMethod__Group__13 )
            // InternalLightweight.g:5059:2: rule__VerifMethod__Group__12__Impl rule__VerifMethod__Group__13
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
    // InternalLightweight.g:5066:1: rule__VerifMethod__Group__12__Impl : ( ( rule__VerifMethod__BindingsAssignment_12 ) ) ;
    public final void rule__VerifMethod__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5070:1: ( ( ( rule__VerifMethod__BindingsAssignment_12 ) ) )
            // InternalLightweight.g:5071:1: ( ( rule__VerifMethod__BindingsAssignment_12 ) )
            {
            // InternalLightweight.g:5071:1: ( ( rule__VerifMethod__BindingsAssignment_12 ) )
            // InternalLightweight.g:5072:2: ( rule__VerifMethod__BindingsAssignment_12 )
            {
             before(grammarAccess.getVerifMethodAccess().getBindingsAssignment_12()); 
            // InternalLightweight.g:5073:2: ( rule__VerifMethod__BindingsAssignment_12 )
            // InternalLightweight.g:5073:3: rule__VerifMethod__BindingsAssignment_12
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
    // InternalLightweight.g:5081:1: rule__VerifMethod__Group__13 : rule__VerifMethod__Group__13__Impl ;
    public final void rule__VerifMethod__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5085:1: ( rule__VerifMethod__Group__13__Impl )
            // InternalLightweight.g:5086:2: rule__VerifMethod__Group__13__Impl
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
    // InternalLightweight.g:5092:1: rule__VerifMethod__Group__13__Impl : ( '}' ) ;
    public final void rule__VerifMethod__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5096:1: ( ( '}' ) )
            // InternalLightweight.g:5097:1: ( '}' )
            {
            // InternalLightweight.g:5097:1: ( '}' )
            // InternalLightweight.g:5098:2: '}'
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
    // InternalLightweight.g:5108:1: rule__Recovery__Group__0 : rule__Recovery__Group__0__Impl rule__Recovery__Group__1 ;
    public final void rule__Recovery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5112:1: ( rule__Recovery__Group__0__Impl rule__Recovery__Group__1 )
            // InternalLightweight.g:5113:2: rule__Recovery__Group__0__Impl rule__Recovery__Group__1
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
    // InternalLightweight.g:5120:1: rule__Recovery__Group__0__Impl : ( () ) ;
    public final void rule__Recovery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5124:1: ( ( () ) )
            // InternalLightweight.g:5125:1: ( () )
            {
            // InternalLightweight.g:5125:1: ( () )
            // InternalLightweight.g:5126:2: ()
            {
             before(grammarAccess.getRecoveryAccess().getRecoveryAction_0()); 
            // InternalLightweight.g:5127:2: ()
            // InternalLightweight.g:5127:3: 
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
    // InternalLightweight.g:5135:1: rule__Recovery__Group__1 : rule__Recovery__Group__1__Impl rule__Recovery__Group__2 ;
    public final void rule__Recovery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5139:1: ( rule__Recovery__Group__1__Impl rule__Recovery__Group__2 )
            // InternalLightweight.g:5140:2: rule__Recovery__Group__1__Impl rule__Recovery__Group__2
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
    // InternalLightweight.g:5147:1: rule__Recovery__Group__1__Impl : ( ( rule__Recovery__TypeAssignment_1 ) ) ;
    public final void rule__Recovery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5151:1: ( ( ( rule__Recovery__TypeAssignment_1 ) ) )
            // InternalLightweight.g:5152:1: ( ( rule__Recovery__TypeAssignment_1 ) )
            {
            // InternalLightweight.g:5152:1: ( ( rule__Recovery__TypeAssignment_1 ) )
            // InternalLightweight.g:5153:2: ( rule__Recovery__TypeAssignment_1 )
            {
             before(grammarAccess.getRecoveryAccess().getTypeAssignment_1()); 
            // InternalLightweight.g:5154:2: ( rule__Recovery__TypeAssignment_1 )
            // InternalLightweight.g:5154:3: rule__Recovery__TypeAssignment_1
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
    // InternalLightweight.g:5162:1: rule__Recovery__Group__2 : rule__Recovery__Group__2__Impl rule__Recovery__Group__3 ;
    public final void rule__Recovery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5166:1: ( rule__Recovery__Group__2__Impl rule__Recovery__Group__3 )
            // InternalLightweight.g:5167:2: rule__Recovery__Group__2__Impl rule__Recovery__Group__3
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
    // InternalLightweight.g:5174:1: rule__Recovery__Group__2__Impl : ( ':' ) ;
    public final void rule__Recovery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5178:1: ( ( ':' ) )
            // InternalLightweight.g:5179:1: ( ':' )
            {
            // InternalLightweight.g:5179:1: ( ':' )
            // InternalLightweight.g:5180:2: ':'
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
    // InternalLightweight.g:5189:1: rule__Recovery__Group__3 : rule__Recovery__Group__3__Impl rule__Recovery__Group__4 ;
    public final void rule__Recovery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5193:1: ( rule__Recovery__Group__3__Impl rule__Recovery__Group__4 )
            // InternalLightweight.g:5194:2: rule__Recovery__Group__3__Impl rule__Recovery__Group__4
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
    // InternalLightweight.g:5201:1: rule__Recovery__Group__3__Impl : ( '{' ) ;
    public final void rule__Recovery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5205:1: ( ( '{' ) )
            // InternalLightweight.g:5206:1: ( '{' )
            {
            // InternalLightweight.g:5206:1: ( '{' )
            // InternalLightweight.g:5207:2: '{'
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
    // InternalLightweight.g:5216:1: rule__Recovery__Group__4 : rule__Recovery__Group__4__Impl rule__Recovery__Group__5 ;
    public final void rule__Recovery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5220:1: ( rule__Recovery__Group__4__Impl rule__Recovery__Group__5 )
            // InternalLightweight.g:5221:2: rule__Recovery__Group__4__Impl rule__Recovery__Group__5
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
    // InternalLightweight.g:5228:1: rule__Recovery__Group__4__Impl : ( 'name' ) ;
    public final void rule__Recovery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5232:1: ( ( 'name' ) )
            // InternalLightweight.g:5233:1: ( 'name' )
            {
            // InternalLightweight.g:5233:1: ( 'name' )
            // InternalLightweight.g:5234:2: 'name'
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
    // InternalLightweight.g:5243:1: rule__Recovery__Group__5 : rule__Recovery__Group__5__Impl rule__Recovery__Group__6 ;
    public final void rule__Recovery__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5247:1: ( rule__Recovery__Group__5__Impl rule__Recovery__Group__6 )
            // InternalLightweight.g:5248:2: rule__Recovery__Group__5__Impl rule__Recovery__Group__6
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
    // InternalLightweight.g:5255:1: rule__Recovery__Group__5__Impl : ( ':' ) ;
    public final void rule__Recovery__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5259:1: ( ( ':' ) )
            // InternalLightweight.g:5260:1: ( ':' )
            {
            // InternalLightweight.g:5260:1: ( ':' )
            // InternalLightweight.g:5261:2: ':'
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
    // InternalLightweight.g:5270:1: rule__Recovery__Group__6 : rule__Recovery__Group__6__Impl rule__Recovery__Group__7 ;
    public final void rule__Recovery__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5274:1: ( rule__Recovery__Group__6__Impl rule__Recovery__Group__7 )
            // InternalLightweight.g:5275:2: rule__Recovery__Group__6__Impl rule__Recovery__Group__7
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
    // InternalLightweight.g:5282:1: rule__Recovery__Group__6__Impl : ( ( rule__Recovery__NameAssignment_6 ) ) ;
    public final void rule__Recovery__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5286:1: ( ( ( rule__Recovery__NameAssignment_6 ) ) )
            // InternalLightweight.g:5287:1: ( ( rule__Recovery__NameAssignment_6 ) )
            {
            // InternalLightweight.g:5287:1: ( ( rule__Recovery__NameAssignment_6 ) )
            // InternalLightweight.g:5288:2: ( rule__Recovery__NameAssignment_6 )
            {
             before(grammarAccess.getRecoveryAccess().getNameAssignment_6()); 
            // InternalLightweight.g:5289:2: ( rule__Recovery__NameAssignment_6 )
            // InternalLightweight.g:5289:3: rule__Recovery__NameAssignment_6
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
    // InternalLightweight.g:5297:1: rule__Recovery__Group__7 : rule__Recovery__Group__7__Impl rule__Recovery__Group__8 ;
    public final void rule__Recovery__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5301:1: ( rule__Recovery__Group__7__Impl rule__Recovery__Group__8 )
            // InternalLightweight.g:5302:2: rule__Recovery__Group__7__Impl rule__Recovery__Group__8
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
    // InternalLightweight.g:5309:1: rule__Recovery__Group__7__Impl : ( ',' ) ;
    public final void rule__Recovery__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5313:1: ( ( ',' ) )
            // InternalLightweight.g:5314:1: ( ',' )
            {
            // InternalLightweight.g:5314:1: ( ',' )
            // InternalLightweight.g:5315:2: ','
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
    // InternalLightweight.g:5324:1: rule__Recovery__Group__8 : rule__Recovery__Group__8__Impl rule__Recovery__Group__9 ;
    public final void rule__Recovery__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5328:1: ( rule__Recovery__Group__8__Impl rule__Recovery__Group__9 )
            // InternalLightweight.g:5329:2: rule__Recovery__Group__8__Impl rule__Recovery__Group__9
            {
            pushFollow(FOLLOW_46);
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
    // InternalLightweight.g:5336:1: rule__Recovery__Group__8__Impl : ( ( rule__Recovery__Group_8__0 ) ) ;
    public final void rule__Recovery__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5340:1: ( ( ( rule__Recovery__Group_8__0 ) ) )
            // InternalLightweight.g:5341:1: ( ( rule__Recovery__Group_8__0 ) )
            {
            // InternalLightweight.g:5341:1: ( ( rule__Recovery__Group_8__0 ) )
            // InternalLightweight.g:5342:2: ( rule__Recovery__Group_8__0 )
            {
             before(grammarAccess.getRecoveryAccess().getGroup_8()); 
            // InternalLightweight.g:5343:2: ( rule__Recovery__Group_8__0 )
            // InternalLightweight.g:5343:3: rule__Recovery__Group_8__0
            {
            pushFollow(FOLLOW_2);
            rule__Recovery__Group_8__0();

            state._fsp--;


            }

             after(grammarAccess.getRecoveryAccess().getGroup_8()); 

            }


            }

        }
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
    // InternalLightweight.g:5351:1: rule__Recovery__Group__9 : rule__Recovery__Group__9__Impl rule__Recovery__Group__10 ;
    public final void rule__Recovery__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5355:1: ( rule__Recovery__Group__9__Impl rule__Recovery__Group__10 )
            // InternalLightweight.g:5356:2: rule__Recovery__Group__9__Impl rule__Recovery__Group__10
            {
            pushFollow(FOLLOW_3);
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
    // InternalLightweight.g:5363:1: rule__Recovery__Group__9__Impl : ( 'authentication' ) ;
    public final void rule__Recovery__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5367:1: ( ( 'authentication' ) )
            // InternalLightweight.g:5368:1: ( 'authentication' )
            {
            // InternalLightweight.g:5368:1: ( 'authentication' )
            // InternalLightweight.g:5369:2: 'authentication'
            {
             before(grammarAccess.getRecoveryAccess().getAuthenticationKeyword_9()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getAuthenticationKeyword_9()); 

            }


            }

        }
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
    // InternalLightweight.g:5378:1: rule__Recovery__Group__10 : rule__Recovery__Group__10__Impl rule__Recovery__Group__11 ;
    public final void rule__Recovery__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5382:1: ( rule__Recovery__Group__10__Impl rule__Recovery__Group__11 )
            // InternalLightweight.g:5383:2: rule__Recovery__Group__10__Impl rule__Recovery__Group__11
            {
            pushFollow(FOLLOW_19);
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
    // InternalLightweight.g:5390:1: rule__Recovery__Group__10__Impl : ( ':' ) ;
    public final void rule__Recovery__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5394:1: ( ( ':' ) )
            // InternalLightweight.g:5395:1: ( ':' )
            {
            // InternalLightweight.g:5395:1: ( ':' )
            // InternalLightweight.g:5396:2: ':'
            {
             before(grammarAccess.getRecoveryAccess().getColonKeyword_10()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getColonKeyword_10()); 

            }


            }

        }
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
    // InternalLightweight.g:5405:1: rule__Recovery__Group__11 : rule__Recovery__Group__11__Impl rule__Recovery__Group__12 ;
    public final void rule__Recovery__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5409:1: ( rule__Recovery__Group__11__Impl rule__Recovery__Group__12 )
            // InternalLightweight.g:5410:2: rule__Recovery__Group__11__Impl rule__Recovery__Group__12
            {
            pushFollow(FOLLOW_47);
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
    // InternalLightweight.g:5417:1: rule__Recovery__Group__11__Impl : ( ( rule__Recovery__AuthMethodsAssignment_11 ) ) ;
    public final void rule__Recovery__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5421:1: ( ( ( rule__Recovery__AuthMethodsAssignment_11 ) ) )
            // InternalLightweight.g:5422:1: ( ( rule__Recovery__AuthMethodsAssignment_11 ) )
            {
            // InternalLightweight.g:5422:1: ( ( rule__Recovery__AuthMethodsAssignment_11 ) )
            // InternalLightweight.g:5423:2: ( rule__Recovery__AuthMethodsAssignment_11 )
            {
             before(grammarAccess.getRecoveryAccess().getAuthMethodsAssignment_11()); 
            // InternalLightweight.g:5424:2: ( rule__Recovery__AuthMethodsAssignment_11 )
            // InternalLightweight.g:5424:3: rule__Recovery__AuthMethodsAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Recovery__AuthMethodsAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getRecoveryAccess().getAuthMethodsAssignment_11()); 

            }


            }

        }
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
    // InternalLightweight.g:5432:1: rule__Recovery__Group__12 : rule__Recovery__Group__12__Impl rule__Recovery__Group__13 ;
    public final void rule__Recovery__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5436:1: ( rule__Recovery__Group__12__Impl rule__Recovery__Group__13 )
            // InternalLightweight.g:5437:2: rule__Recovery__Group__12__Impl rule__Recovery__Group__13
            {
            pushFollow(FOLLOW_47);
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
    // InternalLightweight.g:5444:1: rule__Recovery__Group__12__Impl : ( ( rule__Recovery__Group_12__0 )* ) ;
    public final void rule__Recovery__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5448:1: ( ( ( rule__Recovery__Group_12__0 )* ) )
            // InternalLightweight.g:5449:1: ( ( rule__Recovery__Group_12__0 )* )
            {
            // InternalLightweight.g:5449:1: ( ( rule__Recovery__Group_12__0 )* )
            // InternalLightweight.g:5450:2: ( rule__Recovery__Group_12__0 )*
            {
             before(grammarAccess.getRecoveryAccess().getGroup_12()); 
            // InternalLightweight.g:5451:2: ( rule__Recovery__Group_12__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==59) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalLightweight.g:5451:3: rule__Recovery__Group_12__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__Recovery__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

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
    // InternalLightweight.g:5459:1: rule__Recovery__Group__13 : rule__Recovery__Group__13__Impl rule__Recovery__Group__14 ;
    public final void rule__Recovery__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5463:1: ( rule__Recovery__Group__13__Impl rule__Recovery__Group__14 )
            // InternalLightweight.g:5464:2: rule__Recovery__Group__13__Impl rule__Recovery__Group__14
            {
            pushFollow(FOLLOW_47);
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
    // InternalLightweight.g:5471:1: rule__Recovery__Group__13__Impl : ( ( rule__Recovery__Group_13__0 )? ) ;
    public final void rule__Recovery__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5475:1: ( ( ( rule__Recovery__Group_13__0 )? ) )
            // InternalLightweight.g:5476:1: ( ( rule__Recovery__Group_13__0 )? )
            {
            // InternalLightweight.g:5476:1: ( ( rule__Recovery__Group_13__0 )? )
            // InternalLightweight.g:5477:2: ( rule__Recovery__Group_13__0 )?
            {
             before(grammarAccess.getRecoveryAccess().getGroup_13()); 
            // InternalLightweight.g:5478:2: ( rule__Recovery__Group_13__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==60) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLightweight.g:5478:3: rule__Recovery__Group_13__0
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
    // InternalLightweight.g:5486:1: rule__Recovery__Group__14 : rule__Recovery__Group__14__Impl ;
    public final void rule__Recovery__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5490:1: ( rule__Recovery__Group__14__Impl )
            // InternalLightweight.g:5491:2: rule__Recovery__Group__14__Impl
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
    // InternalLightweight.g:5497:1: rule__Recovery__Group__14__Impl : ( '}' ) ;
    public final void rule__Recovery__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5501:1: ( ( '}' ) )
            // InternalLightweight.g:5502:1: ( '}' )
            {
            // InternalLightweight.g:5502:1: ( '}' )
            // InternalLightweight.g:5503:2: '}'
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


    // $ANTLR start "rule__Recovery__Group_8__0"
    // InternalLightweight.g:5513:1: rule__Recovery__Group_8__0 : rule__Recovery__Group_8__0__Impl rule__Recovery__Group_8__1 ;
    public final void rule__Recovery__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5517:1: ( rule__Recovery__Group_8__0__Impl rule__Recovery__Group_8__1 )
            // InternalLightweight.g:5518:2: rule__Recovery__Group_8__0__Impl rule__Recovery__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__Recovery__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group_8__1();

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
    // $ANTLR end "rule__Recovery__Group_8__0"


    // $ANTLR start "rule__Recovery__Group_8__0__Impl"
    // InternalLightweight.g:5525:1: rule__Recovery__Group_8__0__Impl : ( 'authenticator' ) ;
    public final void rule__Recovery__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5529:1: ( ( 'authenticator' ) )
            // InternalLightweight.g:5530:1: ( 'authenticator' )
            {
            // InternalLightweight.g:5530:1: ( 'authenticator' )
            // InternalLightweight.g:5531:2: 'authenticator'
            {
             before(grammarAccess.getRecoveryAccess().getAuthenticatorKeyword_8_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getAuthenticatorKeyword_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_8__0__Impl"


    // $ANTLR start "rule__Recovery__Group_8__1"
    // InternalLightweight.g:5540:1: rule__Recovery__Group_8__1 : rule__Recovery__Group_8__1__Impl rule__Recovery__Group_8__2 ;
    public final void rule__Recovery__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5544:1: ( rule__Recovery__Group_8__1__Impl rule__Recovery__Group_8__2 )
            // InternalLightweight.g:5545:2: rule__Recovery__Group_8__1__Impl rule__Recovery__Group_8__2
            {
            pushFollow(FOLLOW_19);
            rule__Recovery__Group_8__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group_8__2();

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
    // $ANTLR end "rule__Recovery__Group_8__1"


    // $ANTLR start "rule__Recovery__Group_8__1__Impl"
    // InternalLightweight.g:5552:1: rule__Recovery__Group_8__1__Impl : ( ':' ) ;
    public final void rule__Recovery__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5556:1: ( ( ':' ) )
            // InternalLightweight.g:5557:1: ( ':' )
            {
            // InternalLightweight.g:5557:1: ( ':' )
            // InternalLightweight.g:5558:2: ':'
            {
             before(grammarAccess.getRecoveryAccess().getColonKeyword_8_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getColonKeyword_8_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_8__1__Impl"


    // $ANTLR start "rule__Recovery__Group_8__2"
    // InternalLightweight.g:5567:1: rule__Recovery__Group_8__2 : rule__Recovery__Group_8__2__Impl rule__Recovery__Group_8__3 ;
    public final void rule__Recovery__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5571:1: ( rule__Recovery__Group_8__2__Impl rule__Recovery__Group_8__3 )
            // InternalLightweight.g:5572:2: rule__Recovery__Group_8__2__Impl rule__Recovery__Group_8__3
            {
            pushFollow(FOLLOW_10);
            rule__Recovery__Group_8__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Recovery__Group_8__3();

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
    // $ANTLR end "rule__Recovery__Group_8__2"


    // $ANTLR start "rule__Recovery__Group_8__2__Impl"
    // InternalLightweight.g:5579:1: rule__Recovery__Group_8__2__Impl : ( ( rule__Recovery__AuthenticatorAssignment_8_2 ) ) ;
    public final void rule__Recovery__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5583:1: ( ( ( rule__Recovery__AuthenticatorAssignment_8_2 ) ) )
            // InternalLightweight.g:5584:1: ( ( rule__Recovery__AuthenticatorAssignment_8_2 ) )
            {
            // InternalLightweight.g:5584:1: ( ( rule__Recovery__AuthenticatorAssignment_8_2 ) )
            // InternalLightweight.g:5585:2: ( rule__Recovery__AuthenticatorAssignment_8_2 )
            {
             before(grammarAccess.getRecoveryAccess().getAuthenticatorAssignment_8_2()); 
            // InternalLightweight.g:5586:2: ( rule__Recovery__AuthenticatorAssignment_8_2 )
            // InternalLightweight.g:5586:3: rule__Recovery__AuthenticatorAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__Recovery__AuthenticatorAssignment_8_2();

            state._fsp--;


            }

             after(grammarAccess.getRecoveryAccess().getAuthenticatorAssignment_8_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_8__2__Impl"


    // $ANTLR start "rule__Recovery__Group_8__3"
    // InternalLightweight.g:5594:1: rule__Recovery__Group_8__3 : rule__Recovery__Group_8__3__Impl ;
    public final void rule__Recovery__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5598:1: ( rule__Recovery__Group_8__3__Impl )
            // InternalLightweight.g:5599:2: rule__Recovery__Group_8__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recovery__Group_8__3__Impl();

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
    // $ANTLR end "rule__Recovery__Group_8__3"


    // $ANTLR start "rule__Recovery__Group_8__3__Impl"
    // InternalLightweight.g:5605:1: rule__Recovery__Group_8__3__Impl : ( ',' ) ;
    public final void rule__Recovery__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5609:1: ( ( ',' ) )
            // InternalLightweight.g:5610:1: ( ',' )
            {
            // InternalLightweight.g:5610:1: ( ',' )
            // InternalLightweight.g:5611:2: ','
            {
             before(grammarAccess.getRecoveryAccess().getCommaKeyword_8_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getCommaKeyword_8_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__Group_8__3__Impl"


    // $ANTLR start "rule__Recovery__Group_12__0"
    // InternalLightweight.g:5621:1: rule__Recovery__Group_12__0 : rule__Recovery__Group_12__0__Impl rule__Recovery__Group_12__1 ;
    public final void rule__Recovery__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5625:1: ( rule__Recovery__Group_12__0__Impl rule__Recovery__Group_12__1 )
            // InternalLightweight.g:5626:2: rule__Recovery__Group_12__0__Impl rule__Recovery__Group_12__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalLightweight.g:5633:1: rule__Recovery__Group_12__0__Impl : ( '||' ) ;
    public final void rule__Recovery__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5637:1: ( ( '||' ) )
            // InternalLightweight.g:5638:1: ( '||' )
            {
            // InternalLightweight.g:5638:1: ( '||' )
            // InternalLightweight.g:5639:2: '||'
            {
             before(grammarAccess.getRecoveryAccess().getVerticalLineVerticalLineKeyword_12_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getVerticalLineVerticalLineKeyword_12_0()); 

            }


            }

        }
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
    // InternalLightweight.g:5648:1: rule__Recovery__Group_12__1 : rule__Recovery__Group_12__1__Impl ;
    public final void rule__Recovery__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5652:1: ( rule__Recovery__Group_12__1__Impl )
            // InternalLightweight.g:5653:2: rule__Recovery__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Recovery__Group_12__1__Impl();

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
    // InternalLightweight.g:5659:1: rule__Recovery__Group_12__1__Impl : ( ( rule__Recovery__AuthMethodsAssignment_12_1 ) ) ;
    public final void rule__Recovery__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5663:1: ( ( ( rule__Recovery__AuthMethodsAssignment_12_1 ) ) )
            // InternalLightweight.g:5664:1: ( ( rule__Recovery__AuthMethodsAssignment_12_1 ) )
            {
            // InternalLightweight.g:5664:1: ( ( rule__Recovery__AuthMethodsAssignment_12_1 ) )
            // InternalLightweight.g:5665:2: ( rule__Recovery__AuthMethodsAssignment_12_1 )
            {
             before(grammarAccess.getRecoveryAccess().getAuthMethodsAssignment_12_1()); 
            // InternalLightweight.g:5666:2: ( rule__Recovery__AuthMethodsAssignment_12_1 )
            // InternalLightweight.g:5666:3: rule__Recovery__AuthMethodsAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Recovery__AuthMethodsAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getRecoveryAccess().getAuthMethodsAssignment_12_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Recovery__Group_13__0"
    // InternalLightweight.g:5675:1: rule__Recovery__Group_13__0 : rule__Recovery__Group_13__0__Impl rule__Recovery__Group_13__1 ;
    public final void rule__Recovery__Group_13__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5679:1: ( rule__Recovery__Group_13__0__Impl rule__Recovery__Group_13__1 )
            // InternalLightweight.g:5680:2: rule__Recovery__Group_13__0__Impl rule__Recovery__Group_13__1
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
    // InternalLightweight.g:5687:1: rule__Recovery__Group_13__0__Impl : ( 'protocol' ) ;
    public final void rule__Recovery__Group_13__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5691:1: ( ( 'protocol' ) )
            // InternalLightweight.g:5692:1: ( 'protocol' )
            {
            // InternalLightweight.g:5692:1: ( 'protocol' )
            // InternalLightweight.g:5693:2: 'protocol'
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
    // InternalLightweight.g:5702:1: rule__Recovery__Group_13__1 : rule__Recovery__Group_13__1__Impl rule__Recovery__Group_13__2 ;
    public final void rule__Recovery__Group_13__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5706:1: ( rule__Recovery__Group_13__1__Impl rule__Recovery__Group_13__2 )
            // InternalLightweight.g:5707:2: rule__Recovery__Group_13__1__Impl rule__Recovery__Group_13__2
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
    // InternalLightweight.g:5714:1: rule__Recovery__Group_13__1__Impl : ( ':' ) ;
    public final void rule__Recovery__Group_13__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5718:1: ( ( ':' ) )
            // InternalLightweight.g:5719:1: ( ':' )
            {
            // InternalLightweight.g:5719:1: ( ':' )
            // InternalLightweight.g:5720:2: ':'
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
    // InternalLightweight.g:5729:1: rule__Recovery__Group_13__2 : rule__Recovery__Group_13__2__Impl ;
    public final void rule__Recovery__Group_13__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5733:1: ( rule__Recovery__Group_13__2__Impl )
            // InternalLightweight.g:5734:2: rule__Recovery__Group_13__2__Impl
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
    // InternalLightweight.g:5740:1: rule__Recovery__Group_13__2__Impl : ( ( rule__Recovery__ProtocolAssignment_13_2 ) ) ;
    public final void rule__Recovery__Group_13__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5744:1: ( ( ( rule__Recovery__ProtocolAssignment_13_2 ) ) )
            // InternalLightweight.g:5745:1: ( ( rule__Recovery__ProtocolAssignment_13_2 ) )
            {
            // InternalLightweight.g:5745:1: ( ( rule__Recovery__ProtocolAssignment_13_2 ) )
            // InternalLightweight.g:5746:2: ( rule__Recovery__ProtocolAssignment_13_2 )
            {
             before(grammarAccess.getRecoveryAccess().getProtocolAssignment_13_2()); 
            // InternalLightweight.g:5747:2: ( rule__Recovery__ProtocolAssignment_13_2 )
            // InternalLightweight.g:5747:3: rule__Recovery__ProtocolAssignment_13_2
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
    // InternalLightweight.g:5756:1: rule__Login__Group__0 : rule__Login__Group__0__Impl rule__Login__Group__1 ;
    public final void rule__Login__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5760:1: ( rule__Login__Group__0__Impl rule__Login__Group__1 )
            // InternalLightweight.g:5761:2: rule__Login__Group__0__Impl rule__Login__Group__1
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
    // InternalLightweight.g:5768:1: rule__Login__Group__0__Impl : ( () ) ;
    public final void rule__Login__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5772:1: ( ( () ) )
            // InternalLightweight.g:5773:1: ( () )
            {
            // InternalLightweight.g:5773:1: ( () )
            // InternalLightweight.g:5774:2: ()
            {
             before(grammarAccess.getLoginAccess().getLoginAction_0()); 
            // InternalLightweight.g:5775:2: ()
            // InternalLightweight.g:5775:3: 
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
    // InternalLightweight.g:5783:1: rule__Login__Group__1 : rule__Login__Group__1__Impl rule__Login__Group__2 ;
    public final void rule__Login__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5787:1: ( rule__Login__Group__1__Impl rule__Login__Group__2 )
            // InternalLightweight.g:5788:2: rule__Login__Group__1__Impl rule__Login__Group__2
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
    // InternalLightweight.g:5795:1: rule__Login__Group__1__Impl : ( ( rule__Login__TypeAssignment_1 ) ) ;
    public final void rule__Login__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5799:1: ( ( ( rule__Login__TypeAssignment_1 ) ) )
            // InternalLightweight.g:5800:1: ( ( rule__Login__TypeAssignment_1 ) )
            {
            // InternalLightweight.g:5800:1: ( ( rule__Login__TypeAssignment_1 ) )
            // InternalLightweight.g:5801:2: ( rule__Login__TypeAssignment_1 )
            {
             before(grammarAccess.getLoginAccess().getTypeAssignment_1()); 
            // InternalLightweight.g:5802:2: ( rule__Login__TypeAssignment_1 )
            // InternalLightweight.g:5802:3: rule__Login__TypeAssignment_1
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
    // InternalLightweight.g:5810:1: rule__Login__Group__2 : rule__Login__Group__2__Impl rule__Login__Group__3 ;
    public final void rule__Login__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5814:1: ( rule__Login__Group__2__Impl rule__Login__Group__3 )
            // InternalLightweight.g:5815:2: rule__Login__Group__2__Impl rule__Login__Group__3
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
    // InternalLightweight.g:5822:1: rule__Login__Group__2__Impl : ( ':' ) ;
    public final void rule__Login__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5826:1: ( ( ':' ) )
            // InternalLightweight.g:5827:1: ( ':' )
            {
            // InternalLightweight.g:5827:1: ( ':' )
            // InternalLightweight.g:5828:2: ':'
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
    // InternalLightweight.g:5837:1: rule__Login__Group__3 : rule__Login__Group__3__Impl rule__Login__Group__4 ;
    public final void rule__Login__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5841:1: ( rule__Login__Group__3__Impl rule__Login__Group__4 )
            // InternalLightweight.g:5842:2: rule__Login__Group__3__Impl rule__Login__Group__4
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
    // InternalLightweight.g:5849:1: rule__Login__Group__3__Impl : ( '{' ) ;
    public final void rule__Login__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5853:1: ( ( '{' ) )
            // InternalLightweight.g:5854:1: ( '{' )
            {
            // InternalLightweight.g:5854:1: ( '{' )
            // InternalLightweight.g:5855:2: '{'
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
    // InternalLightweight.g:5864:1: rule__Login__Group__4 : rule__Login__Group__4__Impl rule__Login__Group__5 ;
    public final void rule__Login__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5868:1: ( rule__Login__Group__4__Impl rule__Login__Group__5 )
            // InternalLightweight.g:5869:2: rule__Login__Group__4__Impl rule__Login__Group__5
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
    // InternalLightweight.g:5876:1: rule__Login__Group__4__Impl : ( 'name' ) ;
    public final void rule__Login__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5880:1: ( ( 'name' ) )
            // InternalLightweight.g:5881:1: ( 'name' )
            {
            // InternalLightweight.g:5881:1: ( 'name' )
            // InternalLightweight.g:5882:2: 'name'
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
    // InternalLightweight.g:5891:1: rule__Login__Group__5 : rule__Login__Group__5__Impl rule__Login__Group__6 ;
    public final void rule__Login__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5895:1: ( rule__Login__Group__5__Impl rule__Login__Group__6 )
            // InternalLightweight.g:5896:2: rule__Login__Group__5__Impl rule__Login__Group__6
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
    // InternalLightweight.g:5903:1: rule__Login__Group__5__Impl : ( ':' ) ;
    public final void rule__Login__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5907:1: ( ( ':' ) )
            // InternalLightweight.g:5908:1: ( ':' )
            {
            // InternalLightweight.g:5908:1: ( ':' )
            // InternalLightweight.g:5909:2: ':'
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
    // InternalLightweight.g:5918:1: rule__Login__Group__6 : rule__Login__Group__6__Impl rule__Login__Group__7 ;
    public final void rule__Login__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5922:1: ( rule__Login__Group__6__Impl rule__Login__Group__7 )
            // InternalLightweight.g:5923:2: rule__Login__Group__6__Impl rule__Login__Group__7
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
    // InternalLightweight.g:5930:1: rule__Login__Group__6__Impl : ( ( rule__Login__NameAssignment_6 ) ) ;
    public final void rule__Login__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5934:1: ( ( ( rule__Login__NameAssignment_6 ) ) )
            // InternalLightweight.g:5935:1: ( ( rule__Login__NameAssignment_6 ) )
            {
            // InternalLightweight.g:5935:1: ( ( rule__Login__NameAssignment_6 ) )
            // InternalLightweight.g:5936:2: ( rule__Login__NameAssignment_6 )
            {
             before(grammarAccess.getLoginAccess().getNameAssignment_6()); 
            // InternalLightweight.g:5937:2: ( rule__Login__NameAssignment_6 )
            // InternalLightweight.g:5937:3: rule__Login__NameAssignment_6
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
    // InternalLightweight.g:5945:1: rule__Login__Group__7 : rule__Login__Group__7__Impl rule__Login__Group__8 ;
    public final void rule__Login__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5949:1: ( rule__Login__Group__7__Impl rule__Login__Group__8 )
            // InternalLightweight.g:5950:2: rule__Login__Group__7__Impl rule__Login__Group__8
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
    // InternalLightweight.g:5957:1: rule__Login__Group__7__Impl : ( ',' ) ;
    public final void rule__Login__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5961:1: ( ( ',' ) )
            // InternalLightweight.g:5962:1: ( ',' )
            {
            // InternalLightweight.g:5962:1: ( ',' )
            // InternalLightweight.g:5963:2: ','
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
    // InternalLightweight.g:5972:1: rule__Login__Group__8 : rule__Login__Group__8__Impl rule__Login__Group__9 ;
    public final void rule__Login__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5976:1: ( rule__Login__Group__8__Impl rule__Login__Group__9 )
            // InternalLightweight.g:5977:2: rule__Login__Group__8__Impl rule__Login__Group__9
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
    // InternalLightweight.g:5984:1: rule__Login__Group__8__Impl : ( 'persistedSession' ) ;
    public final void rule__Login__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:5988:1: ( ( 'persistedSession' ) )
            // InternalLightweight.g:5989:1: ( 'persistedSession' )
            {
            // InternalLightweight.g:5989:1: ( 'persistedSession' )
            // InternalLightweight.g:5990:2: 'persistedSession'
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
    // InternalLightweight.g:5999:1: rule__Login__Group__9 : rule__Login__Group__9__Impl rule__Login__Group__10 ;
    public final void rule__Login__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6003:1: ( rule__Login__Group__9__Impl rule__Login__Group__10 )
            // InternalLightweight.g:6004:2: rule__Login__Group__9__Impl rule__Login__Group__10
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
    // InternalLightweight.g:6011:1: rule__Login__Group__9__Impl : ( ':' ) ;
    public final void rule__Login__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6015:1: ( ( ':' ) )
            // InternalLightweight.g:6016:1: ( ':' )
            {
            // InternalLightweight.g:6016:1: ( ':' )
            // InternalLightweight.g:6017:2: ':'
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
    // InternalLightweight.g:6026:1: rule__Login__Group__10 : rule__Login__Group__10__Impl rule__Login__Group__11 ;
    public final void rule__Login__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6030:1: ( rule__Login__Group__10__Impl rule__Login__Group__11 )
            // InternalLightweight.g:6031:2: rule__Login__Group__10__Impl rule__Login__Group__11
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
    // InternalLightweight.g:6038:1: rule__Login__Group__10__Impl : ( ( rule__Login__SessionAssignment_10 ) ) ;
    public final void rule__Login__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6042:1: ( ( ( rule__Login__SessionAssignment_10 ) ) )
            // InternalLightweight.g:6043:1: ( ( rule__Login__SessionAssignment_10 ) )
            {
            // InternalLightweight.g:6043:1: ( ( rule__Login__SessionAssignment_10 ) )
            // InternalLightweight.g:6044:2: ( rule__Login__SessionAssignment_10 )
            {
             before(grammarAccess.getLoginAccess().getSessionAssignment_10()); 
            // InternalLightweight.g:6045:2: ( rule__Login__SessionAssignment_10 )
            // InternalLightweight.g:6045:3: rule__Login__SessionAssignment_10
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
    // InternalLightweight.g:6053:1: rule__Login__Group__11 : rule__Login__Group__11__Impl rule__Login__Group__12 ;
    public final void rule__Login__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6057:1: ( rule__Login__Group__11__Impl rule__Login__Group__12 )
            // InternalLightweight.g:6058:2: rule__Login__Group__11__Impl rule__Login__Group__12
            {
            pushFollow(FOLLOW_46);
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
    // InternalLightweight.g:6065:1: rule__Login__Group__11__Impl : ( ',' ) ;
    public final void rule__Login__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6069:1: ( ( ',' ) )
            // InternalLightweight.g:6070:1: ( ',' )
            {
            // InternalLightweight.g:6070:1: ( ',' )
            // InternalLightweight.g:6071:2: ','
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
    // InternalLightweight.g:6080:1: rule__Login__Group__12 : rule__Login__Group__12__Impl rule__Login__Group__13 ;
    public final void rule__Login__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6084:1: ( rule__Login__Group__12__Impl rule__Login__Group__13 )
            // InternalLightweight.g:6085:2: rule__Login__Group__12__Impl rule__Login__Group__13
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
    // InternalLightweight.g:6092:1: rule__Login__Group__12__Impl : ( 'authentication' ) ;
    public final void rule__Login__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6096:1: ( ( 'authentication' ) )
            // InternalLightweight.g:6097:1: ( 'authentication' )
            {
            // InternalLightweight.g:6097:1: ( 'authentication' )
            // InternalLightweight.g:6098:2: 'authentication'
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
    // InternalLightweight.g:6107:1: rule__Login__Group__13 : rule__Login__Group__13__Impl rule__Login__Group__14 ;
    public final void rule__Login__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6111:1: ( rule__Login__Group__13__Impl rule__Login__Group__14 )
            // InternalLightweight.g:6112:2: rule__Login__Group__13__Impl rule__Login__Group__14
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
    // InternalLightweight.g:6119:1: rule__Login__Group__13__Impl : ( ':' ) ;
    public final void rule__Login__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6123:1: ( ( ':' ) )
            // InternalLightweight.g:6124:1: ( ':' )
            {
            // InternalLightweight.g:6124:1: ( ':' )
            // InternalLightweight.g:6125:2: ':'
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
    // InternalLightweight.g:6134:1: rule__Login__Group__14 : rule__Login__Group__14__Impl rule__Login__Group__15 ;
    public final void rule__Login__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6138:1: ( rule__Login__Group__14__Impl rule__Login__Group__15 )
            // InternalLightweight.g:6139:2: rule__Login__Group__14__Impl rule__Login__Group__15
            {
            pushFollow(FOLLOW_52);
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
    // InternalLightweight.g:6146:1: rule__Login__Group__14__Impl : ( ( rule__Login__AuthMethodsAssignment_14 ) ) ;
    public final void rule__Login__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6150:1: ( ( ( rule__Login__AuthMethodsAssignment_14 ) ) )
            // InternalLightweight.g:6151:1: ( ( rule__Login__AuthMethodsAssignment_14 ) )
            {
            // InternalLightweight.g:6151:1: ( ( rule__Login__AuthMethodsAssignment_14 ) )
            // InternalLightweight.g:6152:2: ( rule__Login__AuthMethodsAssignment_14 )
            {
             before(grammarAccess.getLoginAccess().getAuthMethodsAssignment_14()); 
            // InternalLightweight.g:6153:2: ( rule__Login__AuthMethodsAssignment_14 )
            // InternalLightweight.g:6153:3: rule__Login__AuthMethodsAssignment_14
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
    // InternalLightweight.g:6161:1: rule__Login__Group__15 : rule__Login__Group__15__Impl rule__Login__Group__16 ;
    public final void rule__Login__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6165:1: ( rule__Login__Group__15__Impl rule__Login__Group__16 )
            // InternalLightweight.g:6166:2: rule__Login__Group__15__Impl rule__Login__Group__16
            {
            pushFollow(FOLLOW_52);
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
    // InternalLightweight.g:6173:1: rule__Login__Group__15__Impl : ( ( rule__Login__Group_15__0 )* ) ;
    public final void rule__Login__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6177:1: ( ( ( rule__Login__Group_15__0 )* ) )
            // InternalLightweight.g:6178:1: ( ( rule__Login__Group_15__0 )* )
            {
            // InternalLightweight.g:6178:1: ( ( rule__Login__Group_15__0 )* )
            // InternalLightweight.g:6179:2: ( rule__Login__Group_15__0 )*
            {
             before(grammarAccess.getLoginAccess().getGroup_15()); 
            // InternalLightweight.g:6180:2: ( rule__Login__Group_15__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==59) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalLightweight.g:6180:3: rule__Login__Group_15__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__Login__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalLightweight.g:6188:1: rule__Login__Group__16 : rule__Login__Group__16__Impl ;
    public final void rule__Login__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6192:1: ( rule__Login__Group__16__Impl )
            // InternalLightweight.g:6193:2: rule__Login__Group__16__Impl
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
    // InternalLightweight.g:6199:1: rule__Login__Group__16__Impl : ( '}' ) ;
    public final void rule__Login__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6203:1: ( ( '}' ) )
            // InternalLightweight.g:6204:1: ( '}' )
            {
            // InternalLightweight.g:6204:1: ( '}' )
            // InternalLightweight.g:6205:2: '}'
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
    // InternalLightweight.g:6215:1: rule__Login__Group_15__0 : rule__Login__Group_15__0__Impl rule__Login__Group_15__1 ;
    public final void rule__Login__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6219:1: ( rule__Login__Group_15__0__Impl rule__Login__Group_15__1 )
            // InternalLightweight.g:6220:2: rule__Login__Group_15__0__Impl rule__Login__Group_15__1
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
    // InternalLightweight.g:6227:1: rule__Login__Group_15__0__Impl : ( '||' ) ;
    public final void rule__Login__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6231:1: ( ( '||' ) )
            // InternalLightweight.g:6232:1: ( '||' )
            {
            // InternalLightweight.g:6232:1: ( '||' )
            // InternalLightweight.g:6233:2: '||'
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
    // InternalLightweight.g:6242:1: rule__Login__Group_15__1 : rule__Login__Group_15__1__Impl ;
    public final void rule__Login__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6246:1: ( rule__Login__Group_15__1__Impl )
            // InternalLightweight.g:6247:2: rule__Login__Group_15__1__Impl
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
    // InternalLightweight.g:6253:1: rule__Login__Group_15__1__Impl : ( ( rule__Login__AuthMethodsAssignment_15_1 ) ) ;
    public final void rule__Login__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6257:1: ( ( ( rule__Login__AuthMethodsAssignment_15_1 ) ) )
            // InternalLightweight.g:6258:1: ( ( rule__Login__AuthMethodsAssignment_15_1 ) )
            {
            // InternalLightweight.g:6258:1: ( ( rule__Login__AuthMethodsAssignment_15_1 ) )
            // InternalLightweight.g:6259:2: ( rule__Login__AuthMethodsAssignment_15_1 )
            {
             before(grammarAccess.getLoginAccess().getAuthMethodsAssignment_15_1()); 
            // InternalLightweight.g:6260:2: ( rule__Login__AuthMethodsAssignment_15_1 )
            // InternalLightweight.g:6260:3: rule__Login__AuthMethodsAssignment_15_1
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
    // InternalLightweight.g:6269:1: rule__Reset__Group__0 : rule__Reset__Group__0__Impl rule__Reset__Group__1 ;
    public final void rule__Reset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6273:1: ( rule__Reset__Group__0__Impl rule__Reset__Group__1 )
            // InternalLightweight.g:6274:2: rule__Reset__Group__0__Impl rule__Reset__Group__1
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
    // InternalLightweight.g:6281:1: rule__Reset__Group__0__Impl : ( () ) ;
    public final void rule__Reset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6285:1: ( ( () ) )
            // InternalLightweight.g:6286:1: ( () )
            {
            // InternalLightweight.g:6286:1: ( () )
            // InternalLightweight.g:6287:2: ()
            {
             before(grammarAccess.getResetAccess().getResetAction_0()); 
            // InternalLightweight.g:6288:2: ()
            // InternalLightweight.g:6288:3: 
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
    // InternalLightweight.g:6296:1: rule__Reset__Group__1 : rule__Reset__Group__1__Impl rule__Reset__Group__2 ;
    public final void rule__Reset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6300:1: ( rule__Reset__Group__1__Impl rule__Reset__Group__2 )
            // InternalLightweight.g:6301:2: rule__Reset__Group__1__Impl rule__Reset__Group__2
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
    // InternalLightweight.g:6308:1: rule__Reset__Group__1__Impl : ( ( rule__Reset__TypeAssignment_1 ) ) ;
    public final void rule__Reset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6312:1: ( ( ( rule__Reset__TypeAssignment_1 ) ) )
            // InternalLightweight.g:6313:1: ( ( rule__Reset__TypeAssignment_1 ) )
            {
            // InternalLightweight.g:6313:1: ( ( rule__Reset__TypeAssignment_1 ) )
            // InternalLightweight.g:6314:2: ( rule__Reset__TypeAssignment_1 )
            {
             before(grammarAccess.getResetAccess().getTypeAssignment_1()); 
            // InternalLightweight.g:6315:2: ( rule__Reset__TypeAssignment_1 )
            // InternalLightweight.g:6315:3: rule__Reset__TypeAssignment_1
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
    // InternalLightweight.g:6323:1: rule__Reset__Group__2 : rule__Reset__Group__2__Impl rule__Reset__Group__3 ;
    public final void rule__Reset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6327:1: ( rule__Reset__Group__2__Impl rule__Reset__Group__3 )
            // InternalLightweight.g:6328:2: rule__Reset__Group__2__Impl rule__Reset__Group__3
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
    // InternalLightweight.g:6335:1: rule__Reset__Group__2__Impl : ( ':' ) ;
    public final void rule__Reset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6339:1: ( ( ':' ) )
            // InternalLightweight.g:6340:1: ( ':' )
            {
            // InternalLightweight.g:6340:1: ( ':' )
            // InternalLightweight.g:6341:2: ':'
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
    // InternalLightweight.g:6350:1: rule__Reset__Group__3 : rule__Reset__Group__3__Impl rule__Reset__Group__4 ;
    public final void rule__Reset__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6354:1: ( rule__Reset__Group__3__Impl rule__Reset__Group__4 )
            // InternalLightweight.g:6355:2: rule__Reset__Group__3__Impl rule__Reset__Group__4
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
    // InternalLightweight.g:6362:1: rule__Reset__Group__3__Impl : ( '{' ) ;
    public final void rule__Reset__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6366:1: ( ( '{' ) )
            // InternalLightweight.g:6367:1: ( '{' )
            {
            // InternalLightweight.g:6367:1: ( '{' )
            // InternalLightweight.g:6368:2: '{'
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
    // InternalLightweight.g:6377:1: rule__Reset__Group__4 : rule__Reset__Group__4__Impl rule__Reset__Group__5 ;
    public final void rule__Reset__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6381:1: ( rule__Reset__Group__4__Impl rule__Reset__Group__5 )
            // InternalLightweight.g:6382:2: rule__Reset__Group__4__Impl rule__Reset__Group__5
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
    // InternalLightweight.g:6389:1: rule__Reset__Group__4__Impl : ( 'name' ) ;
    public final void rule__Reset__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6393:1: ( ( 'name' ) )
            // InternalLightweight.g:6394:1: ( 'name' )
            {
            // InternalLightweight.g:6394:1: ( 'name' )
            // InternalLightweight.g:6395:2: 'name'
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
    // InternalLightweight.g:6404:1: rule__Reset__Group__5 : rule__Reset__Group__5__Impl rule__Reset__Group__6 ;
    public final void rule__Reset__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6408:1: ( rule__Reset__Group__5__Impl rule__Reset__Group__6 )
            // InternalLightweight.g:6409:2: rule__Reset__Group__5__Impl rule__Reset__Group__6
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
    // InternalLightweight.g:6416:1: rule__Reset__Group__5__Impl : ( ':' ) ;
    public final void rule__Reset__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6420:1: ( ( ':' ) )
            // InternalLightweight.g:6421:1: ( ':' )
            {
            // InternalLightweight.g:6421:1: ( ':' )
            // InternalLightweight.g:6422:2: ':'
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
    // InternalLightweight.g:6431:1: rule__Reset__Group__6 : rule__Reset__Group__6__Impl rule__Reset__Group__7 ;
    public final void rule__Reset__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6435:1: ( rule__Reset__Group__6__Impl rule__Reset__Group__7 )
            // InternalLightweight.g:6436:2: rule__Reset__Group__6__Impl rule__Reset__Group__7
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
    // InternalLightweight.g:6443:1: rule__Reset__Group__6__Impl : ( ( rule__Reset__NameAssignment_6 ) ) ;
    public final void rule__Reset__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6447:1: ( ( ( rule__Reset__NameAssignment_6 ) ) )
            // InternalLightweight.g:6448:1: ( ( rule__Reset__NameAssignment_6 ) )
            {
            // InternalLightweight.g:6448:1: ( ( rule__Reset__NameAssignment_6 ) )
            // InternalLightweight.g:6449:2: ( rule__Reset__NameAssignment_6 )
            {
             before(grammarAccess.getResetAccess().getNameAssignment_6()); 
            // InternalLightweight.g:6450:2: ( rule__Reset__NameAssignment_6 )
            // InternalLightweight.g:6450:3: rule__Reset__NameAssignment_6
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
    // InternalLightweight.g:6458:1: rule__Reset__Group__7 : rule__Reset__Group__7__Impl rule__Reset__Group__8 ;
    public final void rule__Reset__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6462:1: ( rule__Reset__Group__7__Impl rule__Reset__Group__8 )
            // InternalLightweight.g:6463:2: rule__Reset__Group__7__Impl rule__Reset__Group__8
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
    // InternalLightweight.g:6470:1: rule__Reset__Group__7__Impl : ( ',' ) ;
    public final void rule__Reset__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6474:1: ( ( ',' ) )
            // InternalLightweight.g:6475:1: ( ',' )
            {
            // InternalLightweight.g:6475:1: ( ',' )
            // InternalLightweight.g:6476:2: ','
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
    // InternalLightweight.g:6485:1: rule__Reset__Group__8 : rule__Reset__Group__8__Impl rule__Reset__Group__9 ;
    public final void rule__Reset__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6489:1: ( rule__Reset__Group__8__Impl rule__Reset__Group__9 )
            // InternalLightweight.g:6490:2: rule__Reset__Group__8__Impl rule__Reset__Group__9
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
    // InternalLightweight.g:6497:1: rule__Reset__Group__8__Impl : ( 'authenticator' ) ;
    public final void rule__Reset__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6501:1: ( ( 'authenticator' ) )
            // InternalLightweight.g:6502:1: ( 'authenticator' )
            {
            // InternalLightweight.g:6502:1: ( 'authenticator' )
            // InternalLightweight.g:6503:2: 'authenticator'
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
    // InternalLightweight.g:6512:1: rule__Reset__Group__9 : rule__Reset__Group__9__Impl rule__Reset__Group__10 ;
    public final void rule__Reset__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6516:1: ( rule__Reset__Group__9__Impl rule__Reset__Group__10 )
            // InternalLightweight.g:6517:2: rule__Reset__Group__9__Impl rule__Reset__Group__10
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
    // InternalLightweight.g:6524:1: rule__Reset__Group__9__Impl : ( ':' ) ;
    public final void rule__Reset__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6528:1: ( ( ':' ) )
            // InternalLightweight.g:6529:1: ( ':' )
            {
            // InternalLightweight.g:6529:1: ( ':' )
            // InternalLightweight.g:6530:2: ':'
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
    // InternalLightweight.g:6539:1: rule__Reset__Group__10 : rule__Reset__Group__10__Impl rule__Reset__Group__11 ;
    public final void rule__Reset__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6543:1: ( rule__Reset__Group__10__Impl rule__Reset__Group__11 )
            // InternalLightweight.g:6544:2: rule__Reset__Group__10__Impl rule__Reset__Group__11
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
    // InternalLightweight.g:6551:1: rule__Reset__Group__10__Impl : ( ( rule__Reset__AuthenticatorAssignment_10 ) ) ;
    public final void rule__Reset__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6555:1: ( ( ( rule__Reset__AuthenticatorAssignment_10 ) ) )
            // InternalLightweight.g:6556:1: ( ( rule__Reset__AuthenticatorAssignment_10 ) )
            {
            // InternalLightweight.g:6556:1: ( ( rule__Reset__AuthenticatorAssignment_10 ) )
            // InternalLightweight.g:6557:2: ( rule__Reset__AuthenticatorAssignment_10 )
            {
             before(grammarAccess.getResetAccess().getAuthenticatorAssignment_10()); 
            // InternalLightweight.g:6558:2: ( rule__Reset__AuthenticatorAssignment_10 )
            // InternalLightweight.g:6558:3: rule__Reset__AuthenticatorAssignment_10
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
    // InternalLightweight.g:6566:1: rule__Reset__Group__11 : rule__Reset__Group__11__Impl rule__Reset__Group__12 ;
    public final void rule__Reset__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6570:1: ( rule__Reset__Group__11__Impl rule__Reset__Group__12 )
            // InternalLightweight.g:6571:2: rule__Reset__Group__11__Impl rule__Reset__Group__12
            {
            pushFollow(FOLLOW_46);
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
    // InternalLightweight.g:6578:1: rule__Reset__Group__11__Impl : ( ',' ) ;
    public final void rule__Reset__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6582:1: ( ( ',' ) )
            // InternalLightweight.g:6583:1: ( ',' )
            {
            // InternalLightweight.g:6583:1: ( ',' )
            // InternalLightweight.g:6584:2: ','
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
    // InternalLightweight.g:6593:1: rule__Reset__Group__12 : rule__Reset__Group__12__Impl rule__Reset__Group__13 ;
    public final void rule__Reset__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6597:1: ( rule__Reset__Group__12__Impl rule__Reset__Group__13 )
            // InternalLightweight.g:6598:2: rule__Reset__Group__12__Impl rule__Reset__Group__13
            {
            pushFollow(FOLLOW_3);
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
    // InternalLightweight.g:6605:1: rule__Reset__Group__12__Impl : ( 'authentication' ) ;
    public final void rule__Reset__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6609:1: ( ( 'authentication' ) )
            // InternalLightweight.g:6610:1: ( 'authentication' )
            {
            // InternalLightweight.g:6610:1: ( 'authentication' )
            // InternalLightweight.g:6611:2: 'authentication'
            {
             before(grammarAccess.getResetAccess().getAuthenticationKeyword_12()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getAuthenticationKeyword_12()); 

            }


            }

        }
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
    // InternalLightweight.g:6620:1: rule__Reset__Group__13 : rule__Reset__Group__13__Impl rule__Reset__Group__14 ;
    public final void rule__Reset__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6624:1: ( rule__Reset__Group__13__Impl rule__Reset__Group__14 )
            // InternalLightweight.g:6625:2: rule__Reset__Group__13__Impl rule__Reset__Group__14
            {
            pushFollow(FOLLOW_19);
            rule__Reset__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group__14();

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
    // InternalLightweight.g:6632:1: rule__Reset__Group__13__Impl : ( ':' ) ;
    public final void rule__Reset__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6636:1: ( ( ':' ) )
            // InternalLightweight.g:6637:1: ( ':' )
            {
            // InternalLightweight.g:6637:1: ( ':' )
            // InternalLightweight.g:6638:2: ':'
            {
             before(grammarAccess.getResetAccess().getColonKeyword_13()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getColonKeyword_13()); 

            }


            }

        }
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


    // $ANTLR start "rule__Reset__Group__14"
    // InternalLightweight.g:6647:1: rule__Reset__Group__14 : rule__Reset__Group__14__Impl rule__Reset__Group__15 ;
    public final void rule__Reset__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6651:1: ( rule__Reset__Group__14__Impl rule__Reset__Group__15 )
            // InternalLightweight.g:6652:2: rule__Reset__Group__14__Impl rule__Reset__Group__15
            {
            pushFollow(FOLLOW_52);
            rule__Reset__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group__15();

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
    // $ANTLR end "rule__Reset__Group__14"


    // $ANTLR start "rule__Reset__Group__14__Impl"
    // InternalLightweight.g:6659:1: rule__Reset__Group__14__Impl : ( ( rule__Reset__AuthMethodsAssignment_14 ) ) ;
    public final void rule__Reset__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6663:1: ( ( ( rule__Reset__AuthMethodsAssignment_14 ) ) )
            // InternalLightweight.g:6664:1: ( ( rule__Reset__AuthMethodsAssignment_14 ) )
            {
            // InternalLightweight.g:6664:1: ( ( rule__Reset__AuthMethodsAssignment_14 ) )
            // InternalLightweight.g:6665:2: ( rule__Reset__AuthMethodsAssignment_14 )
            {
             before(grammarAccess.getResetAccess().getAuthMethodsAssignment_14()); 
            // InternalLightweight.g:6666:2: ( rule__Reset__AuthMethodsAssignment_14 )
            // InternalLightweight.g:6666:3: rule__Reset__AuthMethodsAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__Reset__AuthMethodsAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getResetAccess().getAuthMethodsAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__14__Impl"


    // $ANTLR start "rule__Reset__Group__15"
    // InternalLightweight.g:6674:1: rule__Reset__Group__15 : rule__Reset__Group__15__Impl rule__Reset__Group__16 ;
    public final void rule__Reset__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6678:1: ( rule__Reset__Group__15__Impl rule__Reset__Group__16 )
            // InternalLightweight.g:6679:2: rule__Reset__Group__15__Impl rule__Reset__Group__16
            {
            pushFollow(FOLLOW_52);
            rule__Reset__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group__16();

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
    // $ANTLR end "rule__Reset__Group__15"


    // $ANTLR start "rule__Reset__Group__15__Impl"
    // InternalLightweight.g:6686:1: rule__Reset__Group__15__Impl : ( ( rule__Reset__Group_15__0 )* ) ;
    public final void rule__Reset__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6690:1: ( ( ( rule__Reset__Group_15__0 )* ) )
            // InternalLightweight.g:6691:1: ( ( rule__Reset__Group_15__0 )* )
            {
            // InternalLightweight.g:6691:1: ( ( rule__Reset__Group_15__0 )* )
            // InternalLightweight.g:6692:2: ( rule__Reset__Group_15__0 )*
            {
             before(grammarAccess.getResetAccess().getGroup_15()); 
            // InternalLightweight.g:6693:2: ( rule__Reset__Group_15__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==59) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalLightweight.g:6693:3: rule__Reset__Group_15__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__Reset__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getResetAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__15__Impl"


    // $ANTLR start "rule__Reset__Group__16"
    // InternalLightweight.g:6701:1: rule__Reset__Group__16 : rule__Reset__Group__16__Impl ;
    public final void rule__Reset__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6705:1: ( rule__Reset__Group__16__Impl )
            // InternalLightweight.g:6706:2: rule__Reset__Group__16__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reset__Group__16__Impl();

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
    // $ANTLR end "rule__Reset__Group__16"


    // $ANTLR start "rule__Reset__Group__16__Impl"
    // InternalLightweight.g:6712:1: rule__Reset__Group__16__Impl : ( '}' ) ;
    public final void rule__Reset__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6716:1: ( ( '}' ) )
            // InternalLightweight.g:6717:1: ( '}' )
            {
            // InternalLightweight.g:6717:1: ( '}' )
            // InternalLightweight.g:6718:2: '}'
            {
             before(grammarAccess.getResetAccess().getRightCurlyBracketKeyword_16()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group__16__Impl"


    // $ANTLR start "rule__Reset__Group_15__0"
    // InternalLightweight.g:6728:1: rule__Reset__Group_15__0 : rule__Reset__Group_15__0__Impl rule__Reset__Group_15__1 ;
    public final void rule__Reset__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6732:1: ( rule__Reset__Group_15__0__Impl rule__Reset__Group_15__1 )
            // InternalLightweight.g:6733:2: rule__Reset__Group_15__0__Impl rule__Reset__Group_15__1
            {
            pushFollow(FOLLOW_19);
            rule__Reset__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reset__Group_15__1();

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
    // $ANTLR end "rule__Reset__Group_15__0"


    // $ANTLR start "rule__Reset__Group_15__0__Impl"
    // InternalLightweight.g:6740:1: rule__Reset__Group_15__0__Impl : ( '||' ) ;
    public final void rule__Reset__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6744:1: ( ( '||' ) )
            // InternalLightweight.g:6745:1: ( '||' )
            {
            // InternalLightweight.g:6745:1: ( '||' )
            // InternalLightweight.g:6746:2: '||'
            {
             before(grammarAccess.getResetAccess().getVerticalLineVerticalLineKeyword_15_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getVerticalLineVerticalLineKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group_15__0__Impl"


    // $ANTLR start "rule__Reset__Group_15__1"
    // InternalLightweight.g:6755:1: rule__Reset__Group_15__1 : rule__Reset__Group_15__1__Impl ;
    public final void rule__Reset__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6759:1: ( rule__Reset__Group_15__1__Impl )
            // InternalLightweight.g:6760:2: rule__Reset__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reset__Group_15__1__Impl();

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
    // $ANTLR end "rule__Reset__Group_15__1"


    // $ANTLR start "rule__Reset__Group_15__1__Impl"
    // InternalLightweight.g:6766:1: rule__Reset__Group_15__1__Impl : ( ( rule__Reset__AuthMethodsAssignment_15_1 ) ) ;
    public final void rule__Reset__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6770:1: ( ( ( rule__Reset__AuthMethodsAssignment_15_1 ) ) )
            // InternalLightweight.g:6771:1: ( ( rule__Reset__AuthMethodsAssignment_15_1 ) )
            {
            // InternalLightweight.g:6771:1: ( ( rule__Reset__AuthMethodsAssignment_15_1 ) )
            // InternalLightweight.g:6772:2: ( rule__Reset__AuthMethodsAssignment_15_1 )
            {
             before(grammarAccess.getResetAccess().getAuthMethodsAssignment_15_1()); 
            // InternalLightweight.g:6773:2: ( rule__Reset__AuthMethodsAssignment_15_1 )
            // InternalLightweight.g:6773:3: rule__Reset__AuthMethodsAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__Reset__AuthMethodsAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getResetAccess().getAuthMethodsAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__Group_15__1__Impl"


    // $ANTLR start "rule__App__AuthenticatorsAssignment_6"
    // InternalLightweight.g:6782:1: rule__App__AuthenticatorsAssignment_6 : ( ruleAuthenticator ) ;
    public final void rule__App__AuthenticatorsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6786:1: ( ( ruleAuthenticator ) )
            // InternalLightweight.g:6787:2: ( ruleAuthenticator )
            {
            // InternalLightweight.g:6787:2: ( ruleAuthenticator )
            // InternalLightweight.g:6788:3: ruleAuthenticator
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
    // InternalLightweight.g:6797:1: rule__App__AuthenticatorsAssignment_7_1 : ( ruleAuthenticator ) ;
    public final void rule__App__AuthenticatorsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6801:1: ( ( ruleAuthenticator ) )
            // InternalLightweight.g:6802:2: ( ruleAuthenticator )
            {
            // InternalLightweight.g:6802:2: ( ruleAuthenticator )
            // InternalLightweight.g:6803:3: ruleAuthenticator
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
    // InternalLightweight.g:6812:1: rule__App__AuthMethodsAssignment_13 : ( ruleAuthMethod ) ;
    public final void rule__App__AuthMethodsAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6816:1: ( ( ruleAuthMethod ) )
            // InternalLightweight.g:6817:2: ( ruleAuthMethod )
            {
            // InternalLightweight.g:6817:2: ( ruleAuthMethod )
            // InternalLightweight.g:6818:3: ruleAuthMethod
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
    // InternalLightweight.g:6827:1: rule__App__AuthMethodsAssignment_14_1 : ( ruleAuthMethod ) ;
    public final void rule__App__AuthMethodsAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6831:1: ( ( ruleAuthMethod ) )
            // InternalLightweight.g:6832:2: ( ruleAuthMethod )
            {
            // InternalLightweight.g:6832:2: ( ruleAuthMethod )
            // InternalLightweight.g:6833:3: ruleAuthMethod
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
    // InternalLightweight.g:6842:1: rule__App__PhasesAssignment_20 : ( rulePhase ) ;
    public final void rule__App__PhasesAssignment_20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6846:1: ( ( rulePhase ) )
            // InternalLightweight.g:6847:2: ( rulePhase )
            {
            // InternalLightweight.g:6847:2: ( rulePhase )
            // InternalLightweight.g:6848:3: rulePhase
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
    // InternalLightweight.g:6857:1: rule__App__PhasesAssignment_21_1 : ( rulePhase ) ;
    public final void rule__App__PhasesAssignment_21_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6861:1: ( ( rulePhase ) )
            // InternalLightweight.g:6862:2: ( rulePhase )
            {
            // InternalLightweight.g:6862:2: ( rulePhase )
            // InternalLightweight.g:6863:3: rulePhase
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
    // InternalLightweight.g:6872:1: rule__MFA__TypeAssignment_0 : ( ( 'MFA' ) ) ;
    public final void rule__MFA__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6876:1: ( ( ( 'MFA' ) ) )
            // InternalLightweight.g:6877:2: ( ( 'MFA' ) )
            {
            // InternalLightweight.g:6877:2: ( ( 'MFA' ) )
            // InternalLightweight.g:6878:3: ( 'MFA' )
            {
             before(grammarAccess.getMFAAccess().getTypeMFAKeyword_0_0()); 
            // InternalLightweight.g:6879:3: ( 'MFA' )
            // InternalLightweight.g:6880:4: 'MFA'
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
    // InternalLightweight.g:6891:1: rule__MFA__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__MFA__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6895:1: ( ( ruleEString ) )
            // InternalLightweight.g:6896:2: ( ruleEString )
            {
            // InternalLightweight.g:6896:2: ( ruleEString )
            // InternalLightweight.g:6897:3: ruleEString
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
    // InternalLightweight.g:6906:1: rule__MFA__AuthenticatorsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__MFA__AuthenticatorsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6910:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:6911:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:6911:2: ( ( RULE_ID ) )
            // InternalLightweight.g:6912:3: ( RULE_ID )
            {
             before(grammarAccess.getMFAAccess().getAuthenticatorsAuthenticatorCrossReference_9_0()); 
            // InternalLightweight.g:6913:3: ( RULE_ID )
            // InternalLightweight.g:6914:4: RULE_ID
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
    // InternalLightweight.g:6925:1: rule__MFA__AuthenticatorsAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__MFA__AuthenticatorsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6929:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:6930:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:6930:2: ( ( RULE_ID ) )
            // InternalLightweight.g:6931:3: ( RULE_ID )
            {
             before(grammarAccess.getMFAAccess().getAuthenticatorsAuthenticatorCrossReference_11_0()); 
            // InternalLightweight.g:6932:3: ( RULE_ID )
            // InternalLightweight.g:6933:4: RULE_ID
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
    // InternalLightweight.g:6944:1: rule__MFA__CorrelationAssignment_15 : ( ruleEBoolean ) ;
    public final void rule__MFA__CorrelationAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6948:1: ( ( ruleEBoolean ) )
            // InternalLightweight.g:6949:2: ( ruleEBoolean )
            {
            // InternalLightweight.g:6949:2: ( ruleEBoolean )
            // InternalLightweight.g:6950:3: ruleEBoolean
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
    // InternalLightweight.g:6959:1: rule__MFA__ValidationAssignment_19 : ( ruleValidationType ) ;
    public final void rule__MFA__ValidationAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6963:1: ( ( ruleValidationType ) )
            // InternalLightweight.g:6964:2: ( ruleValidationType )
            {
            // InternalLightweight.g:6964:2: ( ruleValidationType )
            // InternalLightweight.g:6965:3: ruleValidationType
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
    // InternalLightweight.g:6974:1: rule__SFA__TypeAssignment_0 : ( ( 'SFA' ) ) ;
    public final void rule__SFA__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6978:1: ( ( ( 'SFA' ) ) )
            // InternalLightweight.g:6979:2: ( ( 'SFA' ) )
            {
            // InternalLightweight.g:6979:2: ( ( 'SFA' ) )
            // InternalLightweight.g:6980:3: ( 'SFA' )
            {
             before(grammarAccess.getSFAAccess().getTypeSFAKeyword_0_0()); 
            // InternalLightweight.g:6981:3: ( 'SFA' )
            // InternalLightweight.g:6982:4: 'SFA'
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
    // InternalLightweight.g:6993:1: rule__SFA__NameAssignment_5 : ( ruleEString ) ;
    public final void rule__SFA__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:6997:1: ( ( ruleEString ) )
            // InternalLightweight.g:6998:2: ( ruleEString )
            {
            // InternalLightweight.g:6998:2: ( ruleEString )
            // InternalLightweight.g:6999:3: ruleEString
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
    // InternalLightweight.g:7008:1: rule__SFA__AuthenticatorsAssignment_9 : ( ( RULE_ID ) ) ;
    public final void rule__SFA__AuthenticatorsAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7012:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:7013:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:7013:2: ( ( RULE_ID ) )
            // InternalLightweight.g:7014:3: ( RULE_ID )
            {
             before(grammarAccess.getSFAAccess().getAuthenticatorsAuthenticatorCrossReference_9_0()); 
            // InternalLightweight.g:7015:3: ( RULE_ID )
            // InternalLightweight.g:7016:4: RULE_ID
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
    // InternalLightweight.g:7027:1: rule__Possession__TypeAssignment_1 : ( ( 'Possession' ) ) ;
    public final void rule__Possession__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7031:1: ( ( ( 'Possession' ) ) )
            // InternalLightweight.g:7032:2: ( ( 'Possession' ) )
            {
            // InternalLightweight.g:7032:2: ( ( 'Possession' ) )
            // InternalLightweight.g:7033:3: ( 'Possession' )
            {
             before(grammarAccess.getPossessionAccess().getTypePossessionKeyword_1_0()); 
            // InternalLightweight.g:7034:3: ( 'Possession' )
            // InternalLightweight.g:7035:4: 'Possession'
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
    // InternalLightweight.g:7046:1: rule__Possession__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Possession__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7050:1: ( ( ruleEString ) )
            // InternalLightweight.g:7051:2: ( ruleEString )
            {
            // InternalLightweight.g:7051:2: ( ruleEString )
            // InternalLightweight.g:7052:3: ruleEString
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
    // InternalLightweight.g:7061:1: rule__Possession__ValueAssignment_10 : ( rulePVALUE ) ;
    public final void rule__Possession__ValueAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7065:1: ( ( rulePVALUE ) )
            // InternalLightweight.g:7066:2: ( rulePVALUE )
            {
            // InternalLightweight.g:7066:2: ( rulePVALUE )
            // InternalLightweight.g:7067:3: rulePVALUE
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
    // InternalLightweight.g:7076:1: rule__Knowledge__TypeAssignment_1 : ( ( 'Knowledge' ) ) ;
    public final void rule__Knowledge__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7080:1: ( ( ( 'Knowledge' ) ) )
            // InternalLightweight.g:7081:2: ( ( 'Knowledge' ) )
            {
            // InternalLightweight.g:7081:2: ( ( 'Knowledge' ) )
            // InternalLightweight.g:7082:3: ( 'Knowledge' )
            {
             before(grammarAccess.getKnowledgeAccess().getTypeKnowledgeKeyword_1_0()); 
            // InternalLightweight.g:7083:3: ( 'Knowledge' )
            // InternalLightweight.g:7084:4: 'Knowledge'
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
    // InternalLightweight.g:7095:1: rule__Knowledge__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Knowledge__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7099:1: ( ( ruleEString ) )
            // InternalLightweight.g:7100:2: ( ruleEString )
            {
            // InternalLightweight.g:7100:2: ( ruleEString )
            // InternalLightweight.g:7101:3: ruleEString
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
    // InternalLightweight.g:7110:1: rule__Knowledge__ValueAssignment_10 : ( ruleKVALUE ) ;
    public final void rule__Knowledge__ValueAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7114:1: ( ( ruleKVALUE ) )
            // InternalLightweight.g:7115:2: ( ruleKVALUE )
            {
            // InternalLightweight.g:7115:2: ( ruleKVALUE )
            // InternalLightweight.g:7116:3: ruleKVALUE
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
    // InternalLightweight.g:7125:1: rule__Knowledge__LimitedAttemptsAssignment_14 : ( ruleEBoolean ) ;
    public final void rule__Knowledge__LimitedAttemptsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7129:1: ( ( ruleEBoolean ) )
            // InternalLightweight.g:7130:2: ( ruleEBoolean )
            {
            // InternalLightweight.g:7130:2: ( ruleEBoolean )
            // InternalLightweight.g:7131:3: ruleEBoolean
            {
             before(grammarAccess.getKnowledgeAccess().getLimitedAttemptsEBooleanParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getKnowledgeAccess().getLimitedAttemptsEBooleanParserRuleCall_14_0()); 

            }


            }

        }
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
    // InternalLightweight.g:7140:1: rule__Knowledge__AutofilledAssignment_18 : ( ruleEBoolean ) ;
    public final void rule__Knowledge__AutofilledAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7144:1: ( ( ruleEBoolean ) )
            // InternalLightweight.g:7145:2: ( ruleEBoolean )
            {
            // InternalLightweight.g:7145:2: ( ruleEBoolean )
            // InternalLightweight.g:7146:3: ruleEBoolean
            {
             before(grammarAccess.getKnowledgeAccess().getAutofilledEBooleanParserRuleCall_18_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getKnowledgeAccess().getAutofilledEBooleanParserRuleCall_18_0()); 

            }


            }

        }
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
    // InternalLightweight.g:7155:1: rule__Biometrics__TypeAssignment_1 : ( ( 'Biometrics' ) ) ;
    public final void rule__Biometrics__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7159:1: ( ( ( 'Biometrics' ) ) )
            // InternalLightweight.g:7160:2: ( ( 'Biometrics' ) )
            {
            // InternalLightweight.g:7160:2: ( ( 'Biometrics' ) )
            // InternalLightweight.g:7161:3: ( 'Biometrics' )
            {
             before(grammarAccess.getBiometricsAccess().getTypeBiometricsKeyword_1_0()); 
            // InternalLightweight.g:7162:3: ( 'Biometrics' )
            // InternalLightweight.g:7163:4: 'Biometrics'
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
    // InternalLightweight.g:7174:1: rule__Biometrics__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Biometrics__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7178:1: ( ( ruleEString ) )
            // InternalLightweight.g:7179:2: ( ruleEString )
            {
            // InternalLightweight.g:7179:2: ( ruleEString )
            // InternalLightweight.g:7180:3: ruleEString
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
    // InternalLightweight.g:7189:1: rule__Biometrics__ValueAssignment_10 : ( ruleBVALUE ) ;
    public final void rule__Biometrics__ValueAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7193:1: ( ( ruleBVALUE ) )
            // InternalLightweight.g:7194:2: ( ruleBVALUE )
            {
            // InternalLightweight.g:7194:2: ( ruleBVALUE )
            // InternalLightweight.g:7195:3: ruleBVALUE
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
    // InternalLightweight.g:7204:1: rule__Registration__TypeAssignment_1 : ( ( 'Registration' ) ) ;
    public final void rule__Registration__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7208:1: ( ( ( 'Registration' ) ) )
            // InternalLightweight.g:7209:2: ( ( 'Registration' ) )
            {
            // InternalLightweight.g:7209:2: ( ( 'Registration' ) )
            // InternalLightweight.g:7210:3: ( 'Registration' )
            {
             before(grammarAccess.getRegistrationAccess().getTypeRegistrationKeyword_1_0()); 
            // InternalLightweight.g:7211:3: ( 'Registration' )
            // InternalLightweight.g:7212:4: 'Registration'
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
    // InternalLightweight.g:7223:1: rule__Registration__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Registration__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7227:1: ( ( ruleEString ) )
            // InternalLightweight.g:7228:2: ( ruleEString )
            {
            // InternalLightweight.g:7228:2: ( ruleEString )
            // InternalLightweight.g:7229:3: ruleEString
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
    // InternalLightweight.g:7238:1: rule__Registration__AttributesAssignment_11 : ( ruleAttribute ) ;
    public final void rule__Registration__AttributesAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7242:1: ( ( ruleAttribute ) )
            // InternalLightweight.g:7243:2: ( ruleAttribute )
            {
            // InternalLightweight.g:7243:2: ( ruleAttribute )
            // InternalLightweight.g:7244:3: ruleAttribute
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
    // InternalLightweight.g:7253:1: rule__Registration__AttributesAssignment_12_1 : ( ruleAttribute ) ;
    public final void rule__Registration__AttributesAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7257:1: ( ( ruleAttribute ) )
            // InternalLightweight.g:7258:2: ( ruleAttribute )
            {
            // InternalLightweight.g:7258:2: ( ruleAttribute )
            // InternalLightweight.g:7259:3: ruleAttribute
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
    // InternalLightweight.g:7268:1: rule__Attribute__NameAssignment_4 : ( ruleEString ) ;
    public final void rule__Attribute__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7272:1: ( ( ruleEString ) )
            // InternalLightweight.g:7273:2: ( ruleEString )
            {
            // InternalLightweight.g:7273:2: ( ruleEString )
            // InternalLightweight.g:7274:3: ruleEString
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
    // InternalLightweight.g:7283:1: rule__Attribute__ProviderAssignment_8 : ( rulePROVIDER ) ;
    public final void rule__Attribute__ProviderAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7287:1: ( ( rulePROVIDER ) )
            // InternalLightweight.g:7288:2: ( rulePROVIDER )
            {
            // InternalLightweight.g:7288:2: ( rulePROVIDER )
            // InternalLightweight.g:7289:3: rulePROVIDER
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
    // InternalLightweight.g:7298:1: rule__Attribute__TypeAssignment_12 : ( ruleCredTYPE ) ;
    public final void rule__Attribute__TypeAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7302:1: ( ( ruleCredTYPE ) )
            // InternalLightweight.g:7303:2: ( ruleCredTYPE )
            {
            // InternalLightweight.g:7303:2: ( ruleCredTYPE )
            // InternalLightweight.g:7304:3: ruleCredTYPE
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
    // InternalLightweight.g:7313:1: rule__Attribute__VerifmethodAssignment_14_2 : ( ruleVerifMethod ) ;
    public final void rule__Attribute__VerifmethodAssignment_14_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7317:1: ( ( ruleVerifMethod ) )
            // InternalLightweight.g:7318:2: ( ruleVerifMethod )
            {
            // InternalLightweight.g:7318:2: ( ruleVerifMethod )
            // InternalLightweight.g:7319:3: ruleVerifMethod
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
    // InternalLightweight.g:7328:1: rule__VerifMethod__ValidityAssignment_4 : ( ruleEBoolean ) ;
    public final void rule__VerifMethod__ValidityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7332:1: ( ( ruleEBoolean ) )
            // InternalLightweight.g:7333:2: ( ruleEBoolean )
            {
            // InternalLightweight.g:7333:2: ( ruleEBoolean )
            // InternalLightweight.g:7334:3: ruleEBoolean
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
    // InternalLightweight.g:7343:1: rule__VerifMethod__UniquenessAssignment_8 : ( ruleEBoolean ) ;
    public final void rule__VerifMethod__UniquenessAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7347:1: ( ( ruleEBoolean ) )
            // InternalLightweight.g:7348:2: ( ruleEBoolean )
            {
            // InternalLightweight.g:7348:2: ( ruleEBoolean )
            // InternalLightweight.g:7349:3: ruleEBoolean
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
    // InternalLightweight.g:7358:1: rule__VerifMethod__BindingsAssignment_12 : ( ruleEBoolean ) ;
    public final void rule__VerifMethod__BindingsAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7362:1: ( ( ruleEBoolean ) )
            // InternalLightweight.g:7363:2: ( ruleEBoolean )
            {
            // InternalLightweight.g:7363:2: ( ruleEBoolean )
            // InternalLightweight.g:7364:3: ruleEBoolean
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
    // InternalLightweight.g:7373:1: rule__Recovery__TypeAssignment_1 : ( ( 'Recovery' ) ) ;
    public final void rule__Recovery__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7377:1: ( ( ( 'Recovery' ) ) )
            // InternalLightweight.g:7378:2: ( ( 'Recovery' ) )
            {
            // InternalLightweight.g:7378:2: ( ( 'Recovery' ) )
            // InternalLightweight.g:7379:3: ( 'Recovery' )
            {
             before(grammarAccess.getRecoveryAccess().getTypeRecoveryKeyword_1_0()); 
            // InternalLightweight.g:7380:3: ( 'Recovery' )
            // InternalLightweight.g:7381:4: 'Recovery'
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
    // InternalLightweight.g:7392:1: rule__Recovery__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Recovery__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7396:1: ( ( ruleEString ) )
            // InternalLightweight.g:7397:2: ( ruleEString )
            {
            // InternalLightweight.g:7397:2: ( ruleEString )
            // InternalLightweight.g:7398:3: ruleEString
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


    // $ANTLR start "rule__Recovery__AuthenticatorAssignment_8_2"
    // InternalLightweight.g:7407:1: rule__Recovery__AuthenticatorAssignment_8_2 : ( ( RULE_ID ) ) ;
    public final void rule__Recovery__AuthenticatorAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7411:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:7412:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:7412:2: ( ( RULE_ID ) )
            // InternalLightweight.g:7413:3: ( RULE_ID )
            {
             before(grammarAccess.getRecoveryAccess().getAuthenticatorAuthenticatorCrossReference_8_2_0()); 
            // InternalLightweight.g:7414:3: ( RULE_ID )
            // InternalLightweight.g:7415:4: RULE_ID
            {
             before(grammarAccess.getRecoveryAccess().getAuthenticatorAuthenticatorIDTerminalRuleCall_8_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getAuthenticatorAuthenticatorIDTerminalRuleCall_8_2_0_1()); 

            }

             after(grammarAccess.getRecoveryAccess().getAuthenticatorAuthenticatorCrossReference_8_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__AuthenticatorAssignment_8_2"


    // $ANTLR start "rule__Recovery__AuthMethodsAssignment_11"
    // InternalLightweight.g:7426:1: rule__Recovery__AuthMethodsAssignment_11 : ( ( RULE_ID ) ) ;
    public final void rule__Recovery__AuthMethodsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7430:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:7431:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:7431:2: ( ( RULE_ID ) )
            // InternalLightweight.g:7432:3: ( RULE_ID )
            {
             before(grammarAccess.getRecoveryAccess().getAuthMethodsAuthMethodCrossReference_11_0()); 
            // InternalLightweight.g:7433:3: ( RULE_ID )
            // InternalLightweight.g:7434:4: RULE_ID
            {
             before(grammarAccess.getRecoveryAccess().getAuthMethodsAuthMethodIDTerminalRuleCall_11_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getAuthMethodsAuthMethodIDTerminalRuleCall_11_0_1()); 

            }

             after(grammarAccess.getRecoveryAccess().getAuthMethodsAuthMethodCrossReference_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__AuthMethodsAssignment_11"


    // $ANTLR start "rule__Recovery__AuthMethodsAssignment_12_1"
    // InternalLightweight.g:7445:1: rule__Recovery__AuthMethodsAssignment_12_1 : ( ( RULE_ID ) ) ;
    public final void rule__Recovery__AuthMethodsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7449:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:7450:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:7450:2: ( ( RULE_ID ) )
            // InternalLightweight.g:7451:3: ( RULE_ID )
            {
             before(grammarAccess.getRecoveryAccess().getAuthMethodsAuthMethodCrossReference_12_1_0()); 
            // InternalLightweight.g:7452:3: ( RULE_ID )
            // InternalLightweight.g:7453:4: RULE_ID
            {
             before(grammarAccess.getRecoveryAccess().getAuthMethodsAuthMethodIDTerminalRuleCall_12_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRecoveryAccess().getAuthMethodsAuthMethodIDTerminalRuleCall_12_1_0_1()); 

            }

             after(grammarAccess.getRecoveryAccess().getAuthMethodsAuthMethodCrossReference_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Recovery__AuthMethodsAssignment_12_1"


    // $ANTLR start "rule__Recovery__ProtocolAssignment_13_2"
    // InternalLightweight.g:7464:1: rule__Recovery__ProtocolAssignment_13_2 : ( ruleProtocol ) ;
    public final void rule__Recovery__ProtocolAssignment_13_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7468:1: ( ( ruleProtocol ) )
            // InternalLightweight.g:7469:2: ( ruleProtocol )
            {
            // InternalLightweight.g:7469:2: ( ruleProtocol )
            // InternalLightweight.g:7470:3: ruleProtocol
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
    // InternalLightweight.g:7479:1: rule__Login__TypeAssignment_1 : ( ( 'Login' ) ) ;
    public final void rule__Login__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7483:1: ( ( ( 'Login' ) ) )
            // InternalLightweight.g:7484:2: ( ( 'Login' ) )
            {
            // InternalLightweight.g:7484:2: ( ( 'Login' ) )
            // InternalLightweight.g:7485:3: ( 'Login' )
            {
             before(grammarAccess.getLoginAccess().getTypeLoginKeyword_1_0()); 
            // InternalLightweight.g:7486:3: ( 'Login' )
            // InternalLightweight.g:7487:4: 'Login'
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
    // InternalLightweight.g:7498:1: rule__Login__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Login__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7502:1: ( ( ruleEString ) )
            // InternalLightweight.g:7503:2: ( ruleEString )
            {
            // InternalLightweight.g:7503:2: ( ruleEString )
            // InternalLightweight.g:7504:3: ruleEString
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
    // InternalLightweight.g:7513:1: rule__Login__SessionAssignment_10 : ( ruleEBoolean ) ;
    public final void rule__Login__SessionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7517:1: ( ( ruleEBoolean ) )
            // InternalLightweight.g:7518:2: ( ruleEBoolean )
            {
            // InternalLightweight.g:7518:2: ( ruleEBoolean )
            // InternalLightweight.g:7519:3: ruleEBoolean
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
    // InternalLightweight.g:7528:1: rule__Login__AuthMethodsAssignment_14 : ( ( RULE_ID ) ) ;
    public final void rule__Login__AuthMethodsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7532:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:7533:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:7533:2: ( ( RULE_ID ) )
            // InternalLightweight.g:7534:3: ( RULE_ID )
            {
             before(grammarAccess.getLoginAccess().getAuthMethodsAuthMethodCrossReference_14_0()); 
            // InternalLightweight.g:7535:3: ( RULE_ID )
            // InternalLightweight.g:7536:4: RULE_ID
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
    // InternalLightweight.g:7547:1: rule__Login__AuthMethodsAssignment_15_1 : ( ( RULE_ID ) ) ;
    public final void rule__Login__AuthMethodsAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7551:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:7552:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:7552:2: ( ( RULE_ID ) )
            // InternalLightweight.g:7553:3: ( RULE_ID )
            {
             before(grammarAccess.getLoginAccess().getAuthMethodsAuthMethodCrossReference_15_1_0()); 
            // InternalLightweight.g:7554:3: ( RULE_ID )
            // InternalLightweight.g:7555:4: RULE_ID
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
    // InternalLightweight.g:7566:1: rule__Reset__TypeAssignment_1 : ( ( 'Reset' ) ) ;
    public final void rule__Reset__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7570:1: ( ( ( 'Reset' ) ) )
            // InternalLightweight.g:7571:2: ( ( 'Reset' ) )
            {
            // InternalLightweight.g:7571:2: ( ( 'Reset' ) )
            // InternalLightweight.g:7572:3: ( 'Reset' )
            {
             before(grammarAccess.getResetAccess().getTypeResetKeyword_1_0()); 
            // InternalLightweight.g:7573:3: ( 'Reset' )
            // InternalLightweight.g:7574:4: 'Reset'
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
    // InternalLightweight.g:7585:1: rule__Reset__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Reset__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7589:1: ( ( ruleEString ) )
            // InternalLightweight.g:7590:2: ( ruleEString )
            {
            // InternalLightweight.g:7590:2: ( ruleEString )
            // InternalLightweight.g:7591:3: ruleEString
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
    // InternalLightweight.g:7600:1: rule__Reset__AuthenticatorAssignment_10 : ( ( RULE_ID ) ) ;
    public final void rule__Reset__AuthenticatorAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7604:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:7605:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:7605:2: ( ( RULE_ID ) )
            // InternalLightweight.g:7606:3: ( RULE_ID )
            {
             before(grammarAccess.getResetAccess().getAuthenticatorAuthenticatorCrossReference_10_0()); 
            // InternalLightweight.g:7607:3: ( RULE_ID )
            // InternalLightweight.g:7608:4: RULE_ID
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


    // $ANTLR start "rule__Reset__AuthMethodsAssignment_14"
    // InternalLightweight.g:7619:1: rule__Reset__AuthMethodsAssignment_14 : ( ( RULE_ID ) ) ;
    public final void rule__Reset__AuthMethodsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7623:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:7624:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:7624:2: ( ( RULE_ID ) )
            // InternalLightweight.g:7625:3: ( RULE_ID )
            {
             before(grammarAccess.getResetAccess().getAuthMethodsAuthMethodCrossReference_14_0()); 
            // InternalLightweight.g:7626:3: ( RULE_ID )
            // InternalLightweight.g:7627:4: RULE_ID
            {
             before(grammarAccess.getResetAccess().getAuthMethodsAuthMethodIDTerminalRuleCall_14_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getAuthMethodsAuthMethodIDTerminalRuleCall_14_0_1()); 

            }

             after(grammarAccess.getResetAccess().getAuthMethodsAuthMethodCrossReference_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__AuthMethodsAssignment_14"


    // $ANTLR start "rule__Reset__AuthMethodsAssignment_15_1"
    // InternalLightweight.g:7638:1: rule__Reset__AuthMethodsAssignment_15_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reset__AuthMethodsAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalLightweight.g:7642:1: ( ( ( RULE_ID ) ) )
            // InternalLightweight.g:7643:2: ( ( RULE_ID ) )
            {
            // InternalLightweight.g:7643:2: ( ( RULE_ID ) )
            // InternalLightweight.g:7644:3: ( RULE_ID )
            {
             before(grammarAccess.getResetAccess().getAuthMethodsAuthMethodCrossReference_15_1_0()); 
            // InternalLightweight.g:7645:3: ( RULE_ID )
            // InternalLightweight.g:7646:4: RULE_ID
            {
             before(grammarAccess.getResetAccess().getAuthMethodsAuthMethodIDTerminalRuleCall_15_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResetAccess().getAuthMethodsAuthMethodIDTerminalRuleCall_15_1_0_1()); 

            }

             after(grammarAccess.getResetAccess().getAuthMethodsAuthMethodCrossReference_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reset__AuthMethodsAssignment_15_1"

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
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x1800020000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0800020000000000L});

}
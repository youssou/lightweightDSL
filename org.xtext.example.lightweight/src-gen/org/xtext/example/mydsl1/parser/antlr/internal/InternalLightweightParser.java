package org.xtext.example.mydsl1.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl1.services.LightweightGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLightweightParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'App'", "':'", "'{'", "'Authenticators'", "'['", "','", "']'", "'Authentications'", "'Procedures'", "'}'", "'2FA'", "'name'", "'authenticators'", "'&'", "'correlation'", "'validation'", "'SFA'", "'authenticator'", "'possession'", "'value'", "'knowledge'", "'limitedAttempts'", "'autofillable'", "'biometrics'", "'Registration'", "'credentials'", "'provider'", "'type'", "'verification'", "'validity'", "'uniqueness'", "'bindings'", "'Recovery'", "'protocol'", "'Login'", "'persistedSession'", "'authentication'", "'Reset'", "'true'", "'false'", "'Identity provider'", "'Self provided'", "'Institutional'", "'Digital'", "'Physical'", "'Email-Based'", "'MS-based'", "'Local'", "'High Entropy Text-Based Password'", "'Pass phrase'", "'Knowledge-based Preferences'", "'Low Entropy Text-Based Password'", "'Pin Code'", "'Fingerprint Recognition'", "'Facial Recognition'", "'Hard Drive Token'", "'Physical device'", "'local validation'", "'Remote validation'"
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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

        public InternalLightweightParser(TokenStream input, LightweightGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "App";
       	}

       	@Override
       	protected LightweightGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleApp"
    // InternalLightweight.g:65:1: entryRuleApp returns [EObject current=null] : iv_ruleApp= ruleApp EOF ;
    public final EObject entryRuleApp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApp = null;


        try {
            // InternalLightweight.g:65:44: (iv_ruleApp= ruleApp EOF )
            // InternalLightweight.g:66:2: iv_ruleApp= ruleApp EOF
            {
             newCompositeNode(grammarAccess.getAppRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApp=ruleApp();

            state._fsp--;

             current =iv_ruleApp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApp"


    // $ANTLR start "ruleApp"
    // InternalLightweight.g:72:1: ruleApp returns [EObject current=null] : (otherlv_0= 'App' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'Authenticators' otherlv_4= ':' otherlv_5= '[' ( (lv_authenticators_6_0= ruleAuthenticator ) ) (otherlv_7= ',' ( (lv_authenticators_8_0= ruleAuthenticator ) ) )* otherlv_9= ']' otherlv_10= ',' otherlv_11= 'Authentications' otherlv_12= ':' otherlv_13= '[' ( (lv_authMethods_14_0= ruleAuthMethod ) ) (otherlv_15= ',' ( (lv_authMethods_16_0= ruleAuthMethod ) ) )* otherlv_17= ']' otherlv_18= ',' otherlv_19= 'Procedures' otherlv_20= ':' otherlv_21= '[' ( (lv_phases_22_0= rulePhase ) ) (otherlv_23= ',' ( (lv_phases_24_0= rulePhase ) ) )* otherlv_25= ']' otherlv_26= '}' ) ;
    public final EObject ruleApp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        EObject lv_authenticators_6_0 = null;

        EObject lv_authenticators_8_0 = null;

        EObject lv_authMethods_14_0 = null;

        EObject lv_authMethods_16_0 = null;

        EObject lv_phases_22_0 = null;

        EObject lv_phases_24_0 = null;



        	enterRule();

        try {
            // InternalLightweight.g:78:2: ( (otherlv_0= 'App' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'Authenticators' otherlv_4= ':' otherlv_5= '[' ( (lv_authenticators_6_0= ruleAuthenticator ) ) (otherlv_7= ',' ( (lv_authenticators_8_0= ruleAuthenticator ) ) )* otherlv_9= ']' otherlv_10= ',' otherlv_11= 'Authentications' otherlv_12= ':' otherlv_13= '[' ( (lv_authMethods_14_0= ruleAuthMethod ) ) (otherlv_15= ',' ( (lv_authMethods_16_0= ruleAuthMethod ) ) )* otherlv_17= ']' otherlv_18= ',' otherlv_19= 'Procedures' otherlv_20= ':' otherlv_21= '[' ( (lv_phases_22_0= rulePhase ) ) (otherlv_23= ',' ( (lv_phases_24_0= rulePhase ) ) )* otherlv_25= ']' otherlv_26= '}' ) )
            // InternalLightweight.g:79:2: (otherlv_0= 'App' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'Authenticators' otherlv_4= ':' otherlv_5= '[' ( (lv_authenticators_6_0= ruleAuthenticator ) ) (otherlv_7= ',' ( (lv_authenticators_8_0= ruleAuthenticator ) ) )* otherlv_9= ']' otherlv_10= ',' otherlv_11= 'Authentications' otherlv_12= ':' otherlv_13= '[' ( (lv_authMethods_14_0= ruleAuthMethod ) ) (otherlv_15= ',' ( (lv_authMethods_16_0= ruleAuthMethod ) ) )* otherlv_17= ']' otherlv_18= ',' otherlv_19= 'Procedures' otherlv_20= ':' otherlv_21= '[' ( (lv_phases_22_0= rulePhase ) ) (otherlv_23= ',' ( (lv_phases_24_0= rulePhase ) ) )* otherlv_25= ']' otherlv_26= '}' )
            {
            // InternalLightweight.g:79:2: (otherlv_0= 'App' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'Authenticators' otherlv_4= ':' otherlv_5= '[' ( (lv_authenticators_6_0= ruleAuthenticator ) ) (otherlv_7= ',' ( (lv_authenticators_8_0= ruleAuthenticator ) ) )* otherlv_9= ']' otherlv_10= ',' otherlv_11= 'Authentications' otherlv_12= ':' otherlv_13= '[' ( (lv_authMethods_14_0= ruleAuthMethod ) ) (otherlv_15= ',' ( (lv_authMethods_16_0= ruleAuthMethod ) ) )* otherlv_17= ']' otherlv_18= ',' otherlv_19= 'Procedures' otherlv_20= ':' otherlv_21= '[' ( (lv_phases_22_0= rulePhase ) ) (otherlv_23= ',' ( (lv_phases_24_0= rulePhase ) ) )* otherlv_25= ']' otherlv_26= '}' )
            // InternalLightweight.g:80:3: otherlv_0= 'App' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'Authenticators' otherlv_4= ':' otherlv_5= '[' ( (lv_authenticators_6_0= ruleAuthenticator ) ) (otherlv_7= ',' ( (lv_authenticators_8_0= ruleAuthenticator ) ) )* otherlv_9= ']' otherlv_10= ',' otherlv_11= 'Authentications' otherlv_12= ':' otherlv_13= '[' ( (lv_authMethods_14_0= ruleAuthMethod ) ) (otherlv_15= ',' ( (lv_authMethods_16_0= ruleAuthMethod ) ) )* otherlv_17= ']' otherlv_18= ',' otherlv_19= 'Procedures' otherlv_20= ':' otherlv_21= '[' ( (lv_phases_22_0= rulePhase ) ) (otherlv_23= ',' ( (lv_phases_24_0= rulePhase ) ) )* otherlv_25= ']' otherlv_26= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAppAccess().getAppKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getAppAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getAppAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAppAccess().getAuthenticatorsKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getAppAccess().getColonKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_5, grammarAccess.getAppAccess().getLeftSquareBracketKeyword_5());
            		
            // InternalLightweight.g:104:3: ( (lv_authenticators_6_0= ruleAuthenticator ) )
            // InternalLightweight.g:105:4: (lv_authenticators_6_0= ruleAuthenticator )
            {
            // InternalLightweight.g:105:4: (lv_authenticators_6_0= ruleAuthenticator )
            // InternalLightweight.g:106:5: lv_authenticators_6_0= ruleAuthenticator
            {

            					newCompositeNode(grammarAccess.getAppAccess().getAuthenticatorsAuthenticatorParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_8);
            lv_authenticators_6_0=ruleAuthenticator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					add(
            						current,
            						"authenticators",
            						lv_authenticators_6_0,
            						"org.xtext.example.mydsl1.Lightweight.Authenticator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLightweight.g:123:3: (otherlv_7= ',' ( (lv_authenticators_8_0= ruleAuthenticator ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLightweight.g:124:4: otherlv_7= ',' ( (lv_authenticators_8_0= ruleAuthenticator ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_7); 

            	    				newLeafNode(otherlv_7, grammarAccess.getAppAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalLightweight.g:128:4: ( (lv_authenticators_8_0= ruleAuthenticator ) )
            	    // InternalLightweight.g:129:5: (lv_authenticators_8_0= ruleAuthenticator )
            	    {
            	    // InternalLightweight.g:129:5: (lv_authenticators_8_0= ruleAuthenticator )
            	    // InternalLightweight.g:130:6: lv_authenticators_8_0= ruleAuthenticator
            	    {

            	    						newCompositeNode(grammarAccess.getAppAccess().getAuthenticatorsAuthenticatorParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_authenticators_8_0=ruleAuthenticator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAppRule());
            	    						}
            	    						add(
            	    							current,
            	    							"authenticators",
            	    							lv_authenticators_8_0,
            	    							"org.xtext.example.mydsl1.Lightweight.Authenticator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getAppAccess().getRightSquareBracketKeyword_8());
            		
            otherlv_10=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_10, grammarAccess.getAppAccess().getCommaKeyword_9());
            		
            otherlv_11=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getAppAccess().getAuthenticationsKeyword_10());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_12, grammarAccess.getAppAccess().getColonKeyword_11());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_13, grammarAccess.getAppAccess().getLeftSquareBracketKeyword_12());
            		
            // InternalLightweight.g:168:3: ( (lv_authMethods_14_0= ruleAuthMethod ) )
            // InternalLightweight.g:169:4: (lv_authMethods_14_0= ruleAuthMethod )
            {
            // InternalLightweight.g:169:4: (lv_authMethods_14_0= ruleAuthMethod )
            // InternalLightweight.g:170:5: lv_authMethods_14_0= ruleAuthMethod
            {

            					newCompositeNode(grammarAccess.getAppAccess().getAuthMethodsAuthMethodParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_8);
            lv_authMethods_14_0=ruleAuthMethod();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					add(
            						current,
            						"authMethods",
            						lv_authMethods_14_0,
            						"org.xtext.example.mydsl1.Lightweight.AuthMethod");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLightweight.g:187:3: (otherlv_15= ',' ( (lv_authMethods_16_0= ruleAuthMethod ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLightweight.g:188:4: otherlv_15= ',' ( (lv_authMethods_16_0= ruleAuthMethod ) )
            	    {
            	    otherlv_15=(Token)match(input,16,FOLLOW_11); 

            	    				newLeafNode(otherlv_15, grammarAccess.getAppAccess().getCommaKeyword_14_0());
            	    			
            	    // InternalLightweight.g:192:4: ( (lv_authMethods_16_0= ruleAuthMethod ) )
            	    // InternalLightweight.g:193:5: (lv_authMethods_16_0= ruleAuthMethod )
            	    {
            	    // InternalLightweight.g:193:5: (lv_authMethods_16_0= ruleAuthMethod )
            	    // InternalLightweight.g:194:6: lv_authMethods_16_0= ruleAuthMethod
            	    {

            	    						newCompositeNode(grammarAccess.getAppAccess().getAuthMethodsAuthMethodParserRuleCall_14_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_authMethods_16_0=ruleAuthMethod();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAppRule());
            	    						}
            	    						add(
            	    							current,
            	    							"authMethods",
            	    							lv_authMethods_16_0,
            	    							"org.xtext.example.mydsl1.Lightweight.AuthMethod");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_17=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_17, grammarAccess.getAppAccess().getRightSquareBracketKeyword_15());
            		
            otherlv_18=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_18, grammarAccess.getAppAccess().getCommaKeyword_16());
            		
            otherlv_19=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_19, grammarAccess.getAppAccess().getProceduresKeyword_17());
            		
            otherlv_20=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_20, grammarAccess.getAppAccess().getColonKeyword_18());
            		
            otherlv_21=(Token)match(input,15,FOLLOW_13); 

            			newLeafNode(otherlv_21, grammarAccess.getAppAccess().getLeftSquareBracketKeyword_19());
            		
            // InternalLightweight.g:232:3: ( (lv_phases_22_0= rulePhase ) )
            // InternalLightweight.g:233:4: (lv_phases_22_0= rulePhase )
            {
            // InternalLightweight.g:233:4: (lv_phases_22_0= rulePhase )
            // InternalLightweight.g:234:5: lv_phases_22_0= rulePhase
            {

            					newCompositeNode(grammarAccess.getAppAccess().getPhasesPhaseParserRuleCall_20_0());
            				
            pushFollow(FOLLOW_8);
            lv_phases_22_0=rulePhase();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppRule());
            					}
            					add(
            						current,
            						"phases",
            						lv_phases_22_0,
            						"org.xtext.example.mydsl1.Lightweight.Phase");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLightweight.g:251:3: (otherlv_23= ',' ( (lv_phases_24_0= rulePhase ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLightweight.g:252:4: otherlv_23= ',' ( (lv_phases_24_0= rulePhase ) )
            	    {
            	    otherlv_23=(Token)match(input,16,FOLLOW_13); 

            	    				newLeafNode(otherlv_23, grammarAccess.getAppAccess().getCommaKeyword_21_0());
            	    			
            	    // InternalLightweight.g:256:4: ( (lv_phases_24_0= rulePhase ) )
            	    // InternalLightweight.g:257:5: (lv_phases_24_0= rulePhase )
            	    {
            	    // InternalLightweight.g:257:5: (lv_phases_24_0= rulePhase )
            	    // InternalLightweight.g:258:6: lv_phases_24_0= rulePhase
            	    {

            	    						newCompositeNode(grammarAccess.getAppAccess().getPhasesPhaseParserRuleCall_21_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_phases_24_0=rulePhase();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAppRule());
            	    						}
            	    						add(
            	    							current,
            	    							"phases",
            	    							lv_phases_24_0,
            	    							"org.xtext.example.mydsl1.Lightweight.Phase");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_25=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_25, grammarAccess.getAppAccess().getRightSquareBracketKeyword_22());
            		
            otherlv_26=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getAppAccess().getRightCurlyBracketKeyword_23());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApp"


    // $ANTLR start "entryRuleAuthMethod"
    // InternalLightweight.g:288:1: entryRuleAuthMethod returns [EObject current=null] : iv_ruleAuthMethod= ruleAuthMethod EOF ;
    public final EObject entryRuleAuthMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthMethod = null;


        try {
            // InternalLightweight.g:288:51: (iv_ruleAuthMethod= ruleAuthMethod EOF )
            // InternalLightweight.g:289:2: iv_ruleAuthMethod= ruleAuthMethod EOF
            {
             newCompositeNode(grammarAccess.getAuthMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAuthMethod=ruleAuthMethod();

            state._fsp--;

             current =iv_ruleAuthMethod; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAuthMethod"


    // $ANTLR start "ruleAuthMethod"
    // InternalLightweight.g:295:1: ruleAuthMethod returns [EObject current=null] : (this_MFA_0= ruleMFA | this_SFA_1= ruleSFA ) ;
    public final EObject ruleAuthMethod() throws RecognitionException {
        EObject current = null;

        EObject this_MFA_0 = null;

        EObject this_SFA_1 = null;



        	enterRule();

        try {
            // InternalLightweight.g:301:2: ( (this_MFA_0= ruleMFA | this_SFA_1= ruleSFA ) )
            // InternalLightweight.g:302:2: (this_MFA_0= ruleMFA | this_SFA_1= ruleSFA )
            {
            // InternalLightweight.g:302:2: (this_MFA_0= ruleMFA | this_SFA_1= ruleSFA )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLightweight.g:303:3: this_MFA_0= ruleMFA
                    {

                    			newCompositeNode(grammarAccess.getAuthMethodAccess().getMFAParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MFA_0=ruleMFA();

                    state._fsp--;


                    			current = this_MFA_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLightweight.g:312:3: this_SFA_1= ruleSFA
                    {

                    			newCompositeNode(grammarAccess.getAuthMethodAccess().getSFAParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SFA_1=ruleSFA();

                    state._fsp--;


                    			current = this_SFA_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAuthMethod"


    // $ANTLR start "entryRuleMFA"
    // InternalLightweight.g:324:1: entryRuleMFA returns [EObject current=null] : iv_ruleMFA= ruleMFA EOF ;
    public final EObject entryRuleMFA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMFA = null;


        try {
            // InternalLightweight.g:324:44: (iv_ruleMFA= ruleMFA EOF )
            // InternalLightweight.g:325:2: iv_ruleMFA= ruleMFA EOF
            {
             newCompositeNode(grammarAccess.getMFARule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMFA=ruleMFA();

            state._fsp--;

             current =iv_ruleMFA; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMFA"


    // $ANTLR start "ruleMFA"
    // InternalLightweight.g:331:1: ruleMFA returns [EObject current=null] : (otherlv_0= '2FA' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'authenticators' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '&' ( (otherlv_11= RULE_ID ) )+ (otherlv_12= ',' )? otherlv_13= 'correlation' otherlv_14= ':' ( (lv_correlation_15_0= ruleEBoolean ) ) otherlv_16= ',' otherlv_17= 'validation' otherlv_18= ':' ( (lv_validation_19_0= ruleValidationType ) ) otherlv_20= '}' ) ;
    public final EObject ruleMFA() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_correlation_15_0 = null;

        Enumerator lv_validation_19_0 = null;



        	enterRule();

        try {
            // InternalLightweight.g:337:2: ( (otherlv_0= '2FA' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'authenticators' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '&' ( (otherlv_11= RULE_ID ) )+ (otherlv_12= ',' )? otherlv_13= 'correlation' otherlv_14= ':' ( (lv_correlation_15_0= ruleEBoolean ) ) otherlv_16= ',' otherlv_17= 'validation' otherlv_18= ':' ( (lv_validation_19_0= ruleValidationType ) ) otherlv_20= '}' ) )
            // InternalLightweight.g:338:2: (otherlv_0= '2FA' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'authenticators' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '&' ( (otherlv_11= RULE_ID ) )+ (otherlv_12= ',' )? otherlv_13= 'correlation' otherlv_14= ':' ( (lv_correlation_15_0= ruleEBoolean ) ) otherlv_16= ',' otherlv_17= 'validation' otherlv_18= ':' ( (lv_validation_19_0= ruleValidationType ) ) otherlv_20= '}' )
            {
            // InternalLightweight.g:338:2: (otherlv_0= '2FA' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'authenticators' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '&' ( (otherlv_11= RULE_ID ) )+ (otherlv_12= ',' )? otherlv_13= 'correlation' otherlv_14= ':' ( (lv_correlation_15_0= ruleEBoolean ) ) otherlv_16= ',' otherlv_17= 'validation' otherlv_18= ':' ( (lv_validation_19_0= ruleValidationType ) ) otherlv_20= '}' )
            // InternalLightweight.g:339:3: otherlv_0= '2FA' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'authenticators' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '&' ( (otherlv_11= RULE_ID ) )+ (otherlv_12= ',' )? otherlv_13= 'correlation' otherlv_14= ':' ( (lv_correlation_15_0= ruleEBoolean ) ) otherlv_16= ',' otherlv_17= 'validation' otherlv_18= ':' ( (lv_validation_19_0= ruleValidationType ) ) otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMFAAccess().getFAKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMFAAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getMFAAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMFAAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getMFAAccess().getColonKeyword_4());
            		
            // InternalLightweight.g:359:3: ( (lv_name_5_0= ruleEString ) )
            // InternalLightweight.g:360:4: (lv_name_5_0= ruleEString )
            {
            // InternalLightweight.g:360:4: (lv_name_5_0= ruleEString )
            // InternalLightweight.g:361:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMFAAccess().getNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMFARule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.xtext.example.mydsl1.Lightweight.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_17); 

            			newLeafNode(otherlv_6, grammarAccess.getMFAAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getMFAAccess().getAuthenticatorsKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getMFAAccess().getColonKeyword_8());
            		
            // InternalLightweight.g:390:3: ( (otherlv_9= RULE_ID ) )
            // InternalLightweight.g:391:4: (otherlv_9= RULE_ID )
            {
            // InternalLightweight.g:391:4: (otherlv_9= RULE_ID )
            // InternalLightweight.g:392:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMFARule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_9, grammarAccess.getMFAAccess().getAuthenticatorsAuthenticatorCrossReference_9_0());
            				

            }


            }

            otherlv_10=(Token)match(input,24,FOLLOW_18); 

            			newLeafNode(otherlv_10, grammarAccess.getMFAAccess().getAmpersandKeyword_10());
            		
            // InternalLightweight.g:407:3: ( (otherlv_11= RULE_ID ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalLightweight.g:408:4: (otherlv_11= RULE_ID )
            	    {
            	    // InternalLightweight.g:408:4: (otherlv_11= RULE_ID )
            	    // InternalLightweight.g:409:5: otherlv_11= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getMFARule());
            	    					}
            	    				
            	    otherlv_11=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    					newLeafNode(otherlv_11, grammarAccess.getMFAAccess().getAuthenticatorsAuthenticatorCrossReference_11_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            // InternalLightweight.g:420:3: (otherlv_12= ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalLightweight.g:421:4: otherlv_12= ','
                    {
                    otherlv_12=(Token)match(input,16,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getMFAAccess().getCommaKeyword_12());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_13, grammarAccess.getMFAAccess().getCorrelationKeyword_13());
            		
            otherlv_14=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_14, grammarAccess.getMFAAccess().getColonKeyword_14());
            		
            // InternalLightweight.g:434:3: ( (lv_correlation_15_0= ruleEBoolean ) )
            // InternalLightweight.g:435:4: (lv_correlation_15_0= ruleEBoolean )
            {
            // InternalLightweight.g:435:4: (lv_correlation_15_0= ruleEBoolean )
            // InternalLightweight.g:436:5: lv_correlation_15_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getMFAAccess().getCorrelationEBooleanParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_9);
            lv_correlation_15_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMFARule());
            					}
            					set(
            						current,
            						"correlation",
            						true,
            						"org.xtext.example.mydsl1.Lightweight.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_16, grammarAccess.getMFAAccess().getCommaKeyword_16());
            		
            otherlv_17=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getMFAAccess().getValidationKeyword_17());
            		
            otherlv_18=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_18, grammarAccess.getMFAAccess().getColonKeyword_18());
            		
            // InternalLightweight.g:465:3: ( (lv_validation_19_0= ruleValidationType ) )
            // InternalLightweight.g:466:4: (lv_validation_19_0= ruleValidationType )
            {
            // InternalLightweight.g:466:4: (lv_validation_19_0= ruleValidationType )
            // InternalLightweight.g:467:5: lv_validation_19_0= ruleValidationType
            {

            					newCompositeNode(grammarAccess.getMFAAccess().getValidationValidationTypeEnumRuleCall_19_0());
            				
            pushFollow(FOLLOW_14);
            lv_validation_19_0=ruleValidationType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMFARule());
            					}
            					set(
            						current,
            						"validation",
            						lv_validation_19_0,
            						"org.xtext.example.mydsl1.Lightweight.ValidationType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_20=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getMFAAccess().getRightCurlyBracketKeyword_20());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMFA"


    // $ANTLR start "entryRuleSFA"
    // InternalLightweight.g:492:1: entryRuleSFA returns [EObject current=null] : iv_ruleSFA= ruleSFA EOF ;
    public final EObject entryRuleSFA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSFA = null;


        try {
            // InternalLightweight.g:492:44: (iv_ruleSFA= ruleSFA EOF )
            // InternalLightweight.g:493:2: iv_ruleSFA= ruleSFA EOF
            {
             newCompositeNode(grammarAccess.getSFARule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSFA=ruleSFA();

            state._fsp--;

             current =iv_ruleSFA; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSFA"


    // $ANTLR start "ruleSFA"
    // InternalLightweight.g:499:1: ruleSFA returns [EObject current=null] : (otherlv_0= 'SFA' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'authenticator' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' otherlv_11= '}' ) ;
    public final EObject ruleSFA() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;



        	enterRule();

        try {
            // InternalLightweight.g:505:2: ( (otherlv_0= 'SFA' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'authenticator' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' otherlv_11= '}' ) )
            // InternalLightweight.g:506:2: (otherlv_0= 'SFA' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'authenticator' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' otherlv_11= '}' )
            {
            // InternalLightweight.g:506:2: (otherlv_0= 'SFA' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'authenticator' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' otherlv_11= '}' )
            // InternalLightweight.g:507:3: otherlv_0= 'SFA' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'authenticator' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= ',' otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getSFAAccess().getSFAKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSFAAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSFAAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSFAAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getSFAAccess().getColonKeyword_4());
            		
            // InternalLightweight.g:527:3: ( (lv_name_5_0= ruleEString ) )
            // InternalLightweight.g:528:4: (lv_name_5_0= ruleEString )
            {
            // InternalLightweight.g:528:4: (lv_name_5_0= ruleEString )
            // InternalLightweight.g:529:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSFAAccess().getNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSFARule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.xtext.example.mydsl1.Lightweight.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getSFAAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getSFAAccess().getAuthenticatorKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_8, grammarAccess.getSFAAccess().getColonKeyword_8());
            		
            // InternalLightweight.g:558:3: ( (otherlv_9= RULE_ID ) )
            // InternalLightweight.g:559:4: (otherlv_9= RULE_ID )
            {
            // InternalLightweight.g:559:4: (otherlv_9= RULE_ID )
            // InternalLightweight.g:560:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSFARule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_9, grammarAccess.getSFAAccess().getAuthenticatorsAuthenticatorCrossReference_9_0());
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_14); 

            			newLeafNode(otherlv_10, grammarAccess.getSFAAccess().getCommaKeyword_10());
            		
            otherlv_11=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getSFAAccess().getRightCurlyBracketKeyword_11());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSFA"


    // $ANTLR start "entryRuleAuthenticator"
    // InternalLightweight.g:583:1: entryRuleAuthenticator returns [EObject current=null] : iv_ruleAuthenticator= ruleAuthenticator EOF ;
    public final EObject entryRuleAuthenticator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthenticator = null;


        try {
            // InternalLightweight.g:583:54: (iv_ruleAuthenticator= ruleAuthenticator EOF )
            // InternalLightweight.g:584:2: iv_ruleAuthenticator= ruleAuthenticator EOF
            {
             newCompositeNode(grammarAccess.getAuthenticatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAuthenticator=ruleAuthenticator();

            state._fsp--;

             current =iv_ruleAuthenticator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAuthenticator"


    // $ANTLR start "ruleAuthenticator"
    // InternalLightweight.g:590:1: ruleAuthenticator returns [EObject current=null] : (this_Possession_0= rulePossession | this_Biometrics_1= ruleBiometrics | this_Knowledge_2= ruleKnowledge ) ;
    public final EObject ruleAuthenticator() throws RecognitionException {
        EObject current = null;

        EObject this_Possession_0 = null;

        EObject this_Biometrics_1 = null;

        EObject this_Knowledge_2 = null;



        	enterRule();

        try {
            // InternalLightweight.g:596:2: ( (this_Possession_0= rulePossession | this_Biometrics_1= ruleBiometrics | this_Knowledge_2= ruleKnowledge ) )
            // InternalLightweight.g:597:2: (this_Possession_0= rulePossession | this_Biometrics_1= ruleBiometrics | this_Knowledge_2= ruleKnowledge )
            {
            // InternalLightweight.g:597:2: (this_Possession_0= rulePossession | this_Biometrics_1= ruleBiometrics | this_Knowledge_2= ruleKnowledge )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt7=1;
                }
                break;
            case 34:
                {
                alt7=2;
                }
                break;
            case 31:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalLightweight.g:598:3: this_Possession_0= rulePossession
                    {

                    			newCompositeNode(grammarAccess.getAuthenticatorAccess().getPossessionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Possession_0=rulePossession();

                    state._fsp--;


                    			current = this_Possession_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLightweight.g:607:3: this_Biometrics_1= ruleBiometrics
                    {

                    			newCompositeNode(grammarAccess.getAuthenticatorAccess().getBiometricsParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Biometrics_1=ruleBiometrics();

                    state._fsp--;


                    			current = this_Biometrics_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLightweight.g:616:3: this_Knowledge_2= ruleKnowledge
                    {

                    			newCompositeNode(grammarAccess.getAuthenticatorAccess().getKnowledgeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Knowledge_2=ruleKnowledge();

                    state._fsp--;


                    			current = this_Knowledge_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAuthenticator"


    // $ANTLR start "entryRulePossession"
    // InternalLightweight.g:628:1: entryRulePossession returns [EObject current=null] : iv_rulePossession= rulePossession EOF ;
    public final EObject entryRulePossession() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePossession = null;


        try {
            // InternalLightweight.g:628:51: (iv_rulePossession= rulePossession EOF )
            // InternalLightweight.g:629:2: iv_rulePossession= rulePossession EOF
            {
             newCompositeNode(grammarAccess.getPossessionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePossession=rulePossession();

            state._fsp--;

             current =iv_rulePossession; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePossession"


    // $ANTLR start "rulePossession"
    // InternalLightweight.g:635:1: rulePossession returns [EObject current=null] : (otherlv_0= 'possession' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'value' otherlv_8= ':' ( (lv_value_9_0= rulePVALUE ) ) otherlv_10= '}' ) ;
    public final EObject rulePossession() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        Enumerator lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalLightweight.g:641:2: ( (otherlv_0= 'possession' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'value' otherlv_8= ':' ( (lv_value_9_0= rulePVALUE ) ) otherlv_10= '}' ) )
            // InternalLightweight.g:642:2: (otherlv_0= 'possession' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'value' otherlv_8= ':' ( (lv_value_9_0= rulePVALUE ) ) otherlv_10= '}' )
            {
            // InternalLightweight.g:642:2: (otherlv_0= 'possession' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'value' otherlv_8= ':' ( (lv_value_9_0= rulePVALUE ) ) otherlv_10= '}' )
            // InternalLightweight.g:643:3: otherlv_0= 'possession' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'value' otherlv_8= ':' ( (lv_value_9_0= rulePVALUE ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPossessionAccess().getPossessionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getPossessionAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getPossessionAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getPossessionAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getPossessionAccess().getColonKeyword_4());
            		
            // InternalLightweight.g:663:3: ( (lv_name_5_0= ruleEString ) )
            // InternalLightweight.g:664:4: (lv_name_5_0= ruleEString )
            {
            // InternalLightweight.g:664:4: (lv_name_5_0= ruleEString )
            // InternalLightweight.g:665:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPossessionAccess().getNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPossessionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.xtext.example.mydsl1.Lightweight.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getPossessionAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getPossessionAccess().getValueKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_8, grammarAccess.getPossessionAccess().getColonKeyword_8());
            		
            // InternalLightweight.g:694:3: ( (lv_value_9_0= rulePVALUE ) )
            // InternalLightweight.g:695:4: (lv_value_9_0= rulePVALUE )
            {
            // InternalLightweight.g:695:4: (lv_value_9_0= rulePVALUE )
            // InternalLightweight.g:696:5: lv_value_9_0= rulePVALUE
            {

            					newCompositeNode(grammarAccess.getPossessionAccess().getValuePVALUEEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_14);
            lv_value_9_0=rulePVALUE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPossessionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_9_0,
            						"org.xtext.example.mydsl1.Lightweight.PVALUE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getPossessionAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePossession"


    // $ANTLR start "entryRuleKnowledge"
    // InternalLightweight.g:721:1: entryRuleKnowledge returns [EObject current=null] : iv_ruleKnowledge= ruleKnowledge EOF ;
    public final EObject entryRuleKnowledge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledge = null;


        try {
            // InternalLightweight.g:721:50: (iv_ruleKnowledge= ruleKnowledge EOF )
            // InternalLightweight.g:722:2: iv_ruleKnowledge= ruleKnowledge EOF
            {
             newCompositeNode(grammarAccess.getKnowledgeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKnowledge=ruleKnowledge();

            state._fsp--;

             current =iv_ruleKnowledge; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKnowledge"


    // $ANTLR start "ruleKnowledge"
    // InternalLightweight.g:728:1: ruleKnowledge returns [EObject current=null] : (otherlv_0= 'knowledge' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'value' otherlv_8= ':' ( (lv_value_9_0= ruleKVALUE ) ) otherlv_10= ',' otherlv_11= 'limitedAttempts' otherlv_12= ':' ( (lv_limitedAttempts_13_0= ruleEBoolean ) ) otherlv_14= ',' otherlv_15= 'autofillable' otherlv_16= ':' ( (lv_autofilled_17_0= ruleEBoolean ) ) otherlv_18= '}' ) ;
    public final EObject ruleKnowledge() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        Enumerator lv_value_9_0 = null;

        AntlrDatatypeRuleToken lv_limitedAttempts_13_0 = null;

        AntlrDatatypeRuleToken lv_autofilled_17_0 = null;



        	enterRule();

        try {
            // InternalLightweight.g:734:2: ( (otherlv_0= 'knowledge' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'value' otherlv_8= ':' ( (lv_value_9_0= ruleKVALUE ) ) otherlv_10= ',' otherlv_11= 'limitedAttempts' otherlv_12= ':' ( (lv_limitedAttempts_13_0= ruleEBoolean ) ) otherlv_14= ',' otherlv_15= 'autofillable' otherlv_16= ':' ( (lv_autofilled_17_0= ruleEBoolean ) ) otherlv_18= '}' ) )
            // InternalLightweight.g:735:2: (otherlv_0= 'knowledge' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'value' otherlv_8= ':' ( (lv_value_9_0= ruleKVALUE ) ) otherlv_10= ',' otherlv_11= 'limitedAttempts' otherlv_12= ':' ( (lv_limitedAttempts_13_0= ruleEBoolean ) ) otherlv_14= ',' otherlv_15= 'autofillable' otherlv_16= ':' ( (lv_autofilled_17_0= ruleEBoolean ) ) otherlv_18= '}' )
            {
            // InternalLightweight.g:735:2: (otherlv_0= 'knowledge' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'value' otherlv_8= ':' ( (lv_value_9_0= ruleKVALUE ) ) otherlv_10= ',' otherlv_11= 'limitedAttempts' otherlv_12= ':' ( (lv_limitedAttempts_13_0= ruleEBoolean ) ) otherlv_14= ',' otherlv_15= 'autofillable' otherlv_16= ':' ( (lv_autofilled_17_0= ruleEBoolean ) ) otherlv_18= '}' )
            // InternalLightweight.g:736:3: otherlv_0= 'knowledge' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'value' otherlv_8= ':' ( (lv_value_9_0= ruleKVALUE ) ) otherlv_10= ',' otherlv_11= 'limitedAttempts' otherlv_12= ':' ( (lv_limitedAttempts_13_0= ruleEBoolean ) ) otherlv_14= ',' otherlv_15= 'autofillable' otherlv_16= ':' ( (lv_autofilled_17_0= ruleEBoolean ) ) otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getKnowledgeAccess().getKnowledgeKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getKnowledgeAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getKnowledgeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getKnowledgeAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getKnowledgeAccess().getColonKeyword_4());
            		
            // InternalLightweight.g:756:3: ( (lv_name_5_0= ruleEString ) )
            // InternalLightweight.g:757:4: (lv_name_5_0= ruleEString )
            {
            // InternalLightweight.g:757:4: (lv_name_5_0= ruleEString )
            // InternalLightweight.g:758:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKnowledgeAccess().getNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKnowledgeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.xtext.example.mydsl1.Lightweight.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getKnowledgeAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getKnowledgeAccess().getValueKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_8, grammarAccess.getKnowledgeAccess().getColonKeyword_8());
            		
            // InternalLightweight.g:787:3: ( (lv_value_9_0= ruleKVALUE ) )
            // InternalLightweight.g:788:4: (lv_value_9_0= ruleKVALUE )
            {
            // InternalLightweight.g:788:4: (lv_value_9_0= ruleKVALUE )
            // InternalLightweight.g:789:5: lv_value_9_0= ruleKVALUE
            {

            					newCompositeNode(grammarAccess.getKnowledgeAccess().getValueKVALUEEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_9);
            lv_value_9_0=ruleKVALUE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKnowledgeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_9_0,
            						"org.xtext.example.mydsl1.Lightweight.KVALUE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_29); 

            			newLeafNode(otherlv_10, grammarAccess.getKnowledgeAccess().getCommaKeyword_10());
            		
            otherlv_11=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_11, grammarAccess.getKnowledgeAccess().getLimitedAttemptsKeyword_11());
            		
            otherlv_12=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_12, grammarAccess.getKnowledgeAccess().getColonKeyword_12());
            		
            // InternalLightweight.g:818:3: ( (lv_limitedAttempts_13_0= ruleEBoolean ) )
            // InternalLightweight.g:819:4: (lv_limitedAttempts_13_0= ruleEBoolean )
            {
            // InternalLightweight.g:819:4: (lv_limitedAttempts_13_0= ruleEBoolean )
            // InternalLightweight.g:820:5: lv_limitedAttempts_13_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getKnowledgeAccess().getLimitedAttemptsEBooleanParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_9);
            lv_limitedAttempts_13_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKnowledgeRule());
            					}
            					set(
            						current,
            						"limitedAttempts",
            						true,
            						"org.xtext.example.mydsl1.Lightweight.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,16,FOLLOW_30); 

            			newLeafNode(otherlv_14, grammarAccess.getKnowledgeAccess().getCommaKeyword_14());
            		
            otherlv_15=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_15, grammarAccess.getKnowledgeAccess().getAutofillableKeyword_15());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_16, grammarAccess.getKnowledgeAccess().getColonKeyword_16());
            		
            // InternalLightweight.g:849:3: ( (lv_autofilled_17_0= ruleEBoolean ) )
            // InternalLightweight.g:850:4: (lv_autofilled_17_0= ruleEBoolean )
            {
            // InternalLightweight.g:850:4: (lv_autofilled_17_0= ruleEBoolean )
            // InternalLightweight.g:851:5: lv_autofilled_17_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getKnowledgeAccess().getAutofilledEBooleanParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_14);
            lv_autofilled_17_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKnowledgeRule());
            					}
            					set(
            						current,
            						"autofilled",
            						true,
            						"org.xtext.example.mydsl1.Lightweight.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getKnowledgeAccess().getRightCurlyBracketKeyword_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKnowledge"


    // $ANTLR start "entryRuleBiometrics"
    // InternalLightweight.g:876:1: entryRuleBiometrics returns [EObject current=null] : iv_ruleBiometrics= ruleBiometrics EOF ;
    public final EObject entryRuleBiometrics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBiometrics = null;


        try {
            // InternalLightweight.g:876:51: (iv_ruleBiometrics= ruleBiometrics EOF )
            // InternalLightweight.g:877:2: iv_ruleBiometrics= ruleBiometrics EOF
            {
             newCompositeNode(grammarAccess.getBiometricsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBiometrics=ruleBiometrics();

            state._fsp--;

             current =iv_ruleBiometrics; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBiometrics"


    // $ANTLR start "ruleBiometrics"
    // InternalLightweight.g:883:1: ruleBiometrics returns [EObject current=null] : (otherlv_0= 'biometrics' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'value' otherlv_8= ':' ( (lv_value_9_0= ruleBVALUE ) ) otherlv_10= '}' ) ;
    public final EObject ruleBiometrics() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        Enumerator lv_value_9_0 = null;



        	enterRule();

        try {
            // InternalLightweight.g:889:2: ( (otherlv_0= 'biometrics' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'value' otherlv_8= ':' ( (lv_value_9_0= ruleBVALUE ) ) otherlv_10= '}' ) )
            // InternalLightweight.g:890:2: (otherlv_0= 'biometrics' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'value' otherlv_8= ':' ( (lv_value_9_0= ruleBVALUE ) ) otherlv_10= '}' )
            {
            // InternalLightweight.g:890:2: (otherlv_0= 'biometrics' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'value' otherlv_8= ':' ( (lv_value_9_0= ruleBVALUE ) ) otherlv_10= '}' )
            // InternalLightweight.g:891:3: otherlv_0= 'biometrics' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'value' otherlv_8= ':' ( (lv_value_9_0= ruleBVALUE ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBiometricsAccess().getBiometricsKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getBiometricsAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getBiometricsAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getBiometricsAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getBiometricsAccess().getColonKeyword_4());
            		
            // InternalLightweight.g:911:3: ( (lv_name_5_0= ruleEString ) )
            // InternalLightweight.g:912:4: (lv_name_5_0= ruleEString )
            {
            // InternalLightweight.g:912:4: (lv_name_5_0= ruleEString )
            // InternalLightweight.g:913:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBiometricsAccess().getNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBiometricsRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.xtext.example.mydsl1.Lightweight.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_26); 

            			newLeafNode(otherlv_6, grammarAccess.getBiometricsAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getBiometricsAccess().getValueKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_8, grammarAccess.getBiometricsAccess().getColonKeyword_8());
            		
            // InternalLightweight.g:942:3: ( (lv_value_9_0= ruleBVALUE ) )
            // InternalLightweight.g:943:4: (lv_value_9_0= ruleBVALUE )
            {
            // InternalLightweight.g:943:4: (lv_value_9_0= ruleBVALUE )
            // InternalLightweight.g:944:5: lv_value_9_0= ruleBVALUE
            {

            					newCompositeNode(grammarAccess.getBiometricsAccess().getValueBVALUEEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_14);
            lv_value_9_0=ruleBVALUE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBiometricsRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_9_0,
            						"org.xtext.example.mydsl1.Lightweight.BVALUE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getBiometricsAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBiometrics"


    // $ANTLR start "entryRulePhase"
    // InternalLightweight.g:969:1: entryRulePhase returns [EObject current=null] : iv_rulePhase= rulePhase EOF ;
    public final EObject entryRulePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhase = null;


        try {
            // InternalLightweight.g:969:46: (iv_rulePhase= rulePhase EOF )
            // InternalLightweight.g:970:2: iv_rulePhase= rulePhase EOF
            {
             newCompositeNode(grammarAccess.getPhaseRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePhase=rulePhase();

            state._fsp--;

             current =iv_rulePhase; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhase"


    // $ANTLR start "rulePhase"
    // InternalLightweight.g:976:1: rulePhase returns [EObject current=null] : (this_Registration_0= ruleRegistration | this_Recovery_1= ruleRecovery | this_Login_2= ruleLogin | this_Reset_3= ruleReset ) ;
    public final EObject rulePhase() throws RecognitionException {
        EObject current = null;

        EObject this_Registration_0 = null;

        EObject this_Recovery_1 = null;

        EObject this_Login_2 = null;

        EObject this_Reset_3 = null;



        	enterRule();

        try {
            // InternalLightweight.g:982:2: ( (this_Registration_0= ruleRegistration | this_Recovery_1= ruleRecovery | this_Login_2= ruleLogin | this_Reset_3= ruleReset ) )
            // InternalLightweight.g:983:2: (this_Registration_0= ruleRegistration | this_Recovery_1= ruleRecovery | this_Login_2= ruleLogin | this_Reset_3= ruleReset )
            {
            // InternalLightweight.g:983:2: (this_Registration_0= ruleRegistration | this_Recovery_1= ruleRecovery | this_Login_2= ruleLogin | this_Reset_3= ruleReset )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt8=1;
                }
                break;
            case 43:
                {
                alt8=2;
                }
                break;
            case 45:
                {
                alt8=3;
                }
                break;
            case 48:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalLightweight.g:984:3: this_Registration_0= ruleRegistration
                    {

                    			newCompositeNode(grammarAccess.getPhaseAccess().getRegistrationParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Registration_0=ruleRegistration();

                    state._fsp--;


                    			current = this_Registration_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalLightweight.g:993:3: this_Recovery_1= ruleRecovery
                    {

                    			newCompositeNode(grammarAccess.getPhaseAccess().getRecoveryParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Recovery_1=ruleRecovery();

                    state._fsp--;


                    			current = this_Recovery_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalLightweight.g:1002:3: this_Login_2= ruleLogin
                    {

                    			newCompositeNode(grammarAccess.getPhaseAccess().getLoginParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Login_2=ruleLogin();

                    state._fsp--;


                    			current = this_Login_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalLightweight.g:1011:3: this_Reset_3= ruleReset
                    {

                    			newCompositeNode(grammarAccess.getPhaseAccess().getResetParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Reset_3=ruleReset();

                    state._fsp--;


                    			current = this_Reset_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePhase"


    // $ANTLR start "entryRuleEString"
    // InternalLightweight.g:1023:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalLightweight.g:1023:47: (iv_ruleEString= ruleEString EOF )
            // InternalLightweight.g:1024:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalLightweight.g:1030:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalLightweight.g:1036:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalLightweight.g:1037:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalLightweight.g:1037:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalLightweight.g:1038:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLightweight.g:1046:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleRegistration"
    // InternalLightweight.g:1057:1: entryRuleRegistration returns [EObject current=null] : iv_ruleRegistration= ruleRegistration EOF ;
    public final EObject entryRuleRegistration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegistration = null;


        try {
            // InternalLightweight.g:1057:53: (iv_ruleRegistration= ruleRegistration EOF )
            // InternalLightweight.g:1058:2: iv_ruleRegistration= ruleRegistration EOF
            {
             newCompositeNode(grammarAccess.getRegistrationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRegistration=ruleRegistration();

            state._fsp--;

             current =iv_ruleRegistration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegistration"


    // $ANTLR start "ruleRegistration"
    // InternalLightweight.g:1064:1: ruleRegistration returns [EObject current=null] : (otherlv_0= 'Registration' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'credentials' otherlv_8= ':' otherlv_9= '[' ( (lv_credentials_10_0= ruleCredential ) ) (otherlv_11= ',' ( (lv_credentials_12_0= ruleCredential ) ) )* otherlv_13= ']' otherlv_14= '}' ) ;
    public final EObject ruleRegistration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_credentials_10_0 = null;

        EObject lv_credentials_12_0 = null;



        	enterRule();

        try {
            // InternalLightweight.g:1070:2: ( (otherlv_0= 'Registration' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'credentials' otherlv_8= ':' otherlv_9= '[' ( (lv_credentials_10_0= ruleCredential ) ) (otherlv_11= ',' ( (lv_credentials_12_0= ruleCredential ) ) )* otherlv_13= ']' otherlv_14= '}' ) )
            // InternalLightweight.g:1071:2: (otherlv_0= 'Registration' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'credentials' otherlv_8= ':' otherlv_9= '[' ( (lv_credentials_10_0= ruleCredential ) ) (otherlv_11= ',' ( (lv_credentials_12_0= ruleCredential ) ) )* otherlv_13= ']' otherlv_14= '}' )
            {
            // InternalLightweight.g:1071:2: (otherlv_0= 'Registration' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'credentials' otherlv_8= ':' otherlv_9= '[' ( (lv_credentials_10_0= ruleCredential ) ) (otherlv_11= ',' ( (lv_credentials_12_0= ruleCredential ) ) )* otherlv_13= ']' otherlv_14= '}' )
            // InternalLightweight.g:1072:3: otherlv_0= 'Registration' otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'credentials' otherlv_8= ':' otherlv_9= '[' ( (lv_credentials_10_0= ruleCredential ) ) (otherlv_11= ',' ( (lv_credentials_12_0= ruleCredential ) ) )* otherlv_13= ']' otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRegistrationAccess().getRegistrationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRegistrationAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getRegistrationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getRegistrationAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getRegistrationAccess().getColonKeyword_4());
            		
            // InternalLightweight.g:1092:3: ( (lv_name_5_0= ruleEString ) )
            // InternalLightweight.g:1093:4: (lv_name_5_0= ruleEString )
            {
            // InternalLightweight.g:1093:4: (lv_name_5_0= ruleEString )
            // InternalLightweight.g:1094:5: lv_name_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRegistrationAccess().getNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegistrationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_5_0,
            						"org.xtext.example.mydsl1.Lightweight.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_32); 

            			newLeafNode(otherlv_6, grammarAccess.getRegistrationAccess().getCommaKeyword_6());
            		
            otherlv_7=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getRegistrationAccess().getCredentialsKeyword_7());
            		
            otherlv_8=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getRegistrationAccess().getColonKeyword_8());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getRegistrationAccess().getLeftSquareBracketKeyword_9());
            		
            // InternalLightweight.g:1127:3: ( (lv_credentials_10_0= ruleCredential ) )
            // InternalLightweight.g:1128:4: (lv_credentials_10_0= ruleCredential )
            {
            // InternalLightweight.g:1128:4: (lv_credentials_10_0= ruleCredential )
            // InternalLightweight.g:1129:5: lv_credentials_10_0= ruleCredential
            {

            					newCompositeNode(grammarAccess.getRegistrationAccess().getCredentialsCredentialParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_8);
            lv_credentials_10_0=ruleCredential();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegistrationRule());
            					}
            					add(
            						current,
            						"credentials",
            						lv_credentials_10_0,
            						"org.xtext.example.mydsl1.Lightweight.Credential");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLightweight.g:1146:3: (otherlv_11= ',' ( (lv_credentials_12_0= ruleCredential ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLightweight.g:1147:4: otherlv_11= ',' ( (lv_credentials_12_0= ruleCredential ) )
            	    {
            	    otherlv_11=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_11, grammarAccess.getRegistrationAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalLightweight.g:1151:4: ( (lv_credentials_12_0= ruleCredential ) )
            	    // InternalLightweight.g:1152:5: (lv_credentials_12_0= ruleCredential )
            	    {
            	    // InternalLightweight.g:1152:5: (lv_credentials_12_0= ruleCredential )
            	    // InternalLightweight.g:1153:6: lv_credentials_12_0= ruleCredential
            	    {

            	    						newCompositeNode(grammarAccess.getRegistrationAccess().getCredentialsCredentialParserRuleCall_11_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_credentials_12_0=ruleCredential();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRegistrationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"credentials",
            	    							lv_credentials_12_0,
            	    							"org.xtext.example.mydsl1.Lightweight.Credential");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_13=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_13, grammarAccess.getRegistrationAccess().getRightSquareBracketKeyword_12());
            		
            otherlv_14=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getRegistrationAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegistration"


    // $ANTLR start "entryRuleCredential"
    // InternalLightweight.g:1183:1: entryRuleCredential returns [EObject current=null] : iv_ruleCredential= ruleCredential EOF ;
    public final EObject entryRuleCredential() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCredential = null;


        try {
            // InternalLightweight.g:1183:51: (iv_ruleCredential= ruleCredential EOF )
            // InternalLightweight.g:1184:2: iv_ruleCredential= ruleCredential EOF
            {
             newCompositeNode(grammarAccess.getCredentialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCredential=ruleCredential();

            state._fsp--;

             current =iv_ruleCredential; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCredential"


    // $ANTLR start "ruleCredential"
    // InternalLightweight.g:1190:1: ruleCredential returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ',' otherlv_6= 'provider' otherlv_7= ':' ( (lv_provider_8_0= rulePROVIDER ) ) otherlv_9= ',' otherlv_10= 'type' otherlv_11= ':' ( (lv_type_12_0= ruleCredTYPE ) ) otherlv_13= ',' (otherlv_14= 'verification' otherlv_15= ':' ( (lv_verifmethod_16_0= ruleVerifMethod ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleCredential() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_4_0 = null;

        Enumerator lv_provider_8_0 = null;

        Enumerator lv_type_12_0 = null;

        EObject lv_verifmethod_16_0 = null;



        	enterRule();

        try {
            // InternalLightweight.g:1196:2: ( ( () otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ',' otherlv_6= 'provider' otherlv_7= ':' ( (lv_provider_8_0= rulePROVIDER ) ) otherlv_9= ',' otherlv_10= 'type' otherlv_11= ':' ( (lv_type_12_0= ruleCredTYPE ) ) otherlv_13= ',' (otherlv_14= 'verification' otherlv_15= ':' ( (lv_verifmethod_16_0= ruleVerifMethod ) ) )? otherlv_17= '}' ) )
            // InternalLightweight.g:1197:2: ( () otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ',' otherlv_6= 'provider' otherlv_7= ':' ( (lv_provider_8_0= rulePROVIDER ) ) otherlv_9= ',' otherlv_10= 'type' otherlv_11= ':' ( (lv_type_12_0= ruleCredTYPE ) ) otherlv_13= ',' (otherlv_14= 'verification' otherlv_15= ':' ( (lv_verifmethod_16_0= ruleVerifMethod ) ) )? otherlv_17= '}' )
            {
            // InternalLightweight.g:1197:2: ( () otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ',' otherlv_6= 'provider' otherlv_7= ':' ( (lv_provider_8_0= rulePROVIDER ) ) otherlv_9= ',' otherlv_10= 'type' otherlv_11= ':' ( (lv_type_12_0= ruleCredTYPE ) ) otherlv_13= ',' (otherlv_14= 'verification' otherlv_15= ':' ( (lv_verifmethod_16_0= ruleVerifMethod ) ) )? otherlv_17= '}' )
            // InternalLightweight.g:1198:3: () otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ',' otherlv_6= 'provider' otherlv_7= ':' ( (lv_provider_8_0= rulePROVIDER ) ) otherlv_9= ',' otherlv_10= 'type' otherlv_11= ':' ( (lv_type_12_0= ruleCredTYPE ) ) otherlv_13= ',' (otherlv_14= 'verification' otherlv_15= ':' ( (lv_verifmethod_16_0= ruleVerifMethod ) ) )? otherlv_17= '}'
            {
            // InternalLightweight.g:1198:3: ()
            // InternalLightweight.g:1199:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCredentialAccess().getCredentialAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getCredentialAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCredentialAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getCredentialAccess().getColonKeyword_3());
            		
            // InternalLightweight.g:1217:3: ( (lv_name_4_0= ruleEString ) )
            // InternalLightweight.g:1218:4: (lv_name_4_0= ruleEString )
            {
            // InternalLightweight.g:1218:4: (lv_name_4_0= ruleEString )
            // InternalLightweight.g:1219:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCredentialAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCredentialRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.xtext.example.mydsl1.Lightweight.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_33); 

            			newLeafNode(otherlv_5, grammarAccess.getCredentialAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getCredentialAccess().getProviderKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_7, grammarAccess.getCredentialAccess().getColonKeyword_7());
            		
            // InternalLightweight.g:1248:3: ( (lv_provider_8_0= rulePROVIDER ) )
            // InternalLightweight.g:1249:4: (lv_provider_8_0= rulePROVIDER )
            {
            // InternalLightweight.g:1249:4: (lv_provider_8_0= rulePROVIDER )
            // InternalLightweight.g:1250:5: lv_provider_8_0= rulePROVIDER
            {

            					newCompositeNode(grammarAccess.getCredentialAccess().getProviderPROVIDEREnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_provider_8_0=rulePROVIDER();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCredentialRule());
            					}
            					set(
            						current,
            						"provider",
            						lv_provider_8_0,
            						"org.xtext.example.mydsl1.Lightweight.PROVIDER");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_35); 

            			newLeafNode(otherlv_9, grammarAccess.getCredentialAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getCredentialAccess().getTypeKeyword_10());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_11, grammarAccess.getCredentialAccess().getColonKeyword_11());
            		
            // InternalLightweight.g:1279:3: ( (lv_type_12_0= ruleCredTYPE ) )
            // InternalLightweight.g:1280:4: (lv_type_12_0= ruleCredTYPE )
            {
            // InternalLightweight.g:1280:4: (lv_type_12_0= ruleCredTYPE )
            // InternalLightweight.g:1281:5: lv_type_12_0= ruleCredTYPE
            {

            					newCompositeNode(grammarAccess.getCredentialAccess().getTypeCredTYPEEnumRuleCall_12_0());
            				
            pushFollow(FOLLOW_9);
            lv_type_12_0=ruleCredTYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCredentialRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_12_0,
            						"org.xtext.example.mydsl1.Lightweight.CredTYPE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,16,FOLLOW_37); 

            			newLeafNode(otherlv_13, grammarAccess.getCredentialAccess().getCommaKeyword_13());
            		
            // InternalLightweight.g:1302:3: (otherlv_14= 'verification' otherlv_15= ':' ( (lv_verifmethod_16_0= ruleVerifMethod ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==39) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLightweight.g:1303:4: otherlv_14= 'verification' otherlv_15= ':' ( (lv_verifmethod_16_0= ruleVerifMethod ) )
                    {
                    otherlv_14=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getCredentialAccess().getVerificationKeyword_14_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getCredentialAccess().getColonKeyword_14_1());
                    			
                    // InternalLightweight.g:1311:4: ( (lv_verifmethod_16_0= ruleVerifMethod ) )
                    // InternalLightweight.g:1312:5: (lv_verifmethod_16_0= ruleVerifMethod )
                    {
                    // InternalLightweight.g:1312:5: (lv_verifmethod_16_0= ruleVerifMethod )
                    // InternalLightweight.g:1313:6: lv_verifmethod_16_0= ruleVerifMethod
                    {

                    						newCompositeNode(grammarAccess.getCredentialAccess().getVerifmethodVerifMethodParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_verifmethod_16_0=ruleVerifMethod();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCredentialRule());
                    						}
                    						set(
                    							current,
                    							"verifmethod",
                    							lv_verifmethod_16_0,
                    							"org.xtext.example.mydsl1.Lightweight.VerifMethod");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getCredentialAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCredential"


    // $ANTLR start "entryRuleVerifMethod"
    // InternalLightweight.g:1339:1: entryRuleVerifMethod returns [EObject current=null] : iv_ruleVerifMethod= ruleVerifMethod EOF ;
    public final EObject entryRuleVerifMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerifMethod = null;


        try {
            // InternalLightweight.g:1339:52: (iv_ruleVerifMethod= ruleVerifMethod EOF )
            // InternalLightweight.g:1340:2: iv_ruleVerifMethod= ruleVerifMethod EOF
            {
             newCompositeNode(grammarAccess.getVerifMethodRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVerifMethod=ruleVerifMethod();

            state._fsp--;

             current =iv_ruleVerifMethod; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerifMethod"


    // $ANTLR start "ruleVerifMethod"
    // InternalLightweight.g:1346:1: ruleVerifMethod returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= 'validity' otherlv_3= ':' ( (lv_validity_4_0= ruleEBoolean ) ) otherlv_5= ',' otherlv_6= 'uniqueness' otherlv_7= ':' ( (lv_uniqueness_8_0= ruleEBoolean ) ) otherlv_9= ',' otherlv_10= 'bindings' otherlv_11= ':' ( (lv_bindings_12_0= ruleEBoolean ) ) otherlv_13= '}' ) ;
    public final EObject ruleVerifMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_validity_4_0 = null;

        AntlrDatatypeRuleToken lv_uniqueness_8_0 = null;

        AntlrDatatypeRuleToken lv_bindings_12_0 = null;



        	enterRule();

        try {
            // InternalLightweight.g:1352:2: ( ( () otherlv_1= '{' otherlv_2= 'validity' otherlv_3= ':' ( (lv_validity_4_0= ruleEBoolean ) ) otherlv_5= ',' otherlv_6= 'uniqueness' otherlv_7= ':' ( (lv_uniqueness_8_0= ruleEBoolean ) ) otherlv_9= ',' otherlv_10= 'bindings' otherlv_11= ':' ( (lv_bindings_12_0= ruleEBoolean ) ) otherlv_13= '}' ) )
            // InternalLightweight.g:1353:2: ( () otherlv_1= '{' otherlv_2= 'validity' otherlv_3= ':' ( (lv_validity_4_0= ruleEBoolean ) ) otherlv_5= ',' otherlv_6= 'uniqueness' otherlv_7= ':' ( (lv_uniqueness_8_0= ruleEBoolean ) ) otherlv_9= ',' otherlv_10= 'bindings' otherlv_11= ':' ( (lv_bindings_12_0= ruleEBoolean ) ) otherlv_13= '}' )
            {
            // InternalLightweight.g:1353:2: ( () otherlv_1= '{' otherlv_2= 'validity' otherlv_3= ':' ( (lv_validity_4_0= ruleEBoolean ) ) otherlv_5= ',' otherlv_6= 'uniqueness' otherlv_7= ':' ( (lv_uniqueness_8_0= ruleEBoolean ) ) otherlv_9= ',' otherlv_10= 'bindings' otherlv_11= ':' ( (lv_bindings_12_0= ruleEBoolean ) ) otherlv_13= '}' )
            // InternalLightweight.g:1354:3: () otherlv_1= '{' otherlv_2= 'validity' otherlv_3= ':' ( (lv_validity_4_0= ruleEBoolean ) ) otherlv_5= ',' otherlv_6= 'uniqueness' otherlv_7= ':' ( (lv_uniqueness_8_0= ruleEBoolean ) ) otherlv_9= ',' otherlv_10= 'bindings' otherlv_11= ':' ( (lv_bindings_12_0= ruleEBoolean ) ) otherlv_13= '}'
            {
            // InternalLightweight.g:1354:3: ()
            // InternalLightweight.g:1355:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVerifMethodAccess().getVerifMethodAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getVerifMethodAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getVerifMethodAccess().getValidityKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getVerifMethodAccess().getColonKeyword_3());
            		
            // InternalLightweight.g:1373:3: ( (lv_validity_4_0= ruleEBoolean ) )
            // InternalLightweight.g:1374:4: (lv_validity_4_0= ruleEBoolean )
            {
            // InternalLightweight.g:1374:4: (lv_validity_4_0= ruleEBoolean )
            // InternalLightweight.g:1375:5: lv_validity_4_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getVerifMethodAccess().getValidityEBooleanParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_validity_4_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerifMethodRule());
            					}
            					set(
            						current,
            						"validity",
            						lv_validity_4_0,
            						"org.xtext.example.mydsl1.Lightweight.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_39); 

            			newLeafNode(otherlv_5, grammarAccess.getVerifMethodAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getVerifMethodAccess().getUniquenessKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getVerifMethodAccess().getColonKeyword_7());
            		
            // InternalLightweight.g:1404:3: ( (lv_uniqueness_8_0= ruleEBoolean ) )
            // InternalLightweight.g:1405:4: (lv_uniqueness_8_0= ruleEBoolean )
            {
            // InternalLightweight.g:1405:4: (lv_uniqueness_8_0= ruleEBoolean )
            // InternalLightweight.g:1406:5: lv_uniqueness_8_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getVerifMethodAccess().getUniquenessEBooleanParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_uniqueness_8_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerifMethodRule());
            					}
            					set(
            						current,
            						"uniqueness",
            						lv_uniqueness_8_0,
            						"org.xtext.example.mydsl1.Lightweight.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_40); 

            			newLeafNode(otherlv_9, grammarAccess.getVerifMethodAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getVerifMethodAccess().getBindingsKeyword_10());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_11, grammarAccess.getVerifMethodAccess().getColonKeyword_11());
            		
            // InternalLightweight.g:1435:3: ( (lv_bindings_12_0= ruleEBoolean ) )
            // InternalLightweight.g:1436:4: (lv_bindings_12_0= ruleEBoolean )
            {
            // InternalLightweight.g:1436:4: (lv_bindings_12_0= ruleEBoolean )
            // InternalLightweight.g:1437:5: lv_bindings_12_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getVerifMethodAccess().getBindingsEBooleanParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_14);
            lv_bindings_12_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVerifMethodRule());
            					}
            					set(
            						current,
            						"bindings",
            						lv_bindings_12_0,
            						"org.xtext.example.mydsl1.Lightweight.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getVerifMethodAccess().getRightCurlyBracketKeyword_13());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerifMethod"


    // $ANTLR start "entryRuleRecovery"
    // InternalLightweight.g:1462:1: entryRuleRecovery returns [EObject current=null] : iv_ruleRecovery= ruleRecovery EOF ;
    public final EObject entryRuleRecovery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecovery = null;


        try {
            // InternalLightweight.g:1462:49: (iv_ruleRecovery= ruleRecovery EOF )
            // InternalLightweight.g:1463:2: iv_ruleRecovery= ruleRecovery EOF
            {
             newCompositeNode(grammarAccess.getRecoveryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRecovery=ruleRecovery();

            state._fsp--;

             current =iv_ruleRecovery; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecovery"


    // $ANTLR start "ruleRecovery"
    // InternalLightweight.g:1469:1: ruleRecovery returns [EObject current=null] : ( () otherlv_1= 'Recovery' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' (otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'protocol' otherlv_13= ':' ( (lv_protocol_14_0= ruleProtocol ) ) )? otherlv_15= '}' ) ;
    public final EObject ruleRecovery() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        Enumerator lv_protocol_14_0 = null;



        	enterRule();

        try {
            // InternalLightweight.g:1475:2: ( ( () otherlv_1= 'Recovery' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' (otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'protocol' otherlv_13= ':' ( (lv_protocol_14_0= ruleProtocol ) ) )? otherlv_15= '}' ) )
            // InternalLightweight.g:1476:2: ( () otherlv_1= 'Recovery' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' (otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'protocol' otherlv_13= ':' ( (lv_protocol_14_0= ruleProtocol ) ) )? otherlv_15= '}' )
            {
            // InternalLightweight.g:1476:2: ( () otherlv_1= 'Recovery' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' (otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'protocol' otherlv_13= ':' ( (lv_protocol_14_0= ruleProtocol ) ) )? otherlv_15= '}' )
            // InternalLightweight.g:1477:3: () otherlv_1= 'Recovery' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' (otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? (otherlv_12= 'protocol' otherlv_13= ':' ( (lv_protocol_14_0= ruleProtocol ) ) )? otherlv_15= '}'
            {
            // InternalLightweight.g:1477:3: ()
            // InternalLightweight.g:1478:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRecoveryAccess().getRecoveryAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRecoveryAccess().getRecoveryKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRecoveryAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getRecoveryAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRecoveryAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getRecoveryAccess().getColonKeyword_5());
            		
            // InternalLightweight.g:1504:3: ( (lv_name_6_0= ruleEString ) )
            // InternalLightweight.g:1505:4: (lv_name_6_0= ruleEString )
            {
            // InternalLightweight.g:1505:4: (lv_name_6_0= ruleEString )
            // InternalLightweight.g:1506:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRecoveryAccess().getNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRecoveryRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.xtext.example.mydsl1.Lightweight.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_41); 

            			newLeafNode(otherlv_7, grammarAccess.getRecoveryAccess().getCommaKeyword_7());
            		
            // InternalLightweight.g:1527:3: (otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalLightweight.g:1528:4: otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_8=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getRecoveryAccess().getAuthenticatorKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_9, grammarAccess.getRecoveryAccess().getColonKeyword_8_1());
                    			
                    // InternalLightweight.g:1536:4: ( (otherlv_10= RULE_ID ) )
                    // InternalLightweight.g:1537:5: (otherlv_10= RULE_ID )
                    {
                    // InternalLightweight.g:1537:5: (otherlv_10= RULE_ID )
                    // InternalLightweight.g:1538:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecoveryRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_10, grammarAccess.getRecoveryAccess().getAuthenticatorAuthenticatorCrossReference_8_2_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,16,FOLLOW_42); 

                    				newLeafNode(otherlv_11, grammarAccess.getRecoveryAccess().getCommaKeyword_8_3());
                    			

                    }
                    break;

            }

            // InternalLightweight.g:1554:3: (otherlv_12= 'protocol' otherlv_13= ':' ( (lv_protocol_14_0= ruleProtocol ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==44) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLightweight.g:1555:4: otherlv_12= 'protocol' otherlv_13= ':' ( (lv_protocol_14_0= ruleProtocol ) )
                    {
                    otherlv_12=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getRecoveryAccess().getProtocolKeyword_9_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_43); 

                    				newLeafNode(otherlv_13, grammarAccess.getRecoveryAccess().getColonKeyword_9_1());
                    			
                    // InternalLightweight.g:1563:4: ( (lv_protocol_14_0= ruleProtocol ) )
                    // InternalLightweight.g:1564:5: (lv_protocol_14_0= ruleProtocol )
                    {
                    // InternalLightweight.g:1564:5: (lv_protocol_14_0= ruleProtocol )
                    // InternalLightweight.g:1565:6: lv_protocol_14_0= ruleProtocol
                    {

                    						newCompositeNode(grammarAccess.getRecoveryAccess().getProtocolProtocolEnumRuleCall_9_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_protocol_14_0=ruleProtocol();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecoveryRule());
                    						}
                    						set(
                    							current,
                    							"protocol",
                    							lv_protocol_14_0,
                    							"org.xtext.example.mydsl1.Lightweight.Protocol");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getRecoveryAccess().getRightCurlyBracketKeyword_10());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecovery"


    // $ANTLR start "entryRuleLogin"
    // InternalLightweight.g:1591:1: entryRuleLogin returns [EObject current=null] : iv_ruleLogin= ruleLogin EOF ;
    public final EObject entryRuleLogin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogin = null;


        try {
            // InternalLightweight.g:1591:46: (iv_ruleLogin= ruleLogin EOF )
            // InternalLightweight.g:1592:2: iv_ruleLogin= ruleLogin EOF
            {
             newCompositeNode(grammarAccess.getLoginRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogin=ruleLogin();

            state._fsp--;

             current =iv_ruleLogin; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogin"


    // $ANTLR start "ruleLogin"
    // InternalLightweight.g:1598:1: ruleLogin returns [EObject current=null] : ( () otherlv_1= 'Login' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'persistedSession' otherlv_9= ':' ( (lv_session_10_0= ruleEBoolean ) ) otherlv_11= ',' otherlv_12= 'authentication' otherlv_13= ':' otherlv_14= '[' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= ']' otherlv_19= '}' ) ;
    public final EObject ruleLogin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_session_10_0 = null;



        	enterRule();

        try {
            // InternalLightweight.g:1604:2: ( ( () otherlv_1= 'Login' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'persistedSession' otherlv_9= ':' ( (lv_session_10_0= ruleEBoolean ) ) otherlv_11= ',' otherlv_12= 'authentication' otherlv_13= ':' otherlv_14= '[' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= ']' otherlv_19= '}' ) )
            // InternalLightweight.g:1605:2: ( () otherlv_1= 'Login' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'persistedSession' otherlv_9= ':' ( (lv_session_10_0= ruleEBoolean ) ) otherlv_11= ',' otherlv_12= 'authentication' otherlv_13= ':' otherlv_14= '[' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= ']' otherlv_19= '}' )
            {
            // InternalLightweight.g:1605:2: ( () otherlv_1= 'Login' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'persistedSession' otherlv_9= ':' ( (lv_session_10_0= ruleEBoolean ) ) otherlv_11= ',' otherlv_12= 'authentication' otherlv_13= ':' otherlv_14= '[' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= ']' otherlv_19= '}' )
            // InternalLightweight.g:1606:3: () otherlv_1= 'Login' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'persistedSession' otherlv_9= ':' ( (lv_session_10_0= ruleEBoolean ) ) otherlv_11= ',' otherlv_12= 'authentication' otherlv_13= ':' otherlv_14= '[' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= ']' otherlv_19= '}'
            {
            // InternalLightweight.g:1606:3: ()
            // InternalLightweight.g:1607:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoginAccess().getLoginAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLoginAccess().getLoginKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getLoginAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getLoginAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getLoginAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getLoginAccess().getColonKeyword_5());
            		
            // InternalLightweight.g:1633:3: ( (lv_name_6_0= ruleEString ) )
            // InternalLightweight.g:1634:4: (lv_name_6_0= ruleEString )
            {
            // InternalLightweight.g:1634:4: (lv_name_6_0= ruleEString )
            // InternalLightweight.g:1635:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLoginAccess().getNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoginRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.xtext.example.mydsl1.Lightweight.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_44); 

            			newLeafNode(otherlv_7, grammarAccess.getLoginAccess().getCommaKeyword_7());
            		
            otherlv_8=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getLoginAccess().getPersistedSessionKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_9, grammarAccess.getLoginAccess().getColonKeyword_9());
            		
            // InternalLightweight.g:1664:3: ( (lv_session_10_0= ruleEBoolean ) )
            // InternalLightweight.g:1665:4: (lv_session_10_0= ruleEBoolean )
            {
            // InternalLightweight.g:1665:4: (lv_session_10_0= ruleEBoolean )
            // InternalLightweight.g:1666:5: lv_session_10_0= ruleEBoolean
            {

            					newCompositeNode(grammarAccess.getLoginAccess().getSessionEBooleanParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_9);
            lv_session_10_0=ruleEBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoginRule());
            					}
            					set(
            						current,
            						"session",
            						lv_session_10_0,
            						"org.xtext.example.mydsl1.Lightweight.EBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_45); 

            			newLeafNode(otherlv_11, grammarAccess.getLoginAccess().getCommaKeyword_11());
            		
            otherlv_12=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getLoginAccess().getAuthenticationKeyword_12());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_13, grammarAccess.getLoginAccess().getColonKeyword_13());
            		
            otherlv_14=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_14, grammarAccess.getLoginAccess().getLeftSquareBracketKeyword_14());
            		
            // InternalLightweight.g:1699:3: ( (otherlv_15= RULE_ID ) )
            // InternalLightweight.g:1700:4: (otherlv_15= RULE_ID )
            {
            // InternalLightweight.g:1700:4: (otherlv_15= RULE_ID )
            // InternalLightweight.g:1701:5: otherlv_15= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoginRule());
            					}
            				
            otherlv_15=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_15, grammarAccess.getLoginAccess().getAuthMethodsAuthMethodCrossReference_15_0());
            				

            }


            }

            // InternalLightweight.g:1712:3: (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalLightweight.g:1713:4: otherlv_16= ',' ( (otherlv_17= RULE_ID ) )
            	    {
            	    otherlv_16=(Token)match(input,16,FOLLOW_18); 

            	    				newLeafNode(otherlv_16, grammarAccess.getLoginAccess().getCommaKeyword_16_0());
            	    			
            	    // InternalLightweight.g:1717:4: ( (otherlv_17= RULE_ID ) )
            	    // InternalLightweight.g:1718:5: (otherlv_17= RULE_ID )
            	    {
            	    // InternalLightweight.g:1718:5: (otherlv_17= RULE_ID )
            	    // InternalLightweight.g:1719:6: otherlv_17= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLoginRule());
            	    						}
            	    					
            	    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    						newLeafNode(otherlv_17, grammarAccess.getLoginAccess().getAuthMethodsAuthMethodCrossReference_16_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_18=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_18, grammarAccess.getLoginAccess().getRightSquareBracketKeyword_17());
            		
            otherlv_19=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getLoginAccess().getRightCurlyBracketKeyword_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLogin"


    // $ANTLR start "entryRuleReset"
    // InternalLightweight.g:1743:1: entryRuleReset returns [EObject current=null] : iv_ruleReset= ruleReset EOF ;
    public final EObject entryRuleReset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReset = null;


        try {
            // InternalLightweight.g:1743:46: (iv_ruleReset= ruleReset EOF )
            // InternalLightweight.g:1744:2: iv_ruleReset= ruleReset EOF
            {
             newCompositeNode(grammarAccess.getResetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReset=ruleReset();

            state._fsp--;

             current =iv_ruleReset; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReset"


    // $ANTLR start "ruleReset"
    // InternalLightweight.g:1750:1: ruleReset returns [EObject current=null] : ( () otherlv_1= 'Reset' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' (otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'authentication' otherlv_13= ':' otherlv_14= '[' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= ']' otherlv_19= '}' ) ;
    public final EObject ruleReset() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;



        	enterRule();

        try {
            // InternalLightweight.g:1756:2: ( ( () otherlv_1= 'Reset' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' (otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'authentication' otherlv_13= ':' otherlv_14= '[' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= ']' otherlv_19= '}' ) )
            // InternalLightweight.g:1757:2: ( () otherlv_1= 'Reset' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' (otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'authentication' otherlv_13= ':' otherlv_14= '[' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= ']' otherlv_19= '}' )
            {
            // InternalLightweight.g:1757:2: ( () otherlv_1= 'Reset' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' (otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'authentication' otherlv_13= ':' otherlv_14= '[' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= ']' otherlv_19= '}' )
            // InternalLightweight.g:1758:3: () otherlv_1= 'Reset' otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' (otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )? otherlv_12= 'authentication' otherlv_13= ':' otherlv_14= '[' ( (otherlv_15= RULE_ID ) ) (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )* otherlv_18= ']' otherlv_19= '}'
            {
            // InternalLightweight.g:1758:3: ()
            // InternalLightweight.g:1759:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResetAccess().getResetAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getResetAccess().getResetKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getResetAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getResetAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getResetAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getResetAccess().getColonKeyword_5());
            		
            // InternalLightweight.g:1785:3: ( (lv_name_6_0= ruleEString ) )
            // InternalLightweight.g:1786:4: (lv_name_6_0= ruleEString )
            {
            // InternalLightweight.g:1786:4: (lv_name_6_0= ruleEString )
            // InternalLightweight.g:1787:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getResetAccess().getNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResetRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.xtext.example.mydsl1.Lightweight.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_46); 

            			newLeafNode(otherlv_7, grammarAccess.getResetAccess().getCommaKeyword_7());
            		
            // InternalLightweight.g:1808:3: (otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalLightweight.g:1809:4: otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ','
                    {
                    otherlv_8=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getResetAccess().getAuthenticatorKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_9, grammarAccess.getResetAccess().getColonKeyword_8_1());
                    			
                    // InternalLightweight.g:1817:4: ( (otherlv_10= RULE_ID ) )
                    // InternalLightweight.g:1818:5: (otherlv_10= RULE_ID )
                    {
                    // InternalLightweight.g:1818:5: (otherlv_10= RULE_ID )
                    // InternalLightweight.g:1819:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResetRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(otherlv_10, grammarAccess.getResetAccess().getAuthenticatorAuthenticatorCrossReference_8_2_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,16,FOLLOW_45); 

                    				newLeafNode(otherlv_11, grammarAccess.getResetAccess().getCommaKeyword_8_3());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getResetAccess().getAuthenticationKeyword_9());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_13, grammarAccess.getResetAccess().getColonKeyword_10());
            		
            otherlv_14=(Token)match(input,15,FOLLOW_18); 

            			newLeafNode(otherlv_14, grammarAccess.getResetAccess().getLeftSquareBracketKeyword_11());
            		
            // InternalLightweight.g:1847:3: ( (otherlv_15= RULE_ID ) )
            // InternalLightweight.g:1848:4: (otherlv_15= RULE_ID )
            {
            // InternalLightweight.g:1848:4: (otherlv_15= RULE_ID )
            // InternalLightweight.g:1849:5: otherlv_15= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResetRule());
            					}
            				
            otherlv_15=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_15, grammarAccess.getResetAccess().getAuthMethodsAuthMethodCrossReference_12_0());
            				

            }


            }

            // InternalLightweight.g:1860:3: (otherlv_16= ',' ( (otherlv_17= RULE_ID ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalLightweight.g:1861:4: otherlv_16= ',' ( (otherlv_17= RULE_ID ) )
            	    {
            	    otherlv_16=(Token)match(input,16,FOLLOW_18); 

            	    				newLeafNode(otherlv_16, grammarAccess.getResetAccess().getCommaKeyword_13_0());
            	    			
            	    // InternalLightweight.g:1865:4: ( (otherlv_17= RULE_ID ) )
            	    // InternalLightweight.g:1866:5: (otherlv_17= RULE_ID )
            	    {
            	    // InternalLightweight.g:1866:5: (otherlv_17= RULE_ID )
            	    // InternalLightweight.g:1867:6: otherlv_17= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getResetRule());
            	    						}
            	    					
            	    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_8); 

            	    						newLeafNode(otherlv_17, grammarAccess.getResetAccess().getAuthMethodsAuthMethodCrossReference_13_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_18=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_18, grammarAccess.getResetAccess().getRightSquareBracketKeyword_14());
            		
            otherlv_19=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getResetAccess().getRightCurlyBracketKeyword_15());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReset"


    // $ANTLR start "entryRuleEBoolean"
    // InternalLightweight.g:1891:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalLightweight.g:1891:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalLightweight.g:1892:2: iv_ruleEBoolean= ruleEBoolean EOF
            {
             newCompositeNode(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEBoolean=ruleEBoolean();

            state._fsp--;

             current =iv_ruleEBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalLightweight.g:1898:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLightweight.g:1904:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalLightweight.g:1905:2: (kw= 'true' | kw= 'false' )
            {
            // InternalLightweight.g:1905:2: (kw= 'true' | kw= 'false' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==49) ) {
                alt17=1;
            }
            else if ( (LA17_0==50) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalLightweight.g:1906:3: kw= 'true'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLightweight.g:1912:3: kw= 'false'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "rulePROVIDER"
    // InternalLightweight.g:1921:1: rulePROVIDER returns [Enumerator current=null] : ( (enumLiteral_0= 'Identity provider' ) | (enumLiteral_1= 'Self provided' ) | (enumLiteral_2= 'Institutional' ) ) ;
    public final Enumerator rulePROVIDER() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLightweight.g:1927:2: ( ( (enumLiteral_0= 'Identity provider' ) | (enumLiteral_1= 'Self provided' ) | (enumLiteral_2= 'Institutional' ) ) )
            // InternalLightweight.g:1928:2: ( (enumLiteral_0= 'Identity provider' ) | (enumLiteral_1= 'Self provided' ) | (enumLiteral_2= 'Institutional' ) )
            {
            // InternalLightweight.g:1928:2: ( (enumLiteral_0= 'Identity provider' ) | (enumLiteral_1= 'Self provided' ) | (enumLiteral_2= 'Institutional' ) )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt18=1;
                }
                break;
            case 52:
                {
                alt18=2;
                }
                break;
            case 53:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalLightweight.g:1929:3: (enumLiteral_0= 'Identity provider' )
                    {
                    // InternalLightweight.g:1929:3: (enumLiteral_0= 'Identity provider' )
                    // InternalLightweight.g:1930:4: enumLiteral_0= 'Identity provider'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getPROVIDERAccess().getIdPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPROVIDERAccess().getIdPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:1937:3: (enumLiteral_1= 'Self provided' )
                    {
                    // InternalLightweight.g:1937:3: (enumLiteral_1= 'Self provided' )
                    // InternalLightweight.g:1938:4: enumLiteral_1= 'Self provided'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getPROVIDERAccess().getSELFEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPROVIDERAccess().getSELFEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLightweight.g:1945:3: (enumLiteral_2= 'Institutional' )
                    {
                    // InternalLightweight.g:1945:3: (enumLiteral_2= 'Institutional' )
                    // InternalLightweight.g:1946:4: enumLiteral_2= 'Institutional'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getPROVIDERAccess().getINSTITUTIONALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPROVIDERAccess().getINSTITUTIONALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePROVIDER"


    // $ANTLR start "ruleCredTYPE"
    // InternalLightweight.g:1956:1: ruleCredTYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'Digital' ) | (enumLiteral_1= 'Physical' ) ) ;
    public final Enumerator ruleCredTYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLightweight.g:1962:2: ( ( (enumLiteral_0= 'Digital' ) | (enumLiteral_1= 'Physical' ) ) )
            // InternalLightweight.g:1963:2: ( (enumLiteral_0= 'Digital' ) | (enumLiteral_1= 'Physical' ) )
            {
            // InternalLightweight.g:1963:2: ( (enumLiteral_0= 'Digital' ) | (enumLiteral_1= 'Physical' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==54) ) {
                alt19=1;
            }
            else if ( (LA19_0==55) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalLightweight.g:1964:3: (enumLiteral_0= 'Digital' )
                    {
                    // InternalLightweight.g:1964:3: (enumLiteral_0= 'Digital' )
                    // InternalLightweight.g:1965:4: enumLiteral_0= 'Digital'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getCredTYPEAccess().getDIGITALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCredTYPEAccess().getDIGITALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:1972:3: (enumLiteral_1= 'Physical' )
                    {
                    // InternalLightweight.g:1972:3: (enumLiteral_1= 'Physical' )
                    // InternalLightweight.g:1973:4: enumLiteral_1= 'Physical'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getCredTYPEAccess().getPHYSICALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getCredTYPEAccess().getPHYSICALEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCredTYPE"


    // $ANTLR start "ruleProtocol"
    // InternalLightweight.g:1983:1: ruleProtocol returns [Enumerator current=null] : ( (enumLiteral_0= 'Email-Based' ) | (enumLiteral_1= 'MS-based' ) | (enumLiteral_2= 'Local' ) ) ;
    public final Enumerator ruleProtocol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLightweight.g:1989:2: ( ( (enumLiteral_0= 'Email-Based' ) | (enumLiteral_1= 'MS-based' ) | (enumLiteral_2= 'Local' ) ) )
            // InternalLightweight.g:1990:2: ( (enumLiteral_0= 'Email-Based' ) | (enumLiteral_1= 'MS-based' ) | (enumLiteral_2= 'Local' ) )
            {
            // InternalLightweight.g:1990:2: ( (enumLiteral_0= 'Email-Based' ) | (enumLiteral_1= 'MS-based' ) | (enumLiteral_2= 'Local' ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 56:
                {
                alt20=1;
                }
                break;
            case 57:
                {
                alt20=2;
                }
                break;
            case 58:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // InternalLightweight.g:1991:3: (enumLiteral_0= 'Email-Based' )
                    {
                    // InternalLightweight.g:1991:3: (enumLiteral_0= 'Email-Based' )
                    // InternalLightweight.g:1992:4: enumLiteral_0= 'Email-Based'
                    {
                    enumLiteral_0=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getEBIAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProtocolAccess().getEBIAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:1999:3: (enumLiteral_1= 'MS-based' )
                    {
                    // InternalLightweight.g:1999:3: (enumLiteral_1= 'MS-based' )
                    // InternalLightweight.g:2000:4: enumLiteral_1= 'MS-based'
                    {
                    enumLiteral_1=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getSMS_BASEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProtocolAccess().getSMS_BASEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLightweight.g:2007:3: (enumLiteral_2= 'Local' )
                    {
                    // InternalLightweight.g:2007:3: (enumLiteral_2= 'Local' )
                    // InternalLightweight.g:2008:4: enumLiteral_2= 'Local'
                    {
                    enumLiteral_2=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getLOCALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getProtocolAccess().getLOCALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProtocol"


    // $ANTLR start "ruleKVALUE"
    // InternalLightweight.g:2018:1: ruleKVALUE returns [Enumerator current=null] : ( (enumLiteral_0= 'High Entropy Text-Based Password' ) | (enumLiteral_1= 'Pass phrase' ) | (enumLiteral_2= 'Knowledge-based Preferences' ) | (enumLiteral_3= 'Low Entropy Text-Based Password' ) | (enumLiteral_4= 'Pin Code' ) ) ;
    public final Enumerator ruleKVALUE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalLightweight.g:2024:2: ( ( (enumLiteral_0= 'High Entropy Text-Based Password' ) | (enumLiteral_1= 'Pass phrase' ) | (enumLiteral_2= 'Knowledge-based Preferences' ) | (enumLiteral_3= 'Low Entropy Text-Based Password' ) | (enumLiteral_4= 'Pin Code' ) ) )
            // InternalLightweight.g:2025:2: ( (enumLiteral_0= 'High Entropy Text-Based Password' ) | (enumLiteral_1= 'Pass phrase' ) | (enumLiteral_2= 'Knowledge-based Preferences' ) | (enumLiteral_3= 'Low Entropy Text-Based Password' ) | (enumLiteral_4= 'Pin Code' ) )
            {
            // InternalLightweight.g:2025:2: ( (enumLiteral_0= 'High Entropy Text-Based Password' ) | (enumLiteral_1= 'Pass phrase' ) | (enumLiteral_2= 'Knowledge-based Preferences' ) | (enumLiteral_3= 'Low Entropy Text-Based Password' ) | (enumLiteral_4= 'Pin Code' ) )
            int alt21=5;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt21=1;
                }
                break;
            case 60:
                {
                alt21=2;
                }
                break;
            case 61:
                {
                alt21=3;
                }
                break;
            case 62:
                {
                alt21=4;
                }
                break;
            case 63:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalLightweight.g:2026:3: (enumLiteral_0= 'High Entropy Text-Based Password' )
                    {
                    // InternalLightweight.g:2026:3: (enumLiteral_0= 'High Entropy Text-Based Password' )
                    // InternalLightweight.g:2027:4: enumLiteral_0= 'High Entropy Text-Based Password'
                    {
                    enumLiteral_0=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getKVALUEAccess().getSTBPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getKVALUEAccess().getSTBPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:2034:3: (enumLiteral_1= 'Pass phrase' )
                    {
                    // InternalLightweight.g:2034:3: (enumLiteral_1= 'Pass phrase' )
                    // InternalLightweight.g:2035:4: enumLiteral_1= 'Pass phrase'
                    {
                    enumLiteral_1=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getKVALUEAccess().getPASSPHRASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getKVALUEAccess().getPASSPHRASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLightweight.g:2042:3: (enumLiteral_2= 'Knowledge-based Preferences' )
                    {
                    // InternalLightweight.g:2042:3: (enumLiteral_2= 'Knowledge-based Preferences' )
                    // InternalLightweight.g:2043:4: enumLiteral_2= 'Knowledge-based Preferences'
                    {
                    enumLiteral_2=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getKVALUEAccess().getPREFERENCESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getKVALUEAccess().getPREFERENCESEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLightweight.g:2050:3: (enumLiteral_3= 'Low Entropy Text-Based Password' )
                    {
                    // InternalLightweight.g:2050:3: (enumLiteral_3= 'Low Entropy Text-Based Password' )
                    // InternalLightweight.g:2051:4: enumLiteral_3= 'Low Entropy Text-Based Password'
                    {
                    enumLiteral_3=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getKVALUEAccess().getLTBPEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getKVALUEAccess().getLTBPEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLightweight.g:2058:3: (enumLiteral_4= 'Pin Code' )
                    {
                    // InternalLightweight.g:2058:3: (enumLiteral_4= 'Pin Code' )
                    // InternalLightweight.g:2059:4: enumLiteral_4= 'Pin Code'
                    {
                    enumLiteral_4=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getKVALUEAccess().getPINEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getKVALUEAccess().getPINEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKVALUE"


    // $ANTLR start "ruleBVALUE"
    // InternalLightweight.g:2069:1: ruleBVALUE returns [Enumerator current=null] : ( (enumLiteral_0= 'Fingerprint Recognition' ) | (enumLiteral_1= 'Facial Recognition' ) ) ;
    public final Enumerator ruleBVALUE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLightweight.g:2075:2: ( ( (enumLiteral_0= 'Fingerprint Recognition' ) | (enumLiteral_1= 'Facial Recognition' ) ) )
            // InternalLightweight.g:2076:2: ( (enumLiteral_0= 'Fingerprint Recognition' ) | (enumLiteral_1= 'Facial Recognition' ) )
            {
            // InternalLightweight.g:2076:2: ( (enumLiteral_0= 'Fingerprint Recognition' ) | (enumLiteral_1= 'Facial Recognition' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==64) ) {
                alt22=1;
            }
            else if ( (LA22_0==65) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalLightweight.g:2077:3: (enumLiteral_0= 'Fingerprint Recognition' )
                    {
                    // InternalLightweight.g:2077:3: (enumLiteral_0= 'Fingerprint Recognition' )
                    // InternalLightweight.g:2078:4: enumLiteral_0= 'Fingerprint Recognition'
                    {
                    enumLiteral_0=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getBVALUEAccess().getFINGERPRINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBVALUEAccess().getFINGERPRINTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:2085:3: (enumLiteral_1= 'Facial Recognition' )
                    {
                    // InternalLightweight.g:2085:3: (enumLiteral_1= 'Facial Recognition' )
                    // InternalLightweight.g:2086:4: enumLiteral_1= 'Facial Recognition'
                    {
                    enumLiteral_1=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getBVALUEAccess().getIRISEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBVALUEAccess().getIRISEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBVALUE"


    // $ANTLR start "rulePVALUE"
    // InternalLightweight.g:2096:1: rulePVALUE returns [Enumerator current=null] : ( (enumLiteral_0= 'Hard Drive Token' ) | (enumLiteral_1= 'Physical device' ) ) ;
    public final Enumerator rulePVALUE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLightweight.g:2102:2: ( ( (enumLiteral_0= 'Hard Drive Token' ) | (enumLiteral_1= 'Physical device' ) ) )
            // InternalLightweight.g:2103:2: ( (enumLiteral_0= 'Hard Drive Token' ) | (enumLiteral_1= 'Physical device' ) )
            {
            // InternalLightweight.g:2103:2: ( (enumLiteral_0= 'Hard Drive Token' ) | (enumLiteral_1= 'Physical device' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==66) ) {
                alt23=1;
            }
            else if ( (LA23_0==67) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalLightweight.g:2104:3: (enumLiteral_0= 'Hard Drive Token' )
                    {
                    // InternalLightweight.g:2104:3: (enumLiteral_0= 'Hard Drive Token' )
                    // InternalLightweight.g:2105:4: enumLiteral_0= 'Hard Drive Token'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getPVALUEAccess().getTOKENEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPVALUEAccess().getTOKENEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:2112:3: (enumLiteral_1= 'Physical device' )
                    {
                    // InternalLightweight.g:2112:3: (enumLiteral_1= 'Physical device' )
                    // InternalLightweight.g:2113:4: enumLiteral_1= 'Physical device'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getPVALUEAccess().getDEVICEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPVALUEAccess().getDEVICEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePVALUE"


    // $ANTLR start "ruleValidationType"
    // InternalLightweight.g:2123:1: ruleValidationType returns [Enumerator current=null] : ( (enumLiteral_0= 'local validation' ) | (enumLiteral_1= 'Remote validation' ) ) ;
    public final Enumerator ruleValidationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLightweight.g:2129:2: ( ( (enumLiteral_0= 'local validation' ) | (enumLiteral_1= 'Remote validation' ) ) )
            // InternalLightweight.g:2130:2: ( (enumLiteral_0= 'local validation' ) | (enumLiteral_1= 'Remote validation' ) )
            {
            // InternalLightweight.g:2130:2: ( (enumLiteral_0= 'local validation' ) | (enumLiteral_1= 'Remote validation' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==68) ) {
                alt24=1;
            }
            else if ( (LA24_0==69) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalLightweight.g:2131:3: (enumLiteral_0= 'local validation' )
                    {
                    // InternalLightweight.g:2131:3: (enumLiteral_0= 'local validation' )
                    // InternalLightweight.g:2132:4: enumLiteral_0= 'local validation'
                    {
                    enumLiteral_0=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getValidationTypeAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getValidationTypeAccess().getLOCALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:2139:3: (enumLiteral_1= 'Remote validation' )
                    {
                    // InternalLightweight.g:2139:3: (enumLiteral_1= 'Remote validation' )
                    // InternalLightweight.g:2140:4: enumLiteral_1= 'Remote validation'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getValidationTypeAccess().getREMOTEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getValidationTypeAccess().getREMOTEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidationType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000004A0000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0001280800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002010010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xF800000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0038000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00C0000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100010100000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0700000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000800010000000L});

}
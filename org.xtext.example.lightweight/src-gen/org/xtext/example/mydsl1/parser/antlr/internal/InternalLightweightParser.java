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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'App'", "':'", "'{'", "'Authenticators'", "'['", "','", "']'", "'Authentications'", "'Procedures'", "'}'", "'MFA'", "'name'", "'authenticators'", "'&'", "'correlation'", "'validation'", "'SFA'", "'authenticator'", "'Possession'", "'value'", "'Knowledge'", "'limitedAttempts'", "'autofillable'", "'Biometrics'", "'Registration'", "'attributes'", "'provider'", "'type'", "'verification'", "'validity'", "'uniqueness'", "'bindings'", "'Recovery'", "'authentication'", "'||'", "'protocol'", "'Login'", "'persistedSession'", "'Reset'", "'true'", "'false'", "'Identity provider'", "'Self provided'", "'Institutional'", "'Digital'", "'Physical'", "'Email-Based'", "'MS-based'", "'Local'", "'High Entropy Text-Based Password'", "'Pass phrase'", "'Knowledge-based Preferences'", "'Low Entropy Text-Based Password'", "'Pin Code'", "'Fingerprint Recognition'", "'Facial Recognition'", "'Hard Drive Token'", "'Physical device'", "'local validation'", "'Remote validation'"
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
    public static final int T__70=70;
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
    // InternalLightweight.g:331:1: ruleMFA returns [EObject current=null] : ( ( (lv_type_0_0= 'MFA' ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'authenticators' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '&' ( (otherlv_11= RULE_ID ) )+ (otherlv_12= ',' )? otherlv_13= 'correlation' otherlv_14= ':' ( (lv_correlation_15_0= ruleEBoolean ) ) otherlv_16= ',' otherlv_17= 'validation' otherlv_18= ':' ( (lv_validation_19_0= ruleValidationType ) ) otherlv_20= '}' ) ;
    public final EObject ruleMFA() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
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
            // InternalLightweight.g:337:2: ( ( ( (lv_type_0_0= 'MFA' ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'authenticators' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '&' ( (otherlv_11= RULE_ID ) )+ (otherlv_12= ',' )? otherlv_13= 'correlation' otherlv_14= ':' ( (lv_correlation_15_0= ruleEBoolean ) ) otherlv_16= ',' otherlv_17= 'validation' otherlv_18= ':' ( (lv_validation_19_0= ruleValidationType ) ) otherlv_20= '}' ) )
            // InternalLightweight.g:338:2: ( ( (lv_type_0_0= 'MFA' ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'authenticators' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '&' ( (otherlv_11= RULE_ID ) )+ (otherlv_12= ',' )? otherlv_13= 'correlation' otherlv_14= ':' ( (lv_correlation_15_0= ruleEBoolean ) ) otherlv_16= ',' otherlv_17= 'validation' otherlv_18= ':' ( (lv_validation_19_0= ruleValidationType ) ) otherlv_20= '}' )
            {
            // InternalLightweight.g:338:2: ( ( (lv_type_0_0= 'MFA' ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'authenticators' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '&' ( (otherlv_11= RULE_ID ) )+ (otherlv_12= ',' )? otherlv_13= 'correlation' otherlv_14= ':' ( (lv_correlation_15_0= ruleEBoolean ) ) otherlv_16= ',' otherlv_17= 'validation' otherlv_18= ':' ( (lv_validation_19_0= ruleValidationType ) ) otherlv_20= '}' )
            // InternalLightweight.g:339:3: ( (lv_type_0_0= 'MFA' ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'authenticators' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '&' ( (otherlv_11= RULE_ID ) )+ (otherlv_12= ',' )? otherlv_13= 'correlation' otherlv_14= ':' ( (lv_correlation_15_0= ruleEBoolean ) ) otherlv_16= ',' otherlv_17= 'validation' otherlv_18= ':' ( (lv_validation_19_0= ruleValidationType ) ) otherlv_20= '}'
            {
            // InternalLightweight.g:339:3: ( (lv_type_0_0= 'MFA' ) )
            // InternalLightweight.g:340:4: (lv_type_0_0= 'MFA' )
            {
            // InternalLightweight.g:340:4: (lv_type_0_0= 'MFA' )
            // InternalLightweight.g:341:5: lv_type_0_0= 'MFA'
            {
            lv_type_0_0=(Token)match(input,21,FOLLOW_3); 

            					newLeafNode(lv_type_0_0, grammarAccess.getMFAAccess().getTypeMFAKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMFARule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "MFA");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMFAAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getMFAAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getMFAAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getMFAAccess().getColonKeyword_4());
            		
            // InternalLightweight.g:369:3: ( (lv_name_5_0= ruleEString ) )
            // InternalLightweight.g:370:4: (lv_name_5_0= ruleEString )
            {
            // InternalLightweight.g:370:4: (lv_name_5_0= ruleEString )
            // InternalLightweight.g:371:5: lv_name_5_0= ruleEString
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
            		
            // InternalLightweight.g:400:3: ( (otherlv_9= RULE_ID ) )
            // InternalLightweight.g:401:4: (otherlv_9= RULE_ID )
            {
            // InternalLightweight.g:401:4: (otherlv_9= RULE_ID )
            // InternalLightweight.g:402:5: otherlv_9= RULE_ID
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
            		
            // InternalLightweight.g:417:3: ( (otherlv_11= RULE_ID ) )+
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
            	    // InternalLightweight.g:418:4: (otherlv_11= RULE_ID )
            	    {
            	    // InternalLightweight.g:418:4: (otherlv_11= RULE_ID )
            	    // InternalLightweight.g:419:5: otherlv_11= RULE_ID
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

            // InternalLightweight.g:430:3: (otherlv_12= ',' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalLightweight.g:431:4: otherlv_12= ','
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
            		
            // InternalLightweight.g:444:3: ( (lv_correlation_15_0= ruleEBoolean ) )
            // InternalLightweight.g:445:4: (lv_correlation_15_0= ruleEBoolean )
            {
            // InternalLightweight.g:445:4: (lv_correlation_15_0= ruleEBoolean )
            // InternalLightweight.g:446:5: lv_correlation_15_0= ruleEBoolean
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
            		
            // InternalLightweight.g:475:3: ( (lv_validation_19_0= ruleValidationType ) )
            // InternalLightweight.g:476:4: (lv_validation_19_0= ruleValidationType )
            {
            // InternalLightweight.g:476:4: (lv_validation_19_0= ruleValidationType )
            // InternalLightweight.g:477:5: lv_validation_19_0= ruleValidationType
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
    // InternalLightweight.g:502:1: entryRuleSFA returns [EObject current=null] : iv_ruleSFA= ruleSFA EOF ;
    public final EObject entryRuleSFA() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSFA = null;


        try {
            // InternalLightweight.g:502:44: (iv_ruleSFA= ruleSFA EOF )
            // InternalLightweight.g:503:2: iv_ruleSFA= ruleSFA EOF
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
    // InternalLightweight.g:509:1: ruleSFA returns [EObject current=null] : ( ( (lv_type_0_0= 'SFA' ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'authenticator' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' ) ;
    public final EObject ruleSFA() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;



        	enterRule();

        try {
            // InternalLightweight.g:515:2: ( ( ( (lv_type_0_0= 'SFA' ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'authenticator' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' ) )
            // InternalLightweight.g:516:2: ( ( (lv_type_0_0= 'SFA' ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'authenticator' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' )
            {
            // InternalLightweight.g:516:2: ( ( (lv_type_0_0= 'SFA' ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'authenticator' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' )
            // InternalLightweight.g:517:3: ( (lv_type_0_0= 'SFA' ) ) otherlv_1= ':' otherlv_2= '{' otherlv_3= 'name' otherlv_4= ':' ( (lv_name_5_0= ruleEString ) ) otherlv_6= ',' otherlv_7= 'authenticator' otherlv_8= ':' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}'
            {
            // InternalLightweight.g:517:3: ( (lv_type_0_0= 'SFA' ) )
            // InternalLightweight.g:518:4: (lv_type_0_0= 'SFA' )
            {
            // InternalLightweight.g:518:4: (lv_type_0_0= 'SFA' )
            // InternalLightweight.g:519:5: lv_type_0_0= 'SFA'
            {
            lv_type_0_0=(Token)match(input,27,FOLLOW_3); 

            					newLeafNode(lv_type_0_0, grammarAccess.getSFAAccess().getTypeSFAKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSFARule());
            					}
            					setWithLastConsumed(current, "type", lv_type_0_0, "SFA");
            				

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getSFAAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSFAAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSFAAccess().getNameKeyword_3());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getSFAAccess().getColonKeyword_4());
            		
            // InternalLightweight.g:547:3: ( (lv_name_5_0= ruleEString ) )
            // InternalLightweight.g:548:4: (lv_name_5_0= ruleEString )
            {
            // InternalLightweight.g:548:4: (lv_name_5_0= ruleEString )
            // InternalLightweight.g:549:5: lv_name_5_0= ruleEString
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
            		
            // InternalLightweight.g:578:3: ( (otherlv_9= RULE_ID ) )
            // InternalLightweight.g:579:4: (otherlv_9= RULE_ID )
            {
            // InternalLightweight.g:579:4: (otherlv_9= RULE_ID )
            // InternalLightweight.g:580:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSFARule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_9, grammarAccess.getSFAAccess().getAuthenticatorsAuthenticatorCrossReference_9_0());
            				

            }


            }

            otherlv_10=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getSFAAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalLightweight.g:599:1: entryRuleAuthenticator returns [EObject current=null] : iv_ruleAuthenticator= ruleAuthenticator EOF ;
    public final EObject entryRuleAuthenticator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAuthenticator = null;


        try {
            // InternalLightweight.g:599:54: (iv_ruleAuthenticator= ruleAuthenticator EOF )
            // InternalLightweight.g:600:2: iv_ruleAuthenticator= ruleAuthenticator EOF
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
    // InternalLightweight.g:606:1: ruleAuthenticator returns [EObject current=null] : (this_Possession_0= rulePossession | this_Biometrics_1= ruleBiometrics | this_Knowledge_2= ruleKnowledge ) ;
    public final EObject ruleAuthenticator() throws RecognitionException {
        EObject current = null;

        EObject this_Possession_0 = null;

        EObject this_Biometrics_1 = null;

        EObject this_Knowledge_2 = null;



        	enterRule();

        try {
            // InternalLightweight.g:612:2: ( (this_Possession_0= rulePossession | this_Biometrics_1= ruleBiometrics | this_Knowledge_2= ruleKnowledge ) )
            // InternalLightweight.g:613:2: (this_Possession_0= rulePossession | this_Biometrics_1= ruleBiometrics | this_Knowledge_2= ruleKnowledge )
            {
            // InternalLightweight.g:613:2: (this_Possession_0= rulePossession | this_Biometrics_1= ruleBiometrics | this_Knowledge_2= ruleKnowledge )
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
                    // InternalLightweight.g:614:3: this_Possession_0= rulePossession
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
                    // InternalLightweight.g:623:3: this_Biometrics_1= ruleBiometrics
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
                    // InternalLightweight.g:632:3: this_Knowledge_2= ruleKnowledge
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
    // InternalLightweight.g:644:1: entryRulePossession returns [EObject current=null] : iv_rulePossession= rulePossession EOF ;
    public final EObject entryRulePossession() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePossession = null;


        try {
            // InternalLightweight.g:644:51: (iv_rulePossession= rulePossession EOF )
            // InternalLightweight.g:645:2: iv_rulePossession= rulePossession EOF
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
    // InternalLightweight.g:651:1: rulePossession returns [EObject current=null] : ( () ( (lv_type_1_0= 'Possession' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'value' otherlv_9= ':' ( (lv_value_10_0= rulePVALUE ) ) otherlv_11= '}' ) ;
    public final EObject rulePossession() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        Enumerator lv_value_10_0 = null;



        	enterRule();

        try {
            // InternalLightweight.g:657:2: ( ( () ( (lv_type_1_0= 'Possession' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'value' otherlv_9= ':' ( (lv_value_10_0= rulePVALUE ) ) otherlv_11= '}' ) )
            // InternalLightweight.g:658:2: ( () ( (lv_type_1_0= 'Possession' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'value' otherlv_9= ':' ( (lv_value_10_0= rulePVALUE ) ) otherlv_11= '}' )
            {
            // InternalLightweight.g:658:2: ( () ( (lv_type_1_0= 'Possession' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'value' otherlv_9= ':' ( (lv_value_10_0= rulePVALUE ) ) otherlv_11= '}' )
            // InternalLightweight.g:659:3: () ( (lv_type_1_0= 'Possession' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'value' otherlv_9= ':' ( (lv_value_10_0= rulePVALUE ) ) otherlv_11= '}'
            {
            // InternalLightweight.g:659:3: ()
            // InternalLightweight.g:660:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPossessionAccess().getPossessionAction_0(),
            					current);
            			

            }

            // InternalLightweight.g:666:3: ( (lv_type_1_0= 'Possession' ) )
            // InternalLightweight.g:667:4: (lv_type_1_0= 'Possession' )
            {
            // InternalLightweight.g:667:4: (lv_type_1_0= 'Possession' )
            // InternalLightweight.g:668:5: lv_type_1_0= 'Possession'
            {
            lv_type_1_0=(Token)match(input,29,FOLLOW_3); 

            					newLeafNode(lv_type_1_0, grammarAccess.getPossessionAccess().getTypePossessionKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPossessionRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_1_0, "Possession");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPossessionAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getPossessionAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getPossessionAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getPossessionAccess().getColonKeyword_5());
            		
            // InternalLightweight.g:696:3: ( (lv_name_6_0= ruleEString ) )
            // InternalLightweight.g:697:4: (lv_name_6_0= ruleEString )
            {
            // InternalLightweight.g:697:4: (lv_name_6_0= ruleEString )
            // InternalLightweight.g:698:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPossessionAccess().getNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPossessionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.xtext.example.mydsl1.Lightweight.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getPossessionAccess().getCommaKeyword_7());
            		
            otherlv_8=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getPossessionAccess().getValueKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_27); 

            			newLeafNode(otherlv_9, grammarAccess.getPossessionAccess().getColonKeyword_9());
            		
            // InternalLightweight.g:727:3: ( (lv_value_10_0= rulePVALUE ) )
            // InternalLightweight.g:728:4: (lv_value_10_0= rulePVALUE )
            {
            // InternalLightweight.g:728:4: (lv_value_10_0= rulePVALUE )
            // InternalLightweight.g:729:5: lv_value_10_0= rulePVALUE
            {

            					newCompositeNode(grammarAccess.getPossessionAccess().getValuePVALUEEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_14);
            lv_value_10_0=rulePVALUE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPossessionRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_10_0,
            						"org.xtext.example.mydsl1.Lightweight.PVALUE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getPossessionAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalLightweight.g:754:1: entryRuleKnowledge returns [EObject current=null] : iv_ruleKnowledge= ruleKnowledge EOF ;
    public final EObject entryRuleKnowledge() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKnowledge = null;


        try {
            // InternalLightweight.g:754:50: (iv_ruleKnowledge= ruleKnowledge EOF )
            // InternalLightweight.g:755:2: iv_ruleKnowledge= ruleKnowledge EOF
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
    // InternalLightweight.g:761:1: ruleKnowledge returns [EObject current=null] : ( () ( (lv_type_1_0= 'Knowledge' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'value' otherlv_9= ':' ( (lv_value_10_0= ruleKVALUE ) ) otherlv_11= ',' otherlv_12= 'limitedAttempts' otherlv_13= ':' ( (lv_limitedAttempts_14_0= ruleBool2 ) ) otherlv_15= ',' otherlv_16= 'autofillable' otherlv_17= ':' ( (lv_autofilled_18_0= ruleBool2 ) ) otherlv_19= '}' ) ;
    public final EObject ruleKnowledge() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
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
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        Enumerator lv_value_10_0 = null;

        Enumerator lv_limitedAttempts_14_0 = null;

        Enumerator lv_autofilled_18_0 = null;



        	enterRule();

        try {
            // InternalLightweight.g:767:2: ( ( () ( (lv_type_1_0= 'Knowledge' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'value' otherlv_9= ':' ( (lv_value_10_0= ruleKVALUE ) ) otherlv_11= ',' otherlv_12= 'limitedAttempts' otherlv_13= ':' ( (lv_limitedAttempts_14_0= ruleBool2 ) ) otherlv_15= ',' otherlv_16= 'autofillable' otherlv_17= ':' ( (lv_autofilled_18_0= ruleBool2 ) ) otherlv_19= '}' ) )
            // InternalLightweight.g:768:2: ( () ( (lv_type_1_0= 'Knowledge' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'value' otherlv_9= ':' ( (lv_value_10_0= ruleKVALUE ) ) otherlv_11= ',' otherlv_12= 'limitedAttempts' otherlv_13= ':' ( (lv_limitedAttempts_14_0= ruleBool2 ) ) otherlv_15= ',' otherlv_16= 'autofillable' otherlv_17= ':' ( (lv_autofilled_18_0= ruleBool2 ) ) otherlv_19= '}' )
            {
            // InternalLightweight.g:768:2: ( () ( (lv_type_1_0= 'Knowledge' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'value' otherlv_9= ':' ( (lv_value_10_0= ruleKVALUE ) ) otherlv_11= ',' otherlv_12= 'limitedAttempts' otherlv_13= ':' ( (lv_limitedAttempts_14_0= ruleBool2 ) ) otherlv_15= ',' otherlv_16= 'autofillable' otherlv_17= ':' ( (lv_autofilled_18_0= ruleBool2 ) ) otherlv_19= '}' )
            // InternalLightweight.g:769:3: () ( (lv_type_1_0= 'Knowledge' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'value' otherlv_9= ':' ( (lv_value_10_0= ruleKVALUE ) ) otherlv_11= ',' otherlv_12= 'limitedAttempts' otherlv_13= ':' ( (lv_limitedAttempts_14_0= ruleBool2 ) ) otherlv_15= ',' otherlv_16= 'autofillable' otherlv_17= ':' ( (lv_autofilled_18_0= ruleBool2 ) ) otherlv_19= '}'
            {
            // InternalLightweight.g:769:3: ()
            // InternalLightweight.g:770:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getKnowledgeAccess().getKnowledgeAction_0(),
            					current);
            			

            }

            // InternalLightweight.g:776:3: ( (lv_type_1_0= 'Knowledge' ) )
            // InternalLightweight.g:777:4: (lv_type_1_0= 'Knowledge' )
            {
            // InternalLightweight.g:777:4: (lv_type_1_0= 'Knowledge' )
            // InternalLightweight.g:778:5: lv_type_1_0= 'Knowledge'
            {
            lv_type_1_0=(Token)match(input,31,FOLLOW_3); 

            					newLeafNode(lv_type_1_0, grammarAccess.getKnowledgeAccess().getTypeKnowledgeKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKnowledgeRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_1_0, "Knowledge");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getKnowledgeAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getKnowledgeAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getKnowledgeAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getKnowledgeAccess().getColonKeyword_5());
            		
            // InternalLightweight.g:806:3: ( (lv_name_6_0= ruleEString ) )
            // InternalLightweight.g:807:4: (lv_name_6_0= ruleEString )
            {
            // InternalLightweight.g:807:4: (lv_name_6_0= ruleEString )
            // InternalLightweight.g:808:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getKnowledgeAccess().getNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKnowledgeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.xtext.example.mydsl1.Lightweight.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getKnowledgeAccess().getCommaKeyword_7());
            		
            otherlv_8=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getKnowledgeAccess().getValueKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_28); 

            			newLeafNode(otherlv_9, grammarAccess.getKnowledgeAccess().getColonKeyword_9());
            		
            // InternalLightweight.g:837:3: ( (lv_value_10_0= ruleKVALUE ) )
            // InternalLightweight.g:838:4: (lv_value_10_0= ruleKVALUE )
            {
            // InternalLightweight.g:838:4: (lv_value_10_0= ruleKVALUE )
            // InternalLightweight.g:839:5: lv_value_10_0= ruleKVALUE
            {

            					newCompositeNode(grammarAccess.getKnowledgeAccess().getValueKVALUEEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_9);
            lv_value_10_0=ruleKVALUE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKnowledgeRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_10_0,
            						"org.xtext.example.mydsl1.Lightweight.KVALUE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_29); 

            			newLeafNode(otherlv_11, grammarAccess.getKnowledgeAccess().getCommaKeyword_11());
            		
            otherlv_12=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getKnowledgeAccess().getLimitedAttemptsKeyword_12());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_13, grammarAccess.getKnowledgeAccess().getColonKeyword_13());
            		
            // InternalLightweight.g:868:3: ( (lv_limitedAttempts_14_0= ruleBool2 ) )
            // InternalLightweight.g:869:4: (lv_limitedAttempts_14_0= ruleBool2 )
            {
            // InternalLightweight.g:869:4: (lv_limitedAttempts_14_0= ruleBool2 )
            // InternalLightweight.g:870:5: lv_limitedAttempts_14_0= ruleBool2
            {

            					newCompositeNode(grammarAccess.getKnowledgeAccess().getLimitedAttemptsBool2EnumRuleCall_14_0());
            				
            pushFollow(FOLLOW_9);
            lv_limitedAttempts_14_0=ruleBool2();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKnowledgeRule());
            					}
            					set(
            						current,
            						"limitedAttempts",
            						lv_limitedAttempts_14_0,
            						"org.xtext.example.mydsl1.Lightweight.Bool2");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,16,FOLLOW_30); 

            			newLeafNode(otherlv_15, grammarAccess.getKnowledgeAccess().getCommaKeyword_15());
            		
            otherlv_16=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getKnowledgeAccess().getAutofillableKeyword_16());
            		
            otherlv_17=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_17, grammarAccess.getKnowledgeAccess().getColonKeyword_17());
            		
            // InternalLightweight.g:899:3: ( (lv_autofilled_18_0= ruleBool2 ) )
            // InternalLightweight.g:900:4: (lv_autofilled_18_0= ruleBool2 )
            {
            // InternalLightweight.g:900:4: (lv_autofilled_18_0= ruleBool2 )
            // InternalLightweight.g:901:5: lv_autofilled_18_0= ruleBool2
            {

            					newCompositeNode(grammarAccess.getKnowledgeAccess().getAutofilledBool2EnumRuleCall_18_0());
            				
            pushFollow(FOLLOW_14);
            lv_autofilled_18_0=ruleBool2();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getKnowledgeRule());
            					}
            					set(
            						current,
            						"autofilled",
            						lv_autofilled_18_0,
            						"org.xtext.example.mydsl1.Lightweight.Bool2");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_19=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_19, grammarAccess.getKnowledgeAccess().getRightCurlyBracketKeyword_19());
            		

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
    // InternalLightweight.g:926:1: entryRuleBiometrics returns [EObject current=null] : iv_ruleBiometrics= ruleBiometrics EOF ;
    public final EObject entryRuleBiometrics() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBiometrics = null;


        try {
            // InternalLightweight.g:926:51: (iv_ruleBiometrics= ruleBiometrics EOF )
            // InternalLightweight.g:927:2: iv_ruleBiometrics= ruleBiometrics EOF
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
    // InternalLightweight.g:933:1: ruleBiometrics returns [EObject current=null] : ( () ( (lv_type_1_0= 'Biometrics' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'value' otherlv_9= ':' ( (lv_value_10_0= ruleBVALUE ) ) otherlv_11= '}' ) ;
    public final EObject ruleBiometrics() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        Enumerator lv_value_10_0 = null;



        	enterRule();

        try {
            // InternalLightweight.g:939:2: ( ( () ( (lv_type_1_0= 'Biometrics' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'value' otherlv_9= ':' ( (lv_value_10_0= ruleBVALUE ) ) otherlv_11= '}' ) )
            // InternalLightweight.g:940:2: ( () ( (lv_type_1_0= 'Biometrics' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'value' otherlv_9= ':' ( (lv_value_10_0= ruleBVALUE ) ) otherlv_11= '}' )
            {
            // InternalLightweight.g:940:2: ( () ( (lv_type_1_0= 'Biometrics' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'value' otherlv_9= ':' ( (lv_value_10_0= ruleBVALUE ) ) otherlv_11= '}' )
            // InternalLightweight.g:941:3: () ( (lv_type_1_0= 'Biometrics' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'value' otherlv_9= ':' ( (lv_value_10_0= ruleBVALUE ) ) otherlv_11= '}'
            {
            // InternalLightweight.g:941:3: ()
            // InternalLightweight.g:942:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBiometricsAccess().getBiometricsAction_0(),
            					current);
            			

            }

            // InternalLightweight.g:948:3: ( (lv_type_1_0= 'Biometrics' ) )
            // InternalLightweight.g:949:4: (lv_type_1_0= 'Biometrics' )
            {
            // InternalLightweight.g:949:4: (lv_type_1_0= 'Biometrics' )
            // InternalLightweight.g:950:5: lv_type_1_0= 'Biometrics'
            {
            lv_type_1_0=(Token)match(input,34,FOLLOW_3); 

            					newLeafNode(lv_type_1_0, grammarAccess.getBiometricsAccess().getTypeBiometricsKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBiometricsRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_1_0, "Biometrics");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getBiometricsAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getBiometricsAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getBiometricsAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getBiometricsAccess().getColonKeyword_5());
            		
            // InternalLightweight.g:978:3: ( (lv_name_6_0= ruleEString ) )
            // InternalLightweight.g:979:4: (lv_name_6_0= ruleEString )
            {
            // InternalLightweight.g:979:4: (lv_name_6_0= ruleEString )
            // InternalLightweight.g:980:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getBiometricsAccess().getNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBiometricsRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.xtext.example.mydsl1.Lightweight.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_26); 

            			newLeafNode(otherlv_7, grammarAccess.getBiometricsAccess().getCommaKeyword_7());
            		
            otherlv_8=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getBiometricsAccess().getValueKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_9, grammarAccess.getBiometricsAccess().getColonKeyword_9());
            		
            // InternalLightweight.g:1009:3: ( (lv_value_10_0= ruleBVALUE ) )
            // InternalLightweight.g:1010:4: (lv_value_10_0= ruleBVALUE )
            {
            // InternalLightweight.g:1010:4: (lv_value_10_0= ruleBVALUE )
            // InternalLightweight.g:1011:5: lv_value_10_0= ruleBVALUE
            {

            					newCompositeNode(grammarAccess.getBiometricsAccess().getValueBVALUEEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_14);
            lv_value_10_0=ruleBVALUE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBiometricsRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_10_0,
            						"org.xtext.example.mydsl1.Lightweight.BVALUE");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getBiometricsAccess().getRightCurlyBracketKeyword_11());
            		

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
    // InternalLightweight.g:1036:1: entryRulePhase returns [EObject current=null] : iv_rulePhase= rulePhase EOF ;
    public final EObject entryRulePhase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhase = null;


        try {
            // InternalLightweight.g:1036:46: (iv_rulePhase= rulePhase EOF )
            // InternalLightweight.g:1037:2: iv_rulePhase= rulePhase EOF
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
    // InternalLightweight.g:1043:1: rulePhase returns [EObject current=null] : (this_Registration_0= ruleRegistration | this_Recovery_1= ruleRecovery | this_Login_2= ruleLogin | this_Reset_3= ruleReset ) ;
    public final EObject rulePhase() throws RecognitionException {
        EObject current = null;

        EObject this_Registration_0 = null;

        EObject this_Recovery_1 = null;

        EObject this_Login_2 = null;

        EObject this_Reset_3 = null;



        	enterRule();

        try {
            // InternalLightweight.g:1049:2: ( (this_Registration_0= ruleRegistration | this_Recovery_1= ruleRecovery | this_Login_2= ruleLogin | this_Reset_3= ruleReset ) )
            // InternalLightweight.g:1050:2: (this_Registration_0= ruleRegistration | this_Recovery_1= ruleRecovery | this_Login_2= ruleLogin | this_Reset_3= ruleReset )
            {
            // InternalLightweight.g:1050:2: (this_Registration_0= ruleRegistration | this_Recovery_1= ruleRecovery | this_Login_2= ruleLogin | this_Reset_3= ruleReset )
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
            case 47:
                {
                alt8=3;
                }
                break;
            case 49:
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
                    // InternalLightweight.g:1051:3: this_Registration_0= ruleRegistration
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
                    // InternalLightweight.g:1060:3: this_Recovery_1= ruleRecovery
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
                    // InternalLightweight.g:1069:3: this_Login_2= ruleLogin
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
                    // InternalLightweight.g:1078:3: this_Reset_3= ruleReset
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
    // InternalLightweight.g:1090:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalLightweight.g:1090:47: (iv_ruleEString= ruleEString EOF )
            // InternalLightweight.g:1091:2: iv_ruleEString= ruleEString EOF
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
    // InternalLightweight.g:1097:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalLightweight.g:1103:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalLightweight.g:1104:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalLightweight.g:1104:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalLightweight.g:1105:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLightweight.g:1113:3: this_ID_1= RULE_ID
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
    // InternalLightweight.g:1124:1: entryRuleRegistration returns [EObject current=null] : iv_ruleRegistration= ruleRegistration EOF ;
    public final EObject entryRuleRegistration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRegistration = null;


        try {
            // InternalLightweight.g:1124:53: (iv_ruleRegistration= ruleRegistration EOF )
            // InternalLightweight.g:1125:2: iv_ruleRegistration= ruleRegistration EOF
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
    // InternalLightweight.g:1131:1: ruleRegistration returns [EObject current=null] : ( () ( (lv_type_1_0= 'Registration' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'attributes' otherlv_9= ':' otherlv_10= '[' ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* otherlv_14= ']' otherlv_15= '}' ) ;
    public final EObject ruleRegistration() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_attributes_13_0 = null;



        	enterRule();

        try {
            // InternalLightweight.g:1137:2: ( ( () ( (lv_type_1_0= 'Registration' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'attributes' otherlv_9= ':' otherlv_10= '[' ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* otherlv_14= ']' otherlv_15= '}' ) )
            // InternalLightweight.g:1138:2: ( () ( (lv_type_1_0= 'Registration' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'attributes' otherlv_9= ':' otherlv_10= '[' ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* otherlv_14= ']' otherlv_15= '}' )
            {
            // InternalLightweight.g:1138:2: ( () ( (lv_type_1_0= 'Registration' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'attributes' otherlv_9= ':' otherlv_10= '[' ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* otherlv_14= ']' otherlv_15= '}' )
            // InternalLightweight.g:1139:3: () ( (lv_type_1_0= 'Registration' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'attributes' otherlv_9= ':' otherlv_10= '[' ( (lv_attributes_11_0= ruleAttribute ) ) (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )* otherlv_14= ']' otherlv_15= '}'
            {
            // InternalLightweight.g:1139:3: ()
            // InternalLightweight.g:1140:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRegistrationAccess().getRegistrationAction_0(),
            					current);
            			

            }

            // InternalLightweight.g:1146:3: ( (lv_type_1_0= 'Registration' ) )
            // InternalLightweight.g:1147:4: (lv_type_1_0= 'Registration' )
            {
            // InternalLightweight.g:1147:4: (lv_type_1_0= 'Registration' )
            // InternalLightweight.g:1148:5: lv_type_1_0= 'Registration'
            {
            lv_type_1_0=(Token)match(input,35,FOLLOW_3); 

            					newLeafNode(lv_type_1_0, grammarAccess.getRegistrationAccess().getTypeRegistrationKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRegistrationRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_1_0, "Registration");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRegistrationAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getRegistrationAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRegistrationAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getRegistrationAccess().getColonKeyword_5());
            		
            // InternalLightweight.g:1176:3: ( (lv_name_6_0= ruleEString ) )
            // InternalLightweight.g:1177:4: (lv_name_6_0= ruleEString )
            {
            // InternalLightweight.g:1177:4: (lv_name_6_0= ruleEString )
            // InternalLightweight.g:1178:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRegistrationAccess().getNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegistrationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"org.xtext.example.mydsl1.Lightweight.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,16,FOLLOW_32); 

            			newLeafNode(otherlv_7, grammarAccess.getRegistrationAccess().getCommaKeyword_7());
            		
            otherlv_8=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getRegistrationAccess().getAttributesKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getRegistrationAccess().getColonKeyword_9());
            		
            otherlv_10=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_10, grammarAccess.getRegistrationAccess().getLeftSquareBracketKeyword_10());
            		
            // InternalLightweight.g:1211:3: ( (lv_attributes_11_0= ruleAttribute ) )
            // InternalLightweight.g:1212:4: (lv_attributes_11_0= ruleAttribute )
            {
            // InternalLightweight.g:1212:4: (lv_attributes_11_0= ruleAttribute )
            // InternalLightweight.g:1213:5: lv_attributes_11_0= ruleAttribute
            {

            					newCompositeNode(grammarAccess.getRegistrationAccess().getAttributesAttributeParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_8);
            lv_attributes_11_0=ruleAttribute();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRegistrationRule());
            					}
            					add(
            						current,
            						"attributes",
            						lv_attributes_11_0,
            						"org.xtext.example.mydsl1.Lightweight.Attribute");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalLightweight.g:1230:3: (otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==16) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalLightweight.g:1231:4: otherlv_12= ',' ( (lv_attributes_13_0= ruleAttribute ) )
            	    {
            	    otherlv_12=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_12, grammarAccess.getRegistrationAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalLightweight.g:1235:4: ( (lv_attributes_13_0= ruleAttribute ) )
            	    // InternalLightweight.g:1236:5: (lv_attributes_13_0= ruleAttribute )
            	    {
            	    // InternalLightweight.g:1236:5: (lv_attributes_13_0= ruleAttribute )
            	    // InternalLightweight.g:1237:6: lv_attributes_13_0= ruleAttribute
            	    {

            	    						newCompositeNode(grammarAccess.getRegistrationAccess().getAttributesAttributeParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    lv_attributes_13_0=ruleAttribute();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getRegistrationRule());
            	    						}
            	    						add(
            	    							current,
            	    							"attributes",
            	    							lv_attributes_13_0,
            	    							"org.xtext.example.mydsl1.Lightweight.Attribute");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_14=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_14, grammarAccess.getRegistrationAccess().getRightSquareBracketKeyword_13());
            		
            otherlv_15=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getRegistrationAccess().getRightCurlyBracketKeyword_14());
            		

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


    // $ANTLR start "entryRuleAttribute"
    // InternalLightweight.g:1267:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalLightweight.g:1267:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalLightweight.g:1268:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalLightweight.g:1274:1: ruleAttribute returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ',' otherlv_6= 'provider' otherlv_7= ':' ( (lv_provider_8_0= rulePROVIDER ) ) otherlv_9= ',' otherlv_10= 'type' otherlv_11= ':' ( (lv_type_12_0= ruleCredTYPE ) ) otherlv_13= ',' (otherlv_14= 'verification' otherlv_15= ':' ( (lv_verifmethod_16_0= ruleVerifMethod ) ) )? otherlv_17= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
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
            // InternalLightweight.g:1280:2: ( ( () otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ',' otherlv_6= 'provider' otherlv_7= ':' ( (lv_provider_8_0= rulePROVIDER ) ) otherlv_9= ',' otherlv_10= 'type' otherlv_11= ':' ( (lv_type_12_0= ruleCredTYPE ) ) otherlv_13= ',' (otherlv_14= 'verification' otherlv_15= ':' ( (lv_verifmethod_16_0= ruleVerifMethod ) ) )? otherlv_17= '}' ) )
            // InternalLightweight.g:1281:2: ( () otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ',' otherlv_6= 'provider' otherlv_7= ':' ( (lv_provider_8_0= rulePROVIDER ) ) otherlv_9= ',' otherlv_10= 'type' otherlv_11= ':' ( (lv_type_12_0= ruleCredTYPE ) ) otherlv_13= ',' (otherlv_14= 'verification' otherlv_15= ':' ( (lv_verifmethod_16_0= ruleVerifMethod ) ) )? otherlv_17= '}' )
            {
            // InternalLightweight.g:1281:2: ( () otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ',' otherlv_6= 'provider' otherlv_7= ':' ( (lv_provider_8_0= rulePROVIDER ) ) otherlv_9= ',' otherlv_10= 'type' otherlv_11= ':' ( (lv_type_12_0= ruleCredTYPE ) ) otherlv_13= ',' (otherlv_14= 'verification' otherlv_15= ':' ( (lv_verifmethod_16_0= ruleVerifMethod ) ) )? otherlv_17= '}' )
            // InternalLightweight.g:1282:3: () otherlv_1= '{' otherlv_2= 'name' otherlv_3= ':' ( (lv_name_4_0= ruleEString ) ) otherlv_5= ',' otherlv_6= 'provider' otherlv_7= ':' ( (lv_provider_8_0= rulePROVIDER ) ) otherlv_9= ',' otherlv_10= 'type' otherlv_11= ':' ( (lv_type_12_0= ruleCredTYPE ) ) otherlv_13= ',' (otherlv_14= 'verification' otherlv_15= ':' ( (lv_verifmethod_16_0= ruleVerifMethod ) ) )? otherlv_17= '}'
            {
            // InternalLightweight.g:1282:3: ()
            // InternalLightweight.g:1283:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAttributeAccess().getAttributeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getNameKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getColonKeyword_3());
            		
            // InternalLightweight.g:1301:3: ( (lv_name_4_0= ruleEString ) )
            // InternalLightweight.g:1302:4: (lv_name_4_0= ruleEString )
            {
            // InternalLightweight.g:1302:4: (lv_name_4_0= ruleEString )
            // InternalLightweight.g:1303:5: lv_name_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getNameEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
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

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getCommaKeyword_5());
            		
            otherlv_6=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getAttributeAccess().getProviderKeyword_6());
            		
            otherlv_7=(Token)match(input,12,FOLLOW_34); 

            			newLeafNode(otherlv_7, grammarAccess.getAttributeAccess().getColonKeyword_7());
            		
            // InternalLightweight.g:1332:3: ( (lv_provider_8_0= rulePROVIDER ) )
            // InternalLightweight.g:1333:4: (lv_provider_8_0= rulePROVIDER )
            {
            // InternalLightweight.g:1333:4: (lv_provider_8_0= rulePROVIDER )
            // InternalLightweight.g:1334:5: lv_provider_8_0= rulePROVIDER
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getProviderPROVIDEREnumRuleCall_8_0());
            				
            pushFollow(FOLLOW_9);
            lv_provider_8_0=rulePROVIDER();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
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

            			newLeafNode(otherlv_9, grammarAccess.getAttributeAccess().getCommaKeyword_9());
            		
            otherlv_10=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getAttributeAccess().getTypeKeyword_10());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_11, grammarAccess.getAttributeAccess().getColonKeyword_11());
            		
            // InternalLightweight.g:1363:3: ( (lv_type_12_0= ruleCredTYPE ) )
            // InternalLightweight.g:1364:4: (lv_type_12_0= ruleCredTYPE )
            {
            // InternalLightweight.g:1364:4: (lv_type_12_0= ruleCredTYPE )
            // InternalLightweight.g:1365:5: lv_type_12_0= ruleCredTYPE
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeCredTYPEEnumRuleCall_12_0());
            				
            pushFollow(FOLLOW_9);
            lv_type_12_0=ruleCredTYPE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
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

            			newLeafNode(otherlv_13, grammarAccess.getAttributeAccess().getCommaKeyword_13());
            		
            // InternalLightweight.g:1386:3: (otherlv_14= 'verification' otherlv_15= ':' ( (lv_verifmethod_16_0= ruleVerifMethod ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==39) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLightweight.g:1387:4: otherlv_14= 'verification' otherlv_15= ':' ( (lv_verifmethod_16_0= ruleVerifMethod ) )
                    {
                    otherlv_14=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getAttributeAccess().getVerificationKeyword_14_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getAttributeAccess().getColonKeyword_14_1());
                    			
                    // InternalLightweight.g:1395:4: ( (lv_verifmethod_16_0= ruleVerifMethod ) )
                    // InternalLightweight.g:1396:5: (lv_verifmethod_16_0= ruleVerifMethod )
                    {
                    // InternalLightweight.g:1396:5: (lv_verifmethod_16_0= ruleVerifMethod )
                    // InternalLightweight.g:1397:6: lv_verifmethod_16_0= ruleVerifMethod
                    {

                    						newCompositeNode(grammarAccess.getAttributeAccess().getVerifmethodVerifMethodParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_verifmethod_16_0=ruleVerifMethod();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAttributeRule());
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

            			newLeafNode(otherlv_17, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_15());
            		

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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleVerifMethod"
    // InternalLightweight.g:1423:1: entryRuleVerifMethod returns [EObject current=null] : iv_ruleVerifMethod= ruleVerifMethod EOF ;
    public final EObject entryRuleVerifMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerifMethod = null;


        try {
            // InternalLightweight.g:1423:52: (iv_ruleVerifMethod= ruleVerifMethod EOF )
            // InternalLightweight.g:1424:2: iv_ruleVerifMethod= ruleVerifMethod EOF
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
    // InternalLightweight.g:1430:1: ruleVerifMethod returns [EObject current=null] : ( () otherlv_1= '{' otherlv_2= 'validity' otherlv_3= ':' ( (lv_validity_4_0= ruleEBoolean ) ) otherlv_5= ',' otherlv_6= 'uniqueness' otherlv_7= ':' ( (lv_uniqueness_8_0= ruleEBoolean ) ) otherlv_9= ',' otherlv_10= 'bindings' otherlv_11= ':' ( (lv_bindings_12_0= ruleEBoolean ) ) otherlv_13= '}' ) ;
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
            // InternalLightweight.g:1436:2: ( ( () otherlv_1= '{' otherlv_2= 'validity' otherlv_3= ':' ( (lv_validity_4_0= ruleEBoolean ) ) otherlv_5= ',' otherlv_6= 'uniqueness' otherlv_7= ':' ( (lv_uniqueness_8_0= ruleEBoolean ) ) otherlv_9= ',' otherlv_10= 'bindings' otherlv_11= ':' ( (lv_bindings_12_0= ruleEBoolean ) ) otherlv_13= '}' ) )
            // InternalLightweight.g:1437:2: ( () otherlv_1= '{' otherlv_2= 'validity' otherlv_3= ':' ( (lv_validity_4_0= ruleEBoolean ) ) otherlv_5= ',' otherlv_6= 'uniqueness' otherlv_7= ':' ( (lv_uniqueness_8_0= ruleEBoolean ) ) otherlv_9= ',' otherlv_10= 'bindings' otherlv_11= ':' ( (lv_bindings_12_0= ruleEBoolean ) ) otherlv_13= '}' )
            {
            // InternalLightweight.g:1437:2: ( () otherlv_1= '{' otherlv_2= 'validity' otherlv_3= ':' ( (lv_validity_4_0= ruleEBoolean ) ) otherlv_5= ',' otherlv_6= 'uniqueness' otherlv_7= ':' ( (lv_uniqueness_8_0= ruleEBoolean ) ) otherlv_9= ',' otherlv_10= 'bindings' otherlv_11= ':' ( (lv_bindings_12_0= ruleEBoolean ) ) otherlv_13= '}' )
            // InternalLightweight.g:1438:3: () otherlv_1= '{' otherlv_2= 'validity' otherlv_3= ':' ( (lv_validity_4_0= ruleEBoolean ) ) otherlv_5= ',' otherlv_6= 'uniqueness' otherlv_7= ':' ( (lv_uniqueness_8_0= ruleEBoolean ) ) otherlv_9= ',' otherlv_10= 'bindings' otherlv_11= ':' ( (lv_bindings_12_0= ruleEBoolean ) ) otherlv_13= '}'
            {
            // InternalLightweight.g:1438:3: ()
            // InternalLightweight.g:1439:4: 
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
            		
            // InternalLightweight.g:1457:3: ( (lv_validity_4_0= ruleEBoolean ) )
            // InternalLightweight.g:1458:4: (lv_validity_4_0= ruleEBoolean )
            {
            // InternalLightweight.g:1458:4: (lv_validity_4_0= ruleEBoolean )
            // InternalLightweight.g:1459:5: lv_validity_4_0= ruleEBoolean
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
            		
            // InternalLightweight.g:1488:3: ( (lv_uniqueness_8_0= ruleEBoolean ) )
            // InternalLightweight.g:1489:4: (lv_uniqueness_8_0= ruleEBoolean )
            {
            // InternalLightweight.g:1489:4: (lv_uniqueness_8_0= ruleEBoolean )
            // InternalLightweight.g:1490:5: lv_uniqueness_8_0= ruleEBoolean
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
            		
            // InternalLightweight.g:1519:3: ( (lv_bindings_12_0= ruleEBoolean ) )
            // InternalLightweight.g:1520:4: (lv_bindings_12_0= ruleEBoolean )
            {
            // InternalLightweight.g:1520:4: (lv_bindings_12_0= ruleEBoolean )
            // InternalLightweight.g:1521:5: lv_bindings_12_0= ruleEBoolean
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
    // InternalLightweight.g:1546:1: entryRuleRecovery returns [EObject current=null] : iv_ruleRecovery= ruleRecovery EOF ;
    public final EObject entryRuleRecovery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecovery = null;


        try {
            // InternalLightweight.g:1546:49: (iv_ruleRecovery= ruleRecovery EOF )
            // InternalLightweight.g:1547:2: iv_ruleRecovery= ruleRecovery EOF
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
    // InternalLightweight.g:1553:1: ruleRecovery returns [EObject current=null] : ( () ( (lv_type_1_0= 'Recovery' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' (otherlv_12= 'authentication' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )* )? (otherlv_17= 'protocol' otherlv_18= ':' ( (lv_protocol_19_0= ruleProtocol ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleRecovery() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
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
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        Enumerator lv_protocol_19_0 = null;



        	enterRule();

        try {
            // InternalLightweight.g:1559:2: ( ( () ( (lv_type_1_0= 'Recovery' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' (otherlv_12= 'authentication' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )* )? (otherlv_17= 'protocol' otherlv_18= ':' ( (lv_protocol_19_0= ruleProtocol ) ) )? otherlv_20= '}' ) )
            // InternalLightweight.g:1560:2: ( () ( (lv_type_1_0= 'Recovery' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' (otherlv_12= 'authentication' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )* )? (otherlv_17= 'protocol' otherlv_18= ':' ( (lv_protocol_19_0= ruleProtocol ) ) )? otherlv_20= '}' )
            {
            // InternalLightweight.g:1560:2: ( () ( (lv_type_1_0= 'Recovery' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' (otherlv_12= 'authentication' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )* )? (otherlv_17= 'protocol' otherlv_18= ':' ( (lv_protocol_19_0= ruleProtocol ) ) )? otherlv_20= '}' )
            // InternalLightweight.g:1561:3: () ( (lv_type_1_0= 'Recovery' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' (otherlv_12= 'authentication' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )* )? (otherlv_17= 'protocol' otherlv_18= ':' ( (lv_protocol_19_0= ruleProtocol ) ) )? otherlv_20= '}'
            {
            // InternalLightweight.g:1561:3: ()
            // InternalLightweight.g:1562:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRecoveryAccess().getRecoveryAction_0(),
            					current);
            			

            }

            // InternalLightweight.g:1568:3: ( (lv_type_1_0= 'Recovery' ) )
            // InternalLightweight.g:1569:4: (lv_type_1_0= 'Recovery' )
            {
            // InternalLightweight.g:1569:4: (lv_type_1_0= 'Recovery' )
            // InternalLightweight.g:1570:5: lv_type_1_0= 'Recovery'
            {
            lv_type_1_0=(Token)match(input,43,FOLLOW_3); 

            					newLeafNode(lv_type_1_0, grammarAccess.getRecoveryAccess().getTypeRecoveryKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecoveryRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_1_0, "Recovery");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getRecoveryAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getRecoveryAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getRecoveryAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getRecoveryAccess().getColonKeyword_5());
            		
            // InternalLightweight.g:1598:3: ( (lv_name_6_0= ruleEString ) )
            // InternalLightweight.g:1599:4: (lv_name_6_0= ruleEString )
            {
            // InternalLightweight.g:1599:4: (lv_name_6_0= ruleEString )
            // InternalLightweight.g:1600:5: lv_name_6_0= ruleEString
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

            otherlv_7=(Token)match(input,16,FOLLOW_25); 

            			newLeafNode(otherlv_7, grammarAccess.getRecoveryAccess().getCommaKeyword_7());
            		
            otherlv_8=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getRecoveryAccess().getAuthenticatorKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getRecoveryAccess().getColonKeyword_9());
            		
            // InternalLightweight.g:1629:3: ( (otherlv_10= RULE_ID ) )
            // InternalLightweight.g:1630:4: (otherlv_10= RULE_ID )
            {
            // InternalLightweight.g:1630:4: (otherlv_10= RULE_ID )
            // InternalLightweight.g:1631:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRecoveryRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_10, grammarAccess.getRecoveryAccess().getAuthenticatorAuthenticatorCrossReference_10_0());
            				

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_41); 

            			newLeafNode(otherlv_11, grammarAccess.getRecoveryAccess().getCommaKeyword_11());
            		
            // InternalLightweight.g:1646:3: (otherlv_12= 'authentication' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==44) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLightweight.g:1647:4: otherlv_12= 'authentication' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )*
                    {
                    otherlv_12=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getRecoveryAccess().getAuthenticationKeyword_12_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_13, grammarAccess.getRecoveryAccess().getColonKeyword_12_1());
                    			
                    // InternalLightweight.g:1655:4: ( (otherlv_14= RULE_ID ) )
                    // InternalLightweight.g:1656:5: (otherlv_14= RULE_ID )
                    {
                    // InternalLightweight.g:1656:5: (otherlv_14= RULE_ID )
                    // InternalLightweight.g:1657:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRecoveryRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_42); 

                    						newLeafNode(otherlv_14, grammarAccess.getRecoveryAccess().getAuthMethodsAuthMethodCrossReference_12_2_0());
                    					

                    }


                    }

                    // InternalLightweight.g:1668:4: (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==45) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalLightweight.g:1669:5: otherlv_15= '||' ( (otherlv_16= RULE_ID ) )
                    	    {
                    	    otherlv_15=(Token)match(input,45,FOLLOW_18); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getRecoveryAccess().getVerticalLineVerticalLineKeyword_12_3_0());
                    	    				
                    	    // InternalLightweight.g:1673:5: ( (otherlv_16= RULE_ID ) )
                    	    // InternalLightweight.g:1674:6: (otherlv_16= RULE_ID )
                    	    {
                    	    // InternalLightweight.g:1674:6: (otherlv_16= RULE_ID )
                    	    // InternalLightweight.g:1675:7: otherlv_16= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRecoveryRule());
                    	    							}
                    	    						
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_42); 

                    	    							newLeafNode(otherlv_16, grammarAccess.getRecoveryAccess().getAuthMethodsAuthMethodCrossReference_12_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalLightweight.g:1688:3: (otherlv_17= 'protocol' otherlv_18= ':' ( (lv_protocol_19_0= ruleProtocol ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==46) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLightweight.g:1689:4: otherlv_17= 'protocol' otherlv_18= ':' ( (lv_protocol_19_0= ruleProtocol ) )
                    {
                    otherlv_17=(Token)match(input,46,FOLLOW_3); 

                    				newLeafNode(otherlv_17, grammarAccess.getRecoveryAccess().getProtocolKeyword_13_0());
                    			
                    otherlv_18=(Token)match(input,12,FOLLOW_43); 

                    				newLeafNode(otherlv_18, grammarAccess.getRecoveryAccess().getColonKeyword_13_1());
                    			
                    // InternalLightweight.g:1697:4: ( (lv_protocol_19_0= ruleProtocol ) )
                    // InternalLightweight.g:1698:5: (lv_protocol_19_0= ruleProtocol )
                    {
                    // InternalLightweight.g:1698:5: (lv_protocol_19_0= ruleProtocol )
                    // InternalLightweight.g:1699:6: lv_protocol_19_0= ruleProtocol
                    {

                    						newCompositeNode(grammarAccess.getRecoveryAccess().getProtocolProtocolEnumRuleCall_13_2_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_protocol_19_0=ruleProtocol();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRecoveryRule());
                    						}
                    						set(
                    							current,
                    							"protocol",
                    							lv_protocol_19_0,
                    							"org.xtext.example.mydsl1.Lightweight.Protocol");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getRecoveryAccess().getRightCurlyBracketKeyword_14());
            		

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
    // InternalLightweight.g:1725:1: entryRuleLogin returns [EObject current=null] : iv_ruleLogin= ruleLogin EOF ;
    public final EObject entryRuleLogin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogin = null;


        try {
            // InternalLightweight.g:1725:46: (iv_ruleLogin= ruleLogin EOF )
            // InternalLightweight.g:1726:2: iv_ruleLogin= ruleLogin EOF
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
    // InternalLightweight.g:1732:1: ruleLogin returns [EObject current=null] : ( () ( (lv_type_1_0= 'Login' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'persistedSession' otherlv_9= ':' ( (lv_session_10_0= ruleEBoolean ) ) otherlv_11= ',' otherlv_12= 'authentication' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' ) ;
    public final EObject ruleLogin() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
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
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_session_10_0 = null;



        	enterRule();

        try {
            // InternalLightweight.g:1738:2: ( ( () ( (lv_type_1_0= 'Login' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'persistedSession' otherlv_9= ':' ( (lv_session_10_0= ruleEBoolean ) ) otherlv_11= ',' otherlv_12= 'authentication' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' ) )
            // InternalLightweight.g:1739:2: ( () ( (lv_type_1_0= 'Login' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'persistedSession' otherlv_9= ':' ( (lv_session_10_0= ruleEBoolean ) ) otherlv_11= ',' otherlv_12= 'authentication' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' )
            {
            // InternalLightweight.g:1739:2: ( () ( (lv_type_1_0= 'Login' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'persistedSession' otherlv_9= ':' ( (lv_session_10_0= ruleEBoolean ) ) otherlv_11= ',' otherlv_12= 'authentication' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}' )
            // InternalLightweight.g:1740:3: () ( (lv_type_1_0= 'Login' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'persistedSession' otherlv_9= ':' ( (lv_session_10_0= ruleEBoolean ) ) otherlv_11= ',' otherlv_12= 'authentication' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )* otherlv_17= '}'
            {
            // InternalLightweight.g:1740:3: ()
            // InternalLightweight.g:1741:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoginAccess().getLoginAction_0(),
            					current);
            			

            }

            // InternalLightweight.g:1747:3: ( (lv_type_1_0= 'Login' ) )
            // InternalLightweight.g:1748:4: (lv_type_1_0= 'Login' )
            {
            // InternalLightweight.g:1748:4: (lv_type_1_0= 'Login' )
            // InternalLightweight.g:1749:5: lv_type_1_0= 'Login'
            {
            lv_type_1_0=(Token)match(input,47,FOLLOW_3); 

            					newLeafNode(lv_type_1_0, grammarAccess.getLoginAccess().getTypeLoginKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoginRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_1_0, "Login");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getLoginAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getLoginAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getLoginAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getLoginAccess().getColonKeyword_5());
            		
            // InternalLightweight.g:1777:3: ( (lv_name_6_0= ruleEString ) )
            // InternalLightweight.g:1778:4: (lv_name_6_0= ruleEString )
            {
            // InternalLightweight.g:1778:4: (lv_name_6_0= ruleEString )
            // InternalLightweight.g:1779:5: lv_name_6_0= ruleEString
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
            		
            otherlv_8=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getLoginAccess().getPersistedSessionKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_22); 

            			newLeafNode(otherlv_9, grammarAccess.getLoginAccess().getColonKeyword_9());
            		
            // InternalLightweight.g:1808:3: ( (lv_session_10_0= ruleEBoolean ) )
            // InternalLightweight.g:1809:4: (lv_session_10_0= ruleEBoolean )
            {
            // InternalLightweight.g:1809:4: (lv_session_10_0= ruleEBoolean )
            // InternalLightweight.g:1810:5: lv_session_10_0= ruleEBoolean
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
            		
            otherlv_12=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getLoginAccess().getAuthenticationKeyword_12());
            		
            otherlv_13=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_13, grammarAccess.getLoginAccess().getColonKeyword_13());
            		
            // InternalLightweight.g:1839:3: ( (otherlv_14= RULE_ID ) )
            // InternalLightweight.g:1840:4: (otherlv_14= RULE_ID )
            {
            // InternalLightweight.g:1840:4: (otherlv_14= RULE_ID )
            // InternalLightweight.g:1841:5: otherlv_14= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLoginRule());
            					}
            				
            otherlv_14=(Token)match(input,RULE_ID,FOLLOW_46); 

            					newLeafNode(otherlv_14, grammarAccess.getLoginAccess().getAuthMethodsAuthMethodCrossReference_14_0());
            				

            }


            }

            // InternalLightweight.g:1852:3: (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==45) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalLightweight.g:1853:4: otherlv_15= '||' ( (otherlv_16= RULE_ID ) )
            	    {
            	    otherlv_15=(Token)match(input,45,FOLLOW_18); 

            	    				newLeafNode(otherlv_15, grammarAccess.getLoginAccess().getVerticalLineVerticalLineKeyword_15_0());
            	    			
            	    // InternalLightweight.g:1857:4: ( (otherlv_16= RULE_ID ) )
            	    // InternalLightweight.g:1858:5: (otherlv_16= RULE_ID )
            	    {
            	    // InternalLightweight.g:1858:5: (otherlv_16= RULE_ID )
            	    // InternalLightweight.g:1859:6: otherlv_16= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getLoginRule());
            	    						}
            	    					
            	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_46); 

            	    						newLeafNode(otherlv_16, grammarAccess.getLoginAccess().getAuthMethodsAuthMethodCrossReference_15_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_17=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getLoginAccess().getRightCurlyBracketKeyword_16());
            		

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
    // InternalLightweight.g:1879:1: entryRuleReset returns [EObject current=null] : iv_ruleReset= ruleReset EOF ;
    public final EObject entryRuleReset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReset = null;


        try {
            // InternalLightweight.g:1879:46: (iv_ruleReset= ruleReset EOF )
            // InternalLightweight.g:1880:2: iv_ruleReset= ruleReset EOF
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
    // InternalLightweight.g:1886:1: ruleReset returns [EObject current=null] : ( () ( (lv_type_1_0= 'Reset' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' (otherlv_12= 'authentication' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )* )? otherlv_17= '}' ) ;
    public final EObject ruleReset() throws RecognitionException {
        EObject current = null;

        Token lv_type_1_0=null;
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
        AntlrDatatypeRuleToken lv_name_6_0 = null;



        	enterRule();

        try {
            // InternalLightweight.g:1892:2: ( ( () ( (lv_type_1_0= 'Reset' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' (otherlv_12= 'authentication' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )* )? otherlv_17= '}' ) )
            // InternalLightweight.g:1893:2: ( () ( (lv_type_1_0= 'Reset' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' (otherlv_12= 'authentication' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )* )? otherlv_17= '}' )
            {
            // InternalLightweight.g:1893:2: ( () ( (lv_type_1_0= 'Reset' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' (otherlv_12= 'authentication' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )* )? otherlv_17= '}' )
            // InternalLightweight.g:1894:3: () ( (lv_type_1_0= 'Reset' ) ) otherlv_2= ':' otherlv_3= '{' otherlv_4= 'name' otherlv_5= ':' ( (lv_name_6_0= ruleEString ) ) otherlv_7= ',' otherlv_8= 'authenticator' otherlv_9= ':' ( (otherlv_10= RULE_ID ) ) otherlv_11= ',' (otherlv_12= 'authentication' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )* )? otherlv_17= '}'
            {
            // InternalLightweight.g:1894:3: ()
            // InternalLightweight.g:1895:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResetAccess().getResetAction_0(),
            					current);
            			

            }

            // InternalLightweight.g:1901:3: ( (lv_type_1_0= 'Reset' ) )
            // InternalLightweight.g:1902:4: (lv_type_1_0= 'Reset' )
            {
            // InternalLightweight.g:1902:4: (lv_type_1_0= 'Reset' )
            // InternalLightweight.g:1903:5: lv_type_1_0= 'Reset'
            {
            lv_type_1_0=(Token)match(input,49,FOLLOW_3); 

            					newLeafNode(lv_type_1_0, grammarAccess.getResetAccess().getTypeResetKeyword_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResetRule());
            					}
            					setWithLastConsumed(current, "type", lv_type_1_0, "Reset");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getResetAccess().getColonKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getResetAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getResetAccess().getNameKeyword_4());
            		
            otherlv_5=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getResetAccess().getColonKeyword_5());
            		
            // InternalLightweight.g:1931:3: ( (lv_name_6_0= ruleEString ) )
            // InternalLightweight.g:1932:4: (lv_name_6_0= ruleEString )
            {
            // InternalLightweight.g:1932:4: (lv_name_6_0= ruleEString )
            // InternalLightweight.g:1933:5: lv_name_6_0= ruleEString
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

            otherlv_7=(Token)match(input,16,FOLLOW_25); 

            			newLeafNode(otherlv_7, grammarAccess.getResetAccess().getCommaKeyword_7());
            		
            otherlv_8=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getResetAccess().getAuthenticatorKeyword_8());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_18); 

            			newLeafNode(otherlv_9, grammarAccess.getResetAccess().getColonKeyword_9());
            		
            // InternalLightweight.g:1962:3: ( (otherlv_10= RULE_ID ) )
            // InternalLightweight.g:1963:4: (otherlv_10= RULE_ID )
            {
            // InternalLightweight.g:1963:4: (otherlv_10= RULE_ID )
            // InternalLightweight.g:1964:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getResetRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(otherlv_10, grammarAccess.getResetAccess().getAuthenticatorAuthenticatorCrossReference_10_0());
            				

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_47); 

            			newLeafNode(otherlv_11, grammarAccess.getResetAccess().getCommaKeyword_11());
            		
            // InternalLightweight.g:1979:3: (otherlv_12= 'authentication' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==44) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalLightweight.g:1980:4: otherlv_12= 'authentication' otherlv_13= ':' ( (otherlv_14= RULE_ID ) ) (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )*
                    {
                    otherlv_12=(Token)match(input,44,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getResetAccess().getAuthenticationKeyword_12_0());
                    			
                    otherlv_13=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_13, grammarAccess.getResetAccess().getColonKeyword_12_1());
                    			
                    // InternalLightweight.g:1988:4: ( (otherlv_14= RULE_ID ) )
                    // InternalLightweight.g:1989:5: (otherlv_14= RULE_ID )
                    {
                    // InternalLightweight.g:1989:5: (otherlv_14= RULE_ID )
                    // InternalLightweight.g:1990:6: otherlv_14= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResetRule());
                    						}
                    					
                    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_46); 

                    						newLeafNode(otherlv_14, grammarAccess.getResetAccess().getAuthMethodsAuthMethodCrossReference_12_2_0());
                    					

                    }


                    }

                    // InternalLightweight.g:2001:4: (otherlv_15= '||' ( (otherlv_16= RULE_ID ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==45) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalLightweight.g:2002:5: otherlv_15= '||' ( (otherlv_16= RULE_ID ) )
                    	    {
                    	    otherlv_15=(Token)match(input,45,FOLLOW_18); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getResetAccess().getVerticalLineVerticalLineKeyword_12_3_0());
                    	    				
                    	    // InternalLightweight.g:2006:5: ( (otherlv_16= RULE_ID ) )
                    	    // InternalLightweight.g:2007:6: (otherlv_16= RULE_ID )
                    	    {
                    	    // InternalLightweight.g:2007:6: (otherlv_16= RULE_ID )
                    	    // InternalLightweight.g:2008:7: otherlv_16= RULE_ID
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getResetRule());
                    	    							}
                    	    						
                    	    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_46); 

                    	    							newLeafNode(otherlv_16, grammarAccess.getResetAccess().getAuthMethodsAuthMethodCrossReference_12_3_1_0());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_17=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getResetAccess().getRightCurlyBracketKeyword_13());
            		

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
    // InternalLightweight.g:2029:1: entryRuleEBoolean returns [String current=null] : iv_ruleEBoolean= ruleEBoolean EOF ;
    public final String entryRuleEBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEBoolean = null;


        try {
            // InternalLightweight.g:2029:48: (iv_ruleEBoolean= ruleEBoolean EOF )
            // InternalLightweight.g:2030:2: iv_ruleEBoolean= ruleEBoolean EOF
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
    // InternalLightweight.g:2036:1: ruleEBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleEBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLightweight.g:2042:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalLightweight.g:2043:2: (kw= 'true' | kw= 'false' )
            {
            // InternalLightweight.g:2043:2: (kw= 'true' | kw= 'false' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==50) ) {
                alt18=1;
            }
            else if ( (LA18_0==51) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalLightweight.g:2044:3: kw= 'true'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getEBooleanAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalLightweight.g:2050:3: kw= 'false'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

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
    // InternalLightweight.g:2059:1: rulePROVIDER returns [Enumerator current=null] : ( (enumLiteral_0= 'Identity provider' ) | (enumLiteral_1= 'Self provided' ) | (enumLiteral_2= 'Institutional' ) ) ;
    public final Enumerator rulePROVIDER() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLightweight.g:2065:2: ( ( (enumLiteral_0= 'Identity provider' ) | (enumLiteral_1= 'Self provided' ) | (enumLiteral_2= 'Institutional' ) ) )
            // InternalLightweight.g:2066:2: ( (enumLiteral_0= 'Identity provider' ) | (enumLiteral_1= 'Self provided' ) | (enumLiteral_2= 'Institutional' ) )
            {
            // InternalLightweight.g:2066:2: ( (enumLiteral_0= 'Identity provider' ) | (enumLiteral_1= 'Self provided' ) | (enumLiteral_2= 'Institutional' ) )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt19=1;
                }
                break;
            case 53:
                {
                alt19=2;
                }
                break;
            case 54:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalLightweight.g:2067:3: (enumLiteral_0= 'Identity provider' )
                    {
                    // InternalLightweight.g:2067:3: (enumLiteral_0= 'Identity provider' )
                    // InternalLightweight.g:2068:4: enumLiteral_0= 'Identity provider'
                    {
                    enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getPROVIDERAccess().getIdPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPROVIDERAccess().getIdPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:2075:3: (enumLiteral_1= 'Self provided' )
                    {
                    // InternalLightweight.g:2075:3: (enumLiteral_1= 'Self provided' )
                    // InternalLightweight.g:2076:4: enumLiteral_1= 'Self provided'
                    {
                    enumLiteral_1=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getPROVIDERAccess().getSELFEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPROVIDERAccess().getSELFEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLightweight.g:2083:3: (enumLiteral_2= 'Institutional' )
                    {
                    // InternalLightweight.g:2083:3: (enumLiteral_2= 'Institutional' )
                    // InternalLightweight.g:2084:4: enumLiteral_2= 'Institutional'
                    {
                    enumLiteral_2=(Token)match(input,54,FOLLOW_2); 

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
    // InternalLightweight.g:2094:1: ruleCredTYPE returns [Enumerator current=null] : ( (enumLiteral_0= 'Digital' ) | (enumLiteral_1= 'Physical' ) ) ;
    public final Enumerator ruleCredTYPE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLightweight.g:2100:2: ( ( (enumLiteral_0= 'Digital' ) | (enumLiteral_1= 'Physical' ) ) )
            // InternalLightweight.g:2101:2: ( (enumLiteral_0= 'Digital' ) | (enumLiteral_1= 'Physical' ) )
            {
            // InternalLightweight.g:2101:2: ( (enumLiteral_0= 'Digital' ) | (enumLiteral_1= 'Physical' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==55) ) {
                alt20=1;
            }
            else if ( (LA20_0==56) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalLightweight.g:2102:3: (enumLiteral_0= 'Digital' )
                    {
                    // InternalLightweight.g:2102:3: (enumLiteral_0= 'Digital' )
                    // InternalLightweight.g:2103:4: enumLiteral_0= 'Digital'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getCredTYPEAccess().getDIGITALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getCredTYPEAccess().getDIGITALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:2110:3: (enumLiteral_1= 'Physical' )
                    {
                    // InternalLightweight.g:2110:3: (enumLiteral_1= 'Physical' )
                    // InternalLightweight.g:2111:4: enumLiteral_1= 'Physical'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); 

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
    // InternalLightweight.g:2121:1: ruleProtocol returns [Enumerator current=null] : ( (enumLiteral_0= 'Email-Based' ) | (enumLiteral_1= 'MS-based' ) | (enumLiteral_2= 'Local' ) ) ;
    public final Enumerator ruleProtocol() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLightweight.g:2127:2: ( ( (enumLiteral_0= 'Email-Based' ) | (enumLiteral_1= 'MS-based' ) | (enumLiteral_2= 'Local' ) ) )
            // InternalLightweight.g:2128:2: ( (enumLiteral_0= 'Email-Based' ) | (enumLiteral_1= 'MS-based' ) | (enumLiteral_2= 'Local' ) )
            {
            // InternalLightweight.g:2128:2: ( (enumLiteral_0= 'Email-Based' ) | (enumLiteral_1= 'MS-based' ) | (enumLiteral_2= 'Local' ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt21=1;
                }
                break;
            case 58:
                {
                alt21=2;
                }
                break;
            case 59:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalLightweight.g:2129:3: (enumLiteral_0= 'Email-Based' )
                    {
                    // InternalLightweight.g:2129:3: (enumLiteral_0= 'Email-Based' )
                    // InternalLightweight.g:2130:4: enumLiteral_0= 'Email-Based'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getEBIAEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getProtocolAccess().getEBIAEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:2137:3: (enumLiteral_1= 'MS-based' )
                    {
                    // InternalLightweight.g:2137:3: (enumLiteral_1= 'MS-based' )
                    // InternalLightweight.g:2138:4: enumLiteral_1= 'MS-based'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getProtocolAccess().getSMS_BASEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getProtocolAccess().getSMS_BASEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLightweight.g:2145:3: (enumLiteral_2= 'Local' )
                    {
                    // InternalLightweight.g:2145:3: (enumLiteral_2= 'Local' )
                    // InternalLightweight.g:2146:4: enumLiteral_2= 'Local'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

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


    // $ANTLR start "ruleBool2"
    // InternalLightweight.g:2156:1: ruleBool2 returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBool2() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLightweight.g:2162:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalLightweight.g:2163:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalLightweight.g:2163:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==50) ) {
                alt22=1;
            }
            else if ( (LA22_0==51) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalLightweight.g:2164:3: (enumLiteral_0= 'true' )
                    {
                    // InternalLightweight.g:2164:3: (enumLiteral_0= 'true' )
                    // InternalLightweight.g:2165:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getBool2Access().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBool2Access().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:2172:3: (enumLiteral_1= 'false' )
                    {
                    // InternalLightweight.g:2172:3: (enumLiteral_1= 'false' )
                    // InternalLightweight.g:2173:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getBool2Access().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBool2Access().getFALSEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBool2"


    // $ANTLR start "ruleKVALUE"
    // InternalLightweight.g:2183:1: ruleKVALUE returns [Enumerator current=null] : ( (enumLiteral_0= 'High Entropy Text-Based Password' ) | (enumLiteral_1= 'Pass phrase' ) | (enumLiteral_2= 'Knowledge-based Preferences' ) | (enumLiteral_3= 'Low Entropy Text-Based Password' ) | (enumLiteral_4= 'Pin Code' ) ) ;
    public final Enumerator ruleKVALUE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalLightweight.g:2189:2: ( ( (enumLiteral_0= 'High Entropy Text-Based Password' ) | (enumLiteral_1= 'Pass phrase' ) | (enumLiteral_2= 'Knowledge-based Preferences' ) | (enumLiteral_3= 'Low Entropy Text-Based Password' ) | (enumLiteral_4= 'Pin Code' ) ) )
            // InternalLightweight.g:2190:2: ( (enumLiteral_0= 'High Entropy Text-Based Password' ) | (enumLiteral_1= 'Pass phrase' ) | (enumLiteral_2= 'Knowledge-based Preferences' ) | (enumLiteral_3= 'Low Entropy Text-Based Password' ) | (enumLiteral_4= 'Pin Code' ) )
            {
            // InternalLightweight.g:2190:2: ( (enumLiteral_0= 'High Entropy Text-Based Password' ) | (enumLiteral_1= 'Pass phrase' ) | (enumLiteral_2= 'Knowledge-based Preferences' ) | (enumLiteral_3= 'Low Entropy Text-Based Password' ) | (enumLiteral_4= 'Pin Code' ) )
            int alt23=5;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt23=1;
                }
                break;
            case 61:
                {
                alt23=2;
                }
                break;
            case 62:
                {
                alt23=3;
                }
                break;
            case 63:
                {
                alt23=4;
                }
                break;
            case 64:
                {
                alt23=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalLightweight.g:2191:3: (enumLiteral_0= 'High Entropy Text-Based Password' )
                    {
                    // InternalLightweight.g:2191:3: (enumLiteral_0= 'High Entropy Text-Based Password' )
                    // InternalLightweight.g:2192:4: enumLiteral_0= 'High Entropy Text-Based Password'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getKVALUEAccess().getSTBPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getKVALUEAccess().getSTBPEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:2199:3: (enumLiteral_1= 'Pass phrase' )
                    {
                    // InternalLightweight.g:2199:3: (enumLiteral_1= 'Pass phrase' )
                    // InternalLightweight.g:2200:4: enumLiteral_1= 'Pass phrase'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getKVALUEAccess().getPASSPHRASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getKVALUEAccess().getPASSPHRASEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalLightweight.g:2207:3: (enumLiteral_2= 'Knowledge-based Preferences' )
                    {
                    // InternalLightweight.g:2207:3: (enumLiteral_2= 'Knowledge-based Preferences' )
                    // InternalLightweight.g:2208:4: enumLiteral_2= 'Knowledge-based Preferences'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getKVALUEAccess().getPREFERENCESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getKVALUEAccess().getPREFERENCESEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalLightweight.g:2215:3: (enumLiteral_3= 'Low Entropy Text-Based Password' )
                    {
                    // InternalLightweight.g:2215:3: (enumLiteral_3= 'Low Entropy Text-Based Password' )
                    // InternalLightweight.g:2216:4: enumLiteral_3= 'Low Entropy Text-Based Password'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getKVALUEAccess().getLTBPEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getKVALUEAccess().getLTBPEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalLightweight.g:2223:3: (enumLiteral_4= 'Pin Code' )
                    {
                    // InternalLightweight.g:2223:3: (enumLiteral_4= 'Pin Code' )
                    // InternalLightweight.g:2224:4: enumLiteral_4= 'Pin Code'
                    {
                    enumLiteral_4=(Token)match(input,64,FOLLOW_2); 

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
    // InternalLightweight.g:2234:1: ruleBVALUE returns [Enumerator current=null] : ( (enumLiteral_0= 'Fingerprint Recognition' ) | (enumLiteral_1= 'Facial Recognition' ) ) ;
    public final Enumerator ruleBVALUE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLightweight.g:2240:2: ( ( (enumLiteral_0= 'Fingerprint Recognition' ) | (enumLiteral_1= 'Facial Recognition' ) ) )
            // InternalLightweight.g:2241:2: ( (enumLiteral_0= 'Fingerprint Recognition' ) | (enumLiteral_1= 'Facial Recognition' ) )
            {
            // InternalLightweight.g:2241:2: ( (enumLiteral_0= 'Fingerprint Recognition' ) | (enumLiteral_1= 'Facial Recognition' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==65) ) {
                alt24=1;
            }
            else if ( (LA24_0==66) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalLightweight.g:2242:3: (enumLiteral_0= 'Fingerprint Recognition' )
                    {
                    // InternalLightweight.g:2242:3: (enumLiteral_0= 'Fingerprint Recognition' )
                    // InternalLightweight.g:2243:4: enumLiteral_0= 'Fingerprint Recognition'
                    {
                    enumLiteral_0=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getBVALUEAccess().getFINGERPRINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBVALUEAccess().getFINGERPRINTEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:2250:3: (enumLiteral_1= 'Facial Recognition' )
                    {
                    // InternalLightweight.g:2250:3: (enumLiteral_1= 'Facial Recognition' )
                    // InternalLightweight.g:2251:4: enumLiteral_1= 'Facial Recognition'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); 

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
    // InternalLightweight.g:2261:1: rulePVALUE returns [Enumerator current=null] : ( (enumLiteral_0= 'Hard Drive Token' ) | (enumLiteral_1= 'Physical device' ) ) ;
    public final Enumerator rulePVALUE() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLightweight.g:2267:2: ( ( (enumLiteral_0= 'Hard Drive Token' ) | (enumLiteral_1= 'Physical device' ) ) )
            // InternalLightweight.g:2268:2: ( (enumLiteral_0= 'Hard Drive Token' ) | (enumLiteral_1= 'Physical device' ) )
            {
            // InternalLightweight.g:2268:2: ( (enumLiteral_0= 'Hard Drive Token' ) | (enumLiteral_1= 'Physical device' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==67) ) {
                alt25=1;
            }
            else if ( (LA25_0==68) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalLightweight.g:2269:3: (enumLiteral_0= 'Hard Drive Token' )
                    {
                    // InternalLightweight.g:2269:3: (enumLiteral_0= 'Hard Drive Token' )
                    // InternalLightweight.g:2270:4: enumLiteral_0= 'Hard Drive Token'
                    {
                    enumLiteral_0=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getPVALUEAccess().getTOKENEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPVALUEAccess().getTOKENEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:2277:3: (enumLiteral_1= 'Physical device' )
                    {
                    // InternalLightweight.g:2277:3: (enumLiteral_1= 'Physical device' )
                    // InternalLightweight.g:2278:4: enumLiteral_1= 'Physical device'
                    {
                    enumLiteral_1=(Token)match(input,68,FOLLOW_2); 

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
    // InternalLightweight.g:2288:1: ruleValidationType returns [Enumerator current=null] : ( (enumLiteral_0= 'local validation' ) | (enumLiteral_1= 'Remote validation' ) ) ;
    public final Enumerator ruleValidationType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLightweight.g:2294:2: ( ( (enumLiteral_0= 'local validation' ) | (enumLiteral_1= 'Remote validation' ) ) )
            // InternalLightweight.g:2295:2: ( (enumLiteral_0= 'local validation' ) | (enumLiteral_1= 'Remote validation' ) )
            {
            // InternalLightweight.g:2295:2: ( (enumLiteral_0= 'local validation' ) | (enumLiteral_1= 'Remote validation' ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==69) ) {
                alt26=1;
            }
            else if ( (LA26_0==70) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalLightweight.g:2296:3: (enumLiteral_0= 'local validation' )
                    {
                    // InternalLightweight.g:2296:3: (enumLiteral_0= 'local validation' )
                    // InternalLightweight.g:2297:4: enumLiteral_0= 'local validation'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); 

                    				current = grammarAccess.getValidationTypeAccess().getLOCALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getValidationTypeAccess().getLOCALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLightweight.g:2304:3: (enumLiteral_1= 'Remote validation' )
                    {
                    // InternalLightweight.g:2304:3: (enumLiteral_1= 'Remote validation' )
                    // InternalLightweight.g:2305:4: enumLiteral_1= 'Remote validation'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); 

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
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0002880800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002010010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xF000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0070000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0180000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000100000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000500000100000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000600000100000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0E00000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000200000100000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000100000100000L});

}
package ups.m2dl.tpnote.parser.antlr.internal;

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
import ups.m2dl.tpnote.services.MaisonDeDisqueGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMaisonDeDisqueParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MaisonDeDisque'", "'{'", "'chansons'", "','", "'}'", "'albums'", "'personnes'", "'Chanson'", "'auteurs'", "'('", "')'", "'chanteurs'", "'Album'", "'anneeSortie'", "'type'", "'Personne'", "'SINGLE'", "'COMPILATION'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMaisonDeDisqueParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMaisonDeDisqueParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMaisonDeDisqueParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMaisonDeDisque.g"; }



     	private MaisonDeDisqueGrammarAccess grammarAccess;

        public InternalMaisonDeDisqueParser(TokenStream input, MaisonDeDisqueGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MaisonDeDisque";
       	}

       	@Override
       	protected MaisonDeDisqueGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMaisonDeDisque"
    // InternalMaisonDeDisque.g:65:1: entryRuleMaisonDeDisque returns [EObject current=null] : iv_ruleMaisonDeDisque= ruleMaisonDeDisque EOF ;
    public final EObject entryRuleMaisonDeDisque() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaisonDeDisque = null;


        try {
            // InternalMaisonDeDisque.g:65:55: (iv_ruleMaisonDeDisque= ruleMaisonDeDisque EOF )
            // InternalMaisonDeDisque.g:66:2: iv_ruleMaisonDeDisque= ruleMaisonDeDisque EOF
            {
             newCompositeNode(grammarAccess.getMaisonDeDisqueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaisonDeDisque=ruleMaisonDeDisque();

            state._fsp--;

             current =iv_ruleMaisonDeDisque; 
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
    // $ANTLR end "entryRuleMaisonDeDisque"


    // $ANTLR start "ruleMaisonDeDisque"
    // InternalMaisonDeDisque.g:72:1: ruleMaisonDeDisque returns [EObject current=null] : (otherlv_0= 'MaisonDeDisque' otherlv_1= '{' otherlv_2= 'chansons' otherlv_3= '{' ( (lv_chansons_4_0= ruleChanson ) ) (otherlv_5= ',' ( (lv_chansons_6_0= ruleChanson ) ) )* otherlv_7= '}' otherlv_8= 'albums' otherlv_9= '{' ( (lv_albums_10_0= ruleAlbum ) ) (otherlv_11= ',' ( (lv_albums_12_0= ruleAlbum ) ) )* otherlv_13= '}' otherlv_14= 'personnes' otherlv_15= '{' ( (lv_personnes_16_0= rulePersonne ) ) (otherlv_17= ',' ( (lv_personnes_18_0= rulePersonne ) ) )* otherlv_19= '}' otherlv_20= '}' ) ;
    public final EObject ruleMaisonDeDisque() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_chansons_4_0 = null;

        EObject lv_chansons_6_0 = null;

        EObject lv_albums_10_0 = null;

        EObject lv_albums_12_0 = null;

        EObject lv_personnes_16_0 = null;

        EObject lv_personnes_18_0 = null;



        	enterRule();

        try {
            // InternalMaisonDeDisque.g:78:2: ( (otherlv_0= 'MaisonDeDisque' otherlv_1= '{' otherlv_2= 'chansons' otherlv_3= '{' ( (lv_chansons_4_0= ruleChanson ) ) (otherlv_5= ',' ( (lv_chansons_6_0= ruleChanson ) ) )* otherlv_7= '}' otherlv_8= 'albums' otherlv_9= '{' ( (lv_albums_10_0= ruleAlbum ) ) (otherlv_11= ',' ( (lv_albums_12_0= ruleAlbum ) ) )* otherlv_13= '}' otherlv_14= 'personnes' otherlv_15= '{' ( (lv_personnes_16_0= rulePersonne ) ) (otherlv_17= ',' ( (lv_personnes_18_0= rulePersonne ) ) )* otherlv_19= '}' otherlv_20= '}' ) )
            // InternalMaisonDeDisque.g:79:2: (otherlv_0= 'MaisonDeDisque' otherlv_1= '{' otherlv_2= 'chansons' otherlv_3= '{' ( (lv_chansons_4_0= ruleChanson ) ) (otherlv_5= ',' ( (lv_chansons_6_0= ruleChanson ) ) )* otherlv_7= '}' otherlv_8= 'albums' otherlv_9= '{' ( (lv_albums_10_0= ruleAlbum ) ) (otherlv_11= ',' ( (lv_albums_12_0= ruleAlbum ) ) )* otherlv_13= '}' otherlv_14= 'personnes' otherlv_15= '{' ( (lv_personnes_16_0= rulePersonne ) ) (otherlv_17= ',' ( (lv_personnes_18_0= rulePersonne ) ) )* otherlv_19= '}' otherlv_20= '}' )
            {
            // InternalMaisonDeDisque.g:79:2: (otherlv_0= 'MaisonDeDisque' otherlv_1= '{' otherlv_2= 'chansons' otherlv_3= '{' ( (lv_chansons_4_0= ruleChanson ) ) (otherlv_5= ',' ( (lv_chansons_6_0= ruleChanson ) ) )* otherlv_7= '}' otherlv_8= 'albums' otherlv_9= '{' ( (lv_albums_10_0= ruleAlbum ) ) (otherlv_11= ',' ( (lv_albums_12_0= ruleAlbum ) ) )* otherlv_13= '}' otherlv_14= 'personnes' otherlv_15= '{' ( (lv_personnes_16_0= rulePersonne ) ) (otherlv_17= ',' ( (lv_personnes_18_0= rulePersonne ) ) )* otherlv_19= '}' otherlv_20= '}' )
            // InternalMaisonDeDisque.g:80:3: otherlv_0= 'MaisonDeDisque' otherlv_1= '{' otherlv_2= 'chansons' otherlv_3= '{' ( (lv_chansons_4_0= ruleChanson ) ) (otherlv_5= ',' ( (lv_chansons_6_0= ruleChanson ) ) )* otherlv_7= '}' otherlv_8= 'albums' otherlv_9= '{' ( (lv_albums_10_0= ruleAlbum ) ) (otherlv_11= ',' ( (lv_albums_12_0= ruleAlbum ) ) )* otherlv_13= '}' otherlv_14= 'personnes' otherlv_15= '{' ( (lv_personnes_16_0= rulePersonne ) ) (otherlv_17= ',' ( (lv_personnes_18_0= rulePersonne ) ) )* otherlv_19= '}' otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMaisonDeDisqueAccess().getMaisonDeDisqueKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMaisonDeDisqueAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMaisonDeDisqueAccess().getChansonsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getMaisonDeDisqueAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMaisonDeDisque.g:96:3: ( (lv_chansons_4_0= ruleChanson ) )
            // InternalMaisonDeDisque.g:97:4: (lv_chansons_4_0= ruleChanson )
            {
            // InternalMaisonDeDisque.g:97:4: (lv_chansons_4_0= ruleChanson )
            // InternalMaisonDeDisque.g:98:5: lv_chansons_4_0= ruleChanson
            {

            					newCompositeNode(grammarAccess.getMaisonDeDisqueAccess().getChansonsChansonParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_chansons_4_0=ruleChanson();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaisonDeDisqueRule());
            					}
            					add(
            						current,
            						"chansons",
            						lv_chansons_4_0,
            						"ups.m2dl.tpnote.MaisonDeDisque.Chanson");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMaisonDeDisque.g:115:3: (otherlv_5= ',' ( (lv_chansons_6_0= ruleChanson ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMaisonDeDisque.g:116:4: otherlv_5= ',' ( (lv_chansons_6_0= ruleChanson ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getMaisonDeDisqueAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMaisonDeDisque.g:120:4: ( (lv_chansons_6_0= ruleChanson ) )
            	    // InternalMaisonDeDisque.g:121:5: (lv_chansons_6_0= ruleChanson )
            	    {
            	    // InternalMaisonDeDisque.g:121:5: (lv_chansons_6_0= ruleChanson )
            	    // InternalMaisonDeDisque.g:122:6: lv_chansons_6_0= ruleChanson
            	    {

            	    						newCompositeNode(grammarAccess.getMaisonDeDisqueAccess().getChansonsChansonParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_chansons_6_0=ruleChanson();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMaisonDeDisqueRule());
            	    						}
            	    						add(
            	    							current,
            	    							"chansons",
            	    							lv_chansons_6_0,
            	    							"ups.m2dl.tpnote.MaisonDeDisque.Chanson");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getMaisonDeDisqueAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getMaisonDeDisqueAccess().getAlbumsKeyword_7());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getMaisonDeDisqueAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMaisonDeDisque.g:152:3: ( (lv_albums_10_0= ruleAlbum ) )
            // InternalMaisonDeDisque.g:153:4: (lv_albums_10_0= ruleAlbum )
            {
            // InternalMaisonDeDisque.g:153:4: (lv_albums_10_0= ruleAlbum )
            // InternalMaisonDeDisque.g:154:5: lv_albums_10_0= ruleAlbum
            {

            					newCompositeNode(grammarAccess.getMaisonDeDisqueAccess().getAlbumsAlbumParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_6);
            lv_albums_10_0=ruleAlbum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaisonDeDisqueRule());
            					}
            					add(
            						current,
            						"albums",
            						lv_albums_10_0,
            						"ups.m2dl.tpnote.MaisonDeDisque.Album");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMaisonDeDisque.g:171:3: (otherlv_11= ',' ( (lv_albums_12_0= ruleAlbum ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMaisonDeDisque.g:172:4: otherlv_11= ',' ( (lv_albums_12_0= ruleAlbum ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FOLLOW_8); 

            	    				newLeafNode(otherlv_11, grammarAccess.getMaisonDeDisqueAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalMaisonDeDisque.g:176:4: ( (lv_albums_12_0= ruleAlbum ) )
            	    // InternalMaisonDeDisque.g:177:5: (lv_albums_12_0= ruleAlbum )
            	    {
            	    // InternalMaisonDeDisque.g:177:5: (lv_albums_12_0= ruleAlbum )
            	    // InternalMaisonDeDisque.g:178:6: lv_albums_12_0= ruleAlbum
            	    {

            	    						newCompositeNode(grammarAccess.getMaisonDeDisqueAccess().getAlbumsAlbumParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_albums_12_0=ruleAlbum();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMaisonDeDisqueRule());
            	    						}
            	    						add(
            	    							current,
            	    							"albums",
            	    							lv_albums_12_0,
            	    							"ups.m2dl.tpnote.MaisonDeDisque.Album");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_13, grammarAccess.getMaisonDeDisqueAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_14=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getMaisonDeDisqueAccess().getPersonnesKeyword_12());
            		
            otherlv_15=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_15, grammarAccess.getMaisonDeDisqueAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalMaisonDeDisque.g:208:3: ( (lv_personnes_16_0= rulePersonne ) )
            // InternalMaisonDeDisque.g:209:4: (lv_personnes_16_0= rulePersonne )
            {
            // InternalMaisonDeDisque.g:209:4: (lv_personnes_16_0= rulePersonne )
            // InternalMaisonDeDisque.g:210:5: lv_personnes_16_0= rulePersonne
            {

            					newCompositeNode(grammarAccess.getMaisonDeDisqueAccess().getPersonnesPersonneParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_6);
            lv_personnes_16_0=rulePersonne();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaisonDeDisqueRule());
            					}
            					add(
            						current,
            						"personnes",
            						lv_personnes_16_0,
            						"ups.m2dl.tpnote.MaisonDeDisque.Personne");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMaisonDeDisque.g:227:3: (otherlv_17= ',' ( (lv_personnes_18_0= rulePersonne ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMaisonDeDisque.g:228:4: otherlv_17= ',' ( (lv_personnes_18_0= rulePersonne ) )
            	    {
            	    otherlv_17=(Token)match(input,14,FOLLOW_10); 

            	    				newLeafNode(otherlv_17, grammarAccess.getMaisonDeDisqueAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalMaisonDeDisque.g:232:4: ( (lv_personnes_18_0= rulePersonne ) )
            	    // InternalMaisonDeDisque.g:233:5: (lv_personnes_18_0= rulePersonne )
            	    {
            	    // InternalMaisonDeDisque.g:233:5: (lv_personnes_18_0= rulePersonne )
            	    // InternalMaisonDeDisque.g:234:6: lv_personnes_18_0= rulePersonne
            	    {

            	    						newCompositeNode(grammarAccess.getMaisonDeDisqueAccess().getPersonnesPersonneParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_personnes_18_0=rulePersonne();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMaisonDeDisqueRule());
            	    						}
            	    						add(
            	    							current,
            	    							"personnes",
            	    							lv_personnes_18_0,
            	    							"ups.m2dl.tpnote.MaisonDeDisque.Personne");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_19=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_19, grammarAccess.getMaisonDeDisqueAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_20=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getMaisonDeDisqueAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleMaisonDeDisque"


    // $ANTLR start "entryRuleChanson"
    // InternalMaisonDeDisque.g:264:1: entryRuleChanson returns [EObject current=null] : iv_ruleChanson= ruleChanson EOF ;
    public final EObject entryRuleChanson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChanson = null;


        try {
            // InternalMaisonDeDisque.g:264:48: (iv_ruleChanson= ruleChanson EOF )
            // InternalMaisonDeDisque.g:265:2: iv_ruleChanson= ruleChanson EOF
            {
             newCompositeNode(grammarAccess.getChansonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChanson=ruleChanson();

            state._fsp--;

             current =iv_ruleChanson; 
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
    // $ANTLR end "entryRuleChanson"


    // $ANTLR start "ruleChanson"
    // InternalMaisonDeDisque.g:271:1: ruleChanson returns [EObject current=null] : (otherlv_0= 'Chanson' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'auteurs' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'chanteurs' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}' ) ;
    public final EObject ruleChanson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalMaisonDeDisque.g:277:2: ( (otherlv_0= 'Chanson' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'auteurs' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'chanteurs' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}' ) )
            // InternalMaisonDeDisque.g:278:2: (otherlv_0= 'Chanson' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'auteurs' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'chanteurs' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}' )
            {
            // InternalMaisonDeDisque.g:278:2: (otherlv_0= 'Chanson' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'auteurs' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'chanteurs' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}' )
            // InternalMaisonDeDisque.g:279:3: otherlv_0= 'Chanson' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'auteurs' otherlv_4= '(' ( ( ruleEString ) ) (otherlv_6= ',' ( ( ruleEString ) ) )* otherlv_8= ')' otherlv_9= 'chanteurs' otherlv_10= '(' ( ( ruleEString ) ) (otherlv_12= ',' ( ( ruleEString ) ) )* otherlv_14= ')' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getChansonAccess().getChansonKeyword_0());
            		
            // InternalMaisonDeDisque.g:283:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMaisonDeDisque.g:284:4: (lv_name_1_0= ruleEString )
            {
            // InternalMaisonDeDisque.g:284:4: (lv_name_1_0= ruleEString )
            // InternalMaisonDeDisque.g:285:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getChansonAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getChansonRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ups.m2dl.tpnote.MaisonDeDisque.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getChansonAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getChansonAccess().getAuteursKeyword_3());
            		
            otherlv_4=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_4, grammarAccess.getChansonAccess().getLeftParenthesisKeyword_4());
            		
            // InternalMaisonDeDisque.g:314:3: ( ( ruleEString ) )
            // InternalMaisonDeDisque.g:315:4: ( ruleEString )
            {
            // InternalMaisonDeDisque.g:315:4: ( ruleEString )
            // InternalMaisonDeDisque.g:316:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChansonRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChansonAccess().getAuteursPersonneCrossReference_5_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMaisonDeDisque.g:330:3: (otherlv_6= ',' ( ( ruleEString ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMaisonDeDisque.g:331:4: otherlv_6= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_6=(Token)match(input,14,FOLLOW_12); 

            	    				newLeafNode(otherlv_6, grammarAccess.getChansonAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalMaisonDeDisque.g:335:4: ( ( ruleEString ) )
            	    // InternalMaisonDeDisque.g:336:5: ( ruleEString )
            	    {
            	    // InternalMaisonDeDisque.g:336:5: ( ruleEString )
            	    // InternalMaisonDeDisque.g:337:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getChansonRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getChansonAccess().getAuteursPersonneCrossReference_6_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,21,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getChansonAccess().getRightParenthesisKeyword_7());
            		
            otherlv_9=(Token)match(input,22,FOLLOW_14); 

            			newLeafNode(otherlv_9, grammarAccess.getChansonAccess().getChanteursKeyword_8());
            		
            otherlv_10=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_10, grammarAccess.getChansonAccess().getLeftParenthesisKeyword_9());
            		
            // InternalMaisonDeDisque.g:364:3: ( ( ruleEString ) )
            // InternalMaisonDeDisque.g:365:4: ( ruleEString )
            {
            // InternalMaisonDeDisque.g:365:4: ( ruleEString )
            // InternalMaisonDeDisque.g:366:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChansonRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChansonAccess().getChanteursPersonneCrossReference_10_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMaisonDeDisque.g:380:3: (otherlv_12= ',' ( ( ruleEString ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMaisonDeDisque.g:381:4: otherlv_12= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_12=(Token)match(input,14,FOLLOW_12); 

            	    				newLeafNode(otherlv_12, grammarAccess.getChansonAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalMaisonDeDisque.g:385:4: ( ( ruleEString ) )
            	    // InternalMaisonDeDisque.g:386:5: ( ruleEString )
            	    {
            	    // InternalMaisonDeDisque.g:386:5: ( ruleEString )
            	    // InternalMaisonDeDisque.g:387:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getChansonRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getChansonAccess().getChanteursPersonneCrossReference_11_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_14=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_14, grammarAccess.getChansonAccess().getRightParenthesisKeyword_12());
            		
            otherlv_15=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getChansonAccess().getRightCurlyBracketKeyword_13());
            		

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
    // $ANTLR end "ruleChanson"


    // $ANTLR start "entryRuleAlbum"
    // InternalMaisonDeDisque.g:414:1: entryRuleAlbum returns [EObject current=null] : iv_ruleAlbum= ruleAlbum EOF ;
    public final EObject entryRuleAlbum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlbum = null;


        try {
            // InternalMaisonDeDisque.g:414:46: (iv_ruleAlbum= ruleAlbum EOF )
            // InternalMaisonDeDisque.g:415:2: iv_ruleAlbum= ruleAlbum EOF
            {
             newCompositeNode(grammarAccess.getAlbumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlbum=ruleAlbum();

            state._fsp--;

             current =iv_ruleAlbum; 
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
    // $ANTLR end "entryRuleAlbum"


    // $ANTLR start "ruleAlbum"
    // InternalMaisonDeDisque.g:421:1: ruleAlbum returns [EObject current=null] : (otherlv_0= 'Album' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'anneeSortie' ( (lv_anneeSortie_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleAlbumType ) ) )? otherlv_7= 'chansons' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}' ) ;
    public final EObject ruleAlbum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_anneeSortie_4_0 = null;

        Enumerator lv_type_6_0 = null;



        	enterRule();

        try {
            // InternalMaisonDeDisque.g:427:2: ( (otherlv_0= 'Album' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'anneeSortie' ( (lv_anneeSortie_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleAlbumType ) ) )? otherlv_7= 'chansons' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}' ) )
            // InternalMaisonDeDisque.g:428:2: (otherlv_0= 'Album' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'anneeSortie' ( (lv_anneeSortie_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleAlbumType ) ) )? otherlv_7= 'chansons' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}' )
            {
            // InternalMaisonDeDisque.g:428:2: (otherlv_0= 'Album' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'anneeSortie' ( (lv_anneeSortie_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleAlbumType ) ) )? otherlv_7= 'chansons' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}' )
            // InternalMaisonDeDisque.g:429:3: otherlv_0= 'Album' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'anneeSortie' ( (lv_anneeSortie_4_0= ruleEString ) ) )? (otherlv_5= 'type' ( (lv_type_6_0= ruleAlbumType ) ) )? otherlv_7= 'chansons' otherlv_8= '(' ( ( ruleEString ) ) (otherlv_10= ',' ( ( ruleEString ) ) )* otherlv_12= ')' otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getAlbumAccess().getAlbumKeyword_0());
            		
            // InternalMaisonDeDisque.g:433:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMaisonDeDisque.g:434:4: (lv_name_1_0= ruleEString )
            {
            // InternalMaisonDeDisque.g:434:4: (lv_name_1_0= ruleEString )
            // InternalMaisonDeDisque.g:435:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAlbumAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlbumRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"ups.m2dl.tpnote.MaisonDeDisque.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getAlbumAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMaisonDeDisque.g:456:3: (otherlv_3= 'anneeSortie' ( (lv_anneeSortie_4_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMaisonDeDisque.g:457:4: otherlv_3= 'anneeSortie' ( (lv_anneeSortie_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getAlbumAccess().getAnneeSortieKeyword_3_0());
                    			
                    // InternalMaisonDeDisque.g:461:4: ( (lv_anneeSortie_4_0= ruleEString ) )
                    // InternalMaisonDeDisque.g:462:5: (lv_anneeSortie_4_0= ruleEString )
                    {
                    // InternalMaisonDeDisque.g:462:5: (lv_anneeSortie_4_0= ruleEString )
                    // InternalMaisonDeDisque.g:463:6: lv_anneeSortie_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAlbumAccess().getAnneeSortieEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_anneeSortie_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlbumRule());
                    						}
                    						set(
                    							current,
                    							"anneeSortie",
                    							lv_anneeSortie_4_0,
                    							"ups.m2dl.tpnote.MaisonDeDisque.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMaisonDeDisque.g:481:3: (otherlv_5= 'type' ( (lv_type_6_0= ruleAlbumType ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMaisonDeDisque.g:482:4: otherlv_5= 'type' ( (lv_type_6_0= ruleAlbumType ) )
                    {
                    otherlv_5=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getAlbumAccess().getTypeKeyword_4_0());
                    			
                    // InternalMaisonDeDisque.g:486:4: ( (lv_type_6_0= ruleAlbumType ) )
                    // InternalMaisonDeDisque.g:487:5: (lv_type_6_0= ruleAlbumType )
                    {
                    // InternalMaisonDeDisque.g:487:5: (lv_type_6_0= ruleAlbumType )
                    // InternalMaisonDeDisque.g:488:6: lv_type_6_0= ruleAlbumType
                    {

                    						newCompositeNode(grammarAccess.getAlbumAccess().getTypeAlbumTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_4);
                    lv_type_6_0=ruleAlbumType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlbumRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"ups.m2dl.tpnote.MaisonDeDisque.AlbumType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getAlbumAccess().getChansonsKeyword_5());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_8, grammarAccess.getAlbumAccess().getLeftParenthesisKeyword_6());
            		
            // InternalMaisonDeDisque.g:514:3: ( ( ruleEString ) )
            // InternalMaisonDeDisque.g:515:4: ( ruleEString )
            {
            // InternalMaisonDeDisque.g:515:4: ( ruleEString )
            // InternalMaisonDeDisque.g:516:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlbumRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAlbumAccess().getChansonsChansonCrossReference_7_0());
            				
            pushFollow(FOLLOW_15);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMaisonDeDisque.g:530:3: (otherlv_10= ',' ( ( ruleEString ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMaisonDeDisque.g:531:4: otherlv_10= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_10=(Token)match(input,14,FOLLOW_12); 

            	    				newLeafNode(otherlv_10, grammarAccess.getAlbumAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalMaisonDeDisque.g:535:4: ( ( ruleEString ) )
            	    // InternalMaisonDeDisque.g:536:5: ( ruleEString )
            	    {
            	    // InternalMaisonDeDisque.g:536:5: ( ruleEString )
            	    // InternalMaisonDeDisque.g:537:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAlbumRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getAlbumAccess().getChansonsChansonCrossReference_8_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_12=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_12, grammarAccess.getAlbumAccess().getRightParenthesisKeyword_9());
            		
            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getAlbumAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleAlbum"


    // $ANTLR start "entryRulePersonne"
    // InternalMaisonDeDisque.g:564:1: entryRulePersonne returns [EObject current=null] : iv_rulePersonne= rulePersonne EOF ;
    public final EObject entryRulePersonne() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonne = null;


        try {
            // InternalMaisonDeDisque.g:564:49: (iv_rulePersonne= rulePersonne EOF )
            // InternalMaisonDeDisque.g:565:2: iv_rulePersonne= rulePersonne EOF
            {
             newCompositeNode(grammarAccess.getPersonneRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePersonne=rulePersonne();

            state._fsp--;

             current =iv_rulePersonne; 
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
    // $ANTLR end "entryRulePersonne"


    // $ANTLR start "rulePersonne"
    // InternalMaisonDeDisque.g:571:1: rulePersonne returns [EObject current=null] : ( () otherlv_1= 'Personne' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePersonne() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMaisonDeDisque.g:577:2: ( ( () otherlv_1= 'Personne' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMaisonDeDisque.g:578:2: ( () otherlv_1= 'Personne' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMaisonDeDisque.g:578:2: ( () otherlv_1= 'Personne' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMaisonDeDisque.g:579:3: () otherlv_1= 'Personne' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMaisonDeDisque.g:579:3: ()
            // InternalMaisonDeDisque.g:580:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonneAccess().getPersonneAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonneAccess().getPersonneKeyword_1());
            		
            // InternalMaisonDeDisque.g:590:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMaisonDeDisque.g:591:4: (lv_name_2_0= ruleEString )
            {
            // InternalMaisonDeDisque.g:591:4: (lv_name_2_0= ruleEString )
            // InternalMaisonDeDisque.g:592:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPersonneAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPersonneRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"ups.m2dl.tpnote.MaisonDeDisque.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "rulePersonne"


    // $ANTLR start "entryRuleEString"
    // InternalMaisonDeDisque.g:613:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMaisonDeDisque.g:613:47: (iv_ruleEString= ruleEString EOF )
            // InternalMaisonDeDisque.g:614:2: iv_ruleEString= ruleEString EOF
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
    // InternalMaisonDeDisque.g:620:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMaisonDeDisque.g:626:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMaisonDeDisque.g:627:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMaisonDeDisque.g:627:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalMaisonDeDisque.g:628:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMaisonDeDisque.g:636:3: this_ID_1= RULE_ID
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


    // $ANTLR start "ruleAlbumType"
    // InternalMaisonDeDisque.g:647:1: ruleAlbumType returns [Enumerator current=null] : ( (enumLiteral_0= 'SINGLE' ) | (enumLiteral_1= 'COMPILATION' ) ) ;
    public final Enumerator ruleAlbumType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMaisonDeDisque.g:653:2: ( ( (enumLiteral_0= 'SINGLE' ) | (enumLiteral_1= 'COMPILATION' ) ) )
            // InternalMaisonDeDisque.g:654:2: ( (enumLiteral_0= 'SINGLE' ) | (enumLiteral_1= 'COMPILATION' ) )
            {
            // InternalMaisonDeDisque.g:654:2: ( (enumLiteral_0= 'SINGLE' ) | (enumLiteral_1= 'COMPILATION' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            else if ( (LA10_0==28) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMaisonDeDisque.g:655:3: (enumLiteral_0= 'SINGLE' )
                    {
                    // InternalMaisonDeDisque.g:655:3: (enumLiteral_0= 'SINGLE' )
                    // InternalMaisonDeDisque.g:656:4: enumLiteral_0= 'SINGLE'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getAlbumTypeAccess().getSINGLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAlbumTypeAccess().getSINGLEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMaisonDeDisque.g:663:3: (enumLiteral_1= 'COMPILATION' )
                    {
                    // InternalMaisonDeDisque.g:663:3: (enumLiteral_1= 'COMPILATION' )
                    // InternalMaisonDeDisque.g:664:4: enumLiteral_1= 'COMPILATION'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getAlbumTypeAccess().getCOMPILATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAlbumTypeAccess().getCOMPILATIONEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleAlbumType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000003002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000018000000L});

}
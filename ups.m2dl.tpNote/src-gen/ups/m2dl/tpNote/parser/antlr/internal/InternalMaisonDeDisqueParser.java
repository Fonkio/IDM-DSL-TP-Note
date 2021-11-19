package ups.m2dl.tpNote.parser.antlr.internal;

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
import ups.m2dl.tpNote.services.MaisonDeDisqueGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMaisonDeDisqueParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'MaisonDeDisques'", "'{'", "'albums'", "','", "'}'", "'chansons'", "'personnes'", "'Album'", "'anneeSortie'", "'type'", "'nom'", "'id'", "'('", "')'", "'Chanson'", "'titre'", "'chanteurs'", "'auteur'", "'Personne'", "'chansonsChanteur'", "'chansonsAuteur'", "'EDate'", "'SINGLE'", "'COMPILATION'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
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
        	return "MaisonDeDisques";
       	}

       	@Override
       	protected MaisonDeDisqueGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMaisonDeDisques"
    // InternalMaisonDeDisque.g:65:1: entryRuleMaisonDeDisques returns [EObject current=null] : iv_ruleMaisonDeDisques= ruleMaisonDeDisques EOF ;
    public final EObject entryRuleMaisonDeDisques() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaisonDeDisques = null;


        try {
            // InternalMaisonDeDisque.g:65:56: (iv_ruleMaisonDeDisques= ruleMaisonDeDisques EOF )
            // InternalMaisonDeDisque.g:66:2: iv_ruleMaisonDeDisques= ruleMaisonDeDisques EOF
            {
             newCompositeNode(grammarAccess.getMaisonDeDisquesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMaisonDeDisques=ruleMaisonDeDisques();

            state._fsp--;

             current =iv_ruleMaisonDeDisques; 
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
    // $ANTLR end "entryRuleMaisonDeDisques"


    // $ANTLR start "ruleMaisonDeDisques"
    // InternalMaisonDeDisque.g:72:1: ruleMaisonDeDisques returns [EObject current=null] : (otherlv_0= 'MaisonDeDisques' otherlv_1= '{' otherlv_2= 'albums' otherlv_3= '{' ( (lv_albums_4_0= ruleAlbum ) ) (otherlv_5= ',' ( (lv_albums_6_0= ruleAlbum ) ) )* otherlv_7= '}' otherlv_8= 'chansons' otherlv_9= '{' ( (lv_chansons_10_0= ruleChanson ) ) (otherlv_11= ',' ( (lv_chansons_12_0= ruleChanson ) ) )* otherlv_13= '}' otherlv_14= 'personnes' otherlv_15= '{' ( (lv_personnes_16_0= rulePersonne ) ) (otherlv_17= ',' ( (lv_personnes_18_0= rulePersonne ) ) )* otherlv_19= '}' otherlv_20= '}' ) ;
    public final EObject ruleMaisonDeDisques() throws RecognitionException {
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
        EObject lv_albums_4_0 = null;

        EObject lv_albums_6_0 = null;

        EObject lv_chansons_10_0 = null;

        EObject lv_chansons_12_0 = null;

        EObject lv_personnes_16_0 = null;

        EObject lv_personnes_18_0 = null;



        	enterRule();

        try {
            // InternalMaisonDeDisque.g:78:2: ( (otherlv_0= 'MaisonDeDisques' otherlv_1= '{' otherlv_2= 'albums' otherlv_3= '{' ( (lv_albums_4_0= ruleAlbum ) ) (otherlv_5= ',' ( (lv_albums_6_0= ruleAlbum ) ) )* otherlv_7= '}' otherlv_8= 'chansons' otherlv_9= '{' ( (lv_chansons_10_0= ruleChanson ) ) (otherlv_11= ',' ( (lv_chansons_12_0= ruleChanson ) ) )* otherlv_13= '}' otherlv_14= 'personnes' otherlv_15= '{' ( (lv_personnes_16_0= rulePersonne ) ) (otherlv_17= ',' ( (lv_personnes_18_0= rulePersonne ) ) )* otherlv_19= '}' otherlv_20= '}' ) )
            // InternalMaisonDeDisque.g:79:2: (otherlv_0= 'MaisonDeDisques' otherlv_1= '{' otherlv_2= 'albums' otherlv_3= '{' ( (lv_albums_4_0= ruleAlbum ) ) (otherlv_5= ',' ( (lv_albums_6_0= ruleAlbum ) ) )* otherlv_7= '}' otherlv_8= 'chansons' otherlv_9= '{' ( (lv_chansons_10_0= ruleChanson ) ) (otherlv_11= ',' ( (lv_chansons_12_0= ruleChanson ) ) )* otherlv_13= '}' otherlv_14= 'personnes' otherlv_15= '{' ( (lv_personnes_16_0= rulePersonne ) ) (otherlv_17= ',' ( (lv_personnes_18_0= rulePersonne ) ) )* otherlv_19= '}' otherlv_20= '}' )
            {
            // InternalMaisonDeDisque.g:79:2: (otherlv_0= 'MaisonDeDisques' otherlv_1= '{' otherlv_2= 'albums' otherlv_3= '{' ( (lv_albums_4_0= ruleAlbum ) ) (otherlv_5= ',' ( (lv_albums_6_0= ruleAlbum ) ) )* otherlv_7= '}' otherlv_8= 'chansons' otherlv_9= '{' ( (lv_chansons_10_0= ruleChanson ) ) (otherlv_11= ',' ( (lv_chansons_12_0= ruleChanson ) ) )* otherlv_13= '}' otherlv_14= 'personnes' otherlv_15= '{' ( (lv_personnes_16_0= rulePersonne ) ) (otherlv_17= ',' ( (lv_personnes_18_0= rulePersonne ) ) )* otherlv_19= '}' otherlv_20= '}' )
            // InternalMaisonDeDisque.g:80:3: otherlv_0= 'MaisonDeDisques' otherlv_1= '{' otherlv_2= 'albums' otherlv_3= '{' ( (lv_albums_4_0= ruleAlbum ) ) (otherlv_5= ',' ( (lv_albums_6_0= ruleAlbum ) ) )* otherlv_7= '}' otherlv_8= 'chansons' otherlv_9= '{' ( (lv_chansons_10_0= ruleChanson ) ) (otherlv_11= ',' ( (lv_chansons_12_0= ruleChanson ) ) )* otherlv_13= '}' otherlv_14= 'personnes' otherlv_15= '{' ( (lv_personnes_16_0= rulePersonne ) ) (otherlv_17= ',' ( (lv_personnes_18_0= rulePersonne ) ) )* otherlv_19= '}' otherlv_20= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMaisonDeDisquesAccess().getMaisonDeDisquesKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getMaisonDeDisquesAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMaisonDeDisquesAccess().getAlbumsKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getMaisonDeDisquesAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMaisonDeDisque.g:96:3: ( (lv_albums_4_0= ruleAlbum ) )
            // InternalMaisonDeDisque.g:97:4: (lv_albums_4_0= ruleAlbum )
            {
            // InternalMaisonDeDisque.g:97:4: (lv_albums_4_0= ruleAlbum )
            // InternalMaisonDeDisque.g:98:5: lv_albums_4_0= ruleAlbum
            {

            					newCompositeNode(grammarAccess.getMaisonDeDisquesAccess().getAlbumsAlbumParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_albums_4_0=ruleAlbum();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaisonDeDisquesRule());
            					}
            					add(
            						current,
            						"albums",
            						lv_albums_4_0,
            						"ups.m2dl.tpNote.MaisonDeDisque.Album");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMaisonDeDisque.g:115:3: (otherlv_5= ',' ( (lv_albums_6_0= ruleAlbum ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMaisonDeDisque.g:116:4: otherlv_5= ',' ( (lv_albums_6_0= ruleAlbum ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getMaisonDeDisquesAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalMaisonDeDisque.g:120:4: ( (lv_albums_6_0= ruleAlbum ) )
            	    // InternalMaisonDeDisque.g:121:5: (lv_albums_6_0= ruleAlbum )
            	    {
            	    // InternalMaisonDeDisque.g:121:5: (lv_albums_6_0= ruleAlbum )
            	    // InternalMaisonDeDisque.g:122:6: lv_albums_6_0= ruleAlbum
            	    {

            	    						newCompositeNode(grammarAccess.getMaisonDeDisquesAccess().getAlbumsAlbumParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_albums_6_0=ruleAlbum();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMaisonDeDisquesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"albums",
            	    							lv_albums_6_0,
            	    							"ups.m2dl.tpNote.MaisonDeDisque.Album");
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

            			newLeafNode(otherlv_7, grammarAccess.getMaisonDeDisquesAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getMaisonDeDisquesAccess().getChansonsKeyword_7());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getMaisonDeDisquesAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalMaisonDeDisque.g:152:3: ( (lv_chansons_10_0= ruleChanson ) )
            // InternalMaisonDeDisque.g:153:4: (lv_chansons_10_0= ruleChanson )
            {
            // InternalMaisonDeDisque.g:153:4: (lv_chansons_10_0= ruleChanson )
            // InternalMaisonDeDisque.g:154:5: lv_chansons_10_0= ruleChanson
            {

            					newCompositeNode(grammarAccess.getMaisonDeDisquesAccess().getChansonsChansonParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_6);
            lv_chansons_10_0=ruleChanson();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaisonDeDisquesRule());
            					}
            					add(
            						current,
            						"chansons",
            						lv_chansons_10_0,
            						"ups.m2dl.tpNote.MaisonDeDisque.Chanson");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMaisonDeDisque.g:171:3: (otherlv_11= ',' ( (lv_chansons_12_0= ruleChanson ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMaisonDeDisque.g:172:4: otherlv_11= ',' ( (lv_chansons_12_0= ruleChanson ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FOLLOW_8); 

            	    				newLeafNode(otherlv_11, grammarAccess.getMaisonDeDisquesAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalMaisonDeDisque.g:176:4: ( (lv_chansons_12_0= ruleChanson ) )
            	    // InternalMaisonDeDisque.g:177:5: (lv_chansons_12_0= ruleChanson )
            	    {
            	    // InternalMaisonDeDisque.g:177:5: (lv_chansons_12_0= ruleChanson )
            	    // InternalMaisonDeDisque.g:178:6: lv_chansons_12_0= ruleChanson
            	    {

            	    						newCompositeNode(grammarAccess.getMaisonDeDisquesAccess().getChansonsChansonParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_chansons_12_0=ruleChanson();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMaisonDeDisquesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"chansons",
            	    							lv_chansons_12_0,
            	    							"ups.m2dl.tpNote.MaisonDeDisque.Chanson");
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

            			newLeafNode(otherlv_13, grammarAccess.getMaisonDeDisquesAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_14=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_14, grammarAccess.getMaisonDeDisquesAccess().getPersonnesKeyword_12());
            		
            otherlv_15=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_15, grammarAccess.getMaisonDeDisquesAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalMaisonDeDisque.g:208:3: ( (lv_personnes_16_0= rulePersonne ) )
            // InternalMaisonDeDisque.g:209:4: (lv_personnes_16_0= rulePersonne )
            {
            // InternalMaisonDeDisque.g:209:4: (lv_personnes_16_0= rulePersonne )
            // InternalMaisonDeDisque.g:210:5: lv_personnes_16_0= rulePersonne
            {

            					newCompositeNode(grammarAccess.getMaisonDeDisquesAccess().getPersonnesPersonneParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_6);
            lv_personnes_16_0=rulePersonne();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMaisonDeDisquesRule());
            					}
            					add(
            						current,
            						"personnes",
            						lv_personnes_16_0,
            						"ups.m2dl.tpNote.MaisonDeDisque.Personne");
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

            	    				newLeafNode(otherlv_17, grammarAccess.getMaisonDeDisquesAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalMaisonDeDisque.g:232:4: ( (lv_personnes_18_0= rulePersonne ) )
            	    // InternalMaisonDeDisque.g:233:5: (lv_personnes_18_0= rulePersonne )
            	    {
            	    // InternalMaisonDeDisque.g:233:5: (lv_personnes_18_0= rulePersonne )
            	    // InternalMaisonDeDisque.g:234:6: lv_personnes_18_0= rulePersonne
            	    {

            	    						newCompositeNode(grammarAccess.getMaisonDeDisquesAccess().getPersonnesPersonneParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_personnes_18_0=rulePersonne();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMaisonDeDisquesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"personnes",
            	    							lv_personnes_18_0,
            	    							"ups.m2dl.tpNote.MaisonDeDisque.Personne");
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

            			newLeafNode(otherlv_19, grammarAccess.getMaisonDeDisquesAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_20=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getMaisonDeDisquesAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleMaisonDeDisques"


    // $ANTLR start "entryRuleAlbum"
    // InternalMaisonDeDisque.g:264:1: entryRuleAlbum returns [EObject current=null] : iv_ruleAlbum= ruleAlbum EOF ;
    public final EObject entryRuleAlbum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlbum = null;


        try {
            // InternalMaisonDeDisque.g:264:46: (iv_ruleAlbum= ruleAlbum EOF )
            // InternalMaisonDeDisque.g:265:2: iv_ruleAlbum= ruleAlbum EOF
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
    // InternalMaisonDeDisque.g:271:1: ruleAlbum returns [EObject current=null] : (otherlv_0= 'Album' otherlv_1= '{' (otherlv_2= 'anneeSortie' ( (lv_anneeSortie_3_0= ruleEDate ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleAlbumsType ) ) )? (otherlv_6= 'nom' ( (lv_nom_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) )? otherlv_10= 'chansons' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' otherlv_16= '}' ) ;
    public final EObject ruleAlbum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        AntlrDatatypeRuleToken lv_anneeSortie_3_0 = null;

        Enumerator lv_type_5_0 = null;

        AntlrDatatypeRuleToken lv_nom_7_0 = null;

        AntlrDatatypeRuleToken lv_id_9_0 = null;



        	enterRule();

        try {
            // InternalMaisonDeDisque.g:277:2: ( (otherlv_0= 'Album' otherlv_1= '{' (otherlv_2= 'anneeSortie' ( (lv_anneeSortie_3_0= ruleEDate ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleAlbumsType ) ) )? (otherlv_6= 'nom' ( (lv_nom_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) )? otherlv_10= 'chansons' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' otherlv_16= '}' ) )
            // InternalMaisonDeDisque.g:278:2: (otherlv_0= 'Album' otherlv_1= '{' (otherlv_2= 'anneeSortie' ( (lv_anneeSortie_3_0= ruleEDate ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleAlbumsType ) ) )? (otherlv_6= 'nom' ( (lv_nom_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) )? otherlv_10= 'chansons' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' otherlv_16= '}' )
            {
            // InternalMaisonDeDisque.g:278:2: (otherlv_0= 'Album' otherlv_1= '{' (otherlv_2= 'anneeSortie' ( (lv_anneeSortie_3_0= ruleEDate ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleAlbumsType ) ) )? (otherlv_6= 'nom' ( (lv_nom_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) )? otherlv_10= 'chansons' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' otherlv_16= '}' )
            // InternalMaisonDeDisque.g:279:3: otherlv_0= 'Album' otherlv_1= '{' (otherlv_2= 'anneeSortie' ( (lv_anneeSortie_3_0= ruleEDate ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleAlbumsType ) ) )? (otherlv_6= 'nom' ( (lv_nom_7_0= ruleEString ) ) )? (otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) )? otherlv_10= 'chansons' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' otherlv_16= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAlbumAccess().getAlbumKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getAlbumAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMaisonDeDisque.g:287:3: (otherlv_2= 'anneeSortie' ( (lv_anneeSortie_3_0= ruleEDate ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMaisonDeDisque.g:288:4: otherlv_2= 'anneeSortie' ( (lv_anneeSortie_3_0= ruleEDate ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getAlbumAccess().getAnneeSortieKeyword_2_0());
                    			
                    // InternalMaisonDeDisque.g:292:4: ( (lv_anneeSortie_3_0= ruleEDate ) )
                    // InternalMaisonDeDisque.g:293:5: (lv_anneeSortie_3_0= ruleEDate )
                    {
                    // InternalMaisonDeDisque.g:293:5: (lv_anneeSortie_3_0= ruleEDate )
                    // InternalMaisonDeDisque.g:294:6: lv_anneeSortie_3_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getAlbumAccess().getAnneeSortieEDateParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_anneeSortie_3_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlbumRule());
                    						}
                    						set(
                    							current,
                    							"anneeSortie",
                    							lv_anneeSortie_3_0,
                    							"ups.m2dl.tpNote.MaisonDeDisque.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMaisonDeDisque.g:312:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleAlbumsType ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMaisonDeDisque.g:313:4: otherlv_4= 'type' ( (lv_type_5_0= ruleAlbumsType ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getAlbumAccess().getTypeKeyword_3_0());
                    			
                    // InternalMaisonDeDisque.g:317:4: ( (lv_type_5_0= ruleAlbumsType ) )
                    // InternalMaisonDeDisque.g:318:5: (lv_type_5_0= ruleAlbumsType )
                    {
                    // InternalMaisonDeDisque.g:318:5: (lv_type_5_0= ruleAlbumsType )
                    // InternalMaisonDeDisque.g:319:6: lv_type_5_0= ruleAlbumsType
                    {

                    						newCompositeNode(grammarAccess.getAlbumAccess().getTypeAlbumsTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_type_5_0=ruleAlbumsType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlbumRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"ups.m2dl.tpNote.MaisonDeDisque.AlbumsType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMaisonDeDisque.g:337:3: (otherlv_6= 'nom' ( (lv_nom_7_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMaisonDeDisque.g:338:4: otherlv_6= 'nom' ( (lv_nom_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getAlbumAccess().getNomKeyword_4_0());
                    			
                    // InternalMaisonDeDisque.g:342:4: ( (lv_nom_7_0= ruleEString ) )
                    // InternalMaisonDeDisque.g:343:5: (lv_nom_7_0= ruleEString )
                    {
                    // InternalMaisonDeDisque.g:343:5: (lv_nom_7_0= ruleEString )
                    // InternalMaisonDeDisque.g:344:6: lv_nom_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAlbumAccess().getNomEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_nom_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlbumRule());
                    						}
                    						set(
                    							current,
                    							"nom",
                    							lv_nom_7_0,
                    							"ups.m2dl.tpNote.MaisonDeDisque.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMaisonDeDisque.g:362:3: (otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMaisonDeDisque.g:363:4: otherlv_8= 'id' ( (lv_id_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_8, grammarAccess.getAlbumAccess().getIdKeyword_5_0());
                    			
                    // InternalMaisonDeDisque.g:367:4: ( (lv_id_9_0= ruleEString ) )
                    // InternalMaisonDeDisque.g:368:5: (lv_id_9_0= ruleEString )
                    {
                    // InternalMaisonDeDisque.g:368:5: (lv_id_9_0= ruleEString )
                    // InternalMaisonDeDisque.g:369:6: lv_id_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getAlbumAccess().getIdEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_id_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAlbumRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_9_0,
                    							"ups.m2dl.tpNote.MaisonDeDisque.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_19); 

            			newLeafNode(otherlv_10, grammarAccess.getAlbumAccess().getChansonsKeyword_6());
            		
            otherlv_11=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_11, grammarAccess.getAlbumAccess().getLeftParenthesisKeyword_7());
            		
            // InternalMaisonDeDisque.g:395:3: ( ( ruleEString ) )
            // InternalMaisonDeDisque.g:396:4: ( ruleEString )
            {
            // InternalMaisonDeDisque.g:396:4: ( ruleEString )
            // InternalMaisonDeDisque.g:397:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlbumRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAlbumAccess().getChansonsChansonCrossReference_8_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMaisonDeDisque.g:411:3: (otherlv_13= ',' ( ( ruleEString ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMaisonDeDisque.g:412:4: otherlv_13= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,14,FOLLOW_17); 

            	    				newLeafNode(otherlv_13, grammarAccess.getAlbumAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalMaisonDeDisque.g:416:4: ( ( ruleEString ) )
            	    // InternalMaisonDeDisque.g:417:5: ( ruleEString )
            	    {
            	    // InternalMaisonDeDisque.g:417:5: ( ruleEString )
            	    // InternalMaisonDeDisque.g:418:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAlbumRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getAlbumAccess().getChansonsChansonCrossReference_9_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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

            otherlv_15=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_15, grammarAccess.getAlbumAccess().getRightParenthesisKeyword_10());
            		
            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getAlbumAccess().getRightCurlyBracketKeyword_11());
            		

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


    // $ANTLR start "entryRuleChanson"
    // InternalMaisonDeDisque.g:445:1: entryRuleChanson returns [EObject current=null] : iv_ruleChanson= ruleChanson EOF ;
    public final EObject entryRuleChanson() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChanson = null;


        try {
            // InternalMaisonDeDisque.g:445:48: (iv_ruleChanson= ruleChanson EOF )
            // InternalMaisonDeDisque.g:446:2: iv_ruleChanson= ruleChanson EOF
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
    // InternalMaisonDeDisque.g:452:1: ruleChanson returns [EObject current=null] : (otherlv_0= 'Chanson' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'titre' ( (lv_titre_5_0= ruleEString ) ) )? otherlv_6= 'chanteurs' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' otherlv_12= 'auteur' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' otherlv_18= '}' ) ;
    public final EObject ruleChanson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_id_3_0 = null;

        AntlrDatatypeRuleToken lv_titre_5_0 = null;



        	enterRule();

        try {
            // InternalMaisonDeDisque.g:458:2: ( (otherlv_0= 'Chanson' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'titre' ( (lv_titre_5_0= ruleEString ) ) )? otherlv_6= 'chanteurs' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' otherlv_12= 'auteur' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' otherlv_18= '}' ) )
            // InternalMaisonDeDisque.g:459:2: (otherlv_0= 'Chanson' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'titre' ( (lv_titre_5_0= ruleEString ) ) )? otherlv_6= 'chanteurs' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' otherlv_12= 'auteur' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' otherlv_18= '}' )
            {
            // InternalMaisonDeDisque.g:459:2: (otherlv_0= 'Chanson' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'titre' ( (lv_titre_5_0= ruleEString ) ) )? otherlv_6= 'chanteurs' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' otherlv_12= 'auteur' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' otherlv_18= '}' )
            // InternalMaisonDeDisque.g:460:3: otherlv_0= 'Chanson' otherlv_1= '{' (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )? (otherlv_4= 'titre' ( (lv_titre_5_0= ruleEString ) ) )? otherlv_6= 'chanteurs' otherlv_7= '(' ( ( ruleEString ) ) (otherlv_9= ',' ( ( ruleEString ) ) )* otherlv_11= ')' otherlv_12= 'auteur' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChansonAccess().getChansonKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getChansonAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMaisonDeDisque.g:468:3: (otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMaisonDeDisque.g:469:4: otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_17); 

                    				newLeafNode(otherlv_2, grammarAccess.getChansonAccess().getIdKeyword_2_0());
                    			
                    // InternalMaisonDeDisque.g:473:4: ( (lv_id_3_0= ruleEString ) )
                    // InternalMaisonDeDisque.g:474:5: (lv_id_3_0= ruleEString )
                    {
                    // InternalMaisonDeDisque.g:474:5: (lv_id_3_0= ruleEString )
                    // InternalMaisonDeDisque.g:475:6: lv_id_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getChansonAccess().getIdEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_id_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChansonRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_3_0,
                    							"ups.m2dl.tpNote.MaisonDeDisque.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMaisonDeDisque.g:493:3: (otherlv_4= 'titre' ( (lv_titre_5_0= ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==26) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMaisonDeDisque.g:494:4: otherlv_4= 'titre' ( (lv_titre_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_17); 

                    				newLeafNode(otherlv_4, grammarAccess.getChansonAccess().getTitreKeyword_3_0());
                    			
                    // InternalMaisonDeDisque.g:498:4: ( (lv_titre_5_0= ruleEString ) )
                    // InternalMaisonDeDisque.g:499:5: (lv_titre_5_0= ruleEString )
                    {
                    // InternalMaisonDeDisque.g:499:5: (lv_titre_5_0= ruleEString )
                    // InternalMaisonDeDisque.g:500:6: lv_titre_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getChansonAccess().getTitreEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_titre_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getChansonRule());
                    						}
                    						set(
                    							current,
                    							"titre",
                    							lv_titre_5_0,
                    							"ups.m2dl.tpNote.MaisonDeDisque.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FOLLOW_19); 

            			newLeafNode(otherlv_6, grammarAccess.getChansonAccess().getChanteursKeyword_4());
            		
            otherlv_7=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_7, grammarAccess.getChansonAccess().getLeftParenthesisKeyword_5());
            		
            // InternalMaisonDeDisque.g:526:3: ( ( ruleEString ) )
            // InternalMaisonDeDisque.g:527:4: ( ruleEString )
            {
            // InternalMaisonDeDisque.g:527:4: ( ruleEString )
            // InternalMaisonDeDisque.g:528:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChansonRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChansonAccess().getChanteursPersonneCrossReference_6_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMaisonDeDisque.g:542:3: (otherlv_9= ',' ( ( ruleEString ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==14) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMaisonDeDisque.g:543:4: otherlv_9= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_9=(Token)match(input,14,FOLLOW_17); 

            	    				newLeafNode(otherlv_9, grammarAccess.getChansonAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMaisonDeDisque.g:547:4: ( ( ruleEString ) )
            	    // InternalMaisonDeDisque.g:548:5: ( ruleEString )
            	    {
            	    // InternalMaisonDeDisque.g:548:5: ( ruleEString )
            	    // InternalMaisonDeDisque.g:549:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getChansonRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getChansonAccess().getChanteursPersonneCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_11=(Token)match(input,24,FOLLOW_24); 

            			newLeafNode(otherlv_11, grammarAccess.getChansonAccess().getRightParenthesisKeyword_8());
            		
            otherlv_12=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_12, grammarAccess.getChansonAccess().getAuteurKeyword_9());
            		
            otherlv_13=(Token)match(input,23,FOLLOW_17); 

            			newLeafNode(otherlv_13, grammarAccess.getChansonAccess().getLeftParenthesisKeyword_10());
            		
            // InternalMaisonDeDisque.g:576:3: ( ( ruleEString ) )
            // InternalMaisonDeDisque.g:577:4: ( ruleEString )
            {
            // InternalMaisonDeDisque.g:577:4: ( ruleEString )
            // InternalMaisonDeDisque.g:578:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChansonRule());
            					}
            				

            					newCompositeNode(grammarAccess.getChansonAccess().getAuteurPersonneCrossReference_11_0());
            				
            pushFollow(FOLLOW_20);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMaisonDeDisque.g:592:3: (otherlv_15= ',' ( ( ruleEString ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==14) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMaisonDeDisque.g:593:4: otherlv_15= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_15=(Token)match(input,14,FOLLOW_17); 

            	    				newLeafNode(otherlv_15, grammarAccess.getChansonAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalMaisonDeDisque.g:597:4: ( ( ruleEString ) )
            	    // InternalMaisonDeDisque.g:598:5: ( ruleEString )
            	    {
            	    // InternalMaisonDeDisque.g:598:5: ( ruleEString )
            	    // InternalMaisonDeDisque.g:599:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getChansonRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getChansonAccess().getAuteurPersonneCrossReference_12_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_17=(Token)match(input,24,FOLLOW_11); 

            			newLeafNode(otherlv_17, grammarAccess.getChansonAccess().getRightParenthesisKeyword_13());
            		
            otherlv_18=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getChansonAccess().getRightCurlyBracketKeyword_14());
            		

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


    // $ANTLR start "entryRulePersonne"
    // InternalMaisonDeDisque.g:626:1: entryRulePersonne returns [EObject current=null] : iv_rulePersonne= rulePersonne EOF ;
    public final EObject entryRulePersonne() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePersonne = null;


        try {
            // InternalMaisonDeDisque.g:626:49: (iv_rulePersonne= rulePersonne EOF )
            // InternalMaisonDeDisque.g:627:2: iv_rulePersonne= rulePersonne EOF
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
    // InternalMaisonDeDisque.g:633:1: rulePersonne returns [EObject current=null] : ( () otherlv_1= 'Personne' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'chansonsChanteur' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'chansonsAuteur' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' ) ;
    public final EObject rulePersonne() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_nom_4_0 = null;



        	enterRule();

        try {
            // InternalMaisonDeDisque.g:639:2: ( ( () otherlv_1= 'Personne' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'chansonsChanteur' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'chansonsAuteur' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' ) )
            // InternalMaisonDeDisque.g:640:2: ( () otherlv_1= 'Personne' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'chansonsChanteur' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'chansonsAuteur' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' )
            {
            // InternalMaisonDeDisque.g:640:2: ( () otherlv_1= 'Personne' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'chansonsChanteur' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'chansonsAuteur' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}' )
            // InternalMaisonDeDisque.g:641:3: () otherlv_1= 'Personne' otherlv_2= '{' (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )? (otherlv_5= 'chansonsChanteur' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )? (otherlv_11= 'chansonsAuteur' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )? otherlv_17= '}'
            {
            // InternalMaisonDeDisque.g:641:3: ()
            // InternalMaisonDeDisque.g:642:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPersonneAccess().getPersonneAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPersonneAccess().getPersonneKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getPersonneAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMaisonDeDisque.g:656:3: (otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMaisonDeDisque.g:657:4: otherlv_3= 'nom' ( (lv_nom_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_17); 

                    				newLeafNode(otherlv_3, grammarAccess.getPersonneAccess().getNomKeyword_3_0());
                    			
                    // InternalMaisonDeDisque.g:661:4: ( (lv_nom_4_0= ruleEString ) )
                    // InternalMaisonDeDisque.g:662:5: (lv_nom_4_0= ruleEString )
                    {
                    // InternalMaisonDeDisque.g:662:5: (lv_nom_4_0= ruleEString )
                    // InternalMaisonDeDisque.g:663:6: lv_nom_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getPersonneAccess().getNomEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_nom_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPersonneRule());
                    						}
                    						set(
                    							current,
                    							"nom",
                    							lv_nom_4_0,
                    							"ups.m2dl.tpNote.MaisonDeDisque.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMaisonDeDisque.g:681:3: (otherlv_5= 'chansonsChanteur' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMaisonDeDisque.g:682:4: otherlv_5= 'chansonsChanteur' otherlv_6= '(' ( ( ruleEString ) ) (otherlv_8= ',' ( ( ruleEString ) ) )* otherlv_10= ')'
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_19); 

                    				newLeafNode(otherlv_5, grammarAccess.getPersonneAccess().getChansonsChanteurKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getPersonneAccess().getLeftParenthesisKeyword_4_1());
                    			
                    // InternalMaisonDeDisque.g:690:4: ( ( ruleEString ) )
                    // InternalMaisonDeDisque.g:691:5: ( ruleEString )
                    {
                    // InternalMaisonDeDisque.g:691:5: ( ruleEString )
                    // InternalMaisonDeDisque.g:692:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersonneRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPersonneAccess().getChansonsChanteurChansonCrossReference_4_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMaisonDeDisque.g:706:4: (otherlv_8= ',' ( ( ruleEString ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==14) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalMaisonDeDisque.g:707:5: otherlv_8= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getPersonneAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMaisonDeDisque.g:711:5: ( ( ruleEString ) )
                    	    // InternalMaisonDeDisque.g:712:6: ( ruleEString )
                    	    {
                    	    // InternalMaisonDeDisque.g:712:6: ( ruleEString )
                    	    // InternalMaisonDeDisque.g:713:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPersonneRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPersonneAccess().getChansonsChanteurChansonCrossReference_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,24,FOLLOW_27); 

                    				newLeafNode(otherlv_10, grammarAccess.getPersonneAccess().getRightParenthesisKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMaisonDeDisque.g:733:3: (otherlv_11= 'chansonsAuteur' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMaisonDeDisque.g:734:4: otherlv_11= 'chansonsAuteur' otherlv_12= '(' ( ( ruleEString ) ) (otherlv_14= ',' ( ( ruleEString ) ) )* otherlv_16= ')'
                    {
                    otherlv_11=(Token)match(input,31,FOLLOW_19); 

                    				newLeafNode(otherlv_11, grammarAccess.getPersonneAccess().getChansonsAuteurKeyword_5_0());
                    			
                    otherlv_12=(Token)match(input,23,FOLLOW_17); 

                    				newLeafNode(otherlv_12, grammarAccess.getPersonneAccess().getLeftParenthesisKeyword_5_1());
                    			
                    // InternalMaisonDeDisque.g:742:4: ( ( ruleEString ) )
                    // InternalMaisonDeDisque.g:743:5: ( ruleEString )
                    {
                    // InternalMaisonDeDisque.g:743:5: ( ruleEString )
                    // InternalMaisonDeDisque.g:744:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPersonneRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPersonneAccess().getChansonsAuteurChansonCrossReference_5_2_0());
                    					
                    pushFollow(FOLLOW_20);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMaisonDeDisque.g:758:4: (otherlv_14= ',' ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMaisonDeDisque.g:759:5: otherlv_14= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_14=(Token)match(input,14,FOLLOW_17); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getPersonneAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMaisonDeDisque.g:763:5: ( ( ruleEString ) )
                    	    // InternalMaisonDeDisque.g:764:6: ( ruleEString )
                    	    {
                    	    // InternalMaisonDeDisque.g:764:6: ( ruleEString )
                    	    // InternalMaisonDeDisque.g:765:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPersonneRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPersonneAccess().getChansonsAuteurChansonCrossReference_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_20);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,24,FOLLOW_11); 

                    				newLeafNode(otherlv_16, grammarAccess.getPersonneAccess().getRightParenthesisKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getPersonneAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleEDate"
    // InternalMaisonDeDisque.g:793:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalMaisonDeDisque.g:793:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalMaisonDeDisque.g:794:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
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
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalMaisonDeDisque.g:800:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMaisonDeDisque.g:806:2: (kw= 'EDate' )
            // InternalMaisonDeDisque.g:807:2: kw= 'EDate'
            {
            kw=(Token)match(input,32,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEDateAccess().getEDateKeyword());
            	

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
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleEString"
    // InternalMaisonDeDisque.g:815:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMaisonDeDisque.g:815:47: (iv_ruleEString= ruleEString EOF )
            // InternalMaisonDeDisque.g:816:2: iv_ruleEString= ruleEString EOF
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
    // InternalMaisonDeDisque.g:822:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMaisonDeDisque.g:828:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMaisonDeDisque.g:829:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMaisonDeDisque.g:829:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalMaisonDeDisque.g:830:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMaisonDeDisque.g:838:3: this_ID_1= RULE_ID
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


    // $ANTLR start "ruleAlbumsType"
    // InternalMaisonDeDisque.g:849:1: ruleAlbumsType returns [Enumerator current=null] : ( (enumLiteral_0= 'SINGLE' ) | (enumLiteral_1= 'COMPILATION' ) ) ;
    public final Enumerator ruleAlbumsType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMaisonDeDisque.g:855:2: ( ( (enumLiteral_0= 'SINGLE' ) | (enumLiteral_1= 'COMPILATION' ) ) )
            // InternalMaisonDeDisque.g:856:2: ( (enumLiteral_0= 'SINGLE' ) | (enumLiteral_1= 'COMPILATION' ) )
            {
            // InternalMaisonDeDisque.g:856:2: ( (enumLiteral_0= 'SINGLE' ) | (enumLiteral_1= 'COMPILATION' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==33) ) {
                alt19=1;
            }
            else if ( (LA19_0==34) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMaisonDeDisque.g:857:3: (enumLiteral_0= 'SINGLE' )
                    {
                    // InternalMaisonDeDisque.g:857:3: (enumLiteral_0= 'SINGLE' )
                    // InternalMaisonDeDisque.g:858:4: enumLiteral_0= 'SINGLE'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getAlbumsTypeAccess().getSINGLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAlbumsTypeAccess().getSINGLEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMaisonDeDisque.g:865:3: (enumLiteral_1= 'COMPILATION' )
                    {
                    // InternalMaisonDeDisque.g:865:3: (enumLiteral_1= 'COMPILATION' )
                    // InternalMaisonDeDisque.g:866:4: enumLiteral_1= 'COMPILATION'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getAlbumsTypeAccess().getCOMPILATIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAlbumsTypeAccess().getCOMPILATIONEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleAlbumsType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000790000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000710000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000610000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001004000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000000C0208000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000000C0008000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000080008000L});

}
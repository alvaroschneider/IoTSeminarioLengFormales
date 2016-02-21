package org.slf.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.slf.services.IotGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalIotParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'dispositivo'", "'extends'", "'{'", "'}'", "'etiqueta'", "'='", "'evento'", "'estado'", "'=>'", "'if'", "'('", "')'", "'else'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'!'", "'true'", "'false'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
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


        public InternalIotParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalIotParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalIotParser.tokenNames; }
    public String getGrammarFileName() { return "../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g"; }



     	private IotGrammarAccess grammarAccess;
     	
        public InternalIotParser(TokenStream input, IotGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Model";	
       	}
       	
       	@Override
       	protected IotGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModel"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:69:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:76:1: ruleModel returns [EObject current=null] : ( (lv_dispositivos_0_0= ruleDispositivo ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_dispositivos_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:79:28: ( ( (lv_dispositivos_0_0= ruleDispositivo ) )* )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:80:1: ( (lv_dispositivos_0_0= ruleDispositivo ) )*
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:80:1: ( (lv_dispositivos_0_0= ruleDispositivo ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:81:1: (lv_dispositivos_0_0= ruleDispositivo )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:81:1: (lv_dispositivos_0_0= ruleDispositivo )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:82:3: lv_dispositivos_0_0= ruleDispositivo
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getModelAccess().getDispositivosDispositivoParserRuleCall_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDispositivo_in_ruleModel130);
            	    lv_dispositivos_0_0=ruleDispositivo();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"dispositivos",
            	              		lv_dispositivos_0_0, 
            	              		"Dispositivo");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleDispositivo"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:106:1: entryRuleDispositivo returns [EObject current=null] : iv_ruleDispositivo= ruleDispositivo EOF ;
    public final EObject entryRuleDispositivo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDispositivo = null;


        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:107:2: (iv_ruleDispositivo= ruleDispositivo EOF )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:108:2: iv_ruleDispositivo= ruleDispositivo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDispositivoRule()); 
            }
            pushFollow(FOLLOW_ruleDispositivo_in_entryRuleDispositivo166);
            iv_ruleDispositivo=ruleDispositivo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDispositivo; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDispositivo176); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDispositivo"


    // $ANTLR start "ruleDispositivo"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:115:1: ruleDispositivo returns [EObject current=null] : (otherlv_0= 'dispositivo' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_etiquetas_5_0= ruleEtiqueta ) )* ( (lv_estados_6_0= ruleEstado ) )* ( (lv_eventos_7_0= ruleEvento ) )* ( (lv_transiciones_8_0= ruleTransicion ) )* otherlv_9= '}' ) ;
    public final EObject ruleDispositivo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_9=null;
        EObject lv_etiquetas_5_0 = null;

        EObject lv_estados_6_0 = null;

        EObject lv_eventos_7_0 = null;

        EObject lv_transiciones_8_0 = null;


         enterRule(); 
            
        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:118:28: ( (otherlv_0= 'dispositivo' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_etiquetas_5_0= ruleEtiqueta ) )* ( (lv_estados_6_0= ruleEstado ) )* ( (lv_eventos_7_0= ruleEvento ) )* ( (lv_transiciones_8_0= ruleTransicion ) )* otherlv_9= '}' ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:119:1: (otherlv_0= 'dispositivo' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_etiquetas_5_0= ruleEtiqueta ) )* ( (lv_estados_6_0= ruleEstado ) )* ( (lv_eventos_7_0= ruleEvento ) )* ( (lv_transiciones_8_0= ruleTransicion ) )* otherlv_9= '}' )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:119:1: (otherlv_0= 'dispositivo' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_etiquetas_5_0= ruleEtiqueta ) )* ( (lv_estados_6_0= ruleEstado ) )* ( (lv_eventos_7_0= ruleEvento ) )* ( (lv_transiciones_8_0= ruleTransicion ) )* otherlv_9= '}' )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:119:3: otherlv_0= 'dispositivo' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' ( (lv_etiquetas_5_0= ruleEtiqueta ) )* ( (lv_estados_6_0= ruleEstado ) )* ( (lv_eventos_7_0= ruleEvento ) )* ( (lv_transiciones_8_0= ruleTransicion ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleDispositivo213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDispositivoAccess().getDispositivoKeyword_0());
                  
            }
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:123:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:124:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:124:1: (lv_name_1_0= RULE_ID )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:125:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDispositivo230); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getDispositivoAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDispositivoRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:141:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:141:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleDispositivo248); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getDispositivoAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:145:1: ( (otherlv_3= RULE_ID ) )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:146:1: (otherlv_3= RULE_ID )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:146:1: (otherlv_3= RULE_ID )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:147:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDispositivoRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDispositivo268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getDispositivoAccess().getSuperTypeDispositivoCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleDispositivo282); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDispositivoAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:162:1: ( (lv_etiquetas_5_0= ruleEtiqueta ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:163:1: (lv_etiquetas_5_0= ruleEtiqueta )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:163:1: (lv_etiquetas_5_0= ruleEtiqueta )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:164:3: lv_etiquetas_5_0= ruleEtiqueta
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDispositivoAccess().getEtiquetasEtiquetaParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEtiqueta_in_ruleDispositivo303);
            	    lv_etiquetas_5_0=ruleEtiqueta();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDispositivoRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"etiquetas",
            	              		lv_etiquetas_5_0, 
            	              		"Etiqueta");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:180:3: ( (lv_estados_6_0= ruleEstado ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:181:1: (lv_estados_6_0= ruleEstado )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:181:1: (lv_estados_6_0= ruleEstado )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:182:3: lv_estados_6_0= ruleEstado
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDispositivoAccess().getEstadosEstadoParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEstado_in_ruleDispositivo325);
            	    lv_estados_6_0=ruleEstado();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDispositivoRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"estados",
            	              		lv_estados_6_0, 
            	              		"Estado");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:198:3: ( (lv_eventos_7_0= ruleEvento ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:199:1: (lv_eventos_7_0= ruleEvento )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:199:1: (lv_eventos_7_0= ruleEvento )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:200:3: lv_eventos_7_0= ruleEvento
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDispositivoAccess().getEventosEventoParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEvento_in_ruleDispositivo347);
            	    lv_eventos_7_0=ruleEvento();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDispositivoRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"eventos",
            	              		lv_eventos_7_0, 
            	              		"Evento");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:216:3: ( (lv_transiciones_8_0= ruleTransicion ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:217:1: (lv_transiciones_8_0= ruleTransicion )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:217:1: (lv_transiciones_8_0= ruleTransicion )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:218:3: lv_transiciones_8_0= ruleTransicion
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDispositivoAccess().getTransicionesTransicionParserRuleCall_7_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransicion_in_ruleDispositivo369);
            	    lv_transiciones_8_0=ruleTransicion();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDispositivoRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"transiciones",
            	              		lv_transiciones_8_0, 
            	              		"Transicion");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_9=(Token)match(input,14,FOLLOW_14_in_ruleDispositivo382); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getDispositivoAccess().getRightCurlyBracketKeyword_8());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDispositivo"


    // $ANTLR start "entryRuleEtiqueta"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:246:1: entryRuleEtiqueta returns [EObject current=null] : iv_ruleEtiqueta= ruleEtiqueta EOF ;
    public final EObject entryRuleEtiqueta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEtiqueta = null;


        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:247:2: (iv_ruleEtiqueta= ruleEtiqueta EOF )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:248:2: iv_ruleEtiqueta= ruleEtiqueta EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEtiquetaRule()); 
            }
            pushFollow(FOLLOW_ruleEtiqueta_in_entryRuleEtiqueta418);
            iv_ruleEtiqueta=ruleEtiqueta();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEtiqueta; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEtiqueta428); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEtiqueta"


    // $ANTLR start "ruleEtiqueta"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:255:1: ruleEtiqueta returns [EObject current=null] : ( ( (lv_typeName_0_0= 'etiqueta' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleEtiqueta() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;

         enterRule(); 
            
        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:258:28: ( ( ( (lv_typeName_0_0= 'etiqueta' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )? ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:259:1: ( ( (lv_typeName_0_0= 'etiqueta' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )? )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:259:1: ( ( (lv_typeName_0_0= 'etiqueta' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )? )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:259:2: ( (lv_typeName_0_0= 'etiqueta' ) ) ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )?
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:259:2: ( (lv_typeName_0_0= 'etiqueta' ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:260:1: (lv_typeName_0_0= 'etiqueta' )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:260:1: (lv_typeName_0_0= 'etiqueta' )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:261:3: lv_typeName_0_0= 'etiqueta'
            {
            lv_typeName_0_0=(Token)match(input,15,FOLLOW_15_in_ruleEtiqueta471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_typeName_0_0, grammarAccess.getEtiquetaAccess().getTypeNameEtiquetaKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEtiquetaRule());
              	        }
                     		setWithLastConsumed(current, "typeName", lv_typeName_0_0, "etiqueta");
              	    
            }

            }


            }

            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:274:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:275:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:275:1: (lv_name_1_0= RULE_ID )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:276:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEtiqueta501); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEtiquetaAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEtiquetaRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:292:2: (otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:292:4: otherlv_2= '=' ( (lv_value_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleEtiqueta519); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEtiquetaAccess().getEqualsSignKeyword_2_0());
                          
                    }
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:296:1: ( (lv_value_3_0= RULE_STRING ) )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:297:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:297:1: (lv_value_3_0= RULE_STRING )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:298:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEtiqueta536); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_3_0, grammarAccess.getEtiquetaAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getEtiquetaRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEtiqueta"


    // $ANTLR start "entryRuleEvento"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:322:1: entryRuleEvento returns [EObject current=null] : iv_ruleEvento= ruleEvento EOF ;
    public final EObject entryRuleEvento() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvento = null;


        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:323:2: (iv_ruleEvento= ruleEvento EOF )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:324:2: iv_ruleEvento= ruleEvento EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventoRule()); 
            }
            pushFollow(FOLLOW_ruleEvento_in_entryRuleEvento579);
            iv_ruleEvento=ruleEvento();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvento; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvento589); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEvento"


    // $ANTLR start "ruleEvento"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:331:1: ruleEvento returns [EObject current=null] : ( ( (lv_typeName_0_0= 'evento' ) ) ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleEvento() throws RecognitionException {
        EObject current = null;

        Token lv_typeName_0_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:334:28: ( ( ( (lv_typeName_0_0= 'evento' ) ) ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:335:1: ( ( (lv_typeName_0_0= 'evento' ) ) ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:335:1: ( ( (lv_typeName_0_0= 'evento' ) ) ( (lv_name_1_0= RULE_ID ) ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:335:2: ( (lv_typeName_0_0= 'evento' ) ) ( (lv_name_1_0= RULE_ID ) )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:335:2: ( (lv_typeName_0_0= 'evento' ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:336:1: (lv_typeName_0_0= 'evento' )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:336:1: (lv_typeName_0_0= 'evento' )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:337:3: lv_typeName_0_0= 'evento'
            {
            lv_typeName_0_0=(Token)match(input,17,FOLLOW_17_in_ruleEvento632); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_typeName_0_0, grammarAccess.getEventoAccess().getTypeNameEventoKeyword_0_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEventoRule());
              	        }
                     		setWithLastConsumed(current, "typeName", lv_typeName_0_0, "evento");
              	    
            }

            }


            }

            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:350:2: ( (lv_name_1_0= RULE_ID ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:351:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:351:1: (lv_name_1_0= RULE_ID )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:352:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvento662); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEventoAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEventoRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEvento"


    // $ANTLR start "entryRuleEstado"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:376:1: entryRuleEstado returns [EObject current=null] : iv_ruleEstado= ruleEstado EOF ;
    public final EObject entryRuleEstado() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEstado = null;


        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:377:2: (iv_ruleEstado= ruleEstado EOF )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:378:2: iv_ruleEstado= ruleEstado EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEstadoRule()); 
            }
            pushFollow(FOLLOW_ruleEstado_in_entryRuleEstado703);
            iv_ruleEstado=ruleEstado();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEstado; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEstado713); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEstado"


    // $ANTLR start "ruleEstado"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:385:1: ruleEstado returns [EObject current=null] : (otherlv_0= 'estado' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elementos_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final EObject ruleEstado() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elementos_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:388:28: ( (otherlv_0= 'estado' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elementos_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:389:1: (otherlv_0= 'estado' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elementos_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:389:1: (otherlv_0= 'estado' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elementos_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:389:3: otherlv_0= 'estado' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_elementos_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleEstado750); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEstadoAccess().getEstadoKeyword_0());
                  
            }
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:393:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:394:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:394:1: (lv_name_1_0= RULE_ID )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:395:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEstado767); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEstadoAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEstadoRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleEstado784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEstadoAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:415:1: ( (lv_elementos_3_0= ruleAbstractElement ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=RULE_ID && LA8_0<=RULE_INT)||(LA8_0>=20 && LA8_0<=21)||(LA8_0>=36 && LA8_0<=38)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:416:1: (lv_elementos_3_0= ruleAbstractElement )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:416:1: (lv_elementos_3_0= ruleAbstractElement )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:417:3: lv_elementos_3_0= ruleAbstractElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEstadoAccess().getElementosAbstractElementParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleEstado805);
            	    lv_elementos_3_0=ruleAbstractElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEstadoRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"elementos",
            	              		lv_elementos_3_0, 
            	              		"AbstractElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleEstado818); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEstadoAccess().getRightCurlyBracketKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEstado"


    // $ANTLR start "entryRuleTransicion"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:445:1: entryRuleTransicion returns [EObject current=null] : iv_ruleTransicion= ruleTransicion EOF ;
    public final EObject entryRuleTransicion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransicion = null;


        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:446:2: (iv_ruleTransicion= ruleTransicion EOF )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:447:2: iv_ruleTransicion= ruleTransicion EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransicionRule()); 
            }
            pushFollow(FOLLOW_ruleTransicion_in_entryRuleTransicion854);
            iv_ruleTransicion=ruleTransicion();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransicion; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransicion864); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTransicion"


    // $ANTLR start "ruleTransicion"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:454:1: ruleTransicion returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleTransicion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:457:28: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:458:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:458:1: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:458:2: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=>' ( (otherlv_2= RULE_ID ) )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:458:2: ( (otherlv_0= RULE_ID ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:459:1: (otherlv_0= RULE_ID )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:459:1: (otherlv_0= RULE_ID )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:460:3: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTransicionRule());
              	        }
                      
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransicion909); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_0, grammarAccess.getTransicionAccess().getEventoEventoCrossReference_0_0()); 
              	
            }

            }


            }

            otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleTransicion921); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTransicionAccess().getEqualsSignGreaterThanSignKeyword_1());
                  
            }
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:475:1: ( (otherlv_2= RULE_ID ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:476:1: (otherlv_2= RULE_ID )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:476:1: (otherlv_2= RULE_ID )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:477:3: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTransicionRule());
              	        }
                      
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransicion941); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_2, grammarAccess.getTransicionAccess().getEstadoEstadoCrossReference_2_0()); 
              	
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTransicion"


    // $ANTLR start "entryRuleAbstractElement"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:496:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:497:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:498:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbstractElementRule()); 
            }
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement977);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbstractElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement987); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:505:1: ruleAbstractElement returns [EObject current=null] : (this_Variable_0= ruleVariable | this_Expression_1= ruleExpression | this_IfStatement_2= ruleIfStatement ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject this_Variable_0 = null;

        EObject this_Expression_1 = null;

        EObject this_IfStatement_2 = null;


         enterRule(); 
            
        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:508:28: ( (this_Variable_0= ruleVariable | this_Expression_1= ruleExpression | this_IfStatement_2= ruleIfStatement ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:509:1: (this_Variable_0= ruleVariable | this_Expression_1= ruleExpression | this_IfStatement_2= ruleIfStatement )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:509:1: (this_Variable_0= ruleVariable | this_Expression_1= ruleExpression | this_IfStatement_2= ruleIfStatement )
            int alt9=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||(LA9_1>=RULE_ID && LA9_1<=RULE_INT)||LA9_1==14||(LA9_1>=20 && LA9_1<=21)||(LA9_1>=23 && LA9_1<=38)) ) {
                    alt9=2;
                }
                else if ( (LA9_1==16) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case 21:
            case 36:
            case 37:
            case 38:
                {
                alt9=2;
                }
                break;
            case 20:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:510:5: this_Variable_0= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleAbstractElement1034);
                    this_Variable_0=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:520:5: this_Expression_1= ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractElementAccess().getExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_ruleAbstractElement1061);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:530:5: this_IfStatement_2= ruleIfStatement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAbstractElementAccess().getIfStatementParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIfStatement_in_ruleAbstractElement1088);
                    this_IfStatement_2=ruleIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_IfStatement_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleIfStatement"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:546:1: entryRuleIfStatement returns [EObject current=null] : iv_ruleIfStatement= ruleIfStatement EOF ;
    public final EObject entryRuleIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfStatement = null;


        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:547:2: (iv_ruleIfStatement= ruleIfStatement EOF )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:548:2: iv_ruleIfStatement= ruleIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfStatementRule()); 
            }
            pushFollow(FOLLOW_ruleIfStatement_in_entryRuleIfStatement1123);
            iv_ruleIfStatement=ruleIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfStatement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfStatement1133); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfStatement"


    // $ANTLR start "ruleIfStatement"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:555:1: ruleIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? ) ;
    public final EObject ruleIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_thenBlock_4_0 = null;

        EObject lv_elseBlock_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:558:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:559:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:559:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )? )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:559:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleIfStatement1170); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleIfStatement1182); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:567:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:568:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:568:1: (lv_expression_2_0= ruleExpression )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:569:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleIfStatement1203);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleIfStatement1215); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
                  
            }
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:589:1: ( (lv_thenBlock_4_0= ruleIfBlock ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:590:1: (lv_thenBlock_4_0= ruleIfBlock )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:590:1: (lv_thenBlock_4_0= ruleIfBlock )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:591:3: lv_thenBlock_4_0= ruleIfBlock
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIfStatementAccess().getThenBlockIfBlockParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleIfBlock_in_ruleIfStatement1236);
            lv_thenBlock_4_0=ruleIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
              	        }
                     		set(
                     			current, 
                     			"thenBlock",
                      		lv_thenBlock_4_0, 
                      		"IfBlock");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:607:2: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                int LA10_1 = input.LA(2);

                if ( (synpred1_InternalIot()) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:607:3: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleIfBlock ) )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:607:3: ( ( 'else' )=>otherlv_5= 'else' )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:607:4: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleIfStatement1257); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
                          
                    }

                    }

                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:612:2: ( (lv_elseBlock_6_0= ruleIfBlock ) )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:613:1: (lv_elseBlock_6_0= ruleIfBlock )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:613:1: (lv_elseBlock_6_0= ruleIfBlock )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:614:3: lv_elseBlock_6_0= ruleIfBlock
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockIfBlockParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleIfBlock_in_ruleIfStatement1279);
                    lv_elseBlock_6_0=ruleIfBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfStatementRule());
                      	        }
                             		set(
                             			current, 
                             			"elseBlock",
                              		lv_elseBlock_6_0, 
                              		"IfBlock");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIfStatement"


    // $ANTLR start "entryRuleIfBlock"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:638:1: entryRuleIfBlock returns [EObject current=null] : iv_ruleIfBlock= ruleIfBlock EOF ;
    public final EObject entryRuleIfBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIfBlock = null;


        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:639:2: (iv_ruleIfBlock= ruleIfBlock EOF )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:640:2: iv_ruleIfBlock= ruleIfBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIfBlockRule()); 
            }
            pushFollow(FOLLOW_ruleIfBlock_in_entryRuleIfBlock1317);
            iv_ruleIfBlock=ruleIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIfBlock; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIfBlock1327); if (state.failed) return current;

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
    // $ANTLR end "entryRuleIfBlock"


    // $ANTLR start "ruleIfBlock"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:647:1: ruleIfBlock returns [EObject current=null] : ( ( (lv_elementos_0_0= ruleAbstractElement ) ) | (otherlv_1= '{' ( (lv_elementos_2_0= ruleAbstractElement ) )+ otherlv_3= '}' ) ) ;
    public final EObject ruleIfBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_elementos_0_0 = null;

        EObject lv_elementos_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:650:28: ( ( ( (lv_elementos_0_0= ruleAbstractElement ) ) | (otherlv_1= '{' ( (lv_elementos_2_0= ruleAbstractElement ) )+ otherlv_3= '}' ) ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:651:1: ( ( (lv_elementos_0_0= ruleAbstractElement ) ) | (otherlv_1= '{' ( (lv_elementos_2_0= ruleAbstractElement ) )+ otherlv_3= '}' ) )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:651:1: ( ( (lv_elementos_0_0= ruleAbstractElement ) ) | (otherlv_1= '{' ( (lv_elementos_2_0= ruleAbstractElement ) )+ otherlv_3= '}' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_INT)||(LA12_0>=20 && LA12_0<=21)||(LA12_0>=36 && LA12_0<=38)) ) {
                alt12=1;
            }
            else if ( (LA12_0==13) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:651:2: ( (lv_elementos_0_0= ruleAbstractElement ) )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:651:2: ( (lv_elementos_0_0= ruleAbstractElement ) )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:652:1: (lv_elementos_0_0= ruleAbstractElement )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:652:1: (lv_elementos_0_0= ruleAbstractElement )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:653:3: lv_elementos_0_0= ruleAbstractElement
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getIfBlockAccess().getElementosAbstractElementParserRuleCall_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAbstractElement_in_ruleIfBlock1373);
                    lv_elementos_0_0=ruleAbstractElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getIfBlockRule());
                      	        }
                             		add(
                             			current, 
                             			"elementos",
                              		lv_elementos_0_0, 
                              		"AbstractElement");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:670:6: (otherlv_1= '{' ( (lv_elementos_2_0= ruleAbstractElement ) )+ otherlv_3= '}' )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:670:6: (otherlv_1= '{' ( (lv_elementos_2_0= ruleAbstractElement ) )+ otherlv_3= '}' )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:670:8: otherlv_1= '{' ( (lv_elementos_2_0= ruleAbstractElement ) )+ otherlv_3= '}'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleIfBlock1392); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getIfBlockAccess().getLeftCurlyBracketKeyword_1_0());
                          
                    }
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:674:1: ( (lv_elementos_2_0= ruleAbstractElement ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_INT)||(LA11_0>=20 && LA11_0<=21)||(LA11_0>=36 && LA11_0<=38)) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:675:1: (lv_elementos_2_0= ruleAbstractElement )
                    	    {
                    	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:675:1: (lv_elementos_2_0= ruleAbstractElement )
                    	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:676:3: lv_elementos_2_0= ruleAbstractElement
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getIfBlockAccess().getElementosAbstractElementParserRuleCall_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleIfBlock1413);
                    	    lv_elementos_2_0=ruleAbstractElement();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getIfBlockRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"elementos",
                    	              		lv_elementos_2_0, 
                    	              		"AbstractElement");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleIfBlock1426); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getIfBlockAccess().getRightCurlyBracketKeyword_1_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleIfBlock"


    // $ANTLR start "entryRuleVariable"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:704:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:705:2: (iv_ruleVariable= ruleVariable EOF )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:706:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1463);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1473); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:713:1: ruleVariable returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:716:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:717:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:717:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:717:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:717:2: ( (lv_name_0_0= RULE_ID ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:718:1: (lv_name_0_0= RULE_ID )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:718:1: (lv_name_0_0= RULE_ID )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:719:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVariable1515); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVariableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleVariable1532); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:739:1: ( (lv_expression_2_0= ruleExpression ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:740:1: (lv_expression_2_0= ruleExpression )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:740:1: (lv_expression_2_0= ruleExpression )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:741:3: lv_expression_2_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleVariable1553);
            lv_expression_2_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_2_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleExpression"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:765:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:766:2: (iv_ruleExpression= ruleExpression EOF )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:767:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1589);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1599); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:774:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;


         enterRule(); 
            
        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:777:28: (this_Or_0= ruleOr )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:779:5: this_Or_0= ruleOr
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOr_in_ruleExpression1645);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Or_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:795:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:796:2: (iv_ruleOr= ruleOr EOF )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:797:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_ruleOr_in_entryRuleOr1679);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOr1689); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:804:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:807:28: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:808:1: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:808:1: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:809:5: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAnd_in_ruleOr1736);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_And_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:817:1: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==24) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:817:2: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:817:2: ()
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:818:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleOr1757); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	          
            	    }
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:827:1: ( (lv_right_3_0= ruleAnd ) )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:828:1: (lv_right_3_0= ruleAnd )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:828:1: (lv_right_3_0= ruleAnd )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:829:3: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAnd_in_ruleOr1778);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"And");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:853:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:854:2: (iv_ruleAnd= ruleAnd EOF )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:855:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_ruleAnd_in_entryRuleAnd1816);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnd1826); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:862:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:865:28: ( (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:866:1: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:866:1: (this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )* )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:867:5: this_Equality_0= ruleEquality ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEquality_in_ruleAnd1873);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Equality_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:875:1: ( () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:875:2: () otherlv_2= '&&' ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:875:2: ()
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:876:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleAnd1894); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	          
            	    }
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:885:1: ( (lv_right_3_0= ruleEquality ) )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:886:1: (lv_right_3_0= ruleEquality )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:886:1: (lv_right_3_0= ruleEquality )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:887:3: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEquality_in_ruleAnd1915);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Equality");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:911:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:912:2: (iv_ruleEquality= ruleEquality EOF )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:913:2: iv_ruleEquality= ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_ruleEquality_in_entryRuleEquality1953);
            iv_ruleEquality=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquality; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquality1963); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:920:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:923:28: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:924:1: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:924:1: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:925:5: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleEquality2010);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:933:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=26 && LA16_0<=27)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:933:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:933:2: ()
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:934:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:939:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:940:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:940:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:941:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:941:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==26) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==27) ) {
            	        alt15=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:942:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,26,FOLLOW_26_in_ruleEquality2039); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getEqualityRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:954:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,27,FOLLOW_27_in_ruleEquality2068); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getEqualityRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:969:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:970:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:970:1: (lv_right_3_0= ruleComparison )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:971:3: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparison_in_ruleEquality2105);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEqualityRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Comparison");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:995:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:996:2: (iv_ruleComparison= ruleComparison EOF )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:997:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison2143);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison2153); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1004:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1007:28: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1008:1: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1008:1: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1009:5: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePlusOrMinus_in_ruleComparison2200);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PlusOrMinus_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1017:1: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=28 && LA18_0<=31)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1017:2: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1017:2: ()
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1018:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1023:2: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1024:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1024:1: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1025:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1025:1: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt17=4;
            	    switch ( input.LA(1) ) {
            	    case 28:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case 29:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt17=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1026:3: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,28,FOLLOW_28_in_ruleComparison2229); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getComparisonRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1038:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,29,FOLLOW_29_in_ruleComparison2258); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getComparisonRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1050:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,30,FOLLOW_30_in_ruleComparison2287); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getComparisonRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1062:8: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,31,FOLLOW_31_in_ruleComparison2316); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getComparisonRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1077:2: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1078:1: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1078:1: (lv_right_3_0= rulePlusOrMinus )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1079:3: lv_right_3_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePlusOrMinus_in_ruleComparison2353);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"PlusOrMinus");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1103:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1104:2: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1105:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus2391);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusOrMinus; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePlusOrMinus2401); if (state.failed) return current;

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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1112:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1115:28: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1116:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1116:1: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1117:5: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2448);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MulOrDiv_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1125:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=32 && LA20_0<=33)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1125:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1125:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==32) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==33) ) {
            	        alt19=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1125:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1125:3: ( () otherlv_2= '+' )
            	            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1125:4: () otherlv_2= '+'
            	            {
            	            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1125:4: ()
            	            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1126:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,32,FOLLOW_32_in_rulePlusOrMinus2471); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1136:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1136:6: ( () otherlv_4= '-' )
            	            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1136:7: () otherlv_4= '-'
            	            {
            	            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1136:7: ()
            	            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1137:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,33,FOLLOW_33_in_rulePlusOrMinus2500); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1146:3: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1147:1: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1147:1: (lv_right_5_0= ruleMulOrDiv )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1148:3: lv_right_5_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2523);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_5_0, 
            	              		"MulOrDiv");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1172:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1173:2: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1174:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv2561);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulOrDiv; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMulOrDiv2571); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1181:1: ruleMulOrDiv returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1184:28: ( (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1185:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1185:1: (this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1186:5: this_Primary_0= rulePrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimary_in_ruleMulOrDiv2618);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Primary_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1194:1: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=34 && LA22_0<=35)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1194:2: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1194:2: ()
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1195:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1200:2: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1201:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1201:1: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1202:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1202:1: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==34) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==35) ) {
            	        alt21=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1203:3: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,34,FOLLOW_34_in_ruleMulOrDiv2647); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1215:8: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,35,FOLLOW_35_in_ruleMulOrDiv2676); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                      newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
            	                  
            	            }
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElement(grammarAccess.getMulOrDivRule());
            	              	        }
            	                     		setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1230:2: ( (lv_right_3_0= rulePrimary ) )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1231:1: (lv_right_3_0= rulePrimary )
            	    {
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1231:1: (lv_right_3_0= rulePrimary )
            	    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1232:3: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimary_in_ruleMulOrDiv2713);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Primary");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1256:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1257:2: (iv_rulePrimary= rulePrimary EOF )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1258:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_rulePrimary_in_entryRulePrimary2751);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimary2761); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1265:1: rulePrimary returns [EObject current=null] : ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Expression_1 = null;

        EObject lv_expression_5_0 = null;

        EObject this_Atomic_6 = null;


         enterRule(); 
            
        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1268:28: ( ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1269:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1269:1: ( (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' ) | ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) ) | this_Atomic_6= ruleAtomic )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt23=1;
                }
                break;
            case 36:
                {
                alt23=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 37:
            case 38:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1269:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1269:2: (otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')' )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1269:4: otherlv_0= '(' this_Expression_1= ruleExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_21_in_rulePrimary2799); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExpression_in_rulePrimary2821);
                    this_Expression_1=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Expression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,22,FOLLOW_22_in_rulePrimary2832); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1287:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1287:6: ( () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) ) )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1287:7: () otherlv_4= '!' ( (lv_expression_5_0= rulePrimary ) )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1287:7: ()
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1288:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,36,FOLLOW_36_in_rulePrimary2861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                          
                    }
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1297:1: ( (lv_expression_5_0= rulePrimary ) )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1298:1: (lv_expression_5_0= rulePrimary )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1298:1: (lv_expression_5_0= rulePrimary )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1299:3: lv_expression_5_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimary_in_rulePrimary2882);
                    lv_expression_5_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      	        }
                             		set(
                             			current, 
                             			"expression",
                              		lv_expression_5_0, 
                              		"Primary");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1317:5: this_Atomic_6= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrimary2911);
                    this_Atomic_6=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Atomic_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1333:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1334:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1335:2: iv_ruleAtomic= ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic2946);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic2956); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1342:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1345:28: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) ) )
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1346:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            {
            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1346:1: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (otherlv_7= RULE_ID ) ) ) )
            int alt25=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt25=1;
                }
                break;
            case RULE_STRING:
                {
                alt25=2;
                }
                break;
            case 37:
            case 38:
                {
                alt25=3;
                }
                break;
            case RULE_ID:
                {
                alt25=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1346:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1346:2: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1346:3: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1346:3: ()
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1347:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1352:2: ( (lv_value_1_0= RULE_INT ) )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1353:1: (lv_value_1_0= RULE_INT )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1353:1: (lv_value_1_0= RULE_INT )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1354:3: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAtomic3008); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1371:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1371:6: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1371:7: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1371:7: ()
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1372:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1377:2: ( (lv_value_3_0= RULE_STRING ) )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1378:1: (lv_value_3_0= RULE_STRING )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1378:1: (lv_value_3_0= RULE_STRING )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1379:3: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic3047); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"value",
                              		lv_value_3_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1396:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1396:6: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1396:7: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1396:7: ()
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1397:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1402:2: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1403:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1403:1: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1404:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1404:1: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==37) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==38) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1405:3: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,37,FOLLOW_37_in_ruleAtomic3089); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAtomicRule());
                              	        }
                                     		setWithLastConsumed(current, "value", lv_value_5_1, null);
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1417:8: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,38,FOLLOW_38_in_ruleAtomic3118); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                      newLeafNode(lv_value_5_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1());
                                  
                            }
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElement(grammarAccess.getAtomicRule());
                              	        }
                                     		setWithLastConsumed(current, "value", lv_value_5_2, null);
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1433:6: ( () ( (otherlv_7= RULE_ID ) ) )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1433:6: ( () ( (otherlv_7= RULE_ID ) ) )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1433:7: () ( (otherlv_7= RULE_ID ) )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1433:7: ()
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1434:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getVariableRefAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1439:2: ( (otherlv_7= RULE_ID ) )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1440:1: (otherlv_7= RULE_ID )
                    {
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1440:1: (otherlv_7= RULE_ID )
                    // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:1441:3: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                              
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAtomic3171); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getVariableVariableCrossReference_3_1_0()); 
                      	
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAtomic"

    // $ANTLR start synpred1_InternalIot
    public final void synpred1_InternalIot_fragment() throws RecognitionException {   
        // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:607:4: ( 'else' )
        // ../org.slf.iot/src-gen/org/slf/parser/antlr/internal/InternalIot.g:607:6: 'else'
        {
        match(input,23,FOLLOW_23_in_synpred1_InternalIot1249); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalIot

    // Delegated rules

    public final boolean synpred1_InternalIot() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalIot_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDispositivo_in_ruleModel130 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_ruleDispositivo_in_entryRuleDispositivo166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDispositivo176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleDispositivo213 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDispositivo230 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_12_in_ruleDispositivo248 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDispositivo268 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDispositivo282 = new BitSet(new long[]{0x000000000006C010L});
    public static final BitSet FOLLOW_ruleEtiqueta_in_ruleDispositivo303 = new BitSet(new long[]{0x000000000006C010L});
    public static final BitSet FOLLOW_ruleEstado_in_ruleDispositivo325 = new BitSet(new long[]{0x0000000000064010L});
    public static final BitSet FOLLOW_ruleEvento_in_ruleDispositivo347 = new BitSet(new long[]{0x0000000000024010L});
    public static final BitSet FOLLOW_ruleTransicion_in_ruleDispositivo369 = new BitSet(new long[]{0x0000000000004010L});
    public static final BitSet FOLLOW_14_in_ruleDispositivo382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEtiqueta_in_entryRuleEtiqueta418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEtiqueta428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleEtiqueta471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEtiqueta501 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleEtiqueta519 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEtiqueta536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvento_in_entryRuleEvento579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvento589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleEvento632 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvento662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEstado_in_entryRuleEstado703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEstado713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleEstado750 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEstado767 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleEstado784 = new BitSet(new long[]{0x0000007000304070L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleEstado805 = new BitSet(new long[]{0x0000007000304070L});
    public static final BitSet FOLLOW_14_in_ruleEstado818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransicion_in_entryRuleTransicion854 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransicion864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransicion909 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTransicion921 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransicion941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleAbstractElement1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleAbstractElement1061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_ruleAbstractElement1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfStatement_in_entryRuleIfStatement1123 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfStatement1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleIfStatement1170 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleIfStatement1182 = new BitSet(new long[]{0x0000007000200070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleIfStatement1203 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIfStatement1215 = new BitSet(new long[]{0x0000007000302070L});
    public static final BitSet FOLLOW_ruleIfBlock_in_ruleIfStatement1236 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleIfStatement1257 = new BitSet(new long[]{0x0000007000302070L});
    public static final BitSet FOLLOW_ruleIfBlock_in_ruleIfStatement1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIfBlock_in_entryRuleIfBlock1317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIfBlock1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleIfBlock1373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleIfBlock1392 = new BitSet(new long[]{0x0000007000300070L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleIfBlock1413 = new BitSet(new long[]{0x0000007000304070L});
    public static final BitSet FOLLOW_14_in_ruleIfBlock1426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVariable1515 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVariable1532 = new BitSet(new long[]{0x0000007000200070L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleVariable1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1589 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_ruleExpression1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOr_in_entryRuleOr1679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOr1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr1736 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleOr1757 = new BitSet(new long[]{0x0000007000200070L});
    public static final BitSet FOLLOW_ruleAnd_in_ruleOr1778 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleAnd_in_entryRuleAnd1816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnd1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd1873 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleAnd1894 = new BitSet(new long[]{0x0000007000200070L});
    public static final BitSet FOLLOW_ruleEquality_in_ruleAnd1915 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleEquality_in_entryRuleEquality1953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquality1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality2010 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_26_in_ruleEquality2039 = new BitSet(new long[]{0x0000007000200070L});
    public static final BitSet FOLLOW_27_in_ruleEquality2068 = new BitSet(new long[]{0x0000007000200070L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleEquality2105 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison2143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison2153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleComparison2200 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_28_in_ruleComparison2229 = new BitSet(new long[]{0x0000007000200070L});
    public static final BitSet FOLLOW_29_in_ruleComparison2258 = new BitSet(new long[]{0x0000007000200070L});
    public static final BitSet FOLLOW_30_in_ruleComparison2287 = new BitSet(new long[]{0x0000007000200070L});
    public static final BitSet FOLLOW_31_in_ruleComparison2316 = new BitSet(new long[]{0x0000007000200070L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_ruleComparison2353 = new BitSet(new long[]{0x00000000F0000002L});
    public static final BitSet FOLLOW_rulePlusOrMinus_in_entryRulePlusOrMinus2391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlusOrMinus2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2448 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_32_in_rulePlusOrMinus2471 = new BitSet(new long[]{0x0000007000200070L});
    public static final BitSet FOLLOW_33_in_rulePlusOrMinus2500 = new BitSet(new long[]{0x0000007000200070L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_rulePlusOrMinus2523 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_ruleMulOrDiv_in_entryRuleMulOrDiv2561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMulOrDiv2571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMulOrDiv2618 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_34_in_ruleMulOrDiv2647 = new BitSet(new long[]{0x0000007000200070L});
    public static final BitSet FOLLOW_35_in_ruleMulOrDiv2676 = new BitSet(new long[]{0x0000007000200070L});
    public static final BitSet FOLLOW_rulePrimary_in_ruleMulOrDiv2713 = new BitSet(new long[]{0x0000000C00000002L});
    public static final BitSet FOLLOW_rulePrimary_in_entryRulePrimary2751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimary2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rulePrimary2799 = new BitSet(new long[]{0x0000007000200070L});
    public static final BitSet FOLLOW_ruleExpression_in_rulePrimary2821 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePrimary2832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulePrimary2861 = new BitSet(new long[]{0x0000007000200070L});
    public static final BitSet FOLLOW_rulePrimary_in_rulePrimary2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrimary2911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic2946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic2956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAtomic3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleAtomic3089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleAtomic3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAtomic3171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_synpred1_InternalIot1249 = new BitSet(new long[]{0x0000000000000002L});

}
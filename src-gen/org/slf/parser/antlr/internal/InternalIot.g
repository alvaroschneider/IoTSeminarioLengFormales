/*
 * generated by Xtext
 */
grammar InternalIot;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.slf.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getDispositivosDispositivoParserRuleCall_0()); 
	    }
		lv_dispositivos_0_0=ruleDispositivo		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"dispositivos",
        		lv_dispositivos_0_0, 
        		"Dispositivo");
	        afterParserOrEnumRuleCall();
	    }

)
)*
;





// Entry rule entryRuleDispositivo
entryRuleDispositivo returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDispositivoRule()); }
	 iv_ruleDispositivo=ruleDispositivo 
	 { $current=$iv_ruleDispositivo.current; } 
	 EOF 
;

// Rule Dispositivo
ruleDispositivo returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='dispositivo' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDispositivoAccess().getDispositivoKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getDispositivoAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getDispositivoRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2='extends' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDispositivoAccess().getExtendsKeyword_2_0());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getDispositivoRule());
	        }
        }
	otherlv_3=RULE_ID
	{
		newLeafNode(otherlv_3, grammarAccess.getDispositivoAccess().getSuperTypeDispositivoCrossReference_2_1_0()); 
	}

)
))?	otherlv_4='{' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getDispositivoAccess().getLeftCurlyBracketKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDispositivoAccess().getEtiquetasEtiquetaParserRuleCall_4_0()); 
	    }
		lv_etiquetas_5_0=ruleEtiqueta		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDispositivoRule());
	        }
       		add(
       			$current, 
       			"etiquetas",
        		lv_etiquetas_5_0, 
        		"Etiqueta");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getDispositivoAccess().getEstadosEstadoParserRuleCall_5_0()); 
	    }
		lv_estados_6_0=ruleEstado		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDispositivoRule());
	        }
       		add(
       			$current, 
       			"estados",
        		lv_estados_6_0, 
        		"Estado");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getDispositivoAccess().getEventosEventoParserRuleCall_6_0()); 
	    }
		lv_eventos_7_0=ruleEvento		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDispositivoRule());
	        }
       		add(
       			$current, 
       			"eventos",
        		lv_eventos_7_0, 
        		"Evento");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getDispositivoAccess().getTransicionesTransicionParserRuleCall_7_0()); 
	    }
		lv_transiciones_8_0=ruleTransicion		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDispositivoRule());
	        }
       		add(
       			$current, 
       			"transiciones",
        		lv_transiciones_8_0, 
        		"Transicion");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_9='}' 
    {
    	newLeafNode(otherlv_9, grammarAccess.getDispositivoAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleEtiqueta
entryRuleEtiqueta returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEtiquetaRule()); }
	 iv_ruleEtiqueta=ruleEtiqueta 
	 { $current=$iv_ruleEtiqueta.current; } 
	 EOF 
;

// Rule Etiqueta
ruleEtiqueta returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_typeName_0_0=	'etiqueta' 
    {
        newLeafNode(lv_typeName_0_0, grammarAccess.getEtiquetaAccess().getTypeNameEtiquetaKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEtiquetaRule());
	        }
       		setWithLastConsumed($current, "typeName", lv_typeName_0_0, "etiqueta");
	    }

)
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getEtiquetaAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEtiquetaRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(	otherlv_2='=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEtiquetaAccess().getEqualsSignKeyword_2_0());
    }
(
(
		lv_value_3_0=RULE_STRING
		{
			newLeafNode(lv_value_3_0, grammarAccess.getEtiquetaAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEtiquetaRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_3_0, 
        		"STRING");
	    }

)
))?)
;





// Entry rule entryRuleEvento
entryRuleEvento returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEventoRule()); }
	 iv_ruleEvento=ruleEvento 
	 { $current=$iv_ruleEvento.current; } 
	 EOF 
;

// Rule Evento
ruleEvento returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_typeName_0_0=	'evento' 
    {
        newLeafNode(lv_typeName_0_0, grammarAccess.getEventoAccess().getTypeNameEventoKeyword_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEventoRule());
	        }
       		setWithLastConsumed($current, "typeName", lv_typeName_0_0, "evento");
	    }

)
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getEventoAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEventoRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleEstado
entryRuleEstado returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEstadoRule()); }
	 iv_ruleEstado=ruleEstado 
	 { $current=$iv_ruleEstado.current; } 
	 EOF 
;

// Rule Estado
ruleEstado returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='estado' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getEstadoAccess().getEstadoKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getEstadoAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEstadoRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='{' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getEstadoAccess().getLeftCurlyBracketKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getEstadoAccess().getElementosAbstractElementParserRuleCall_3_0()); 
	    }
		lv_elementos_3_0=ruleAbstractElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEstadoRule());
	        }
       		add(
       			$current, 
       			"elementos",
        		lv_elementos_3_0, 
        		"AbstractElement");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_4='}' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getEstadoAccess().getRightCurlyBracketKeyword_4());
    }
)
;





// Entry rule entryRuleTransicion
entryRuleTransicion returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTransicionRule()); }
	 iv_ruleTransicion=ruleTransicion 
	 { $current=$iv_ruleTransicion.current; } 
	 EOF 
;

// Rule Transicion
ruleTransicion returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransicionRule());
	        }
        }
	otherlv_0=RULE_ID
	{
		newLeafNode(otherlv_0, grammarAccess.getTransicionAccess().getEventoEventoCrossReference_0_0()); 
	}

)
)	otherlv_1='=>' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getTransicionAccess().getEqualsSignGreaterThanSignKeyword_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getTransicionRule());
	        }
        }
	otherlv_2=RULE_ID
	{
		newLeafNode(otherlv_2, grammarAccess.getTransicionAccess().getEstadoEstadoCrossReference_2_0()); 
	}

)
))
;





// Entry rule entryRuleAbstractElement
entryRuleAbstractElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAbstractElementRule()); }
	 iv_ruleAbstractElement=ruleAbstractElement 
	 { $current=$iv_ruleAbstractElement.current; } 
	 EOF 
;

// Rule AbstractElement
ruleAbstractElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); 
    }
    this_Variable_0=ruleVariable
    { 
        $current = $this_Variable_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractElementAccess().getExpressionParserRuleCall_1()); 
    }
    this_Expression_1=ruleExpression
    { 
        $current = $this_Expression_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getAbstractElementAccess().getIfStatementParserRuleCall_2()); 
    }
    this_IfStatement_2=ruleIfStatement
    { 
        $current = $this_IfStatement_2.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleIfStatement
entryRuleIfStatement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIfStatementRule()); }
	 iv_ruleIfStatement=ruleIfStatement 
	 { $current=$iv_ruleIfStatement.current; } 
	 EOF 
;

// Rule IfStatement
ruleIfStatement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='if' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getIfStatementAccess().getIfKeyword_0());
    }
	otherlv_1='(' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getIfStatementAccess().getLeftParenthesisKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIfStatementAccess().getExpressionExpressionParserRuleCall_2_0()); 
	    }
		lv_expression_2_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfStatementRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_2_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_3=')' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getIfStatementAccess().getRightParenthesisKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIfStatementAccess().getThenBlockIfBlockParserRuleCall_4_0()); 
	    }
		lv_thenBlock_4_0=ruleIfBlock		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfStatementRule());
	        }
       		set(
       			$current, 
       			"thenBlock",
        		lv_thenBlock_4_0, 
        		"IfBlock");
	        afterParserOrEnumRuleCall();
	    }

)
)(((	'else' 
)=>	otherlv_5='else' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getIfStatementAccess().getElseKeyword_5_0());
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getIfStatementAccess().getElseBlockIfBlockParserRuleCall_5_1_0()); 
	    }
		lv_elseBlock_6_0=ruleIfBlock		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfStatementRule());
	        }
       		set(
       			$current, 
       			"elseBlock",
        		lv_elseBlock_6_0, 
        		"IfBlock");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleIfBlock
entryRuleIfBlock returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getIfBlockRule()); }
	 iv_ruleIfBlock=ruleIfBlock 
	 { $current=$iv_ruleIfBlock.current; } 
	 EOF 
;

// Rule IfBlock
ruleIfBlock returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getIfBlockAccess().getElementosAbstractElementParserRuleCall_0_0()); 
	    }
		lv_elementos_0_0=ruleAbstractElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfBlockRule());
	        }
       		add(
       			$current, 
       			"elementos",
        		lv_elementos_0_0, 
        		"AbstractElement");
	        afterParserOrEnumRuleCall();
	    }

)
)
    |(	otherlv_1='{' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getIfBlockAccess().getLeftCurlyBracketKeyword_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getIfBlockAccess().getElementosAbstractElementParserRuleCall_1_1_0()); 
	    }
		lv_elementos_2_0=ruleAbstractElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getIfBlockRule());
	        }
       		add(
       			$current, 
       			"elementos",
        		lv_elementos_2_0, 
        		"AbstractElement");
	        afterParserOrEnumRuleCall();
	    }

)
)+	otherlv_3='}' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getIfBlockAccess().getRightCurlyBracketKeyword_1_2());
    }
))
;





// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	 iv_ruleVariable=ruleVariable 
	 { $current=$iv_ruleVariable.current; } 
	 EOF 
;

// Rule Variable
ruleVariable returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		lv_name_0_0=RULE_ID
		{
			newLeafNode(lv_name_0_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVariableRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_0_0, 
        		"ID");
	    }

)
)	otherlv_1='=' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getVariableAccess().getEqualsSignKeyword_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_2_0()); 
	    }
		lv_expression_2_0=ruleExpression		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVariableRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_2_0, 
        		"Expression");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	 iv_ruleExpression=ruleExpression 
	 { $current=$iv_ruleExpression.current; } 
	 EOF 
;

// Rule Expression
ruleExpression returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:

    { 
        newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall()); 
    }
    this_Or_0=ruleOr
    { 
        $current = $this_Or_0.current; 
        afterParserOrEnumRuleCall();
    }

;





// Entry rule entryRuleOr
entryRuleOr returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getOrRule()); }
	 iv_ruleOr=ruleOr 
	 { $current=$iv_ruleOr.current; } 
	 EOF 
;

// Rule Or
ruleOr returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0()); 
    }
    this_And_0=ruleAnd
    { 
        $current = $this_And_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            $current);
    }
)	otherlv_2='||' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleAnd		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getOrRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"And");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleAnd
entryRuleAnd returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAndRule()); }
	 iv_ruleAnd=ruleAnd 
	 { $current=$iv_ruleAnd.current; } 
	 EOF 
;

// Rule And
ruleAnd returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0()); 
    }
    this_Equality_0=ruleEquality
    { 
        $current = $this_Equality_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            $current);
    }
)	otherlv_2='&&' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleEquality		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getAndRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Equality");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleEquality
entryRuleEquality returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEqualityRule()); }
	 iv_ruleEquality=ruleEquality 
	 { $current=$iv_ruleEquality.current; } 
	 EOF 
;

// Rule Equality
ruleEquality returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0()); 
    }
    this_Comparison_0=ruleComparison
    { 
        $current = $this_Comparison_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            $current);
    }
)(
(
(
		lv_op_2_1=	'==' 
    {
        newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEqualityRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_1, null);
	    }

    |		lv_op_2_2=	'!=' 
    {
        newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getEqualityRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_2, null);
	    }

)

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=ruleComparison		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getEqualityRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Comparison");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleComparison
entryRuleComparison returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getComparisonRule()); }
	 iv_ruleComparison=ruleComparison 
	 { $current=$iv_ruleComparison.current; } 
	 EOF 
;

// Rule Comparison
ruleComparison returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0()); 
    }
    this_PlusOrMinus_0=rulePlusOrMinus
    { 
        $current = $this_PlusOrMinus_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            $current);
    }
)(
(
(
		lv_op_2_1=	'>=' 
    {
        newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getComparisonRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_1, null);
	    }

    |		lv_op_2_2=	'<=' 
    {
        newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getComparisonRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_2, null);
	    }

    |		lv_op_2_3=	'>' 
    {
        newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getComparisonRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_3, null);
	    }

    |		lv_op_2_4=	'<' 
    {
        newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getComparisonRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_4, null);
	    }

)

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=rulePlusOrMinus		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getComparisonRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"PlusOrMinus");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRulePlusOrMinus
entryRulePlusOrMinus returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPlusOrMinusRule()); }
	 iv_rulePlusOrMinus=rulePlusOrMinus 
	 { $current=$iv_rulePlusOrMinus.current; } 
	 EOF 
;

// Rule PlusOrMinus
rulePlusOrMinus returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
    }
    this_MulOrDiv_0=ruleMulOrDiv
    { 
        $current = $this_MulOrDiv_0.current; 
        afterParserOrEnumRuleCall();
    }
((((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            $current);
    }
)	otherlv_2='+' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1());
    }
)
    |((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            $current);
    }
)	otherlv_4='-' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1());
    }
))(
(
		{ 
	        newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
	    }
		lv_right_5_0=ruleMulOrDiv		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_5_0, 
        		"MulOrDiv");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRuleMulOrDiv
entryRuleMulOrDiv returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getMulOrDivRule()); }
	 iv_ruleMulOrDiv=ruleMulOrDiv 
	 { $current=$iv_ruleMulOrDiv.current; } 
	 EOF 
;

// Rule MulOrDiv
ruleMulOrDiv returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
    }
    this_Primary_0=rulePrimary
    { 
        $current = $this_Primary_0.current; 
        afterParserOrEnumRuleCall();
    }
((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0(),
            $current);
    }
)(
(
(
		lv_op_2_1=	'*' 
    {
        newLeafNode(lv_op_2_1, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMulOrDivRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_1, null);
	    }

    |		lv_op_2_2=	'/' 
    {
        newLeafNode(lv_op_2_2, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_1_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getMulOrDivRule());
	        }
       		setWithLastConsumed($current, "op", lv_op_2_2, null);
	    }

)

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_2_0()); 
	    }
		lv_right_3_0=rulePrimary		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getMulOrDivRule());
	        }
       		set(
       			$current, 
       			"right",
        		lv_right_3_0, 
        		"Primary");
	        afterParserOrEnumRuleCall();
	    }

)
))*)
;





// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	 iv_rulePrimary=rulePrimary 
	 { $current=$iv_rulePrimary.current; } 
	 EOF 
;

// Rule Primary
rulePrimary returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((	otherlv_0='(' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_0());
    }

    { 
        newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_0_1()); 
    }
    this_Expression_1=ruleExpression
    { 
        $current = $this_Expression_1.current; 
        afterParserOrEnumRuleCall();
    }
	otherlv_2=')' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_2());
    }
)
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getPrimaryAccess().getNotAction_1_0(),
            $current);
    }
)	otherlv_4='!' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0()); 
	    }
		lv_expression_5_0=rulePrimary		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPrimaryRule());
	        }
       		set(
       			$current, 
       			"expression",
        		lv_expression_5_0, 
        		"Primary");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |
    { 
        newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2()); 
    }
    this_Atomic_6=ruleAtomic
    { 
        $current = $this_Atomic_6.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleAtomic
entryRuleAtomic returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getAtomicRule()); }
	 iv_ruleAtomic=ruleAtomic 
	 { $current=$iv_ruleAtomic.current; } 
	 EOF 
;

// Rule Atomic
ruleAtomic returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
            $current);
    }
)(
(
		lv_value_1_0=RULE_INT
		{
			newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_1_0, 
        		"INT");
	    }

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAtomicAccess().getStringConstantAction_1_0(),
            $current);
    }
)(
(
		lv_value_3_0=RULE_STRING
		{
			newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"value",
        		lv_value_3_0, 
        		"STRING");
	    }

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
            $current);
    }
)(
(
(
		lv_value_5_1=	'true' 
    {
        newLeafNode(lv_value_5_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_5_1, null);
	    }

    |		lv_value_5_2=	'false' 
    {
        newLeafNode(lv_value_5_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_2_1_0_1());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicRule());
	        }
       		setWithLastConsumed($current, "value", lv_value_5_2, null);
	    }

)

)
))
    |((
    {
        $current = forceCreateModelElement(
            grammarAccess.getAtomicAccess().getVariableRefAction_3_0(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getAtomicRule());
	        }
        }
	otherlv_7=RULE_ID
	{
		newLeafNode(otherlv_7, grammarAccess.getAtomicAccess().getVariableVariableCrossReference_3_1_0()); 
	}

)
)))
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;



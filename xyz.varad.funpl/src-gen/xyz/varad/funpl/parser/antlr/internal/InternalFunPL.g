/*
 * generated by Xtext 2.14.0
 */
grammar InternalFunPL;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package xyz.varad.funpl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package xyz.varad.funpl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xyz.varad.funpl.services.FunPLGrammarAccess;

}

@parser::members {

 	private FunPLGrammarAccess grammarAccess;

    public InternalFunPLParser(TokenStream input, FunPLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "FunProgram";
   	}

   	@Override
   	protected FunPLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFunProgram
entryRuleFunProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunProgramRule()); }
	iv_ruleFunProgram=ruleFunProgram
	{ $current=$iv_ruleFunProgram.current; }
	EOF;

// Rule FunProgram
ruleFunProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getFunProgramAccess().getElementsAbstractElementParserRuleCall_0());
			}
			lv_elements_0_0=ruleAbstractElement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getFunProgramRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"xyz.varad.funpl.FunPL.AbstractElement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleAbstractElement
entryRuleAbstractElement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractElementRule()); }
	iv_ruleAbstractElement=ruleAbstractElement
	{ $current=$iv_ruleAbstractElement.current; }
	EOF;

// Rule AbstractElement
ruleAbstractElement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getAbstractElementAccess().getDefinitionParserRuleCall());
	}
	this_Definition_0=ruleDefinition
	{
		$current = $this_Definition_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleDefinition
entryRuleDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDefinitionRule()); }
	iv_ruleDefinition=ruleDefinition
	{ $current=$iv_ruleDefinition.current; }
	EOF;

// Rule Definition
ruleDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getDefinitionAccess().getValueParserRuleCall_0());
		}
		this_Value_0=ruleValue
		{
			$current = $this_Value_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getDefinitionAccess().getFunctionParserRuleCall_1());
		}
		this_Function_1=ruleFunction
		{
			$current = $this_Function_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleValue
entryRuleValue returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getValueRule()); }
	iv_ruleValue=ruleValue
	{ $current=$iv_ruleValue.current; }
	EOF;

// Rule Value
ruleValue returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_const_0_0='const'
					{
						newLeafNode(lv_const_0_0, grammarAccess.getValueAccess().getConstConstKeyword_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getValueRule());
						}
						setWithLastConsumed($current, "const", true, "const");
					}
				)
			)
			    |
			otherlv_1='var'
			{
				newLeafNode(otherlv_1, grammarAccess.getValueAccess().getVarKeyword_0_1());
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getValueAccess().getTypeTypeParserRuleCall_1_0());
				}
				lv_type_2_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getValueRule());
					}
					set(
						$current,
						"type",
						lv_type_2_0,
						"xyz.varad.funpl.FunPL.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getValueAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getValueRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_4='='
			{
				newLeafNode(otherlv_4, grammarAccess.getValueAccess().getEqualsSignKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getValueAccess().getExpressionExpressionParserRuleCall_3_1_0());
					}
					lv_expression_5_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getValueRule());
						}
						set(
							$current,
							"expression",
							lv_expression_5_0,
							"xyz.varad.funpl.FunPL.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_6=';'
		{
			newLeafNode(otherlv_6, grammarAccess.getValueAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	iv_ruleFunction=ruleFunction
	{ $current=$iv_ruleFunction.current; }
	EOF;

// Rule Function
ruleFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='function'
		{
			newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionAccess().getTypeTypeParserRuleCall_1_0());
				}
				lv_type_1_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionRule());
					}
					set(
						$current,
						"type",
						lv_type_1_0,
						"xyz.varad.funpl.FunPL.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='('
		{
			newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionAccess().getParamsFunctionParamParserRuleCall_4_0_0());
					}
					lv_params_4_0=ruleFunctionParam
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionRule());
						}
						add(
							$current,
							"params",
							lv_params_4_0,
							"xyz.varad.funpl.FunPL.FunctionParam");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getCommaKeyword_4_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFunctionAccess().getParamsFunctionParamParserRuleCall_4_1_1_0());
						}
						lv_params_6_0=ruleFunctionParam
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFunctionRule());
							}
							add(
								$current,
								"params",
								lv_params_6_0,
								"xyz.varad.funpl.FunPL.FunctionParam");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionAccess().getBodyBlockParserRuleCall_6_0());
				}
				lv_body_8_0=ruleBlock
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionRule());
					}
					set(
						$current,
						"body",
						lv_body_8_0,
						"xyz.varad.funpl.FunPL.Block");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleFunctionParam
entryRuleFunctionParam returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionParamRule()); }
	iv_ruleFunctionParam=ruleFunctionParam
	{ $current=$iv_ruleFunctionParam.current; }
	EOF;

// Rule FunctionParam
ruleFunctionParam returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getFunctionParamAccess().getTypeTypeParserRuleCall_0_0());
				}
				lv_type_0_0=ruleType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFunctionParamRule());
					}
					set(
						$current,
						"type",
						lv_type_0_0,
						"xyz.varad.funpl.FunPL.Type");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFunctionParamAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionParamRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleBlock
entryRuleBlock returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBlockRule()); }
	iv_ruleBlock=ruleBlock
	{ $current=$iv_ruleBlock.current; }
	EOF;

// Rule Block
ruleBlock returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getBlockAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBlockAccess().getBlockAction_1(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBlockAccess().getStatementsStatementParserRuleCall_2_0());
				}
				lv_statements_2_0=ruleStatement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBlockRule());
					}
					add(
						$current,
						"statements",
						lv_statements_2_0,
						"xyz.varad.funpl.FunPL.Statement");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='}'
		{
			newLeafNode(otherlv_3, grammarAccess.getBlockAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getValueParserRuleCall_0());
		}
		this_Value_0=ruleValue
		{
			$current = $this_Value_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			{
				newCompositeNode(grammarAccess.getStatementAccess().getExpressionParserRuleCall_1_0());
			}
			this_Expression_1=ruleExpression
			{
				$current = $this_Expression_1.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_2=';'
			{
				newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getSemicolonKeyword_1_1());
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getReturnStatementParserRuleCall_2());
		}
		this_ReturnStatement_3=ruleReturnStatement
		{
			$current = $this_ReturnStatement_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleReturnStatement
entryRuleReturnStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReturnStatementRule()); }
	iv_ruleReturnStatement=ruleReturnStatement
	{ $current=$iv_ruleReturnStatement.current; }
	EOF;

// Rule ReturnStatement
ruleReturnStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='return'
		{
			newLeafNode(otherlv_0, grammarAccess.getReturnStatementAccess().getReturnKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getReturnStatementAccess().getExpressionExpressionParserRuleCall_1_0());
				}
				lv_expression_1_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReturnStatementRule());
					}
					set(
						$current,
						"expression",
						lv_expression_1_0,
						"xyz.varad.funpl.FunPL.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getReturnStatementAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getTypeAccess().getTypeDefinitionParserRuleCall());
	}
	this_TypeDefinition_0=ruleTypeDefinition
	{
		$current = $this_TypeDefinition_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleTypeDefinition
entryRuleTypeDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeDefinitionRule()); }
	iv_ruleTypeDefinition=ruleTypeDefinition
	{ $current=$iv_ruleTypeDefinition.current; }
	EOF;

// Rule TypeDefinition
ruleTypeDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTypeDefinitionAccess().getIntTypeDefinitionParserRuleCall_0());
		}
		this_IntTypeDefinition_0=ruleIntTypeDefinition
		{
			$current = $this_IntTypeDefinition_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeDefinitionAccess().getBoolTypeDefinitionParserRuleCall_1());
		}
		this_BoolTypeDefinition_1=ruleBoolTypeDefinition
		{
			$current = $this_BoolTypeDefinition_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeDefinitionAccess().getStringTypeDefinitionParserRuleCall_2());
		}
		this_StringTypeDefinition_2=ruleStringTypeDefinition
		{
			$current = $this_StringTypeDefinition_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleIntTypeDefinition
entryRuleIntTypeDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntTypeDefinitionRule()); }
	iv_ruleIntTypeDefinition=ruleIntTypeDefinition
	{ $current=$iv_ruleIntTypeDefinition.current; }
	EOF;

// Rule IntTypeDefinition
ruleIntTypeDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getIntTypeDefinitionAccess().getIntTypeDefinitionAction_0(),
					$current);
			}
		)
		otherlv_1='int'
		{
			newLeafNode(otherlv_1, grammarAccess.getIntTypeDefinitionAccess().getIntKeyword_1());
		}
	)
;

// Entry rule entryRuleBoolTypeDefinition
entryRuleBoolTypeDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBoolTypeDefinitionRule()); }
	iv_ruleBoolTypeDefinition=ruleBoolTypeDefinition
	{ $current=$iv_ruleBoolTypeDefinition.current; }
	EOF;

// Rule BoolTypeDefinition
ruleBoolTypeDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getBoolTypeDefinitionAccess().getBoolTypeDefinitionAction_0(),
					$current);
			}
		)
		otherlv_1='bool'
		{
			newLeafNode(otherlv_1, grammarAccess.getBoolTypeDefinitionAccess().getBoolKeyword_1());
		}
	)
;

// Entry rule entryRuleStringTypeDefinition
entryRuleStringTypeDefinition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringTypeDefinitionRule()); }
	iv_ruleStringTypeDefinition=ruleStringTypeDefinition
	{ $current=$iv_ruleStringTypeDefinition.current; }
	EOF;

// Rule StringTypeDefinition
ruleStringTypeDefinition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getStringTypeDefinitionAccess().getStringTypeDefinitionAction_0(),
					$current);
			}
		)
		otherlv_1='string'
		{
			newLeafNode(otherlv_1, grammarAccess.getStringTypeDefinitionAccess().getStringKeyword_1());
		}
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getExpressionAccess().getAssignmentParserRuleCall());
	}
	this_Assignment_0=ruleAssignment
	{
		$current = $this_Assignment_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleAssignment
entryRuleAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAssignmentRule()); }
	iv_ruleAssignment=ruleAssignment
	{ $current=$iv_ruleAssignment.current; }
	EOF;

// Rule Assignment
ruleAssignment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAssignmentAccess().getPlusParserRuleCall_0());
		}
		this_Plus_0=rulePlus
		{
			$current = $this_Plus_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAssignmentAccess().getAssignmentLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='='
			{
				newLeafNode(otherlv_2, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAssignmentAccess().getRightExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAssignmentRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"xyz.varad.funpl.FunPL.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRulePlus
entryRulePlus returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlusRule()); }
	iv_rulePlus=rulePlus
	{ $current=$iv_rulePlus.current; }
	EOF;

// Rule Plus
rulePlus returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPlusAccess().getPrimaryExpressionParserRuleCall_0());
		}
		this_PrimaryExpression_0=rulePrimaryExpression
		{
			$current = $this_PrimaryExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getPlusAccess().getPlusLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='+'
			{
				newLeafNode(otherlv_2, grammarAccess.getPlusAccess().getPlusSignKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPlusAccess().getRightPrimaryExpressionParserRuleCall_1_2_0());
					}
					lv_right_3_0=rulePrimaryExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPlusRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"xyz.varad.funpl.FunPL.PrimaryExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrimaryExpression
entryRulePrimaryExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryExpressionRule()); }
	iv_rulePrimaryExpression=rulePrimaryExpression
	{ $current=$iv_rulePrimaryExpression.current; }
	EOF;

// Rule PrimaryExpression
rulePrimaryExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='('
			{
				newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
			}
			{
				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpressionParserRuleCall_0_1());
			}
			this_Expression_1=ruleExpression
			{
				$current = $this_Expression_1.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_2=')'
			{
				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getFunctionCallParserRuleCall_1());
		}
		this_FunctionCall_3=ruleFunctionCall
		{
			$current = $this_FunctionCall_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getTerminalExpressionParserRuleCall_2());
		}
		this_TerminalExpression_4=ruleTerminalExpression
		{
			$current = $this_TerminalExpression_4.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleFunctionCall
entryRuleFunctionCall returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionCallRule()); }
	iv_ruleFunctionCall=ruleFunctionCall
	{ $current=$iv_ruleFunctionCall.current; }
	EOF;

// Rule FunctionCall
ruleFunctionCall returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFunctionCallAccess().getFunctionCallAction_0(),
					$current);
			}
		)
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionCallRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getFunctionCallAccess().getFunctionFunctionCrossReference_1_0());
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getFunctionCallAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_3_0_0());
					}
					lv_args_3_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionCallRule());
						}
						add(
							$current,
							"args",
							lv_args_3_0,
							"xyz.varad.funpl.FunPL.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getFunctionCallAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFunctionCallAccess().getArgsExpressionParserRuleCall_3_1_1_0());
						}
						lv_args_5_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFunctionCallRule());
							}
							add(
								$current,
								"args",
								lv_args_5_0,
								"xyz.varad.funpl.FunPL.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getFunctionCallAccess().getRightParenthesisKeyword_4());
		}
	)
;

// Entry rule entryRuleTerminalExpression
entryRuleTerminalExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTerminalExpressionRule()); }
	iv_ruleTerminalExpression=ruleTerminalExpression
	{ $current=$iv_ruleTerminalExpression.current; }
	EOF;

// Rule TerminalExpression
ruleTerminalExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTerminalExpressionAccess().getIntConstantAction_0_0(),
						$current);
				}
			)
			(
				(
					lv_value_1_0=RULE_INT
					{
						newLeafNode(lv_value_1_0, grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalExpressionRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_1_0,
							"org.eclipse.xtext.common.Terminals.INT");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTerminalExpressionAccess().getStringConstantAction_1_0(),
						$current);
				}
			)
			(
				(
					lv_value_3_0=RULE_STRING
					{
						newLeafNode(lv_value_3_0, grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalExpressionRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_3_0,
							"org.eclipse.xtext.common.Terminals.STRING");
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTerminalExpressionAccess().getBoolConstantAction_2_0(),
						$current);
				}
			)
			(
				(
					(
						lv_value_5_1='true'
						{
							newLeafNode(lv_value_5_1, grammarAccess.getTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTerminalExpressionRule());
							}
							setWithLastConsumed($current, "value", lv_value_5_1, null);
						}
						    |
						lv_value_5_2='false'
						{
							newLeafNode(lv_value_5_2, grammarAccess.getTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getTerminalExpressionRule());
							}
							setWithLastConsumed($current, "value", lv_value_5_2, null);
						}
					)
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getTerminalExpressionAccess().getSymbolRefAction_3_0(),
						$current);
				}
			)
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTerminalExpressionRule());
						}
					}
					otherlv_7=RULE_ID
					{
						newLeafNode(otherlv_7, grammarAccess.getTerminalExpressionAccess().getSymbolSymbolCrossReference_3_1_0());
					}
				)
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

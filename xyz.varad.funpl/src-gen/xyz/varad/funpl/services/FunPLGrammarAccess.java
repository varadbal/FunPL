/*
 * generated by Xtext 2.14.0
 */
package xyz.varad.funpl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class FunPLGrammarAccess extends AbstractGrammarElementFinder {
	
	public class FunProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xyz.varad.funpl.FunPL.FunProgram");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsFunAbstractElementParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//FunProgram:
		//	elements+=FunAbstractElement*;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=FunAbstractElement*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//FunAbstractElement
		public RuleCall getElementsFunAbstractElementParserRuleCall_0() { return cElementsFunAbstractElementParserRuleCall_0; }
	}
	public class FunAbstractElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xyz.varad.funpl.FunPL.FunAbstractElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFunVarDeclarationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFunMethodParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//FunAbstractElement:
		//	FunVarDeclaration | FunMethod;
		@Override public ParserRule getRule() { return rule; }
		
		//FunVarDeclaration | FunMethod
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//FunVarDeclaration
		public RuleCall getFunVarDeclarationParserRuleCall_0() { return cFunVarDeclarationParserRuleCall_0; }
		
		//FunMethod
		public RuleCall getFunMethodParserRuleCall_1() { return cFunMethodParserRuleCall_1; }
	}
	public class FunVarDeclarationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xyz.varad.funpl.FunPL.FunVarDeclaration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cEqualsSignKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cValueAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValueFunExpressionParserRuleCall_2_1_0 = (RuleCall)cValueAssignment_2_1.eContents().get(0);
		
		//FunVarDeclaration:
		//	'var' name=ID ('=' value=FunExpression)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'var' name=ID ('=' value=FunExpression)?
		public Group getGroup() { return cGroup; }
		
		//'var'
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('=' value=FunExpression)?
		public Group getGroup_2() { return cGroup_2; }
		
		//'='
		public Keyword getEqualsSignKeyword_2_0() { return cEqualsSignKeyword_2_0; }
		
		//value=FunExpression
		public Assignment getValueAssignment_2_1() { return cValueAssignment_2_1; }
		
		//FunExpression
		public RuleCall getValueFunExpressionParserRuleCall_2_1_0() { return cValueFunExpressionParserRuleCall_2_1_0; }
	}
	public class FunMethodElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xyz.varad.funpl.FunPL.FunMethod");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMethodKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cParamsAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cParamsFunParameterParserRuleCall_3_0_0 = (RuleCall)cParamsAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cParamsAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cParamsFunParameterParserRuleCall_3_1_1_0 = (RuleCall)cParamsAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cBodyAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cBodyFunBlockParserRuleCall_5_0 = (RuleCall)cBodyAssignment_5.eContents().get(0);
		
		//FunMethod:
		//	'method' name=ID '(' (params+=FunParameter (',' params+=FunParameter)*)? ')'
		//	body=FunBlock;
		@Override public ParserRule getRule() { return rule; }
		
		//'method' name=ID '(' (params+=FunParameter (',' params+=FunParameter)*)? ')' body=FunBlock
		public Group getGroup() { return cGroup; }
		
		//'method'
		public Keyword getMethodKeyword_0() { return cMethodKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//(params+=FunParameter (',' params+=FunParameter)*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//params+=FunParameter
		public Assignment getParamsAssignment_3_0() { return cParamsAssignment_3_0; }
		
		//FunParameter
		public RuleCall getParamsFunParameterParserRuleCall_3_0_0() { return cParamsFunParameterParserRuleCall_3_0_0; }
		
		//(',' params+=FunParameter)*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//','
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//params+=FunParameter
		public Assignment getParamsAssignment_3_1_1() { return cParamsAssignment_3_1_1; }
		
		//FunParameter
		public RuleCall getParamsFunParameterParserRuleCall_3_1_1_0() { return cParamsFunParameterParserRuleCall_3_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//body=FunBlock
		public Assignment getBodyAssignment_5() { return cBodyAssignment_5; }
		
		//FunBlock
		public RuleCall getBodyFunBlockParserRuleCall_5_0() { return cBodyFunBlockParserRuleCall_5_0; }
	}
	public class FunBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xyz.varad.funpl.FunPL.FunBlock");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cFunBlockAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cStatementsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cStatementsFunStatementParserRuleCall_2_0 = (RuleCall)cStatementsAssignment_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//FunBlock:
		//	{FunBlock} '{' statements+=FunStatement* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//{FunBlock} '{' statements+=FunStatement* '}'
		public Group getGroup() { return cGroup; }
		
		//{FunBlock}
		public Action getFunBlockAction_0() { return cFunBlockAction_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_1() { return cLeftCurlyBracketKeyword_1; }
		
		//statements+=FunStatement*
		public Assignment getStatementsAssignment_2() { return cStatementsAssignment_2; }
		
		//FunStatement
		public RuleCall getStatementsFunStatementParserRuleCall_2_0() { return cStatementsFunStatementParserRuleCall_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class FunParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xyz.varad.funpl.FunPL.FunParameter");
		private final Assignment cNameAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0 = (RuleCall)cNameAssignment.eContents().get(0);
		
		//FunParameter:
		//	name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID
		public Assignment getNameAssignment() { return cNameAssignment; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0() { return cNameIDTerminalRuleCall_0; }
	}
	public class FunStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xyz.varad.funpl.FunPL.FunStatement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFunVarDeclarationParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFunExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//FunStatement:
		//	FunVarDeclaration | FunExpression;
		@Override public ParserRule getRule() { return rule; }
		
		//FunVarDeclaration | FunExpression
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//FunVarDeclaration
		public RuleCall getFunVarDeclarationParserRuleCall_0() { return cFunVarDeclarationParserRuleCall_0; }
		
		//FunExpression
		public RuleCall getFunExpressionParserRuleCall_1() { return cFunExpressionParserRuleCall_1; }
	}
	public class FunExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xyz.varad.funpl.FunPL.FunExpression");
		private final RuleCall cFunPlusParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//FunExpression:
		//	FunPlus;
		@Override public ParserRule getRule() { return rule; }
		
		//FunPlus
		public RuleCall getFunPlusParserRuleCall() { return cFunPlusParserRuleCall; }
	}
	public class FunPlusElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xyz.varad.funpl.FunPL.FunPlus");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cFunPrimaryParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cFunPlusLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightFunPrimaryParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//FunPlus FunExpression:
		//	FunPrimary ({FunPlus.left=current} '+' right=FunPrimary)*;
		@Override public ParserRule getRule() { return rule; }
		
		//FunPrimary ({FunPlus.left=current} '+' right=FunPrimary)*
		public Group getGroup() { return cGroup; }
		
		//FunPrimary
		public RuleCall getFunPrimaryParserRuleCall_0() { return cFunPrimaryParserRuleCall_0; }
		
		//({FunPlus.left=current} '+' right=FunPrimary)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{FunPlus.left=current}
		public Action getFunPlusLeftAction_1_0() { return cFunPlusLeftAction_1_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_1() { return cPlusSignKeyword_1_1; }
		
		//right=FunPrimary
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//FunPrimary
		public RuleCall getRightFunPrimaryParserRuleCall_1_2_0() { return cRightFunPrimaryParserRuleCall_1_2_0; }
	}
	public class FunPrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xyz.varad.funpl.FunPL.FunPrimary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final RuleCall cFunExpressionParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final RuleCall cFunAtomicParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//FunPrimary FunExpression:
		//	'(' FunExpression ')' | FunAtomic;
		@Override public ParserRule getRule() { return rule; }
		
		//'(' FunExpression ')' | FunAtomic
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'(' FunExpression ')'
		public Group getGroup_0() { return cGroup_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_0() { return cLeftParenthesisKeyword_0_0; }
		
		//FunExpression
		public RuleCall getFunExpressionParserRuleCall_0_1() { return cFunExpressionParserRuleCall_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_2() { return cRightParenthesisKeyword_0_2; }
		
		//FunAtomic
		public RuleCall getFunAtomicParserRuleCall_1() { return cFunAtomicParserRuleCall_1; }
	}
	public class FunAtomicElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "xyz.varad.funpl.FunPL.FunAtomic");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cStringConstantAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_0_1_0 = (RuleCall)cValueAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cIntConstantAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_1_1_0 = (RuleCall)cValueAssignment_1_1.eContents().get(0);
		
		//FunAtomic:
		//	{StringConstant} value=STRING | {IntConstant} value=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//{StringConstant} value=STRING | {IntConstant} value=INT
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{StringConstant} value=STRING
		public Group getGroup_0() { return cGroup_0; }
		
		//{StringConstant}
		public Action getStringConstantAction_0_0() { return cStringConstantAction_0_0; }
		
		//value=STRING
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_0_1_0() { return cValueSTRINGTerminalRuleCall_0_1_0; }
		
		//{IntConstant} value=INT
		public Group getGroup_1() { return cGroup_1; }
		
		//{IntConstant}
		public Action getIntConstantAction_1_0() { return cIntConstantAction_1_0; }
		
		//value=INT
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_1_1_0() { return cValueINTTerminalRuleCall_1_1_0; }
	}
	
	
	private final FunProgramElements pFunProgram;
	private final FunAbstractElementElements pFunAbstractElement;
	private final FunVarDeclarationElements pFunVarDeclaration;
	private final FunMethodElements pFunMethod;
	private final FunBlockElements pFunBlock;
	private final FunParameterElements pFunParameter;
	private final FunStatementElements pFunStatement;
	private final FunExpressionElements pFunExpression;
	private final FunPlusElements pFunPlus;
	private final FunPrimaryElements pFunPrimary;
	private final FunAtomicElements pFunAtomic;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public FunPLGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pFunProgram = new FunProgramElements();
		this.pFunAbstractElement = new FunAbstractElementElements();
		this.pFunVarDeclaration = new FunVarDeclarationElements();
		this.pFunMethod = new FunMethodElements();
		this.pFunBlock = new FunBlockElements();
		this.pFunParameter = new FunParameterElements();
		this.pFunStatement = new FunStatementElements();
		this.pFunExpression = new FunExpressionElements();
		this.pFunPlus = new FunPlusElements();
		this.pFunPrimary = new FunPrimaryElements();
		this.pFunAtomic = new FunAtomicElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("xyz.varad.funpl.FunPL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//FunProgram:
	//	elements+=FunAbstractElement*;
	public FunProgramElements getFunProgramAccess() {
		return pFunProgram;
	}
	
	public ParserRule getFunProgramRule() {
		return getFunProgramAccess().getRule();
	}
	
	//FunAbstractElement:
	//	FunVarDeclaration | FunMethod;
	public FunAbstractElementElements getFunAbstractElementAccess() {
		return pFunAbstractElement;
	}
	
	public ParserRule getFunAbstractElementRule() {
		return getFunAbstractElementAccess().getRule();
	}
	
	//FunVarDeclaration:
	//	'var' name=ID ('=' value=FunExpression)?;
	public FunVarDeclarationElements getFunVarDeclarationAccess() {
		return pFunVarDeclaration;
	}
	
	public ParserRule getFunVarDeclarationRule() {
		return getFunVarDeclarationAccess().getRule();
	}
	
	//FunMethod:
	//	'method' name=ID '(' (params+=FunParameter (',' params+=FunParameter)*)? ')'
	//	body=FunBlock;
	public FunMethodElements getFunMethodAccess() {
		return pFunMethod;
	}
	
	public ParserRule getFunMethodRule() {
		return getFunMethodAccess().getRule();
	}
	
	//FunBlock:
	//	{FunBlock} '{' statements+=FunStatement* '}';
	public FunBlockElements getFunBlockAccess() {
		return pFunBlock;
	}
	
	public ParserRule getFunBlockRule() {
		return getFunBlockAccess().getRule();
	}
	
	//FunParameter:
	//	name=ID;
	public FunParameterElements getFunParameterAccess() {
		return pFunParameter;
	}
	
	public ParserRule getFunParameterRule() {
		return getFunParameterAccess().getRule();
	}
	
	//FunStatement:
	//	FunVarDeclaration | FunExpression;
	public FunStatementElements getFunStatementAccess() {
		return pFunStatement;
	}
	
	public ParserRule getFunStatementRule() {
		return getFunStatementAccess().getRule();
	}
	
	//FunExpression:
	//	FunPlus;
	public FunExpressionElements getFunExpressionAccess() {
		return pFunExpression;
	}
	
	public ParserRule getFunExpressionRule() {
		return getFunExpressionAccess().getRule();
	}
	
	//FunPlus FunExpression:
	//	FunPrimary ({FunPlus.left=current} '+' right=FunPrimary)*;
	public FunPlusElements getFunPlusAccess() {
		return pFunPlus;
	}
	
	public ParserRule getFunPlusRule() {
		return getFunPlusAccess().getRule();
	}
	
	//FunPrimary FunExpression:
	//	'(' FunExpression ')' | FunAtomic;
	public FunPrimaryElements getFunPrimaryAccess() {
		return pFunPrimary;
	}
	
	public ParserRule getFunPrimaryRule() {
		return getFunPrimaryAccess().getRule();
	}
	
	//FunAtomic:
	//	{StringConstant} value=STRING | {IntConstant} value=INT;
	public FunAtomicElements getFunAtomicAccess() {
		return pFunAtomic;
	}
	
	public ParserRule getFunAtomicRule() {
		return getFunAtomicAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

/*
 * generated by Xtext 2.14.0
 */
package xyz.varad.funpl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import xyz.varad.funpl.ide.contentassist.antlr.internal.InternalFunPLParser;
import xyz.varad.funpl.services.FunPLGrammarAccess;

public class FunPLParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(FunPLGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, FunPLGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getSymbolAccess().getAlternatives(), "rule__Symbol__Alternatives");
			builder.put(grammarAccess.getDefinitionAccess().getAlternatives(), "rule__Definition__Alternatives");
			builder.put(grammarAccess.getValueAccess().getAlternatives_0(), "rule__Value__Alternatives_0");
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getAlternatives(), "rule__PrimaryExpression__Alternatives");
			builder.put(grammarAccess.getTerminalExpressionAccess().getAlternatives(), "rule__TerminalExpression__Alternatives");
			builder.put(grammarAccess.getTerminalExpressionAccess().getValueAlternatives_2_1_0(), "rule__TerminalExpression__ValueAlternatives_2_1_0");
			builder.put(grammarAccess.getValueAccess().getGroup(), "rule__Value__Group__0");
			builder.put(grammarAccess.getValueAccess().getGroup_2(), "rule__Value__Group_2__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_3(), "rule__Function__Group_3__0");
			builder.put(grammarAccess.getFunctionAccess().getGroup_3_1(), "rule__Function__Group_3_1__0");
			builder.put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
			builder.put(grammarAccess.getStatementAccess().getGroup_1(), "rule__Statement__Group_1__0");
			builder.put(grammarAccess.getAssignmentAccess().getGroup(), "rule__Assignment__Group__0");
			builder.put(grammarAccess.getAssignmentAccess().getGroup_1(), "rule__Assignment__Group_1__0");
			builder.put(grammarAccess.getPlusAccess().getGroup(), "rule__Plus__Group__0");
			builder.put(grammarAccess.getPlusAccess().getGroup_1(), "rule__Plus__Group_1__0");
			builder.put(grammarAccess.getPrimaryExpressionAccess().getGroup_0(), "rule__PrimaryExpression__Group_0__0");
			builder.put(grammarAccess.getFunctionCallAccess().getGroup(), "rule__FunctionCall__Group__0");
			builder.put(grammarAccess.getFunctionCallAccess().getGroup_3(), "rule__FunctionCall__Group_3__0");
			builder.put(grammarAccess.getFunctionCallAccess().getGroup_3_1(), "rule__FunctionCall__Group_3_1__0");
			builder.put(grammarAccess.getTerminalExpressionAccess().getGroup_0(), "rule__TerminalExpression__Group_0__0");
			builder.put(grammarAccess.getTerminalExpressionAccess().getGroup_1(), "rule__TerminalExpression__Group_1__0");
			builder.put(grammarAccess.getTerminalExpressionAccess().getGroup_2(), "rule__TerminalExpression__Group_2__0");
			builder.put(grammarAccess.getTerminalExpressionAccess().getGroup_3(), "rule__TerminalExpression__Group_3__0");
			builder.put(grammarAccess.getFunProgramAccess().getElementsAssignment(), "rule__FunProgram__ElementsAssignment");
			builder.put(grammarAccess.getValueAccess().getIsConstAssignment_0_0(), "rule__Value__IsConstAssignment_0_0");
			builder.put(grammarAccess.getValueAccess().getNameAssignment_1(), "rule__Value__NameAssignment_1");
			builder.put(grammarAccess.getValueAccess().getExpressionAssignment_2_1(), "rule__Value__ExpressionAssignment_2_1");
			builder.put(grammarAccess.getFunctionAccess().getNameAssignment_1(), "rule__Function__NameAssignment_1");
			builder.put(grammarAccess.getFunctionAccess().getParamsAssignment_3_0(), "rule__Function__ParamsAssignment_3_0");
			builder.put(grammarAccess.getFunctionAccess().getParamsAssignment_3_1_1(), "rule__Function__ParamsAssignment_3_1_1");
			builder.put(grammarAccess.getFunctionAccess().getBodyAssignment_5(), "rule__Function__BodyAssignment_5");
			builder.put(grammarAccess.getFunctionParamAccess().getNameAssignment(), "rule__FunctionParam__NameAssignment");
			builder.put(grammarAccess.getBlockAccess().getStatementsAssignment_2(), "rule__Block__StatementsAssignment_2");
			builder.put(grammarAccess.getAssignmentAccess().getRightAssignment_1_2(), "rule__Assignment__RightAssignment_1_2");
			builder.put(grammarAccess.getPlusAccess().getRightAssignment_1_2(), "rule__Plus__RightAssignment_1_2");
			builder.put(grammarAccess.getFunctionCallAccess().getFunctionAssignment_1(), "rule__FunctionCall__FunctionAssignment_1");
			builder.put(grammarAccess.getFunctionCallAccess().getArgsAssignment_3_0(), "rule__FunctionCall__ArgsAssignment_3_0");
			builder.put(grammarAccess.getFunctionCallAccess().getArgsAssignment_3_1_1(), "rule__FunctionCall__ArgsAssignment_3_1_1");
			builder.put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1(), "rule__TerminalExpression__ValueAssignment_0_1");
			builder.put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1(), "rule__TerminalExpression__ValueAssignment_1_1");
			builder.put(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1(), "rule__TerminalExpression__ValueAssignment_2_1");
			builder.put(grammarAccess.getTerminalExpressionAccess().getDefinitionAssignment_3_1(), "rule__TerminalExpression__DefinitionAssignment_3_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private FunPLGrammarAccess grammarAccess;

	@Override
	protected InternalFunPLParser createParser() {
		InternalFunPLParser result = new InternalFunPLParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public FunPLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FunPLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}

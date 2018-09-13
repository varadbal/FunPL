/**
 * generated by Xtext 2.14.0
 */
package xyz.varad.funpl.tests;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import xyz.varad.funpl.funPL.FunPLPackage;
import xyz.varad.funpl.funPL.FunProgram;
import xyz.varad.funpl.tests.FunPLInjectorProvider;
import xyz.varad.funpl.validation.FunPLValidator;

@RunWith(XtextRunner.class)
@InjectWith(FunPLInjectorProvider.class)
@SuppressWarnings("all")
public class FunPLValidatorTest {
  @Inject
  @Extension
  private ParseHelper<FunProgram> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testForwardReference() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var i = j;");
      _builder.newLine();
      _builder.append("var j = 10;");
      _builder.newLine();
      _builder.append("function myFunc(){");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      FunProgram _parse = this._parseHelper.parse(_builder);
      final Procedure1<FunProgram> _function = (FunProgram it) -> {
        Assert.assertTrue(((this._validationTestHelper.validate(it).size() == 1) && Objects.equal(IterableExtensions.<Issue>head(this._validationTestHelper.validate(it)).getMessage(), "Couldn\'t resolve reference to Symbol \'j\'.")));
      };
      ObjectExtensions.<FunProgram>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testForwardReferenceLocal() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("function myFunc()");
      _builder.newLine();
      _builder.append("{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var i = j;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var j = 10;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      FunProgram _parse = this._parseHelper.parse(_builder);
      final Procedure1<FunProgram> _function = (FunProgram it) -> {
        Assert.assertTrue(((this._validationTestHelper.validate(it).size() == 1) && Objects.equal(IterableExtensions.<Issue>head(this._validationTestHelper.validate(it)).getMessage(), "Couldn\'t resolve reference to Symbol \'j\'.")));
      };
      ObjectExtensions.<FunProgram>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGlobalRedefinitionLocally() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var i = 4;");
      _builder.newLine();
      _builder.append("function myFunc(int p){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var i = 5;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      FunProgram _parse = this._parseHelper.parse(_builder);
      final Procedure1<FunProgram> _function = (FunProgram it) -> {
        this._validationTestHelper.assertNoErrors(it);
      };
      ObjectExtensions.<FunProgram>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGlobalRedefinitionGlobally() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var i = 4;");
      _builder.newLine();
      _builder.append("function myFunc(){ }");
      _builder.newLine();
      _builder.append("const i = 5;");
      _builder.newLine();
      FunProgram _parse = this._parseHelper.parse(_builder);
      final Procedure1<FunProgram> _function = (FunProgram it) -> {
        this._validationTestHelper.assertError(it, FunPLPackage.eINSTANCE.getValue(), 
          FunPLValidator.SYMBOL_REDEFINITION, 
          "Symbol redefinition not allowed: \'i\'");
      };
      ObjectExtensions.<FunProgram>operator_doubleArrow(_parse, _function);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("var i = 4;");
      _builder_1.newLine();
      _builder_1.append("function myFunc(){");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("function myFunc() {");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      FunProgram _parse_1 = this._parseHelper.parse(_builder_1);
      final Procedure1<FunProgram> _function_1 = (FunProgram it) -> {
        this._validationTestHelper.assertError(it, FunPLPackage.eINSTANCE.getFunction(), 
          FunPLValidator.SYMBOL_REDEFINITION, 
          "Symbol redefinition not allowed: \'myFunc\'");
      };
      ObjectExtensions.<FunProgram>operator_doubleArrow(_parse_1, _function_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testLocalRedefinition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("function myFunc(int p){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var i = 5;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var i = 2;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      FunProgram _parse = this._parseHelper.parse(_builder);
      final Procedure1<FunProgram> _function = (FunProgram it) -> {
        this._validationTestHelper.assertError(it, FunPLPackage.eINSTANCE.getValue(), FunPLValidator.SYMBOL_REDEFINITION, "Symbol redefinition not allowed: \'i\'");
      };
      ObjectExtensions.<FunProgram>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testOutOfScopeRedefinition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("function myFunc(int p){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var i = 5;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("function myFunc2(){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var i = 1;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParameterRedefinition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("function myFunc(int p){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var p = 5;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder), FunPLPackage.eINSTANCE.getValue(), 
        FunPLValidator.SYMBOL_REDEFINITION, 
        "Symbol redefinition not allowed: \'p\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testParameterRedefinitionAsParam() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("function myFunc(int p1,int p1){");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder), FunPLPackage.eINSTANCE.getFunctionParam(), 
        FunPLValidator.SYMBOL_REDEFINITION, 
        "Symbol redefinition not allowed: \'p1\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInvalidAssignment() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("function myFunc(){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("5 = 2;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder), FunPLPackage.eINSTANCE.getStatement(), 
        FunPLValidator.INVALID_ASSIGNMENT, 
        "Invalid assignment");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("function foo(){");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      _builder_1.append("function bar(){");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("foo = 2;");
      _builder_1.newLine();
      _builder_1.append("}");
      _builder_1.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder_1), FunPLPackage.eINSTANCE.getStatement(), 
        FunPLValidator.INVALID_ASSIGNMENT, 
        "Invalid assignment");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testConstantReassignment() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("function foo(){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("const m = 5;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("m = 6;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder), FunPLPackage.eINSTANCE.getStatement(), 
        FunPLValidator.CONSTANT_REASSIGNMENT, 
        "Constant-value reassignment not allowed: \'m\'");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testUndefinedConstant() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("const i;");
      _builder.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder), FunPLPackage.eINSTANCE.getValue(), 
        FunPLValidator.UNDEFINED_CONSTANT, 
        "Undefined constant not allowed: \'i\'");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("const i = 1;");
      _builder_1.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder_1));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}

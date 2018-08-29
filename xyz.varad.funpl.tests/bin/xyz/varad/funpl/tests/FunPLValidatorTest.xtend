/*
 * generated by Xtext 2.14.0
 */
package xyz.varad.funpl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import static extension org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import xyz.varad.funpl.funPL.FunProgram
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import xyz.varad.funpl.funPL.Statement
import xyz.varad.funpl.funPL.Assignment
import xyz.varad.funpl.funPL.Plus
import xyz.varad.funpl.funPL.FunctionCall
import xyz.varad.funpl.funPL.DefinitionRef
import xyz.varad.funpl.funPL.Definition
import xyz.varad.funpl.funPL.Function
import xyz.varad.funpl.funPL.Expression
import xyz.varad.funpl.funPL.IntConstant
import xyz.varad.funpl.funPL.StringConstant
import xyz.varad.funpl.funPL.BoolConstant
import xyz.varad.funpl.funPL.Value
import xyz.varad.funpl.funPL.FunPLPackage
import xyz.varad.funpl.validation.FunPLValidator

@RunWith(XtextRunner)
@InjectWith(FunPLInjectorProvider)
class FunPLValidatorTest {
	
	@Inject extension ParseHelper<FunProgram> 
	@Inject extension ValidationTestHelper
	
	
	@Test
	def void testForwardReference(){
		'''
		var i = j;
		var j = 10;
		'''.parse.assertError(FunPLPackage::eINSTANCE.definitionRef, 
			FunPLValidator::FORWARD_REFERENCE,
			"Definition forward reference not allowed: 'j'"
		)
		
		'''
		function myFunc()
		{
			var i = j;
			var j = 10;
		}
		'''.parse.assertError(FunPLPackage::eINSTANCE.definitionRef, 
			FunPLValidator::FORWARD_REFERENCE,
			"Definition forward reference not allowed: 'j'"
		)
	}
	
	
	
	
	
}

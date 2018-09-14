/*
 * generated by Xtext 2.14.0
 */
package xyz.varad.funpl.validation

import org.eclipse.xtext.validation.Check
import com.google.inject.Inject
import xyz.varad.funpl.util.FunPLModelUtil
import xyz.varad.funpl.funPL.FunPLPackage
import xyz.varad.funpl.funPL.SymbolRef
import xyz.varad.funpl.funPL.Symbol
import xyz.varad.funpl.funPL.Definition
import static extension xyz.varad.funpl.util.FunPLModelUtil.*

import static extension org.eclipse.xtext.EcoreUtil2.*
import xyz.varad.funpl.funPL.Function
import xyz.varad.funpl.funPL.FunProgram
import java.util.List
import xyz.varad.funpl.funPL.Value
import xyz.varad.funpl.funPL.FunctionParam
import xyz.varad.funpl.funPL.Assignment

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class FunPLValidator extends AbstractFunPLValidator {
	// TODO expression types (plus, assignment)
	// TODO symbol expression type vs. symbol type OR type inference when null
	// TODO function call #args=#params
	// TODO function params and args type
	// TODO disable def. references in global scope???
	// TODO value def EITHER Expression -> type inference OR Type
	// TODO function return statement should correspond to its type AND each other 
	
	static val ISSUE_CODE_PREFIX = "xyz.varad.funpl."
	public static val SYMBOL_REDEFINITION = ISSUE_CODE_PREFIX + "SymbolRedefinition"
	public static val INVALID_ASSIGNMENT = ISSUE_CODE_PREFIX + "InvalidAssignment"
	public static val CONSTANT_REASSIGNMENT = ISSUE_CODE_PREFIX + "ConstantReassignment"
	public static val UNDEFINED_CONSTANT = ISSUE_CODE_PREFIX + "UndefinedConstant"
	
	//@Inject extension FunPLModelUtil
	
	
	@Check
	def void checkSymbolRedefinitionAsNeighbor(Definition _d){
		val contProg = _d.getContainerOfType(FunProgram)
		val contFunc = _d.getContainerOfType(Function)
		if(contFunc !== null && !(_d instanceof Function)){
			if(contFunc.symbols.takeWhile[it != _d].containsSameNamedSymbol(_d)){
				error("Symbol redefinition not allowed: '" + _d.name + "'",
				FunPLPackage::eINSTANCE.symbol_Name,
				SYMBOL_REDEFINITION,
				_d.name)
			}
		}else{
			if(contProg.symbols.takeWhile[it != _d].containsSameNamedSymbol(_d)){
				error("Symbol redefinition not allowed: '" + _d.name + "'",
				FunPLPackage::eINSTANCE.symbol_Name,
				SYMBOL_REDEFINITION,
				_d.name)
			}
		}
	}
	
	@Check
	def void checkSymbolRedefinitionParam(FunctionParam _p){
		val contFunc = _p.getContainerOfType(Function)
		if(contFunc !== null){
			if(contFunc.params.takeWhile[it != _p].containsSameNamedSymbol(_p)){
				error("Symbol redefinition not allowed: '" + _p.name + "'",
				FunPLPackage::eINSTANCE.symbol_Name,
				SYMBOL_REDEFINITION,
				_p.name)
			}
		}
	}
	
	
	
	@Check
	def void checkAssignmentExpressionValidity(Assignment _a){
		if(!(_a.left instanceof SymbolRef)){
			error("Invalid assignment", FunPLPackage::eINSTANCE.assignment_Left, INVALID_ASSIGNMENT)
		}else if((_a.left as SymbolRef).symbol instanceof Function){
			error("Invalid assignment", FunPLPackage::eINSTANCE.assignment_Left, INVALID_ASSIGNMENT)
		}
	}
	
	@Check
	def void checkConstantReassignment(Assignment _a){
		if(_a.left instanceof SymbolRef){
			val _cRef = _a.left as SymbolRef
			if(_cRef.symbol instanceof Value){
				val _c = _cRef.symbol as Value
				if(_c.const){
					error("Constant-value reassignment not allowed: '" + _c.name + "'",
						FunPLPackage::eINSTANCE.assignment_Left,
						CONSTANT_REASSIGNMENT,
						_c.name
					)
				}
			}
		}
	}
	
	@Check
	def void checkUndefinedConstant(Value _v){
		if(_v.isConst){
			if(_v.expression === null){
				error("Undefined constant not allowed: '" + _v.name + "'",
					FunPLPackage::eINSTANCE.symbol_Name,
					UNDEFINED_CONSTANT,
					_v.name
				)
			}
		}
	}
	
	
	
	
	def private boolean containsSameNamedSymbol(Iterable<? extends Symbol> _l, Symbol _s){
		val _it = _l.iterator
		while(_it.hasNext){
			if(_it.next.name == _s.name)
				return true
		}
		return false
	}
	
}

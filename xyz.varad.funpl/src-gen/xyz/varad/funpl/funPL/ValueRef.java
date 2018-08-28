/**
 * generated by Xtext 2.14.0
 */
package xyz.varad.funpl.funPL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Value Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link xyz.varad.funpl.funPL.ValueRef#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see xyz.varad.funpl.funPL.FunPLPackage#getValueRef()
 * @model
 * @generated
 */
public interface ValueRef extends TerminalExpression
{
  /**
   * Returns the value of the '<em><b>Variable</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' reference.
   * @see #setVariable(Value)
   * @see xyz.varad.funpl.funPL.FunPLPackage#getValueRef_Variable()
   * @model
   * @generated
   */
  Value getVariable();

  /**
   * Sets the value of the '{@link xyz.varad.funpl.funPL.ValueRef#getVariable <em>Variable</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(Value value);

} // ValueRef
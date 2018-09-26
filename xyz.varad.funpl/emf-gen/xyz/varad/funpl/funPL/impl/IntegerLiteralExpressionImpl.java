/**
 * generated by Xtext 2.15.0
 */
package xyz.varad.funpl.funPL.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import xyz.varad.funpl.funPL.FunPLPackage;
import xyz.varad.funpl.funPL.IntegerLiteralExpression;
import xyz.varad.funpl.funPL.Type;
import xyz.varad.funpl.funPL.TypeInferredElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Literal Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xyz.varad.funpl.funPL.impl.IntegerLiteralExpressionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link xyz.varad.funpl.funPL.impl.IntegerLiteralExpressionImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerLiteralExpressionImpl extends MinimalEObjectImpl.Container implements IntegerLiteralExpression {
	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected Type returnType;

	/**
	 * This is true if the Return Type containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean returnTypeESet;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntegerLiteralExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunPLPackage.Literals.INTEGER_LITERAL_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(Type newReturnType, NotificationChain msgs) {
		Type oldReturnType = returnType;
		returnType = newReturnType;
		boolean oldReturnTypeESet = returnTypeESet;
		returnTypeESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunPLPackage.INTEGER_LITERAL_EXPRESSION__RETURN_TYPE, oldReturnType, newReturnType, !oldReturnTypeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(Type newReturnType) {
		if (newReturnType != returnType) {
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunPLPackage.INTEGER_LITERAL_EXPRESSION__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunPLPackage.INTEGER_LITERAL_EXPRESSION__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReturnTypeESet = returnTypeESet;
			returnTypeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, FunPLPackage.INTEGER_LITERAL_EXPRESSION__RETURN_TYPE, newReturnType, newReturnType, !oldReturnTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetReturnType(NotificationChain msgs) {
		Type oldReturnType = returnType;
		returnType = null;
		boolean oldReturnTypeESet = returnTypeESet;
		returnTypeESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, FunPLPackage.INTEGER_LITERAL_EXPRESSION__RETURN_TYPE, oldReturnType, null, oldReturnTypeESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReturnType() {
		if (returnType != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunPLPackage.INTEGER_LITERAL_EXPRESSION__RETURN_TYPE, null, msgs);
			msgs = basicUnsetReturnType(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReturnTypeESet = returnTypeESet;
			returnTypeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, FunPLPackage.INTEGER_LITERAL_EXPRESSION__RETURN_TYPE, null, null, oldReturnTypeESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReturnType() {
		return returnTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunPLPackage.INTEGER_LITERAL_EXPRESSION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunPLPackage.INTEGER_LITERAL_EXPRESSION__RETURN_TYPE:
				return basicUnsetReturnType(msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FunPLPackage.INTEGER_LITERAL_EXPRESSION__RETURN_TYPE:
				return getReturnType();
			case FunPLPackage.INTEGER_LITERAL_EXPRESSION__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FunPLPackage.INTEGER_LITERAL_EXPRESSION__RETURN_TYPE:
				setReturnType((Type)newValue);
				return;
			case FunPLPackage.INTEGER_LITERAL_EXPRESSION__VALUE:
				setValue((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FunPLPackage.INTEGER_LITERAL_EXPRESSION__RETURN_TYPE:
				unsetReturnType();
				return;
			case FunPLPackage.INTEGER_LITERAL_EXPRESSION__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FunPLPackage.INTEGER_LITERAL_EXPRESSION__RETURN_TYPE:
				return isSetReturnType();
			case FunPLPackage.INTEGER_LITERAL_EXPRESSION__VALUE:
				return value != VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == TypeInferredElement.class) {
			switch (derivedFeatureID) {
				case FunPLPackage.INTEGER_LITERAL_EXPRESSION__RETURN_TYPE: return FunPLPackage.TYPE_INFERRED_ELEMENT__RETURN_TYPE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == TypeInferredElement.class) {
			switch (baseFeatureID) {
				case FunPLPackage.TYPE_INFERRED_ELEMENT__RETURN_TYPE: return FunPLPackage.INTEGER_LITERAL_EXPRESSION__RETURN_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //IntegerLiteralExpressionImpl
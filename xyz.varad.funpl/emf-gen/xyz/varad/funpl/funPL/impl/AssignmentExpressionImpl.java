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

import xyz.varad.funpl.funPL.AssignmentExpression;
import xyz.varad.funpl.funPL.Expression;
import xyz.varad.funpl.funPL.FunPLPackage;
import xyz.varad.funpl.funPL.Type;
import xyz.varad.funpl.funPL.TypeInferredElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link xyz.varad.funpl.funPL.impl.AssignmentExpressionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link xyz.varad.funpl.funPL.impl.AssignmentExpressionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link xyz.varad.funpl.funPL.impl.AssignmentExpressionImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentExpressionImpl extends MinimalEObjectImpl.Container implements AssignmentExpression {
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
	 * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft()
	 * @generated
	 * @ordered
	 */
	protected Expression left;

	/**
	 * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight()
	 * @generated
	 * @ordered
	 */
	protected Expression right;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FunPLPackage.Literals.ASSIGNMENT_EXPRESSION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunPLPackage.ASSIGNMENT_EXPRESSION__RETURN_TYPE, oldReturnType, newReturnType, !oldReturnTypeESet);
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
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunPLPackage.ASSIGNMENT_EXPRESSION__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunPLPackage.ASSIGNMENT_EXPRESSION__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReturnTypeESet = returnTypeESet;
			returnTypeESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, FunPLPackage.ASSIGNMENT_EXPRESSION__RETURN_TYPE, newReturnType, newReturnType, !oldReturnTypeESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, FunPLPackage.ASSIGNMENT_EXPRESSION__RETURN_TYPE, oldReturnType, null, oldReturnTypeESet);
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
			msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunPLPackage.ASSIGNMENT_EXPRESSION__RETURN_TYPE, null, msgs);
			msgs = basicUnsetReturnType(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldReturnTypeESet = returnTypeESet;
			returnTypeESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, FunPLPackage.ASSIGNMENT_EXPRESSION__RETURN_TYPE, null, null, oldReturnTypeESet));
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
	public Expression getLeft() {
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeft(Expression newLeft, NotificationChain msgs) {
		Expression oldLeft = left;
		left = newLeft;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunPLPackage.ASSIGNMENT_EXPRESSION__LEFT, oldLeft, newLeft);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(Expression newLeft) {
		if (newLeft != left) {
			NotificationChain msgs = null;
			if (left != null)
				msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunPLPackage.ASSIGNMENT_EXPRESSION__LEFT, null, msgs);
			if (newLeft != null)
				msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunPLPackage.ASSIGNMENT_EXPRESSION__LEFT, null, msgs);
			msgs = basicSetLeft(newLeft, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunPLPackage.ASSIGNMENT_EXPRESSION__LEFT, newLeft, newLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRight() {
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRight(Expression newRight, NotificationChain msgs) {
		Expression oldRight = right;
		right = newRight;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FunPLPackage.ASSIGNMENT_EXPRESSION__RIGHT, oldRight, newRight);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(Expression newRight) {
		if (newRight != right) {
			NotificationChain msgs = null;
			if (right != null)
				msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FunPLPackage.ASSIGNMENT_EXPRESSION__RIGHT, null, msgs);
			if (newRight != null)
				msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FunPLPackage.ASSIGNMENT_EXPRESSION__RIGHT, null, msgs);
			msgs = basicSetRight(newRight, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FunPLPackage.ASSIGNMENT_EXPRESSION__RIGHT, newRight, newRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FunPLPackage.ASSIGNMENT_EXPRESSION__RETURN_TYPE:
				return basicUnsetReturnType(msgs);
			case FunPLPackage.ASSIGNMENT_EXPRESSION__LEFT:
				return basicSetLeft(null, msgs);
			case FunPLPackage.ASSIGNMENT_EXPRESSION__RIGHT:
				return basicSetRight(null, msgs);
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
			case FunPLPackage.ASSIGNMENT_EXPRESSION__RETURN_TYPE:
				return getReturnType();
			case FunPLPackage.ASSIGNMENT_EXPRESSION__LEFT:
				return getLeft();
			case FunPLPackage.ASSIGNMENT_EXPRESSION__RIGHT:
				return getRight();
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
			case FunPLPackage.ASSIGNMENT_EXPRESSION__RETURN_TYPE:
				setReturnType((Type)newValue);
				return;
			case FunPLPackage.ASSIGNMENT_EXPRESSION__LEFT:
				setLeft((Expression)newValue);
				return;
			case FunPLPackage.ASSIGNMENT_EXPRESSION__RIGHT:
				setRight((Expression)newValue);
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
			case FunPLPackage.ASSIGNMENT_EXPRESSION__RETURN_TYPE:
				unsetReturnType();
				return;
			case FunPLPackage.ASSIGNMENT_EXPRESSION__LEFT:
				setLeft((Expression)null);
				return;
			case FunPLPackage.ASSIGNMENT_EXPRESSION__RIGHT:
				setRight((Expression)null);
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
			case FunPLPackage.ASSIGNMENT_EXPRESSION__RETURN_TYPE:
				return isSetReturnType();
			case FunPLPackage.ASSIGNMENT_EXPRESSION__LEFT:
				return left != null;
			case FunPLPackage.ASSIGNMENT_EXPRESSION__RIGHT:
				return right != null;
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
				case FunPLPackage.ASSIGNMENT_EXPRESSION__RETURN_TYPE: return FunPLPackage.TYPE_INFERRED_ELEMENT__RETURN_TYPE;
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
				case FunPLPackage.TYPE_INFERRED_ELEMENT__RETURN_TYPE: return FunPLPackage.ASSIGNMENT_EXPRESSION__RETURN_TYPE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AssignmentExpressionImpl

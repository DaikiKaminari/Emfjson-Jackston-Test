/**
 */
package store.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import store.Customer;
import store.Order;
import store.OrderState;
import store.Product;
import store.StorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link store.impl.OrderImpl#getId <em>Id</em>}</li>
 *   <li>{@link store.impl.OrderImpl#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link store.impl.OrderImpl#getTotalAmount <em>Total Amount</em>}</li>
 *   <li>{@link store.impl.OrderImpl#getState <em>State</em>}</li>
 *   <li>{@link store.impl.OrderImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link store.impl.OrderImpl#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends MinimalEObjectImpl.Container implements Order {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected static final Date CREATED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedAt() <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedAt()
	 * @generated
	 * @ordered
	 */
	protected Date createdAt = CREATED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalAmount() <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAmount()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalAmount() <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAmount()
	 * @generated
	 * @ordered
	 */
	protected double totalAmount = TOTAL_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final OrderState STATE_EDEFAULT = OrderState.IN_PROCESS;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected OrderState state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected Customer customer;

	/**
	 * The cached value of the '{@link #getProduct() <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduct()
	 * @generated
	 * @ordered
	 */
	protected Product product;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.ORDER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCreatedAt() {
		return createdAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedAt(Date newCreatedAt) {
		Date oldCreatedAt = createdAt;
		createdAt = newCreatedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.ORDER__CREATED_AT, oldCreatedAt,
					createdAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalAmount() {
		return totalAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalAmount(double newTotalAmount) {
		double oldTotalAmount = totalAmount;
		totalAmount = newTotalAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.ORDER__TOTAL_AMOUNT, oldTotalAmount,
					totalAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderState getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(OrderState newState) {
		OrderState oldState = state;
		state = newState == null ? STATE_EDEFAULT : newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.ORDER__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer getCustomer() {
		if (customer != null && customer.eIsProxy()) {
			InternalEObject oldCustomer = (InternalEObject) customer;
			customer = (Customer) eResolveProxy(oldCustomer);
			if (customer != oldCustomer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.ORDER__CUSTOMER, oldCustomer,
							customer));
			}
		}
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer basicGetCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomer(Customer newCustomer, NotificationChain msgs) {
		Customer oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StorePackage.ORDER__CUSTOMER,
					oldCustomer, newCustomer);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(Customer newCustomer) {
		if (newCustomer != customer) {
			NotificationChain msgs = null;
			if (customer != null)
				msgs = ((InternalEObject) customer).eInverseRemove(this, StorePackage.CUSTOMER__ORDER, Customer.class,
						msgs);
			if (newCustomer != null)
				msgs = ((InternalEObject) newCustomer).eInverseAdd(this, StorePackage.CUSTOMER__ORDER, Customer.class,
						msgs);
			msgs = basicSetCustomer(newCustomer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.ORDER__CUSTOMER, newCustomer,
					newCustomer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getProduct() {
		if (product != null && product.eIsProxy()) {
			InternalEObject oldProduct = (InternalEObject) product;
			product = (Product) eResolveProxy(oldProduct);
			if (product != oldProduct) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StorePackage.ORDER__PRODUCT, oldProduct,
							product));
			}
		}
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProduct() {
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(Product newProduct) {
		Product oldProduct = product;
		product = newProduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StorePackage.ORDER__PRODUCT, oldProduct, product));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StorePackage.ORDER__CUSTOMER:
			if (customer != null)
				msgs = ((InternalEObject) customer).eInverseRemove(this, StorePackage.CUSTOMER__ORDER, Customer.class,
						msgs);
			return basicSetCustomer((Customer) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case StorePackage.ORDER__CUSTOMER:
			return basicSetCustomer(null, msgs);
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
		case StorePackage.ORDER__ID:
			return getId();
		case StorePackage.ORDER__CREATED_AT:
			return getCreatedAt();
		case StorePackage.ORDER__TOTAL_AMOUNT:
			return getTotalAmount();
		case StorePackage.ORDER__STATE:
			return getState();
		case StorePackage.ORDER__CUSTOMER:
			if (resolve)
				return getCustomer();
			return basicGetCustomer();
		case StorePackage.ORDER__PRODUCT:
			if (resolve)
				return getProduct();
			return basicGetProduct();
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
		case StorePackage.ORDER__ID:
			setId((Integer) newValue);
			return;
		case StorePackage.ORDER__CREATED_AT:
			setCreatedAt((Date) newValue);
			return;
		case StorePackage.ORDER__TOTAL_AMOUNT:
			setTotalAmount((Double) newValue);
			return;
		case StorePackage.ORDER__STATE:
			setState((OrderState) newValue);
			return;
		case StorePackage.ORDER__CUSTOMER:
			setCustomer((Customer) newValue);
			return;
		case StorePackage.ORDER__PRODUCT:
			setProduct((Product) newValue);
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
		case StorePackage.ORDER__ID:
			setId(ID_EDEFAULT);
			return;
		case StorePackage.ORDER__CREATED_AT:
			setCreatedAt(CREATED_AT_EDEFAULT);
			return;
		case StorePackage.ORDER__TOTAL_AMOUNT:
			setTotalAmount(TOTAL_AMOUNT_EDEFAULT);
			return;
		case StorePackage.ORDER__STATE:
			setState(STATE_EDEFAULT);
			return;
		case StorePackage.ORDER__CUSTOMER:
			setCustomer((Customer) null);
			return;
		case StorePackage.ORDER__PRODUCT:
			setProduct((Product) null);
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
		case StorePackage.ORDER__ID:
			return id != ID_EDEFAULT;
		case StorePackage.ORDER__CREATED_AT:
			return CREATED_AT_EDEFAULT == null ? createdAt != null : !CREATED_AT_EDEFAULT.equals(createdAt);
		case StorePackage.ORDER__TOTAL_AMOUNT:
			return totalAmount != TOTAL_AMOUNT_EDEFAULT;
		case StorePackage.ORDER__STATE:
			return state != STATE_EDEFAULT;
		case StorePackage.ORDER__CUSTOMER:
			return customer != null;
		case StorePackage.ORDER__PRODUCT:
			return product != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", createdAt: ");
		result.append(createdAt);
		result.append(", totalAmount: ");
		result.append(totalAmount);
		result.append(", state: ");
		result.append(state);
		result.append(')');
		return result.toString();
	}

} //OrderImpl

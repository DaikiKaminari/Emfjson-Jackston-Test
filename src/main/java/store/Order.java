/**
 */
package store;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link store.Order#getId <em>Id</em>}</li>
 *   <li>{@link store.Order#getCreatedAt <em>Created At</em>}</li>
 *   <li>{@link store.Order#getTotalAmount <em>Total Amount</em>}</li>
 *   <li>{@link store.Order#getState <em>State</em>}</li>
 *   <li>{@link store.Order#getCustomer <em>Customer</em>}</li>
 *   <li>{@link store.Order#getProduct <em>Product</em>}</li>
 * </ul>
 *
 * @see store.StorePackage#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see store.StorePackage#getOrder_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link store.Order#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Created At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created At</em>' attribute.
	 * @see #setCreatedAt(Date)
	 * @see store.StorePackage#getOrder_CreatedAt()
	 * @model
	 * @generated
	 */
	Date getCreatedAt();

	/**
	 * Sets the value of the '{@link store.Order#getCreatedAt <em>Created At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created At</em>' attribute.
	 * @see #getCreatedAt()
	 * @generated
	 */
	void setCreatedAt(Date value);

	/**
	 * Returns the value of the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Amount</em>' attribute.
	 * @see #setTotalAmount(double)
	 * @see store.StorePackage#getOrder_TotalAmount()
	 * @model
	 * @generated
	 */
	double getTotalAmount();

	/**
	 * Sets the value of the '{@link store.Order#getTotalAmount <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Amount</em>' attribute.
	 * @see #getTotalAmount()
	 * @generated
	 */
	void setTotalAmount(double value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link store.OrderState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see store.OrderState
	 * @see #setState(OrderState)
	 * @see store.StorePackage#getOrder_State()
	 * @model
	 * @generated
	 */
	OrderState getState();

	/**
	 * Sets the value of the '{@link store.Order#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see store.OrderState
	 * @see #getState()
	 * @generated
	 */
	void setState(OrderState value);

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link store.Customer#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' reference.
	 * @see #setCustomer(Customer)
	 * @see store.StorePackage#getOrder_Customer()
	 * @see store.Customer#getOrder
	 * @model opposite="order" required="true"
	 * @generated
	 */
	Customer getCustomer();

	/**
	 * Sets the value of the '{@link store.Order#getCustomer <em>Customer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' reference.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(Customer value);

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see store.StorePackage#getOrder_Product()
	 * @model required="true"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link store.Order#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

} // Order

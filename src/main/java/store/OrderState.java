/**
 */
package store;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Order State</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see store.StorePackage#getOrderState()
 * @model
 * @generated
 */
public enum OrderState implements Enumerator {
	/**
	 * The '<em><b>IN PROCESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	IN_PROCESS(0, "IN_PROCESS", "IN_PROCESS"),

	/**
	 * The '<em><b>SHIPPED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHIPPED_VALUE
	 * @generated
	 * @ordered
	 */
	SHIPPED(1, "SHIPPED", "SHIPPED"),

	/**
	 * The '<em><b>RECEIVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVED_VALUE
	 * @generated
	 * @ordered
	 */
	RECEIVED(2, "RECEIVED", "RECEIVED"),

	/**
	 * The '<em><b>SENT BACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENT_BACK_VALUE
	 * @generated
	 * @ordered
	 */
	SENT_BACK(3, "SENT_BACK", "SENT_BACK");

	/**
	 * The '<em><b>IN PROCESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_PROCESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IN_PROCESS_VALUE = 0;

	/**
	 * The '<em><b>SHIPPED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHIPPED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHIPPED_VALUE = 1;

	/**
	 * The '<em><b>RECEIVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECEIVED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RECEIVED_VALUE = 2;

	/**
	 * The '<em><b>SENT BACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SENT_BACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SENT_BACK_VALUE = 3;

	/**
	 * An array of all the '<em><b>Order State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OrderState[] VALUES_ARRAY = new OrderState[] { IN_PROCESS, SHIPPED, RECEIVED, SENT_BACK, };

	/**
	 * A public read-only list of all the '<em><b>Order State</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OrderState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Order State</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order State</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OrderState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Order State</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OrderState get(int value) {
		switch (value) {
		case IN_PROCESS_VALUE:
			return IN_PROCESS;
		case SHIPPED_VALUE:
			return SHIPPED;
		case RECEIVED_VALUE:
			return RECEIVED;
		case SENT_BACK_VALUE:
			return SENT_BACK;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OrderState(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
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
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //OrderState

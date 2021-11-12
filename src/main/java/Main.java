import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.emfjson.jackson.resource.JsonResourceFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import store.StoreFactory;

import store.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;

public class Main {
	// Instantiate a calendar
	private static final Calendar c = Calendar.getInstance();

	// Initialize the model
	private static final EClass myStore = StoreFactory.eINSTANCE.eClass();

	// Get the factory
	private static final StoreFactory factory = StoreFactory.eINSTANCE;

	private static void testWrite(Resource resource) throws IOException {
		// Create categories
		Category catFruit = factory.createCategory();
		catFruit.setName("Fruit");

		// Create products
		Product prodPeach = factory.createProduct();
		prodPeach.setId("/99");
		prodPeach.setCategory(catFruit);
		prodPeach.setName("Peach");
		prodPeach.setQuantity(5);

		Product prodApple = factory.createProduct();
		prodApple.setId("/99");
		prodApple.setCategory(catFruit);
		prodApple.setName("Apple");
		prodApple.setQuantity(20);

		// Create customers
		Customer cust1 = factory.createCustomer();
		cust1.setId(100);
		cust1.setName("François");

		// Create orders
		OrderItem orderItem1 = factory.createOrderItem();
		orderItem1.setProduct(prodPeach);
		orderItem1.setQuantity(5);
		orderItem1.setId("/1");

		OrderItem orderItem2 = factory.createOrderItem();
		orderItem2.setProduct(prodApple);
		orderItem2.setQuantity(10);
		orderItem2.setId("/2");

		Order order1 = factory.createOrder();
		order1.setCreatedAt(c.getTime());
		order1.setCustomer(cust1);
		order1.setId(1000);
		order1.setState(OrderState.SHIPPED);
		order1.getOrderitem().add(orderItem1);
		order1.getOrderitem().add(orderItem2);


		// Add the resources
		resource.getContents().addAll(Arrays.asList(
				catFruit,
				cust1,
				orderItem1,
				orderItem2,
				order1
		));
		resource.save(null);
	}

	private static void testWrite2(Resource resource) throws IOException {/*
		// Create products
		Product prodPeach = factory.createProduct();
		prodPeach.setId("10");
		// prodPeach.setCategory(catFruit);
		prodPeach.setName("Peach");
		prodPeach.setQuantity(5);

		// Create orders
		OrderItem orderItem1 = factory.createOrderItem();
		orderItem1.setProduct(prodPeach);
		orderItem1.setQuantity(5);

		Order order1 = factory.createOrder();
		order1.setCreatedAt(c.getTime());
		order1.setId(1000);
		order1.setState(OrderState.SHIPPED);
		order1.getOrderitem().add(orderItem1);

		// Add the resources
		resource.getContents().addAll(Arrays.asList(
				orderItem1,
				order1
		));
		resource.save(null);
		*/
	}

	private static void testRead(Resource resource) throws IOException {
		resource.load(null);
		for (Object item : resource.getContents()) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put("json", new JsonResourceFactory());
		Resource resource = resourceSet.createResource(URI.createFileURI("src/main/resources/data.json"));

		testWrite(resource);
		// testWrite2(resource);
		testRead(resource);
	}
}

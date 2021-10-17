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

	public static void main(String[] args) throws IOException {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put("json", new JsonResourceFactory());

		Resource resource = resourceSet.createResource(URI.createFileURI("src/main/resources/data.json"));

		// Create categories
		Category catFruit = factory.createCategory();
		catFruit.setId(1);
		catFruit.setName("Fruit");

		// Create products
		Product prodPeach = factory.createProduct();
		prodPeach.setId(10);
		prodPeach.setCategory(catFruit);
		prodPeach.setName("Peach");
		prodPeach.setQuantity(5);

		// Create customers
		Customer cust1 = factory.createCustomer();
		cust1.setId(100);
		cust1.setName("François");

		// Create orders
		Order order1 = factory.createOrder();
		order1.setCreatedAt(c.getTime());
		order1.setCustomer(cust1);
		order1.setId(1000);
		order1.setState(OrderState.SHIPPED);
		order1.setProduct(prodPeach);
		order1.setTotalAmount(10);


		// Add the resources
		resource.getContents().addAll(Arrays.asList(
				prodPeach,
				catFruit,
				cust1,
				order1
		));
		resource.save(null);

	}
}

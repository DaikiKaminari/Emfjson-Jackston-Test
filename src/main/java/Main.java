import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.emfjson.jackson.resource.JsonResourceFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import store.StoreFactory;

import store.*;

public class Main {
	// Initialize the model
	private static final EClass myStore = StoreFactory.eINSTANCE.eClass();

	// Get the factory
	private static final StoreFactory factory = StoreFactory.eINSTANCE;

	public static void main(String[] args) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put("json", new JsonResourceFactory());

		Resource resource = resourceSet.createResource(URI.createFileURI("src/main/resources/data.json"));

		// Create categories
		Category c_fruit = factory.createCategory();
		c_fruit.setId(1);
		c_fruit.setName("Fruit");

		// Create products
		Product p_peach = factory.createProduct();
		p_peach.setId(10);
		p_peach.setCategory(c_fruit);
		p_peach.setName("Peach");
		p_peach.setQuantity(10);

	}
}

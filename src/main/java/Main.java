import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import org.emfjson.jackson.resource.JsonResourceFactory;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import store.StoreFactory;

import store.*;

import java.io.IOException;
import java.util.HashMap;

public class Main {
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
		prodPeach.setQuantity(10);

		// Add reference from product to category
		// prodPeach.getCategory()

		// Add the resourcesresource.getContents().add(catFruit);
		resource.getContents().add(prodPeach);
		resource.getContents().add(catFruit);
		resource.save(null);



	}
}

import java.util.HashMap;
import java.util.Map;

public class InventoryManagementSystem {
    private Map<Integer, Product> inventory;

    public InventoryManagementSystem() {
        this.inventory = new HashMap<>();
    }

    // Add a product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Update a product
    public void updateProduct(int productId, Product updatedProduct) {
        inventory.put(productId, updatedProduct);
    }

    // Delete a product
    public void deleteProduct(int productId) {
        inventory.remove(productId);
    }

    // Retrieve a product
    public Product getProduct(int productId) {
        return inventory.get(productId);
    }
    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();

        // Adding products
        Product product1 = new Product(1, "Laptop", 10, 999.99);
        Product product2 = new Product(2, "Smartphone", 20, 499.99);
        ims.addProduct(product1);
        ims.addProduct(product2);

        // Retrieving and printing products
        System.out.println("Product 1: " + ims.getProduct(1));
        System.out.println("Product 2: " + ims.getProduct(2));

        // Updating product
        Product updatedProduct = new Product(1, "Laptop", 8, 999.99);
        ims.updateProduct(1, updatedProduct);
        System.out.println("Updated Product 1: " + ims.getProduct(1));

        // Deleting a product
        ims.deleteProduct(2);
        System.out.println("Product 2 after deletion: " + ims.getProduct(2));
    }
}

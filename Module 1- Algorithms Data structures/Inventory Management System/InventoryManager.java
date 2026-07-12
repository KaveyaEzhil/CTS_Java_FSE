import java.util.HashMap;

public class InventoryManager {

    private HashMap<Integer, Product> inventory =
            new HashMap<>();

    // Add Product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Update Product
    public void updateProduct(int productId,
                              int quantity,
                              double price) {

        Product product = inventory.get(productId);

        if (product != null) {
            product.setQuantity(quantity);
            product.setPrice(price);
        } else {
            System.out.println("Product not found!");
        }
    }

    // Delete Product
    public void deleteProduct(int productId) {
        inventory.remove(productId);
    }

    // Display Inventory
    public void displayProducts() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }
}
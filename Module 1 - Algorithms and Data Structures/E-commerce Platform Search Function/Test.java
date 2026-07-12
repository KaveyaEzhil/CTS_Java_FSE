import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Setup initial list of products
        Product[] products = {
            new Product("P101", "Laptop", "Electronics"),
            new Product("P102", "Smartphone", "Electronics"),
            new Product("P103", "Headphones", "Accessories"),
            new Product("P104", "Keyboard", "Accessories"),
            new Product("P105", "Monitor", "Electronics"),
            new Product("P106", "T-Shirt", "Apparel"),
            new Product("P107", "Running Shoes", "Apparel")
        };

        String target = "Monitor";
        System.out.println("Searching for product: " + target);

        // 1. Linear Search
        System.out.println("\n--- Linear Search ---");
        long startLinear = System.nanoTime();
        Product foundLinear = SearchAlgorithms.linearSearch(products, target);
        long endLinear = System.nanoTime();
        System.out.println("Result: " + foundLinear);
        System.out.println("Time taken: " + (endLinear - startLinear) + " ns");

        // Sort products by productName for Binary Search
        Arrays.sort(products);
        System.out.println("\nProducts sorted for Binary Search:");
        for (Product p : products) {
            System.out.println("  " + p);
        }

        // 2. Binary Search
        System.out.println("\n--- Binary Search ---");
        long startBinary = System.nanoTime();
        Product foundBinary = SearchAlgorithms.binarySearch(products, target);
        long endBinary = System.nanoTime();
        System.out.println("Result: " + foundBinary);
        System.out.println("Time taken: " + (endBinary - startBinary) + " ns");
    }
}

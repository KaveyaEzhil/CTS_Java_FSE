public class Main {

    public static void main(String[] args) {

        Product[] products = {
                new Product(101, "Laptop", "Electronics"),
                new Product(102, "Mouse", "Electronics"),
                new Product(103, "Keyboard", "Electronics"),
                new Product(104, "Shoes", "Fashion"),
                new Product(105, "Watch", "Accessories")
        };

        // Linear Search
        System.out.println("LINEAR SEARCH");

        Product result1 =
                SearchOperations.linearSearch(products, "Keyboard");

        if (result1 != null) {
            System.out.println("Product Found:");
            System.out.println(result1);
        } else {
            System.out.println("Product Not Found");
        }

        // Sort Array
        SearchOperations.sortProducts(products);

        // Binary Search
        System.out.println("\nBINARY SEARCH");

        Product result2 =
                SearchOperations.binarySearch(products, "Keyboard");

        if (result2 != null) {
            System.out.println("Product Found:");
            System.out.println(result2);
        } else {
            System.out.println("Product Not Found");
        }
    }
}
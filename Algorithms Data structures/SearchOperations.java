import java.util.Arrays;
import java.util.Comparator;

public class SearchOperations {

    // Linear Search
    public static Product linearSearch(Product[] products, String searchName) {

        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(searchName)) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String searchName) {

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int comparison =
                    products[mid].getProductName()
                    .compareToIgnoreCase(searchName);

            if (comparison == 0) {
                return products[mid];
            }
            else if (comparison < 0) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return null;
    }

    // Sort Products for Binary Search
    public static void sortProducts(Product[] products) {
        Arrays.sort(products,
                Comparator.comparing(Product::getProductName));
    }
}
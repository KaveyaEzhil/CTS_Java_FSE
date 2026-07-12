public class SearchAlgorithms {

    /**
     * Linear Search:
     * Iterates through the array and checks each product.
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static Product linearSearch(Product[] products, String targetName) {
        if (products == null || targetName == null) {
            return null;
        }
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    /**
     * Binary Search:
     * Requires the array to be sorted by productName.
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public static Product binarySearch(Product[] sortedProducts, String targetName) {
        if (sortedProducts == null || targetName == null) {
            return null;
        }
        int low = 0;
        int high = sortedProducts.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = sortedProducts[mid].getProductName().compareToIgnoreCase(targetName);

            if (comparison == 0) {
                return sortedProducts[mid];
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return null;
    }
}

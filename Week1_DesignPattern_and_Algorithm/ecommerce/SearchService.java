package ecommerce;

import java.util.Arrays;
import java.util.Comparator;

public class SearchService {

    // Linear search by product name
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    // Binary search by product name (array must be sorted)
    public static Product binarySearch(Product[] products, String targetName) {
        Arrays.sort(products, Comparator.comparing(Product::getProductName));

        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            Product midProduct = products[mid];
            int compare = targetName.compareToIgnoreCase(midProduct.getProductName());

            if (compare == 0) {
                return midProduct;
            } else if (compare < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return null;
    }
}
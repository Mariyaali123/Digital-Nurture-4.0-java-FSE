package ecommerce;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
                new Product(101, "Shoes", "Footwear"),
                new Product(102, "Laptop", "Electronics"),
                new Product(103, "T-shirt", "Clothing"),
                new Product(104, "Watch", "Accessories"),
                new Product(105, "Phone", "Electronics")
        };

        System.out.println("--- Linear Search ---");
        Product result1 = SearchService.linearSearch(products, "Laptop");
        System.out.println(result1 != null ? "Found: " + result1 : "Product not found.");

        System.out.println("\n--- Binary Search ---");
        Product result2 = SearchService.binarySearch(products, "Laptop");
        System.out.println(result2 != null ? "Found: " + result2 : "Product not found.");
}
}
package org.example;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
                new Product("P001", "Laptop", "Electronics"),
                new Product("P002", "Shirt", "Clothing"),
                new Product("P003", "Phone", "Electronics"),
                new Product("P004", "Watch", "Accessories")
        };

        // Linear Search
        Product result1 = SearchAlgorithms.linearSearch(products, "Phone");
        System.out.println("Linear Search Result: " + result1);

        // Binary Search (requires sorted array)
        SearchAlgorithms.sortProductsByName(products);
        Product result2 = SearchAlgorithms.binarySearch(products, "Phone");
        System.out.println("Binary Search Result: " + result2);

    }
}
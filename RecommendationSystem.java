package task4;

import java.util.*;

import java.util.*;

public class RecommendationSystem {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Java Programming Book", "Education"));
        products.add(new Product(2, "Python Programming Book", "Education"));
        products.add(new Product(3, "Wireless Mouse", "Electronics"));
        products.add(new Product(4, "Bluetooth Headphones", "Electronics"));
        products.add(new Product(5, "Fitness Tracker", "Fitness"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your preferred category:");
        String userPreference = sc.nextLine();

        System.out.println("Recommended Products:");

        for (Product product : products) {
            if (product.category.equalsIgnoreCase(userPreference)) {
                System.out.println("- " + product.name);
            }
        }
    }
}

class Product {
    int id;
    String name;
    String category;

    Product(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }
}




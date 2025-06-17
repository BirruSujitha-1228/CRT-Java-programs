import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Product class with name, price, and rating
class Product {
    private String name;
    private double price;
    private double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public double getRating() { return rating; }

    @Override
    public String toString() {
        return "Product Name: " + name + 
               ", Price: $" + price + 
               ", Rating: " + rating + "/5";
    }
}

public class ECommerceApp {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Smartphone", 699.99, 4.5));
        products.add(new Product("Laptop", 1099.99, 4.7));
        products.add(new Product("Headphones", 149.99, 4.2));
        products.add(new Product("Smartwatch", 199.99, 4.0));

        // Sort products by rating descending
        Collections.sort(products, Comparator.comparingDouble(Product::getRating).reversed());

        System.out.println("Welcome to the E-Commerce Store! (Sorted by Rating Descending)\n");
        for (Product product : products) {
            System.out.println(product);
        }
    }
}

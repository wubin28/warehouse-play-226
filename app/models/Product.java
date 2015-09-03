package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by twer on 9/3/15.
 */
public class Product {
    public String ean;
    public String name;
    public String description;

    private static List<Product> products;

    static {
        products = new ArrayList<Product>();
        products.add(new Product("1111111111111", "Paperclips 1", "Paperclips description 1"));
        products.add(new Product("2222222222222", "Paperclips 2", "Paperclips description 2"));
        products.add(new Product("3333333333333", "Paperclips 3", "Paperclips description 3"));
        products.add(new Product("4444444444444", "Paperclips 4", "Paperclips description 4"));
        products.add(new Product("5555555555555", "Paperclips 5", "Paperclips description 5"));
    }

    public Product() {
    }

    public Product(String ean, String name, String description) {
        this.ean = ean;
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ean='" + ean + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

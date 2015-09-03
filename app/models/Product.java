package models;

/**
 * Created by twer on 9/3/15.
 */
public class Product {
    public String ean;
    public String name;
    public String description;

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

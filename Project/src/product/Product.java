package product;

import order.IShippingCalculator;
import order.ITaxesCalculator;
import order.ITotalCalculator;

public class Product {
    private String name;
    private String description;
    private double price;

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public double getPrice() {
        return price;
    }

    public String toString() {
        return String.format("%s: $%.2f", getName(), getPrice());
    }
}

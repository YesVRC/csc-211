package product;

public class Grocery extends Product {
    private boolean perishable;


    public Grocery(String name, String description, double price, boolean perishable) {
        super(name, description, price);
        this.perishable = perishable;
    }

    public boolean isPerishable() {
        return perishable;
    }
}

package product;

public class Electronics extends Product {
    public enum ElectronicsCategory {
        Phone,
        Laptop,
        Tablet,
    }

    private ElectronicsCategory electronicsCategory;

    public Electronics(String name, String description, double price, ElectronicsCategory type) {
        super(name, description, price);
        this.electronicsCategory = type;
    }

    public ElectronicsCategory getElectronicsCategory() {
        return electronicsCategory;
    }
    public void setElectronicsCategory(ElectronicsCategory category) {
        this.electronicsCategory = category;
    }
}

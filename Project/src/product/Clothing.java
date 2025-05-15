package product;

public class Clothing extends Product {
    String color;
    String material;


    public Clothing(String name, String description, double price, String color, String material) {
        super(name, description, price);
        this.color = color;
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }
    public String getMaterial() {
        return material;
    }

}

package order;

import product.Electronics;
import product.Grocery;
import product.Product;

import java.util.ArrayList;
import java.util.List;

public class Order {
    static int counter = 0;
    int orderId;
    List<Product> cart;

    public Order() {
        cart = new ArrayList<>();
        orderId = counter;
        counter++;
    }

    public void addProduct(Product product) {
        cart.add(product);
    }
    public void addProducts(List<Product> products) {
        cart.addAll(products);
    }
    public void removeProduct(Product product) {
        cart.remove(product);
    }

    public List<Product> getCart() {
        return cart;
    }
    public int getOrderId() {
        return orderId;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : cart) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public static ITotalCalculator tariffTotalCalculator = (list) -> {
        double total = 0;
        for(Product product : list.getCart()){
            total += product instanceof Electronics ? product.getPrice() * 1.3 : product.getPrice();
        }
        return total;
    };

    public static ITaxesCalculator nyTaxCalculator = (total) -> {
        return total * 0.0825;
    };

    public static IShippingCalculator perishableShippingCalculator = (list) -> {
        double total = 10;
        for(Product product : list.getCart()){
            if(product instanceof Grocery){
                if(((Grocery) product).isPerishable()){
                    total += 2;
                }
            }
        }
        return total;
    };
}

package ui;

import order.Order;
import product.Clothing;
import product.Electronics;
import product.Grocery;
import product.Product;
import user.Admin;
import user.Customer;
import user.User;

import javax.swing.*;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;
import java.util.List;

import static order.Order.*;

public class UI {
    private JList<Product> cartList;
    private JList<Product> itemsList;
    private JButton addToCartButton;
    private JLabel itemsLabel;
    private JPanel MainPanel;
    private JButton checkoutButton;
    private JLabel cartLabel;
    private JButton removeButton;
    private JPanel leftPanel;
    private JScrollPane leftPane;
    private JScrollPane rightPane;
    private JTextField searchField;
    private JLabel searchLabel;
    private JPanel rightPanel;
    private JLabel priceLabel;
    private JLabel balanceLabel;

    private DefaultListModel<Product> items = new DefaultListModel<Product>();
    private DefaultListModel<Product> cart = new DefaultListModel<Product>();



    public UI(User user) {
        Product[] products = {
                new Clothing("Blue Jeans", "Blue Jeans", 5, "Blue", "Denim"),
                new Clothing("Black Jeans", "Blue Jeans", 3, "Black", "Denim"),
                new Clothing("Grey Jeans", "Blue Jeans", 6, "Grey", "Denim"),
                new Clothing("Red Sweatshirt", "Red Sweatshirt", 10, "Red", "Cotton"),
                new Electronics("iPhone 13", "Apple iPhone 13", 1000, Electronics.ElectronicsCategory.Phone),
                new Electronics("Surface Pro", "Microsoft Surface Pro", 2000, Electronics.ElectronicsCategory.Laptop),
                new Electronics("Galaxy Tab", "Samsung Galaxy Tab", 1500, Electronics.ElectronicsCategory.Tablet),
                new Grocery("Carrot", "Carrot", 0.10, true),
                new Grocery("Apple", "Apple", 0.20, true),
                new Grocery("Yogurt", "Yogurt", 0.30, true),
                new Grocery("Canned Corn", "Canned Corn", 1, false),
        };
        items.addAll(List.of(products));

        cartList.setModel(cart);
        itemsList.setModel(items);

        cart.addListDataListener(new ListDataListener() {
            private String getText(){
                return String.format("Total: $%.2f", tariffTotalCalculator.CalculateTotal(orderFromList(cartList)));
            }
            @Override
            public void contentsChanged(ListDataEvent e) {
                //System.out.println("contentsChanged: " + e.getIndex0() + ", " + e.getIndex1());
                priceLabel.setText(getText());
            }
            @Override
            public void intervalAdded(ListDataEvent e) {
                //System.out.println("intervalAdded: " + e.getIndex0() + ", " + e.getIndex1());
                priceLabel.setText(getText());
            }
            @Override
            public void intervalRemoved(ListDataEvent e) {
                //System.out.println("intervalRemoved: " + e.getIndex0() + ", " + e.getIndex1());
                priceLabel.setText(getText());
            }
        });
        if(user instanceof Customer cust){
            balanceLabel.setText(String.format("Balance: $%.2f", cust.getBalance()));
        }
        if(user instanceof Admin){
            balanceLabel.setVisible(false);
        }

        addToCartButton.addActionListener(e -> {
            if(itemsList.getSelectedIndex() != -1) cart.addElement(itemsList.getSelectedValue());
        });
        removeButton.addActionListener(e -> {
            if(cartList.getSelectedIndex() != -1) cart.removeElement(cartList.getSelectedValue());
        });

        checkoutButton.addActionListener(e -> {
            Order order = orderFromList(cartList);
            double total = tariffTotalCalculator.CalculateTotal(order);
            double tax = nyTaxCalculator.CalculateTaxes(total);
            double shipping = perishableShippingCalculator.CalculateShipping(order);

            if (user instanceof Customer cust){
                if(cust.getBalance() < total + tax + shipping){
                    JOptionPane.showMessageDialog(MainPanel, "You don't have enough money!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            JOptionPane.showMessageDialog(MainPanel, String.format("Price: $%.2f, Taxes: $%.2f, Shipping: $%.2f \nTotal: $%.2f", total, tax, shipping, (total + tax + shipping)), "Checkout", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);

        });

        searchField.addActionListener(e -> {
            String search = searchField.getText();
            items.clear();
            for(Product product : products) {
                if(product.toString().toLowerCase().contains(search.toLowerCase())) {
                    items.addElement(product);
                }
            }
        });

        // Window
        JFrame window = new JFrame("eCommerce");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(800, 800);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setContentPane(MainPanel);
    }

    private Order orderFromList(JList<Product> cartList) {
        ArrayList<Product> items = new ArrayList<>();
        for(int i = 0; i < cartList.getModel().getSize(); i++) {
            items.add(cartList.getModel().getElementAt(i));
        }
        Order order = new Order();
        order.addProducts(items);
        return order;
    }
}

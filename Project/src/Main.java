import ui.UI;
import user.Admin;
import user.Customer;
import user.User;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin("Admin", "secret");
        Scanner scan  = new Scanner(System.in);

        System.out.print("Enter admin password: ");
        String password = scan.nextLine();
        System.out.println();
        User user;
        if(admin.checkPassword(password)) {
            System.out.println("Welcome " + admin.getName() + "!");
            user = admin;
        }
        else {
            System.out.println("Not admin password");
            System.out.print("Enter your balance: ");
            user = new Customer("Customer", scan.nextDouble());
            System.out.println();
        }
        UI ui = new UI(user);
    }
}
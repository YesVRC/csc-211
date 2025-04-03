import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Module 7 Assignment");

        JLabel nameLabel = new JLabel("Name:", JLabel.CENTER);
        JLabel emailLabel = new JLabel("Email:", JLabel.CENTER);
        JLabel passwordLabel = new JLabel("Password:", JLabel.CENTER);
        JLabel confirmLabel = new JLabel("Confirm Password:", JLabel.CENTER);

        JTextField nameField = new JTextField();
        JTextField emailField = new JTextField();
        JTextField passwordField = new JTextField();
        JTextField confirmField = new JTextField();

        JButton submitButton = new JButton("Submit");
        JButton clearButton = new JButton("Clear");

        GridLayout grid = new GridLayout(5, 2);

        // Buttons
        submitButton.addActionListener((actionEvent) -> {
            if (nameField.getText().isEmpty() || emailField.getText().isEmpty() || passwordField.getText().isEmpty() || confirmField.getText().isEmpty()){
                JOptionPane.showMessageDialog(frame, "Please fill out every field", "Error: Empty Field", JOptionPane.ERROR_MESSAGE);
                return;
            }
            String[] messages = {
                    "Name: " + nameField.getText(),
                    "Email: " + emailField.getText(),
                    "Password: " + passwordField.getText(),
                    "Confirm Password: " + confirmField.getText(),
            };
            JOptionPane.showMessageDialog(frame, messages, "Submitted",JOptionPane.PLAIN_MESSAGE);
        });

        clearButton.addActionListener((actionEvent) -> {
            nameField.setText("");
            emailField.setText("");
            passwordField.setText("");
            confirmField.setText("");
        });

        // Window

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });

        frame.setSize(400, 400);
        frame.setLayout(grid);

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(emailLabel);
        frame.add(emailField);

        frame.add(passwordLabel);
        frame.add(passwordField);

        frame.add(confirmLabel);
        frame.add(confirmField);

        frame.add(submitButton);
        frame.add(clearButton);

        frame.setVisible(true);
    }
}
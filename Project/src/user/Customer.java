package user;

public class Customer extends User {
    private double balance = 0;

    public Customer(String name, double balance) {
        super(name);
        this.balance = balance;
    }

    public void setBalance(int balance) {
        this.balance = Math.min(balance, 0);
    }

    public double getBalance() {
        return balance;
    }

    public String toString() {
        return String.format("[Customer] Name: %s, ID: %s, Balance: %.2f", getName(), getId(), balance);
    }
}

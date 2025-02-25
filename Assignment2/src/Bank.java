import java.util.Arrays;

public class Bank {
    private double amount;

    // List would be a lot easier
    private double[] transactions;
    private int counter = 0;

    Bank(double amount){
        this.amount = amount;
        transactions = new double[20];
    }

    Bank(){
        this(1000.00);
    }

    public void withdraw(double amount){
        this.amount -= amount;
        transactions[counter] = -amount;
        counter++;
    }

    public void deposit (double amount){
        this.amount += amount;
        transactions[counter] = amount;
        counter++;
    }

    public void listInteractions(){
        System.out.println(Arrays.toString(this.transactions));
    }
}

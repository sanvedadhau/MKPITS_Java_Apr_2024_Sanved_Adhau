package BankingSystem;

public class Accounts {
    private String name;
    private int balance;


    // Making Constructor
    // Default Constructor
    public Accounts() {
    }

    // Parameterized Constructor
    public Accounts(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    // Methods to Access and Manipulate the data
    // getter methode to access tha data
    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    // setter Methode to Manipulate the data  (to display change in acc balance)
    public void setBalance(int balance) {
        this.balance = balance;
    }

}

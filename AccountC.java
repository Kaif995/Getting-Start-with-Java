package firstProject;

public abstract class AccountC {

    protected String id;
    protected double balance;

    public AccountC(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public abstract boolean withdraw(double amount);

    public abstract void deposit(double amount);
}


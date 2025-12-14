package firstProject;

public class SavingsAccount extends AccountC {

    private static final double MIN_BALANCE = 10.0;
    private static final double WITHDRAW_FEE = 2.0;

    public SavingsAccount(String id, double initialDeposit) {
        super(id, initialDeposit);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public boolean withdraw(double amount) {
        double totalDeduction = amount + WITHDRAW_FEE;

        if (balance - totalDeduction < MIN_BALANCE) {
            return false;
        }

        balance -= totalDeduction;
        return true;
    }
}


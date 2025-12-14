package firstProject;

public class TestBankApp {

    public static void main(String[] args) {
    	System.out.println("Made By Muhammad Kaif Shamim!");

        SavingsAccount account = new SavingsAccount("420", 50);

        System.out.println("Account ID: " + account.getID());
        System.out.println("Initial Balance: $" + account.getBalance());

        account.deposit(30);
        System.out.println("Balance after deposit: $" + account.getBalance());

        boolean success = account.withdraw(30);
        System.out.println("Withdrawal Successful: " + success);
        System.out.println("Balance after withdrawal: $" + account.getBalance());

        success = account.withdraw(40);
        System.out.println("Withdrawal Successful: " + success);
        System.out.println("Final Balance: $" + account.getBalance());
    }
}

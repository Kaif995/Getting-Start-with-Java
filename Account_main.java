package firstProject;

public class Account_main {

	public static void main(String[] args) {
	    // Create an Account object with ID 1122 and balance $20,000
        Account myAccount = new Account(1122, 20000);

        // Set the annual interest rate to 4.5%
        Account.setAnnualInterestRate(4.5);

        // Withdraw $2,500 
        myAccount.withdraw(2500);

        // Deposit $3,000
        myAccount.deposit(3000);

        // Print account details
        System.out.println("Account ID: " + myAccount.getId());
        System.out.println("Balance: $" + myAccount.getBalance());
        System.out.println("Monthly Interest: $" + myAccount.getMonthlyInterest());
        System.out.println("Date Created: " + myAccount.getDateCreated());
        System.out.println("Made By Muhammad Kaif Shamim");

	}

}

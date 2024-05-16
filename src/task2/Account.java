package task2;

public class Account {
	
	 private double balance;

	    public Account(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println(amount + " deposited successfully.");
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance -= amount;
	            System.out.println(amount + " withdrawn successfully.");
	        } else {
	            System.out.println("Insufficient balance.");
	        }
	    }

	    public void displayBalance() {
	        System.out.println("Balance: " + balance);
	    }
	}



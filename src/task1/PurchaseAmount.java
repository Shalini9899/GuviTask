package task1;

import java.util.Scanner;

public class PurchaseAmount {

	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the purchase amount: ");
	        
	        double purchaseAmount = scanner.nextDouble();

	        double discount = 0.0;

	        if (purchaseAmount >= 500 && purchaseAmount < 1000) {
	            discount = 0.10; 
	        } else if (purchaseAmount >= 1000) {
	            discount = 0.20; 
	        }

	        double finalAmount = purchaseAmount - (purchaseAmount * discount);

	        System.out.println("Final payable amount after applying discount: $" + finalAmount);

	        scanner.close(); 
	    }
	}

	


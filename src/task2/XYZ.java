package task2;

import java.util.Scanner;

public class XYZ {
	
	
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Product[] products = new Product[5];

	        // Accepting product information from the user
	        for (int i = 0; i < products.length; i++) {
	            System.out.println("Enter Product ID, Price, and Quantity for product " + (i + 1) + ":");
	            int pid = scanner.nextInt();
	            double price = scanner.nextDouble();
	            int quantity = scanner.nextInt();
	            products[i] = new Product(pid, price, quantity);
	        }

	        // Finding the PID of the product with the highest price
	        int maxPid = -1;
	        
	 }
}

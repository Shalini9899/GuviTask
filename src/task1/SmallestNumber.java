package task1;

import java.util.Scanner;

public class SmallestNumber {
	
	 public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter three numbers:");
	        
	        System.out.print("Number 1: ");
	        
	        double num1 = scanner.nextDouble();
	        
	        System.out.print("Number 2: ");
	        
	        double num2 = scanner.nextDouble();
	        
	        System.out.print("Number 3: ");
	        
	        double num3 = scanner.nextDouble();
	        

	        double smallest = num1;
	        
	        if (num2 < smallest) {
	        	
	            smallest = num2;
	           
	        }
	      
	        if (num3 < smallest) {
	        	
	            smallest = num3;
	        }

	        System.out.println("The smallest number is: " + smallest);

	        scanner.close();
	    }
	}

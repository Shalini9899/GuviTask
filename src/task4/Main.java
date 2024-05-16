package task4;

public class Main {

	 public static void main(String[] args) {
	        try {
	            Voter voter1 = new Voter(1, "Shalini Balusamy", 23);
	            System.out.println("Voter ID: " + voter1.getVoterId());
	            System.out.println("Name: " + voter1.getName());
	            System.out.println("Age: " + voter1.getAge());

	            Voter voter2 = new Voter(2, "Arputha Raman", 15);
	            System.out.println("Voter ID: " + voter2.getVoterId());
	            System.out.println("Name: " + voter2.getName());
	            System.out.println("Age: " + voter2.getAge());
	        } catch (InvalidAgeException e) {
	            System.out.println("Exception: " + e.getMessage());
	        }
	    }
	}


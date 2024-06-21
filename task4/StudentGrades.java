package task4;

import java.util.HashMap;

public class StudentGrades {

	
	 private HashMap<String, Integer> gradesMap;

	    public StudentGrades() {
	        this.gradesMap = new HashMap<>();
	    }

	        // this is the method to add a new student
	    public void addStudent(String name, int grade) {
	        gradesMap.put(name, grade);
	    }

	    // this is the method to remove a student
	    public void removeStudent(String name) {
	        gradesMap.remove(name);
	    }

	    //  this is the method to display a student's grade by name
	    public void displayGrade(String name) {
	        Integer grade = gradesMap.get(name);
	        if (grade != null) {
	            System.out.println(name + "'s grade is: " + grade);
	        } else {
	            System.out.println("Student not found.");
	        }
	    }

	    public static void main(String[] args) {
	        StudentGrades studentGrades = new StudentGrades();

	        // Adding students and their grades
	        studentGrades.addStudent("Shalini Balusamy", 85);
	        studentGrades.addStudent("Arputha Raman", 72);
	        studentGrades.addStudent("Saihera", 90);

	        // Displaying a student's grade
	        studentGrades.displayGrade("Shalini Balusamy"); 

	        // Removing a student
	        studentGrades.removeStudent("Saihera");

	        // Displaying a student's grade after removal
	       studentGrades.displayGrade("Arputha Raman"); 
	    }
	}


package com.demo.task5;

	
	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Collectors;

	public class StudentName {
		
	    public static void main(String[] args) {
	    	
	        List<String> studentNames = Arrays.asList("Arputha", "Balusamy", "Arvind", "Dinesh", "Anna", "Jack", "Agalaya", "Esha", "Ahana", "Shalini");

	        List<String> studentsWithA = studentNames.stream()
	                .filter(name -> name.startsWith("A")) 
	                .collect(Collectors.toList()); 

	        System.out.println("Students studentswhose names start with 'A':");
	        System.out.println(studentsWithA);
	    }
	}




package com.demo.task5;

	
	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Collectors;
	
	public class EmptyArray {

	    public static void main(String[] args) {
	        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

	        List<String> nonEmptyStrings = strings.stream()
	                .filter(str -> !str.isEmpty()) 
	                .collect(Collectors.toList()); 
	        
	        System.out.println("List of non-empty strings:");
	        System.out.println(nonEmptyStrings);
	    }
	
	}


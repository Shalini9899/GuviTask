package task2;

import java.util.Scanner;

class Person {

	String name;
	int age=18;
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	void displayDetails() {
		System.out.print("Name: "+name +"\n" + "Age: " +age);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Person person=new Person("Shalini", 24);	
		person.displayDetails();
		
	}

}
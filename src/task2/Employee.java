package task2;

public class Employee extends Person  {

	    int employeeId;
	    double salary;
		public String name;

	    public Employee(String name, int age, int employeeId, double salary) {
	        super(name, age);
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }
	}
	

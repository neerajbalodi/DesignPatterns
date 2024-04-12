package Factory.Practice;

public class Main {

	public static void main(String[] args) {

		// Below case is of tightly coupled class, so to remove dependency we will implement Factory pattern
		Employee employee = new AdroidDeveloper();
		System.out.println(employee.salary());
		
		// Implementing Factory Pattern just we are passing String type argument which is helping in loose coupling.
		Employee employee2 = EmployeeFactory.getEmployee("WEB-DEVELOPER");
		System.out.println(employee2.salary());
		
	}

}

package Factory.Practice.abstractFactory;

import Factory.Practice.Employee;

public class Main {
	
	public static void main(String[] args) {
		
		EmployeeAbstract e1 = EmployeeFactory.getEmployee(new WebDevFactory());
		System.out.println(e1.name());
		
	}

}

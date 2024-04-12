package Factory.Practice.abstractFactory;


public class EmployeeFactory {
	
	public static EmployeeAbstract getEmployee(EmployeeAbstractFactory employeeAbstractFactory) {
		return employeeAbstractFactory.createEmployee();
	}

}

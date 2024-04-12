package Factory.Practice;

public class EmployeeFactory {
	
	public static Employee getEmployee(String employeeType) {
		//Employee employee = null;
		if(employeeType=="WEB-DEVELOPER") {
			return new WebDeveloper();
		}
		else if(employeeType=="ANDROID-DEVELOPER") {
			return new AdroidDeveloper();
		}
		return null;
	}

}

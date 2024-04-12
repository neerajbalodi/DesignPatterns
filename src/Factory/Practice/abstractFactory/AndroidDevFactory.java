package Factory.Practice.abstractFactory;


public class AndroidDevFactory extends EmployeeAbstractFactory{

	@Override
	public EmployeeAbstract createEmployee() {
		return new AndroidDeveloper();
	}


}

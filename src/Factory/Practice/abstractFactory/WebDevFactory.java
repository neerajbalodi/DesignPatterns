package Factory.Practice.abstractFactory;


public class WebDevFactory extends EmployeeAbstractFactory{

	@Override
	public EmployeeAbstract createEmployee() {
		return new WebDeveloper();
	}

}

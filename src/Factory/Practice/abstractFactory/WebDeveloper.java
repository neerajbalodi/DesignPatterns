package Factory.Practice.abstractFactory;


public class WebDeveloper implements EmployeeAbstract{

	@Override
	public int salary() {
		return 1500100;
	}
	
	@Override
	public String name() {
		System.out.println("Here is Web Developer");
		return "Web Developer";
	}

}

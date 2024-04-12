package Factory.Practice.abstractFactory;


public class AndroidDeveloper implements EmployeeAbstract {

	@Override
	public int salary() {
		return 2000000;
	}
	
	@Override
	public String name() {
		System.out.println("Here is Android Developer");
		return "Android Developer";
	}

}

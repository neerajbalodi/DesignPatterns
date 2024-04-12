package Factory.Practice;

public class AdroidDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("Android Developer Salary is : ");
		return 10000;
	}

}

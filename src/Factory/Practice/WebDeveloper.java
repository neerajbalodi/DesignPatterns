package Factory.Practice;

public class WebDeveloper implements Employee {

	@Override
	public int salary() {
		System.out.println("Web Developer salary is : ");
		return 20000;
	}

}

package singleton;

public class User implements Cloneable{
	
	private String name;
	private String email;
	
	private static User user ;
	
	private User() {
		super();
	}
	
	private User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	public static User getInstance() {
		if(user==null) {
			synchronized (User.class) {
				user = new User();
			}
		}
		return user;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public Object clone() {
		return new User();
	}
	
	

}

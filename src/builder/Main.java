package builder;


public class Main {

	public static void main(String[] args) {
		
		User user = new User.UserBuilder()
				.setEmailId("neeraj@gmail.com")
				.setUserId("123")
				.setUserName("neerajbalodi")
				.build();
		
		User user2 = new User.UserBuilder()
				.setEmailId("ankush@gmail.com")
				.setUserName("ankushbdwaj")
				.build();
		
		System.out.println(user.toString());
		
		
		System.out.println(user2.toString());

	}

}

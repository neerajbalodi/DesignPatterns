package singleton;

import java.lang.reflect.Constructor;

public class Test {

	public static void main(String[] args) throws Exception {
		
		//EagerInitialization.getInsatnce();
		
		/*
		 * Reflection APIs can be used to break Singleton APIs
		 * Serialization/Deserialization also leads to breaking of object
		 * Cloning also can break singleton
		 */
		
		User user1 = User.getInstance();
		user1.setEmail("Test1");
		user1.setName("NB");
		
		System.out.println(user1.hashCode());
		
		//user1 = null;
		
		// Reflection API
		
//		Constructor<User> constructor = User.class.getDeclaredConstructor();
//		constructor.setAccessible(true);
//		User user2 = constructor.newInstance();
		
		User user2 = User.getInstance();
		user2.setEmail("Test123");
		user2.setName("Testing");
		
		System.out.println(user2.hashCode());
		System.out.println(user1.getEmail());
		
		
		// Breaking code using cloning
		User user3 = (User) user1.clone();
		
		System.out.println(user3.hashCode());


	}

}

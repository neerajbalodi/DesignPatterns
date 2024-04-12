package singleton;

public class EagerInitialization {
	
	private static final EagerInitialization instance = new EagerInitialization();
	private EagerInitialization() {
		
	};
	
	public static EagerInitialization getInsatnce() {
		System.out.println("Eager initialization completion...");
		return instance;
	}

}

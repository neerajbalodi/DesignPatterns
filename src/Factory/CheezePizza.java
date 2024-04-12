package Factory;

public class CheezePizza implements Pizza {

	@Override
	public void bake() {
		System.out.println("Baking pizza...");
	}

	@Override
	public void prepare() {
		System.out.println("Preparing Cheese pizza...");
	}

	@Override
	public void cut() {
		System.out.println("Cutting cheese pizza...");
	}

}

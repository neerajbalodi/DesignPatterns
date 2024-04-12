package Factory;

public class VegiePizza implements Pizza {

	@Override
	public void bake() {
		System.out.println("Baking Vegie pizza...");
	}

	@Override
	public void prepare() {
		System.out.println("Preparing Vegie pizza...");
	}

	@Override
	public void cut() {
		System.out.println("Cutting Vegie pizza...");
	}

}

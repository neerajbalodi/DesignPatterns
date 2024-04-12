package Factory;

public class PizzaFactory {
	public static Pizza createPizza(String type) {
		Pizza p = null;
		
		if(type.equals("cheese")) {
			p = new CheezePizza();
		}else if (type.equals("chicken")) {
			p = new ChickenPizza();
		} else if (type.equals("vegie")) {
			p = new VegiePizza();
		}
		
		return p;
	}
}

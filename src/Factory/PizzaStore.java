package Factory;

public class PizzaStore {
	
	public Pizza orderPizza(String type) {
		Pizza p = null;
		// Here Pizza is prepared here in this class, we can move it to factory class.
		if(type.equals("cheese")) {
			p = new CheezePizza();
		}else if (type.equals("chicken")) {
			p = new ChickenPizza();
		} else if (type.equals("vegie")) {
			p = new VegiePizza();
		}
		
		
		p.prepare();
		p.bake();
		p.cut();
		
		// Using factpry class
		
		Pizza p1 = PizzaFactory.createPizza(type);
		p1.prepare();
		p1.bake();
		p1.cut();
		
		return p1;
	}

}

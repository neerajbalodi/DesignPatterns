package Strategy.WithoutStrategy;

public class Main {
	
	public static void main(String[] args) {
		
		Vehicle vehicle = new OffRoadVehicle();
		System.out.println(vehicle.drive());
		
	}

}

package Strategy;

public class Vehicle {
	
	DriveStrategy driveObj;
	
	public Vehicle(DriveStrategy driveStrategy) {
		this.driveObj=driveStrategy;
	}
	
	public void drive() {
		driveObj.drive();
	}
	
}

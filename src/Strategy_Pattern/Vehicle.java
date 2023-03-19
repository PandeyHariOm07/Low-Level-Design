package Strategy_Pattern;

public class Vehicle {
	driveInterface driveObj;
	Vehicle(driveInterface driobj){
		this.driveObj = driobj;
	}
	public void drive() {
		driveObj.drive();
	}
}

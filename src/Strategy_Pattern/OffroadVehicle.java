package Strategy_Pattern;

public class OffroadVehicle extends Vehicle {

	OffroadVehicle() {
		super(new SportsDriveStrategy());
	}

}

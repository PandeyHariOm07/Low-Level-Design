package Strategy_Pattern;

public class SportVehicle extends Vehicle{

	SportVehicle() {
		super(new SportsDriveStrategy());
	}

}

package Strategy_Pattern;

public class GoodsVehicle extends Vehicle {

	GoodsVehicle() {
		super(new NormalDriveStrategy());
	}

}

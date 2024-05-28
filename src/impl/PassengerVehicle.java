package impl;

import Strategy.NormalDriveStategy;

public class PassengerVehicle extends Vehicle{
	 PassengerVehicle() {
		super(new NormalDriveStategy());
	}

}

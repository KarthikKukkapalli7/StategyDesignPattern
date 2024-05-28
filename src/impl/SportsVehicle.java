package impl;

import Strategy.NormalDriveStategy;
import Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

	 SportsVehicle() {
		super(new SportsDriveStrategy());
	}
	
}

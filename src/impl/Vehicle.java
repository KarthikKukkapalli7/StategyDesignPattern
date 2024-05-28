package impl;

import Strategy.DriveStategy;

public class Vehicle {
	
	DriveStategy obj;

	Vehicle(DriveStategy driveStategy){
		this.obj=driveStategy;
	}
	public void drive() {
		obj.drive();
	}
	
}

package com.booking.motor;

import java.util.ArrayList;
import java.util.List;

public class VehicleControllerSystem {

	public static void main(String args[]) {
		List<Vehicle> vehList = new ArrayList<Vehicle>();
		vehList.add(new Vehicle("Toyota Innova", "white", "HR12Y1823"));
		vehList.add(new Vehicle("Nissan Latio", "white", "KDFJGK435"));
		vehList.add(new Vehicle("Honda Civic", "blue", "HR12Y6823"));
		vehList.add(new Vehicle("Subaru WRX", "white", "HR12Y1823"));
		
		
		for(Vehicle s : vehList) {
			System.out.println(s.getModel() +  " " + s.getPlateNumber() + " " + s.getColour());
		}
		
		Vehicle vehicle = new Vehicle();
		Rider rider = new Rider();
		Driver driver = new Driver();

		System.out.println(vehicle.getColour() + " " + vehicle.getModel() + " "
				+ vehicle.getPlateNumber());
		System.out.println(rider.getName());
		System.out.println(driver.getName());

		if (vehicle.isVehicleAvailable()) {
			if (vehicle.getCurrentRider() == null) {
				vehicle.setCurrentRider(rider.getName());
			}

			if (vehicle.getCurrentDriver() == null) {
				vehicle.setCurrentDriver(driver.getName());
			}

			vehicle.setVehicleAvailable(false);
		}

		System.out.println(vehicle.getCurrentDriver() + " "
				+ vehicle.getCurrentRider() + " "
				+ vehicle.isVehicleAvailable());
	}
}

package com.booking.motor;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {
	private String plateNumber 	= "DL1RT8428";
	private String model 	= "AudiA8";
	private String colour	= "red";

	private String currentRider = null;
	private String currentDriver = null;
	
	private boolean isVehicleAvailable = true;
	

	public Vehicle( String model, String colour, String plateNumber) {
		super();
		this.plateNumber = plateNumber;
		this.model = model;
		this.colour = colour;
	}
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public String getCurrentDriver() {
		return currentDriver;
	}
	public void setCurrentDriver(String currentDriver) {
		this.currentDriver = currentDriver;
	}
	public String getCurrentRider() {
		return currentRider;
	}
	public void setCurrentRider(String currentRider) {
		this.currentRider = currentRider;
	}

	
	public boolean isVehicleAvailable() {
		return isVehicleAvailable;
	}
	public void setVehicleAvailable(boolean isVehicleAvailable) {
		this.isVehicleAvailable = isVehicleAvailable;
	}
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	public String getPlateNumber() {
		return plateNumber;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
}

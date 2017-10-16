package com.company;

import java.util.List;

/**
 * Created by James on 6/21/16.
 */
public class Garage{
	List<Car> cars;
	
	boolean isDoorOpen;

	public Garage(List<Car> cars, boolean isDoorOpen) {
		super();
		this.cars = cars;
		this.isDoorOpen = isDoorOpen;
	}

	public List<Car> getmCars() {
		return cars;
	}

	public void setmCars(List<Car> cars) {
		this.cars = cars;
	}

	public boolean isDoorOpen() {
		return isDoorOpen;
	}

	public void setDoorOpen(boolean isDoorOpen) {
		this.isDoorOpen = isDoorOpen;
	}
	
	
}

package com.company;

/**
 * Created by roosevelt on 6/21/16.
 */
public class Car {
    String color;
    int year;
    double speed;
    
	public Car(String color, int year, double speed) {
		super();
		this.color = color;
		this.year = year;
		this.speed = speed;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
    
	@Override
	public String toString() {
		return "Color: " + this.color +
				"\nYear: " + this.year +
				"\nSpeed: " + this.speed;
	}
    
}

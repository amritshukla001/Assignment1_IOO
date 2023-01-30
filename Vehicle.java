package day4;

public class Vehicle {
	public Vehicle(String color, int noOfWheels, String model) {
		super();
		this.color = color;
		this.noOfWheels = noOfWheels;
		this.model = model;
	}
	String color;
	int noOfWheels;
	String model;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNoOfWheels() {
		return noOfWheels;
	}
	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	
}

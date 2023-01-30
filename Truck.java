package day4;

public class Truck extends Vehicle {
	private String owner;
	

	public Truck(String color, int noOfWheels, String model, String owner) {
		super(color, noOfWheels, model);
		this.owner = owner;
	}
	
	public void display() {
		System.out.println("-----Truck Details: ------ ");
		System.out.println("Color: " + color);
		System.out.println("Number Of Wheels: " + noOfWheels);
		System.out.println("Model: " + model);
		System.out.println("Owner: " + owner);
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	
}

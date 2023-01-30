package day4;

public class Car extends Vehicle{
	private String owner;

	public Car(String color, int noOfWheels, String model, String owner) {
		super(color, noOfWheels, model);
		this.owner = owner;
	}
	
	public void display() {
		System.out.println("------Car Details: --------");
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

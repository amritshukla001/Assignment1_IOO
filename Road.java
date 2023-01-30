package day4;

public class Road {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj1 = new Car("black",4,"Audi-A1","Amal");
		Bus obj2 = new Bus("black",12,"Volvo-V1","Anushk");
		Truck obj3 = new Truck("red",16,"Mahindra-V1","Vivek");
		
		obj1.display();
		obj2.display();
		obj3.display();
	}

}

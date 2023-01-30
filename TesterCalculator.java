package day4;

public class TesterCalculator {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1=new Calculator();
		Calculator c2=new Calculator();
		Calculator c3=new Calculator();
		
		double res1=c1.findAverage(100.02,20.0578,34.567);
		double res2=c2.findAverage(100.02,20.0578,34.567,45.67);
		double res3=c3.findAverage(100.02,20.0578,34.567,50.56,23.12);
		
		
		System.out.println("Average of three numbers: " + res1);
		System.out.println("Average of four numbers: " + res2);
		System.out.println("Average of five numbers: " + res3);
	}
}

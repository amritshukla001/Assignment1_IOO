package day4;

public class Calculator {
	double findAverage(double a,double b,double c) {
		return  (Math.round(((a+b+c)/3)*100.0)/100.0);
		
	}
	
	double findAverage(double a,double b,double c,double d) {
		return (Math.round(((a+b+c+d)/4)*100.0)/100.0);
	}
	
	double findAverage(double a,double b,double c,double d,double e) {
		return (Math.round(((a+b+c+d+e)/5)*100.0)/100.0);
	}
	
}

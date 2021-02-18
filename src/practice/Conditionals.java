package practice;

public class Conditionals {
	
	public static void main(String[] args) {
		System.out.println(divide(12, 100));		
	}
	

	public static double divide(double a, double b) {
		if(a < b) {
			System.out.println("Unable to divide. Please ensure the first number is higher than the second.");				
			return 0;
		} else {
			return a / b;
		}	
	}
}

// A calculator that refuses to divide when the first number is smaller than the second
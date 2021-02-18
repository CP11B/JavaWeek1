package practice;

public class Calculator {
	
	public static void main(String[] args) {
		System.out.println(add(2, 4));
		System.out.println(subtract(2, 4));
		System.out.println(multiply(2, 4));
		System.out.println(divide(2, 4));
	}
	

	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public static int subtract(int a, int b) {
		return a - b;
	}
	
	public static int multiply(int a, int b) {
		return a * b;
	}
	public static double divide(double a, double b) {
		return a / b;
	}
}

// An addition method
// A subtraction method
// A multiplication method
// A division method

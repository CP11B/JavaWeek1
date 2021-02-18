package practice;

public class Array1 {

	public static void main(String[] args) {
		arrayMeUp();
		
	}
	
	public static void arrayMeUp() {
	
		int[] anArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			
		for (int i = 0; i < anArray.length; i++) {
			System.out.println(anArray[0+i]);
		}
	}
	// Create an array that will hold 10 integer values
	// Populate the array with values
	// Call and output each element
}

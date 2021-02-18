package practice;

public class Array2 {
	
	public static void main(String[] args) {
		gimmeArray();
	}
	
	public static void gimmeArray() {
	
		int[] anotherArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int notSure;
		
		for (int each:anotherArray) {
			System.out.println(each);
			notSure = each * 10;
				System.out.println(notSure);
		}
	}
}

// Create a for loop that populates an integer array with values 
// Output them at each iteration
// Create another loop that iterates through the array
// Change the values at each point to equal itself times 10
// Output them at each iteration	
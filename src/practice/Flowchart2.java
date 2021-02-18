package practice;

public class Flowchart2 {

	
	public static int a;
	
	public static void main(String[] args) {
		flow2();
	}
	
	public static void flow2() {
		
		for(int a = 100; a <= 200; a++) {	
			if(a % 2 == 0) {
				System.out.println(a + " -");
			} else {
				System.out.println(a + " *");
			}
			
		}
	}
}

// increment by 1 from 100 to 200
// - for even numbers
// * for odd numbers
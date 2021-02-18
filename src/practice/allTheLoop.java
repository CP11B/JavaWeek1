package practice;

public class allTheLoop {
	
	
	public static void main(String[] args) {
		muchLoop();
	}
	
	public static void muchLoop() {
		for(int i = 0; i < 11; i++) {
			for(int j = 0; j < i; j++) {
				System.out.println(i); 
			}
		}
	}
}
// Print out 1 to 10 the corresponding amount of times (eg print 3 3 times and 10 10 times)
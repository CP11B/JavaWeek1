package practice;

public class Blackjack {
	
	public static void main(String[] args) {	
		System.out.println(blackjack(22, 22));		
	}
	
	
	public static int blackjack(int a, int b) {

		if (a < 0 && a > 21 && b < 0 && b > 21) {
			return 0;
		} else if (a == 21 || b == 21) {
			System.out.println(21);
			return 21;
		} else {
			System.out.println(a);
			return 21;
			// Math.max(0, i) == Math.min(i, 100)
			// return highest number
			//return Math.max(a, b);
			
		}	
	}
}
//Given 2 integer values greater than 0, 
//return whichever is closest to 21 without going over 21. 
//If they both go over 21 then return 0.
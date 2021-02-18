package practice;

public class NumberAdder {
	
	public static void main(String[] args) {	
		numberMe(9999);	
	}
	
	public static void numberMe(int givenNumber) {
		// get digit length of given number
		int sumOfNum = 0;
		while (givenNumber > 0) {
			sumOfNum = sumOfNum + givenNumber % 10;
			givenNumber = givenNumber / 10;
		}
			System.out.println("Your number added together is " + sumOfNum);
	}
}
// Creates method that takes a number 10-99, and adds the two digits together for example 74 = 7 + 4 = 11

	
	
	
	
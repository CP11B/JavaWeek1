package practice;

public class Monies {

	
	public static void main(String[] args) {
		coinage(20,4.50);
		
	}
	
		public static void coinage(double moneyGiven, double cost) {
			double change = moneyGiven - cost;
			
			int twentyPoundNotes = 0;
			int tenPoundNotes = 0;
			int fivePoundNotes = 0;
			int twoPoundCoin = 0;
			int onePoundCoin = 0;
			int fiftyPenceCoin = 0;
			int twentyPenceCoin = 0;
			int tenPenceCoin = 0;
			int fivePenceCoin = 0;
			int twoPenceCoin = 0;
			int onePenceCoin = 0;
			
			// 
			
			System.out.println(change);
		
		}
	
}


//Given a cost and an amount, work out the change given in specific coinage.
//For example; the cost is £4.58 and the customer pays with a £20 note so as change they receive:
//1 £10 note
//1 £5 note
//2 20p's
//1 2p
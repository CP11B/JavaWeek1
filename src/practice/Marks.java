package practice;

public class Marks {
	public static int biology;
	public static int physics;
	public static int chemistry;
	public static double availableMarks;
	public static int sumOfMarks;
	public static double totalPercentage;
	public static double chemPercentage;
	public static double bioPercentage;
	public static double physPercentage;
	
	public static void main(String[] args) {
		
		availableMarks = 450;
		biology = 150;
		chemistry = 149;
		physics = 150;
		sumOfMarks = biology + chemistry + physics;
		
		if (sumOfMarks > availableMarks) {
			System.out.println("Please double check marks, they can't be greater than 150!");
		} else {
		
			System.out.println(getResults());
			getPercent();
		}
	}
	
	
	
	public static String getResults() {
		return "Physics: " + physics + " Chemistry: " + chemistry + " Bio: " + biology;
	}
	
	public static void getPercent() {
		totalPercentage = sumOfMarks / availableMarks * 100;
		physPercentage = physics / 150.0 * 100;
		chemPercentage = chemistry / 150.0 * 100;
		bioPercentage = biology / 150.0 * 100;	
		System.out.println("Biology: " + bioPercentage + "%");
		System.out.println("Physics: " + physPercentage + "%");	
		System.out.println("Chemistry: " + chemPercentage + "%");
		System.out.println("Overall: " + totalPercentage + "%");
		
		if (totalPercentage < 60 || physPercentage < 60 || chemPercentage < 60 || bioPercentage < 60) {			
			System.out.println("Unfortunately, the student has failed.");	
		} else {
			System.out.println("Student has passed.");	
		}
	}
}


// Physics, Chemistry, and Biology exams each have a maximum of 150 marks
// Find percentage of total (overall) marks 
// Displays the results that the person got for each exam and then the total mark. 
// Finds and display the percentage that the person received for the exams overall
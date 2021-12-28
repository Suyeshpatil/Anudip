package AssignmentDec27;
public class Resultgrade {

	public static void main(String[] args) {
		char grade = 'u'; // any varible
		int Marks = 60; // marks get.
//Condition for the exams
		if (Marks >= 90) {
			grade = 'A';
			System.out.println("Perfect,Keep it up");
		} else if (Marks >= 80) {
			grade = 'B';
			System.out.println("Excellent");
		} else if (Marks >= 75) {
			grade = 'C';
			System.out.println("Distinction");
		} else if (Marks >= 60) {
			grade = 'D';
			System.out.println("First class");
		} else {
			grade = 'F';
			System.out.println("Need to study More.");
		}
	}
}

//output
//First class
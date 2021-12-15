package assignment9;

import java.util.Scanner;

public class fact {
	public static void main (String[] args) {
		int i;
		int fact=1;       //initialze factorial
		
		Scanner sc=new Scanner(System.in);     //Take the input from user
		System.out.println("Enter the num:"); //print statement
		int num=sc.nextInt();			//value assigned to num by user
		
		for(i=1;i<=num;i++) { 			//condition for factorial
			fact= fact *i;    
		}
		System.out.println("Factorial of "+num+ "is :"+fact);
		

}
	
}
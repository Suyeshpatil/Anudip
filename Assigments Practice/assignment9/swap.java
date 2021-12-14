package assignment9;

import java.util.Scanner;

public class swap {
public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);     //Take the input from user
		System.out.println("Enter the num1:"); //print statement
		int a=sc.nextInt();						//assigning value given by user
		
		Scanner sa=new Scanner(System.in);					//Take the input from user
		System.out.println("Enter the num2:");				//print statement
		int b=sa.nextInt();									//assigning value given by user
		System.out.println("Before Swapping");				////print statement
		System.out.println("Num1 is  "+a+ " and " +"Num2 is "+b);	//showing value with help of print statement.
		int temp;
		temp=a;                                         //store the value of a in temporary variable
		a=b;											//Assigning value of a from b
		b=temp;											//Assigning value of b from temporary variable
		System.out.println("Before Swapping");
		System.out.println("Num1 is  "+a+ " and " +"Num2 is "+b);//showing value with help of print statement.
		
		
}
}
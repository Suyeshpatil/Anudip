package assignment9;
//Write an application that inputs three integers from the user and
//displays the sum, average, product, smallest and largest of the numbers.
import java.util.Scanner;

public class Threeinput {
	public static void main (String[] args) {
	Scanner sc=new Scanner(System.in);     //Take the input from user
	System.out.println("Enter the num1:"); //print statement
	int a=sc.nextInt();						//assigning value given by user
	
	Scanner sa=new Scanner(System.in);					//Take the input from user
	System.out.println("Enter the num2:");				//print statement
	int b=sa.nextInt();									//assigning value given by user
	
	Scanner sb=new Scanner(System.in);					//Take the input from user
	System.out.println("Enter the num3:");				//print statement
	int c=sa.nextInt();									//assigning value given by user
	
	int sum = a+ b + c;									//addition
	System.out.println("The Addition of  no is : "+sum);
	int average = sum/3;								//average
	System.out.println("The Average of  no is : "+average);
	int product =a*b*c;									//product
	System.out.println("The Product of  no is : "+product);
	int largest = Math.max(a, b);						//maximum no
	largest=Math.max(largest, c);						//maximum no
	System.out.println("The largest no is : "+largest);
	int smallest = Math.min(a, b);						//minimum no
	smallest=Math.min(smallest, c);						//minimum no
	System.out.println("The smallest no is : "+smallest);
	
	

}
}
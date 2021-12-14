package assignment9;

import java.util.Scanner;

public class rectangle {
	public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Length:");
		double l=sc.nextDouble();
		
		Scanner sa=new Scanner(System.in);
		System.out.println("Enter Breadth:");
		double b=sa.nextDouble();
		
		
		double area = l * b;
		System.out.println("Area of rectangle:-\n"+area);
		
}
}
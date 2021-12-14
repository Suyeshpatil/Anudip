package assignment9;

import java.util.Scanner;

public class circle {
	public static void main (String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Radius:");
	double r=sc.nextDouble();
	sc.close();
	double pi =3.14;
	double area;
	double perimeter;
	area = 2 *pi* r*r;
	System.out.println("Area of circle :"+area);
	perimeter = 2 * pi * r;
    System.out.println("perimeter of circle:"+perimeter);
	}
}

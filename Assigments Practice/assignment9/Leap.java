package assignment9;

import java.util.Scanner;

public class Leap {
public static void main (String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year:");
		int l=sc.nextInt();
		if(l%4==0) {
			System.out.println(+l+ " is a leap year");
		}
		else {
			System.out.println(+l+" is not a leap year");
		}
}
}
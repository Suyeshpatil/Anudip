package assignment10;

import java.util.Scanner;

public class Ignorecase {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);     //Take the input from user
		System.out.println("Enter the String:");
		String strA = sc.nextLine();             //we enter input to strA
		Scanner sb=new Scanner(System.in);     //Take the input from user
		System.out.println("Enter the String:");
		String strB = sb.nextLine();					//we enter input to strB
		
		boolean  check=strA.equalsIgnoreCase(strB);
		System.out.println("Is strA equals to strB?\n"+check);
}
}
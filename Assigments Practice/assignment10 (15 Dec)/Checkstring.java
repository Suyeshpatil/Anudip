package assignment10;

import java.util.Scanner;

//java program to compare the given two string 
public class Checkstring {
public static void main (String args[]) {
	Scanner sc=new Scanner(System.in);     //Take the input from user
	System.out.println("Enter the String:");
	String strA = sc.nextLine();             //we enter input to strA
	Scanner sb=new Scanner(System.in);     //Take the input from user
	System.out.println("Enter the String:");
	String strB = sb.nextLine();					//we enter input to strB
	
	if(strA.equals(strB)) {						//checking if equals
		System.out.println("StrA is equal to string B");
	}
	else {
		System.out.println("StrA is not equal to string B");
	}
	
}
	

}

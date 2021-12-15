package assignment10;

import java.util.Scanner;

public class CharArr {
public static void main (String args[]) {
	Scanner sc=new Scanner(System.in);     //Take the input from user
	System.out.println("Enter the String:");
	String strA = sc.nextLine();             //we enter input to strA
	Scanner sb=new Scanner(System.in);     //Take the input from user
	int i;
	char[] character =new char[strA.length()]; //starting with array
	for(i=0;i<strA.length();i++) {            //condition
	  character[i]  =strA.charAt(i);    
	}
	System.out.println(character);
}
}

package assignment10;

import java.util.Scanner;

public class lowercase {
public static void main (String args[]) {
	Scanner sc=new Scanner(System.in);     //Take the input from user
	System.out.println("Enter the String:");
	String strA = sc.nextLine();             //we enter input to strA
    
	Scanner sb=new Scanner(System.in);     //Take the input from user
	System.out.println("Enter the index:");
	int x = sb.nextInt();             //we enter input
    
	Scanner sa=new Scanner(System.in);     //Take the input from user
	System.out.println("Enter the index:");
	int y = sa.nextInt();             //we enter input
	String strB= strA.substring(x,y);
	String strc=strB.toUpperCase();  // uppercase
	String strd=strc.toLowerCase(); //lowercase
	
	
	System.out.println("Enter the String:" +strc);
	System.out.println("Enter the String:" +strd);
	
	}
}


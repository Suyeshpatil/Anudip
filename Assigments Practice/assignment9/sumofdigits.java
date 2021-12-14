package assignment9;

import java.util.Scanner;

public class sumofdigits {
public static void main(String args[]){
	int i;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value:");
	i=sc.nextInt();
	int a=5*i;
	int b=2*i;
	int add = a+b;
	System.out.println("Sum of digits are:"+add);
}
}

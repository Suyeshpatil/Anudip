package assignment9;
import java.io.*;
public class fibo {
public static void main(String[] args) {

	    int n = 10;
	    int first = 0;
	    int second = 1;
	    System.out.println("Fibonacci Series upto  10 terms:");
	    for (int i = 1; i <= n; ++i) {
	      System.out.print(first + ", ");
	      int third = first + second;     //condition to fibonacci series to get next term
	      first = second;              //changing 1st and 2nd value
	      second = third;
	    }
	  }
	}	



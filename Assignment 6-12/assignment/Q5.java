package assignment;
import java.util.*;
public class Q5 {
	public static void main(String args[]){
		byte b;
		int i = 257;
		double d = 323.142;
		System.out.println("Conversion of int to byte.");
	    i=i%256;
		b = (byte)i;
		System.out.println("i = " + i + " b = " + b);
		System.out.println("\nConversion of double to byte.");
		b = (byte)d;
		System.out.println("d = " + d + " b= " + b);
	}
}



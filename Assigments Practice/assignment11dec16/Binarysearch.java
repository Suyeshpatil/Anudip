package assignment11dec16;

import java.util.Scanner;

public class Binarysearch {
	public static void main (String[] args) {
	int a[] = { 1,2,3,4,5,6,7,8,9,10} ; //SORTED ORDER
	boolean flag = false;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the No:");
	int key=sc.nextInt();
	sc.close();
   int l=0;//starting index
   int h =a.length-1;
   while(l<=h) {
	   int m = (l+h)/2;   //give mid value
	   if(a[m]==key) {  
		   System.out.println("we got the element");
		   flag = true;
		   break;
	   }
	   
	   if(a[m]<key) {   //left side of the array
		   l=m+1;
	   }
	   if(a[m]>key) {  //Right side of the array
		   h=m-1;
	   }   
   }
   if(flag == false)
   {
	   System.out.println("Element Not found");
   }
	   
}
}

/*Output
Enter the No:
40
Element Not found
***************
Enter the No:
3
we got the element
*/
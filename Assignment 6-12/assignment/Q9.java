package assignment;
import java.util.Arrays;
import java.util.Collections;

public class Q9 {
		
		public static void main(String[] args){
			String arr[] = { "practice.geeksforgeeks.org","quiz.geeksforgeeks.org","code.geeksforgeeks.org" };
			Arrays.sort(arr);
			System.out.println("Modified arr[] : "
							+Arrays.toString(arr));
			Arrays.sort(arr, Collections.reverseOrder());
			System.out.println("Modified arr[] : "+Arrays.toString(arr));
		}
	}



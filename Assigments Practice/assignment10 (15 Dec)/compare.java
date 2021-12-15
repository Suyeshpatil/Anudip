package assignment10;

public class compare {
	public static void main (String args[]) {
		String str1 ="suyeshpatil";
		String str2 ="suyeshpal";
		StringBuffer string1 =new StringBuffer(str1);
		
		System.out.println(str2.contentEquals(string1));  //use to compare
	}
}

package assignment8;

public class TestException {
	public static void main (String[] args) {    
		try {
			System.out.print("In Try Block");
			int result =9/0;
			System.out.print("Result is:" +result);
		}
		catch(NumberFormatException ex) {
			System.out.println("In Catch block 2..");
		}
		catch(Exception ex) {
			System.out.println("In Catch block 1..");
		}
		
		finally {
			System.out.print("In finally Block");
		}
	}

}

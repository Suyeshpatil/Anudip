package assignment6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class sr {


public class trycat {
		    public static void main(String[] args) {  
		          
		           try{    
		        	   File file = new File("/D:Suyesh.txt");
		        	   FileReader fr = new FileReader(file);
		               }    
		               catch(ArithmeticException e)  
		                  {  
		                   System.out.println("Arithmetic Exception occurs");  
		                  }    
		               catch(ArrayIndexOutOfBoundsException e)  
		                  {  
		                   System.out.println("ArrayIndexOutOfBounds Exception occurs");  
		                  } 
		           catch(FileNotFoundException e)  
	                  {  
	                   System.out.println("File not found");  
	                  } 
		           
		               catch(Exception e)  
		                  {  
		                   System.out.println("Parent Exception occurs");  
		                  }             
		               System.out.println("rest of the code");    
		    }  
		}

}

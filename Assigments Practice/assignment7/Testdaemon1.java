package assignment7;


public class Testdaemon1 extends Thread{    
		public void run(){  
		          System.out.println("Running thread is daemon...");  
		}  
		public static void main (String[] args) {  
		      Testdaemon1 td= new Testdaemon1();  
		      td.start();  
		      setDaemon(true);   
		   }  
}


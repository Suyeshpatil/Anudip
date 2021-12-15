package assignment10;

import java.util.Scanner;

public class freqency {
	  
	  
	     public static void main(String[] args) {  
	    	 Scanner sc=new Scanner(System.in);     //Take the input from user
	 		System.out.println("Enter the String:");
	 		String str = sc.nextLine();           
	        int[] freq = new int[str.length()];  
	        int i, j;  
	          
	         
	        char[] string= str.toCharArray();  //Converts given string into character array 
	          
	        for(i = 0; i <str.length(); i++) {  
	            freq[i] = 1;  
	            for(j = i+1; j <str.length(); j++) {  
	                if(string[i] == string[j]) {  
	                    freq[i]++;  
	                      
	                     
	                    string[j] = '0';  //Set string[j] to 0 to avoid printing visited character 
	                }  
	            }  
	        }  
	          
	        
	        System.out.println("Characters and their corresponding frequencies"); 
	        for(i = 0; i <freq.length; i++) {  					//for frequencies			//Displays the each character and their corresponding frequency  
	            if(string[i] != ' ' && string[i] != '0')  
	                System.out.println(string[i] + "-" + freq[i]);  
	        }  
	    }  
	}  



package assignment9;

import java.util.Scanner;

public class Date {
	private int month;
	private int day;
	private int year;
	public Date(int month, int day, int year) {
		
		this.month = month;
		this.day = day;
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void displayDate(){
        System.out.printf("%d/%d/%d\n", getMonth(), getDay(), getYear());
    }
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Date date = new Date(requestInput("Enter month: ", sc),      //getting input from user
                           requestInput("Enter day: ", sc),			//getting input from user
                           requestInput("Enter year: ", sc));		//getting input from user

        date.displayDate();

    }
    public static int requestInput(String str, Scanner sc){
        System.out.print(str);
        return sc.nextInt();
    }	
	
}

/*
Output:
Enter month: 10
Enter day: 20
Enter year: 2031
10/20/2031
*/
package assignment9;

public class Dispnumbers {
public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		
		System.out.println("Using println:"+a+" "+b+" "+c+" "+d); 
		
		System.out.print("Using print: ");
		System.out.print(+a+" "+b+" ");
		System.out.print(+c+" ");
		System.out.print(+d+"\n");
		System.out.printf("Using printf :%d %d %d %d ",a,b,c,d);
	}

}
//Output
//Using println:1 2 3 4
//Using print: 1 2 3 4
//Using printf :1 2 3 4
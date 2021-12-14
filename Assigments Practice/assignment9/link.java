package assignment9;

import java.util.LinkedList;

public class link {
public static void main (String args[]) {
	LinkedList <Integer> lin = new LinkedList<>();
	lin.add(34);
	lin.add(59);
	lin.add(5);
	lin.add(70);
	lin.add(90);
	lin.add(37);
	
	System.out.println(lin);
	lin.remove(5);
	System.out.println(lin);
	lin.set(1, 20);
	System.out.println(lin);
}
}

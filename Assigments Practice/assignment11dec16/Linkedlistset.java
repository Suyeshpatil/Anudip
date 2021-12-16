package assignment11dec16;

import java.util.LinkedList;

public class Linkedlistset {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		//adding value
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		
		System.out.println(linkedList);
		//add the value at specific position
		linkedList.add(1,"b");
		
		System.out.println(linkedList);
		
}
}

/*
output
[a, b, c, d]
[a, b, b, c, d]
*/
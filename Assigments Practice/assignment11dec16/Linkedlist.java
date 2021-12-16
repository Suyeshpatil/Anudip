package assignment11dec16;

import java.util.LinkedList;

public class Linkedlist {
public static void main(String[] args) {
	LinkedList<String> linkedList = new LinkedList<String>();
	//adding Elements
	linkedList.add("name");
	linkedList.add("is");
	linkedList.add("Suyesh");
	
	
	System.out.println("Before adding first and last:-"+linkedList);
	//Adding First and last
	linkedList.addFirst("My");
	linkedList.addLast("Patil");
	
	System.out.println("After Adding:-"+linkedList);
	
}	
}
/*
OUTPUT

Before adding first and last:-[name, is, Suyesh]
After Adding:-[My, name, is, Suyesh, Patil]
*/
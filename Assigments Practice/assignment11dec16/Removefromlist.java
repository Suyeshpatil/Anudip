package assignment11dec16;

import java.util.LinkedList;

public class Removefromlist {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		//adding element in kust
		linkedList.add("suyesh");
		linkedList.add("sanket");
		linkedList.add("sandesh");
		linkedList.add("sanjeev");
		System.out.println(linkedList+"..........Linked list");
		//add the value at specific position
		linkedList.remove(1);
		
		System.out.println(linkedList+"........String at index 1(sanket) is removed");
		
}
}

/*OUTPUT
[suyesh, sanket, sandesh, sanjeev]..........Linked list
[suyesh, sandesh, sanjeev]........String at index 1(sanket) is removed
*/
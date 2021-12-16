package assignment11dec16;

import java.util.LinkedList;

public class PosIndex {
	public static void main(String[] args) { 
		LinkedList<String> linkList=new LinkedList<String>();
	
    //Adding elements
	linkList.add("java");
	linkList.add("python");
	linkList.add("c");
	linkList.add("c++");

	System.out.println(linkList);

	for(int i=0; i<linkList.size();i++)  //condition for each position
	{ 
		System.out.println("position is: "+i+" and an element in that position: "+linkList.get(i));
}
}
}
/*
Output
[java, python, c, c++]
position is: 0 and an element in that position: java
position is: 1 and an element in that position: python
position is: 2 and an element in that position: c
position is: 3 and an element in that position: c++
*/
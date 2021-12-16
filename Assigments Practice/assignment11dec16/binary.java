package assignment11dec16;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class binary {
	
		public static void main(String[] args) {
			LinkedList<String> linkedList = new LinkedList<String>();
			//adding value
			linkedList.add("a");
			linkedList.add("b");
			linkedList.add("c");
			linkedList.add("d");
			
			System.out.println(linkedList);
			//for sorting
			Collections.sort(linkedList); //need to  be sorted.
			
			String suy="b";
			int index = Collections.binarySearch(linkedList,suy);
			System.out.println("Element of "+suy+" index:"+index);
		}
		
}

/*Output
[a, b, c, d]
Element of b index:1
*/
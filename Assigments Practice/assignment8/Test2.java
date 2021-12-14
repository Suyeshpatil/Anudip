package assignment8;
import java.util.*;
import java.util.function.Consumer;
public class Test2 {
	public static void main(String args[] ) {
		List <String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		Consumer<List<String>>consumer =Collections::reverse;
		consumer.accept(list);
		System.out.println(list);
		
		
	}

}

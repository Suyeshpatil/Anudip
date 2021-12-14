package assignment8;
import java.util.*;
import java.util.TreeSet;
public class LambdaDemo2 {
public static void main(String[] args) {
	TreeSet<Integer> treeSet = new TreeSet<Integer>((o1,o2)->(o1>o2)?-1:(o1<o2)?1:0);
	treeSet.add(850);
	treeSet.add(235);
	treeSet.add(1080);
	treeSet.add(15);
	treeSet.add(5);
	System.out.println(treeSet);
}

}

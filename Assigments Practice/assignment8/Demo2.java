package assignment8;
import java.util.*;
import java.lang.*;
public class Demo2 {
public static void before() {
Set set = new TreeSet();
set.add("2");
set.add(3);
set.add("1");
Iterator it = set.iterator();
while(it.hasNext())
System.out.println(it.next()+"");
}
public static void main(String a[]) {
Demo2.before();
}

}

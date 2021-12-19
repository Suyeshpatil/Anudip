package assignment12dec17;

public class simpleobject {
	// creating constructor
	public simpleobject(String a, String b, int age) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(age);

	}

}

class suyesh {
	public static void main(String[] args) {

		new simpleobject("suyesh", "patil", 22);
	}
}

//Output:
//suyesh
//patil
//22
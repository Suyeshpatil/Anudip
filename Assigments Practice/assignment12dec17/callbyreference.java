package assignment12dec17;

public class callbyreference {
	private int a = 5;

	void callreference() {
		a = 1;
	}

	static void ref(callbyreference c1) {
		c1.a++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callbyreference c1 = new callbyreference();
		System.out.println("Value of a " + (c1.a));
		ref(c1);

		System.out.println("Value after call by reference " + (c1.a));
	}

}
//OUTPUT
//Value of a 5
//Value after call by reference 6
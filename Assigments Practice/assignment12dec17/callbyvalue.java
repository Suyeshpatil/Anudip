package assignment12dec17;

public class callbyvalue {
	int a = 10;
	{
		System.out.println(+a);
	}

	void value(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {

		callbyvalue call = new callbyvalue();
		call.value(2000); // call by value

	}

}

//Output:
//10
//2000
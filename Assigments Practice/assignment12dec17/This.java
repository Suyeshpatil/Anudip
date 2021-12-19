package assignment12dec17;

public class This {
	private String name = "Suyesh";
	private int age = 22;

	// constructor
	This(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println("Student  name: " + name);
		System.out.println("Student age: " + age);

	}

	public static void main(String[] args) {
		// call the constructor
		This t = new This("Suyesh", 22);
		t.display();
	}
}

//Output
//Student  name: Suyesh
//Student age: 22

package assignment12dec17;

public class operators {
	public static void main(String[] args) {
		int a = 21;
		int b = a++;
		System.out.println("a= " + a + " " + "b= " + b);
		int c = 21;
		int d = ++c;
		System.out.println("c= " + c + " d= " + d);

		int x = 5;
		int z = --x;
		System.out.println("x= " + x + " z= " + z);
		int y = 4;
		int w = y--;
		System.out.println("y= " + y + " w= " + w);

	}
}
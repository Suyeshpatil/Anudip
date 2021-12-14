package assignment8;
abstract class Rectangle{
	abstract void addRectangle();
}
public class ConsumableRectangle extends Rectangle {
	public void addRectangle()
	{
		System.out.println("Adding Rectangle....");
	}
public static void main (String[] args) {
	Rectangle rec1=new ConsumableRectangle();
	rec1.addRectangle();
}

}

package assignment8;

public class Demo {
	private int num;
	public Demo(int num) {
		num=num;
	}
	protected int getNum()
	{
		return num;
	}
public static void main(String[] args) {
	Demo obj = new Demo(15);
	System.out.println(obj.getNum());
}

}

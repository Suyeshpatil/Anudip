package assignment8;

public class Test {
	public static void main(String[] args) {
		String name = new String("aravind");
		int position = name.replace('a','*').substring(2,4).indexOf('i');
		System.out.println(position);
	}

}

package interm3;

public class Q12 {
		int i;
		void display()
			{
			System.out.println(i);
			}
		}
		class B extends Q12{
		int j;
		void display()
			{
				System.out.println(j);
			}
	    }
		class method_overriding{
		public static void main(String args[]){
		B obj = new B();
		obj.i=1;
		obj.j=2;
		obj.display();
		}
}

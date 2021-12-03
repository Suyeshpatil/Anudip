package interm3;

class Q14{
	int func (int n)
	{
	int result;
	if (n == 1)
	return 1;
	result = func (n - 1);
	return result;
	}
	}
class Output1{
	public static void main(String args[])
	{
	Q14 obj = new Q14();
	System.out.print(obj.func(5));
	}
}

class UseStatic
{
	static int a = 3;
	static int b;
	int c;

	static void meth(int x)
	{
		System.out.println("x ="+x);
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		// System.out.println("c ="+c);
	}
	static
	{
		System.out.println("Static block Initialized");
		b = a*4;
	}
	// public static void main(String args[])
	// {
	// 	meth(42);
	// 	//A Static block can directly call 
	// 	//another static block Otherwise UseStatic.meth(42);
	// }
}
class UseStaticDemo
{
	public static void main(String args[])
	{
		UseStatic.meth(42);
		//A Static block can directly call 
		//another static block Otherwise UseStatic.meth(42);
	}
}
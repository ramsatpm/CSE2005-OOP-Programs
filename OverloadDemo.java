class OverloadDemo
{
	void test()
	{
		System.out.println("No Parameters");
	}
	int test(int a)
	{
		return a;
	}
	// void test(int a)
	// {
	// 	System.out.println("One Parameter:"+a);

	// }
	// void test(int a, int b)
	// {
	// 	System.out.println("Two Parameters:"+a +"and"+b);
	// }
	// void test(double d)
	// {
	// 	double t = d*d;
	// 	System.out.println("The square of double parameter:"+ t);
	// }
	public static void main(String arg[])
	{
		OverloadDemo old = new OverloadDemo();
		old.test();
		// old.test(10);
		// old.test(10,20);
		// old.test(23.4);
	}
}
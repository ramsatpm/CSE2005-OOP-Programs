class InterfaceImpl3 implements MyInterface,MyIn2
{
	public void method1()
	{
		System.out.println("We are in InterfaceImpl3:method1");
	}
	public void method2()
	{
		System.out.println("We are in InterfaceImpl3:method2");
	}
	public void method4()
	{
		System.out.println("We are in InterfaceImpl3:method4");
	}
	public static void main(String ar[])
	{
		InterfaceImpl3 ii3 = new InterfaceImpl3();
		ii3.method1();
		ii3.method2();
		// ii3.method4();
	}
}
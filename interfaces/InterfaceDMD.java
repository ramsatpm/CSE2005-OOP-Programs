class InterfaceDMD
{
	public static void main(String ar[])
	{
		InterfaceImpl ii = new InterfaceImpl();
		InterfaceImpl1 ii1 = new InterfaceImpl1();
		InterfaceImpl2 ii2 = new InterfaceImpl2();
		MyInterface mi;

		mi=ii;
		mi.method1();
		mi.method2();

		mi=ii1;
		mi.method1();
		mi.method2();

		mi=ii2;
		mi.method1();
		mi.method2();
		ii2.method3();
	}
}
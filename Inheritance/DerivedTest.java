class Base
{
	int a = 40;
	int b = 30;
}
class Derived extends Base
{
	int a = 400;
	int b = 300;
	void add(int a, int b)
	{
	//code
	}
}
class DerivedTest
{
	public static void main(String[] args)
	{
		Derived d = new Derived();
		d.add(4000,3000);
	}
}
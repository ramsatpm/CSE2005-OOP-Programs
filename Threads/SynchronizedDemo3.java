class Display
{
	public void wish(String name)
	{
		//one lakh lines of code
		synchronized(this)
		{
			for(int i=0;i<10;i++)
			{
				System.out.print("Good Morning:");
				try
				{
					Thread.sleep(1000);
				}
				catch(InterruptedException ie)
				{
				}
				System.out.println(name);
			} 
		}
		//one lakh lines of code
	}
}
class MyThread extends Thread
{
	Display d;
	String name;
	MyThread(Display d, String name)
	{
		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}
}
class SynchronizedDemo3
{
	public static void main(String arg[])
	{
		Display d = new Display();
		MyThread t1 = new MyThread(d, "Dhoni");
		MyThread t2 = new MyThread(d, "Yuvaraj");
		t1.start();
		t2.start();
	}
}
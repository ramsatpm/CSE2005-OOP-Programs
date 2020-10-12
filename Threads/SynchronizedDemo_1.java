class Printer
{
	synchronized void print(String name)
	{
		for(int i=0;i < 5; i++)
		{
			System.out.print(name+" ");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ie)
			{ }
			System.out.println(i);
		}
	}
}
class MyThread extends Thread
{
	Printer p;
	String name;
	MyThread(Printer p, String name)
	{
		this.p = p;
		this.name = name;
	}
	public void run()
	{
		p.print(name);
	}
}
class SynchronizedDemo_1
{
	public static void main(String[] args)
	{
		Printer p1 = new Printer();
		Printer p2 = new Printer();
		MyThread t1 = new MyThread(p1,"Rama");
		MyThread t2 = new MyThread(p2,"Ravi");
		t1.start();
		t2.start();
	}
}
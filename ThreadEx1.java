class MyThread extends Thread
{
	public void run()
	{
		Thread t = Thread.currentThread();
		for(int i = 0; i < 10; i++)
		{
			System.out.println(t.getName() + " " + i);
		}
	}
}
class MyThread1 extends Thread
{
	public void run()
	{
		Thread t = Thread.currentThread();
		for(int i = 10; i< 20; i++)
		{
			System.out.println(t.getName() + " " + i);
		}
	}
}
class ThreadEx1
{
	public static void main(String[] args)
	{
		MyThread t1 = new MyThread();
		MyThread1 t2 = new MyThread1();
		t1.start();
		t2.start();
		// t1.run();
		// t2.run();
		Thread t = Thread.currentThread();
		for(int i = 20; i < 30; i++)
		{
			System.out.println(t.getName() + " " + i);
		}
	}
}
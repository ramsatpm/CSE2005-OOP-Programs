class MyThread extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
			System.out.println("I am Lazy thread");
			// Thread.sleep(2000);
			}
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
		System.out.println("I got Interrupted");
		}
	}
}
class ThreadInterruptDemo
{
	public static void main(String ar[]) throws InterruptedException
	{
		MyThread t = new MyThread();
		t.start();
		Thread.sleep(4000);
		t.interrupt();
		System.out.println("End of Main");
	}
}
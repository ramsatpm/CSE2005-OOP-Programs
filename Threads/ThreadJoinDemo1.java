class MyThread extends Thread
{
	static Thread mt;
	public void run()
	{
		try
		{
			mt.join(); // Child thread waiting for completion of main thread.
		}
		catch (InterruptedException ie) {}
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Child Thread");
		}
	}
}
class ThreadJoinDemo1
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThread.mt = Thread.currentThread();
		MyThread t = new MyThread();
		t.start();
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Main Thread");
			Thread.sleep(2000);
		}
	}
}
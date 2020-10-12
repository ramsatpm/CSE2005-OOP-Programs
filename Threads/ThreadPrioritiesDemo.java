class MyThread extends Thread
{
	public void run()
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Child Thread");

		}
	}
}
class ThreadPrioritiesDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThread t = new MyThread();
		// t.setPriority(7);
		
		t.start();
		t.join();//main thread waits for completion of child thread
		for(int i=0; i<10; i++)
		{
			System.out.println("Main Thread");
			// Thread.yield();
		}
	}
}
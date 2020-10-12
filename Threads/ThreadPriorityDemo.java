class MyThread extends Thread
{
	
}
class Test_t
{
	void method1()
	{
		MyThread t = new MyThread();
		t.start();
	}
}
class ThreadPriorityDemo
{
	public static void main(String args[])
	{
		System.out.println(Thread.currentThread().getPriority());//main thread priority -- 5
		Thread.currentThread().setPriority(7);//We set the main thread priority to 7
		MyThread t = new MyThread();
		System.out.println(t.getPriority());//7 -- inherits main thread priority
		Test_t tt =new Test_t();
		tt.method1();
	}
}
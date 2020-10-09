class MyClient extends Thread
{
	String uname;
	int i;
	MyClient(String uname,int i)
	{
		this.uname = uname;
		this.i = i;
	}
	public void start()
	{
		super.start();
		System.out.println("start");
	}
	public void run()
	{
		System.out.println("Handling GMail Client:"+ uname);
		// run(i);
	}
	// public void run(int i)
	// {
	// 	System.out.println("i:"+i);
	// }
}
class ThreadEx2
{
	public static void main(String[] args)
	{
		MyClient myClient1 = new MyClient("rama",1);
		MyClient myClient2 = new MyClient("sita",2);
		MyClient myClient3 = new MyClient("ravana",3);
		System.out.println("It is GMail Server and it is listening client requests...");
		myClient1.start();
		myClient2.start();
		myClient3.start();
		// myClient1.run();
		// myClient2.run();
		// myClient3.run();
	}
}
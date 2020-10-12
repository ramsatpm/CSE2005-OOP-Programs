class ThreadB extends Thread
{
int total = 0;
public void run()
{
synchronized(this)
{
System.out.println("Child thread starts calculation");
for(int i =1;i<=100;i++)
{
total +=i;
}
System.out.println("Child giving notification");
this.notify();
}
}
}
class ThreadWaitDemo
{
public static void main(String args[]) throws Exception
{
ThreadB b = new ThreadB();
b.start();
synchronized(b)
{
System.out.println("Main thread trying to call wait method");
b.wait();
// Thread.sleep(5000);
System.out.println("Main thread got notification");
System.out.println(b.total);
}
}
}
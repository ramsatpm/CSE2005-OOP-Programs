class A
{
public synchronized void d1(B b)
{
System.out.println("Thread 1 starts execution of d1method");
try
{
Thread.sleep(5000);
}
catch(InterruptedException ie)
{
}
System.out.println("Thread1 trying to call Bs last method");
b.lock();
}
public synchronized void lock()
{
System.out.println("Inside A last method");
}
}
class B
{
public synchronized void d2(A a)
{
System.out.println("Thread 2 starts execution of d2 method");
try
{
Thread.sleep(5000);
}
catch(InterruptedException ie)
{
}
System.out.println("Thread2 trying to call As last method");
a.lock();
}
public synchronized void lock()
{
System.out.println("Inside B last method");
}
}
class DeadlockThreads extends Thread
{
A a = new A();
B b = new B();
public void m1()
{
this.start();
a.d1(b); //This line executed by main thread
}
public void run()
{
b.d2(a); //This line executed by child thread
}
public static void main(String ar[])
{
DeadlockThreads t = new DeadlockThreads();
t.m1();
}
}
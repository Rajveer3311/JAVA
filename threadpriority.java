//this operating system does not support thread priority concept.It gives wrong value.
class A extends Thread 
{
public void run()
{
for(int i=1;i<=5;i++)
System.out.println("my name is khalid");
}
}

class B extends Thread 
{
public void run()
{
for(int i=1;i<=5;i++)
System.out.println("my name is khan");
}
}




class threadpriority
{
public static void main(String args[])
{
A a=new A();
B b=new B();
a.setPriority(1);//greater priority value come first
b.setPriority(10);
a.start();
b.start();
}
}
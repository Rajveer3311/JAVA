class a extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("values of a""  "+i);
}
System.out.println("end of a");
}
}
class b extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("values of b"+"  "+i);
}
System.out.println("end of b");
}
}
class test
{
public static void main(String args[])
{

new a().stop();
new b().stop();



}
}
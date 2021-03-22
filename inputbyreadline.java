import java.io.*;
class inputbyreadline
{
public static void main(String[] args)throws Exception
   {
   int age;
   String  name;
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter your age");
 age=Integer.parseInt(in.readLine());
System.out.println("age is:"+age);
   }


}
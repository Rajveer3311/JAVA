import java.util.Scanner;
class takeinput
{
public static void main(String[] args)
   {
Scanner sc=new Scanner(System.in);
String name;
int age;
System.out.println("enter your name");
  name=sc.nextLine();
System.out.println("enter your age");
  age=sc.nextInt();
System.out.println("name is:"+name+"\n age is:"+age);
    }

}
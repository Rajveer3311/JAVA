import java.util.*;
class switchtesting
{
public static void main(String[] args)throws Exception
{
char choice;
System.out.println("enter your choice");
System.out.println("M->madras");
System.out.println("B->bombay");
System.out.println("D->delhi");
System.out.println("choice------->");
System.out.flush();

switch(choice=(char)System.in.read())
{ 
  case 'm':
  case 'M':System.out.println("Madras:booklet 1");
         break;
  case 'B':System.out.println("Bombay:booklet 4");
         break;
  case 'D':System.out.println("Delhi:booklet 6");
         break;
  default:System.out.println("invalid choice");
}
}
}

// class switchtesting
// {
// public static void main(String[] args)throws Exception
// {
// int choice;
// Scanner inp=new Scanner(System.in);
// System.out.println("enter your choice");
// System.out.println("M->madras");
// System.out.println("B->bombay");
// System.out.println("D->delhi");
// System.out.println("choice------->");
// System.out.flush();
// int n=inp.nextInt();
	
// switch(n)
// { 
  
//   case 5:System.out.println("Madras:booklet 1");
//          break;
//   case 3:System.out.println("Bombay:booklet 4");
//          break;
//   case 6:System.out.println("Delhi:booklet 6");
//          break;
//   default:System.out.println("invalid choice");
// }
// }
// }

class exception3
{
public static void main(String args[])
{
try{
int s=Integer.parseInt(args[0]);
if(args[0]=="hello")
  System.out.println("string is right");
else
   throw new Exception("invalid string");
}
catch(Exception e)
{
}
  System.out.println("string is right xxxx");
}
}
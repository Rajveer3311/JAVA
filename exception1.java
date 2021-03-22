class exception1
{
public static void main(String args[])
{
try
{
int n=Integer.parseInt(args[0]);
int m=Integer.parseInt(args[1]);
int p=n+m;
}
catch(ArrayIndexOutOfBoundsException ex)
{
System.out.println("arithmetic exception block1");
}
catch(ArithmeticException ex)
{
System.out.println("arithmetic exception block1");
}

}
}
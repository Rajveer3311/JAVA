class exception2
{
public static void main(String args[])
{
try
{
int n=Integer.parseInt(args[0]);
int m=Integer.parseInt(args[1]);
int p=n+m;
System.out.println("sum is:"+p);
}
catch(NumberFormatException ex)
{
System.out.println("NumberFormatException block1"+ex.getMessage());
}
catch(ArithmeticException ex)
{
System.out.println("arithmetic exception block1"+ex.getMessage());
}

catch(Exception ex)
{
System.out.println("arithmetic exception block1"+ex);
}


}
}
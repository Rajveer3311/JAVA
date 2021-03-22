class exception4
{
public static void main(String[] args)
{
try
{
int n=Integer.parseInt(args[0]);
int m=Integer.parseInt(args[1]);
int p=n+m;
System.out.println("sum is"+p);
}
catch(ArrayIndexOutOfBoundsException ex)
{
System.out.println(ex);
}
System.out.println("ex");
}}
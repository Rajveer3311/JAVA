class errors  //excetion handling
{
public static void main(String args[])
{
int a=10;
int b=5;
int c=5;
try
{
int d=a/(b-c);
System.out.println("divison is:"+d);
}
catch (Arithmetic  Exception e)
{
System.out.println("divison is:");
}
int e=a/(b+c);
System.out.println("divison is:   "+e);
}}
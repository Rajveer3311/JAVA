 public class Reverse_Number 
 {  
 	 static long  rev=0;
 	 
	public static void main(String[] args) 
	{   int i=Integer.MIN_VALUE;
		System.out.println(i);
		long y=func(-12345678987654321l);
		System.out.println(y);
		

	}
	public static long func(long x)
		{    
			
             while (x!=0) 
             {
             long z=x%10;
             rev=rev*10+z;
             x=x/10;	
             }
             return rev;
		}
}
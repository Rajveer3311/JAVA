import java.util.Scanner;
public class if_else1
{
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
	    if_else1 i=new if_else1();
		int a=inp.nextInt();
        i.get_data(a);
	}
	void get_data(int x)
	{
    if ((((x%2)==0) && (x>=2&x<=5) ) && (((x%2)==0) && !(x>=6&x<=20) )  || (((x%2)==0) && (x>=20) ))   
      {
    	System.out.println("not weird");
      }
    else
     {
      System.out.println("weird");
      
     }  
	}
    
    
}









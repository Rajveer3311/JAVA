public class Statics
{
	static int swap(int a, int b)
	{
      int temp=a;
      a=b;
      b=temp;
      System.out.println(a);
      System.out.println(b);	
      return 0;	
	}
	public static void main(String[] args) {
    int y=5;
	  int z=4;
    System.out.println(y);
    System.out.println(z);		
	int x=Statics.swap(y,z);

	}
}
public class stati
{
	static void swap(int a, int b)
	{
      int temp=a;
      a=b;
      b=temp;
      System.out.println(a);
      System.out.println(b);		
	}
	public static void main(String[] args) {
    int y=5;
	int z=4;
    System.out.println(y);
    System.out.println(z);		
	int x=swap(y,z);

	}
}
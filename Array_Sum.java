import  java.util.*;
public class Array_Sum
{   
	static int sum=0;
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int []arr=new int[10];
		int no=inp.nextInt();
		// int sum=0;
		for (int i=0;i<no;i++) {
			arr[i]=inp.nextInt();
		}
		for (int i=0;i<no;i++) {
		     sum+=arr[i];
		}
		System.out.println(sum);
	}
}
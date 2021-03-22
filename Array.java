import java.util.Scanner;
public class Array
{  
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int arr[]=new int[10];
		arr[0]=12;
		arr[1]=10;
		arr[2]=20;
		arr[3]=30;
		System.out.println(arr[1]);
		int x=arr[1]=arr[2]+arr[3];
        System.out.println(x);
        System.out.println(arr[1]);


		
	    
	}
}
import  java.util.*;
public class Array_Triplet
{   
	static int countarr;
	static int countarr1;
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		int []arr=new int[10000];
		int []arr1=new int[10000];
		System.out.println("First Array:");
		for (int i=0;i<3;i++) {
			arr[i]=inp.nextInt();
		}
		System.out.println("Second Array:");
		for (int i=0;i<3;i++) {
		    arr1[i]=inp.nextInt();
		}
		for (int i=0;i<3;i++) {
		    System.out.print(arr[i]);
		}
		System.out.println();
		for (int i=0;i<3;i++) {
		    System.out.print(arr1[i]);
		}
		for (int i=0;i<3;i++) {
		    if (arr[i]>arr1[i]) {
		    	countarr++;
		    }
		    else if (arr[i]<arr1[i]) {
		    	countarr1++;
		    }
		}
		System.out.println();
		System.out.println(countarr);
		System.out.println(countarr1);
	}
} 

import java.util.*;
public class Add_Two_Digit {
	
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		Stack s=new Stack();
		
			int input=inp.nextInt();
			int input1=inp.nextInt();
		        int carry=0; 
		while(input>0||input1>0)
		{
			 input=input%10;
			 input1=input1%10;
			 int t=(input+input1)%10+carry;
                         s.push(t);
                         carry=(input+input1)/10;
                         input=input/10;
			 input1=input1/10;

		}
		// System.out.println(s.get(2));

	}
}
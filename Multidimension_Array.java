import java.util.*;
public class Multidimension_Array
{  
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		// int arr[][]={
		// 	         {1,2,3},
		// 	         {4,5,6},
		// 	         {7,8,9}
		// 	        };
		System.out.println("Enter row :");
		int row=inp.nextInt();
		System.out.println("Enter col :");
		int col=inp.nextInt();
		System.out.println("Enter matrix element :");
		int arr[][]=new int[200][200];
		// for (int k=0;k<row;k++ ) {
		// 	for (int m=0;m<col ;m++ ) {
		// 		arr[k][m]=inp.nextInt();
		// 	}}
		int k=0;
		
		while (k<row) {
			int m=0;
			while(m<col){
			    arr[k][m]=inp.nextInt();	
			    m++;
			}
			k++;
		}
		
		// for (int i=0;i<row; i++) {
		// 	System.out.print("[");
		// 	for (int j=0;j<col;j++ ) {
		// 		System.out.print(" "+arr[i][j]);
		// 	}
		// 	System.out.print("]");
		// 	System.out.println(" ");
			
		// }
		int i=0;
		while (i<row) {
			System.out.print("[");
			int j=0;
			while(j<col){
			    System.out.print(" "+arr[i][j]+" ");	
			    j++;
			}
			System.out.print("]");
			System.out.println();
			i++;
		}


		
	    
	}
}

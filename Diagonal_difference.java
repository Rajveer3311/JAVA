public class Diagonal_difference
{
	public static void main(String[] args) {
		int[][]arr={{1,2,10},
			        {4,5,6},
			        {10,8,9}
		           };
        int sum=0;
        int sums=0;
        int count=arr[0].length-1;
		for (int i=0;i<arr.length ;i++ ) {
			for (int j=0;j<arr[i].length; j++) {
				if (i==j) {
				    sum=sum+arr[i][j];
				    sums=sums+arr[i][count--];
				}
				// count--;
			 
		}
	}
		// System.out.println(sum);
		// int sums=0;
		// int count=arr[0].length-1;
		// for (int i=0;i<arr.length ;i++ ) {
		// 	for (int j=0;j<arr[i].length; j++) {
		// 		if (i==j) {
		// 			sums=sums+arr[i][count];
		// 		}
				    
				
		// 	}
			

		// }
		System.out.println(sums);

		System.out.println(sums-sum);

	}
}
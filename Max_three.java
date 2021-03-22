public class Max_three
{
	public static void main(String[] args) {
		int arr[]={19,8,7,6,100,12,11};
		
		int x,y,k=0;
		for (int i=0;i<3;i++ ) {
		    int max=arr[0];
		    for (int j=1;j<arr.length ;j++ ) {
		    		if (max<arr[j]) {
		    			max=arr[j];	
		    			k=j;
		    		}
		    	}

		    	System.out.println(max);	
		    	arr[k]=0;
		    	
		}
	}
}
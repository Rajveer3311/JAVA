// 1st way
public class Anagram
{
	public static void main(String[] args)
	{
        String s="ssa5%vsh";
        String v="aas";
        boolean isAnagram=true;
        int[] arr=new int[256];
     
        for(int i=0;i<s.length();i++) 
        {
        	char ch=s.charAt(i);
        	int a=(int)ch;
        	arr[a]++;	
        }	
        for(int j=0;j<v.length();j++) 
        {
        	char c=v.charAt(j);
        	int b=(int)c;
        	arr[b]--;	
        }
        for(int f=0;f<256;f++)	
        {
        	if(arr[f]!=0)
        	{
        		isAnagram=false;
        	    break;
        	}
        }
    
        if(isAnagram)
        {
        	System.out.println("string is anagram");
        }
        else
        {
        	System.out.println("string is not anagram");
        }
      
     
	}
}

// 2nd way
// public class Anagram
// {
// 	public static void main(String[] args)
// 	{
//         String s="Hello";
//         String v="hello";
//         boolean isAnagram=true;
//         int[] arr=new int[256];
//         int[] brr=new int[256];
     
//         for(int i=0;i<s.length();i++) 
//         {
//         	char ch=s.charAt(i);
//         	int a=(int)ch;
//         	arr[a]++;	
//         }	
//         for(int j=0;j<v.length();j++) 
//         {
//         	char c=v.charAt(j);
//         	int b=(int)c;
//         	brr[b]++;	
//         }
//         for(int f=0;f<256;f++)	
//         {
//         	if(arr[f]!=brr[f])
//         	{
//         		isAnagram=false;
//         	    break;
//         	}
//         }
    
//         if(isAnagram)
//         {
//         	System.out.println("string is anagram");
//         }
//         else
//         {
//         	System.out.println("string is not anagram");
//         }
      
     
// 	}
// }
import java.util.*;
public class test1
{
	public static void main(String[] args) 
	{
		// by string which character most in string
		// String s="Rajver si sr r t y";
		// s=s.replaceAll("\\s","");
		//  System.out.println(s);
		// int[] arr=new int[127];
	 //    for ( int i=0; i<s.length();i++ ) 
	 //    {
	 //    	arr[s.charAt(i)]+=1;
	 //    }
	 //    int max=-1;
	 //    char c=' ';
	 //    for(int j=0;j<s.length();j++)
  //       {
	 //        if (max<arr[s.charAt(j)]) 
	 //        {
	 //    	    max=arr[s.charAt(j)];
	 //    	    c=s.charAt(j);
	 //        }	
        
	 //    }
	 //    System.out.println(c);
           


           // by using hashmap
		HashMap<Character,Integer> hm=new HashMap<>();
		String s="Rajveer s d f g h j";
		s=s.replaceAll("\\s","");
		for ( int i=0; i<s.length();i++ ) 
	     {   
	     	char a=s.charAt(i);
	     	if (hm.containsKey(a)) {
	     		hm.put(a,hm.get(a)+1);
	     	}
	     	else{
	     		hm.put(a,1);
	     	}
	     }
	     int max=0;
	     char c=' ';
	     for (Map.Entry<Character,Integer> me:hm.entrySet()) {
	     	if(max<me.getValue()){
	     		max=me.getValue();
	     		c=me.getKey();
	     	}
	     }
	     System.out.println(c);
	}
}
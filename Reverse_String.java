public class Reverse_String
{
	public static void main(String[] args) 
	{
		String s=" rajveer is here  ";
		String v=" ";
		int j;
		int i=s.length()-1;
		


		while(i>=0)
		{
			while(i>=0 && s.charAt(i) == ' ')i--;
			
		    j=i;
		    if(i<0) break;
		while(i>=0 && s.charAt(i)!=' ')i--;
		
        if(v.isEmpty()){

        	v=v.concat(s.substring(i+1,j+1));
        }
        else{
        	v=v.concat(" "+s.substring(i+1,j+1));
        }
        
		}
       System.out.println("reverse string is:"+v); 
	 }
}
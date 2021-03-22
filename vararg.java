class Vararg
{
    public int vararg(int ...n)
    {
    	int sum=0;
    	for (int i:n) 
    	{
    		sum+=i;
    		
    	}
    	return sum;
    }

	public static void main(String[] args)
	{
		Vararg inp=new Vararg();
		int x=inp.vararg(2,2,3,4,5);
		System.out.println(x);
	}
}
import java.util.Scanner;
public class Return_String
{   public static String get_data(String x){
    String y=x;
    return y;
}
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		System.out.println("enter a whole string:-");		 
	        String d=inp.nextLine();
	    //  By using Static keyword we are calling method
		String z=Return_String.get_data(d);
		System.out.println(z);
	}
}
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
		

	}
}
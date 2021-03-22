public class Raaj
{ 
   public boolean reverse(int x)
        {   long d=x;
            long rem=0;
            if(d<0)
            {
              return false;
            }
             while(d!=0)
             {
              int a=(int)d%10;
              rem =rem*10+a;
              d=(int)d/10;
              // d=y;
              }        
             if(rem==x)
             {
              return true;

             }
             else{
              return false;
             } 
        }
public static void main(String[] args)

{   
       Raaj x=new Raaj();
       int b= -121; 
       boolean c=x.reverse(b); 
       System.out.println(c);
 }
 }
//    public int reverse(int x)
//         {   long d=x;
//             long rem=0;
//              while(d!=0)
//              {
//               int a=(int)d%10;
//               rem =rem*10+a;
//               int y=(int)d/10;
//               d=y;
//               }        
//              return (int)rem;  
//         }
// public static void main(String[] args)

// {   
//        Raaj x=new Raaj();
//        int b= 1534236469; 
//        int c=x.reverse(b); 
//        System.out.println(c);
//  }





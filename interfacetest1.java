class rectangle 
{
public float compute (float x,float y)
 {
    return(x*y);
 }
}
class interfacetest1
{
public static void main(String[] args)
{
rectangle rect=new rectangle();


System.out.println("area of rectangle"+ rect.compute(10,20));
}
}
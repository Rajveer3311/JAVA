interface Area
{
float pi=3.14F;

}
class rectangle 
{float pi=3.14F;
public float compute (float x,float y)
 {
    return(x*y);
 }
}
class circle extends rectangle
{
public float compute(float x,float y)
 {
    
    return(pi*x*x);
 }
}
class interfacetest2
{
public static void main(String[] args)
{
rectangle rect=rectangle();
circle cir=new circle();
System.out.println("area of rectangle"+rect.compute(10,20));
System.out.println("area of circle"   +  cir.compute(10,0));
}
}
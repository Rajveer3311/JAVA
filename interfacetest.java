interface Area
{
float pi=3.14F;
float compute(float x,float y);
}
class rectangle 
{
public float compute (float x,float y)
 {
    return(x*y);
 }
}
class circle implements Area
{
public float compute(float x,float y)
 { float pi=2.3F;
    return(pi*x*x);
 }
}
class interfacetest
{
public static void main(String[] args)
{
rectangle rect=new rectangle();
circle cir=new circle();
Area area;

System.out.println("area of rectangle"+rect.compute(10,20));
area= cir;
System.out.println("area of circle"   +  area.compute(10,0));
}
}
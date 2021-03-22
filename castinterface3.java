interface newshape
{
  void draw();
}
class newcircle1 implements newshape
{
    public void draw()
 {
   System.out.println("new circle 1 drawn");
 }
}
class newcircle2 implements newshape
{
   public void draw()
  {
  System.out.println("new circle 2 drawn");
  }
}
class castinterface3
{
public static void main(String[] args)
{
  newshape nc1=new newcircle1();
   newshape nc2=new newcircle1();
  nc1.draw();
  nc2.draw();
}
}
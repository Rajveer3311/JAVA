class room
{
float length;
float breadth;
void getdata(float a float b)
{
length=a;
breadth=b;
}
}
class roomarea
{
public static void main(string args[])
{
float area;
room=room1;
room1.getdata(2.4,5.4);
area=room1.length*room1.breadth;
System.out.println("area="+area);
}
} 

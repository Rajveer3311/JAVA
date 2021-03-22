import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code="face"width=300 height=300> </applet> */
public class face extends Applet
{
public void paint(Graphics g)
{
g.drawOval(100,100,100,100);
g.drawOval(120,125,20,20);
g.fillOval(125,130,10,10);
g.drawOval(160,125,20,20);
g.fillOval(165,130,10,10);
g.drawLine(150,165,150,150);
g.drawArc(125,150,50,35,0,-160);
g.drawOval(85,140,15,15);
g.drawOval(200,140,15,15);
}
}
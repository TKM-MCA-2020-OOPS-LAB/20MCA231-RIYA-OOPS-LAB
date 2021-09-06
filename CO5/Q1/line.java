import java.awt.*;
import java.applet.Applet;
public class line extends Applet
{
public void paint(Graphics g)
{
g.drawLine(100,10,250,150);
g.drawLine(100,150,150,10);
}
}
/*
<applet code="line.class" width="500" height="700" border="2">
</applet>
*/

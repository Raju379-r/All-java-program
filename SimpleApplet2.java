import java.applet.Applet;
import java.awt.Graphics;
/*<applet code ="SimpleApplet2.class"width ="300"height="300">
</applet>
*/
public class SimpleApplet2 extends Applet
{
public void init()
{
System.out.println("Applet initialized");
}
public void start()
{
System.out.println("Applet started");
}
public void stop()
{
System.out.println("Applet stopped");
}
public void destroy()
{
System.out.println("Applet destroyed");
}
public void paint(Graphics g)
{
g.drawLine(70, 70, 100, 100);
g.drawString("Hello,Applet!",50,50);
g.drawRect(100, 100, 100, 50);
g.fillRect(100,100, 100, 50);
g.drawOval(150, 150, 65, 56);
g.fillOval(150, 150, 65, 56);
g.drawArc(70, 70, 100, 100, 30, 30);
g.fillArc(70, 70, 100, 100, 30, 30);
}
}
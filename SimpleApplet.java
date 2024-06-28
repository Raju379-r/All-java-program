import java.applet.Applet;
import java.awt.Graphics;
/*<applet code ="SimpleApplet.class"width ="800"height="800">
</applet>
*/
public class SimpleApplet extends Applet
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
g.drawString("Hello,Applet!",50,50);
}
}
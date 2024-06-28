import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="mousedemo.class"width="400"height="400"></applet>*/
public class mousedemo extends Applet implements MouseListener,MouseMotionListener
{
Label l1;
public void init()
{
l1=new Label("                                                ");
add(l1);
addMouseListener(this);
addMouseMotionListener(this);
}
public void mouseMoved(MouseEvent e)
{
l1.setText("mouse moved X="+e.getX()+"Y="+e.getY());
}
public void mouseDragged(MouseEvent e)
{
l1.setText("mouse dragged X="+e.getX()+"Y="+e.getY());
}
public void mousePressed(MouseEvent e)
{
l1.setText("mouse Pressed X="+e.getX()+"Y="+e.getY());
}
public void mouseReleased(MouseEvent e)
{
l1.setText("mouse Released X="+e.getX()+"Y="+e.getY());
}
public void mouseEntered(MouseEvent e)
{
l1.setText("mouse Entered X="+e.getX()+"Y="+e.getY());
}
public void mouseExited(MouseEvent e)
{
l1.setText("mouse Exited X="+e.getX()+"Y="+e.getY());
}
public void mouseClicked(MouseEvent e)
{
l1.setText("mouse Clicked X="+e.getX()+"Y="+e.getY());
}
}


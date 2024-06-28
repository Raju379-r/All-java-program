//Item Event
import java.awt.*;
import java.awt.event.*;
/*<applet code="Iteml.class" width="300"height="300"></applet>*/
public class Iteml extends Frame implements ItemListener
{
Label l;
choice ch;
public void init()
{
l=new Label("          ");
ch=new ch choice();
ch.add("lacknow");
ch.add("banaras");
ch.add("kanpur");
ch.add("unnao");
add(ch);
add(l);
ch.addItemListener(this);
}
public void itemStateChanged(ItemEvent e)
{
LastText(ch.getSelectedItem());
}
} 


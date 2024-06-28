import java.awt.*;
public class FrameDemo2 extends Frame
{
 public static void main (String[]args)
 {
 FrameDemo2 fd = new FrameDemo2 ();
 Button btn = new Button ("Hello World");
 fd.add (btn);
 fd.setVisible (true);
 fd.setSize (500, 200);
 }
}

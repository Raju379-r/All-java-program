import javax.swing.*;
import java.awt.event.*;
public class SwingDemo1
{
public static void main(String[] args)
{
JFrame jf=new JFrame();
jf.setSize(100,100);
JButton jb=new JButton("click");
MyListener ob=new MyListener();
jb.addActionListener(ob);
jf.setVisible(true);
}
}
class MyListener implements ActionListener
{
public void actionPerformed(ActionEvent ae)
{
System.out.println("Button clicked");
}
}
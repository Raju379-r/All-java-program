import javax.swing.*;
import java.awt.event.*;
public class DialogBoxDemo
{
 public static void main (String[]args)
 {
 JFrame jf = new JFrame ();
 jf.setSize (100, 100);
 JButton jb = new JButton ("Exit");
 jf.add (jb);
 MyListener2 ob = new MyListener2 ();
 jb.addActionListener (ob);
 jf.setVisible (true);
 }
}
class MyListener2 implements ActionListener
{
 public void actionPerformed (ActionEvent ae)
 {
 int i =JOptionPane.showConfirmDialog (null, "Are you sure to exit?",
 "Confirmation",
 JOptionPane.YES_NO_OPTION);
 if (i == 0)
 System.exit (0);
 }
}
import java.awt.*;
public class framedemo3 extends Frame 
{
MenuBar mb=new MenuBar();
Menu file =new Menu("File");
Menu edit =new Menu("edit");
Menu format =new Menu("format");

MenuItem f1=new MenuItem("new");
MenuItem f2=new MenuItem("open");
MenuItem f3=new MenuItem("save");
MenuItem f4=new MenuItem("save as");

MenuItem e1=new MenuItem("cut");
MenuItem e2=new MenuItem("copy");
MenuItem e3=new MenuItem("paste");

MenuItem fr1=new MenuItem("font");
MenuItem fr2=new MenuItem("word wrap");

public framedemo3()
{
setSize(400,400);
setLayout(null);
setMenuBar(mb);

mb.add(file);
mb.add(edit);
mb.add(format);

file.add(f1);
file.add(f2);
file.add(f3);
file.add(f4);

edit.add(e1);
edit.add(e2);
edit.add(e3);

format.add(fr1);
format.add(fr2);

setTitle("Demo Notepad");
setVisible(true);
}
public static void main(String args[])
{
new framedemo3();
}
}


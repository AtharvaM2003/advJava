package Manual;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.MouseMotionListener;
import javax.swing.*;
public class EX_11_XIII_3 extends JFrame implements MouseMotionListener {
     JLabel l=new JLabel ();
     JPanel jp=new JPanel();
  
     EX_11_XIII_3()
   {
  addMouseMotionListener (this);
  add(jp);
  add(l);
  setSize(400,400);
  setVisible(true);
  setLayout(new FlowLayout());
   }
public void mouseDragged(MouseEvent e)
{
	Graphics g=getGraphics();
	g.setColor(Color.BLUE);
	g.fillOval(e.getX(),e.getY(),20,20);
}

public void mouseMoved(MouseEvent e)
{
	l.setText("Mouse is Moved");
	l.setBounds(50,50,150,20);
}
 public static void main(String args[]) {
	 new EX_11_XIII_3();
 }
}
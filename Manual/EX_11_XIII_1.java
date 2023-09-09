package Manual;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/* <APPLET CODE ="EX_11_XIII_1" WIDTH=400 HEIGHT=400> </APPLET> */
public class EX_11_XIII_1 extends Applet implements MouseListener 
 { 
	     Label l=new Label();
	     public void init()
	     {
    	    add(l);
    	    setVisible(true);
    	    setLayout(null);
    	    addMouseListener(this); 
	     }
    public void mouseClicked(MouseEvent e)
     {
    	l.setBounds(50,50,150,20);
    	l.setText("Mouse Clicked");
    	setBackground(Color.RED);
    }
    public void mouseEntered(MouseEvent e)
    {
    	l.setText("Mouse Entered");
    	setBackground(Color.GRAY);
   }
    public void mouseExited(MouseEvent e)
    {
    	l.setText("Mouse Exited");
    	setBackground(Color.GREEN);
   }
    public void mousePressed(MouseEvent e)
    {
    	l.setText("Mouse Pressed");
    	setBackground(Color.YELLOW);
   }
    public void mouseReleased(MouseEvent e)
    {
    	l.setText("Mouse Released");
    	setBackground(Color.ORANGE);
   }
    
	
}
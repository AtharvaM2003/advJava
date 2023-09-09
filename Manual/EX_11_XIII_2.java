package Manual;
import java.awt.*;

import java.awt.event.*;

public  class EX_11_XIII_2 extends Frame implements MouseListener
{
     Label l=new Label("");
     EX_11_XIII_2(){
    	
    	  add(l);
  		  setVisible(true);
  		  setLayout(new FlowLayout());
  		  setSize(300,300);
  		  addMouseListener(this);
     }
     public void mouseClicked(MouseEvent e) {
    	 l.setBounds(50,50,200,20);
    	 l.setText("Number of times Mouse Clicked: "+e.getClickCount());
 		
 	}
     public void mousePressed(MouseEvent e) {
 	 		
 	}
     public void mouseReleased(MouseEvent e) {
 	 	}
 
 	public void mouseEntered(MouseEvent e) {
 		 		
 	}
 	public void mouseExited(MouseEvent e) {
 	 		
 	}
	public static void main (String args[])
	 {
		new EX_11_XIII_2();
	}
}
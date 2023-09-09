package Manual;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EX_10_X_2 extends Frame implements KeyListener 
   {
	 Label l=new Label("");
	
	 EX_10_X_2(){
		
	    add(l);
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(300,300);
		addKeyListener(this);
		requestFocus();
     
}
 public void keyTyped(KeyEvent e){
	 l.setText("Key Typed");
 }
 public void keyReleased(KeyEvent e)
 {
	 l.setText("Key Released");
 }
 public void keyPressed(KeyEvent e)
 {
	 l.setText("");
	 l.setBounds(50,50,150,20);
     int key=e.getKeyCode();
     switch(key) {
     	case KeyEvent.VK_UP:	l.setText("Arrow UP is Pressed ");
     	   	break;
     	case KeyEvent.VK_DOWN:	 l.setText("Arrow DOWN is Pressed ");
     	    break;
     	case KeyEvent.VK_LEFT:	l.setText("Arrow LEFT is Pressed ");
          	break;
     	case KeyEvent.VK_RIGHT:	l.setText("Arrow RIGHT is Pressed ");
     	    break;
     	case KeyEvent.VK_F1:	l.setText("F1  is Pressed ");
     		break;
     	case KeyEvent.VK_F2:	l.setText("F2  is Pressed ");
     		break;
     	case KeyEvent.VK_F3:	l.setText("F3  is Pressed ");
     		break;
     	case KeyEvent.VK_F4:	 l.setText("F4  is Pressed ");
     		break;
     }
 }
 
 public static void main(String args[])
 {
	new EX_10_X_2();
  }
 }
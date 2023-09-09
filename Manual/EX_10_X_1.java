package Manual;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class EX_10_X_1 extends Frame implements KeyListener 
   {
	 Label l=new Label("");
	
	 EX_10_X_1(){
	    add(l);
		setVisible(true);
		setLayout(new FlowLayout());
		setSize(300,300);
		addKeyListener(this);
	   }
	 public void keyTyped(KeyEvent e) {
		}

	public void keyReleased(KeyEvent e) {
		}
	public void keyPressed(KeyEvent e){
	 l.setText("Key Pressed");
	 l.setBounds(50,50,150,20);
		}
   
 public static void main(String args[])
 {
	new EX_10_X_1();
  }
 }
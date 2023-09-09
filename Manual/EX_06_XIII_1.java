package Manual;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
public class EX_06_XIII_1 
{   
   EX_06_XIII_1 ()
   {
	   JFrame f=new JFrame();
	   JLabel l=new JLabel ("States of India");
	   l.setBounds(100,10,100,50);
	   f.setLayout(new FlowLayout());
	   String s[]= {"Maharashtra","Andhra Pradesh","Patna","Delhi","Assam","Arunachal Pradesh","Kerala","Punjab"};
	   JComboBox cb=new JComboBox(s);
	   cb.setBounds(100,50,150,30);
	   cb.setMaximumRowCount(30);
	   f.add(l);
	   f.add(cb);
	   f.setLayout(null);
	   f.setTitle("EX_06_XIII_1");
	   f.setSize(300,300);
	   f.setVisible(true);
	  	   
}
	public static void main(String[] args) {
		EX_06_XIII_1  e=new EX_06_XIII_1 ();
		
	}
	

}
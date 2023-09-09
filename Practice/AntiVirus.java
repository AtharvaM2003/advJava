package Practice;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class AntiVirus extends JFrame implements ActionListener {
	
	JTextField tf;
	JComboBox cb;
	JButton b;
	JLabel l,l1,l3;
	JPanel p;
	JProgressBar jb;
	int i=0,num=0; 
	AntiVirus(){
		String cbs[]= {"C:","D:","E:","F:"};
		Font  f1  = new Font(Font.SERIF, Font.PLAIN,  24);
		l3=new JLabel("Rootplace Antivirus");
		l3.setBounds(300,50,200,30);
		l3.setFont(f1);
		l=new JLabel("Select Directory:");
		l.setBounds(100,100,200,30);
		cb=new JComboBox(cbs);
		cb.setBounds(210,100,50,30);
		b=new JButton("Scan the Directory");
		b.setBounds(350,150,150,30);
		jb=new JProgressBar(0,2000);    
		jb.setBounds(100,300,500,30);         
		jb.setValue(0);    
		jb.setStringPainted(true);  
		l1=new JLabel("Scanning for Viruses...........");
		l1.setBounds(100,250,1000,30);
		//tf.setBounds(200,100,200,30);
		b.addActionListener(this);
		add(jb);
		add(b);
		add(l);
		add(l1);
		add(l3);
		add(cb);
		setSize(700,500);
		setTitle("AntiVirus");
		setLayout(null);
		setVisible(true);
	}
 

	public void iterate(){ 

	
		}  
	
	
	public static void main(String[] args){
		AntiVirus a=new AntiVirus();
				a.text();
	}

	private void text() {
		 l1.setText("Scanning for Viruses...........");
		 
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		while(i<=2000){    
			
		  jb.setValue(i);    
		  i=i+20;   
		  l1.setText("Scan Completed Succesfully -------------------------------------------------No Virus Found");

		  try{Thread.sleep(150);}catch(Exception f){}    
		}    
		
	}


}

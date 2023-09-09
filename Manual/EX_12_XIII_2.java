package Manual;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EX_12_XIII_2 extends JFrame implements ActionListener{

	JLabel l1,l2,l3;
	JTextField tf1,tf2,r;
	JButton b;
	EX_12_XIII_2(){
		setVisible(true);
		setLayout(null);
		setSize(400,300);
		l1=new JLabel("Enter First No:");
		l1.setBounds(50,50,150,20);
		l2=new JLabel("Enter Second No:");
		l2.setBounds(50,100,150,20);
		l3=new JLabel("Result:");
		l3.setBounds(50,150,150,20);
		add(l1);	add(l2);	add(l3);
		
		tf1=new JTextField("");
		tf1.setBounds(200,50,100,20);
		tf2=new JTextField("");
		tf2.setBounds(200,100,100,20);
		r=new JTextField("");
		r.setBounds(200,150,100,20);

		add(tf1);	add(tf2);	add(r);
		
		b=new JButton("Addition");
		b.setBounds(100,200,150,40);
		add(b);
		
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		int a=Integer.parseInt(tf1.getText());
		int b=Integer.parseInt(tf2.getText());
		int c=a+b;
		r.setText(""+c);
	}
	public static void main(String[] args) {
	new EX_12_XIII_2();

	}

}

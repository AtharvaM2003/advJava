package Manual;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class EX_12_XIII_3 extends JFrame implements ActionListener{
JTextField t1;
JPasswordField pass;
JLabel l1,l2,l3;
JButton b;
JPanel p;
EX_12_XIII_3(){
p = new JPanel();
add(p);
p.setLayout(null);
l1= new JLabel("Username");
l1.setBounds(50,50,150,30);
l2= new JLabel("Password");
l2.setBounds(50,100,150,30);
t1=new JTextField();
t1.setBounds(120,50,100,30);
pass=new JPasswordField();
pass.setBounds(120,100,100,30);
b= new JButton("Login");
b.setBounds(75,150,70,30);
l3=new JLabel("Password length must be >6 characters");
l3.setBounds(50,200,500,30);
p.add(l1);
p.add(l2);
p.add(t1);
p.add(pass);
p.add(b);
setSize(300,300);
setVisible(true);
b.addActionListener(this);

}
public void actionPerformed (ActionEvent e) {
	String s=pass.getText();
		if(s.length()<=6) {
			p.add(l3);
		}
		
}
public static void main(String[] args) {
new EX_12_XIII_3();
}
}
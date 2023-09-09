package Manual;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EX_10_XIII_3 extends Frame implements ActionListener{

	Label l1,l2,l3;
	TextField tf1,tf2,r;
	Button b;
	EX_10_XIII_3(){
		setVisible(true);
		setLayout(null);
		setSize(400,300);
		l1=new Label("Enter First No:");
		l1.setBounds(50,50,150,20);
		l2=new Label("Enter Second No:");
		l2.setBounds(50,100,150,20);
		l3=new Label("Result:");
		l3.setBounds(50,150,150,20);
		add(l1);	add(l2);	add(l3);
		
		tf1=new TextField("");
		tf1.setBounds(200,50,100,20);
		tf2=new TextField("");
		tf2.setBounds(200,100,100,20);
		r=new TextField("");
		r.setBounds(200,150,100,20);

		add(tf1);	add(tf2);	add(r);
		
		b=new Button("Multiply");
		b.setBounds(150,200,80,30);
		add(b);
		
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		int a=Integer.parseInt(tf1.getText());
		int b=Integer.parseInt(tf2.getText());
		int c=a*b;
		r.setText(""+c);
	}
	public static void main(String[] args) {
	new EX_10_XIII_3();

	}

}

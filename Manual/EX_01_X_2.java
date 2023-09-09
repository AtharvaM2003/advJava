package Manual;
import java.awt.*;
public class EX_01_X_2 {
	EX_01_X_2(){
	Frame f=new Frame();
	TextField tf=new TextField("TextField");
	tf.setBounds(50,60,150,20);
	tf.setEnabled(false);
	TextArea ta= new TextArea("Text Area");
	ta.setBounds(50,90,150,60);
	Button b1= new Button("Button");
	b1.setBounds(50,175,80,30);
	Label l1= new Label("This is Label");
	l1.setBounds(50,210,200,30);
	
	f.add(tf);
	f.add(ta);
	f.add(b1);
	f.add(l1);
	f.setSize(300,300);
	f.setLayout(null);
	f.setVisible(true);
	f.setTitle("EX_01_02");
	 }
	public static void main(String[] args) {
		EX_01_X_2 b=new EX_01_X_2();

	}

}

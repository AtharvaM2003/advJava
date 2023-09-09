package Manual;
import java.awt.*;

public class EX_01_XIII_3 {
	EX_01_XIII_3(){
		Frame f=new Frame();
		Button b=new Button("OK");
		b.setBounds(75,100,50,20);
		Button b1=new Button("RESET");
		b1.setBounds(150,100,50,20);
		Button b2=new Button("CANCEL");
		b2.setBounds(220,100,50,20);
		f.add(b);
		f.add(b1);
		f.add(b2);
		f.setSize(400,200);
		f.setTitle("Buttons");
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		EX_01_XIII_3 b=new EX_01_XIII_3();
	}

}

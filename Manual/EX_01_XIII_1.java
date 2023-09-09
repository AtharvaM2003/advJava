package Manual;
import java.awt.*;
public class EX_01_XIII_1 {
	EX_01_XIII_1(){
		Frame f=new Frame();
		Label l=new Label("Welcome to Java");
		f.add(l);
		l.setBounds(70,100,150,30);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		f.setTitle("Welcome to Java");
	}
	public static void main(String[] args) {
		EX_01_XIII_1 b=new EX_01_XIII_1();

	}

}

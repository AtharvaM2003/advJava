package Manual;
import java.awt.*;
public class EX_01_XIII_2 {
	EX_01_XIII_2(){
		Frame f=new Frame();
		Checkbox c=new Checkbox("Marathi",true);
		c.setBounds(75,50,100,75);
		Checkbox c1=new Checkbox("Hindi");
		c1.setBounds(75,100,100,75);
		Checkbox c2=new Checkbox("English",true);
		c2.setBounds(75,150,100,75);
		Checkbox c3=new Checkbox("Sanskrit");
		c3.setBounds(75,200,100,75);
		f.add(c);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.setSize(300,300);
		f.setTitle("Languages");
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		EX_01_XIII_2 b=new EX_01_XIII_2();

	}

}

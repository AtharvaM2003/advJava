package Manual;
import java.awt.*;
public class EX_01_X_1 {
	EX_01_X_1(){
	Frame f=new Frame();
	CheckboxGroup cbg= new CheckboxGroup();
	 Checkbox cb1 = new Checkbox("Python", cbg,false);    
	 cb1.setBounds(50,60,80,30);
	 Checkbox cb2= new Checkbox("Java",cbg,true);
	 cb2.setBounds(50,100,150,50);
	 Checkbox c1=new Checkbox("AJP");
	 c1.setBounds(50,150,150,50);
	 Checkbox c2=new Checkbox("STE");
	 c2.setBounds(50,200,150,50);
	 Checkbox c3=new Checkbox("OSY");
	 c3.setBounds(50,250,150,50);
	 f.add(cb1);
	 f.add(cb2);
	 f.add(c1);
	 f.add(c2);
	 f.add(c3);
	 f.setSize(300,350);
	 f.setLayout(null);
	 f.setVisible(true);
	 f.setTitle("Radio Button");
	}
	public static void main(String[] args) {
		EX_01_X_1 w=new EX_01_X_1();
	}

}

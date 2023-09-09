package Manual;
import java.awt.*;
public class EX_05_X_1 {
	MenuBar mb;
	Menu m1,m2,m3,m4;
	Frame f;
	EX_05_X_1(){
		f=new Frame();
		mb=new MenuBar();
		m1=new Menu("Red");
		m2=new Menu("Blue");
		m3=new Menu("White");
		m4=new Menu("Black");
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);
		m4.setEnabled(false);
		f.setVisible(true);
		f.setSize(300,300);
		f.setLayout(new FlowLayout());
		f.setTitle("Menu of Colours");
		f.setMenuBar(mb);
		
		
	}
	public static void main(String[] args) {
		EX_05_X_1 b=new EX_05_X_1();
	}

}

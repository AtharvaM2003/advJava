package Manual;
import java.awt.*;

public class EX_03_XIII_2 extends Frame{
	 EX_03_XIII_2(){
		 BorderLayout BL=new BorderLayout();
		 Button b1=new Button("North");
		 add(b1,BorderLayout.NORTH);
		 Button b2=new Button("South");
		 add(b2,BorderLayout.SOUTH);
		 Button b3=new Button("East");
		 add(b3,BorderLayout.EAST);
		 Button b4=new Button("West");
		 add(b4,BorderLayout.WEST);
		 Button b5=new Button("Center");
		 add(b5,BorderLayout.CENTER);
	setSize(200,200);
	setVisible(true);
	setLayout(BL);
	 }
	public static void main(String[] args) {
		EX_03_XIII_2 b=new EX_03_XIII_2();

	}

}

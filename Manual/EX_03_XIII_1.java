package Manual;
import java.awt.*;
public class EX_03_XIII_1 extends Frame {
	 EX_03_XIII_1(){
		 GridLayout GL=new GridLayout(3,2,12,12);
		 for(int i=1;i<=5;i++) {
			 Button bt=new Button("Button"+i);
			 add(bt);
		 }
	setSize(300,150);
	setVisible(true);
	setLayout(GL);
	setTitle("GridLayout Demo");
	 }
	public static void main(String[] args) {
		EX_03_XIII_1 b=new EX_03_XIII_1();
	}

}

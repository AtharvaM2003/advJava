package Manual;
import java.awt.*;

public class EX_03_X_1 extends Frame{
	 EX_03_X_1(){
		 GridLayout GL=new GridLayout(5,5);
		 for(int i=1;i<=25;i++) {
			 Button bt=new Button();
			 add(bt);
		 }
	setSize(300,300);
	setVisible(true);
	setLayout(GL);
	setTitle("Grid Layout");
	 }
	public static void main(String[] args) {
		EX_03_X_1 b=new EX_03_X_1();
	}

}

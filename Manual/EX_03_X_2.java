package Manual;
import java.awt.*;

public class EX_03_X_2 extends Frame{
	 EX_03_X_2(){
		 GridLayout GL=new GridLayout(3,4);
		 for(int i=0;i<=9;i++) {
			 Button bt=new Button(""+i);
			 add(bt);
		 }
	setSize(300,300);
	setVisible(true);
	setLayout(GL);
	setTitle("1 to 9");
	 }
	public static void main(String[] args) {
		EX_03_X_2 b=new EX_03_X_2();
	}

}

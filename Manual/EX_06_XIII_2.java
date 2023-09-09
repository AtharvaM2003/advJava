package Manual;
import java.awt.*;
import javax.swing.*;
public class EX_06_XIII_2 extends JFrame {
	EX_06_XIII_2(){
		JFrame jf=new JFrame("Example of Scrollpane");
		String s="Name of Student:Atharva Mundhe\n"+"Class: TYCO\n"+"College: Jaihind Polytechnic";
		JTextArea ta= new JTextArea(s,10,25);
		int v=JScrollPane.VERTICAL_SCROLLBAR_ALWAYS;
		int h=JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane js=new JScrollPane(ta,v,h);
		jf.add(js);
		jf.setSize(300,300);
		jf.setLayout(new FlowLayout());
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		new EX_06_XIII_2();
	}

}

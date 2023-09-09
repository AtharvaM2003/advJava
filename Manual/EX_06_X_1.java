package Manual;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
public class EX_06_X_1 implements ItemListener{
	JComboBox<String>jc;
	JLabel jl;
	JFrame jf=new JFrame();
	EX_06_X_1(){
		String[] s= {"Solapur","Pune","Banglore","Mumbai"};
		jc=new JComboBox<String>(s);
		jl=new JLabel("");
		jf.add(jc);
		jf.setSize(300,300);
		jf.setLayout(new FlowLayout());
		jf.setVisible(true);
		jc.addItemListener(this);
		JPanel p=new JPanel();
		p.add(jc);
		p.add(jl);
		jf.add(p);	
		
	}
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==jc) {
			jl.setText("You are in "+jc.getSelectedItem());
		}
		
	}

	public static void main(String[] args) {
		EX_06_X_1 a=new EX_06_X_1();
	}
}

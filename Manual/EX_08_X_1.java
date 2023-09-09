package Manual;
import java.awt.FlowLayout;
import javax.swing.*;
public class EX_08_X_1 {
	EX_08_X_1() {
		JFrame jf=new JFrame("Example of JTable");       
	    String data[][]={ {"01","Atharva","CO5I"},{"02","Ganesh","CO5I"}, {"03","Kartik","CO5I"}};                          
	    String column[]={"Sr No.","Name","Class"};         
	    JTable jt=new JTable(data,column); 
	    jf.add(jt); 
	    jf.setLayout(new FlowLayout());
	    JScrollPane sp=new JScrollPane(jt);    
	    jf.add(sp);          
	    jf.setSize(500,200);    
	   jf.setVisible(true);    
	}
	public static void main(String[] args) {
     new EX_08_X_1();
	}

}
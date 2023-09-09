package Manual;
import java.awt.FlowLayout;
import javax.swing.*;
public class EX_08_X_2 {
	EX_08_X_2() {
		JFrame jf=new JFrame();    
	    String data[][]={ {"101","Amit","670000"}, {"102","Jai","780000"}, {"103","Sachin","700000"}};    
        String column[]={"ID","NAME","SALARY"};       
	    JTable jt=new JTable(data,column); 
	    jf.add(jt); 
	    jf.setLayout(new FlowLayout());
	    JScrollPane sp=new JScrollPane(jt);    
	    jf.add(sp);          
	    jf.setSize(500,200);    
	    jf.setVisible(true);    
	}
	public static void main(String[] args) {
		 new EX_08_X_2();
	}

}
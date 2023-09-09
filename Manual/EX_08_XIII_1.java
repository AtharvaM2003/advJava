package Manual;
import java.awt.FlowLayout;
import javax.swing.*;
public class EX_08_XIII_1 {
	EX_08_XIII_1(){
		JFrame jf=new JFrame("EX_08_XIII_1 ");    
	    String data[][]={ {"Atharva","87.10","A"}, {"Shivam","75.20","B"}, {"Pratik","85.10","A"}, 
	    		{"Ganesh","70.00","B"}, {"Yash","86.50","A"},{"Katik","89.45","A"},
	    		{"Siddhesh","90.10","A"}, {"Sujal","86.00","B"}, {"Soham","76.50","B"}, {"Aviraj","91.20","A"},};    
        String column[]={"Name of Student","Percentage","Grade"};       
	    JTable jt=new JTable(data,column); 
	    jf.add(jt); 
	    jf.setLayout(new FlowLayout());
	    JScrollPane sp=new JScrollPane(jt);    
	    jf.add(sp);          
	    jf.setSize(600,300);    
	    jf.setVisible(true);    
		
	}

	public static void main(String[] args) {
		new EX_08_XIII_1();

	}

}
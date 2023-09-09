package Manual;
import javax.swing.*;
import java.awt.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class EX_07_X_1 {
	EX_07_X_1(){
		JFrame jf=new JFrame("Example of JTree");
		jf.setVisible(true);
		jf.setSize(300,200);
		jf.setLayout(new FlowLayout());
		DefaultMutableTreeNode CO1= new DefaultMutableTreeNode("Class");
		DefaultMutableTreeNode CO2= new DefaultMutableTreeNode("CO3I");
		DefaultMutableTreeNode CO3= new DefaultMutableTreeNode("CO5I");
		CO1.add(CO2); CO1.add(CO3);
		DefaultMutableTreeNode CO4= new DefaultMutableTreeNode("DSU");
		DefaultMutableTreeNode CO5= new DefaultMutableTreeNode("CGR");
		CO2.add(CO4); CO2.add(CO5);
		DefaultMutableTreeNode CO6= new DefaultMutableTreeNode("AJP");
		DefaultMutableTreeNode CO7= new DefaultMutableTreeNode("ACN");
		CO3.add(CO6); CO3.add(CO7);
		JTree t=new JTree(CO1);
		jf.add(t);
	}
	public static void main(String[] args) {
	new EX_07_X_1();
	}

}

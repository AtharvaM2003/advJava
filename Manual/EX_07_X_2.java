package Manual;
import javax.swing.*;
import java.awt.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class EX_07_X_2 {
	EX_07_X_2(){
		JFrame jf=new JFrame("Example of JTree");
		jf.setVisible(true);
		jf.setSize(300,200);
		jf.setLayout(new FlowLayout());
		DefaultMutableTreeNode c= new DefaultMutableTreeNode("India");
			DefaultMutableTreeNode s1= new DefaultMutableTreeNode("Maharashtra");
			DefaultMutableTreeNode ci1= new DefaultMutableTreeNode("Mumbai");
			DefaultMutableTreeNode ci2= new DefaultMutableTreeNode("Pune");
			DefaultMutableTreeNode ci3= new DefaultMutableTreeNode("Nashik");
			DefaultMutableTreeNode ci4= new DefaultMutableTreeNode("Nagpur");
			s1.add(ci1);	s1.add(ci2);	s1.add(ci3);	s1.add(ci4);
			DefaultMutableTreeNode s2= new DefaultMutableTreeNode("Gujrat");
			c.add(s1);	c.add(s2);	
		JTree t=new JTree(c);
		jf.add(t);
	}
	public static void main(String[] args) {
	new EX_07_X_2();
	}

}

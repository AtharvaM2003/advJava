package Manual;
import javax.swing.*;
import java.awt.*;
import javax.swing.tree.DefaultMutableTreeNode;
public class EX_07_XIII_1 {
	EX_07_XIII_1(){
		JFrame jf=new JFrame("This PC");
		jf.setVisible(true);
		jf.setSize(300,300);
		jf.setLayout(new FlowLayout());
		DefaultMutableTreeNode m= new DefaultMutableTreeNode("This PC");
			DefaultMutableTreeNode s1= new DefaultMutableTreeNode("New Volume(C:)");
			DefaultMutableTreeNode c1= new DefaultMutableTreeNode("Intel");
			DefaultMutableTreeNode c2= new DefaultMutableTreeNode("Program Files");
			DefaultMutableTreeNode j= new DefaultMutableTreeNode("java");
			c2.add(j);
			DefaultMutableTreeNode j1= new DefaultMutableTreeNode("jdk1.8.0_202");
			j.add(j1);
			DefaultMutableTreeNode j2= new DefaultMutableTreeNode("bin");
			DefaultMutableTreeNode j3= new DefaultMutableTreeNode("include");
			DefaultMutableTreeNode j4= new DefaultMutableTreeNode("jre");
			j1.add(j2);	j1.add(j3);	j1.add(j4);
			DefaultMutableTreeNode c3= new DefaultMutableTreeNode("Program Files(x86)");
			DefaultMutableTreeNode c4= new DefaultMutableTreeNode("Users");
			DefaultMutableTreeNode c5= new DefaultMutableTreeNode("Windows");
			s1.add(c1);	s1.add(c2);	s1.add(c3);	s1.add(c4);
			DefaultMutableTreeNode s2= new DefaultMutableTreeNode("New Volume(D:)");
			DefaultMutableTreeNode s3= new DefaultMutableTreeNode("New Volume(E:)");
		m.add(s1);	m.add(s2);	m.add(s3);
		JTree t=new JTree(m);
		jf.add(t);
	}
	public static void main(String[] args) {
	new EX_07_XIII_1();
	}

}

package Practice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class PharmaApp_2 extends JFrame implements MouseListener{
	JPanel p,p1;
	JTextArea Ta;
	JLabel l;
	JTree jt;
	PharmaApp_2(){
	     
	    DefaultMutableTreeNode C=new DefaultMutableTreeNode("Category");
	    DefaultMutableTreeNode W=new DefaultMutableTreeNode("Wellness");
	    DefaultMutableTreeNode Co=new DefaultMutableTreeNode("Covid Essentials");  
	    DefaultMutableTreeNode D =new DefaultMutableTreeNode("Diabeties Support");  
	    C.add(W);  
	    DefaultMutableTreeNode H=new DefaultMutableTreeNode("Homeopathic");  
	    DefaultMutableTreeNode B=new DefaultMutableTreeNode("Baby Care");  
	    DefaultMutableTreeNode A=new DefaultMutableTreeNode("Ayurvedic");  
	    W.add(Co); W.add(D);W.add(H);W.add(B);W.add(A);
	    DefaultMutableTreeNode Be =new DefaultMutableTreeNode("Beauty");
	    C.add(Be);
	    DefaultMutableTreeNode Bc=new DefaultMutableTreeNode("Body Care");
	    DefaultMutableTreeNode Hc=new DefaultMutableTreeNode("Hair Care");
	    DefaultMutableTreeNode E=new DefaultMutableTreeNode("Eye Care");
	    DefaultMutableTreeNode L=new DefaultMutableTreeNode("Lip Care");
	    DefaultMutableTreeNode F=new DefaultMutableTreeNode("Fragrances");
	    DefaultMutableTreeNode M=new DefaultMutableTreeNode("Make-up");
	    Be.add(Bc);Be.add(Hc);Be.add(E);Be.add(L);Be.add(F);Be.add(M);
	    DefaultMutableTreeNode Fi =new DefaultMutableTreeNode("Fitness");
	    C.add(Fi);
	    DefaultMutableTreeNode Vi =new DefaultMutableTreeNode("Vitamins And Supplements");
	    DefaultMutableTreeNode Fa =new DefaultMutableTreeNode("Family Nutrition");
	    DefaultMutableTreeNode He =new DefaultMutableTreeNode("Healts Food And Drinks");
	    DefaultMutableTreeNode Ay =new DefaultMutableTreeNode("Ayruvedic Supplements");
	    DefaultMutableTreeNode Sp =new DefaultMutableTreeNode("Sports Suplements");
	    DefaultMutableTreeNode We =new DefaultMutableTreeNode("Weight Management");
	    Fi.add(Vi);Fi.add(Fa);Fi.add(He);Fi.add(Ay);Fi.add(Sp);Fi.add(We);
	    DefaultMutableTreeNode De =new DefaultMutableTreeNode(" Devices");
	    C.add(De);
	    DefaultMutableTreeNode Or =new DefaultMutableTreeNode(" Orthopaedics");
	    DefaultMutableTreeNode Bre =new DefaultMutableTreeNode(" Breathe Easy");
	    DefaultMutableTreeNode Me =new DefaultMutableTreeNode("Measurements ");
	    DefaultMutableTreeNode Su =new DefaultMutableTreeNode(" Surgical Accessories");
	    De.add(Or);De.add(Bre);De.add(Me);De.add(Su);
	    DefaultMutableTreeNode Cov =new DefaultMutableTreeNode("Covid Essentials");
	    C.add(Cov);
	    DefaultMutableTreeNode Pe =new DefaultMutableTreeNode("Personal & Home Essentials ");
	    DefaultMutableTreeNode Ma =new DefaultMutableTreeNode(" Masks, Gloves & Protective Equipments ");
	    DefaultMutableTreeNode Im =new DefaultMutableTreeNode(" Immunity Booster");
	    DefaultMutableTreeNode Ox =new DefaultMutableTreeNode(" Oxygen Can");
	    Cov.add(Pe);Cov.add(Ma);Cov.add(Im);Cov.add(Ox);
	    l= new JLabel("Items Should add in cart");
	    l.setBounds(100,120,150,30);
	 
	     jt=new JTree(C); 
	     jt.setBounds(100,150,400,400);
	     Ta= new JTextArea();
		    Ta.setBounds(100,200,150,150);
	    p=new JPanel();
	    p1=new JPanel();
	    p.setSize(600,650);
	   p1.setSize(600,650);
		
	
		    p1.add(Ta);
			
	    p.add(jt);  
	    p1.add(l);
	    add(p);
	    add(p1);
	    
		setSize(1200,650);
		setVisible(true);
		setLayout(null);
		setTitle("Pharma App Products");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PharmaApp_2();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		DefaultMutableTreeNode snode=(DefaultMutableTreeNode) jt.getSelectionPath().getLastPathComponent();
		Ta.append(snode.getUserObject().toString());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
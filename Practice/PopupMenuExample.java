import java.awt.*;  
import java.awt.event.*;  
public class PopupMenuExample  
{  
     PopupMenuExample(){  
         Frame f= new Frame("PopupMenu Example");  
         PopupMenu pop = new PopupMenu("Edit");
         
         TextField t=new TextField();
         t.setBounds(100,100,50,20);
         MenuItem cut = new MenuItem("Cut");  
         cut.setActionCommand("Cut");  
         MenuItem copy = new MenuItem("Copy");  
         copy.setActionCommand("Copy");  
         MenuItem paste = new MenuItem("Paste");  
         paste.setActionCommand("Paste");      
         pop.add(cut);  
         pop.add(copy);  
         pop.add(paste);      
         
         
         f.addMouseListener(new MouseAdapter() {  
            public void mouseClicked(MouseEvent e) {              
                pop.show(f , e.getX(), e.getY());  
            }                 
         });  
         f.add(t);
         f.add(pop);   
         f.setSize(400,400);  
         f.setLayout(null);  
         f.setVisible(true);  
     }  
public static void main(String args[])  
{  
        new PopupMenuExample();  
}  
}  
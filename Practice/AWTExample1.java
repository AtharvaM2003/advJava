// importing Java AWT class  
import java.awt.*;    
  
// extending Frame class to our class AWTExample1  
public class AWTExample1  {    
  
   // initializing using constructor  
   AWTExample1() {  
  
	   Frame f=new Frame("MY Frame");
      // creating a button   
      Button b = new Button("Click Me!!");  
  
      // setting button position on screen  
      b.setBounds(30,100,80,30);  
  
      // adding button into frame    
      f.add(b);  
  
      // frame size 300 width and 300 height    
      f.setSize(300,300);  
  
      // setting the title of Frame  
     
          
      // no layout manager   
      f.setLayout(null);   
  
      // now frame will be visible, by default it is not visible    
      f.setVisible(true);  
}    
  
// main method  
public static void main(String args[]) {   
  
// creating instance of Frame class   
AWTExample1 f = new AWTExample1();    
  
}  
  
}   
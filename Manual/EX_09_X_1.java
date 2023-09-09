package Manual;
import javax.swing.JFrame;
import javax.swing.JProgressBar;    
public class EX_09_X_1 extends JFrame{    
JProgressBar jb;    
int i=0,num=0;     
EX_09_X_1(){    
jb=new JProgressBar(0,1000);    
jb.setBounds(40,40,160,30);         
jb.setValue(0);    
jb.setStringPainted(true);    
add(jb);    
setSize(250,150);    
setLayout(null);    
}    
public void iterate(){    
while(i<=1000){    
  jb.setValue(i);    
  i=i+50;    
  try{Thread.sleep(150);}catch(Exception e){}    
}    
}    
public static void main(String[] args) {    
	EX_09_X_1 m=new EX_09_X_1();    
    m.setVisible(true);    
    m.iterate();    
}    
}    
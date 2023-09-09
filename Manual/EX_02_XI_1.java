package Manual;
import java.awt.*;
import java.applet.*;
/*
<applet code="EX_02_XI_1" width="300" height="300">
</applet>
*/
public class EX_02_XI_1 extends Applet{
	public void init(){
		List l=new List(5,true);
		l.add("Maths");
		l.add("Physics");
		l.add("Chemistry");
		l.add("C++");
		l.add("Java");
		l.setBounds(50,50,100,80);
		Label la=new Label("Select Subjects You Like");
		la.setBounds(50,150,150,50);
		add(la);		
		add(l);
		setLayout(null);
		}
	

}

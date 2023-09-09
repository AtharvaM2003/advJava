package Manual;
import java.awt.*;
import java.applet.*;

/*
<applet code="EX_02_X_1" width="300" height="300">
</applet>
*/

public class EX_02_X_1 extends Applet{
public void init(){
List l=new List(3);
add(l);
l.add("Summer");
l.add("Winter");
l.add("Rainy");
l.setBounds(50,75,100,50);
setLayout(null);
}
}

package Manual;
import java.awt.*;
public class EX_02_XIII_1 extends Frame
{
	EX_02_XIII_1()
                {
                                List l1=new List(10);
                                l1.add("Pune");
                                l1.add("Mumbai");
                                l1.add("Bengluru");
                                l1.add("Ahemdabad");
                                l1.add("Chennai");
                                l1.add("Surat");
                                l1.add("Indore");
                                l1.add("Shimla");
                                l1.add("Vadodara");
                                l1.add("Gurugram");
                                l1.setBounds(50,60,100,120);
                                add(l1);
                                
                                setLayout(null); 
                                setSize(300,300);
                                setVisible(true);
                                setTitle("Cities");
       
                }
                public static void main(String[] args) {
                	EX_02_XIII_1 b=new EX_02_XIII_1();

            	}
}
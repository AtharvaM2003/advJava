package Manual;
import java.awt.*;
public class EX_02_XIII_2 extends Frame
{
	EX_02_XIII_2()
                {
                                Checkbox c1=new Checkbox("Times of India");
                                c1.setBounds(50,50,120,80);
                                Checkbox c2=new Checkbox("The Indian Express");
                                c2.setBounds(50,110,120,80);
                                Checkbox c3=new Checkbox("Sakal");
                                c3.setBounds(50,170,120,80);
                                Checkbox c4=new Checkbox("Lokmat");
                                c4.setBounds(50,230,120,80);
                                Checkbox c5=new Checkbox("Lokatta");
                                c5.setBounds(50,290,120,80);
                                add(c1);
                                add(c2);
                                add(c3);
                                add(c4);
                                add(c5);
                                setLayout(null); 
                                setSize(300,400);
                                setVisible(true);
                                setTitle("Newspaper");
       
                }
                public static void main(String[] args) {
                	EX_02_XIII_2 b=new EX_02_XIII_2();

            	}
               
               
}
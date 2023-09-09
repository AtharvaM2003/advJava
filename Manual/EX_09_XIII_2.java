package Manual;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EX_09_XIII_2{
  final static int interval = 100;
  int i;
  JProgressBar pb;
  Timer t;

  JTextField tf;
	JComboBox cb;
	JButton b;
	JLabel l;
	JPanel p;
  public EX_09_XIII_2() {
  JFrame f = new JFrame("Progress Bar");
  b = new JButton("Start");
  b.addActionListener(new ButtonListener());

  pb = new JProgressBar(0, 100);
  pb.setValue(0);
  pb.setStringPainted(true);


  
  JPanel p = new JPanel();
  p.add(b);
  p.add(pb);

  JPanel p1 = new JPanel();
  p1.setLayout(new BorderLayout());
  p1.add(p, BorderLayout.NORTH);
  p1.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
  f.setContentPane(p1);
  f.pack();
  f.setVisible(true);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  //Create a timer.
  t = new Timer(interval, new ActionListener() {
  public void actionPerformed(ActionEvent evt) {
  if (i == 100){
  Toolkit.getDefaultToolkit().beep();
  t.stop();
  b.setEnabled(true);
  pb.setValue(0);
   }
  i = i + 1;
  pb.setValue(i);
  
  }
  });
  }

  class ButtonListener implements ActionListener {
  public void actionPerformed(ActionEvent ae) {
  b.setEnabled(false);
  i = 0;
 
  t.start();
  }
  }
  
  public static void main(String[] args) {
  EX_09_XIII_2 s = new EX_09_XIII_2();
  }
}
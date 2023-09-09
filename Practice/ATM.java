package Practice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ATM extends JFrame {

    //create objects to add to JPanel
    private JRadioButton radio1 = new JRadioButton("Checking");
    private JRadioButton radio2 = new JRadioButton("Savings");
    private JButton withdrawBtn = new JButton("Withdraw");
    private JButton depositBtn = new JButton("Deposit");
    private JButton transferBtn = new JButton("Transfer");
    private JButton balanceBtn = new JButton("Balance");

    public ATM() {
        super("ATM");
        setLayout(new BorderLayout());  

        //add buttons to JPanel
        JPanel buttonsPanel1 = new JPanel();
        buttonsPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonsPanel1.add(withdrawBtn);
        buttonsPanel1.add(balanceBtn);
        add(buttonsPanel1, BorderLayout.NORTH);
        JPanel buttonsPanel2 = new JPanel();
        buttonsPanel2.add(transferBtn);
        buttonsPanel2.add(depositBtn);
        add(buttonsPanel2, BorderLayout.CENTER);
        JPanel buttonsPanel3 = new JPanel();
        buttonsPanel3.add(radio1);
        buttonsPanel3.add(radio2);
        add(buttonsPanel3, BorderLayout.SOUTH);

         /**
        *
        * @param args
  */}
    public static void main (String[] args) {
        ATM app = new ATM();
        app.setSize(400,300);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setLocationRelativeTo(null);
    }
}
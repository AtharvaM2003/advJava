package Manual;
import java.awt.*;

public class EX_04_XIII_2 extends Frame{

	public EX_04_XIII_2() {
		GridBagLayout gr = new GridBagLayout();
		GridBagConstraints gbc = new GridBagConstraints();
		setLayout(gr);
		GridBagLayout layout= new GridBagLayout();
		setLayout(layout);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(new Label("Name"),gbc);
	
		gbc.gridx = 1;
		gbc.gridy = 0;
		add(new TextField(5),gbc);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.gridx = 0;
		gbc.gridy = 3;
		add(new Label("Comments"),gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 3;
		add(new TextArea(6,10),gbc);
		gbc.fill = GridBagConstraints.VERTICAL;
		gbc.gridx =0;
		gbc.gridy =5;
		gbc.gridwidth=4;
		add(new Button("Submit"),gbc);
		
	}

	public static void main(String[] args) {
		EX_04_XIII_2 gb =new EX_04_XIII_2();
		gb.setTitle("GridBagLayout in Java Example");
		gb.setSize(300,300);
		gb.setVisible(true);	
		
	}
	
}
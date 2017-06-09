package regex.validation;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class RegexApplication extends JFrame {
	public static final String STOP = "STOP";
	private static final String VALID_LICENSE_PLATE_NUMBER = "[a-zA-Z]{2}[0-9]{4}[a-zA-Z]{3}";
	private static final String VALID_FLIGHT_NUMBER = "[a-zA-Z]{2}[0-9]{3}";
	private static final String VALID_EMAIL_ADDRESS = "[a-zA-Z]{1}[a-zA-Z0-9-_]*@[a-zA-Z0-9]*.[a-zA-Z]{0,}";

	// DEFAULT FRAME SIZE
	private static final int FRAME_WIDTH = 335;
	private static final int FRAME_HEIGHT = 200;
	
	//DEFAULT BUTTON SIZE
	private static final int BUTTON_WIDTH = 150;
	private static final int BUTTON_HEIGHT = 25;
	
	//DEFAULT TEXTBOX SIZE
	private static final int TEXTBOX_WIDTH = 300;
	private static final int TEXTBOX_HEIGTH = 25;
	static JTextField txtPlateNumber;
	
	// DECLARE_CONTROLS
    private javax.swing.JButton BPlateNumber = new javax.swing.JButton();
	private javax.swing.JButton BFlightNumber = new javax.swing.JButton();
	private javax.swing.JButton BEmailAddress = new javax.swing.JButton();
	private javax.swing.JButton BExit = new javax.swing.JButton();
	private JTextField JTextFieldInput = new JTextField();
	private javax.swing.JLabel JLabelReplace = new javax.swing.JLabel();
	private javax.swing.JLabel JLabelWith = new javax.swing.JLabel();
	private JTextField JtxtFindText = new JTextField();
	private JTextField JtxtReplaceText = new JTextField();

	private javax.swing.JButton BReplace = new javax.swing.JButton();
		
	//
	
	private RegexApplication() {
		//{{INIT_CONTROLS
		
		setTitle("REGEX example");
		getContentPane().setLayout(null);
		setSize(this.FRAME_WIDTH,this.FRAME_HEIGHT);
		
		JTextFieldInput.setBounds(10,10, TEXTBOX_WIDTH, TEXTBOX_HEIGTH);
		getContentPane().add(JTextFieldInput);
		
		JLabelReplace.setText("Replace ");
		getContentPane().add(JLabelReplace);
		JLabelReplace.setBounds(10,40, 50, 25);
		
		JtxtFindText.setBounds(60, 40, 50, 25);
		getContentPane().add(JtxtFindText);
		
		JLabelWith.setText("with ");
		getContentPane().add(JLabelWith);
		JLabelWith.setBounds(120,40, 50, 25);
		
		JtxtReplaceText.setBounds(150, 40, 50, 25);
		getContentPane().add(JtxtReplaceText);
		
		BReplace.setText("REPLACE");
		BReplace.setActionCommand("REPLACE");
		getContentPane().add(BReplace);
		BReplace.setBounds(210,40,100,this.BUTTON_HEIGHT);
		
		BPlateNumber.setText("CHECK PLATE NUMBER");
		BPlateNumber.setActionCommand("CHECK_PLATE_NUMBER");
		getContentPane().add(BPlateNumber);
		BPlateNumber.setBounds(10,90,this.BUTTON_WIDTH,this.BUTTON_HEIGHT);
		
		BFlightNumber.setText("CHECK FLIGHT NUMBER");
		BFlightNumber.setActionCommand("CHECK_PLATE_NUMBER");
		getContentPane().add(BFlightNumber);
		BFlightNumber.setBounds(160,90,this.BUTTON_WIDTH,this.BUTTON_HEIGHT);
		
		BEmailAddress.setText("CHECK EMAIL ADDRESS");
		BEmailAddress.setActionCommand("CHECK_EMAIL_ADDRESSR");
		getContentPane().add(BEmailAddress);
		BEmailAddress.setBounds(10,120,this.BUTTON_WIDTH,this.BUTTON_HEIGHT);
		
		BExit.setText("Exit");
		BExit.setActionCommand("Exit");
		getContentPane().add(BExit);
		BExit.setBounds(160,120,this.BUTTON_WIDTH,this.BUTTON_HEIGHT);
		
		SymAction lSymAction = new SymAction();
		BReplace.addActionListener(lSymAction);
		BPlateNumber.addActionListener(lSymAction);
		BFlightNumber.addActionListener(lSymAction);
		BEmailAddress.addActionListener(lSymAction);
		BExit.addActionListener(lSymAction);
		
	}
	
	public static void main(String[] args) {
		try {
		    // Add the following code if you want the Look and Feel
		    // to be set to the Look and Feel of the native system.
		    
		    try {
		        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		    } 
		    catch (Exception ignored) {
		    }
		    

			//Create a new instance of our application's frame, and make it visible.
			(new RegexApplication()).setVisible(true);
		} 
		catch (Throwable t) {
			t.printStackTrace();
			//Ensure the application exits with an error condition.
			System.exit(1);
		}
	}
	
	class SymAction implements java.awt.event.ActionListener
	{
		public void actionPerformed(java.awt.event.ActionEvent event)
		{
			Object object = event.getSource();
			if (object == BReplace)
				BReplace_actionPerformed(event);
			else if (object == BPlateNumber)
				regex_actionPerformed(event, VALID_LICENSE_PLATE_NUMBER, "PLATE NUMBER");
			else if (object == BFlightNumber)
				regex_actionPerformed(event, VALID_FLIGHT_NUMBER, "FLIGHT NUMBER");
			else if (object == BEmailAddress)
				regex_actionPerformed(event, VALID_EMAIL_ADDRESS, "EMAIL ADDRESS");
			else if (object == BExit) {
				exitApplication();
			}
			
		}
	}
	
	private void BReplace_actionPerformed(java.awt.event.ActionEvent event) {
		String text = JTextFieldInput.getText();
		String findText = JtxtFindText.getText();
		String replaceText = JtxtReplaceText.getText();
		
		JTextFieldInput.setText(text.replace(findText, replaceText));
	}
	
	private void regex_actionPerformed(java.awt.event.ActionEvent event, String regex, String name) {
		String text = JTextFieldInput.getText();

		JOptionPane.showMessageDialog(null, (String.format(" THIS IS A %s %s", text.matches(regex) ? "VALID" : "NOT VALID", name)));
	}
	
	private void exitApplication()
	{
		try {
		    	this.setVisible(false);    // hide the Frame
		    	this.dispose();            // free the system resources
		    	System.exit(0);            // close the application
			}
		catch (Exception ignored) {
		}
	}

	
}

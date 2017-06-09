package regex.validation;

import javax.swing.JOptionPane;

public class PatternMatching extends javax.swing.JFrame {
	private PatternMatching() {

		setTitle("Add New Student");
		// {{INIT_CONTROLS
		getContentPane().setLayout(null);
		setSize(300, 270);
		setVisible(true);
		
		//Close Button
		BClose.setText("Close");
		BClose.setActionCommand("Close");
		getContentPane().add(BClose);
		BClose.setBounds(140,200, 90, 25);
		//end Close Button
		
		BCheck.setText("Check");
		BCheck.setActionCommand("Check");
		getContentPane().add(BCheck);
		BCheck.setBounds(20,200, 100, 25);
		
		JlblLicense.setText("License:");
		getContentPane().add(JlblLicense);
		JlblLicense.setBounds(5,5,90,22);
		JtxtLicense.setEditable(true);
		getContentPane().add(JtxtLicense);
		JtxtLicense.setBounds(100,5,100,23);


		JlblReplace.setText("ReplaceText:");
		getContentPane().add(JlblReplace);
		JlblReplace.setBounds(5,30,90,22);
		JtxtReplace.setEditable(true);
		getContentPane().add(JtxtReplace);
		JtxtReplace.setBounds(100,30,100,23);
		
		JlblMyPattern.setText("My Pass:");
		getContentPane().add(JlblMyPattern);
		JlblMyPattern.setBounds(5,55,90,22);
		JtxtMyPattern.setEditable(true);
		getContentPane().add(JtxtMyPattern);
		JtxtMyPattern.setBounds(100,55,100,23);

		SymAction lSymAction = new SymAction();
		BClose.addActionListener(lSymAction);
		BCheck.addActionListener(lSymAction);
		// }}
	}

	public void setVisible(boolean b) {
		if (b)
			setLocation(50, 50);
		super.setVisible(b);
	}

	static public void main(String args[]) {
		(new PatternMatching()).setVisible(true);
	}

	// {{DECLARE_CONTROLS
    private javax.swing.JButton BClose = new javax.swing.JButton();
	private javax.swing.JButton BCheck = new javax.swing.JButton();
	
	private javax.swing.JLabel JlblLicense = new javax.swing.JLabel();
	private javax.swing.JTextField JtxtLicense = new javax.swing.JTextField();
	
	private javax.swing.JLabel JlblReplace = new javax.swing.JLabel();
	private javax.swing.JTextField JtxtReplace = new javax.swing.JTextField();
	
	private javax.swing.JLabel JlblMyPattern = new javax.swing.JLabel();
	private javax.swing.JTextField JtxtMyPattern = new javax.swing.JTextField();
	
	
	  private static final String VALID_LICENSE_PATTERN
      = "[a-zA-Z]{2}[0-9]{4}[a-zA-Z]{3}";
	  private static final String VALID_MYPASSWORD_PATTERN = "((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#*=]).{5,})";

	// }}

	// {{DECLARE_MENUS
	// }}

	class SymAction implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent event) {
			Object object = event.getSource();
			if (object == BClose)
				BClose_actionPerformed(event);
			else if(object == BCheck)
			{
				checkPattern();
			}
		}
	}

	private void BClose_actionPerformed(java.awt.event.ActionEvent event) {
		this.dispose();

	}
	
	private void checkPattern()
	{
		if(!JtxtLicense.getText().matches(VALID_LICENSE_PATTERN))
		{
			JOptionPane.showMessageDialog(null,"Wrong License!!");
			return;
		}
		String pattern = "(^|\\D)8(\\D|$)";
		JtxtReplace.setText(JtxtReplace.getText().replaceAll(pattern,"$1eight$2"));

		if(!JtxtMyPattern.getText().matches(VALID_MYPASSWORD_PATTERN))
		{
			JOptionPane.showMessageDialog(null,"You Password must contains digit,lower case letter, upper case letter," +
				"special character, minimum 5 character ");
			return;
		}
		JOptionPane.showMessageDialog(null,"Correct!! ");
	}
}
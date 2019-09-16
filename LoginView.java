import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class LoginView  { 

//	This class is responsible for displaying the Graphical User Interface to 
//	the user
	
	private JFrame jframelogin;
	private JTextField username_textfield;
	private JPasswordField password_textfield;
	private JButton LoginButton;
	private JButton ExitButton;
	private JLabel LabelNorthampton;
	private LoginController controller;
		
	

	/**
	 * Create the application.
	 */
	public LoginView(Model model) {
	
		initialize();
	}

	/**
	 * Initialize the contents of the jframelogin.
	 */
	private void initialize() {
		jframelogin = new JFrame();
		jframelogin.getContentPane().setBackground(new Color(255, 255, 255));
		jframelogin.setBounds(100, 100, 684, 465);
		jframelogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframelogin.getContentPane().setLayout(null);
		jframelogin.setTitle("Northampton Vehicle Hire Company");
		
		username_textfield = new JTextField();
		username_textfield.setForeground(new Color(255, 255, 255));
		username_textfield.setBackground(new Color(0, 0, 0));
		username_textfield.setBounds(260, 157, 170, 28);
		jframelogin.getContentPane().add(username_textfield);
		username_textfield.setColumns(10);
		
		JLabel UsernameLabel = new JLabel("Username:");
		UsernameLabel.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		UsernameLabel.setBounds(112, 159, 87, 24);
		jframelogin.getContentPane().add(UsernameLabel);
		
		JLabel PasswordLabel = new JLabel("Password:");
		PasswordLabel.setFont(new Font("Sylfaen", Font.PLAIN, 18));
		PasswordLabel.setBounds(112, 233, 109, 21);
		jframelogin.getContentPane().add(PasswordLabel);
		
		password_textfield = new JPasswordField();
		password_textfield.setForeground(new Color(255, 255, 255));
		password_textfield.setBackground(new Color(0, 0, 0));
		password_textfield.setBounds(260, 233, 170, 28);
		jframelogin.getContentPane().add(password_textfield);
		
		LoginButton = new JButton("Login");
		LoginButton.setBackground(new Color(240, 248, 255));
		LoginButton.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		LoginButton.setBounds(96, 318, 116, 48);
		LoginButton.addActionListener(controller);
		jframelogin.getContentPane().add(LoginButton);
		
		ExitButton = new JButton("Exit");
		ExitButton.setBackground(new Color(240, 248, 255));
		ExitButton.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		ExitButton.setBounds(486, 318, 130, 48);
		jframelogin.getContentPane().add(ExitButton);
		ExitButton.addActionListener(controller);
		
		LabelNorthampton = new JLabel("Northampton Vehicle Login System");
		LabelNorthampton.setHorizontalAlignment(SwingConstants.CENTER);
		LabelNorthampton.setFont(new Font("Sylfaen", Font.BOLD | Font.ITALIC, 20));
		LabelNorthampton.setBounds(147, 27, 374, 81);
		jframelogin.getContentPane().add(LabelNorthampton);
		
		JButton ResetButton = new JButton("Reset");
		ResetButton.setBackground(new Color(240, 248, 255));
		ResetButton.setFont(new Font("Sylfaen", Font.PLAIN, 15));
		ResetButton.setBounds(284, 318, 124, 48);
		jframelogin.getContentPane().add(ResetButton);


		jframelogin.setVisible(true);
		
	}
	
//	public void settextnull() {
//		username_textfield.setText("");
//		password_textfield.setText("");
//		}
		//to do set visible 
//		public void 

	
	public String getUsernameText() {
		
	return	username_textfield.getText().toString();
	}
	
	public String getPasswordText() {
		
	return	password_textfield.getText().toString();
	}
	
	
	
	
	public void addListeners(LoginController LoginCntler) {
		
		ExitButton.addActionListener(LoginCntler);
		LoginButton.addActionListener(LoginCntler);
		
	}
}

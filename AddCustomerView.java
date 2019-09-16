import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class AddCustomerView {
 private LoginController loginController;
 private Model model;
 private JFrame CustomerViewFrame;
 private JTextField TextfieldUserId;
 private JTextField TextfieldFirstname;
 private JTextField TextfieldUserAddress;
 private JTextField Textfield_Phone_Number;
 private JTextField textfield_email;
 private JTextField text_field_DoB;
 private JTextField textField_Username;
 private JTextField textfield_user_password;

 private JButton SubmitButton;
 private JButton btnExit;

	
	public AddCustomerView() {
	
		initialize();
	}

	
	private void initialize() {
		CustomerViewFrame = new JFrame();
		CustomerViewFrame.getContentPane().setBackground(new Color(240, 248, 255));
		CustomerViewFrame.setBounds(100, 100, 684, 465);
		CustomerViewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CustomerViewFrame.getContentPane().setLayout(null);
		CustomerViewFrame.setTitle("Admin Panel-Add New Customer");
		CustomerViewFrame.setVisible(true);
		
		TextfieldUserId = new JTextField();
		TextfieldUserId.setBounds(164, 26, 141, 20);
		CustomerViewFrame.getContentPane().add(TextfieldUserId);
		TextfieldUserId.setColumns(10);
		
		TextfieldFirstname = new JTextField();
		TextfieldFirstname.setColumns(10);
		TextfieldFirstname.setBounds(164, 75, 141, 20);
		CustomerViewFrame.getContentPane().add(TextfieldFirstname);
		
		TextfieldUserAddress = new JTextField();
		TextfieldUserAddress.setColumns(10);
		TextfieldUserAddress.setBounds(164, 124, 141, 20);
		CustomerViewFrame.getContentPane().add(TextfieldUserAddress);
		
		Textfield_Phone_Number = new JTextField();
		Textfield_Phone_Number.setColumns(10);
		Textfield_Phone_Number.setBounds(164, 173, 141, 20);
		CustomerViewFrame.getContentPane().add(Textfield_Phone_Number);
		
		textfield_email = new JTextField();
		textfield_email.setColumns(10);
		textfield_email.setBounds(164, 222, 141, 20);
		CustomerViewFrame.getContentPane().add(textfield_email);
		
		text_field_DoB = new JTextField();
		text_field_DoB.setColumns(10);
		text_field_DoB.setBounds(164, 271, 141, 20);
		CustomerViewFrame.getContentPane().add(text_field_DoB);
		
		textField_Username = new JTextField();
		textField_Username.setColumns(10);
		textField_Username.setBounds(164, 320, 141, 20);
		CustomerViewFrame.getContentPane().add(textField_Username);
		
		textfield_user_password = new JTextField();
		textfield_user_password.setColumns(10);
		textfield_user_password.setBounds(164, 369, 141, 20);
		CustomerViewFrame.getContentPane().add(textfield_user_password);
		

		JLabel lblNewLabel = new JLabel("User ID:");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblNewLabel.setBounds(22, 31, 76, 17);
		CustomerViewFrame.getContentPane().add(lblNewLabel);
		
		JLabel lblFirstname = new JLabel("Firstname:");
		lblFirstname.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblFirstname.setBounds(22, 80, 76, 17);
		CustomerViewFrame.getContentPane().add(lblFirstname);
		
		JLabel lblAddress = new JLabel("User Address:");
		lblAddress.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblAddress.setBounds(22, 130, 98, 14);
		CustomerViewFrame.getContentPane().add(lblAddress);
		
		JLabel lblPhoneNo = new JLabel("Phone Number:");
		lblPhoneNo.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblPhoneNo.setBounds(22, 179, 109, 14);
		CustomerViewFrame.getContentPane().add(lblPhoneNo);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblEmail.setBounds(22, 228, 63, 14);
		CustomerViewFrame.getContentPane().add(lblEmail);
		
		JLabel lblDateOfBirth = new JLabel("Date Of Birth:");
		lblDateOfBirth.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblDateOfBirth.setBounds(22, 277, 98, 14);
		CustomerViewFrame.getContentPane().add(lblDateOfBirth);
		
		JLabel lblUser = new JLabel("Username:");
		lblUser.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblUser.setBounds(22, 326, 76, 14);
		CustomerViewFrame.getContentPane().add(lblUser);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblPassword.setBounds(22, 375, 76, 14);
		CustomerViewFrame.getContentPane().add(lblPassword);
		
		SubmitButton = new JButton("Submit");
		SubmitButton.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		SubmitButton.setBounds(545, 315, 93, 31);
		CustomerViewFrame.getContentPane().add(SubmitButton);
		
		btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		btnExit.setBounds(545, 368, 93, 31);
		CustomerViewFrame.getContentPane().add(btnExit);
	}

	

	public String getUserIDFieldtext() {
		return TextfieldUserId.getText();
	}
	public JTextField getUserIDField() {
		return TextfieldUserId;
	}

	public String getFirstNameFieldtext() {
		return TextfieldFirstname.getText();
	}
	
	public JTextField getFirstNameField() {
		return TextfieldFirstname;
	}
	

	public String getUserddressFieldtext() {
		return TextfieldUserAddress.getText();
	}
	
	public JTextField getUserAddressField() {
		return TextfieldUserAddress;
	}

	public String getPhoneFieldtext() {
		return Textfield_Phone_Number.getText();
	}
	
	public JTextField getPhoneField() {
		return Textfield_Phone_Number;
	}

	public String getUserEmailFieldtext() {
		return textfield_email.getText();
	}
	
	public JTextField getUserEmailField() {
		return textfield_email;
	}

	public String getDobFieldtext() {
		return text_field_DoB.getText();
	}
	
	public JTextField getDobField() {
		return text_field_DoB;
	}

	public String getUsernameFieldtext() {
		return textField_Username.getText();
	}
	
	public JTextField getUsernameField() {
		return textField_Username;
	}

	public String getPasswordFieldtext() {
		return textfield_user_password.getText();
	}
	
	public JTextField getPasswordField() {
		return textfield_user_password;
	}
	
	public void addListeners(AddCustomerController custCntrl) {
		
		SubmitButton.addActionListener(custCntrl);
		btnExit.addActionListener(custCntrl);
	}
}

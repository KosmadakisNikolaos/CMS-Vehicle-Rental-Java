import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class CustomerView {

	private JFrame frmWelcomeToNortha;
	private static JButton btnExit;
	private CustomerController CustomerController;
	private JLabel lbl_id;
	private JLabel lbl_name;
	private JLabel lbl_address;
	private JLabel lbl_phone_number;
	private JLabel lbl_email;
	private JLabel lbl_date_of_birth;
	private JLabel lbl_username;
	private JLabel lbl_password;
	
	/**
	 * Create the application.
	 */
	public CustomerView(Customer customer) {
		initialize(customer);
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Customer customer) {
		frmWelcomeToNortha = new JFrame();
		frmWelcomeToNortha.setTitle("Northampton Vehicle Hire Company ");
		frmWelcomeToNortha.getContentPane().setBackground(new Color(240, 248, 255));
		frmWelcomeToNortha.setBounds(100, 100, 780, 624);
		frmWelcomeToNortha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWelcomeToNortha.getContentPane().setLayout(null);
		frmWelcomeToNortha.setVisible(true);
		
		JPanel UserDetailsPane = new JPanel();
		UserDetailsPane.setBackground(Color.WHITE);
		UserDetailsPane.setBounds(25, 78, 359, 430);
		frmWelcomeToNortha.getContentPane().add(UserDetailsPane);
		UserDetailsPane.setLayout(null);
		
	    
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(427, 78, 316, 430);
		frmWelcomeToNortha.getContentPane().add(panel);
		
		JLabel lblVehicles = new JLabel("Vehicles:");
		lblVehicles.setFont(new Font("Sylfaen", Font.BOLD, 16));
		lblVehicles.setBounds(537, 37, 105, 14);
		frmWelcomeToNortha.getContentPane().add(lblVehicles);
		
		
		JLabel lblPersonalDetails = new JLabel("Customer Information:");
		lblPersonalDetails.setFont(new Font("Sylfaen", Font.BOLD, 16));
		lblPersonalDetails.setBounds(75, 25, 198, 39);
		frmWelcomeToNortha.getContentPane().add(lblPersonalDetails);
		
	    btnExit = new JButton("Exit");
	    btnExit.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		btnExit.setBounds(644, 544, 99, 31);
		frmWelcomeToNortha.getContentPane().add(btnExit);
		btnExit.addActionListener(CustomerController);
		
		
		
		
		
		JLabel lblCustomerId = new JLabel(" ID:");
		lblCustomerId.setFont(new Font("Sylfaen", Font.BOLD, 14));
		lblCustomerId.setBounds(10, 17, 76, 33);
		UserDetailsPane.add(lblCustomerId);
		
		JLabel lblCustomerName = new JLabel("Name :");
		lblCustomerName.setFont(new Font("Sylfaen", Font.BOLD, 14));
		lblCustomerName.setBounds(10, 73, 66, 33);
		UserDetailsPane.add(lblCustomerName);
		
		JLabel lblCustomerAddress = new JLabel("Address:");
		lblCustomerAddress.setFont(new Font("Sylfaen", Font.BOLD, 14));
		lblCustomerAddress.setBounds(10, 137, 76, 33);
		UserDetailsPane.add(lblCustomerAddress);
		
		JLabel lblCustomerPhonenumber = new JLabel("Phone Number:");
		lblCustomerPhonenumber.setFont(new Font("Sylfaen", Font.BOLD, 14));
		lblCustomerPhonenumber.setBounds(10, 181, 115, 33);
		UserDetailsPane.add(lblCustomerPhonenumber);
		
		JLabel lblCustomerEmail = new JLabel("E-mail:");
		lblCustomerEmail.setFont(new Font("Sylfaen", Font.BOLD, 14));
		lblCustomerEmail.setBounds(10, 225, 91, 33);
		UserDetailsPane.add(lblCustomerEmail);
		
		JLabel lblCustomerDateOf = new JLabel("Date Of Birth:");
		lblCustomerDateOf.setFont(new Font("Sylfaen", Font.BOLD, 14));
		lblCustomerDateOf.setBounds(10, 279, 115, 33);
		UserDetailsPane.add(lblCustomerDateOf);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("Sylfaen", Font.BOLD, 14));
		lblUsername.setBounds(10, 334, 115, 33);
		UserDetailsPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Sylfaen", Font.BOLD, 14));
		lblPassword.setBounds(10, 386, 115, 33);
		UserDetailsPane.add(lblPassword);
		
		

		lbl_id = new JLabel("");
		lbl_id.setText(customer.getId());
		lbl_id.setBounds(125, 23, 126, 20);
		UserDetailsPane.add(lbl_id);
		
		lbl_name = new JLabel((String) null);
		lbl_name.setText(customer.getName());
		lbl_name.setBounds(125, 79, 126, 20);
		UserDetailsPane.add(lbl_name);
		
		lbl_address = new JLabel((String) null);
		lbl_address.setText(customer.getAddress());
		lbl_address.setBounds(125, 146, 126, 20);
		UserDetailsPane.add(lbl_address);
		
		lbl_phone_number = new JLabel((String) null);
		lbl_phone_number.setText(customer.getPhone_no());
		lbl_phone_number.setBounds(125, 187, 126, 20);
		UserDetailsPane.add(lbl_phone_number);
		
		lbl_email = new JLabel((String) null);
		lbl_email.setText(customer.getEmail());
		lbl_email.setBounds(125, 234, 126, 20);
		UserDetailsPane.add(lbl_email);
		
		lbl_date_of_birth = new JLabel((String) null);
		lbl_date_of_birth.setText(customer.getDob());
		lbl_date_of_birth.setBounds(125, 285, 126, 20);
		UserDetailsPane.add(lbl_date_of_birth);
		
		lbl_username = new JLabel((String) null);
		lbl_username.setText(customer.getUsername());
		lbl_username.setBounds(125, 340, 126, 20);
		UserDetailsPane.add(lbl_username);
		
		lbl_password = new JLabel((String) null);
		lbl_password.setText(customer.getPassword());
		lbl_password.setBounds(125, 392, 126, 20);
		UserDetailsPane.add(lbl_password);
		
		
	
		
	}
	
	
	public static void addListeners(CustomerController custController) {
		
		btnExit.addActionListener(custController);
	}
}

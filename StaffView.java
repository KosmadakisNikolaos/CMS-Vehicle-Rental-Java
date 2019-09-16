//imported libraries

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTextField;

public class StaffView {
	private static JButton add_customer_button;
	private static JButton addCar_button;
	private static JButton addLorry_button;
	private static JButton addMinibus_button;
	private static JButton removeVehicle;
	private static JButton removeCustomer;
	private JFrame StaffViewFrame;
	private JLabel lb_remove_Customer;
	private JLabel lb_remove_Vehicle;
	private JTextField textField_remove_vehicle;
	private JTextField textField_remove_Customer;
	

	
	public StaffView() {
		initialize();
	}

	
	private void initialize() {
		StaffViewFrame = new JFrame();
		StaffViewFrame.getContentPane().setBackground(new Color(240, 248, 255));
		StaffViewFrame.setBounds(100, 100, 704, 545);
		StaffViewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		StaffViewFrame.getContentPane().setLayout(null);
		StaffViewFrame.setTitle("Administration Panel");
		StaffViewFrame.setVisible(true);

		
		add_customer_button = new JButton("Add Customer");
		add_customer_button.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		add_customer_button.setBackground(new Color(192, 192, 192));
		add_customer_button.setBounds(112, 330, 143, 23);
		StaffViewFrame.getContentPane().add(add_customer_button);
		
		removeCustomer = new JButton("Remove Customer");
		removeCustomer.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		removeCustomer.setBackground(new Color(192, 192, 192));
		removeCustomer.setBounds(397, 330, 172, 23);
		StaffViewFrame.getContentPane().add(removeCustomer);
		
		removeVehicle = new JButton("Remove Vehicle");
		removeVehicle.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		removeVehicle.setBackground(new Color(192, 192, 192));
		removeVehicle.setBounds(112, 175, 172, 23);
		StaffViewFrame.getContentPane().add(removeVehicle);
		
		JButton viewVehicles = new JButton("View Vehicles");
		viewVehicles.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		viewVehicles.setBackground(new Color(192, 192, 192));
		
		viewVehicles.setBounds(397, 175, 144, 23);
		StaffViewFrame.getContentPane().add(viewVehicles);
		
		addCar_button = new JButton("Add Car");
		addCar_button.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		addCar_button.setBackground(new Color(192, 192, 192));
		addCar_button.setBounds(59, 78, 125, 23);
		StaffViewFrame.getContentPane().add(addCar_button);
		
		addLorry_button = new JButton("Add Lorry");
		addLorry_button.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		addLorry_button.setBackground(new Color(192, 192, 192));
		addLorry_button.setBounds(444, 78, 125, 23);
		StaffViewFrame.getContentPane().add(addLorry_button);
		
		addMinibus_button = new JButton("Add Minibus");
		addMinibus_button.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		addMinibus_button.setBackground(new Color(192, 192, 192));
		addMinibus_button.setBounds(255, 78, 144, 23);
		StaffViewFrame.getContentPane().add(addMinibus_button);
		
		JLabel lblVehicleType = new JLabel("Vehicle Section:");
		lblVehicleType.setFont(new Font("Sylfaen", Font.BOLD, 22));
		lblVehicleType.setBounds(248, 27, 172, 42);
		StaffViewFrame.getContentPane().add(lblVehicleType);
		
		JLabel lblCustomerSection = new JLabel("Customer Section:");
		lblCustomerSection.setFont(new Font("Sylfaen", Font.BOLD, 22));
		lblCustomerSection.setBounds(226, 258, 193, 42);
		StaffViewFrame.getContentPane().add(lblCustomerSection);
		
		
		lb_remove_Customer = new JLabel("");
		lb_remove_Customer.setBounds(359, 371, 319, 23);
		StaffViewFrame.getContentPane().add(lb_remove_Customer);
		
		lb_remove_Vehicle = new JLabel("");
		lb_remove_Vehicle.setBounds(10, 214, 274, 23);
		StaffViewFrame.getContentPane().add(lb_remove_Vehicle);
		
		textField_remove_vehicle = new JTextField();
		textField_remove_vehicle.setBounds(122, 236, 162, 20);
		StaffViewFrame.getContentPane().add(textField_remove_vehicle);
		textField_remove_vehicle.setColumns(10);
		
		textField_remove_Customer = new JTextField();
		textField_remove_Customer.setColumns(10);
		textField_remove_Customer.setBounds(397, 396, 172, 20);
		StaffViewFrame.getContentPane().add(textField_remove_Customer);
		
		
		
	}

	public JLabel getLb_remove_Customer() {
		return lb_remove_Customer;
	}


	public void setLb_remove_Customer(JLabel lb_remove_Customer) {
		this.lb_remove_Customer = lb_remove_Customer;
	}


	public JLabel getLb_remove_Vehicle() {
		return lb_remove_Vehicle;
	}


	public void setLb_remove_Vehicle(JLabel lb_remove_Vehicle) {
		this.lb_remove_Vehicle = lb_remove_Vehicle;
	}

	
	
	

	public JTextField getTextField_remove_vehicle() {
		return textField_remove_vehicle;
	}


	public void setTextField_remove_vehicle(JTextField textField_remove_vehicle) {
		this.textField_remove_vehicle = textField_remove_vehicle;
	}


	public JTextField getTextField_remove_Customer() {
		return textField_remove_Customer;
	}


	public void setTextField_remove_Customer(JTextField textField_remove_Customer) {
		this.textField_remove_Customer = textField_remove_Customer;
	}


	public static void addListeners(StaffController staffController) {
		// TODO Auto-generated method stub
		add_customer_button.addActionListener(staffController);
		addCar_button.addActionListener(staffController);
		addLorry_button.addActionListener(staffController);
		addMinibus_button.addActionListener(staffController);
		removeVehicle.addActionListener(staffController);
		removeCustomer.addActionListener(staffController);
		
	}
}

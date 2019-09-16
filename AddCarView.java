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

public class AddCarView {
	

 private Model model;
 private JFrame CarViewFrame;
 private JTextField TextfieldCarMake;
 private JTextField TextfieldCarModel;
 private JTextField TextfieldTopSpeed;
 private JTextField Textfield_Registration_Number;
 private JTextField textfield_daily_hire;
 private JTextField text_field_Fuel_type;
 private JTextField textField_Number_of_doors;

 private JButton SubmitButton;
 private JButton exitButton;

	
	public AddCarView() {
	
		initialize();
	}

	
	private void initialize() {
		CarViewFrame = new JFrame();
		CarViewFrame.getContentPane().setFont(new Font("Sylfaen", Font.PLAIN, 12));
		CarViewFrame.getContentPane().setBackground(new Color(240, 248, 255));
		CarViewFrame.setBounds(100, 100, 684, 465);
		CarViewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CarViewFrame.getContentPane().setLayout(null);
		CarViewFrame.setTitle("Admin Panel-Add New Car");
		CarViewFrame.setVisible(true);
		
		TextfieldCarMake = new JTextField();
		TextfieldCarMake.setFont(new Font("Sylfaen", Font.PLAIN, 12));
		TextfieldCarMake.setBounds(164, 26, 141, 20);
		CarViewFrame.getContentPane().add(TextfieldCarMake);
		TextfieldCarMake.setColumns(10);
		
		TextfieldCarModel = new JTextField();
		TextfieldCarModel.setFont(new Font("Sylfaen", Font.PLAIN, 12));
		TextfieldCarModel.setColumns(10);
		TextfieldCarModel.setBounds(164, 75, 141, 20);
		CarViewFrame.getContentPane().add(TextfieldCarModel);
		
		TextfieldTopSpeed = new JTextField();
		TextfieldTopSpeed.setFont(new Font("Sylfaen", Font.PLAIN, 12));
		TextfieldTopSpeed.setColumns(10);
		TextfieldTopSpeed.setBounds(164, 124, 141, 20);
		CarViewFrame.getContentPane().add(TextfieldTopSpeed);
		
		Textfield_Registration_Number = new JTextField();
		Textfield_Registration_Number.setFont(new Font("Sylfaen", Font.PLAIN, 12));
		Textfield_Registration_Number.setColumns(10);
		Textfield_Registration_Number.setBounds(164, 173, 141, 20);
		CarViewFrame.getContentPane().add(Textfield_Registration_Number);
		
		textfield_daily_hire = new JTextField();
		textfield_daily_hire.setFont(new Font("Sylfaen", Font.PLAIN, 12));
		textfield_daily_hire.setColumns(10);
		textfield_daily_hire.setBounds(164, 222, 141, 20);
		CarViewFrame.getContentPane().add(textfield_daily_hire);
		
		text_field_Fuel_type = new JTextField();
		text_field_Fuel_type.setFont(new Font("Sylfaen", Font.PLAIN, 12));
		text_field_Fuel_type.setColumns(10);
		text_field_Fuel_type.setBounds(164, 271, 141, 20);
		CarViewFrame.getContentPane().add(text_field_Fuel_type);
		
		textField_Number_of_doors = new JTextField();
		textField_Number_of_doors.setFont(new Font("Sylfaen", Font.PLAIN, 12));
		textField_Number_of_doors.setColumns(10);
		textField_Number_of_doors.setBounds(164, 320, 141, 20);
		CarViewFrame.getContentPane().add(textField_Number_of_doors);
		

		JLabel lblNewLabel = new JLabel("Car Make:");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblNewLabel.setBounds(22, 31, 76, 17);
		CarViewFrame.getContentPane().add(lblNewLabel);
		
		JLabel labelModel = new JLabel("Car Model:");
		labelModel.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		labelModel.setBounds(22, 80, 76, 17);
		CarViewFrame.getContentPane().add(labelModel);
		
		JLabel lbltopSpeed = new JLabel("Top Speed:");
		lbltopSpeed.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lbltopSpeed.setBounds(22, 130, 98, 14);
		CarViewFrame.getContentPane().add(lbltopSpeed);
		
		JLabel lblRegNo = new JLabel("Reg. Number:");
		lblRegNo.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblRegNo.setBounds(22, 179, 109, 14);
		CarViewFrame.getContentPane().add(lblRegNo);
		
		JLabel lblDayily_hire_rate = new JLabel("Daily_Hire_Rate:");
		lblDayily_hire_rate.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblDayily_hire_rate.setBounds(22, 228, 132, 14);
		CarViewFrame.getContentPane().add(lblDayily_hire_rate);
		
		JLabel lblFuel_type = new JLabel("Fuel Type:");
		lblFuel_type.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblFuel_type.setBounds(22, 277, 98, 14);
		CarViewFrame.getContentPane().add(lblFuel_type);
		
		JLabel lblDoor_number = new JLabel("Number Of Doors:");
		lblDoor_number.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblDoor_number.setBounds(22, 326, 123, 14);
		CarViewFrame.getContentPane().add(lblDoor_number);
		
		SubmitButton = new JButton("Submit");
		SubmitButton.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		SubmitButton.setBounds(545, 315, 93, 31);
		CarViewFrame.getContentPane().add(SubmitButton);
		
		exitButton = new JButton("Exit");
		exitButton.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		exitButton.setBounds(545, 368, 93, 31);
		CarViewFrame.getContentPane().add(exitButton);
	}

	

	public String getTextfieldCarMake() {
		return TextfieldCarMake.getText();
	}
	public JTextField getfieldCarMake() {
		return TextfieldCarMake; 
	}

	public String getTextfieldCarModel() {
		return TextfieldCarModel.getText();
	}
	
	public JTextField getFieldCarModel() {
		return TextfieldCarModel;
	}
	

	public String getTextfieldTopSpeed() {
		return TextfieldTopSpeed.getText();
	}
	
	public JTextField getfieldTopSpeed() {
		return TextfieldTopSpeed;
	}

	public String getTextfield_Registration_Number() {
		return Textfield_Registration_Number.getText();
	}
	
	public JTextField getRegistration_Number_field() {
		return Textfield_Registration_Number;
	}

	public String gettextfield_daily_hire() {
		return textfield_daily_hire.getText();
	}
	
	public JTextField getfield_daily_hire() {
		return textfield_daily_hire;
	}

	public String gettext_field_Fuel_type() {
		return text_field_Fuel_type.getText();
	}
	
	public JTextField getfield_Fuel_type() {
		return text_field_Fuel_type;
	}

	public String gettextField_Number_of_doors() {
		return textField_Number_of_doors.getText();
	}
	
	public JTextField getField_Number_of_doors() {
		return textField_Number_of_doors;
	}

	
	
	
	
	
	public void addListeners(AddCarController CarCntrl) {
		
		SubmitButton.addActionListener(CarCntrl);
		exitButton.addActionListener(CarCntrl);
		
		
	}
}

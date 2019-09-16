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

public class AddLorryView {
	

 private Model model;
 private JFrame LorryViewFrame;
 private JTextField TextfieldLorryMake;
 private JTextField TextfieldLorryModel;
 private JTextField TextfieldTopSpeed;
 private JTextField Textfield_Registration_Number;
 private JTextField textfield_daily_hire;
 private JTextField text_field_Load_weight;

 private JButton SubmitButton;
 private JButton btnExit;
 private JTextField text_field_Load_capacity;

	
	public AddLorryView() {
	
		initialize();
	}

	
	private void initialize() {
		LorryViewFrame = new JFrame();
		LorryViewFrame.getContentPane().setBackground(new Color(240, 248, 255));
		LorryViewFrame.setBounds(100, 100, 684, 465);
		LorryViewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LorryViewFrame.getContentPane().setLayout(null);
		LorryViewFrame.setTitle("Admin Panel-Add New Lorry");
		LorryViewFrame.setVisible(true);
		
		TextfieldLorryMake = new JTextField();
		TextfieldLorryMake.setBounds(164, 26, 141, 20);
		LorryViewFrame.getContentPane().add(TextfieldLorryMake);
		TextfieldLorryMake.setColumns(10);
		
		TextfieldLorryModel = new JTextField();
		TextfieldLorryModel.setColumns(10);
		TextfieldLorryModel.setBounds(164, 75, 141, 20);
		LorryViewFrame.getContentPane().add(TextfieldLorryModel);
		
		TextfieldTopSpeed = new JTextField();
		TextfieldTopSpeed.setColumns(10);
		TextfieldTopSpeed.setBounds(164, 124, 141, 20);
		LorryViewFrame.getContentPane().add(TextfieldTopSpeed);
		
		Textfield_Registration_Number = new JTextField();
		Textfield_Registration_Number.setColumns(10);
		Textfield_Registration_Number.setBounds(164, 173, 141, 20);
		LorryViewFrame.getContentPane().add(Textfield_Registration_Number);
		
		textfield_daily_hire = new JTextField();
		textfield_daily_hire.setColumns(10);
		textfield_daily_hire.setBounds(164, 222, 141, 20);
		LorryViewFrame.getContentPane().add(textfield_daily_hire);
		
		text_field_Load_weight = new JTextField();
		text_field_Load_weight.setColumns(10);
		text_field_Load_weight.setBounds(164, 271, 141, 20);
		LorryViewFrame.getContentPane().add(text_field_Load_weight);
		

		text_field_Load_capacity = new JTextField();
		text_field_Load_capacity.setColumns(10);
		text_field_Load_capacity.setBounds(164, 326, 141, 20);
		LorryViewFrame.getContentPane().add(text_field_Load_capacity);
		

		JLabel lblNewLabel = new JLabel("Lorry Make:");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblNewLabel.setBounds(22, 31, 82, 17);
		LorryViewFrame.getContentPane().add(lblNewLabel);
		
		JLabel labelModel = new JLabel("Lorry Model:");
		labelModel.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		labelModel.setBounds(22, 80, 98, 17);
		LorryViewFrame.getContentPane().add(labelModel);
		
		JLabel lbltopSpeed = new JLabel("Top Speed:");
		lbltopSpeed.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lbltopSpeed.setBounds(22, 130, 98, 14);
		LorryViewFrame.getContentPane().add(lbltopSpeed);
		
		JLabel lblRegNo = new JLabel("Reg. Number:");
		lblRegNo.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblRegNo.setBounds(22, 179, 109, 14);
		LorryViewFrame.getContentPane().add(lblRegNo);
		
		JLabel lblDayily_hire_rate = new JLabel("Daily_Hire_Rate:");
		lblDayily_hire_rate.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblDayily_hire_rate.setBounds(22, 228, 132, 14);
		LorryViewFrame.getContentPane().add(lblDayily_hire_rate);
		
		JLabel lblFuel_type = new JLabel("Loading Weight:");
		lblFuel_type.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblFuel_type.setBounds(22, 277, 132, 14);
		LorryViewFrame.getContentPane().add(lblFuel_type);
		
		SubmitButton = new JButton("Submit");
		SubmitButton.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		SubmitButton.setBounds(545, 315, 93, 31);
		LorryViewFrame.getContentPane().add(SubmitButton);
		
		btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		btnExit.setBounds(545, 368, 93, 31);
		LorryViewFrame.getContentPane().add(btnExit);
		
		JLabel lblLoadCapacityt = new JLabel("Load Capacity:");
		lblLoadCapacityt.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblLoadCapacityt.setBounds(22, 332, 132, 14);
		LorryViewFrame.getContentPane().add(lblLoadCapacityt);
		
	}

	

	public String getTextfieldLorryMake() {
		return TextfieldLorryMake.getText();
	}
	public JTextField getfieldLorryMake() {
		return TextfieldLorryMake;
	}

	public String getTextfieldLorryModel() {
		return TextfieldLorryModel.getText();
	}
	
	public JTextField getFieldLorryModel() {
		return TextfieldLorryModel;
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

	public String gettext_Load_weight() {
		return text_field_Load_weight.getText();
	}
	
	public JTextField getfield_Load_weight() {
		return text_field_Load_weight;
	}

	public String gettext_Load_capacity() {
		return text_field_Load_capacity.getText();
	}
	
	public JTextField getfield_Load_capacity() {
		return text_field_Load_capacity;
	}

	
	
	public void addListeners(AddLorryController CarCntrl) {
		
		SubmitButton.addActionListener(CarCntrl);
		btnExit.addActionListener(CarCntrl);
		
		
	}
}

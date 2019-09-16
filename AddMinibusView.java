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

public class AddMinibusView {
	

 private Model model;
 private JFrame MinibusViewFrame;
 private JTextField TextfieldMinibusMake;
 private JTextField TextfieldMinibusModel;
 private JTextField TextfieldTopSpeed;
 private JTextField Textfield_Registration_Number;
 private JTextField textfield_daily_hire;
 private JTextField text_field_seat_cap;

 private JButton SubmitButton;

	
	public AddMinibusView() {
	
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		MinibusViewFrame = new JFrame();
		MinibusViewFrame.getContentPane().setBackground(new Color(240, 248, 255));
		MinibusViewFrame.setBounds(100, 100, 684, 465);
		MinibusViewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MinibusViewFrame.getContentPane().setLayout(null);
		MinibusViewFrame.setTitle("Admin Panel-Add New MiniBus");
		
		
		TextfieldMinibusMake = new JTextField();
		TextfieldMinibusMake.setBounds(164, 26, 141, 20);
		MinibusViewFrame.getContentPane().add(TextfieldMinibusMake);
		TextfieldMinibusMake.setColumns(10);
		
		TextfieldMinibusModel = new JTextField();
		TextfieldMinibusModel.setColumns(10);
		TextfieldMinibusModel.setBounds(164, 75, 141, 20);
		MinibusViewFrame.getContentPane().add(TextfieldMinibusModel);
		
		TextfieldTopSpeed = new JTextField();
		TextfieldTopSpeed.setColumns(10);
		TextfieldTopSpeed.setBounds(164, 124, 141, 20);
		MinibusViewFrame.getContentPane().add(TextfieldTopSpeed);
		
		Textfield_Registration_Number = new JTextField();
		Textfield_Registration_Number.setColumns(10);
		Textfield_Registration_Number.setBounds(164, 173, 141, 20);
		MinibusViewFrame.getContentPane().add(Textfield_Registration_Number);
		
		textfield_daily_hire = new JTextField();
		textfield_daily_hire.setColumns(10);
		textfield_daily_hire.setBounds(164, 222, 141, 20);
		MinibusViewFrame.getContentPane().add(textfield_daily_hire);
		
		text_field_seat_cap = new JTextField();
		text_field_seat_cap.setColumns(10);
		text_field_seat_cap.setBounds(164, 271, 141, 20);
		MinibusViewFrame.getContentPane().add(text_field_seat_cap);
		

		JLabel lblNewLabel = new JLabel("Minibus Make:");
		lblNewLabel.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblNewLabel.setBounds(22, 28, 119, 17);
		MinibusViewFrame.getContentPane().add(lblNewLabel);
		
		JLabel labelModel = new JLabel("Minibus Model:");
		labelModel.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		labelModel.setBounds(22, 80, 109, 17);
		MinibusViewFrame.getContentPane().add(labelModel);
		
		JLabel lbltopSpeed = new JLabel("Top Speed:");
		lbltopSpeed.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lbltopSpeed.setBounds(22, 130, 98, 14);
		MinibusViewFrame.getContentPane().add(lbltopSpeed);
		
		JLabel lblRegNo = new JLabel("Reg. Number:");
		lblRegNo.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblRegNo.setBounds(22, 179, 109, 14);
		MinibusViewFrame.getContentPane().add(lblRegNo);
		
		JLabel lblDayily_hire_rate = new JLabel("Daily Hire Rate:");
		lblDayily_hire_rate.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblDayily_hire_rate.setBounds(22, 228, 132, 14);
		MinibusViewFrame.getContentPane().add(lblDayily_hire_rate);
		
		JLabel lblsiting_capacity = new JLabel("Seating Capacity:");
		lblsiting_capacity.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		lblsiting_capacity.setBounds(22, 277, 132, 14);
		MinibusViewFrame.getContentPane().add(lblsiting_capacity);
		
		SubmitButton = new JButton("Submit");
		SubmitButton.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		SubmitButton.setBounds(545, 315, 93, 31);
		MinibusViewFrame.getContentPane().add(SubmitButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Sylfaen", Font.PLAIN, 16));
		btnExit.setBounds(545, 368, 93, 31);
		MinibusViewFrame.getContentPane().add(btnExit);
		
		
		MinibusViewFrame.setVisible(true);
		
	}

	

	public String getTextfieldMinibusMake() {
		return TextfieldMinibusMake.getText();
	}
	public JTextField getfieldMinibusMake() {
		return TextfieldMinibusMake;
	}

	public String getTextfieldMinibusModel() {
		return TextfieldMinibusModel.getText();
	}
	
	public JTextField getFieldMinibusModel() {
		return TextfieldMinibusModel;
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

	public String gettext_seat_cap() {
		return text_field_seat_cap.getText();
	}
	
	public JTextField getfield_seat_cap() {
		return text_field_seat_cap;
	}

	
	
	
	public void addListeners(AddMinibusController CarCntrl) {
		
		SubmitButton.addActionListener(CarCntrl);
		
		
		
	}
}

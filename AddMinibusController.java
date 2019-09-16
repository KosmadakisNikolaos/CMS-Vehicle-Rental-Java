import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddMinibusController implements ActionListener { 
private Model model;
private AddMinibusView AddMinibus;
	
	public AddMinibusController(AddMinibusView AddMinibus, Model model) {
		this.model = model;
		this.AddMinibus  = AddMinibus;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	String action =	e.getActionCommand();
	
	if(action.equalsIgnoreCase("Submit")) { 
		
		String MinibusMakeField = AddMinibus.getTextfieldMinibusMake();
		String MinibusModelField = AddMinibus.getTextfieldMinibusModel();
		String TopSpeedField = AddMinibus.getTextfieldTopSpeed();
		String Registration_NumberField = AddMinibus.getTextfield_Registration_Number();
		String daily_hire_rateField =  AddMinibus.gettextfield_daily_hire();
		String Seat_Cap_Field = AddMinibus.gettext_seat_cap();
		
		
		
		
		
		
		miniBus minibus= new miniBus(MinibusMakeField, MinibusModelField, TopSpeedField, Registration_NumberField, daily_hire_rateField,Seat_Cap_Field);
		
		model.addMinibus(minibus);
		
//		
//		If submit button is pressed clear all the 
//		textfields
		/*
		 * Set text null
		 */
		
		AddMinibus.getfieldMinibusMake().setText("");
		AddMinibus.getFieldMinibusModel().setText("");
		AddMinibus.getfieldTopSpeed().setText("");
		AddMinibus.getRegistration_Number_field().setText("");
		AddMinibus.getfield_daily_hire().setText("");
		AddMinibus.getfield_seat_cap().setText("");
	
		
		
		
		
	}
	
	if (action.equalsIgnoreCase("exit")) {
		System.exit(0);
	}
		
	}
	
}

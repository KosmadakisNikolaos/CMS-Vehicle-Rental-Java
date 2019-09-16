import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddLorryController implements ActionListener { 
private Model model;
private AddLorryView AddLorry;
	
	public AddLorryController(AddLorryView AddLorry, Model model) {
		this.model = model;
		this.AddLorry  = AddLorry;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	String action =	e.getActionCommand();
	
	if(action.equalsIgnoreCase("Submit")) { 
		
		String LorryMakeField = AddLorry.getTextfieldLorryMake();
		String LorryModelField = AddLorry.getTextfieldLorryModel();
		String TopSpeedField = AddLorry.getTextfieldTopSpeed();
		String Registration_NumberField = AddLorry.getTextfield_Registration_Number();
		String daily_hire_rateField =  AddLorry.gettextfield_daily_hire();
		String Load_weight_Field = AddLorry.gettext_Load_weight();
		String Load_capacity_Field = AddLorry.gettext_Load_capacity();
		
		
		
		
		
		Lorry lorry= new Lorry(LorryMakeField, LorryModelField, TopSpeedField, Registration_NumberField, daily_hire_rateField, Load_weight_Field,Load_capacity_Field);
		
		model.addLorry(lorry);
		
//		
//		If submit button is pressed clear all the 
//		textfields
		/*
		 * Set text null
		 */
		
		AddLorry.getfieldLorryMake().setText("");
		AddLorry.getFieldLorryModel().setText("");
		AddLorry.getfieldTopSpeed().setText("");
		AddLorry.getRegistration_Number_field().setText("");
		AddLorry.getfield_daily_hire().setText("");
		AddLorry.getfield_Load_weight().setText("");
		AddLorry.getfield_Load_capacity().setText("");
		
		
		
		
	}
	if (action.equalsIgnoreCase("exit")) {
		System.exit(0);
	}
	
		
	}
	
}

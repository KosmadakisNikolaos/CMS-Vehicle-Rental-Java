import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class AddCarController implements ActionListener { 
private Model model;
private AddCarView AddCar;
	
	public AddCarController(AddCarView AddCar, Model model) {
		this.model = model;
		this.AddCar  = AddCar;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	String action =	e.getActionCommand();
	
	if(action.equalsIgnoreCase("Submit")) { 
		
		String CarMakeField = AddCar.getTextfieldCarMake();
		String CarModelField = AddCar.getTextfieldCarModel();
		String TopSpeedField = AddCar.getTextfieldTopSpeed();
		String Registration_NumberField = AddCar.getTextfield_Registration_Number();
		String daily_hire_rateField =  AddCar.gettextfield_daily_hire();
		String Fuel_typeField = AddCar.gettext_field_Fuel_type();
		String Number_of_doorsField = AddCar.gettextField_Number_of_doors();
		
		
		
		
		Car car= new Car(CarMakeField, CarModelField, TopSpeedField, Registration_NumberField, daily_hire_rateField, Fuel_typeField, Number_of_doorsField);
		
		model.addCar(car);
		
//		
//		If submit button is pressed clear all the 
//		textfields
		
		AddCar.getfieldCarMake().setText("");
		AddCar.getFieldCarModel().setText("");
		AddCar.getfieldTopSpeed().setText("");
		AddCar.getRegistration_Number_field().setText("");
		AddCar.getfield_daily_hire().setText("");
		AddCar.getfield_Fuel_type().setText("");
		AddCar.getField_Number_of_doors().setText("");
		
		
	}
	
	
//	
//	If exit button is pressed clear all the 
//	exit
	//from the application
	
	if (action.equalsIgnoreCase("exit")) {
		System.exit(0);
	}
	
		
	}
	
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddCustomerController implements ActionListener { //This is the controller for the customer. This class is being used when a new customer is to be added.
private Model model;
private AddCustomerView AddCust;
	
	public AddCustomerController(AddCustomerView AddCust, Model model) {
		this.model = model;
		this.AddCust  = AddCust;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	String action =	e.getActionCommand();
	
	if(action.equalsIgnoreCase("Submit")) { 
		
		String userIDField = AddCust.getUserIDFieldtext();
		String FirstnameField = AddCust.getFirstNameFieldtext();
		String UseraddressField = AddCust.getUserddressFieldtext();
		String UserphoneField = AddCust.getPhoneFieldtext();
		String UseremailField =  AddCust.getUserEmailFieldtext();
		String UserDateOfBirthField = AddCust.getDobFieldtext();
		String usernameField = AddCust.getUsernameFieldtext();
		String passwordField = AddCust.getPasswordFieldtext();
		
		
		
		Customer customer = new Customer(userIDField, FirstnameField, UseraddressField, UserphoneField, UseremailField, UserDateOfBirthField, usernameField, passwordField);
		
		model.addCustomer(customer);
		
//		
//		If submit button is pressed clear all the 
//		textfields
		
		AddCust.getUserIDField().setText("");
		AddCust.getFirstNameField().setText("");
		AddCust.getUserAddressField().setText("");
		AddCust.getPhoneField().setText("");
		AddCust.getUserEmailField().setText("");
		AddCust.getDobField().setText("");
		AddCust.getUsernameField().setText("");
		AddCust.getPasswordField().setText("");
		
	}
	
	if (action.equalsIgnoreCase("exit")) {
		System.exit(0);
	}
		
	}
	
	
	
}

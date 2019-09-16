import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StaffController implements ActionListener {
	private Model model;
	private StaffView staff_view;

	public StaffController(StaffView staff_view, Model model) {
		this.model = model;
		this.staff_view = staff_view;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String action = arg0.getActionCommand();
		if (action.equalsIgnoreCase("Add Customer")) {

			AddCustomerView customerGUI = new AddCustomerView();
			AddCustomerController customerController = new AddCustomerController(customerGUI, model);
			customerGUI.addListeners(customerController);
		}
		
		
		
		 if(action.equalsIgnoreCase("Remove Customer")) {
 
			boolean state = model.Remove_Customer(staff_view.getTextField_remove_Customer().getText().toString());
			   
			if (state) {
			    	staff_view.getLb_remove_Customer().setText("Customer Succesfully Removed");
			   
			    }
			    
			    
			    else {
			    	staff_view.getLb_remove_Customer().setText("The user with the current username does not exist!");
			   }
			    
		 }
		 
		 
		 if(action.equalsIgnoreCase("Remove Vehicle")) {
			 
			 boolean state = model.Remove_Vehicle(staff_view.getTextField_remove_vehicle().getText().toString());
			    
			    if (state) {
			    	staff_view.getLb_remove_Vehicle().setText("Car Succesfully Removed");
			   
			    }
			    else {
			    	staff_view.getLb_remove_Vehicle().setText("Vehicle with Current Register No.has not found!");
			   }
			    
			   }
		
		

	if (action.equalsIgnoreCase("Add Car")) {

			AddCarView carGUI = new AddCarView();
			AddCarController carController = new AddCarController(carGUI, model);
			carGUI.addListeners(carController);
		}
	
	if (action.equalsIgnoreCase("Add Lorry")) {

		AddLorryView lorryGUI = new AddLorryView();
		AddLorryController LorryController = new AddLorryController(lorryGUI, model);
		lorryGUI.addListeners(LorryController);
	}
	
	if (action.equalsIgnoreCase("Add Minibus")) {

		AddMinibusView minibusGUI = new AddMinibusView();
		AddMinibusController MinibusController = new AddMinibusController(minibusGUI, model);
		minibusGUI.addListeners(MinibusController);
	}
	
	

	}
}

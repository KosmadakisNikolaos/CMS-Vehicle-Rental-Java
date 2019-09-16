import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class LoginController implements ActionListener { 
						
	/*
	 * controller
	    accepts input and converts it to commands for the model or view
	
	
	  ***
	 */
	
	
	
	private String usrname;
	private String psword;													
	private Model model;
	private LoginView view;
	

	public LoginController(LoginView view, Model model) {
		this.model = model;
		this.view = view;
	}

	@Override
	
//	Below 
//	is the action listener
//	which is responsible for the actions of each button
	public void actionPerformed(ActionEvent e) {
		
		String action = e.getActionCommand();
		if (action.equalsIgnoreCase("exit")) {
			System.exit(0);
		}
		
//		if (action.equalsIgnoreCase("Reset")) {
//			
//		}


		if (action.equalsIgnoreCase("Login")) {
			
			// Staff staff = new Staff("admin", "12345");
			usrname = view.getUsernameText();
			psword = view.getPasswordText();

			ArrayList<Customer> customers = model.Customer_loading();
			ArrayList<Staff> staff = model.StaffLoad();


			boolean validAdmin = false;
			
			
			boolean userExists = false;
			
			Customer cst = null;
			if (!usrname.equals("") || !psword.equals("")) {
				for (Staff staffElement : staff) {
					if (usrname.equals(staffElement.getId()) && psword.equals(staffElement.getPassword())) {
						userExists = true;
						validAdmin = true;
						break;
					}
				}
				
				//the for loop
				///below checks whether the user is a customer
				for (Customer CustomerElement : customers) {
					if (usrname.equals(CustomerElement.getUsername()) && psword.equals(CustomerElement.getPassword())) {
						userExists = true;
						validAdmin = false;
						cst = CustomerElement;
						break;
					}

				}

			}

			//if the user in not valid
			//Print "Please Give a Valid Username and Password"
			
			if (!userExists) {

				System.out.println("Please Give a Valid Username and Password");
			}

			
			else if (userExists && validAdmin) {
				StaffView staffGraphicalUserInterface = new StaffView();
				StaffController ControllerForStaff = new StaffController(staffGraphicalUserInterface, model);
				StaffView.addListeners(ControllerForStaff);
			
			
			} else if (userExists && !validAdmin) {
				CustomerView customerGraphicalUserInterface = new CustomerView(cst);
				CustomerController controllerForCustomer = new CustomerController(customerGraphicalUserInterface, model);
				customerGraphicalUserInterface.addListeners(controllerForCustomer);
			}

			
			
			
			
		}

	}

	
}

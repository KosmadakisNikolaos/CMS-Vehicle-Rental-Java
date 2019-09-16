
public class MyMain {

	//
	// The Model View Controller
	// Pattern Starts from this class
	// Only One main Class
	// Exists

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model model = new Model();
		LoginView loginview = new LoginView(model);
		LoginController logincontroller = new LoginController(loginview, model);

		loginview.addListeners(logincontroller);
	}

}

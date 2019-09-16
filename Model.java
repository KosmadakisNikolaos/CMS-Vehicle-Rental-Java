
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

//
//The model is responsible for managing the data of the application.
//It receives user input 
//from the controller.

public class Model {
	//
	// resizable
	// array
	// implementation

	//
	// Declaring all array lists
	ArrayList<Customer> customers_List = new ArrayList<Customer>();

	ArrayList<Lorry> lorryList = new ArrayList<Lorry>();
	ArrayList<miniBus> minibusList = new ArrayList<miniBus>();
	ArrayList<Staff> staffList = new ArrayList<Staff>();
	ArrayList<Car> carList = new ArrayList<Car>();

	String path = "C:\\Users\\user\\Desktop\\";

	// String path = "C:\\Users\\smasko\\Desktop\\";

	/*
	 * 
	 * Constructor of Class Model
	 * 
	 * 
	 */

	public Model() {
		/*
		 * addCar(new Car("Opel", "Corsa", " 250 ", "NZH3328", " 1.5", "Diesel",
		 * " 4 "));
		 * 
		 */
		// addMinibus(new miniBus("Honda", "Feroza", "200", "KSQ 2341", "4,5", "8"));

		// addLorry(new Lorry("Ford", "Fiesta", "230", "NIA 2315", "66", "110",
		// "250"));

		// Adds new customer

	}

	/*
	 * 
	 * loading customers list
	 * 
	 */
	public ArrayList<Customer> Customer_loading() {

		ArrayList<Customer> ArrayCustomers = null;

		FileInputStream FinStream = null;
		ObjectInputStream ObjInStr = null;

		try {
			FinStream = new FileInputStream(path + "customers.dat");
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
			return new ArrayList<Customer>();
		}
		try {
			ObjInStr = new ObjectInputStream(FinStream);
		} catch (IOException e1) {

			e1.printStackTrace();
		}

		try {
			ArrayCustomers = (ArrayList<Customer>) ObjInStr.readObject();
			for (int i = 0; i < ArrayCustomers.size(); i++) {

				// System.out.println(ArrayCustomers.get(i).getUsername());

			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		try {
			FinStream.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return ArrayCustomers;
	}

	public boolean addCustomer(Customer customer) {

		FileOutputStream FlOuSrtr = null;
		ObjectOutputStream ObjStr = null;

		ArrayList<Customer> CustArray = Customer_loading();
		if (!CustArray.contains(customer)) {
			CustArray.add(customer);

		} else {
			System.out.println("The current user exists!!!");
			return false;
		}

		try {

			// create a new file and
			// add
			// customers

			FlOuSrtr = new FileOutputStream(path + "customers.dat", false);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		try {
			ObjStr = new ObjectOutputStream(FlOuSrtr);
		} catch (IOException e) {

			e.printStackTrace();
			return false;
		}
		try {
			ObjStr.writeObject(CustArray);
		} catch (IOException e) {

			e.printStackTrace();
			return false;
		}

		try {
			ObjStr.close();
		} catch (IOException e) {

			e.printStackTrace();
			return false;
		}
		return true;

	}

	public boolean Remove_Customer(String username) {

		FileOutputStream FlOuSrtr = null;
		ObjectOutputStream ObjStr = null;

		ArrayList<Customer> customers_List = Customer_loading();

		for (Customer cust : customers_List) {

			System.out.println(cust.getUsername());
			if (cust.getUsername().equals(username)) {

				customers_List.remove(cust);

				try {

					// create a new file and
					// add
					// customers

					FlOuSrtr = new FileOutputStream(path + "customers.dat", false);

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				}
				try {
					ObjStr = new ObjectOutputStream(FlOuSrtr);
				} catch (IOException e) {

					e.printStackTrace();
					return false;
				}
				try {
					ObjStr.writeObject(customers_List);
				} catch (IOException e) {

					e.printStackTrace();
					return false;
				}

				try {
					ObjStr.close();
				} catch (IOException e) {

					e.printStackTrace();
					return false;
				}

				return true;
			}

		}
		return false;

	}

	public boolean Remove_Vehicle(String RegistrationNumber) {

		FileOutputStream FlOuSrtr = null;
		ObjectOutputStream ObjStr = null;

		ArrayList<Car> ArrayCar = loadCarlist();

		for (Car car : ArrayCar) {

			System.out.println(car.getRegistrationNumber());
			if (car.getRegistrationNumber().equals(RegistrationNumber)) {

				carList.remove(car);

				try {

					FlOuSrtr = new FileOutputStream(path + "cars.dat", false);

				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				}
				try {
					ObjStr = new ObjectOutputStream(FlOuSrtr);
				} catch (IOException e) {

					e.printStackTrace();
					return false;
				}
				try {
					ObjStr.writeObject(customers_List);
				} catch (IOException e) {

					e.printStackTrace();
					return false;
				}

				try {
					ObjStr.close();
				} catch (IOException e) {

					e.printStackTrace();
					return false;
				}

				return true;
			}

		}
		return false;

	}

	// fetching
	// all cars
	// from the array list car
	public ArrayList<Car> loadCarlist() {

		FileInputStream FlOuSrtr = null;
		ObjectInputStream ObjStr = null;
		ArrayList<Car> ArrayCar = new ArrayList<Car>();

		try {

			// if
			// the file is not found then throw
			// an exception
			FlOuSrtr = new FileInputStream(path + "cars.dat");
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
			return new ArrayList<Car>();
		}
		try {
			ObjStr = new ObjectInputStream(FlOuSrtr);
		} catch (IOException e1) {

			e1.printStackTrace();
		}

		try {
			ArrayCar = (ArrayList<Car>) ObjStr.readObject();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return new ArrayList<Car>();
			// return tempCar;
		}
		try {
			FlOuSrtr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ArrayCar;
	}

	//
	//
	/*
	 * adding car method
	 */

	public boolean addCar(Car cars) {
		FileOutputStream FlOuSrtr = null;
		ObjectOutputStream ObjStr = null;

		ArrayList<Car> ArrayCar = loadCarlist();
		if (!ArrayCar.contains(cars)) {
			ArrayCar.add(cars);
		} else {
			System.out.println("The current car exists");
			return false;
		}
		try {
			FlOuSrtr = new FileOutputStream(path + "cars.dat", false);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
			return false;
		}
		try {
			ObjStr = new ObjectOutputStream(FlOuSrtr);
		} catch (IOException e) {

			e.printStackTrace();
			return false;
		}
		try {
			ObjStr.writeObject(ArrayCar);
		} catch (IOException e) {

			e.printStackTrace();
			return false;
		}

		try {
			ObjStr.close();
		} catch (IOException e) {

			e.printStackTrace();
			return false;
		}
		return true;
	}

	// fetching
	// all lories
	// from the array list Lorry

	public ArrayList<Lorry> loadLorryList() {

		FileInputStream FinStrem = null;
		ObjectInputStream ObOuStr = null;
		ArrayList<Lorry> LorryArray = new ArrayList<Lorry>();
		;

		try {
			FinStrem = new FileInputStream(path + "lorry.dat");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return new ArrayList<Lorry>();
		}
		try {
			ObOuStr = new ObjectInputStream(FinStrem);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			LorryArray = (ArrayList<Lorry>) ObOuStr.readObject();

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return LorryArray;
		}
		try {
			FinStrem.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return LorryArray;

	}

	/*
	 * method implemnted in order to add lorries
	 * 
	 * 
	 * 
	 */

	public boolean addLorry(Lorry lorry) {

		FileOutputStream FinStrem = null;
		ObjectOutputStream ObOuStr = null;

		ArrayList<Lorry> LorryArray = loadLorryList();
		if (!LorryArray.contains(lorry)) {
			LorryArray.add(lorry);
		} else {
			System.out.println("The current Lorry Exists!!");
			return false;
		}
		try {
			FinStrem = new FileOutputStream(path + "lorry.dat", false);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		try {
			ObOuStr = new ObjectOutputStream(FinStrem);
		} catch (IOException e) {

			e.printStackTrace();
			return false;
		}
		try {
			ObOuStr.writeObject(LorryArray);
		} catch (IOException e) {

			e.printStackTrace();
			return false;
		}

		try {
			ObOuStr.close();
		} catch (IOException e) {

			e.printStackTrace();
			return false;
		}
		return true;

	}

	// *
	/*
	 * loading minibuses fetching details from arrayList
	 * 
	 */
	public ArrayList<miniBus> loadMinibusList() {

		FileInputStream Finstream = null;
		ObjectInputStream ObjeInStr = null;
		ArrayList<miniBus> MininusArray = new ArrayList<miniBus>();
		;

		try {
			Finstream = new FileInputStream(path + "minibus.dat");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return new ArrayList<miniBus>();
		}
		try {
			ObjeInStr = new ObjectInputStream(Finstream);
		} catch (IOException e1) {

			e1.printStackTrace();
		}

		try {
			MininusArray = (ArrayList<miniBus>) ObjeInStr.readObject();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
			return MininusArray;
		}
		try {
			Finstream.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return MininusArray;

	}

	public boolean addMinibus(miniBus minibus) {

		FileOutputStream FinStrem = null;
		ObjectOutputStream ObOuStr = null;

		ArrayList<miniBus> MininusArray = loadMinibusList();
		if (!MininusArray.contains(minibus)) {
			MininusArray.add(minibus);
		} else {
			System.out.println("The current minibus Exists!");
			return false;
		}
		try {
			FinStrem = new FileOutputStream(path + "minibus.dat", false);
			// a user is added.
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			return false;
		}
		try {
			ObOuStr = new ObjectOutputStream(FinStrem);
		} catch (IOException e) {

			e.printStackTrace();
			return false;
		}
		try {
			ObOuStr.writeObject(MininusArray);
		} catch (IOException e) {

			e.printStackTrace();
			return false;
		}

		try {
			ObOuStr.close();
		} catch (IOException e) {

			e.printStackTrace();
			return false;
		}
		return true;
	}

	// loading staff
	public ArrayList<Staff> StaffLoad() {

		ObjectInputStream ObInStr = null;
		FileInputStream FInStr = null;

		ArrayList<Staff> StaffList = new ArrayList<Staff>();

		try {
			FInStr = new FileInputStream(path + "staff.dat");
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
			return new ArrayList<Staff>();
		}
		try {
			ObInStr = new ObjectInputStream(FInStr);
		} catch (IOException e1) {

			e1.printStackTrace();
		}

		try {
			StaffList = (ArrayList<Staff>) ObInStr.readObject();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return StaffList;
	}

	// Method boolean implemented
	// in order to create a staff
	//

	public boolean Staff_add(Staff staff) {

		ObjectOutputStream ObOuStr = null;
		FileOutputStream Foustr = null;

		ArrayList<Staff> StaffList = new ArrayList<Staff>();
		StaffList = StaffLoad();

		StaffList.add(staff);

		try {

			Foustr = new FileOutputStream(path + "staff.dat", false);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
			return false;
		}
		try {
			ObOuStr = new ObjectOutputStream(Foustr);
		} catch (IOException e) {

			e.printStackTrace();
			return false;
		}
		try {
			ObOuStr.writeObject(StaffList);
		} catch (IOException e) {

			e.printStackTrace();
			return false;
		}

		try {
			ObOuStr.close();
		} catch (IOException e) {

			e.printStackTrace();
			return false;
		}
		return true;

	}

	// this
	// method is implemented in
	// order to create objects
	// cars
	// customers,lorries
	// minibuses
	// & staff

	public void ObjectCreate() {

		// create stuff

		for (int i = 0; i < staffList.size(); i++) {
			Staff_add(staffList.get(i));
		}

		// create lorry

		for (int i = 0; i < lorryList.size(); i++) {
			addLorry(lorryList.get(i));

		}

		// create customer
		for (int i = 0; i < customers_List.size(); i++) {
			addCustomer(customers_List.get(i));

		}

		// create minibus

		for (int i = 0; i < minibusList.size(); i++) {
			addMinibus(minibusList.get(i));

		}
		// create car

		for (int i = 0; i < carList.size(); i++) {
			addCar(carList.get(i));

		}

	}

}

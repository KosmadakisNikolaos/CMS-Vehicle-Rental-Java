import java.io.Serializable;

public class miniBus extends Vehicle implements Serializable {

	private String siting_capacity;

	public miniBus(String make, String model, String topSpeed, String RegistrationNumber, String dailyHireRate,
			String siting_capacity)

	{

		/*
		 * 
		 * constructor from class vehicle
		 */
		super(make, model, topSpeed, RegistrationNumber, dailyHireRate);
		// TODO Auto-generated constructor stub

		this.siting_capacity = siting_capacity;

	}

	public String getsiting_capacity() {
		return siting_capacity;
	}

	public void siting_capacity(String siting_capacity) {
		this.siting_capacity = siting_capacity;
	}

}

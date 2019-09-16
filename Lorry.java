import java.io.Serializable;

public class Lorry extends Vehicle implements Serializable {

	private String loading_capacity;

	private String load_weight;

	public Lorry(String make, String model, String topSpeed, String RegistrationNumber, String dailyHireRate,
			String loading_capacity, String load_weight)

	{

		/*
		 * 
		 * constructor from class vehicle
		 */
		super(make, model, topSpeed, RegistrationNumber, dailyHireRate);

		this.loading_capacity = loading_capacity;

		this.load_weight = load_weight;
	}

	public String getLoad_weight() {
		return load_weight;
	}

	public void setLoad_weight(String load_weight) {
		this.load_weight = load_weight;
	}

	public String getloading_capacity() {
		return loading_capacity;
	}

	public void setloading_capacity(String loading_capacity) {
		this.loading_capacity = loading_capacity;
	}

}

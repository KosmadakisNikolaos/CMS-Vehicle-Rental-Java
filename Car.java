import java.io.Serializable;

public class Car extends Vehicle implements Serializable {

	
	
	
	
	
	private String fuel_type;
	private String numer_of_doors;

	public Car(String make, String model, String topSpeed,String RegistrationNumber, String dailyHireRate, String fuel_type, String number_of_doorsField)
	
	/*
	 * 
	 * constructor
	 * from 
	 * class
	 * vehicle
	 */
	{
		super(make, model,topSpeed,RegistrationNumber,dailyHireRate);
		
		
		this.fuel_type = fuel_type;
		this.numer_of_doors = number_of_doorsField;
	}

	

	

	public String getFuel_type() {
		return fuel_type;
	}

	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}

	public String getnumer_of_doors() {
		return numer_of_doors;
	}

	public void setnumer_of_doors(String numer_of_doors) {
		this.numer_of_doors = numer_of_doors;
	}

	
	
	
}

import java.io.Serializable;

public class Vehicle implements Serializable {
	private String make;
	private String model;
	private String topSpeed;
	private String RegistrationNumber;
	private String dailyHireRate;
	

	
	
	
	public Vehicle(String make, String model,String topSpeed,String RegistrationNumber, String dailyHireRate) {
	
		this.make = make;
		this.model = model;
		this.topSpeed = topSpeed;
		this.RegistrationNumber = RegistrationNumber;
		this.dailyHireRate = dailyHireRate;
		
	}
	
	
	
	public String getdailyHireRate() {
		return dailyHireRate;
	}


	public void setdailyHireRate(String dailyHireRate) {
		this.dailyHireRate = dailyHireRate;
	}




	public String getRegistrationNumber() {
		return RegistrationNumber;
	}


	public void setRegistrationNumber(String RegistrationNumber) {
		this.RegistrationNumber = RegistrationNumber;
	}


	public String gettopSpeed() {
		return topSpeed;
	}


	public void settopSpeed(String topSpeed) {
		this.topSpeed = topSpeed;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	
	
	
}



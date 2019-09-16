import java.io.Serializable;

public class Staff implements Serializable {
	private String id, password;

	// constructor for class staff
	Staff(String id, String password) {

		this.id = id;
		this.password = password;

	}

	/***
	 * 
	 * 
	 * 
	 * 
	 * @return
	 */

	/*
	 * 
	 * setter and getters
	 * 
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

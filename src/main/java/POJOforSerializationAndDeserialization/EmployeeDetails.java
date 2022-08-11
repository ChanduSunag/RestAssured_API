package POJOforSerializationAndDeserialization;

public class EmployeeDetails {

	//Step 1: Declare all the variables as global
	String eName;
	String eId;
	int phone;
	String email;
	String adress;

	//Step 2: Use constructor to Initialize
	public EmployeeDetails(String eName, String eId, int phone, String email, String adress) {
		this.eName = eName;
		this.eId = eId;
		this.phone = phone;
		this.email = email;
		this.adress = adress;
	}
	
	// This is for deserialization
	public EmployeeDetails() {
		
	}

	//Step 3: Use getter and setter to access
	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {       
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}


}

package POJOforSerializationAndDeserialization;

public class EmployeeDetailsWithObject {
	
	//Step 1: Declare all the variables as global
		String ename;
		String eId;
		int phone[];
		String email;
		Object Spouse;
		String adress;
		
		//Step 2: Use constructor to Initialize
		public EmployeeDetailsWithObject(String ename, String eId, int[] phone, String email, Object spouse,
				String adress) {
			this.ename = ename;
			this.eId = eId;
			this.phone = phone;
			this.email = email;
			this.Spouse = spouse;
			this.adress = adress;
		}
		
		//This is for deserialization
		public  EmployeeDetailsWithObject( ) {
			
		}
		
		//Step 3: Use getter and setter to access
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public String geteId() {
			return eId;
		}
		public void seteId(String eId) {
			this.eId = eId;
		}
		public int[] getPhone() {
			return phone;
		}
		public void setPhone(int[] phone) {
			this.phone = phone;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Object getSpouse() {
			return Spouse;
		}
		public void setSpouse(Object spouse) {
			Spouse = spouse;
		}
		public String getAdress() {
			return adress;
		}
		public void setAdress(String adress) {
			this.adress = adress;
		}

}

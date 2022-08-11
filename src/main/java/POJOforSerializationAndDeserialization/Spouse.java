package POJOforSerializationAndDeserialization;

public class Spouse {
	
	//Step1 : Declare all the variables as global
	String name;
	int age;
	String company;
	
	//Step 2: Use constructor to Initialize
	public Spouse(String name, int age, String company) {
		this.name = name;
		this.age = age;
		this.company = company;
	}

	//Step 3: Use getter and setter to access
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	

}

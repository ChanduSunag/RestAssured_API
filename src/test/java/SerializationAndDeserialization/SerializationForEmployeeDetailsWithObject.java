package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetailsWithObject;
import POJOforSerializationAndDeserialization.Spouse;

public class SerializationForEmployeeDetailsWithObject {
	
	int phone[] = {123456,987456};
	
	@Test
	public void serializeEmpDetailsWithObject() throws JsonGenerationException, JsonMappingException, IOException {
		
		//Step 1: create object of pojo and provide values
		Spouse sp=new Spouse("abc", 25, "Infosys");
		EmployeeDetailsWithObject emp1=new EmployeeDetailsWithObject("pqrs", "ty123", phone, "abjs@gmail.com", sp, "Mysore");
		
		//Step 2: create object of Object Mapper  from Jackson Mapper
		ObjectMapper obj=new ObjectMapper();
		
		//Step 3: write data into json file
		obj.writeValue(new File("./EmployeeDetailsWithObject.json"), emp1);
		
		
		
	}

}

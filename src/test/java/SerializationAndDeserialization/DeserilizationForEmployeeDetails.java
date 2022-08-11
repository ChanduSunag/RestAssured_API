package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetails;

public class DeserilizationForEmployeeDetails {

	@Test
	public void deserializeEmpDetailsTest() throws JsonParseException, JsonMappingException, IOException {
		
		//Step 1: Create object of Object Mapper - jackson Mapper
		ObjectMapper obj=new ObjectMapper();
		
		//Step 2: Read the value from Object Maapper
		 EmployeeDetails emp2 = obj.readValue(new File(".\\EmployeeDetails.json"), EmployeeDetails.class);
		
		//Step 3: Fetch the required value from class
		System.out.println(emp2.getAdress());
		System.out.println(emp2.getPhone());
	}
}

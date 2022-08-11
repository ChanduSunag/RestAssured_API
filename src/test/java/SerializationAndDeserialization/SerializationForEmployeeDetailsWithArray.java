package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetailsWithArray;

public class SerializationForEmployeeDetailsWithArray {

	int phone[] = {123456,987456};
	String email[] = {"abc@gmail.com","xyz@gmail.com"};
	
	
	@Test
	public void serailizeEmpDetailsWithArrayTest() throws JsonGenerationException, JsonMappingException, IOException {
		
		//Step 1: create object of pojo and provide values
		EmployeeDetailsWithArray emp1=new EmployeeDetailsWithArray("sunag", "ty001", phone, email, "Bengaluru");
		
		//Step 2: create object of object Mapper - jackson mapper
		ObjectMapper obj=new ObjectMapper();
		
		//Step3 : write data into json file
		obj.writeValue(new File("./EmployeeDetailsWithArray.json"), emp1);
		
		
		
	}
	
	
}

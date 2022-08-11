package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetails;

public class SerailizationForEmployeeDetails {
	
@Test
public void serailizeEmpDetailsTest() throws JsonGenerationException, JsonMappingException, IOException  {

	//Step 1: create object of pojo and provide values
	EmployeeDetails emp1=new EmployeeDetails("Chandan", "ty007", 007, "chandusunag7@gmail.com", "Hassan");
	
	//Step 2: create object of Object Mapper  from Jackson Mapper
	ObjectMapper obj=new ObjectMapper();
	
	//Step 3: write data into json file
	obj.writeValue(new File("./EmployeeDetails.json"), emp1);
}
}
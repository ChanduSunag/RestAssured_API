package SerializationAndDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import POJOforSerializationAndDeserialization.EmployeeDetailsWithObject;

public class DeserializationForEmployeeDetailsWithObject {

	@Test
	public void deserializeEmpDetailsWithObject() throws JsonParseException, JsonMappingException, IOException {

		ObjectMapper obj=new ObjectMapper();

		EmployeeDetailsWithObject emp2 = obj.readValue(new File(".\\EmployeeDetailsWithObject.json"), EmployeeDetailsWithObject.class);

		System.out.println(emp2.getSpouse());
		System.out.println(emp2.getEmail());

	}

}

package BasicCRUDoperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DeleteProjectTest {
	
	@Test
	public void deleteProjectTest() {
		
		//Step 1: Create the required data

		//Step 2: Send the request
	    Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_1412");

		//Step 3: validate the response
	    resp.then().log().all();

		
	}

}

package BasicCRUDoperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAllProjectsTest {

	@Test
	public void getAllProjecTest( ) {

		//Step 1: Create the required data

		//Step 2: Send the request
		Response resp = RestAssured.get("http://localhost:8084/projects");

		//Step 3: validate the response
		resp.then().log().all();

	}

}

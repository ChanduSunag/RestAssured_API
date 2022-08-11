package RMG_Yantra;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectWithFormDataTest {

	@Test
	public void createProjectWithFormDataTest() {

		//Create the required data and send the request
		RequestSpecification req = RestAssured.given();
		req.formParam("CreatedBy","Chandan");
		req.formParam("projectName", "rmg");
		req.formParam("status", "On Going");
		req.formParam("teamSize", 25);
		req.contentType(ContentType.JSON);
		Response resp = req.post("http://localhost:8084/addProject");

		//Validate the response
		resp.then().log().all();

	}

}

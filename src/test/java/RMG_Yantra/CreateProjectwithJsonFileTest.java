package RMG_Yantra;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectwithJsonFileTest {

	@Test
	public void  createProjectwithJsonFileTest() {

		//Step 1: create the required data


		//Step 2: Send the request
		RequestSpecification req = RestAssured.given().body(new File(".\\rmgy.json")).contentType(ContentType.JSON);
		Response resp = req.post("http://localhost:8084/addProject");

		//Step 3: Validate the response
		resp.then().log().all();

	}

}

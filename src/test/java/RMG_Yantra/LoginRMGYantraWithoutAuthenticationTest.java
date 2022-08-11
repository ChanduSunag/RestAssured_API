package RMG_Yantra;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class LoginRMGYantraWithoutAuthenticationTest {

	@Test
	public void loginRMGYantraWithoutAuthenticationTest() {

		//Step 1: Create the required data


		//Step 2: Send the request
		RequestSpecification req = RestAssured.given().auth().basic(" ", " ").contentType(ContentType.JSON);
		Response resp = req.get("http://localhost:8084/login");

		//Step 3: Validate the response
		resp.then().log().all();
	}

}

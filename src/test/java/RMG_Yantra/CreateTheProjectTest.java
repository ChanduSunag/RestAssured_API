package RMG_Yantra;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateTheProjectTest {

	@Test
	public void createTheProjectTest() {

		//Step 1: Create the required data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "rmg");
		jobj.put("projectName", "rmgProject");
		jobj.put("status", "created");
		jobj.put("teamSize", 15);

		//Step 2: Send the request
		RequestSpecification req = RestAssured.given().body(jobj).contentType(ContentType.JSON);
		Response resp = req.post("http://localhost:8084/addProject");

		//Step 3: Validate the response
		resp.then().log().all();

	}

}

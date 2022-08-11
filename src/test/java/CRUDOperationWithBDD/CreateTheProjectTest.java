package CRUDOperationWithBDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibrary.JavaLibrary;
import io.restassured.http.ContentType;

public class CreateTheProjectTest {

	@Test
	public void createTheProjectTest() {

		baseURI = "http://localhost";
		port = 8084;

		JavaLibrary jLib=new JavaLibrary();
		int random = jLib.getRandomNumber();

		//Step 1: Create the required data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Chandan");
		jobj.put("projectName", "CS"+ random);
		jobj.put("status", "On Going");
		jobj.put("teamSize", 5);

		//Step 2: Send the request
		given()
		   .body(jobj)
		   .contentType(ContentType.JSON)
		   .when()
		   .post("/addProject")

		//Step 3: Validate the response
		.then()
		   .assertThat().statusCode(201)
		   .log().all();
	}
}

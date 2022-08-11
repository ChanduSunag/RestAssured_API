package BasicCRUDoperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibrary.JavaLibrary;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectTest {

	@Test
	public void updateProjectTest() {

		JavaLibrary jLib=new JavaLibrary();
		int random = jLib.getRandomNumber();

		//Step 1: Create the required data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Chandan");
		jobj.put("projectName", "Inhalt"+random);
		jobj.put("status", "On Going");
		jobj.put("teamSize", 7);

		//Step 2: Send the request
		RequestSpecification req= RestAssured.given().body(jobj).contentType(ContentType.JSON);
		Response resp = req.put("http://localhost:8084/projects/TY_PROJ_1412");

		//Step 3: Validate the response
		resp.then().log().all();







	}

}

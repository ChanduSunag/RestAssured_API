package BasicCRUDoperations;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibrary.JavaLibrary;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateProjectTest {

	@Test
	public void createProjectTest()
	{

		//Create random number
		JavaLibrary jLib = new JavaLibrary();
		int random = jLib.getRandomNumber();

		//Step 1: Create the required data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Chandan");
		jobj.put("projectName", "Inhalt"+random);
		jobj.put("status", "Created");
		jobj.put("teamSize", "7");

		//Step 2: Send the request
		RequestSpecification request = RestAssured.given();
		request.body(jobj);
		request.contentType(ContentType.JSON);

		Response resp = request.post("http://localhost:8084/addProject");

		//Step 3: Validate the request
		resp.then().log().all();
		//long rj = resp.getTimeIn(TimeUnit.MILLISECONDS);
		//System.out.println(rj);
	}


}

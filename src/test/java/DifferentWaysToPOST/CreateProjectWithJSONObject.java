package DifferentWaysToPOST;

import  static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibrary.JavaLibrary;
import io.restassured.http.ContentType;

public class CreateProjectWithJSONObject {
	
	@Test
	public void createProjectWithJSONObject() {
		
		baseURI = "http://localhost";
		port = 8084;

		JavaLibrary jLib=new JavaLibrary();
		int random = jLib.getRandomNumber();
		
		//Step 1: Create data
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "chandan");
		jobj.put("projectName", "tyss"+random);
		jobj.put("status", "created");
		jobj.put("teamsize", 15);
		
		given()
		  .body(jobj)
		  .contentType(ContentType.JSON)
		
		//Step 2: SEnd the request and validate response
		.when()
		  .post("/addProject")
		  
		.then()
		  .assertThat().statusCode(201).log().all();
		
		
		
		
	}

}

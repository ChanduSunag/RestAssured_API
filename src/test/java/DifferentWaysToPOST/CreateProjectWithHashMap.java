package DifferentWaysToPOST;


import java.util.HashMap;

import org.testng.annotations.Test;

import GenericLibrary.JavaLibrary;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectWithHashMap {
	
	@Test
	public void createProjectWithHashMap() {
		
		baseURI = "http://localhost";
		port = 8084;

		JavaLibrary jLib=new JavaLibrary();
		int random = jLib.getRandomNumber();
		
		//Step 1: Create data
		HashMap map=new HashMap();
		map.put("createdBy", "Chandan");
		map.put("projectName", "Inhalt"+random);
		map.put("status", "On Going");
		map.put("teamSize", 15);
		
		given()
		  .body(map)
		  .contentType(ContentType.JSON)
		  
		//Step 2: Send the request and validate response
		.when()
		  .post("/addProject")
		  
		.then()
		  .assertThat().statusCode(201).log().all();
		
		
		
		
	}

}

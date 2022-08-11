package DifferentWaysToPOST;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import GenericLibrary.JavaLibrary;
import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;

public class CreateProjectWithPOJO {
	
	@Test
	public void createProjectWithPOJO() {
		
		baseURI = "http://localhost";
		port = 8084;

		JavaLibrary jLib=new JavaLibrary();
		int random = jLib.getRandomNumber();
		
		//Step 1: create data
		ProjectLibrary pLib=new ProjectLibrary("chandan", "tyss"+random, "created", 22);
		
		//Step 2: Send the request and validate the response
		given()
		  .body(pLib)
		  .contentType(ContentType.JSON)
		  
		.when()
		  .post("/addProject")
		
		.then()
		  .assertThat().statusCode(201).log().all();
	}

}

package DifferentWaysToPOST;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import GenericLibrary.JavaLibrary;
import io.restassured.http.ContentType;

public class CreateProjectWithFormParameter {
	
	@Test
	public void createProjectWithFormParameter() {
		
		baseURI = "http://localhost";
		port = 8084;

		JavaLibrary jLib=new JavaLibrary();
		int random = jLib.getRandomNumber();
		
		//Step 1: create data
		given()
		 .formParam("createdBy", "Chandan")
		 .formParam("projectName", "tyss"+random)
		 .formParam("status", "created")
		 .formParam("teamSize", 25)
		 
		 .contentType(ContentType.JSON)
		 
		 //Step 2: Send the request and validate the response
		 .when()
		   .post("/addProject")
		   
		 .then()
		   .assertThat().statusCode(500).log().all();
	    
	}

}

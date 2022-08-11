package DifferentWaysToPOST;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProjectWithJSONFile {
	
	@Test
	public void createProjectWithJSONFile() {
		
		baseURI = "http://localhost";
		port = 8084;
		
		//Step 1: Create data
		File file=new File(".\\src\\test\\resources\\RequestData.json");
		
		//Step 2: Send the request and validate response
		given()
		  //.body(new File(".\\src\\test\\resources\\RequestData.json"))
		  .body(file)
		  .contentType(ContentType.JSON)
		  
		.when()
		  .post("/addProject")
		  
        .then()
          .assertThat().statusCode(201).log().all();
		
		
	}

}

package ParameterTesting;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.assertThat;

import org.testng.annotations.Test;

public class PathParameter {
	
	@Test
	public void pathParameterTest() {
		
		baseURI = "http://localhost";
		port = 8084;
		
		//Step 1: Create pre-requisites
		given()
		  .pathParam("pId", "TY_PROJ_1404")
		  
		//Step 2: send the request and validate the response  
		.when()
		  .get("/projects/{pId}")
		  
		.then()
		  .assertThat().statusCode(200).log().all();
	}

}

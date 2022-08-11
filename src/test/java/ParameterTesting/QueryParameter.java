package ParameterTesting;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class QueryParameter {
	
	@Test
	public void queryParameterTest() {
		
		baseURI = "https://reqres.in/";
		 
		//Step 1: Create the data
		given()
		  .queryParam("page", 3)
		
		//Step 2: Send the request and validate the response  
		.when()
		  .get("/api/users")
		  
		.then()
		  .assertThat().statusCode(200).log().all();
		
	}
	

}

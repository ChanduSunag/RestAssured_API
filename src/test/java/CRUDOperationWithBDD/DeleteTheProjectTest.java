package CRUDOperationWithBDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteTheProjectTest {
	
	@Test
	public void deleteTheProjectTest() {
		
		baseURI = "http://localhost";
		port = 8084;
		
		//Step 1: Create the required data
	
		//Step 2: Send the request
		when()
		   .delete("/projects/TY_PROJ_1202")
		   
		//Step 3: Validate the response
		.then() 
		   .assertThat().statusCode(204)
		   .log().all();
		   
		
		
	}

}

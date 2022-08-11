package CRUDOperationWithBDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibrary.JavaLibrary;
import io.restassured.http.ContentType;

public class UpdateTheProjectTest {
	
	@Test
	public void updateTheProjectTest() {
		
		baseURI = "http://localhost";
		port = 8084;
		
		JavaLibrary jLib=new JavaLibrary();
		int random = jLib.getRandomNumber();
		
		//Step 1: Create the required data
		JSONObject jobj=new JSONObject();
		jobj.put("status", "created");
		jobj.put("teamSize", 22);
		
		//Step 2: Send the request
		given()
		   .body(jobj)
		   .contentType(ContentType.JSON)
		   
		.when()  
		   .put("/projects/TY_PROJ_1202")
		   
		  
		//Step 3: Validate the response
		.then()
		   .assertThat().statusCode(200)
		   .log().all();
		   
		
		
	}

}

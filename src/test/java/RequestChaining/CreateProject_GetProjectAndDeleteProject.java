package RequestChaining;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import GenericLibrary.JavaLibrary;
import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CreateProject_GetProjectAndDeleteProject {
	
	@Test
	public void createGetAndDeleteProject() {

		baseURI = "http://localhost";
		port = 8084;
	JavaLibrary jLib = new JavaLibrary();
	
		
		//Create the data
		ProjectLibrary pLib=new ProjectLibrary("Chandan", "CS"+jLib.getRandomNumber(), "On Going", 14);
		
		//Send the POST request
		                   Response resp = given()
		                    .body(pLib)
		                    .contentType(ContentType.JSON)
		  
		               .when()
		                   .post("/addProject");
		                    
		                
		                    
		
		
		
		
		//Capture the project ID from the response body using json path
		String proID = resp.jsonPath().get("projectId");
		System.out.println(proID);
		
		
		//Use the captured projectId in GET request
		given()
		  .pathParam("pId", proID)
		  
		.when()
		  .get("/projects/{pId}")
		  
		.then()
		  .assertThat().statusCode(200).log().all();
		  
		//Use the projectId in DELETE request
		
		given()
		  .pathParam("pId", proID)
		  
		.when()
		  .delete("/projects/{pId}")
		  
		.then()
		  .assertThat().statusCode(204).log().all();
		  

	
	}

}

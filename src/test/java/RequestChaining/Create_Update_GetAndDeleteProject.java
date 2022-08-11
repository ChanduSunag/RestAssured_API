package RequestChaining;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import GenericLibrary.JavaLibrary;
import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Create_Update_GetAndDeleteProject {
	
	
	@Test
	public void create_Update_GetAndDeleteProjectTest() {
		
		baseURI = "http://localhost:8084";
		JavaLibrary jLib =new JavaLibrary();
		
	//Get Method
		ProjectLibrary pLib=new ProjectLibrary("chandan", "CS"+jLib.getRandomNumber(), "created", 12);
		
		Response resp = given() 
		  .body(pLib)
		  .contentType(ContentType.JSON)
		  
		.when()
		  .post("/addProject");
		
		resp.then().log().all();
		
	String proId = resp.jsonPath().get("projectId");
	String proName = resp.jsonPath().get("projectName");
	System.out.println(proId);
	
	//Update the project
	ProjectLibrary pLib1=new ProjectLibrary("chandan", proName , "Completed", 12);
	
	given()
	  .pathParam("pId", proId)
	  .body(pLib1)
	  .contentType(ContentType.JSON)
	  
	  .when()
	    .put("/projects/{pId}")
	    
	 .then()
	   .log().all();
	
	//Get project
	given()
	  .pathParam("pId", proId)
	  
	  .when() 
	    .get("/projects/{pId}")
	    
	    .then()
	      .log().all();
	
	//Delete project
	
	given()
	  .pathParam("pId", proId)

	  .when()
	    .delete("/projects/{pId}")
	    
	    .then()
	      .log().all();
	

	
		
	}

}

package ResponseValidation;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class StaticResponseValidation {
	
	@Test
	public void staticResponseValidation()
	{
		baseURI ="http://localhost:8084";
		String expData = "TY_PROJ_1002";
		
		//Step 1: send request and validate response
		
		
		 Response res = when()
		                  .get("/projects");
		 
		 String actData = res.jsonPath().get("[0].projectId");
		 System.out.println(actData);
		 
		 Assert.assertEquals(expData, actData);
		 
		
	}
	
	
	
	
	

}

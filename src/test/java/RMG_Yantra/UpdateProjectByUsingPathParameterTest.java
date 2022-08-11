package RMG_Yantra;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class UpdateProjectByUsingPathParameterTest {
	
	@Test
	public void updateProjectByUsingPathParameterTest() {
		
		RequestSpecification req = RestAssured.given();
		req.pathParam("projectId", "TY_PROJ_1411");
		req.contentType(ContentType.JSON);
		
		Response resp = req.get("http://localhost:8084/addProject/{projectId}");
		
		resp.then().log().all();
	
	}

}

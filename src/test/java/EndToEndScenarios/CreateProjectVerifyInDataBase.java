package EndToEndScenarios;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import GenericLibrary.BaseAPIClass;
import GenericLibrary.EndPointsLibrary;
import POJOClasses.ProjectLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.sql.SQLException;

public class CreateProjectVerifyInDataBase extends BaseAPIClass {
	
	@Test
	public void createProjectVerifyInDB() throws SQLException {
		
		
		ProjectLibrary pLib = new ProjectLibrary("Chandan", "CS"+jLib.getRandomNumber(), "OnGoing", 17);
		
	    Response resp = given()
		               .body(pLib)
		               
		               .contentType(ContentType.JSON)
		  
		               .when()
		               .post(EndPointsLibrary.creatProject);
		
		
		String expData = rLib.getJsonData(resp,"projectId");
        Reporter.log(expData,true);
		
	/*	given()
		  .pathParam("pId", jsonData)
		  .when()
		  .get(EndPointsLibrary.getSingleProject+"{pId}")
		  .then().assertThat().statusCode(200).log().all();*/
		
		String query = "select * from project;";
		String actData = dLib.readDataFromDBAndValidate(query, 1, expData);
		
		Assert.assertEquals(expData, actData);
		
	}

}

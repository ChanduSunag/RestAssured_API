package Authentication;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerTokenTest {
	
	@Test
	public void bearerTokenTest() {
		
		//Step 1: Create pre requisites
		HashMap map=new HashMap();
		map.put("name", "CS123");
		map.put("description", "API Framework");
		
		given()
		  .auth()
		  .oauth2("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")
		  .body(map)
		  .contentType(ContentType.JSON)

		.when()
		  .post("https://api.github.com/user/repos")
		  
		.then()
		  .log().all();
		
	}

}

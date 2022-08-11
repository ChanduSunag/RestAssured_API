package Authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Oauth2_0 {
	
	@Test
	public void oauth2_0() {
		
		baseURI = "http://coop.apps.symfonycasts.com";
		
		//Generate the token
	Response resp = given()
		  .formParam("client_id", "Inhalt")
		  .formParam("client_secret", "064bdf0d389f141e154da36333ebed39")
		  .formParam("grant_type", "client_credentials")
		  .formParam("redirect_uri", "http://chandan.com")
		  .formParam("code", "authorization_code")
		  
		  .when()
		    .post("/token"); 
		    
		   String token = resp.jsonPath().get("access_token");
		   System.out.println(token);
		   
		   
		   given()
		     .auth()
		     .oauth2(token)
		     .pathParam("User Id", 3664)
		     
		     .when()
		       .post("/api/{User Id}/chickens-feed")
		       
		     .then().log().all();  
	
	
		
	}

}

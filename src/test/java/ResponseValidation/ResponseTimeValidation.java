package ResponseValidation;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class ResponseTimeValidation {
	
	@Test
	public void responseTimeValidation()
	{
		baseURI = "http://localhost:8084";
		long expTime = 500;
		
		//Step 1: send the request
		Response resp = when().get("/projects");
		
		//Step 2: capture the response
		long time = resp.getTime();
		if(time<=expTime)
		{
			System.out.println("time validated"+time);
		}
		else
		{
			System.out.println("time not validated"+time);
		}
		
		
		//
	}

}

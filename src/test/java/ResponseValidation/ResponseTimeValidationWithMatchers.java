package ResponseValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ResponseTimeValidationWithMatchers {
	
	@Test
	public void responseTimeValidationWithMatchers()
	{
		basePath = "http://localhost:8084";
		
		//Step 1: send the request and validate response
		when()
		  .get("/projects")
		.then()
		   .assertThat().time(Matchers.lessThan(8000L), TimeUnit.MILLISECONDS);
		
	}

}

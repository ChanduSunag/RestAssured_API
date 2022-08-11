package ResponseValidation;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class DynamicResponseValidation {
	
	@Test
	public void dynamicResponseValidation()
	{
		baseURI = "http://localhost:8084";
		String expData = "TY_PROJ_1002";
		
		//Step 1: send the request
		Response resp = when().get("/projects");
		
		//Step 2: capture the response by writing json path
		boolean flag = false;
		List<String> list = resp.jsonPath().get("projectId");
		for(String data:list)
		{
			if(data.equalsIgnoreCase(expData))
			{
				System.out.println(data);
				flag = true; // flag rising
				break;
			}
		}
		
		//step 3: validate 
		Assert.assertTrue(flag);
		
		
		
	}

}

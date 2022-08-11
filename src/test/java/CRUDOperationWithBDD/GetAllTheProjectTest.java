package CRUDOperationWithBDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetAllTheProjectTest {

	@Test
	public void getAllTheProjectTest() {


		baseURI = "http://localhost";
		port = 8084;

		//Step 2: Send the request
		when()
		   .get("/projects")

		//Step 3: Validate the response
		.then()
		   .assertThat().statusCode(200)
		   .log().all();
	}

}

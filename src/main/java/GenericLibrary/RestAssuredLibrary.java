package GenericLibrary;

import static io.restassured.RestAssured.*;

import io.restassured.response.Response;

/**
 * This class contains RestAssured specific reusable methods
 * @author Chandan
 *
 */

public class RestAssuredLibrary {
	
	/**
	 * This method will get json data thru json path from respone body
	 * @param response
	 * @param path
	 * @return
	 */
	public String getJsonData(Response response, String path) {
		String jsonData = response.jsonPath().get(path);
		return jsonData;
	}

}

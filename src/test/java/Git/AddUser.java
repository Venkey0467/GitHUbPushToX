package Git;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class AddUser {

	@Test
	public void CreateUser()
	{
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "    \"name\": \"boss\",\r\n"
					+ "    \"role\": \"qa\",\r\n"
					+ "    \"age\": 31,\r\n"
					+ "    \"city\": \"hyd\"\r\n"
					+ "}")
		.when()
			.post("http://localhost:3000/posts/")
		.then()
			.log().all();
	}
}

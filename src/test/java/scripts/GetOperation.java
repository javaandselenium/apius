package scripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetOperation {
	@Test
	public void getallProjects() {
		Response res=RestAssured.get("http://localhost:3000/posts");
	res.prettyPrint();
	
	}

}

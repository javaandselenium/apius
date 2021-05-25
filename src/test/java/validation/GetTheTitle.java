package validation;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
public class GetTheTitle {
	@Test
	public void test0() {
		 Object data = when()
		.get("http://localhost:3000/posts")
		.jsonPath().get("[4].title");
		System.out.println(data);
	}

}

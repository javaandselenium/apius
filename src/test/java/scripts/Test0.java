package scripts;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test0 {
	@Test
	public void demo() {
		when()
		.get("http://localhost:3000/posts")
		.then()
		.log().all()
		.assertThat().statusCode(200)
		.assertThat().contentType(ContentType.JSON);
		
	}
}

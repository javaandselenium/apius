package validation;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class HeaderValidation {
	@Test
	public void validateHeader() {
		when()
		.get("http://localhost:3000/posts")
		.then()
		.log().all()
		.assertThat().statusCode(200)
		.and()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().header("Pragma","no-cache")
		.assertThat().header("X-Powered-By","Express");
	}
}

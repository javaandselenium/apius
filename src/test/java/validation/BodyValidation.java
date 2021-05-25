package validation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class BodyValidation {
	@Test
	public void validateresponse() {
	when()
	.get("http://localhost:3000/posts")
	.then()
	.log().all()
	.and().body("[4].title",Matchers.equalTo("APItesting7"));
	
	
	
	}

}

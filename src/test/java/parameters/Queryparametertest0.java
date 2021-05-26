package parameters;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class Queryparametertest0 {
	@Test
	public void demo() {
		
		given()
		.auth().oauth2("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")
		.queryParam("q","seleniumus")
		.queryParam("order","asc")
		.when()
		.get("https://api.github.com/search/repositories")
		.then()
		.log().all();
	}

}

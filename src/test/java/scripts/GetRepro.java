package scripts;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetRepro {
	@Test
	public void getrequest() {
		given()
		.auth().oauth2("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")
		.when()
		.get("https://api.github.com/user/repos")
		.then()
		.log().all();
	}

}

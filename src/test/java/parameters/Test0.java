package parameters;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Test0 {
	@Test
	public void togetrepro() {
		
	given()
	.auth().oauth2("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")
	.pathParam("ownername","javaandselenium")
	.pathParam("reponame","seleniumus")
	.when()
	.get("https://api.github.com/repos/{ownername}/{reponame}")
	.then()
	.log().all();
}
}
package parameters;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class Pathparaameter {

	@Test
	public void togetrepro() {
		
	given()
	.auth().oauth2("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")
	.pathParam("ownerName","javaandselenium")
	.pathParam("reproName","Demojenkinsadvanceselnium6");
	when()
	.get("https://api.github.com/repos/{ownerName}/{reproName}")
	.then()
	.log().all();
		
	}
}

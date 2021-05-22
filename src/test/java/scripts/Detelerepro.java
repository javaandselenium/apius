package scripts;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Detelerepro {
	@Test
	public void deleterequest() {
		given()
		.auth().oauth2("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")
		
		.when()
		.delete("https://api.github.com/repos/javaandselenium/Therepro123")
		
		.then()
		.log().all();
		
		
	}

}

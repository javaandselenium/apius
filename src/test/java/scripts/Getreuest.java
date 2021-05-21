package scripts;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Getreuest {
	@Test
	public void demo() {
		when()
		.get("http://localhost:3000/posts")
		.then()
		.log().all();
		
	}

}

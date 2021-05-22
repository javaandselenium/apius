package scripts;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
public class UpdateTherepro {
	@Test
	public void update() {
		JSONObject j=new JSONObject();
		j.put("private",false);
		
		given()
		.auth().oauth2("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")
		.contentType(ContentType.JSON)
		.body(j.toJSONString())
		
		.when()
		.patch("https://api.github.com/repos/javaandselenium/Therepro123")
		.then()
		.log().all();
		
		
		
	}

}

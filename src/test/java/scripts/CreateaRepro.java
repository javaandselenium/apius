package scripts;
import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateaRepro {
@Test
public void postrequest() {
	JSONObject jobj=new JSONObject();
	jobj.put("name","Therepro123");
	
	
	given()
	.contentType(ContentType.JSON)
	.body(jobj.toJSONString())
	.auth().oauth2("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")
	.when()
	.post("https://api.github.com/user/repos")
	.then()
	.log().all();
	
}
}

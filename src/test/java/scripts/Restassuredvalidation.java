package scripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;

public class Restassuredvalidation {
	@Test
	public void getprojectval() {
		Response res = RestAssured.get("http://localhost:3000/posts");
	System.out.println(res.getStatusCode());
	
	
	
	System.out.println(res.contentType());
	
	ValidatableResponse resval = res.then();
	
	resval.assertThat().statusCode(200);
	resval.assertThat().contentType(ContentType.JSON);
	resval.log().all();
	
	
	}
}

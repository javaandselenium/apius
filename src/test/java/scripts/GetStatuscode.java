package scripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import junit.framework.Assert;

public class GetStatuscode {
	@Test
	public void getprojectval() {
		Response res = RestAssured.get("http://localhost:3000/posts");
	System.out.println(res.getStatusCode());
	
	Assert.assertEquals(201,res.getStatusCode());
	
	System.out.println(res.contentType());
	
	ValidatableResponse resval = res.then();
	resval.log().all();
	
	
	}

}

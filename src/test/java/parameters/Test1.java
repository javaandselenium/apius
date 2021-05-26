package parameters;

import org.testng.annotations.Test;

import io.restassured.response.Response;


import static io.restassured.RestAssured.*;

public class Test1 {
	@Test
	public void propertytransfer(){
	 Response resp = when()
	 .get("http://localhost:3000/posts");
	Object firsttitle = resp.jsonPath().get("[0].title");
	 System.out.println(firsttitle);
	 
	 given()
	 .pathParam("tn",firsttitle)
	 .when()
	 .get("http://localhost:3000/posts/{tn}")
	 .then()
	 .log().all();
	}

}

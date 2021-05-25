package validation;
import static io.restassured.RestAssured.*;

import java.util.ArrayList;

import org.testng.annotations.Test;

import io.restassured.response.Response;
public class Getallthetitle {
	@Test
	public void demo() {
		Response resp = when()
		.get("http://localhost:3000/posts");
	ArrayList<String> l = resp.jsonPath().get("author");
	for(int i=0;i<l.size();i++) {
		System.out.println(l.get(i));
	}
		
	}

}

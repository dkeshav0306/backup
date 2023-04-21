package basics;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ExtractValueFromResponce {
	
	@Test
	
	public void GetEmailValue() {
RestAssured.baseURI = "https://reqres.in";
		
		Response responce = given()
							.log().all()
							.when()
							.get("/api/users/2")
							.then()
							.log().all() 
							.extract()
							.response();
		JsonPath jp = responce.jsonPath();
		String emailvalue = jp.getString("data.email");
		System.out.println("email value is "+emailvalue);
	}

}

package api_testing;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Loginautomation extends BaseClass{
	@Test 
	
	public void loginPage() {
		
		RestAssured.baseURI="https://www.rahulshettyacademy.com";
		Response resp = given()
		.log().all()
		.header("Content-Type","application/json")
		
		.body("{\r\n"
				+ "    \"userEmail\": \"kkeshav70@gmailo.com\",\r\n"
				+ "     \"userPassword\": \"Dkeshavendra@123\"\r\n"
				+ "}")
				.when()
				.post("/api/ecom/auth/login")
				.then()
				.log().all()
				.extract()
				.response();
		JsonPath jp = resp.jsonPath();
		 ID = jp.getString("userId");
	 token = jp.getString("token");
		
				
	}

}

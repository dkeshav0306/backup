package basics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
public class Get_User {
	
	@Test
	
	public void GetSingleUser() {
		RestAssured.baseURI = "https://reqres.in";
		
		given()
		.log().all()
		.when()
		.get("/api/users/2")
		.then()
		.log().all() 
		.extract()
		.response();
		
		
		
	}

}

package basics;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Get_ListUser {
	
	@Test
	
	
	public void GetListUSer(){
		
		RestAssured.baseURI = "https://reqres.in";
		
	Response response =	given()
		
			.when()
			.get("api/users?page=2")
			.then()
			.extract()
			.response();
		
	String stringresponce = response.asPrettyString(); //converting the response in string
		
	System.out.println(stringresponce);
	int ststuscode = response.getStatusCode();
		System.out.println("ststus code is "+ststuscode);
		long responseTime = response.getTime();
		System.out.println("The response time is"+responseTime);
		Assert.assertEquals(201, ststuscode);
	}

}

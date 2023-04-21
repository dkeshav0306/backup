package basics;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_SingleUser {

	@Test

	public void getsingleuser() {

		RestAssured.baseURI = "https://reqres.in";

		Response response = given()

				.when()
				.get("api/users/2")
				.then()
				.extract()
				.response();

		String stringresponce = response.asPrettyString(); // converting the response in string

		System.out.println(stringresponce);
		int ststuscode = response.getStatusCode();
		System.out.println("ststus code is " + ststuscode);
		long responseTime = response.getTime();
		System.out.println("The response time is " + responseTime);
		Assert.assertEquals(200, ststuscode);

	}

}

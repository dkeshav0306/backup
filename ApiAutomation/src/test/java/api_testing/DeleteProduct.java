package api_testing;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteProduct extends BaseClass {
	@Test
	public void deleteProductFromApp() {
		RestAssured.baseURI = "https://rahulshettyacademy.com";

				given()

				.log().all()

				.header("Authorization", token)

				.pathParam("prdid", productId)

				.when()

				.delete("api/ecom/product/delete-product/{prdid}")

				.then().log().all()

				.extract()

				.response();

	}


}

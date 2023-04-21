package api_testing;



import org.testng.annotations.Test;


import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class PlaceOrder extends BaseClass {

	@Test
	public void placeOrders()
	{
		RestAssured.baseURI = "https://rahulshettyacademy.com";
		
		given()
		
		.log().all()
		
		.header("Content-Type", "application/json")
		
		.header("Authorization", token)
		
		.body(JsonBody.getOrderBody(productId))
		
		.when()
		
		.post("api/ecom/order/create-order")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();
		
		
		
		
		
		
		
		
		
		
	}


}

package api_testing;

import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;

@Test
public class AddProduct extends BaseClass {
	
	public void AddProductToApp() {
		
		RestAssured.baseURI="https://rahulshettyacademy.com";
		Response resp = given()
				.log().all()
				.header("Authorization", token)
				.param("productName", "Casual shirt")
				.param("productAddedBy", ID)
				.param("productCategory", "fashion")
				.param("productSubCategory", "shirt")
				.param("productPrice","1000")
				.param("productDescription", "Indigo Nation")
				.param("productFor", "Men")
		.multiPart("productImage",new File("C:\\Users\\keshav\\Desktop\\shirt.png"))
.when()
		
		.post("api/ecom/product/add-product")
		
		.then()
		
		.log().all()
		
		.extract()
		
		.response();
		
		
JsonPath jp = resp.jsonPath();

	productId = jp.getString("productId");
	}
}

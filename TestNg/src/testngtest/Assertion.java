package testngtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

	@Listeners(testngtest.Listenerrr.class)
public class Assertion {

	public static WebDriver driver;
	static String url = "http://dthahab.com/Account/Login";

	@BeforeTest(alwaysRun = true, groups = "sanity , regression")
	public void initBrowser() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Test(priority = 0, groups = "sanity")
	void verifyurlofpage() {
		String verifyurl = driver.getCurrentUrl();
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(verifyurl, url, "verify url");
		System.out.println("next line after verifyurl soft assert");
		softassert.assertAll();
	}

	@Test(priority = 1, groups = "regression")
	void verifytitleofpage() {
		String verifytitle = driver.getTitle();
		SoftAssert softasserts = new SoftAssert();
		softasserts.assertEquals(verifytitle, "Login | Dthahab", "verifying title");
		softasserts.assertAll();

	}

	@Test(priority = 2, groups = { "sanity","regression"})
	void verifyDashboordAfterLogin() {
		MethodsToRunTestCaseesOnCurrentPage c = new MethodsToRunTestCaseesOnCurrentPage();
		c.login("VELOCITY", "VELOCITY123");
		String text = c.getPageText("Dashboard");
		Assert.assertEquals(text, "Dashboard", "verifying page text");
	}

	@Test(priority = 3, dependsOnMethods="verifyDashboordAfterLogin", groups = "regression")
	void verifyDashbodBlocks() {
		MethodsToRunTestCaseesOnCurrentPage c = new MethodsToRunTestCaseesOnCurrentPage();
		String text1 = c.getBlockOnDashBord("Orders");
		String text2 = c.getBlockOnDashBord("Revenue");
		String text3 = c.getBlockOnDashBord("Average Price");
		String text4 = c.getBlockOnDashBord("Product Sold");
		Assert.assertEquals(text1, "ORDERS", "verifying page block");
		Assert.assertEquals(text2, "REVENUE", "verifying page block");
		Assert.assertEquals(text3, "AVERAGE PRICE", "verifying page block");
		Assert.assertEquals(text4, "PRODUCT SOLD", "verifying page block");

	}

	@AfterTest(alwaysRun = true, groups = { "sanity","regression"})
	void tearddown() {
		driver.quit();

	}
}

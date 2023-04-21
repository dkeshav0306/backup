package testngtest;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HardAsserttt {
	public static WebDriver driver;
	static String url="http://dthahab.com/Account/Login";

	@BeforeTest
	public void initBrowser() {
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	}

	@Test(priority=0)
	void verifyurlofpage() {
		String verifyUrl = driver.getCurrentUrl();
		Assert.assertEquals(verifyUrl, "http://dthahab.com/Account/Login","verify url");
		System.out.println("next line after hard assert");
	}
	
	
	@Test(priority=1)
	void verifytitle() {
		String verifytitle = driver.getTitle();
		Assert.assertEquals(verifytitle, "Login | Dthahab","verifying title");
	}

}

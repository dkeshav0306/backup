package testngtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertionincludeexclude {
	public static WebDriver driver;
	static String url="http://dthahab.com/Setting/Splash/Create";
	
	@BeforeTest(alwaysRun=true)
	public void initBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	@Test(priority =0)
	void verifyurlofpage() {
		String verifyurl = driver.getCurrentUrl();
		SoftAssert softasserts = new SoftAssert();
		softasserts.assertEquals(verifyurl, url);
		
		System.out.println("next line after verify url test case hard assert");
		softasserts.assertAll();
	
	}

	
	@Test(priority =1)
	void verifytitleofpage() {
		String verifytitle = driver.getTitle();
		SoftAssert softasserts = new SoftAssert();
		softasserts.assertEquals(verifytitle, "Login | Dthahab","verifying title");
		System.out.println("nextline after verifytitle test case");
		softasserts.assertAll();
	}

	@Test(priority=2)
	void verifydashbordafterlogin() {
		MethodsToRunTestCaseesOnCurrentPage c = new MethodsToRunTestCaseesOnCurrentPage();
		
		
	}
}
	
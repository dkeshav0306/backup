package testngtest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;





public class MethodsToRunTestCaseesOnCurrentPage extends SoftAsserttt {
//	public static WebDriver driver;
	
	public void login(String username, String password) {
		driver.findElement(By.id("Username")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//*[text()='Log In']")).click();
	}
	
	String getPageText(String PageTest) {
		String text= driver.findElement(By.xpath("//h4[text()='" + PageTest + "']")).getText();
		return text;
	}	
	
		String getBlockOnDashBord(String blockname) {
			String text = driver.findElement(By.xpath("//h6[text()='"+ blockname +"']")).getText();
			return text;
		}

	}
	
	
	
	
	


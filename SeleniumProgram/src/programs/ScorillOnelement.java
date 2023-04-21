package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScorillOnelement {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "E:\\testing\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button"))
				.click();
		driver.findElement(By.xpath("//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name'] [text()='PIM']")).click();
		WebElement scrolltillthis = 
		driver.findElement(By.xpath("//*[contains(text(),'David ')]//parent::div//parent::div//*[contains(text(),'Morris')]//parent::div//parent::div//span//i"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();",scrolltillthis);
		
		//Thread.sleep(5000);
		
		js.executeScript("arguments[0].click();",scrolltillthis);
	
		//driver.close();
		
	
	}
}

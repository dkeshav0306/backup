package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scorlling {
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
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,800)");
		
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,-800)");
		Thread.sleep(3000);
		driver.close();
	
	}

}

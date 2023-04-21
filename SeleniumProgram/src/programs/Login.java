package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login extends CodForBrowser{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(5000);
		WebElement username = driver.findElement(By.xpath("//*[contains(@name,'user')]"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//input [@class ='oxd-input oxd-input--active' or @name='user']"));
		password.sendKeys("admin123");
		
		WebElement Clicklogin = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		Clicklogin.click();
	}

}

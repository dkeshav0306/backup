package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckingId {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("email"));
			userName.sendKeys("keshavendra");
		Thread.sleep(3000);
		 WebElement password =  driver.findElement(By.id("pass"));
		password.sendKeys("keshavendra123");
		Thread.sleep(3000);
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		Thread.sleep(3000);
		
		driver.close();
	}
}

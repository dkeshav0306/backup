package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXpathAndd {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		
		Thread.sleep(2000);
		
		WebElement uname = driver.findElement(By.xpath("//*[@name='username']"));
		uname.sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @name='password']")).sendKeys("admin123");
		
		
	 	WebElement login = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
		login.click();
		
		boolean page = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText().equals("Dashboard");
		
		if(page==true)
			System.out.println("pass");
		else
			System.out.println("fail");
		
		
		
		driver.findElement(By.xpath("//*[text()='helan POL']//parent::span//i")).click();
		driver.findElement(By.partialLinkText("Log")).click();
	}
	
}

package programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectMultypleCheckbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\\\testing\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@class='oxd-form-actions orangehrm-login-action']")).click();
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//*[@class='oxd-table-card']//span//i"));
		
		for(WebElement chk:checkbox)
			chk.click();
			
	}

}

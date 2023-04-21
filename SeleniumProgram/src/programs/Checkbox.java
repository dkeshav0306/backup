package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "E:\\testing\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS );
	
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@class='oxd-form-actions orangehrm-login-action']")).click();
		driver.findElement(By.xpath(" //*[contains(text(),'Admin')]//parent::div")).click();
		String attribut = driver.findElement(By.xpath(" //*[contains(text(),'Admin')]//parent::div")).getAttribute("class");
		System.out.println(attribut);
	//	driver.findElement(By.xpath("//*[text()='PIM']")).click();
		//driver.findElement(By.xpath("//*[contains(text(),'David ')]//parent::div//parent::div//*[contains(text(),'Morris')]//parent::div//parent::div//span//i")).click();
	
//		driver.findElement(By.xpath("//*[contains(text(),'David ')]//parent::div//following-sibling::div//*[contains(text(),'Morris')]//parent::div//preceding-sibling::div//span//i")).click();
		//driver.findElement(By.xpath("//*[contains(text(),'David ')]//ancestor::div//*[contains(text(),'Morris')]//parent::div//parent::div//span//i")).click();	
	}

}

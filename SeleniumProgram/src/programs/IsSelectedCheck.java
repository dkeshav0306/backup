package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedCheck {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		driver.findElement(By.id("isAgeSelected")).click();
		boolean checkbox = driver.findElement(By.id("isAgeSelected")).isSelected();
			System.out.println(checkbox);
			
			driver.findElement(By.id("isAgeSelected")).click();
			boolean verifycheckbox = driver.findElement(By.id("isAgeSelected")).isSelected();
				System.out.println(verifycheckbox);
				
				driver.close();
			
			
		
	}

}

package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class ImplicitlyWait {

	public static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "E:\\testing\\edgedriver_win64\\msedgedriver.exe");
		 driver = new EdgeDriver();
		driver.get("https://chercher.tech/practice/implicit-wait-example");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		int i =1;
		while(i>0) {
			driver.findElement(By.xpath("(//*[@id='q']//input)["+i+"]")).click();
			i++;
		}
		
	}
}

package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMouseHovering {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.edge.driver", "E:\\testing\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/menu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement target = driver.findElement(By.xpath("//*[text()='Main Item 2']"));
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
		//driver.close();
	}

}

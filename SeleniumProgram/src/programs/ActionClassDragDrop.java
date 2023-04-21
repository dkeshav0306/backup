package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDragDrop {
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.edge.driver", "E:\\testing\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 WebElement sorceelement = driver.findElements(By.cssSelector("#fourth a")).get(0);
	 WebElement targetelement = driver.findElement(By.cssSelector("#amt7 li"));
	 Thread.sleep(3000);
	 Actions act = new Actions(driver);
	 act.clickAndHold(sorceelement).perform();
	Thread.sleep(1000);
	 act.dragAndDrop(sorceelement, targetelement).perform();
	driver.close();
	}
}

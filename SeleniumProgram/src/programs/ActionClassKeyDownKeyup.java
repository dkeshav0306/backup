package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionClassKeyDownKeyup {
	public static void main (String[]args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "E:\\testing\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://m.facebook.com/reg/?cid=103&refsrc=deprecated&soft=hjk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement textbox1 = driver.findElement(By.name("firstname"));
		WebElement textbox2 = driver.findElement(By.name("lastname"));
		
		Actions act = new Actions(driver);
		act.sendKeys("keshavendra").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
	
		textbox2.click();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(3000);
		driver.close();
	}
}

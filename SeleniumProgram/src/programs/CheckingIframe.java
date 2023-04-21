package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckingIframe {
	
		public static void main(String[]args) throws InterruptedException {
			System.setProperty("webdriver.edge.driver", "E:\\testing\\edgedriver_win64\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.get("https://jqueryui.com/slider/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
			driver.switchTo().frame(iframe);
			WebElement source = driver.findElement(By.cssSelector("#slider span"));
			Actions act  = new Actions(driver);
			act.clickAndHold(source).build().perform();
			act.moveToElement(source,550,0).release().build().perform();
			driver.switchTo().parentFrame();
			driver.findElement(By.linkText("Download")).click();
		}
}

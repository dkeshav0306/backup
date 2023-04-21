package programs;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsSelectedCheckEdge {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "E:\\testing\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("isAgeSelected")).click();
		boolean checkbox = driver.findElement(By.id("isAgeSelected")).isSelected();
		System.out.println(checkbox);

		//driver.findElement(By.id("isAgeSelected")).click();
		
		//boolean verifycheckbox = driver.findElement(By.id("isAgeSelected")).isSelected();
		//System.out.println(verifycheckbox);
		
		
	//	List<WebElement> checkboxx = driver.findElements(By.xpath("//*[@class='cb1-element']"));
	//	for(WebElement box:checkboxx)
	//		box.click();
		//driver.findElement(By.xpath("//*[text()='Option 1']//*[@class='cb1-element']")).click();
		driver.findElement(By.id("check1")).click();
		
	}

}

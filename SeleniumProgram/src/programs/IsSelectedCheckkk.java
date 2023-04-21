package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IsSelectedCheckkk {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "E:\\testing\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement radiobuttonn = driver.findElement(By.xpath("//span[text()='Female']//parent::label//input"));
		radiobuttonn.click();
		Thread.sleep(2000);
		System.out.println(radiobuttonn.isSelected());

		WebElement buttonmale = driver.findElement(By.xpath("//span[text()='Male']//parent::label//input"));
		// buttonmale.click();
		System.out.println(buttonmale.isSelected());
		driver.close();
	}

}

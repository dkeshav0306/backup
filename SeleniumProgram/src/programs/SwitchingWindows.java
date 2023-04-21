package programs;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwitchingWindows {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "E:\\\\testing\\\\edgedriver_win64\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		String winId1 = driver.getWindowHandle();
		System.out.println("primary WinId:" + winId1);// current window id

		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(2000);
		Set<String> allWinId = driver.getWindowHandles();

		for (String eachWinId : allWinId) {
			if (!eachWinId.equals(winId1)) {
				driver.switchTo().window(eachWinId);
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//button[text()='Contact Sales'])[2]")).click();

			}
		}
		Thread.sleep(5000);
		driver.switchTo().window(winId1);
		Thread.sleep(5000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector(".oxd-button.oxd-button--medium.oxd-button--main.orangehrm-login-button"))
				.click();
		Thread.sleep(2000);
		driver.quit();

	}
}

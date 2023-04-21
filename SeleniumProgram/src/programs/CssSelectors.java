package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectors {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://m.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("#m_login_email")).sendKeys("keshav@hmail.com");
		driver.findElement(By.cssSelector("#m_login_password")).sendKeys("keshav@123");
		driver.findElement(By.cssSelector("._54k8._52jh._56bs._56b_._28lf._9cow._56bw._56bu")).click();
		
	}
}

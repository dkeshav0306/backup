package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChildWinPopUp {
	public static void main(String[]args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "E:\\testing\\edgedriver_win64\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://groww.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[text()='Login/Register']")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("login_email1")).sendKeys("dkeshavendra@yahoo.com");
	Thread.sleep(2000);
	driver.close();
	}
}

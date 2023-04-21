package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FbLogin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "E:\\\\\\\\testing\\\\\\\\edgedriver_win64\\\\\\\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("kkeshav70@gail.com");
		driver.findElement(By.id("pass")).sendKeys("keshav123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name=\"login\"]")).click();
		driver.findElement(By.cssSelector(".x1pwv2dq.xvlca1e.xbh8q5q")).click();
		Thread.sleep(2000);
				
		driver.findElement(By.cssSelector("[class='x6s0dn4 xkh2ocl x1q0q8m5 x1qhh985 xu3j5b3 xcfux6l x26u7qi xm0m39n x13fuv20 x972fbf x9f619 x78zum5 x1q0g3np x1iyjqo2 xs83m0k x1qughib xat24cr x11i5rnm x1mh8g0r xdj266r x2lwn1j xeuugli x18d9i69 x4uap5 xkhd6sd xexx8yu x1n2onr6 x1ja2u2z']"));
		Thread.sleep(3000);
		driver.close();
		
	
	}
}

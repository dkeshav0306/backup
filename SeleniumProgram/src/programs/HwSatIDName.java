package programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HwSatIDName extends CodForBrowser {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(5000);

	//	WebElement uname = driver.findElement(By.name("username"));
		//uname.sendKeys("Admin");

	//	WebElement pass = driver.findElement(By.name("password"));
	//	pass.sendKeys("admin123");

	//	WebElement clicklogin = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		//clicklogin.click();
		//Thread.sleep(2000);
		
		
	//	WebElement click = driver.findElement(By.cssSelector(".oxd-form-actions.orangehrm-login-action button"));
		//click.click();
		
		
	
		
		//WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
	//	username.sendKeys("Admin");
		
	WebElement username = driver.findElement(By.xpath("//*[contains(@name,'user')]"));
	username.sendKeys("Admin");
	
	WebElement password = driver.findElement(By.xpath("//input [@class ='oxd-input oxd-input--active' or @name='pas']"));
	password.sendKeys("admin123");
	
	WebElement Clicklogin = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
	Clicklogin.click();
	
	//WebElement text = driver.findElement(By.xpath("//h5[text()='Login']")); // by text
		//String returnstr =text.getText();
		//System.out.println(returnstr);
		
		
	//	WebElement password = driver.findElement(By.xpath("//input [@class ='oxd-input oxd-input--active' and @name='password']"));
	//	password.sendKeys("admin123");
		
	
		
		//String oldtitle ="OrangeHRM";
		//String newtitle =driver.getTitle();
		
		
		
		
	//	Thread.sleep(2000);
	//	if (newtitle.equals(oldtitle))
	//	System.out.println("test pass");
	//	else
		//System.out.println(" test failed");
	//	driver.close();
		

		

	}
}

package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class ClickCheckboxByUsingMethod extends CodForBrowser {
	public void login() {

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@class='oxd-form-actions orangehrm-login-action']")).click();

	}
	public void clickonEmpName(String fname,String lname) {
	driver.findElement(By.xpath("//*[contains(text(),'" + fname + "')]//ancestor::div//*[contains(text(),'" + lname + "')]//parent::div//parent::div//span//i")).click();
		
		
	}

	public static void main(String[] args) {
		CodForBrowser.Browserinit("chrome");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		ClickCheckboxByUsingMethod loginn = new ClickCheckboxByUsingMethod();
		loginn.login();
		driver.findElement(By.xpath("//*[text()='PIM']")).click();
		loginn.clickonEmpName("Rob ","Kuvalis");
		
	}
}

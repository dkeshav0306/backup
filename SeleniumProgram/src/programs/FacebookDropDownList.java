package programs;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FacebookDropDownList {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\testing\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mbasic.facebook.com/reg/?cid=103&refsrc=deprecated&_rdr");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> years = driver.findElements(By.xpath("//*[@id='year']//option"));
		for(WebElement year:years)
			if(year.getText().equals("1995"))
			year.click();
		
		List<WebElement> months = driver.findElements(By.xpath("//*[@id='month']//option"));
		for(WebElement month:months)
			if(month.getText().equals("Jun"))
				month.click();
		
		List<WebElement> days = driver.findElements(By.xpath("//*[@id='day']//option"));
		for(WebElement day:days)
			if(day.getText().equals("3"))
				day.click();
			
	}

}

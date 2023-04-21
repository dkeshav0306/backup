package programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BootStrapCal {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "E:\\\\testing\\\\edgedriver_win64\\\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("https://demo.automationtesting.in/Datepicker.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.id("datepicker1")).click();
	Thread.sleep(5000);
	int i=0;
	while(i==0) {
		String monthyear = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		if(!(monthyear.equals("June 1995"))) 
			driver.findElement(By.xpath("//*[text()='Prev']")).click();
		else
				break;
	}
			
		driver.findElement(By.xpath("//*[text()='3']")).click();
	
	
	
}
}

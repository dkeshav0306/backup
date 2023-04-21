package programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CodForBrowser {
		static WebDriver driver;
		public static WebDriver	Browserinit(String browser) {
			System.setProperty("webdriver.edge.driver", 
					"E:\\testing\\edgedriver_win64\\msedgedriver.exe");
			
				System.setProperty("webdriver.chrome.driver", 
						"E:\\testing\\chromedriver_win32\\chromedriver.exe");
				
				if(browser.equals("edge")) {
					driver = new EdgeDriver();
				}
					if(browser.equals("chrome")) {
						driver = new ChromeDriver();
					
				}
			
			return driver;	
		}
		

		}

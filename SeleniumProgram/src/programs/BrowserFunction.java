package programs;

public class BrowserFunction extends CodForBrowser {

	public static void main(String[] args) throws InterruptedException {
		Browserinit("chrome");
		driver.get("https://google.co.in/");
		driver.manage().window().maximize();
		driver.get("https://instagram.com/");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();
		
	}
}

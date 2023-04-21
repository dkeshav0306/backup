package programs;

public class BrowserTest extends CodForBrowser {
	public static void main(String[]args) {
		Browserinit("chrome");
		driver.get("https://www.youtube.com/");
		driver.close();
		
		Browserinit("edge");
		driver.get("https://www.youtube.com/");
		driver.close();
	}

}

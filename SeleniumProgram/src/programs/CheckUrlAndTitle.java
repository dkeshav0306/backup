package programs;

public class CheckUrlAndTitle extends CodForBrowser{
	public void CheckTitle(String title) {
			String titlepage = driver.getTitle();
			if (titlepage.equals(title)) 
				System.out.println("Test is pass");
				else 
					System.out.println("Test is fail");
	}			
	public void CheckUrl(String url) {
		String pageofurl = driver.getCurrentUrl();
		if(pageofurl.equals(url))
			System.out.println("Test is pass");
		else 
			System.out.println("Test is fail");
	}
				
	public static void main(String[]args) throws InterruptedException {
		Browserinit("chrome");
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		CheckUrlAndTitle checkk = new CheckUrlAndTitle();
		checkk.CheckTitle("Facebook – log in or sign up");
		checkk.CheckUrl("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.close();
		
	}

}

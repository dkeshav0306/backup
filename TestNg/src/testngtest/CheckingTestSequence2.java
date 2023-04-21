package testngtest;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckingTestSequence2 {
	@Test(priority=-2 /*,enabled=false*/)
	public void ba(){
		System.out.println("2nd test");
		Assert.assertEquals(false, true);
	}
		
		@Test(priority=-1, dependsOnMethods="ba", alwaysRun=true, invocationCount=10)
		public void ab(){
			System.out.println("2nd test");
			Reporter.log("Checking Report", false);
		}
}




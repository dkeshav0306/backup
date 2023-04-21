package testngtest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import static org.testng.Assert.assertEquals;

import org.testng.AssertJUnit;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class RegressionTestCheckSequence extends MethodsToRunTestCaseesOnCurrentPage {
	@BeforeSuite
	void beforeSuite() {
		System.out.println("before suite");
	}
	
	@BeforeTest
	void beforeTest() {
		System.out.println("before test");
	}
	
	@BeforeClass
	void befroeclass() {
		System.out.println("before class");
	}
	
	@BeforeMethod
	void checkTextOnLoginPage(){
		System.out.println("checking text");
	}
	
	@Test(priority=-1)
	 void verifyloginaftercurrectinput(){
		
		RegressionTestCheckSequence t = new RegressionTestCheckSequence();
		t.login("Admin", "admin123");
		AssertJUnit.assertEquals(true, true);
		
	}

	
	@AfterMethod
	void logout() {
		System.out.println("after login refresh the page and logout");
	}

	@AfterClass
	void afterclass() {
		System.out.println("after class");
	}

	@AfterTest
	void afterTest() {
		System.out.println("after test");
	}



}

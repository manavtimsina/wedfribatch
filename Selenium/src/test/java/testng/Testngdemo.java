package testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testngdemo {
	
	@BeforeTest
public void beforeTest() {
		
		System.out.println("Before Test Annotation");
	}
	
	@AfterTest
public void afterTest() {
		
		System.out.println("After Test Annotation");
	}
    
	@Test 
public void testcase1() {
		
		System.out.println("Line1");
		
		//writing hard assertion here. Other part of the code won't run at all if there is a hard assertion.
		//Assert.assertEquals("A", "B");
		
		//Writing soft assertion here. This continues execution even with the errors
		SoftAssert sa = new SoftAssert();
		sa.assertEquals("a", "b");
		System.out.println("Line2");
		System.out.println("Line3");
		//sa.assertAll();  //Marks the failure here. You choose where you want to mark
		System.out.println("Line4");
		System.out.println("Line5");
		//sa.assertAll(); //Asking to mark the failure at the end.
		
	}

	@Test 
public void testcase2() {
		
		System.out.println("Test 2 -- Verify Password works");
	}
	
	@Test 
public void testcase3() {
	
	System.out.println("Test 3 -- Verify log in button works");
}

	

	@BeforeClass
public void beforeclass() {
		System.out.println("Before class Annotation");
	}
	@AfterClass
public void afterclass() {
		System.out.println("After Class Annotation");
	}
	
	@BeforeMethod
public void beforemethod() {
		System.out.println("Before Method Annotation");
	}
	
	@AfterMethod
public void aftermethod() {
			System.out.println("After Method Annotation");
		}
	@BeforeSuite
public void beforesuite() {
			System.out.println("Before Suite");
		}
	@AfterSuite
public void aftersuite() {
			System.out.println("After Suite");
		}
}

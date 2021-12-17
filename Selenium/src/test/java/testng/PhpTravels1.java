
package testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import poi.ExcelReader;


public class PhpTravels1 {
String browsername = "chrome";
WebDriver browser;
@BeforeTest
public void preconditions() {
	if(browsername.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		browser = new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver",  "C:\\Selenium Installations\\geckodriver.exe");
		browser = new FirefoxDriver();
	}else if(browsername.equalsIgnoreCase("edge")){
		System.setProperty("webdriver.edge.driver",  "C:\\Selenium\\msedgedriver.exe");
		browser = new EdgeDriver();
	}
}
@Test(priority = 0)
public void openurl() {
	String Expected = "PHPTRAVELS - PHPTRAVELS";
	browser.manage().window().maximize();
	browser.get("https://www.phptravels.net/");
	Assert.assertEquals(browser.getTitle(), Expected);
	
}
@Test(priority = 1 ,dependsOnMethods = "openurl")
public void clicklogin() {
	String Expected = "Login - PHPTRAVELS";
	browser.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/div/a[2]")).click();
    Assert.assertEquals(browser.getTitle(),Expected);
}
@AfterTest
public void closebrowser() {
	//browser.close();
}
@Test(priority = 2,dependsOnMethods = "clicklogin")
public void enterusernameandpassword() throws IOException{
	String Expected = "Dashboard - PHPTRAVELS";
	ExcelReader er = new ExcelReader();
	String Username = er.readrowsandcols("C:\\FileHandling\\MyExcel.xlsx", "Login", 1, 0);
	String password = er.readrowsandcols("C:\\FileHandling\\MyExcel.xlsx", "Login", 1, 0);
	
	
	browser.findElement(By.name("email")).sendKeys(Username);
	browser.findElement(By.name("password")).sendKeys(password);
	browser.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[2]/div[2]/div[1]/label")).click();
	browser.findElement(By.id("cookie_stop")).click();
	browser.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button")).click();
    Assert.assertEquals(browser.getTitle(), Expected);
}
@Test(priority = 3,dependsOnMethods = "enterusernameandpassword")
public void clicklogout() {
	//browser.findElement(By.xpath("/html/body/div[1]/div/div[3]/ul/li[5]/a")).click();
}
}
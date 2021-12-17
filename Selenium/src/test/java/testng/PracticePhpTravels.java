package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticePhpTravels {

	String browserName = "";
	WebDriver browser;
	
	@BeforeTest
	public void preconditions() {
		if( browserName.equalsIgnoreCase("chrome")); {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			 browser = new ChromeDriver();
		}	
		
		if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win32\\msedgedriver.exe");
			browser = new EdgeDriver();
		}		
		
	}
	//first requirement
	@Test
	public void openurl() {	
		String Expected = "Login - PHPTRAVELS";
		browser.get("https://www.phptravels.net/login");
		Assert.assertEquals(browser.getTitle(), Expected);
	}
	
	@Test
	public void enterUserId() {	
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("https://www.phptravels.net/login");
		c.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input")).sendKeys("user@phptravels.com");
		
	}
	
    @Test
	public void enterpw() {	
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("https://www.phptravels.net/login");
		c.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[2]/div[1]/input")).sendKeys("demouser");
	}
    
    @Test
    public void checkMark() {	
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("https://www.phptravels.net/login");
		c.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[2]/div[2]/div[1]/label")).click();
	}
    
    @Test
    public void clickLogIn() {	
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver c = new ChromeDriver();
		c.get("https://www.phptravels.net/login");
		c.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div/form/div[3]/button/span[1]")).click();
	}

	
}

//  /html/body/div[1]/div/div[2]/div[2]/div/form/div[1]/div/input -- xpath for login entry
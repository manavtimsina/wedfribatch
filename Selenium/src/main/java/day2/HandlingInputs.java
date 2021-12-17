package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
ChromeDriver c = new ChromeDriver();
c.get("https://www.facebook.com/");
c.findElement(By.name("email")).sendKeys("user@facebook.com");
c.findElement(By.id("pass")).sendKeys("password");
		
		//********************
	
	
	}

}

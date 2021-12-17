package day3;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class HanlingCheckBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver c = new ChromeDriver();
		
		c.get("https://echoecho.com/htmlforms09.htm");
		c.findElement(By.name("option1")).click();
		c.findElement(By.name("option3")).click();
	}

}

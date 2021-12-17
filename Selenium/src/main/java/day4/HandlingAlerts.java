package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver c = new ChromeDriver();
		
		c.get("https://echoecho.com/javascript4.htm");
		//c.findElement(By.name("B1")).click();
		c.findElement(By.name("B3")).click();
		System.out.println(c.switchTo().alert().getText());
		
		c.switchTo().alert().sendKeys("Hello, How are you doing today?");
		//c.switchTo().alert().accept(); // this clicks ok
		//c.switchTo().alert().dismis(); // this cancels
		
	}

}

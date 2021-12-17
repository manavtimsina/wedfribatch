package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver c = new ChromeDriver();
		
		c.get("https://echoecho.com/htmlforms11.htm");
		WebElement dropdown =  c.findElement(By.name("mydropdown"));
		List<WebElement> options = dropdown.findElements(By.tagName("option"));
		
		System.out.println(options.size());
		
		for(int i = 0; i<options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
	}

}

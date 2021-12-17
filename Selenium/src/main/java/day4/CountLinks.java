package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver c = new ChromeDriver();
		
		c.get("https://echoecho.com/htmlforms09.htm");
		
		List<WebElement> links = c.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i = 0; i<links.size(); i++) {
			System.out.println(links.get(i).getText());
			
			
		}
		
	}

}

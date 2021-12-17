package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver c = new ChromeDriver();
	    c.get("https://www.facebook.com/");
		
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\msedgedriver.exe");	
		EdgeDriver e = new EdgeDriver();
		e.get("https://www.facebook.com/");
	}

}

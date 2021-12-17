package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe"); 
		ChromeDriver c = new ChromeDriver();
		
		c.get("http://register.rediff.com/register/register.php?FormName=user_details");
			
		c.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Manav Timsina"); //Enters full name
		c.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("manavtimsina12"); //Enters rediffmail id
		c.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click(); //Clicks check availability
		c.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[9]/td[3]/input")).sendKeys("QAautomations@12"); //Enters password
		c.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[11]/td[3]/input")).sendKeys("QAautomations@12"); //Re-enters correct pw
		c.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys("manav_timsina@yahoo.com"); //enters alternate email id
		c.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).click(); //clicks the check box on Alternate email id entry
	
		
		//for security question dropdown
		WebElement dDown = c.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[2]/td[3]/select"));
		Select choose = new Select(dDown);
		//select.selectByValue("222");
		choose.selectByVisibleText("What is your favourite pass-time?");		
		c.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[4]/td[3]/input")).sendKeys("Reading Books");//selects the security question
		c.findElement(By.xpath("//*[@id=\"div_hintQS\"]/table/tbody/tr[6]/td[3]/input")).sendKeys("Ghimirey"); //answer to the security question
	
		c.findElement(By.id("mobno")).sendKeys("412999999"); //enters the phone number
		
		//for DOB dropdown (DOB-Day)
				WebElement day = c.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
				Select dy = new Select(day);
				dy.selectByVisibleText("09");
		//for DOB dropdown (DOB-Month)
				WebElement month = c.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
				Select mnth = new Select(month);
				mnth.selectByVisibleText("APR");	
		//for DOB dropdown (DOB-Year)
				WebElement year = c.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
				Select yr = new Select(year);
				yr.selectByVisibleText("1990");			
					
		
		//c.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]")).click(); //This selects female. Checking this because site selects Male as default.
		c.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).click();  // checking if it switches to male
		
		
		//for country dropdown. Selecting USA as country. This doesn't require city selection
		//		WebElement dropDown = c.findElement(By.xpath("//*[@id=\"country\"]"));
		//		Select select = new Select(dropDown);
		//		//select.selectByValue("222");
		//		select.selectByVisibleText("United States");
				
				
		//for country dropdown. Selecting India Just for practice because this includes City also
				WebElement dropDown = c.findElement(By.xpath("//*[@id=\"country\"]"));
				Select select = new Select(dropDown);
				//select.selectByValue("222");
				select.selectByVisibleText("India");
				
		//for city dropdown. Allows user to select city only if India is selected as a country
				WebElement city = c.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));
				Select ct = new Select(city);
				//select.selectByValue("222");
				ct.selectByVisibleText("Ahmedabad");	
		
		c.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[32]/td[3]/input")).sendKeys("AzYle");  //enters characters shown in image

	//	c.findElement(By.xpath("//*[@id=\"Register\"]")).click(); //This clicks the register button (Optional)
		
		
	
	}

}
//*[@id="tblcrtac"]/tbody/tr[3]/td[3]/input -- This is relative xpath.Right click at the elements and do 'copy xpath'
///html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input -  This is absolute xpath. Right click at the elements and do 'copy full xpath'

//*[@id="tblcrtac"]/tbody/tr[7]/td[3]/input[1]
//*[@id="tblcrtac"]/tbody/tr[7]/td[3]/input[1]
//*[@id="tblcrtac"]/tbody/tr[7]/td[3]/input[2]
//*[@id="tblcrtac"]/tbody/tr[9]/td[3]/input -- Password
//*[@id="tblcrtac"]/tbody/tr[11]/td[3]/input --Retype PW
//*[@id="div_altemail"]/table/tbody/tr[1]/td[3]/input -- Alternate email address
//*[@id="tblcrtac"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input -- check box
//*[@id="div_hintQS"]/table/tbody/tr[2]/td[3]/select -- Security question
//*[@id="div_hintQS"]/table/tbody/tr[4]/td[3]/input -- Enter an answer
//*[@id="div_hintQS"]/table/tbody/tr[6]/td[3]/input -- Mother's Maiden Name
//*[@id="div_mob"]/table/tbody/tr/td[3]/div[2]/div[1] -- Mobile num +1
//*[@id="tblcrtac"]/tbody/tr[24]/td[3]/input[2] -- radio buton female
//*[@id="country"] -- country you live in
//*[@id="tblcrtac"]/tbody/tr[32]/td[3]/input -- enter the text above
//*[@id="tblcrtac"]/tbody/tr[32]/td[3]/input
//*[@id="tblcrtac"]/tbody/tr[32]/td[3]/input --date
//*[@id="div_city"]/table/tbody/tr[1]/td[3]/select -- city
//*[@id="Register"] -- click register button



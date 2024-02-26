package Utitlies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase 
{
	
	// define to openBrowser
	
	public WebDriver openBrowser()
	{
		// open browser		
				// open url in browser
				System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

				//		//open chrome browser
				WebDriver driver =  new ChromeDriver();
				// open url = https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

				// .implicitlyWait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				return driver;
	}
	
	
}

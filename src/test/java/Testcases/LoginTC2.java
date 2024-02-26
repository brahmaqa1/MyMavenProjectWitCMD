package Testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AllPages.LoginPage;
import Utitlies.TestBase;

public class LoginTC2 {

	@Test
	public void loginTC2()
//	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// open browser		
		TestBase  tb  = new TestBase();
		WebDriver driver = tb.openBrowser();


		// Enter invalid user name  = Ramarao
		// Create   object for -loginpage class
		LoginPage lpage=  new LoginPage(driver);


		lpage.loginToApplication("Ramarao13", "admin12345");

		// Verify 'Invalid credentials' msg is displayed	
		lpage.verifyInValidCrednetialsMsgDisplayed();				

	}

}

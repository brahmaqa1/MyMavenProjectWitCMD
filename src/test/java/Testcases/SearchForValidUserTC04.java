package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import AllPages.HomePage;
import AllPages.LoginPage;
import AllPages.SystemUsersPage;
import Utitlies.TestBase;

public class SearchForValidUserTC04 {

	@Test
	public void SearchForValidUserTC04()
	
//	public static void main(String[] args) 
	{
		// open browser	
		TestBase  tb  = new TestBase();
		WebDriver driver = tb.openBrowser();

		// 	loginToAppl
		LoginPage lpage =  new LoginPage(driver);
		lpage.loginToApplication("Admin", "admin123");

		// Verify Home page is displayed or not
		HomePage hpage =  new HomePage(driver);
		hpage.isProfileImageDisplayed();		

		//  Navigate to admin menu
		hpage.navigateToAdminMenu();

		// Verify System user page is displayed or not
		hpage.verifySystemUserPageDisplayed();

		// Search with valid user		
		// EnterValueInUserName
		SystemUsersPage  sysUsersPage  =  new SystemUsersPage(driver);
		
		sysUsersPage.EnterValueInUserName("nalim");


		/// click Search button
		sysUsersPage.clickSearchBtn();

		// Verify  '(1) Record Found'  msg is displayed
		sysUsersPage.verifyRecordFoundMsgDisplayed();

		// Verify user name is exist in table or not
		hpage.isUserNameExistInTable("nalim");


	}

}

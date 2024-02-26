package Testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import AllPages.HomePage;
import AllPages.LoginPage;
import AllPages.SystemUsersPage;
import Utitlies.TestBase;

public class DeleteUserTC5 {

	@Test
	public void DeleteUserTC5() throws InterruptedException
//	public static void main(String[] args) throws InterruptedException 
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



		//// Delete the given user - by selecting Checkbox For GivenUser
		//				
		String username= "rahul";// 
		SystemUsersPage sysUserspage =  new SystemUsersPage(driver);
		
		sysUserspage.selectGivenUser(username);

		//		// Click delete image icon for given user

		sysUserspage.deleteGivenUser(username);

		//				
		//// Verify the msg -"The selected record will be permanently deleted. Are you sure you want to continue?

		sysUserspage.verifyTheselectedrecordwillbepermanentlydeletedMsg();
		//				
		//				// Click Yes Delete button
		sysUserspage.clickYesDeleteBtn();

		//				
		//	HW 			// Verify given user name  should not be available in table  or No records found
		//searchForGivenUser

	


	}

}

package Testcases;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import AllPages.HomePage;
import AllPages.LoginPage;
import AllPages.SystemUsersPage;
import Utitlies.TestBase;

public class CreateNewUserTc03 {

	

@Test
public void createNewUserTc03() throws InterruptedException
//	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
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

		/*
		 * //Click add + button // oxd-button oxd-button--medium oxd-button--secondary
		 * 
		 * hpage.clickAddBtn();
		 * 
		 * 
		 * // Verify - Add User page is displayed hpage.verifyAddUserpageDisplayed();
		 * 
		 * //Select some value (Admin) in User Role dropdown
		 * hpage.selectUserRole("Admin");
		 * 
		 * 
		 * // or selectUserRole-ESS --> // working
		 * 
		 * // type some employee name(Orange Test) - in "Employee Name" txt box
		 * 
		 * // Orange Test hpage.enterEmployeeName("Orange  Test");
		 * 
		 * // Select some status =Enabled hpage.selectStatus("Enabled");
		 * 
		 * // Type some value in 'user name' text box // Ramarao123 ramrao9868 ramarao
		 * ramarao Random r = new Random();
		 * 
		 * int randomno = r.nextInt(10); // generates random no b/w 0 to 9 // 100 -- 0
		 * -99
		 * 
		 * System.out.println("randomno="+randomno); String username = "ramarao"+
		 * randomno; hpage.enterUsername(username);
		 * 
		 * // Type some value in 'password' text box
		 * hpage.EnterValueInPassword("admin@123");
		 * 
		 * //// Type some value in 'Confirm password' text box
		 * hpage.EnterValueInConfirmPassword("admin@123");
		 * 
		 * Thread.sleep(5000);
		 * 
		 * // click on Save button hpage.clickSaveBtn();
		 * 
		 * // Verify new user name is exist in table or not
		 * hpage.isUserNameExistInTable(username);
		 */
		
		SystemUsersPage sysUsersPage = new SystemUsersPage(driver);
		
		sysUsersPage.createNewUser("Admin","Naoly Alvarez Alvarez","Enabled","Sitarao","admin@123", "admin@123");
		sysUsersPage.createNewUser("ESS","Naoly Alvarez Alvarez","Enabled","Geetha","admin@123", "admin@123");
		sysUsersPage.createNewUser("ESS","Naoly Alvarez Alvarez","Disabled","Swathirao","admin@123", "admin@123");
		sysUsersPage.createNewUser("Admin","Naoly Alvarez Alvarez","Disabled","Dheeraj","admin@123", "admin@123");


	}

}

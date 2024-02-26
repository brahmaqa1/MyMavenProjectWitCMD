package Testcases;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import AllPages.HomePage;
import AllPages.LoginPage;
import AllPages.SystemUsersPage;
import Utitlies.ExcelUtilities;
import Utitlies.TestBase;

public class CreateMultipleUsersTc06 {

	@Test
	public void createMultipleUsersTc06() throws InterruptedException, EncryptedDocumentException, IOException
//	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		// TODO Auto-generated method stub

				TestBase  tb = new TestBase();
				WebDriver driver =	tb.openBrowser();

				// 	loginToAppl
				LoginPage  lpage=  new LoginPage(driver);
			
				lpage.loginToApplication("Admin", "admin123");

				// Verify Home page is displayed or not
				HomePage hpage = new HomePage(driver);
				hpage.isProfileImageDisplayed();


				//  Navigate to admin menu
				hpage.navigateToAdminMenu();

				// Verify System user page is displayed or not
				hpage.verifySystemUserPageDisplayed();


				String xlfile = "C:\\brahma\\Practise\\SelniumPractiseNew\\Nov2023WorkSpace\\MyMavenProjectWitCMD\\src\\test\\Resources\\TestData\\TestData.xlsx";
				

				// read 'UserRole' column data from 'CreateUsers' sheet  and store into ArrayList
				ExcelUtilities xlutil= new ExcelUtilities();
				ArrayList<String>  UserRoleColumnsData = xlutil.readColumnData(xlfile, "CreateUsers", "UserRole");
				System.out.println("UserRoleColumnsData="+UserRoleColumnsData);
				
				// 		// read 'EmployeeName' column data from 'CreateUsers' sheet  and store into ArrayList
				ArrayList<String>  EmployeeNameColumnsData = xlutil.readColumnData(xlfile, "CreateUsers", "EmployeeName");
				System.out.println("EmployeeNameColumnsData="+EmployeeNameColumnsData);
				


				// 		// read 'Status' column data from 'CreateUsers' sheet  and store into ArrayList
				ArrayList<String>  StatusColumnsData = xlutil.readColumnData(xlfile, "CreateUsers", "Status");
				System.out.println("StatusColumnsData="+StatusColumnsData);

				// 		// read 'Username' column data from 'CreateUsers' sheet  and store into ArrayList
				ArrayList<String>  UsernameColumnsData = xlutil.readColumnData(xlfile, "CreateUsers", "Username");
				System.out.println("UsernameColumnsData="+UsernameColumnsData);


				// 		// read 'Password' column data from 'CreateUsers' sheet  and store into ArrayList
				
				ArrayList<String>  PasswordColumnsData = xlutil.readColumnData(xlfile, "CreateUsers", "Password");
				System.out.println("PasswordColumnsData="+PasswordColumnsData);

				// 		// read 'ConfirmPassword' column data from 'CreateUsers' sheet  and store into ArrayList
				ArrayList<String>  ConfirmPasswordColumnsData = xlutil.readColumnData(xlfile, "CreateUsers", "ConfirmPassword");
				System.out.println("ConfirmPasswordColumnsData="+ConfirmPasswordColumnsData);
					SystemUsersPage sysUsersPage  = new SystemUsersPage(driver);
					
				for(int i=0;i<=UserRoleColumnsData.size()-1;i++)
				{
					System.out.println("each val="+ UserRoleColumnsData.get(i));
					String UserRole = UserRoleColumnsData.get(i);
					String EmployeeName = EmployeeNameColumnsData.get(i);
					String Status = StatusColumnsData.get(i);
					String Username = UsernameColumnsData.get(i);
					String Password = PasswordColumnsData.get(i);
					String ConfirmPwd = ConfirmPasswordColumnsData.get(i);
					
					
					//String UserRole, String EmployeeName,String Status,String Username,String Password,String ConfirmPwd
					
					sysUsersPage.createNewUser(UserRole, EmployeeName, Status, Username, Password, ConfirmPwd);
					
				}
					
			
				



			}

		}

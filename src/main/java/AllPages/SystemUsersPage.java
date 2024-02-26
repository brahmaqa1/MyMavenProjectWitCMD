package AllPages;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemUsersPage 
{
	public WebDriver driver;//  null

	//1.Define elements with locators
	// Define UsernameTxtbox
	@FindBy(xpath="//label[text()='Username']/parent::div/following-sibling::div/input")
	public WebElement UsernameTxtbox;

	// Define  -	//button[@type='submit']
	@FindBy(xpath ="//button[@type='submit']")
	public WebElement searchBtn;


	//	Record Found//span[text()='(1) Record Found']
	@FindBy(xpath="//span[text()='(1) Record Found']")
	public WebElement RecordFoundTxt;


	// Delete the given user 	//div[@class='oxd-table-body']/div[@class='oxd-table-card']//div[@role='row']/div[2]//*[text()='rahul0327']/../preceding-sibling::div//input[@type='checkbox']
	//div[@role='row']/div[2]//*[text()='rahul0327']/../preceding-sibling::div//input[@type='checkbox']
	@FindBy(xpath="//div[@role='row']/div[2]//*[text()='rahul0327']/../preceding-sibling::div//input[@type='checkbox']")
	public WebElement UserNamecheckbox;


	//div[@role='r//div[@role='row']/div[2]//*[text()='rahul0327']/../following-sibling::div[4]//i[@class='oxd-icon bi-trash']ow']/div[2]//*[text()='rahul0327']/../following-sibling::div[4]//i[@class='oxd-icon bi-trash']
	@FindBy(xpath="//div[@role='r//div[@role='row']/div[2]//*[text()='rahul0327']/../following-sibling::div[4]//i[@class='oxd-icon bi-trash']ow']/div[2]//*[text()='rahul0327']/../following-sibling::div[4]//i[@class='oxd-icon bi-trash']")
	public WebElement deleteBtn;

	@FindBy(xpath="//p[text()='The selected record will be permanently deleted. Are you sure you want to continue?']")
	public WebElement  deleteText;

	@FindBy(xpath="//button[text()=' Yes, Delete ']")
	public WebElement YesDeleteBtn;
	//**********************************

	//2. Define constr  and initilaise all elements
	public SystemUsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver =  driver;
		//  current class inst var=   actual chrome browser
	}


	// 3 for each step , we have to write a seperate method

	// EnterValueInUserName
	public void EnterValueInUserName(String username)
	{
		System.out.println("EnterValueInUserName="+ username);
		UsernameTxtbox.sendKeys(username);
	}

	// Define clickSearchBtn
	public void clickSearchBtn()
	{
		System.out.println("clickSearchBtn");
		searchBtn.click();
	}

	// verify msg - (1) Record Found is displayed
	public void verifyRecordFoundMsgDisplayed()
	{
		System.out.println("verifyRecordFoundMsgDisplayed");
		boolean res =RecordFoundTxt.isDisplayed();
		if(res == true)
		{
			System.out.println("(1) Record Found is displayed");
		}
		else
		{
			System.out.println("(1) Record Found is not displayed");
		}

	}


	// 
	public void selectGivenUser(String username) throws InterruptedException
	{
		//		UserNamecheckbox.click();// Dont use hard code value
		System.out.println("select Checkbox for user= "+username);
		Thread.sleep(4000);
		try {
			driver.findElement(By.xpath("//div[@role='row']/div[2]//*[text()='" +username  + "']/../preceding-sibling::div//input[@type='checkbox']")).click();
		} 
		catch (ElementClickInterceptedException e) {
			// click by using actions
			System.out.println("click checkbox using Actions classs");
			Actions act  = new Actions(driver);
			WebElement checkboxEle=  driver.findElement(By.xpath("//div[@role='row']/div[2]//*[text()='" +username  + "']/../preceding-sibling::div//input[@type='checkbox']"));
			act.click(checkboxEle).perform();
		}


	}

	public void deleteGivenUser(String username) throws InterruptedException
	{
		//		deleteBtn.click();
		System.out.println("click delete btn where user name="+ username);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@role='row']/div[2]//*[text()='" +username+ "']/../following-sibling::div[4]//i[@class='oxd-icon bi-trash']")).click();

	}


	public void verifyTheselectedrecordwillbepermanentlydeletedMsg() throws InterruptedException
	{		
		Thread.sleep(4000);
		boolean res = 		deleteText.isDisplayed();
		if(res == true)
		{
			System.out.println("Given msg -The selected record will be permanently deleted. Are you sure you want to continue? is displayed");
		}
		else
		{
			System.out.println("Given msg -The selected record will be permanently deleted. Are you sure you want to continue? is not displayed");
		}
	}

	public void clickYesDeleteBtn()
	{
		YesDeleteBtn.click();
	}

//	createNewUser("Admin","Naoly Alvarez Alvarez","Enabled","Sitarao","admin@123", "admin@123");
//	createNewUser("ESS","Naoly Alvarez Alvarez","Enabled","Geetha","admin@123", "admin@123");
//	createNewUser("ESS","Naoly Alvarez Alvarez","Disabled","Swathirao","admin@123", "admin@123");
	
	public void createNewUser(String UserRole, String EmployeeName,String Status,String Username,String Password,String ConfirmPwd ) throws InterruptedException
	{
		//Click add +   button
		//				oxd-button oxd-button--medium oxd-button--secondary

		HomePage hpage = new HomePage(driver);
		hpage.clickAddBtn();


		// Verify - Add User page is displayed
		hpage.verifyAddUserpageDisplayed();

		//Select some value (Admin) in User Role dropdown
		hpage.selectUserRole(UserRole);


		// or selectUserRole-ESS  -->  
		// working

		// type some employee name(Orange  Test) - in "Employee Name" txt box

		//                       Orange  Test
		hpage.enterEmployeeName(EmployeeName);

		// Select some status =Enabled
		hpage.selectStatus("Enabled");

		// Type some value in 'user name' text box 
		//  Ramarao123  ramrao9868  ramarao ramarao
		Random  r =  new Random();

		int randomno = r.nextInt(10); //  generates random no b/w 0 to 9
		//        100 --                          0 -99

		System.out.println("randomno="+randomno);
		Username =Username+ randomno;
		hpage.enterUsername(Username);

		// Type some value in 'password'  text box
		hpage.EnterValueInPassword(Password);

		//// Type some value in 'Confirm password'  text box
		hpage.EnterValueInConfirmPassword(ConfirmPwd);

		Thread.sleep(5000);

		// click on Save button
		hpage.clickSaveBtn();

		// Verify  new user name is exist in table or not
		hpage.isUserNameExistInTable(Username);

	}



}

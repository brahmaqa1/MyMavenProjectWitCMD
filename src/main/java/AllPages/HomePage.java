package AllPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	WebDriver driver;//  defaul val = null

	// 1. Define all elements with locators  using @Findby annot

	// Define profileImg with xpath 
	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']/img[@alt='profile picture']")
	public WebElement profileImg;

	//// Define adminMenu xpath -//span[text()='Admin']

	@FindBy(xpath="//span[text()='Admin']")
	public WebElement adminMenu;

	// Define pimMenu;


	// system user page  -systemUserTxt;  using xpath -//h5[text()='System Users']
	@FindBy(xpath="//h5[text()='System Users']")
	public WebElement systemUserTxt;

	//		addBtn;	 classname,xpath
	// clikAddBt //butt   oxd-button oxd-button--medium oxd-button--secondary']

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	public WebElement addBtn;

	// Define AddUserTextMsg -//h6[text()='Add User']

	@FindBy(xpath="//h6[text()='Add User']")
	public WebElement AddUserTextMsg;


	// userRoleDropdown; using xpath //label[text()='User Role']/parent::div/following-sibling::div
	@FindBy(xpath = "//label[text()='User Role']/parent::div/following-sibling::div")
	public WebElement userRoleDropdown;

	//adminValInuserRoleDropdown; usin xpath= //div[@role='listbox']//*[text()='Admin']
	@FindBy(xpath = "//div[@role='listbox']//*[text()='Admin']")
	public WebElement adminValInuserRoleDropdown;


	//Exception in thread "main" org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression //label[text()='User Role']/parent::div/following-sibling::div/following-sibling::div[@role='listbox']']//*[text()='Admin'] because of the following error:
	//		SyntaxError: Failed to execute 'evaluate' on 'Document': The string '//label[text()='User Role']/parent::div/following-sibling::div/following-sibling::div[@role='listbox']']//*[text()='Admin']' is not a valid XPath expression.
	//				  (Session info: chrome=114.0.5735.199)
	// note: when we give invalid xpath, it throws 'InvalidSelectorException'

	//employeeNameTxtboxEle xpath //input[@placeholder='Type for hints...']

	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public WebElement employeeNameTxtboxEle;


	@FindBy(xpath = "//*[text()='Orange  Test']")
	public WebElement valInEmployeeNameTxtbox;


	//statusDropdownEle;//label[text()='Status']/../following-sibling::div
	@FindBy(xpath= "//label[text()='Status']/../following-sibling::div")
	public WebElement statusDropdownEle;

	@FindBy(xpath = "//*[text()='Enabled']")
	public WebElement  valuesInStatusDropdownEle;


	//UsernameTxtbox //label[text()='Username']/parent::div/following-sibling::div/input
	// //label[text()='Username']/../following-sibling::div/input
	@FindBy(xpath = "//label[text()='Username']/../following-sibling::div/input")
	public WebElement  UsernameTxtbox;


	//PasswordTxtbox;//label[text()='Password']/../following-sibling::div/input
	@FindBy(xpath = "//label[text()='Password']/../following-sibling::div/input")
	public WebElement  PasswordTxtbox;

	//ConfirmPasswordTxtbox; //label[text()='Confirm Password']/../following-sibling::div/input
	@FindBy(xpath = "//label[text()='Confirm Password']/../following-sibling::div/input")
	public WebElement  ConfirmPasswordTxtbox;

	//saveBtn; //button[@type='submit']  or //button[text()=' Save ']
	@FindBy(xpath ="//button[@type='submit']")
	public WebElement  saveBtn;


	//div[@class='oxd-table-body']/div[@class='oxd-table-card']//div[@role='row']/div[2]//*[text()='ramarao4']
	@FindBy(xpath ="//div[@class='oxd-table-body']/div[@class='oxd-table-card']//div[@role='row']/div[2]//*[text()='ramarao4']")
	public WebElement  userNameTbl;


	//searchBtn;


	//**************************

	// 2. We have to define constructor  and initialise all elements 
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		// instance var - driver
		// local var - driver
		this.driver = driver;
		 // curent intance var =            //  actual chrome browser
		//
	}


	//3 utilise all elements in reusable methods
	// // check the profile image is displayed in home page
	//		if Profile image is displayed- display -Login is succesfull
	//		else - Login is not succesfull
	// Define isProfileImageDisplayed()
	public void isProfileImageDisplayed()
	{
		boolean res = profileImg.isDisplayed();  
		//               true
		if(res)
		{
			System.out.println("Login is succesfull");
		}
		else
		{
			System.out.println("Login is not succesfull");	
		}

	}


	// Navigate to diff menu options
	// Navigate to Admin menu
//	public void clickAdminMenu()
	public void navigateToAdminMenu()
	{
		System.out.println("click Admin menu");
		adminMenu.click();
	}

	
	
	// navigateToPIMMenu


	//  verifySystemUserPageDisplayed
	public void verifySystemUserPageDisplayed()
	{
		boolean res= systemUserTxt.isDisplayed();
		if(res == true)
		{
			System.out.println("Pass.System users page is displayed");
		}
		else
		{
			System.out.println("Fail.System users page is not displayed");
		}

	}



	//clickAddBtn
	public void clickAddBtn()
	{
		System.out.println("click Add btn");
		addBtn.click();
	}


	//verifyAddUserpageDisplayed
	public void verifyAddUserpageDisplayed()
	{
		boolean res=  AddUserTextMsg.isDisplayed();
		if(res == true)
		{
			System.out.println("Pass.AddUserTextMsg is displayed");
		}
		else
		{
			System.out.println("Fail.AddUserTextMsg is not displayed");
		}

	}


	// 	selectUserRole("Admin")
	//selectUserRole("ESS")
	public void selectUserRole(String userRole)
	{
		System.out.println("click userRoleDropdown");
		userRoleDropdown.click();

		System.out.println("click Admin value in userRoleDropdown");
//		adminValInuserRoleDropdown.click();
		//div[@role='listbox']//*[text()='Admin']
		//div[@role='listbox']//*[text()='ESS']
		driver.findElement(By.xpath("//div[@role='listbox']//*[text()='" +userRole+ "']")).click();
		
	}


	//Exception in thread "main" org.openqa.selenium.support.ui.UnexpectedTagNameException: Element should have been "select" but was "div"
	//Build info: version: '3.141.59', revision: 'e82be7d358', time: '2018-11-14T08:17:03'



	// null * any method --> java.lang.NullPointerException: 



	// type some employee name(Orange test) - in Employee Name txt box
	//enterEmployeeName("Orange  Test")
	//enterEmployeeName("Naoly Alvarez Alvarez")
	public void enterEmployeeName(String EmployeeName) throws InterruptedException
	{
		System.out.println("enterEmployeeName = "+EmployeeName );
		employeeNameTxtboxEle.sendKeys(EmployeeName);
		Thread.sleep(3000);

		System.out.println("Select Orange Test from auto suggestions");
//		valInEmployeeNameTxtbox.click();	
		//*[text()='Orange  Test']
		//*[text()='Naoly Alvarez Alvarez']
		driver.findElement(By.xpath("//*[text()='" +EmployeeName+ "']")).click();		
		
	}



	// Select some status =Enabled
	//			selectStatus("Enabled")
	//			selectStatus("Disabled");
	public void selectStatus(String expStatus)
	{

		System.out.println("select status = enabled");
		statusDropdownEle.click();
//		valuesInStatusDropdownEle.click();
		
		//*[text()='Enabled']
		//*[text()='Disabled']
		driver.findElement(By.xpath("//*[text()='"+expStatus+"']")).click();	
		
	}


	// Type some value in user name text box 
	public void enterUsername(String val)
	{
		System.out.println("enterUsername="+val);
		UsernameTxtbox.sendKeys(val);

	}

	// Type some value in password  text box
	//			EnterValueInPassword("Test@123321")
	public void EnterValueInPassword(String val)
	{
		System.out.println("EnterValueInPassword="+val);
		PasswordTxtbox.sendKeys(val);		
	}


	//// Type some value in Confirm password  text box
	//EnterValueInConfirmPassword("Test@123321")
	public void EnterValueInConfirmPassword(String val)
	{
		System.out.println("EnterValueInConfirmPassword="+val);
		ConfirmPasswordTxtbox.sendKeys(val);		
	}


	// clikc on Save button
	public void clickSaveBtn()
	{
		System.out.println("clickSaveBtn");
		saveBtn.click();
	}


	//verify user name is exist in table //div[@class='oxd-table-body']/div[@class='oxd-table-card']//div[@role='row']/div[2]//*[text()='ramarao4']

	public void isUserNameExistInTable(String username)
	{
		//		boolean res=		userNameTbl.isDisplayed();
		String myxpath = "//div[@class='oxd-table-body']/div[@class='oxd-table-card']//div[@role='row']/div[2]//*[text()='" +username+ "']";
		System.out.println("driver ="+ driver); // null
		
		boolean res =		driver.findElement(By.xpath(myxpath)).isDisplayed();
		//                      null *  any method  --> NullPointerException:
		if(res == true)
		{
			System.out.println("Given user "+username+"  is exist in table" );
		}
		else
		{
			System.out.println("Given user "+username+"  is not exist in table" );
		}

	}


	//searchForGivenUser






}

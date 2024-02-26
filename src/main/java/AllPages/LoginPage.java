package AllPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

	// 1. define elements with locators(name, id, class, xpath, cssSelector, 
	//		linktext, partial linktext
	//		 tagname..)

	// @FindBy is annotation -used to find ele with given loc name = loc value
	// syntax : @FindBy(loc name = "loc val")

	// Define userNameTxtbox with name 	
	@FindBy(name="username")
	public WebElement userNameTxtbox;


	//Define pwdTxtbox using name
	@FindBy(name="password")
	public WebElement pwdTxtbox;


	//login	btn -class="oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"
//	@FindBy(className = "oxd-button oxd-button--medium oxd-button--main orangehrm-login-button")
	@FindBy(xpath ="//button[@type='submit']")
	public WebElement loginBtn;


	// HW  Forgot your password?

	//		@FindBy(className = "oxd-text oxd-text--p oxd-alert-content-text")// not working
//	@FindBy(xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")

	//Define InvalidcredentialsTxtMsg  -//p[text()='Invalid credentials']
	@FindBy(xpath = "//p[text()='Invalid credentials']")
	public WebElement InvalidCredentialsTxtMsg;


//************************************************************************
	// 2. We have to define constructor  and initialise all elements  and pass driver ref var
	
	public LoginPage(WebDriver driver)// 	//  1 PC
	{
		PageFactory.initElements(driver, this);
		//// initialise all elements 

		// can be used to initalise all elements with locators of current class
		
		//driver.findElement(By.name("firstname"));//  now onwards we dont use this line
	}


	//3. define reusable method and utilize all defined elements
	// for each step , I will define seperate method 

	// Enter user name in user name text box
//	enterUserName("Admin");
	public void enterUserName(String user)
	{                             // admin
		System.out.println("Enter user="+user);
		userNameTxtbox.sendKeys(user);
		// null * any method --> Null pointer exception
	}


	// Enter pwd in pwd text box
	// enterPassword("Admin123")
	public void enterPassword(String pwd)
	{
		System.out.println("Enter pwd="+pwd);
		pwdTxtbox.sendKeys(pwd);
	}

	// Click login btn
	public void clickLoginBtn()
	{
		System.out.println("Click Login button");
		loginBtn.click();
	}



	// Define loginToAppl() and pass username, pwd


	//// Verify 'Invalid credentials' msg is displayed
	// Define verifyInValidCrednetialsMsg()// 
	public void verifyInValidCrednetialsMsgDisplayed()
	{		
		boolean res= InvalidCredentialsTxtMsg.isDisplayed();
		if(res == true)
		{
			System.out.println("Pass.InvalidCredentialsTxtMsg  is displayed ");
		}
		else
		{
			System.out.println("Fail.InvalidCredentialsTxtMsg  is not displayed ");
		}
		
	}
	
	// Define loginToApplication()
	public void loginToApplication(String username,String pwd)
	{
		enterUserName(username);
		enterPassword(pwd);
		clickLoginBtn();		
	}


}

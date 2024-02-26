package Selenium4NewFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorsBasics1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
//		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver  = new ChromeDriver();

		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
		
		// Relative locators can be used locate the element based on location of element i.e left to the ele, right to the ele, above ele
		// below ele, near ele.
		Thread.sleep(5000);
		
		// identify 'first name" textbox with "last name textbox
		driver.findElement(RelativeLocator.with(By.name("firstname")).toLeftOf(By.name("lastname"))).clear();
		
		driver.findElement(RelativeLocator.with(By.name("firstname")).toLeftOf(By.name("lastname"))).sendKeys("Rama");
		
	

		//identify "last name" text box   with reference of first name 
		driver.findElement(RelativeLocator.with(By.name("lastname")).toRightOf(By.name("firstname"))).sendKeys("Rao");
		
		
		// HW Testfield
		
		// HW Password
		
		//  below
		// click 'I have a bike checkbox using 'Male'  radio btn
		driver.findElement(RelativeLocator.with(By.xpath("//input[@id='bikeid'][@name='bike'][@value='Bike']")).below(By.id("maleid"))).click();
		
		
		// above
		// HW Clikc 'male radio' btn using I have a bike' chkbox 
		
		// HW Click 'Fe male radio' btn using I have a bike' chkbox 		
	
		
		// near  50 
//		If the relative positioning is not obvious, or it varies based on window size, 
		//you can use the near method to identify an element that is at most 50px away 
		//from the provided locator
		
		driver.findElement(RelativeLocator.with(By.xpath("//input[@type='password']")).near(By.name("lastname"))).sendKeys("near pwd elee");
				
//		
////	identify input tag  to near last name text box 	
		driver.findElement(RelativeLocator.with(By.tagName("input")).near(By.name("lastname"))).sendKeys("near ele - pwd");			
		
//		identify input tag  to near first name text box 
		driver.findElement(RelativeLocator.with(By.tagName("input")).near(By.name("firstname"))).sendKeys("near ele-Test field ");
		
//		
//		




	}

}

package Selenium4NewFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchNewWindow {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		// //open chrome browser
		driver = new ChromeDriver();

//
//		// open given url in browser
//		driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html"); 
//
//
//		Thread.sleep(5000); 
//		// open new window and switch to that window //
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		
////	
//
////		 driver.switchTo().window(WindowType.WINDOW);// dont use this //
//
//		
//
//		// open some url in 2nd browser driver.get("https://www.google.com/");
//		driver.get("https://www.google.com/");
//		//  here driver refere browser-2
//
//		// search Rama in google driver.findElement(By.name("q")).sendKeys("Rama");
//		driver.findElement(By.name("q")).sendKeys("Rama");
//
		// ********************
//		tab handling:
		
		//		// open given url ib browser

		//		
				  driver.get("file:///C:/brahma/Practise/qtp%20practise/web%20apps/ALL%20Web%20objects.html");
				  Thread.sleep(5000);
		//		  
				  // open new tab and swicth control to new tab//
				  driver.switchTo().newWindow(WindowType.TAB);
				  
//				  driver.switchTo().newWindow(WindowType.TAB);
				  
				  
		//		  driver.switchTo().window(WindowType.WINDOW);// dont use this
		//		  driver.switchTo().newWindow(WindowType.TAB); // tab-1
				  
				  // open some url in 2nd  tab 
				  driver.get("https://www.google.com/");		  
				  
				  // search Rama in google 
				  driver.findElement(By.name("q")).sendKeys("Rama");
				  Thread.sleep(5000);
				  
				  // open new tab  and Swicth to new tab  --tab3
				  driver.switchTo().newWindow(WindowType.TAB);
				 
				  // open https://www.facebook.com/ in tab3 
				  driver.get("https://www.facebook.com/");//https://www.facebook.com/
				  
		//		  
		// HW open new tab and open amazon.com


	}

}

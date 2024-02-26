package Log4jBasics;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Log4jBasics2 
{
	@Test
	public void CreateOrder()
	{
		// Log msgs in Extent reports
		//		  ExtentReports, ExtentTest
		Logger l = Logger.getLogger("sita");

		// log msgs
		//CreateOrder -started
		l.debug("CreateOrder -started");

		// 1.Open chrome browser
		l.debug("1.Open chrome browser");
		

		// log info msg. info()
		
		l.info(" info msg1");

		//log error - error()
		
		l.error("error msg");
		
		// HW  log all below msgs 
//		2.Enter user name
		
//		3.Enter pwd
//		4.click login button
//		5.Verify Home page is dispalyed"	
//
//		6.Search for Product
//		7.Add qty  
//		8. Add to cart and Proceed with payment 

	}
}


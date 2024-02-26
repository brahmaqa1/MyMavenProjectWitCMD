package Log4jBasics;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class OptimisedLog4jBasics2  extends TestBase
// gte parent class var log ' from test base class
{
	@Test
	public void CreateOrder()
	{
		// Log msgs in Extent reports
		//		  ExtentReports, ExtentTest
//		Logger l = Logger.getLogger("sita");

		// log msgs
		//CreateOrder -started
		log.debug("CreateOrder -started");

		// 1.Open chrome browser
		log.debug("1.Open chrome browser");
		

		// log info msg. info()
		
		log.info(" info msg1");

		//log error - error()
		
		log.error("error msg");
		
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


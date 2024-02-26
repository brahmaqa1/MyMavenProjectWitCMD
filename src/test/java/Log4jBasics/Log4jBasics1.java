package Log4jBasics;
import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Log4jBasics1 {

	@Test
	public void LoginTC1()
	{
		// In Java, we can send msgs to console window 
		//1.Open chrome browser
		System.out.println("1.Open chrome browser");
		//2.Enter user name
		System.out.println("2.Enter user name");

		//3.Enter pwd
		System.out.println("4.click login button");
		System.out.println("5.Verify Home page is displayed");

		// Testng :we can send msgs in testNG reports 
		//  2. index.html 2. emailable-report.html
		

		//1.Open chrome browser
		Reporter.log("1.Open chrome browser");

		//2.Enter user name
		Reporter.log("2.Enter user name");

		//3.Enter pwd

		//4.click login button
		//5.Verify Home page is displayed

		// Log msgs in Extent reports
		//		  ExtentReports, ExtentTest
		// extest.log(logstatus.pass, " msg 1");

		// to log msgs in logger files -Logger.getLogger("Ram");

		 Logger log =   Logger.getLogger("Ram");
		
		// log msgs in logger file - debug()
		 log.debug("1.Open chrome browser");

		//
		 log.debug("2.Enter user name");

		//
		 log.debug("3.Enter pwd");

		//4.click login button
		 log.debug("4.click login button");

		//5.Verify Home page is displayed	
		 log.debug("5.Verify Home page is displayed");
		 
		 log.debug("6.new log msgs ");


	}

}

package ExtentReportsBasics;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReports1 {

	@Test
	public void testA()
	{
		System.out.println("stmt-1 from testA");
		
		// create extent -reports1.html file
		String reportsFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\Nov2023WorkSpace\\MyMavenProjectWitCMD\\ExtentReportsBasics\\MyExtentReports.html"; 
		
		// Create object for -ExtentReports class and pass file name
			ExtentReports  exRepo = new ExtentReports(reportsFile);

		//  to start test and display Test name in Report -TC01: Login Test
			ExtentTest exTest =	exRepo.startTest("TC01: Login Test");// ????

		//Log diff msgs in reports(pass,fail, info, warning..etc)
		//log 'pass' msgs in extent report
	
		//  1.Open Browser
		//  2.Enter url
			exTest.log(LogStatus.PASS, "1.Open Browser");
			exTest.log(LogStatus.PASS, "2.Enter url");

		// Log 'fail'  msgs in extent reports		
		// 3.enter user name
		// 4.enter password
			exTest.log(LogStatus.FAIL, "3.enter user name.Unable to view user name textbox");
			exTest.log(LogStatus.FAIL, "4.enter password.Unable to view pwd textbox");

		//HW  send  some'info' msg in extent reports
		
		//HW send some 'warning' msg  in extent reports

		// to end test  and  pass extent test ref var - check results
				exRepo.endTest(exTest);
		
		
		// to view reports -at the end , we have to class flush(); 
		// if we dont write  this line, results file will not be created
				exRepo.flush();

	}


}

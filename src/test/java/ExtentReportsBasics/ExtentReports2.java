package ExtentReportsBasics;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReports2 {

	ExtentReports  exRepo;
	ExtentTest exTest;

	@BeforeTest
	public void generateReportOnce()
	{
		// create extent -reports1.html file
		String reportsFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\Nov2023WorkSpace\\MyMavenProjectWitCMD\\ExtentReportsBasics\\MyExtentReports.html"; 

		// Create object for -ExtentReports class and pass file name
		//					ExtentReports  exRepo = new ExtentReports(reportsFile);
		exRepo = new ExtentReports(reportsFile);

	}
	
//	@BeforeMethod
//	public void startTest()
//	{
//		exTest =	exRepo.startTest("TC01: Login Test");
//	}


	@Test
	public void testA()
	{
		System.out.println("stmt-1 from testA");

		// create extent -reports1.html file
		//		String reportsFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\Nov2023WorkSpace\\MyMavenProjectWitCMD\\ExtentReportsBasics\\MyExtentReports.html"; 

		// Create object for -ExtentReports class and pass file name
		//			ExtentReports  exRepo = new ExtentReports(reportsFile);
		//			  exRepo = new ExtentReports(reportsFile);

		//  to start test and display Test name in Report -TC01: Login Test
		//			ExtentTest exTest =	exRepo.startTest("TC01: Login Test");// ????
//		exTest =	exRepo.startTest("TC01: Login Test");// ????

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

		//		// to end test  and  pass extent test ref var - check results
		//				exRepo.endTest(exTest);
		//		
		//		
		//		// to view reports -at the end , we have to class flush(); 
		//		// if we dont write  this line, results file will not be created
		//				exRepo.flush();

	}

	@Test
	public void testB()
	{
		//testB: TC02: Create Order
//		exTest = exRepo.startTest("TC02: Create Order");

		//Search for Product
		exTest.log(LogStatus.PASS, "Search for Product");

		//Select the Samsung mobile
		exTest.log(LogStatus.PASS, "Select the Samsung mobile");

		// add 2 qty
		exTest.log(LogStatus.PASS, "add 2 qty");
		
		exTest.log(LogStatus.PASS, "3.add 2 qty");

	}
	
	@Test
	public void testC()
	{
		
//		exTest = exRepo.startTest("TC03: Delete Order");

		exTest.log(LogStatus.PASS, "delete  Product from cart");	

	}

	@AfterTest
	public void endReport()
	{

		// to end test  and  pass extent test ref var - check results
		exRepo.endTest(exTest);
		// to view reports -at the end , we have to class flush(); 
		// if we dont write  this line, results file will not be created
		exRepo.flush();
	}





}

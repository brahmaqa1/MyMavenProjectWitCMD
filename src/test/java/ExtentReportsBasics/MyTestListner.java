package ExtentReportsBasics;

import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyTestListner implements ITestListener
{

	public static ExtentReports exRepo;
	public static ExtentTest exTest;// default null
	
	@Override
	public void onStart(ITestContext context) 
	{
		//		ITestListener.super.onStart(context);
		//exRep =  new ExtentReports(ResFile);
		// Reports will be created only once time
		
		 Date d  = new Date();
		 System.out.println("d="+ d);
		 //Sun Feb 11 11:00:59 IST 2024
		 // file name - we dont want spaces and : symbols
		 // Remove spaces and : -->   SunFeb11110059IST2024  
//		 Replace space by ""
//		 Replace :  by ""
		 
		// convert date class obj to String 
		String sdate =  d.toString();
		sdate = sdate.replace(" ", "_");
		sdate = sdate.replace(":", "_");
		System.out.println("sdate="+ sdate);		 
		 
		String reportsFile = "C:\\brahma\\Practise\\SelniumPractiseNew\\Nov2023WorkSpace\\MyMavenProjectWitCMD\\ExtentReportsBasics\\MyExtentReports"+sdate+".html";
//							  C:\brahma\Practise\SelniumPractiseNew\Nov2023WorkSpace\MyMavenProjectWitCMD\ExtentReportsBasics\MyExtentReportsSun Feb 11 11:00:59 IST 2024.html (The filename, directory name, or volume label syntax is incorrect)
		// Create object for -ExtentReports class and pass file name
		  exRepo = new ExtentReports(reportsFile);  

	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		//		ITestListener.super.onTestStart(result);
		
		// get Test Method name in run time
		String Name= 	 result.getName();

			System.out.println("TestMethodName="+Name);

			System.out.println("Test= " +Name +" started execution");

		
		//  gets executed for each @Test Method
		//		exTest = exRepo.startTest("testA: TC01: Login Test");
		
//		   exTest =   exRepo.startTest("Test A");
		   exTest =   exRepo.startTest(Name);	
		   exTest.log(LogStatus.PASS, "Test Case ="+Name  + " started execution");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//		ITestListener.super.onTestSuccess(result);
		String Name= 	 result.getName();
		System.out.println("TestMethodName="+Name);
		
		exTest.log(LogStatus.PASS, "Test Case ="+Name  + " passed succesfully");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//		ITestListener.super.onTestFailure(result);
		
		//  //   take screen shot code
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		//		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		//		ITestListener.super.onFinish(context);
		// 		at end - we have to endtest and 

			exTest.log(LogStatus.PASS, "All Test cases execution finished");
			exRepo.endTest(exTest);
		// to view reports -flush(); 
		// if we dont write  this line, results file will not be created

			exRepo.flush();
	}
}

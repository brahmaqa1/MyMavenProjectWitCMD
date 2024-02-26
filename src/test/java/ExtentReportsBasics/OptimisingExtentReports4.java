package ExtentReportsBasics;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

//@Listeners(MyTestListner.class)
public class OptimisingExtentReports4 extends MyTestListner
{

	@Test
	public void TC02CreateOrder()
	{
		//testB: TC02: Create Order
//		exTest = exRepo.startTest("TC02: Create Order");

		//Search for Product
		exTest.log(LogStatus.PASS, "Search for Product");

		//Select the Samsung mobile
		exTest.log(LogStatus.PASS, "Select the Samsung mobile");

		// add 2 qty
		exTest.log(LogStatus.PASS, "add 2 qty");
		
	

	}
}

package Log4jBasics;
import org.apache.log4j.Logger;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class OptimisedLog4jBasics1 extends TestBase
{

	// get paret class var  'log; var  from 'test base' clas 
	
	@Test
	public void LoginTC1()
	{
		
		
		// to log msgs in logger files -Logger.getLogger("Ram");

//		 Logger log =   Logger.getLogger("Ram");
		
		TestBase tb = new TestBase();
		tb.log.debug("debug msgs-1");
		
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

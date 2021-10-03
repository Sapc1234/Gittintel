package RepeatTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class class4 

{

	
	@Test(groups= {"Smoke"})
	public void WebLoginHomeLoan()
	
	{
		//selenium
		System.out.println("WebLoginHomeLoan");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan()
	
	{
		//Appium
		System.out.println("MobileLoginHomeLoan");
	}

	@Test
	public void MobileSigninHomeLoan()
	
	{
		//Appium
		System.out.println("MobileSigninHomeLoan");
		System.out.println("MobileSigninHomeLoan2");
		System.out.println("MobileSigninHomeLoan3");
		System.out.println("MobileSigninHomeLoan3");
		System.out.println("MobileSigninHomeLoan4");
	}

	@Test
	public void MobileSignoutHomeLoan()
	
	{
		//Appium
		System.out.println("MobileSignoutHomeLoan");
	}
	@Test
	public void LoginApIHomeLoan()
	
	{
		//Rest ApI automation
		System.out.println("LoginApIHomeLoan");
	}
	
	@Test
	public void WebLogincropLoan()
	
	{
	
		System.out.println("WebLogincropLoan");
	}

}

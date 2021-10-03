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
	
	@Test
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

}

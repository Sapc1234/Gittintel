package RepeatTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class class3

{
	@BeforeClass
	public void beforeclass()

	{
		System.out.println("Before Executing all the methods in class");
	}

	@AfterClass
	public void afterclass()

	{
		System.out.println("After Executing all the methods in class");
	}

	@BeforeSuite // it will execute Before execute any test in the xml file
	public void bfsuite()

	{
		System.out.println("I am at Number One");
	}

	@AfterSuite // It will only execute once all the tests completed and all the test folders
	public void afsuite()

	{
		System.out.println("I am in the Last Number");
	}

	@BeforeMethod

	public void beforerecovery()

	{
		System.out.println("I Will Execute Before Recovery");
	}

	@AfterMethod

	public void afterRecovery()

	{
		System.out.println("I will execute after Recovery");
	}

	@Test(groups = { "Smoke" })
	public void WebLogincarLoan()

	{
		// selenium
		System.out.println("WebLogincarLoan");
	}

	@Test(dataProvider= "getData")
	public void WebLogoutcarLoan(String username ,String password)

	{
		// selenium
		System.out.println("WebLogoutcarLoan");
		
		System.out.println(username);
		System.out.println(password);
	}

	@Parameters({ "URL", "APIkey/userName" })
	@Test
	public void MobileLogincarLoan(String urlname, String key)

	{
		// Appium
		System.out.println("MobileLogincarLoan");
		System.out.println(urlname);
		System.out.println(key);
	}

	@Test(dependsOnMethods = { "WebLogincarLoan", "MobileLogincarLoan" })
	public void ApIcarLoan()

	{
		// Rest ApI automation
		System.out.println("LoginApIcarLoan");
	}

	@DataProvider

	public Object[][] getData()

	{
		Object[][] data = new Object[3][2];

		// 1set

		data[0][0] = "firstusername";
		data[0][1] = "firstPassword";

		// 2nd set

		data[1][0] = "Secondusername";
		data[1][1] = "secondpassword";

		// 3rd set

		data[2][0] = "Thirdusername";
		data[2][1] = "Thirdpassword";
		
		return data;
	}

}

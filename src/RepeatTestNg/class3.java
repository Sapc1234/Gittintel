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
		System.out.println("Before executing all the methods in class1 ");
		
	}

	@AfterClass
	public void afterclass()

	{
		System.out.println("After Executing all the methods in class");
		System.out.println("After Executing all the methods in class1");
	}

	@BeforeSuite // it will execute Before execute any test in the xml file
	public void bfsuite()

	{
		System.out.println("I am at Number One");
		System.out.println("before executing any test in the xml file");
	}

	@AfterSuite // It will only execute once all the tests completed and all the test folders
	public void afsuite()

	{
		System.out.println("I am in the Last Number");
		System.out.println("it will execute once all the tests completed and all the folders");
	}

	@BeforeMethod

	public void beforerecovery()

	{
		System.out.println("I Will Execute Before Recovery");
		System.out.println("it will execute before each and every method");
	}

	@AfterMethod

	public void afterRecovery()

	{
		System.out.println("I will execute after Recovery");
		System.out.println("it will execute after each and every method");
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

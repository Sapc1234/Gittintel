package RepeatTestNg;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class class1
{

@AfterTest
public void lastexecution()

{
	System.out.println("I Will execute Last");
	
}
@Test(groups= {"Smoke"})
public void demo()

{
	System.out.println("hello");
	
}

@BeforeTest()

public void first()

{
	System.out.println("I will execute first");
}
@Parameters({"URL"})
@Test
public void secondTest(String uname)
{
	System.out.println("bye");
	System.out.println(uname);
}

@Parameters({"URL"})
@Test
public void third(String uname)
{
	System.out.println("hi");
	System.out.println(uname);
}
	
	
	
}

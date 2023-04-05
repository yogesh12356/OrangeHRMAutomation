package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG2 {
	@Parameters ({"browserName"})
	
 	/*@BeforeSuite
	
	public void beforeSuite()
	{
		System.out.println("BeforesSuite of Class2");
	}
	
	*/
    @BeforeTest

    public void beforeTest(String browserName)
   {
	if(browserName.equals("chrome"))
	{
		System.out.println("Opening the chrome browser");
	}
	else if(browserName.equals("firefox"))
	{
		System.out.println("Opening the firefox browser");
	}
	
   }
	@BeforeClass
	
	public void beforeclass()
	{
		System.out.println("BeforeClass of Class2");
	}
	
	@BeforeMethod
	
	public void beforemethod()
	{
		System.out.println("BeforeCmethod of Class2");
	}
	
	@Test
	
	public void Test1() 
	{
		System.out.println("Test1 of Class2");
	
	}
	
    @Test
	
	public void Test2()
	{
		System.out.println("Test2 of Class2");
	}

    @Test

    public void Test3()
    {
	System.out.println("Test3 of Class2");
    }


	@AfterMethod

	public void afteremethod()
	{
		System.out.println("aftermethod of Class2");
	}
	
	@AfterClass
	
	public void afterclass()
	{
		System.out.println("beforeClass of Class2");
	}
	
	@AfterSuite
		
		public void afterSuite()
		{
			System.out.println("afterSuite of Class2");
		}
	
		
}

package TestNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testUtility.StaticBrowser;



public class TestNG1 {
	static WebDriver driver;
 		
	@BeforeClass
			
  public void beforeclass()
	{
	WebDriver driver=StaticBrowser.openBrowser("chrome","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	System.out.println("BeforeClass of Class1");
	}
			
	@BeforeMethod
			
	public void beforemethod()
		{
    	System.out.println("BeforeCmethod of Class1");
		}
			
	@Test
			
	public void Test1() throws InterruptedException
	 {
		System.out.println("Test1 of Class1");
	}
			
	 @Test
			
	public void Test2()
	 {
		System.out.println("Test2 of Class1");
	}

	@Test

	 public void Test3()
     {
	   System.out.println("Test3 of Class1");
	 }


			@AfterMethod

			public void afteremethod()
			{
				System.out.println("aftermethod of Class1");
			}
			
			@AfterClass
			
			public void afterclass()
			{
				System.out.println("beforeClass of Class1");
			}
	
		
		}



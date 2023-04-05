   package TestNG;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pom.Loginpage;
import testUtility.ReadFileData;
import testUtility.StaticBrowser;

public class LoginTestNG extends Baseclass {
	
//	static WebDriver driver;
	Loginpage login;
	ReadFileData r;
	@BeforeClass
		public void beforeclass() 
	{
		login = new Loginpage(driver);
	}
		@BeforeMethod
		public void beforemethod()
	{
		System.out.println("BeforeCmethod");
	}
   @Test

	public void VerifyLogininFunctionalityWithCorrectData() throws IOException, InterruptedException
	{
	   Logger = Report.createTest("Verify Loginin Functionality With Correct Data");
	     SoftAssert s= new SoftAssert();
		login.sendUsername(r.fetchDataFromExcel(1,0));
		login.sendPassword(r.fetchDataFromExcel(1,1));
		login.ClickonLoginButton();
		Thread.sleep(1000);
		//String ExceptedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		//String cuttentURL= driver.getCurrentUrl();
		//s.assertEquals(cuttentURL, ExceptedURL);
		WebElement el = driver.findElement(By.xpath("//img[@alt=\"client brand logo\"]/ancestor::a"));
    	File source= el.getScreenshotAs(OutputType.FILE);
 		File dest = new File("C:\\Users\\Admin\\eclipse-workspace\\HRM\\test-output\\Screenshot\\temp.png");
		FileHandler.copy(source, dest);
	  
		boolean result=Loginpage.CheckvisiblityofAdminTab();
 	    System.out.println("Soft Assert is executed");
	    Assert.assertFalse(result);
	    System.out.println("Test case ended");
		s.assertAll();
	}
		
	
    @Test
	
    public void VerifyLogininFunctionalityWithIncorrectData() throws  InterruptedException
	{
    Thread.sleep(1000);
    Logger = Report.createTest("Verify Loginin Functionality With InCorrect Data");
	System.out.println("VerifyLogininFunctionalityWithIncorrectData");
	Assert.fail();
		
	
//String ExceptedURL = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
	}

    @Test

    public void VerifyAdmin()
    {
	System.out.println("VerifyAdmin");
    }


	
	@AfterClass
	
	public void afterclass()
	{
		driver.close();
	}
	
	
}

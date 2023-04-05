package Pom;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage

{
	WebDriver driver;
	
	@FindBy(xpath="//input[@Name='username']")
	private WebElement Username;
	
	@FindBy(xpath="//input[@Name='password']")
	private WebElement Password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement LoginButton;
	
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void sendUsername(String uName)
	{
		Username.sendKeys(uName);
	}
	public void sendPassword(String pass)
	{
		Password.sendKeys(pass);
	}
	public void ClickonLoginButton()
	{
		LoginButton.click();
		
	}
	  public static boolean CheckvisiblityofAdminTab()
	    {
	    	return false;
	
	    }
}

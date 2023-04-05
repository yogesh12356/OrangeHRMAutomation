package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	
	@FindBy(xpath="//*[text()='Admin']")
	private WebElement Admin;
	
	@FindBy(xpath="//*[contains(@class,'oxd-input oxd-input--active')]) [2]")
	private WebElement UseName;
	
    public AdminPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
    public void ClickOnAdmin()
    {
    	Admin.click();
    }
    public void sendUserName(String Uname)
    {
    	UseName.sendKeys(Uname);
    }
}

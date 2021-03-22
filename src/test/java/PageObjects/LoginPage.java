package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
      WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		driver=ldriver;
		PageFactory.initElements(ldriver, this);
	}
	@FindBy(name="Email")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(name="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//*[text()='Log in']")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//a[text()='Logout']")
	@CacheLookup
	WebElement logout;
	
	public void setUserName(String uname)
	{
		txtUsername.clear();
		txtUsername.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
	public void clickLogout()
	{
		logout.click();
	}

}

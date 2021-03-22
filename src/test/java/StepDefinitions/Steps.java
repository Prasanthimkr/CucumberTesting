package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.LoginPage;
import io.cucumber.java.en.*;


public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers/chromedriver.exe");
		driver = new ChromeDriver();
		lp=new LoginPage(driver);
	    
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	  driver.get(url);
	}

	@When("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
	   
		lp.setUserName(email);
		lp.setPassword(password);
		
	}

	@When("click on login")
	public void click_on_login() {
	  lp.clickSubmit();
	}

	@Then("Page title should be {string}")
	public void page_title_login(String title) {
		
		if(driver.getPageSource().contains("Login was unsuccessful"))
		{
			driver.close();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertEquals(title,driver.getTitle());
		}
	    
	}

	@When("User click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
		lp.clickLogout();
		Thread.sleep(3000);


	}

	@Then("Page Title should be {string}")
	public void page_title_logout(String title) {
		
		if(driver.getPageSource().contains("Login was unsuccessful"))
		{
			driver.close();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertEquals(title,driver.getTitle());
		}
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
	   
	}

}

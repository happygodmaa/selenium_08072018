package com.freeCRM.TestCase;

//import org.testng.Assert;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.freeCRM.Page.HomePage;
import com.freeCRM.Page.LoginPage;
import com.freeCRM.TestBase.TestBase;

public class LoginPageTest extends TestBase{
	
	public LoginPage LoginP;
	public HomePage HomeP;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		LoginP= new LoginPage();
	}
	/*
	@Test(priority=1)
	public void PageTitleTest() {
		String title= loginP.ValidateLoginPageTitle();
		Assert.assertEquals(title, "Free CRM software in the cloud powers sales and customer service");
	}
*/
	@Test
	public void LoginTest() {
		LoginP.ValidateLogin(p.getProperty("user"), p.getProperty("pass"));
	}
		
	/*
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	*/
	
}
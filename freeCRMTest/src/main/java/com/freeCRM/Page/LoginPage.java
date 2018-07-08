package com.freeCRM.Page;

	
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

import com.freeCRM.TestBase.TestBase;
	
	public class LoginPage extends TestBase{

		@FindBy(name="username")
		WebElement User;
		
		@FindBy(id="lst-ib")
		WebElement search;
		
		@FindBy(xpath="//a[contains(text(), 'Sign Up')]")
		WebElement Sign;

		@FindBy(name="password")
		WebElement Pass;
		
//		@FindBy(className="btn btn-small")
//		@FindBy(xpath="//input[@type='submit']")
		@FindBy(css=".btn.btn-small")
		WebElement Login;
		
//		@FindBy(xpath="//*[@id="header-xs"]/div[1]/a/img")
//		WebElement imgButton;

		//initialize the page
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions
		public String ValidateLoginPageTitle(){
			return driver.getTitle();
		}
			//public boolean ValidateImage(){
			//return imgButton;
	public HomePage ValidateLogin(String un, String pwd){	
			User.sendKeys(un);
			Pass.sendKeys(pwd);
			Login.click();
			return new HomePage();
		}
		
	}

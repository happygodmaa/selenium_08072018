package com.freeCRM.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freeCRM.TestBase.TestBase;

public class HomePage extends TestBase{

	//PageFactory-Object Repository
	
	@FindBy(xpath="//a[@title='Contacts']")
	WebElement contact;
	
	@FindBy(xpath="//td[contains(text(), 'User: nikhil kumar')]")
	WebElement user;
	
	public HomePage() {
		PageFactory.initElements(driver, this);	
	}
	
	public ContactsPage VerifyContacts() {
		contact.click();
		return new ContactsPage();
	}
}

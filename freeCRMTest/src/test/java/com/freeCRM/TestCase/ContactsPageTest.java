package com.freeCRM.TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.freeCRM.Page.ContactsPage;
import com.freeCRM.Page.HomePage;
import com.freeCRM.Page.LoginPage;
import com.freeCRM.TestBase.TestBase;

public class ContactsPageTest extends TestBase {

	ContactsPage ContactsP;
	LoginPage LoginP;
	HomePage HomeP;
	
	public ContactsPageTest() {
		super();
		}
	
	@BeforeMethod
	public void setup() {
		initialization();
		LoginP.ValidateLogin(p.getProperty("user"), p.getProperty("pass"));
		ContactsP= new ContactsPage();
		
	}
		
	@Test()
	public void OwnerTest() {
	Assert.assertEquals(ContactsP.ValidateOwner(), "nikhil kumar");
	}
	
	
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
		
		
	}


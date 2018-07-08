package com.freeCRM.Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.freeCRM.TestBase.TestBase;

public class ContactsPage extends TestBase {

		@FindBy(xpath="//option[contains(text(),415298)]")
		WebElement Owner;
	
		@FindBy(xpath="//td[contains(text(), 'contacts') AND @class=datacardtitle]")
		WebElement Contact;
		

public ContactsPage() {
PageFactory.initElements(driver, this);	

}

public WebElement ValidateOwner() {
	return Owner;
	
}





}



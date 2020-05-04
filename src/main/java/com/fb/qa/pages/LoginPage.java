package com.fb.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class LoginPage  extends TestBase{

	
	@FindBy(name="email")
	WebElement UserNam;
	
	@FindBy(name="pass")
	WebElement PassField;
	
	@FindBy(xpath="//input[contains(@id,'u_0_b')]")
	WebElement LoginButton;

	
	public LoginPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

	public HomePage login(String username, String password) throws IOException {
		UserNam.sendKeys(username);
		PassField.sendKeys(password);
		LoginButton.click();
		
		return new HomePage();
		
	}
		
	

}

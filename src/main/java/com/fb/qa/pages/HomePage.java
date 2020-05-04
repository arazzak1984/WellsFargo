package com.fb.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fb.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy()
	WebElement notdefiedyet;
	//kcbkzkhh
	// ididn't create any repositry and method yet
	// i just created homepage test class just to show you 
	//go create everything
	public HomePage() throws IOException {
		super();	
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	

	
	
	
	
	
	
}

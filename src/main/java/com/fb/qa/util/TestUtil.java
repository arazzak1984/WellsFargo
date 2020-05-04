package com.fb.qa.util;

import java.io.IOException;

import com.fb.qa.base.TestBase;

public class TestUtil extends TestBase  {
    
	public TestUtil() throws IOException {
		super();
		
	}

	public static long Page_Load_Timeout = 20;
    public static long Implicit_Wait = 10;
    
    public static String TestData_Sheet_Path="C:\\Eclipse Area\\NaveenFrameworkStructure_POM\\src\\main\\java\\com\\fb\\qa\\testdata\\SeleniumDDF.xlsx";
    
	public void switchFrame() {
		driver.switchTo().frame("name");
	}
	
	// For ddf , to read data from xl, not done yet , do it :--->
	
	public static Object[][] getTestData(){
		return null;
		
	}
	
	
	
}

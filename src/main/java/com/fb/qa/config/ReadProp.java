package com.fb.qa.config;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class ReadProp {

	public static void main(String[] args) throws IOException {
		WebDriver driver = null;
		Properties prop=new Properties();
		FileInputStream ip =new FileInputStream("C:\\Eclipse Area\\NaveenFrameworkStructure_POM\\src\\main\\java\\com\\fb\\qa\\config\\config.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("browser"));
		
		String BrowserName = prop.getProperty("browser");
if(BrowserName.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Driver Latest/chromedriver.exe");
	  driver=new ChromeDriver();
}
else if (BrowserName.equals("FF")) {
	  driver=new FirefoxDriver();
}
else if (BrowserName.equals("Safari")) {
	  driver=new SafariDriver();
	}
else {
	System.out.println("No Browser value is given");
}

driver.get(prop.getProperty("url"));

driver.findElement(By.name("email")).sendKeys(prop.getProperty("username"));
driver.findElement(By.name("pass")).sendKeys(prop.getProperty("password"));
driver.findElement(By.xpath("//input[contains(@id,'u_0_b')]")).click();

	
	}
}

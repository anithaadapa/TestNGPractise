package com.testngpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderExampleParameter {
	
	
	@Test
	@Parameters("LoginValue")
	public void LoginToApplication(String LoginName)
	
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
		  WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://the-internet.herokuapp.com/login");
	        
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.id("username")).sendKeys(LoginName);
	        
	        System.out.println("The value from xml" +LoginName);
	        
	        
	    }
	
}


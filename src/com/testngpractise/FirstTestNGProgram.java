package com.testngpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTestNGProgram {
    
    @Test
    
    public void openBrowser()
    {
        
    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://the-internet.herokuapp.com/login");
        
        driver.manage().window().maximize();
        
        driver.close();
        
        
    }
}
package com.testngpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExecutionExample {

@Test
    
    public void OpenChromeBrowser()
    {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();
        
        
        
    }
    
    @Test
    
    public void OpenFirefoxBrowser()
    {
        
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\ganitha3\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();
        
    }
}



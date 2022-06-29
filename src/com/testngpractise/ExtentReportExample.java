package com.testngpractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportExample {
	
	//define global variables for the extenT TEST AND REPORTS
	public static ExtentTest test;
    public static ExtentReports report;
    
    @Test
	 
public static void main(String args[])

    {
        
        //Giving the location for the html report to be created inside your project
        report = new ExtentReports("./Report/report.html");
        
        //Giving the name for our Test case
        test = report.startTest("Login Test Case");
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://the-internet.herokuapp.com/login");
        test.log(LogStatus.PASS, "URL has been laucnhed successfully");
        
        
        driver.manage().window().maximize();
        test.log(LogStatus.PASS, "The browser has been maximized");
        
        String PageTitle = driver.getTitle();

        if(PageTitle.equalsIgnoreCase("The Internet"))
        {
            test.log(LogStatus.PASS, "The page title is correct");
        }
        
        else
        {
            test.log(LogStatus.FAIL, "The page tile is incorrect");
        }
        
        WebElement userid = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.className("radius"));
        
        userid.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword!");
        login.click();
        
        driver.close();
        test.log(LogStatus.INFO, "The browser has been closed succesfully");
        
        //End your extent report
        
        report.endTest(test);
        report.flush();
        
    }
}

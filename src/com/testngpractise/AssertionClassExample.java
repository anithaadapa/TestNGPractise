package com.testngpractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionClassExample {
	
	  @Test
	    
	    public void openBrowser()
	    {
	        
	    	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganitha3\\eclipse-workspace\\WebDriverProject\\chromedriver.exe"); 
	        
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://the-internet.herokuapp.com/login");
	        
	        driver.manage().window().maximize();
	        
	        
	        String PageTitle = driver.getTitle();
	        
	    //   Assert.assertEquals(PageTitle, "The Internet"); //This will run as the title is correct. This is normal assertion.
	     //   Assert.assertEquals(PageTitle, "The Internet1213"); // This will also run but the test case is failed. FAILED: openBrowser. java.lang.AssertionError: expected [The Internet1213] but found [The Internet]
	        
	        //soft assert is used to execute the next set of code even though the assertion is a failure.
	        
	        SoftAssert s1 = new SoftAssert();
	        
	        s1.assertEquals(PageTitle, "The Internet1213");
	        
	        System.out.println("Executing the code after Assert Failure");
	        
	        //This is to check all the assert conditions in the test case. This should be given at the end. If even there is one failure it will fail the test case.
	        
	        s1.assertAll();
	       
	        driver.close();
	        
	     
	       
	        
	        
	    }

}

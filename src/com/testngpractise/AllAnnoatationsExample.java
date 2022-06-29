package com.testngpractise;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;


public class AllAnnoatationsExample {
	
@BeforeSuite
    
    public void BeforeSuiteMethod()
    {
        System.out.println("Executing Before Suite Method");
    }
    
    @BeforeTest
    
    public void BeforeTestMethod()
    {
        System.out.println("Executng Before Test Method");    
    }
    @BeforeClass
    
    public void BeforeClassMethod()
    {
        System.out.println("Executing Before Class Method");
    }
    
    @BeforeMethod
    
    public void BeforeMethod()
    {
        System.out.println("Executing Before Method");
    }
    
    @Test
    
    public void TestCase1()
    {
        System.out.println("Executing Test case1");
    }
    
  @Test
    
    public void TestCase2()
    {
        System.out.println("Executing Test case2");
    }
   
@AfterMethod
    
    public void AfterMethod()
    {
        System.out.println("Executing After Method");
    }
    
    @AfterClass
    public void AfterClassMethod()
    {
        System.out.println("Executing After Class Method");
    }
    
    @AfterTest
    
    public void AfterTestMethod()
    {
        System.out.println("Executing After Test Method");
    }
    
    @AfterSuite
    
    public void AfterSuiteMethod()
    {
        System.out.println("Executing After Suite");
    }
    
}  
    
    
package com.testngpractise;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FactoryTestCase {
	
private String param="";  //global paramter is in blue. It gets the parameter (TestData1 from factory ) and assign it here
    
    FactoryTestCase(String param) // this is the constructor and the parameter we are getting it from factory
    {
        this.param=param;
    }
    
    @BeforeClass
    
    public void beforeClassMethod()
    {System.out.println("Printing Before Class");
    
    }
    
    @Test
    
    public void TestMethod1()
    {
        System.out.println("The parameter value is:" +param);
    }



}

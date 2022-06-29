package com.testngpractise;

import org.testng.annotations.Factory;  // factory is used in rare cases. You can use data provider instead. You should execute this test from here and not from factory the test case 

public class FactoryExample {
	
	
     @Factory
    
    public Object[] factoryMethod()
    {
        
        return new Object[]
                {
                  
                	new FactoryTestCase("TestData1"),
                	new FactoryTestCase("TestData2"),
                };
        
    }


}

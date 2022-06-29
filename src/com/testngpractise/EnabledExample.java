package com.testngpractise;

import org.testng.annotations.Test;

public class EnabledExample {

	@Test(enabled=true, description="Method1 Test case")
    public void Method1()
    {
        System.out.println("This is Method1");
        
    }
    
    @Test(enabled=false) //if we want to ignore few test cases
    public void Method2()
    {
        System.out.println("This is Method2");
        
    }


	
}

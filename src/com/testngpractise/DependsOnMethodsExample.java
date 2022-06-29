package com.testngpractise;

import org.testng.annotations.Test;

public class DependsOnMethodsExample {
	
	@Test(groups="SignIn")
    public void SignToApplication()
    {
        System.out.println("This will execute sign method");
        
    }
    
    @Test(dependsOnGroups= {"SignIn"})
    public void ViewAccountDetails()
    {
        System.out.println("This test case will be used to view the acount details");
    }


}

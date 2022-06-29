package com.testngpractise;

import org.testng.annotations.Test;

public class DependsOnExample {
	
	// depends on will make sure if that method is executed. We can have n number of test cases but depends on will be executed first
@Test(dependsOnMethods= {"OpenBrowser"})
    
    public void SignToApplication()
    {
        System.out.println("This will execute sign method");
        
    }
    
    @Test (dependsOnMethods= {"OpenBrowser"})
    public void AddToCart()
    {
        System.out.println("Adding Item to Cart Test case");
    }
    
    @Test
    
    public void OpenBrowser()
    {
        System.out.println("This is where my browser/driver object is created");


	

}
}
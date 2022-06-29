package com.testngpractise;

import org.testng.Assert;
import org.testng.annotations.Test;

// assert - comparision, make sure @test method is failing - assert.fail();
//alwaysRun=true - will run the other methods even though the dependent method is failed. If it depends on previous methods, always true will be executed.
public class AllwaysRunExample {
	
@Test
    
    public void Method1()
    {
        System.out.println("This is Method1");
        //Failing the Test case explicitly
        Assert.fail();
    }
    
    @Test (dependsOnMethods="Method1",alwaysRun=true)
    
    public void Method2()
    {
        System.out.println("This is Method2");
    }
    @Test (dependsOnMethods="Method2",alwaysRun=true)
    public void Method3()
    {
    System.out.println("This is Method3");



}
}
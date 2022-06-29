package com.testngpractise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

@DataProvider
    
    public static Object[] [] dataMethod()
    {
        return new Object[] []
                {
                    {10},{20},{30}
                };
    }
    
    @DataProvider
    public static Object[] [] dataMethod1()
    {
        return new Object[] []
                {
                    {"Nivya"},{"Alekya"},{"Krina"}
                };
    }
    
    @Test (dataProvider="dataMethod")
    public void MyTestCase(int values)
    {
        System.out.println("The values inside the data provider are:" +values);
    }
    
    @Test (dataProvider="dataMethod1")
    public void MyTestCase1(String values)
    {
        System.out.println("The values inside the data provider are:" +values);
    }
    
}
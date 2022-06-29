package com.testngpractise;

import org.testng.annotations.Test;

public class TestNGGroupExample {

@Test(groups={"SmokeTest","Regression test"})
	
	public void OpenBrowser()
	{
		System.out.println("Open Browser");
	}
	
@Test(groups="SmokeTest")
	
	public void Login()
	{
		System.out.println("Login To Amazon");
	}



@Test(groups="SmokeTest")

public void AddItemToCart()
{
	System.out.println("Add item to cart");
	
}

@Test(groups="Regression")

public void AddMobileItemtoCart()
{
	System.out.println("Mobile item to cart");
}


@Test(groups="SmokeTest")

public void closeBrowser()
{
	System.out.println("close Browser");
}
}


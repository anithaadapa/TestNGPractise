package com.testngpractise;

import org.testng.annotations.Test;

public class SettingPriorityExample {

	
	// priority method order we can set the order
	//if it has same priority , it will do the alphabetical order
	// if class has both priorities and non-priorities, it will go first go to non priority and then to priority ones
	
	@Test(priority=0)
	
	public void OpenBrowser()
	{
		System.out.println("Open Browser");
	}
	
@Test
	
	public void Login()
	{
		System.out.println("Login To Amazon");
	}



@Test(priority=2)

public void AddItemToCart()
{
	System.out.println("Add item to cart");
	
}

@Test

public void AddMobileItemtoCart()
{
	System.out.println("Mobile item to cart");
}


@Test(priority=3)

public void closeBrowser()
{
	System.out.println("close Browser");
}
}

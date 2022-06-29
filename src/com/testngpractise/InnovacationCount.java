package com.testngpractise;

import org.testng.annotations.Test;

public class InnovacationCount {
	
	@Test(invocationCount=10)
	
	public void TestCase1()
	{
		System.out.println("Innovacation Count");
	}

}

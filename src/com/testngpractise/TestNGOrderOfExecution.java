package com.testngpractise;

import org.testng.annotations.Test;

public class TestNGOrderOfExecution {

	@Test
	
	public void c_MethodName()
	
	{
		System.out.println("Executing C");
	}
	
@Test
	
	public void d_MethodName()
	
	{
		System.out.println("Executing D");
	}
	
@Test

public void a_MethodName()

{
	System.out.println("Executing A");
}

}

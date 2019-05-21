package com.aparna.cucumber;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before 
	public void init ()
	{
		//some work before test scenarios 
		System.out.println("before method ");
	}
	@After
	public void close()
	{
		//some work after test scenarios 
				System.out.println("after method ");
	}
	
}

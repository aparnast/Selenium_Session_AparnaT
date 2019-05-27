package com.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	WebDriver driver;
	

	//Open url feature file 
	@Given("^Open the Chrome and launch the application$")
	public void open_the_Chrome_and_launch_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\Session_Selenium\\All jars\\chromedriver_win32\\chromedriver.exe");
	       driver= new ChromeDriver();					
	       driver.manage().window().maximize();			
	       driver.get("https://www.idempiere.org/test-sites");	
	   
	   
	}
  
	@When("^Click on login link$")
	public void click_on_login_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("dhtgD")).click();
	   
	}

	@Then("^Given Url should be open$")
	public void given_Url_should_be_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actualTitle =driver.getTitle();
		String expectedTitle = "iDempiere = OSGi + ADempiere - Test Sites";
		assertEquals(expectedTitle,actualTitle);
		System.out.println("open valid link ");
	    
	}
	
	//close browser feature file 

	@Given("^Close The Open Window$")
	public void close_The_Open_Window() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		driver.close();
	}

	@Then("^Show The Message On Console$")
	public void show_The_Message_On_Console() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("closed the browser sucessfully");
	}

	
}
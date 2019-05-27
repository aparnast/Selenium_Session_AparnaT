package com.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;			
	
	@Given("^Open the Chrome and launch the application$")
	public void open_the_Chrome_and_launch_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\Session_Selenium\\All jars\\chromedriver_win32\\chromedriver.exe");
	       driver= new ChromeDriver();					
	       driver.manage().window().maximize();			
	       driver.get("https://qaaws.a2omobile.com/dealwall/Client/index.html");	
	   
	}
	    @When("^Enter the Username and Password$")					
	    public void enter_the_Username_and_Password() throws Throwable 							
	    {		
	       driver.findElement(By.id("username")).sendKeys("test12@a2omobile.com");	
	       Thread.sleep(2000);
	       driver.findElement(By.id("password")).sendKeys("@deal1234");							
	       Thread.sleep(2000);
	    }		

	    @Then("^login with the credential$")					
	    public void Reset_the_credential() throws Throwable 							
	    {		
	       driver.findElement(By.id("loginButton")).click();					
	    }	
	   
	    @When("^Enter the Username as a \"([^\"]*)\" and Password	as a \"([^\"]*)\"$")
	    public void enter_the_Username_as_a_and_Password_as_a(String arg1, String arg2) throws Throwable {
	    	    // Write code here that turns the phrase above into concrete actions
	    	driver.findElement(By.id("loginButton")).click();	
	    	   
	    	}
	}		

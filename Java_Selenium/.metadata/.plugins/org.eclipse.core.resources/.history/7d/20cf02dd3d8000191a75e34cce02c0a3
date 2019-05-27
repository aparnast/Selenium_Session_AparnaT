package com.stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
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
       driver.get("http://demo.guru99.com/v4");		
       System.out.println("@given run sucessfully :");
        throw new PendingException();
    }

    @When("^Enter the Username and Password$")
    public void enter_the_Username_and_Password() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	driver.findElement(By.name("uid")).sendKeys("username12");							
        driver.findElement(By.name("password")).sendKeys("password12");	
        System.out.println("@when run sucessfully :");
        throw new PendingException();
    }

    @Then("^Reset the credential$")
    public void reset_the_credential() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	driver.findElement(By.name("btnReset")).click();			
        System.out.println("@then run sucessfully :");
        throw new PendingException();
    }

}

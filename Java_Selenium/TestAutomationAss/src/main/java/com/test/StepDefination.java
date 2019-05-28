package com.test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	public static WebDriver driver;
	
	@Given("^Open the browser and launch the application$")
	public void open_the_browser_and_launch_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\Session_Selenium\\All jars\\chromedriver_win32\\chromedriver.exe");
	       driver= new ChromeDriver();					
	       driver.manage().window().maximize();			
	       driver.get("https://www.idempiere.org/test-sites");	
	       System.out.println("run1");

	}

	@When("^Click on login link$")
	public void click_on_login_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("dhtgD")).click();
		System.out.println("run2");
	}

	@Then("^Given Url should be open$")
	public void given_Url_should_be_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actualTitle =driver.getTitle();
		  String expectedTitle = "iDempiere = OSGi + ADempiere - Test Sites";
		  if(actualTitle.equalsIgnoreCase(expectedTitle))
		  {
			  System.out.println("Title Matched");
		  }
	      else
	      {
			  System.out.println("Title didn't match");
	      }
		  System.out.println("run3");
	}

	@Given("^User is on login screen$")
	public void user_is_on_login_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("switch to login frame");
	    WebElement helpbtn=driver.findElement(By.cssSelector("[type='button']"));
	    helpbtn.click();
	    
	    if(helpbtn.isSelected())
	    {
	    	System.out.println("button is enabled");
	    }
	    System.out.println("run4");
	}

	@When("^I enter user name and password$")
	public void i_enter_user_name_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("run5");
	}

	@When("^click on ok button$")
	public void click_on_ok_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("run6");
	}

	@Then("^I redirect to the home page$")
	public void i_redirect_to_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("run7");
	}

	@Given("^Close The Open Window$")
	public void close_The_Open_Window() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("run8");
	}

	@Then("^Show The Message On Console$")
	public void show_The_Message_On_Console() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("run9");
	}

  
}

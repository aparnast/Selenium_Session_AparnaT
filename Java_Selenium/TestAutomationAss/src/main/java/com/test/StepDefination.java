package com.test;
import java.util.ArrayList;
//import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	public static WebDriver driver;
	
	//Check given URL is open or not
	@Given("^Open the browser and launch the application$")
	public void open_the_browser_and_launch_the_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\GitBashSelenium\\Java_Selenium\\TestAutomationAss\\Driver\\chromedriver.exe");
	       driver= new ChromeDriver();					
	       driver.manage().window().maximize();			
	 /*
	       driver.get("https://www.idempiere.org/test-sites");	
	       String actualTitle =driver.getTitle();
			System.out.println(actualTitle);
			String expectedTitle = "iDempiere = OSGi + ADempiere - Test Sites";
			  if(actualTitle.equalsIgnoreCase(expectedTitle))
			  {
				  System.out.println("Title Matched");
			  }
		      else
		      {
				  System.out.println("Title didn't match");
		      }
	   */
	       System.out.println("run1");

	}

	@When("^Click on login link$")
	public void click_on_login_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 driver.get("https://test.idempiere.org/webui/");
		//driver.findElement(By.className("dhtgD")).click();
		System.out.println("run2");
	}

	@Then("^Given Url should be open$")
	public void given_Url_should_be_open() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	/*	ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
		String actualTitle =driver.getTitle();
		System.out.println(actualTitle);
		  String expectedTitle = "*TEST* iDempiere";
		  if(actualTitle.equalsIgnoreCase(expectedTitle))
		  {
			  System.out.println("Title Matched");
		  }
	      else
	      {
			  System.out.println("Title didn't match");
	      }
	      */
		  System.out.println("run3");
		  //driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
	}
 //User should login with valid  credentials
	@Given("^User is on login screen$")
	public void user_is_on_login_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("switch to login frame");
	   /*
	    WebElement helpbtn=driver.findElement(By.cssSelector("[type='button']"));
	    helpbtn.click();
	    
	    if(helpbtn.isSelected())
	    {
	    	System.out.println("button is enabled");
	    }
	    */
	    System.out.println("run4");
	}

	@When("^I enter user name and password$")
	public void i_enter_user_name_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("admin @ gardenworld.com");
		driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("GardenAdmin");
		System.out.println("run5");
	}

	@And("^click on ok button$")
	public void click_on_ok_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[text()=' OK']")).click();
		System.out.println("run6");
	}

	@Then("^I redirect to the home page$")
	public void i_redirect_to_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("run7");
	}
	//Check open window is close or or not 
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

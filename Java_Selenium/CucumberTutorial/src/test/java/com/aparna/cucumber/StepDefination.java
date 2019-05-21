package com.aparna.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	@Given("^I open login page$")
	public void i_open_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("open login page");
	//	throw new PendingException();
	}

	@When("^I enter user name as \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_user_name_as_and_password(String uname ,String pass) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Enter valid username and password");
	//	throw new PendingException();
	}

	@When("^I submit login page$")
	public void i_submit_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("submit details ");
	//	throw new PendingException();
	}

	@Then("^I redirect to the home page$")
	public void i_redirect_to_the_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("open home page");
	//	throw new PendingException();
	}
	@Given("^I am on login page$")
	public void i_am_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I am on login page");
		//throw new PendingException();
	}
	
	@When("^I enter invalid user name as \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_invalid_user_name_as_and_password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Enter invalid login details");
		//throw new PendingException();
	}

	@When("^I submit details of  login page$")
	public void i_submit_details_of_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println(" submit invalid details ");
		//throw new PendingException();
	}

	@Then("^I redirect to login page$")
	public void i_redirect_to_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("open login page again");
		//throw new PendingException();
	}
	
}

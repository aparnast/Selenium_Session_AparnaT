package iDempiereCucumberFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	public static WebDriver driver;
	 	
	
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "D:\\GitBashSelenium\\Java_Selenium\\iDempiereCucumberFramework\\Driver\\chromedriver.exe");
		 driver= new ChromeDriver();					
		 driver.manage().window().maximize();	
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// driver.get("https://www.idempiere.org/test-sites");
	    
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  driver.get("https://test.idempiere.org/webui/");
		// driver.findElement(By.xpath("//a[text()='https://test.idempiere.org/webui/']")).click();
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement UserName=driver.findElement(By.xpath("//tr[@id='rowUser']//input"));
	    UserName.sendKeys("admin @ gardenworld.com");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement PassWord=driver.findElement(By.xpath("//tr[@id='rowPassword']//input"));
	    PassWord.sendKeys("GardenAdmin");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement LoginBtn=driver.findElement(By.xpath("//button[@class='login-btn z-button']"));
	    LoginBtn.click();
	    
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Login Sucessfully");
	}
	
	@Given("^select businees partner from favorites$")
	public void select_businees_partner_from_favorites() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement BusinessPartnerLink=driver.findElement(By.xpath("//span[contains(text(),' Business Partner')]"));
	    
	    BusinessPartnerLink.click();
	}

	@When("^The business partner page should be displayed$")
	public void the_business_partner_page_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("business page open  Sucessfully");
	}

	@Given("^Able to view business partner page$")
	public void able_to_view_business_partner_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("view business partner page Sucessfully");
	}

	@When("^I click on the close button$")
	public void i_click_on_the_close_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement CloseBtn= driver.findElement(By.xpath("//i[@class='z-icon-times z-tab-icon']"));
	    CloseBtn.click();
	}

	@Then("^The business partner page should be closed$")
	public void the_business_partner_page_should_be_closed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(" business partner page closed Sucessfully");
	}
	
	@Given("^select businees partner again from favorites$")
	public void select_businees_partner_again_from_favorites() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    WebElement BusinessPartnerLink=driver.findElement(By.xpath("//span[contains(text(),' Business Partner')]"));
	    
	    BusinessPartnerLink.click();
	}

	@When("^Add all details$")
	public void add_all_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement SearchKey=driver.findElement(By.xpath("//div[contains(@class,'find-window-simple')]//span[text()='Search Key']/../../..//td//input[@class='z-textbox']"));
	    SearchKey.sendKeys("searchkey");
	    WebElement Name=driver.findElement(By.xpath("//div[contains(@class,'find-window-simple')]//span[text()='Name']/../../..//td//input[@class='z-textbox']"));
	    Name.sendKeys("Name");
	    WebElement Name2=driver.findElement(By.xpath("//div[contains(@class,'find-window-simple')]//span[text()='Name 2']/../../..//td//input[@class='z-textbox']"));
	    Name2.sendKeys("Name2");
	    WebElement Discription=driver.findElement(By.xpath("//div[contains(@class,'find-window-simple')]//span[text()='Description']/../../..//td//input[@class='z-textbox']"));
	    Discription.sendKeys("Discription");
	}

	@When("^Click on Reset button$")
	public void click_on_Reset_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement ResetBtn=driver.findElement(By.xpath("//button[@class='img-btn btn-reset z-button']"));
	    ResetBtn.click();
	}

	@Then("^All values should be reset sucessfully$")
	public void all_values_should_be_reset_sucessfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("All values are reset sucessfully");
	}




}

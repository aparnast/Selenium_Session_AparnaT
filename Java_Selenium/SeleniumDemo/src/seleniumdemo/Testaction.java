package seleniumdemo;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;



public class Testaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Session_Selenium\\All jars\\chromedriver_win32\\chromedriver.exe");
		   
			String baseUrl = "http://www.facebook.com/"; 
			WebDriver driver = new ChromeDriver();

			driver.get(baseUrl);
			WebElement txtUsername = driver.findElement(By.id("email"));

			Actions builder = new Actions(driver);
			Action seriesOfActions = builder
				.moveToElement(txtUsername)
				.click()
				.keyDown(txtUsername, Keys.SHIFT)
				.sendKeys(txtUsername, "hello")
				.keyUp(txtUsername, Keys.SHIFT)
				.doubleClick(txtUsername)
				.contextClick()
				.build();
				
			seriesOfActions.perform() ;

			}
	
	
	
	 //Open url feature file 
	
	/*	@Given("^Open the Chrome and launch the application$")
		  public void open_the_Chrome_and_launch_the_application()
		     {
			   System.setProperty("webdriver.chrome.driver", "D:\\Session_Selenium\\All jars\\chromedriver_win32\\chromedriver.exe");
		       driver= new ChromeDriver();					
		       driver.manage().window().maximize();			
		       driver.get("https://www.idempiere.org/test-sites");	
	         }
	  
		@When("^Click on login link$")
		  public void click_on_login_link()
		     {
		    	driver.findElement(By.className("dhtgD")).click();
		     }

		@Then("^Given Url should be open$")
		  public void given_Url_should_be_open() 
		    {
		      String actualTitle =driver.getTitle();
			  String expectedTitle = "iDempiere = OSGi + ADempiere - Test Sites";
			  assertEquals(expectedTitle,actualTitle);
			  System.out.println("open valid link ");
		    }

		//login2
		@Given("^I open login page$")
		public void i_open_login_page() throws InterruptedException 
		{
		 System.out.println(" user on login page ");   
		 
		    
		}
		

		@When("^I enter user name as \"([^\"]*)\" and password \"([^\"]*)\"$")
		public void i_enter_user_name_as_and_password(String uname, String pass) throws InterruptedException 
		{
			//driver.findElement(By.xpath("(//img[@class='z-image'])[2]")).click();
			System.out.println("in frame");
			
			//driver.switchTo().frame("z-center-body");
			
		    //driver.findElement(By.xpath("(//input[@class='z-textbox'])[1]")).sendKeys(uname);
		    //driver.findElement(By.xpath("(//input[@class='z-textbox'])[2]")).sendKeys(pass);
		     
		    Thread.sleep(2000);
		}

		@When("^I submit login page$")
		public void i_submit_login_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		  // driver.findElement(By.xpath("(//button[@class='login-btn z-button'])[1]")).click();
		}

		@Then("^I redirect to the home page$")
		public void i_redirect_to_the_home_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    
		}


	//close browser feature file 

		@Given("^Close The Open Window$")
		  public void close_The_Open_Window() 
		    {
			 driver.close();
		   	 System.out.println("test");
		    }
	    @Then("^Show The Message On Console$")
		  public void show_The_Message_On_Console() 
	        {
		     System.out.println("closed the browser sucessfully");
	     	}
	
*/
}

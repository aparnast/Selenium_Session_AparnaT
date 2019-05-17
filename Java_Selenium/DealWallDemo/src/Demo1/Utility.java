package Demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility extends Systemutil {
	
	public WebDriver driver;
    public WebDriverWait wait;
    
   
    public Utility() 
        {
    	  driver=new ChromeDriver();
    	//maximize the window
  		driver.manage().window().maximize();
  		//apply wait till load the web page
  		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    	
        }

    public void navigateToURL(String URL) 
    {
                try {
            driver.navigate().to(URL);
        } catch (Exception e) {
            System.out.println("URL did not load: " + URL);
            
        }
    }
    public void enterText()
    {
    	WebElement ele =driver.findElement(By.id("username"));
    			ele.sendKeys("test12@a2omobile.com");
    			WebElement ele1 =driver.findElement(By.id("password"));
    			ele1.sendKeys("@deal1234");
    }
    
    public void click()
    {
    	driver.findElement(By.id("loginButton")).click();
    }
    
    public void closeBrowser()
    {
    	try
    	{
    	driver.close();
    	}
    	catch(Exception e )
    	{
    		System.out.println("window not closed ");
    	}
    	}

}
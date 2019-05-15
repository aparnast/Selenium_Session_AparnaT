package SelFrameworkDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {
	
	public WebDriver driver;
    public WebDriverWait wait;
    
   
    public CommonUtils() 
        {
    	  driver=new ChromeDriver();
    	}

    public void navigateToURL(String URL) 
    {
                try {
            driver.navigate().to(URL);
        } catch (Exception e) {
            System.out.println("URL did not load: " + URL);
            
        }
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

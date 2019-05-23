package a2odemo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils {
	
	   //Define veriables 
	   public WebDriver driver;
       public WebDriverWait wait;
       public Actions actions;
       WebElement Userid;
       WebElement Password;
       WebElement loginbtn;

       //Initialize web driver 
       public CommonUtils()
       {
          driver=new ChromeDriver();
        //maximize the window
    		driver.manage().window().maximize();
    		//apply wait till load the web page
    		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       }
       
       //Open URl
       public void navigateToURL(String URL)
       {
          System.out.println("Navigating to: " + URL);
           try 
             {
               driver.navigate().to(URL);
             } 
           catch (Exception e)
             {
               System.out.println("URL did not load: " + URL);
             }
       }

       public WebElement getElement(String locator ,String value)
       {
      	 WebElement ele = null;
      	  switch(locator)
      	  {
      	  case "id" :    ele=driver.findElement(By.id(value));
      	                 break;
      	  case "name" : ele=driver.findElement(By.name(value));
                           break;
      	      //default :         
      	  }
      	return ele;
      	 
       }
    
    
     
    //clear the  added values
    public void clearField(WebElement element)
    {
        try
        {
            element.clear();
        } 
        catch (Exception e) 
        {
           System.out.println("The following element could not be cleared" + element.getText());
        }
    }
    public void enterText(WebElement ele , String text)
    {
    	// ele=driver.findElement(text);
    	 
    			
    		
    			
    }
    
    public void click(WebElement ele)
    { 
    //	driver.findElement(By.id(ele)).click();
    //   loginbtn=sys.getElement("id","loginButton");
    }
    
    //close 
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

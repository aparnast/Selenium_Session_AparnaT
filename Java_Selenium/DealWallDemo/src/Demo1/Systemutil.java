package Demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Systemutil {
	
	public WebDriver driver;
    public WebDriverWait wait;
    WebElement Userid;
    WebElement Password;
    WebElement loginbtn;
    
   
     public Systemutil() 
        {
    	 
    	  driver=new ChromeDriver();
    	//maximize the window
  		driver.manage().window().maximize();
  		//apply wait till load the web page
  		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
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
 
 public void navigateToURL(String URL) 
 {
             try {
         driver.navigate().to(URL);
     } catch (Exception e) {
         System.out.println("URL did not load: " + URL);
         
     }
 }
 
 //public void enterText(WebElement ele , String text)
 public void enterText()
 {
 //	WebElement ele =driver.findElement(By.id("username"));
 			
 		//	WebElement ele1 =driver.findElement(By.id("password"));
 			Userid =getElement("id","username");
 			Userid.sendKeys("test12@a2omobile.com");
 	        Password= getElement("id", "password");
 	        Password.sendKeys("@deal1234");
 }
 //public void click(WebElement ele)
 public void click()
 { 
 	driver.findElement(By.id("loginButton")).click();
 //   loginbtn=sys.getElement("id","loginButton");
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

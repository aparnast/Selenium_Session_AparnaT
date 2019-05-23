package Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Systemutil extends Utility{
	
	//Utility utility = new Utility();

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
 public void enterText(WebElement ele , String text)
 {
 //	WebElement ele =driver.findElement(By.id("username"));
 			
 		//	WebElement ele1 =driver.findElement(By.id("password"));
 			Userid =getElement("id","username");
 			Userid.sendKeys("test12@a2omobile.com");
 	        Password= getElement("id", "password");
 	        Password.sendKeys("@deal1234");
 }
 
 public void click(WebElement ele)
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

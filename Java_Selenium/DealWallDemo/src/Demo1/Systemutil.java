package Demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Systemutil extends Utility {
	
	
	
 public WebElement getElement(String locator ,String value)
 {
	 WebElement ele = null;
	  switch(locator)
	  {
	  case "id" :    ele=driver.findElement(By.id(value));
	                 break;
	  case "name" : ele=driver.findElement(By.id(value));
                     break;
	              
	  }
	return ele;
	 
 }
	
	
	
}

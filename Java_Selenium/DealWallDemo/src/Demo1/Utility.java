package Demo1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility  {
	
	public WebDriver driver;
    public WebDriverWait wait;
    WebElement Userid;
    WebElement Password;
    WebElement loginbtn;
    
   //Systemutil sys= new Systemutil();
     public Utility() 
        {
    	 
    	  driver=new ChromeDriver();
    	//maximize the window
  		driver.manage().window().maximize();
  		//apply wait till load the web page
  		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  		
  		
  		 
        }
    
    
  
}

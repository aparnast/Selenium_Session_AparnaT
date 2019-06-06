package Demo1;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainClass  {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
System.setProperty("webdriver.chrome.driver", "D:\\Session_Selenium\\All jars\\chromedriver_win32\\chromedriver.exe");
		
		//create object of Utility class
		// Utility utility = new Utility();
		 
          //create object of system class
		 Systemutil sys= new Systemutil();
		 
		 //use navigateto url method to open webpage 
		 sys.navigateToURL("");
		 
		 //enter values in login 
	sys.enterText();
		 
		 //click on login button 
		 sys.click();
		 Thread.sleep(2000);
		//use close browser method to close the current open window 
		 sys.closeBrowser();
		 
		 
		 
		 /*code by deepti
		 
		 //Call getElement()
		WebElement loginID =  sys.getElement(locator, value);
		sys.enterText(loginID, "");
		*/
		
	

	}
    
    
  
}

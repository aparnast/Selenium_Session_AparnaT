package seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Session_Selenium\\All jars\\chromedriver_win32\\chromedriver.exe");
	       driver= new ChromeDriver();					
	       driver.manage().window().maximize();			
	       driver.get("https://www.idempiere.org/test-sites");	
	       driver.findElement(By.className("dhtgD")).click();
	    //   driver.switchTo().frame(0);
	       WebElement username=driver.findElement(By.xpath("(//input[@class='z-textbox'])[1]"));
	       Actions builder = new Actions(driver);
			Action seriesOfActions = builder
				.moveToElement(username)
				.click()
				.keyDown(username, Keys.SHIFT)
				.sendKeys(username, "hello")
				.keyUp(username, Keys.SHIFT)
				.doubleClick(username)
				.contextClick()
				.build();
				
			seriesOfActions.perform() ;
	    //	username.clear();	  
	     //  username.sendKeys("admin @ gardenworld.com");
		 //  driver.findElement(By.xpath("(//td[@class='login-field'])[2]")).sendKeys("GardenAdmin"); 
			 
	}

}

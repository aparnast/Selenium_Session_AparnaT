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
	      
	       driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("admin @ gardenworld.com");
			driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("GardenAdmin");
			driver.findElement(By.xpath("//button[text()=' OK']")).click();
			
	}

}

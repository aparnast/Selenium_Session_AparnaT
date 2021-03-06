package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Session_Selenium\\All jars\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://shop.demoqa.com/");
	    //Ass1 - Partial Link text - click on second one link 
		
		//WebElement ele = driver.findElements(By.partialLinkText("My")).get(1);
		//ele.click();
		
		//Ass 2- Use tag name for access my account 
		
		WebElement ele=driver.findElement(By.tagName("a"));
		if (ele.equals("My Account"))
		{
			ele.click();
		}
		//Ass 3- xpath with ahref 
		
		//driver.findElement(By.xpath("//a[contains(text(),'My Account')]")).click();
		
		
		//driver.close();
		
		
		
		

	}

}

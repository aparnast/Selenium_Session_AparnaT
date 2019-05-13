package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumRadioBtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		/*
		  Launch new Browser
           Open DemoQA.com website
          Radio Button assignment:
         Identify the selected radio button and display the name and value of the button
         Select an unselected radio button and display the name and value of newly selected button 
         */
	  
		System.setProperty("webdriver.chrome.driver", "D:\\Session_Selenium\\All jars\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://DemoQA.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Checkboxradio')] ")).click();
		driver.findElement(By.className("New York")).isSelected();
		
		//driver.close();
	}

}

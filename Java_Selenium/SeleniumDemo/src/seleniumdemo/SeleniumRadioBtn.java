package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		WebElement ele= driver.findElement(By.xpath("//label[contains(text(),'New York')] "));
		
		//Checking if the new york Radio button is displayed 
		boolean radioBtnIsDisplayed = ele.isDisplayed();
        System.out.println("Is newyork radio button displayed: "+radioBtnIsDisplayed);
        
        //Checking if the new york Radio button is enabled
        boolean radioBtnIsEnabled = ele.isEnabled();
        System.out.println("Is newyork radio button Enalbed: "+radioBtnIsEnabled);
        
      //Checking if new  york  radio button is selected 
        boolean radioBtnIsSelected = ele.isSelected();
        System.out.println("Is newyork radio button Selected: "+radioBtnIsSelected);
        
        //select the newyork redio button 
        ele.click();
        
        
        //check the conditon again 
        boolean radioBtnIsReSelected = ele.isSelected();
        System.out.println("Is newyork radio button Selected: "+radioBtnIsReSelected);
        
        
        System.out.println("test git");
        System.out.println("new git commit");
		
        
        //driver.close();
	}

}

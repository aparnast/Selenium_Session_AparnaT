package seleniumdemo;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Session_Selenium\\All jars\\chromedriver_win32\\chromedriver.exe");
	    //create instance of webdriver	
		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//apply wait till load the web page
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//enter url
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		//get the title and store it in string
		String title= driver.getTitle();
		//print the title on console
		System.out.println("tile of the open url is :"+ title);
		//click on partial link text
		driver.findElement(By.partialLinkText("Partial Link Test")).click();
		//go back to main web page
		driver.navigate().back();
		//click on link text
		driver.findElement(By.partialLinkText("Link Test")).click();
		//go back to main page
		driver.navigate().back();
		//apply time 
		Thread.sleep(1000);
        //enter value in first name 
		driver.findElement(By.cssSelector("[name='firstname'")).sendKeys("demoname");
		//apply time 
		Thread.sleep(1000);
		//enter value in last name 
	    driver.findElement(By.cssSelector("[name='lastname'")).sendKeys("demo last name");
	    //apply time 
	  	Thread.sleep(1000);		
		//select radio value from group radio 
	  	List<WebElement> radiobutton = driver.findElements(By.cssSelector("[type='radio'"));
	    //select value
	    radiobutton.get(1).click();
	    //apply time 
	  	Thread.sleep(1000);	
	    //select radio value of exp from radio list
	  	List<WebElement> radiobutton1 = driver.findElements(By.cssSelector("[name='exp'"));
	    //select value 
	    radiobutton1.get(3).click();
	    //apply time 
	  	Thread.sleep(1000);	
	  	//add value in date text box
	  	driver.findElement(By.id("datepicker")).sendKeys("4/7/2019");
	  	//select profession
	  	List<WebElement> checkbox=driver.findElements(By.name("profession"));
	  	System.out.println("checkbox driver size "+checkbox.size());
	  	for (int i=0;i<checkbox.size();i++)
	  	{
	  		//System.out.println("Checkbox values : "+checkbox.get(i).getText());
	  		checkbox.get(i).click();
	  		Thread.sleep(2000);
	  	}
	  	//upload profile pic 
	  	WebElement UploadElement = driver.findElement(By.className("input-file"));
	    
	 // enter the file path
        UploadElement.sendKeys("C:\\Users\\aparna.tahashildar\\Downloads\\344.png");
		
      //apply time 
	  	Thread.sleep(1000);	
		
		
		driver.close();
		

	}

}

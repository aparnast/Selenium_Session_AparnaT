package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebElementCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /* 
		   Launch new Browser
           Open DemoQA.com website
           Click on Registration link using “driver.findElement(By.xpath(“.//*[@id=’menu-item-374′]/a”)).click();“
           //Use any other control which will redirect to next page(click on logo )
           Come back to Home page (Use ‘Back’ command)
           Again go back to Registration page (This time use ‘Forward’ command)
           Again come back to Home page (This time use ‘To’ command)
           Refresh the Browser (Use ‘Refresh’ command)
           Close the Browser
           
           
		  */
		
		System.setProperty("webdriver.chrome.driver", "D:\\Session_Selenium\\All jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://DemoQA.com/");
		driver.findElement(By.xpath("//img[@class='preload-me lazyloading']")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().to("https://DemoQA.com/");
		driver.navigate().refresh();
		driver.close();
	}

}

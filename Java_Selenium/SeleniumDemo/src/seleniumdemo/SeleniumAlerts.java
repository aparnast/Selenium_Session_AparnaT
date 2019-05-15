package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlerts {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		* check alerts 
		*/

		// CommonUtils cu=new CommonUtils();

		System.setProperty("webdriver.chrome.driver", "D:\\Session_Selenium\\All jars\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("53920");
		driver.findElement(By.name("submit")).submit();
		// Switching to alert
		Alert alert=driver.switchTo().alert();
		//capturing alert message 
		String aletMessage = driver.switchTo().alert().getText();
		//displaying alert message 
		System.out.println(aletMessage);
		Thread.sleep(1000);
		alert.accept();
        driver.close();

		}

		}



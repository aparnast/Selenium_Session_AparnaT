package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Session_Selenium\\All jars\\chromedriver_win32\\chromedriver.exe");
	//	WebDriver driver= new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		String title= driver.getTitle();
		System.out.println("tile of the open url is :"+ title);
		
		
		driver.close();
		

	}

}

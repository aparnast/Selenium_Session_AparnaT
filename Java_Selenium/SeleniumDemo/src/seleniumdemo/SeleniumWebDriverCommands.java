package seleniumdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriverCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      /* 
        Launch a new Firefox browser.
        Open Store.DemoQA.com
        Get Page Title name and Title length
        Print Page Title and Title length on the Console.
        Get Page URL and Page Url Length
        Print Page URL and Page Url Length on the Console.
        Get Page Source (HTML Source code) and Page Source length
        Print Page Length on Console.
        Close the Browser.
     */
		
		System.setProperty("webdriver.chrome.driver", "D:\\Session_Selenium\\All jars\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://Store.DemoQA.com/");
		String pt= driver.getTitle();
		int tl= driver.getTitle().length();
		System.out.println("Page Title is :"+ pt +" & "+ "Title Length is "+tl);
		String cu=driver.getCurrentUrl();
		int cl=driver.getCurrentUrl().length();
		System.out.println("Current url is  :"+ cu +" & "+ "url Length is "+cl);
		String ps=driver.getPageSource();
		int psl=driver.getPageSource().length();
		System.out.println("page source Length is "+psl);
		//System.out.println("page source is :" +ps);
		driver.close();
		
	}

}

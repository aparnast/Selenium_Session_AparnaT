package SelFrameworkDemo;

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		System.setProperty("webdriver.chrome.driver", "D:/Selenium/All jars/chromedriver_win32/chromedriver.exe");
		
		CommonUtils commonutils=new CommonUtils();
		commonutils.navigateToURL("http://demo.guru99.com/test/delete_customer.php");
		
	}

}

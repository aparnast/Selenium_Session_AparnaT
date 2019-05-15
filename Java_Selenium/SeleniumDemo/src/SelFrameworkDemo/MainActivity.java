package SelFrameworkDemo;

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		System.setProperty("webdriver.chrome.driver", "D:\\Session_Selenium\\All jars\\chromedriver_win32\\chromedriver.exe");
		
		//create object of commonutils class
		CommonUtils commonutils=new CommonUtils();
		
		//use navigateto url method to open webpage 
		commonutils.navigateToURL("http://demo.guru99.com/test/delete_customer.php");
		
		//use close browser method to close the current open window 
		commonutils.closeBrowser();
		
		
	}

}

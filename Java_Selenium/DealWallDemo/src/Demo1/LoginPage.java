package Demo1;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Session_Selenium\\All jars\\chromedriver_win32\\chromedriver.exe");
		
		//create object of Utility class
		 Utility utility = new Utility();
		 
	//	 Systemutil sys= new Systemutil();
		 
		 //use navigateto url method to open webpage 
		 utility.navigateToURL("https://qaaws.a2omobile.com/dealwall/Client/index.html");
		 
		 //enter values in login 
		 utility.enterText();
		 
		 //click on login button 
		 utility.click();
		 
		//use close browser method to close the current open window 
		 utility.closeBrowser();
		
	}

}

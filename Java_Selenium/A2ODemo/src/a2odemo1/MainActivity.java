package a2odemo1;

public class MainActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Session_Selenium\\All jars\\chromedriver_win32\\chromedriver.exe");
       
		//Create object of login class
		LoginPage loginpage=new LoginPage();
		
		//use navigateto url method to open webpage
		
		loginpage.cu1.navigateToURL("https://qaaws.a2omobile.com/dealwall/Client/index.html");
	    
		//enter details 
		loginpage.validLogin();
		
		//click on button 
		//loginpage.cu1.click(ele);
		
		//close open window
		loginpage.cu1.closeBrowser();
	}

}
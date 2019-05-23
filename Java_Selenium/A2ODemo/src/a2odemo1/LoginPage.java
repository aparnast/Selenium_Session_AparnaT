package a2odemo1;

import org.openqa.selenium.WebElement;

public class LoginPage {
	
	//create object of Utility class
	  CommonUtils cu1 = new CommonUtils();
	   
	  public  void validLogin()
	  {
		  WebElement loginID =  cu1.getElement("id","username");
			cu1.enterText(loginID, "test12@a2omobile.com");
		//  loginID.sendKeys("test12@a2omobile.com");
			
			WebElement pswd =  cu1.getElement("id","password");
			cu1.enterText(pswd, "@deal1234");
			//cu1.click("loginButton");
	  }
	
	   
	   
	   
	   
			 

}

package testcases;

import org.testng.annotations.Test;
import base.Base;
import pageobjects.LoginPage;

public class LoginTest extends Base {
    
	@Test(priority=1)
	public void LoginwithValidCredentails() {

		LoginPage lp = new LoginPage(driver);
		lp.clickonLoginOption();
		lp.clickonEmailRadiobutton();
		lp.enterEmailId(prop.getProperty("loginid"));
		lp.enterPassword(prop.getProperty("password"));
		lp.clickonLoginButton();
		
	}
    
	@Test(priority=2)
	public void LoginwithInvalidCredentials() {

		LoginPage lp = new LoginPage(driver);
		lp.clickonLoginOption();
		lp.clickonEmailRadiobutton();
		lp.enterEmailId(prop.getProperty("loginid"));
		lp.enterInvalidPassword(prop.getProperty("InvalidPassword"));
		lp.clickonLoginButton();
		lp.Accountname();

	}
}

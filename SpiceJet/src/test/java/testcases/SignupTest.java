package testcases;

import org.testng.annotations.Test;
import base.Base;
import pageobjects.SignupPage;

	public class SignupTest extends Base {
		
		@Test
		public void Signup() {

			SignupPage signup = new SignupPage(driver);
			signup.Signupbutton();
			
			Switchwindow();
			signup.SelectTitle();
			signup.EnterFirstName(prop.getProperty("FirstName"));
			signup.EnterLastName(prop.getProperty("LastName"));
			signup.EnterCountry(prop.getProperty("Country"));
			signup.EnterDateob(prop.getProperty("Dateofbir"));
			signup.EnterMobile(prop.getProperty("Contact"));
			signup.EnterEmaiId(prop.getProperty("Email"));
			signup.EnterPassword(prop.getProperty("Password"));
			signup.EnterConpassword(prop.getProperty("Conpassword"));
		
		}

	}





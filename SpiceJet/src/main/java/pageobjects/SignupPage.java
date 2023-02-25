package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Utility;

	public class SignupPage extends Utility{
		
		WebDriver driver;

		public SignupPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		@FindBy(xpath = "(//a[@to='https://spiceclub.spicejet.com/signup'])[1]")
		WebElement SupButton;
		
		@FindBy(xpath = "//select[@class='form-control form-select ']")
		WebElement Title;
		
		@FindBy(xpath = "//input[@id='first_name']")
		WebElement Fname;
		
		@FindBy(xpath = "//input[@id='last_name']")
		WebElement Lname;
		
		@FindBy(xpath ="//select[@class='form-control form-select']")
		WebElement Contry;
		
		@FindBy(xpath ="//input[@id='dobDate']")
		WebElement DOB;
		
		@FindBy(xpath ="//input[@placeholder='+91 01234 56789']")
		WebElement Phone;
		
		@FindBy(xpath ="//input[@id='email_id']")
		WebElement Email;
		
		@FindBy(xpath ="//input[@id='new-password']")
		WebElement Password;
		
		@FindBy(xpath ="//input[@id='c-password']")
		WebElement Conpassword;
		
		
		public void Signupbutton() {
			SupButton.click();
		}
		
		public void SelectTitle() {
			Title.click();
		}
		
		public void EnterFirstName(String FirstName) {
			Fname.sendKeys(FirstName);
		}
		
		public void EnterLastName(String LastName) {
			Lname.sendKeys(LastName);
		}
		
		public void EnterCountry(String Country) {
			Contry.sendKeys(Country);
		}
		
		public void EnterDateob(String Dateob) {
			DOB.sendKeys(Dateob);
		}
		
		public void EnterMobile(String Mobile) {
			Phone.sendKeys(Mobile);
		}
		
		public void EnterEmaiId(String EmailId) {
			Email.sendKeys(EmailId);
		}
		
		public void EnterPassword(String Pass) {
			Password.sendKeys(Pass);
		}
		
		public void EnterConpassword(String Cpass) {
			Conpassword.sendKeys(Cpass);
		}
		
	}





package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class LoginPage extends Utility {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
	   this.driver = driver;
	   PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	WebElement LoginOption;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-zso239'])[4]")
	WebElement EmailRadioButton;
	
	@FindBy(xpath="(//input[@autocapitalize='sentences'])[3]")
	WebElement EnterEmailId;
	
	@FindBy(xpath="(//input[@autocapitalize='sentences'])[4]")
	WebElement EnterPassword;
	
	@FindBy(xpath="(//input[@autocapitalize='sentences'])[4]")
	WebElement EnterInvalidPassword;
	
	@FindBy(xpath="//div[@data-testid='login-cta']")
	WebElement LoginButton;
	
	@FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-ubezar r-1ozqkpa'])[1]")
	WebElement AccountName;
	
	public void clickonLoginOption() {
		LoginOption.click();
	}
	
	public void clickonEmailRadiobutton() {
		EmailRadioButton.click();
	}
	
	public void enterEmailId (String Emailtext) {
		EnterEmailId.sendKeys(Emailtext);
	}
	
	public void enterPassword (String PasswordText) {
		EnterPassword.sendKeys(PasswordText);
	}
	
	public void enterInvalidPassword (String PasswordText) {
		EnterInvalidPassword.sendKeys(PasswordText);
	}
	
	public void clickonLoginButton() {
		LoginButton.click();
	}
	
	public void Accountname() {
		AccountName.click();
	}
}

package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class SelectaFlightPage extends Utility {

	WebDriver driver;
	
	public SelectaFlightPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@data-testid='continue-search-page-cta']")
	WebElement Continue;
	
	@FindBy(xpath="//input[@data-testid='first-inputbox-contact-details']")
	WebElement FandMname;
	
	@FindBy(xpath="//input[@data-testid='last-inputbox-contact-details']")
	WebElement LName;
	
	@FindBy(xpath="//input[@data-testid='contact-number-input-box']")
	WebElement ContactNum;
	
	@FindBy(xpath="//input[@data-testid='emailAddress-inputbox-contact-details']")
	WebElement EmailIdField;
	
	@FindBy(xpath="//input[@data-testid='city-inputbox-contact-details']")
	WebElement Cityfield;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-zso239'])[5]")
	WebElement PrimaryPassengercheck;
	
	@FindBy(xpath="//div[@data-testid='traveller-info-continue-cta']")
	WebElement ContinueButton;
	
	@FindBy(xpath="(//div[@data-testid='add-ons-continue-footer-button'])[3]")
	WebElement ContinueButton2;
	
	public void clickOnContinue() {
		Continue.click();
	}
	
	public void EnterFandMname(String FandMText) {
		FandMname.sendKeys(FandMText);                         
	}
	
	public void EnterLname(String LnameText) {
		LName.sendKeys(LnameText);
	}
	
	public void EnterContactnumber(String CnumberText) {
		ContactNum.sendKeys(CnumberText);
	}
	
	public void EnterEmaiId(String EmailText) {
		EmailIdField.sendKeys(EmailText);
	}
	
	public void Entercityfield(String cityText) {
		Cityfield.sendKeys(cityText);
	}
	
	public void EnterCheckMark() {
		PrimaryPassengercheck.click();
	}
	
	public void ClickOnContinueButton() {
		ContinueButton.click();
	}
	
	public void ClickOnContinueButton2() {
		ContinueButton2.click();
	}
	
	
}

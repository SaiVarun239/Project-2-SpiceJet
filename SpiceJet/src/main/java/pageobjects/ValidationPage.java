package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class ValidationPage extends Utility {

	WebDriver driver;

	public ValidationPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[contains(text(),'check-in')])[1]")
	WebElement CheckIn;

	@FindBy(xpath = "//div[contains(text(),'flight status')]")
	WebElement FlightStatus;

	@FindBy(xpath = "//div[contains(text(),'manage booking')]")
	WebElement ManageBooking;

	public boolean ValidationforCheckIn() {

		return CheckIn.isDisplayed();
	}

	public boolean ValidationforFlightStatus() {

		return FlightStatus.isDisplayed();
	}

	public boolean ValidationforManageBooking() {

		return ManageBooking.isDisplayed();
	}

}

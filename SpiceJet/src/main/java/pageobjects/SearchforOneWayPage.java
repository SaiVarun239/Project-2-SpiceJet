package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class SearchforOneWayPage extends Utility {

	WebDriver driver;
	
	public SearchforOneWayPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@autocapitalize='sentences'])[1]")
	WebElement FromOrigin;
	
	@FindBy(xpath="(//input[@autocapitalize='sentences'])[2]")
	WebElement ToDestination;
	
	@FindBy(xpath="(//div[@style='font-family: inherit;'])[128]")
	WebElement  DepartureDate;
	
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement SearchFlight;
	
	public void EnterFromOrigin(String town) {
		FromOrigin.sendKeys(town);
	}
	
	public void EnterToDestination(String city) {
		ToDestination.sendKeys(city);
	}
	
	public void DepartureDate() {
		DepartureDate.click();
	}
	
	public void Searchflight() {
		SearchFlight.click();
	}
}

package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class SearchforRoundtripPage extends Utility {

	WebDriver driver;
	
	public SearchforRoundtripPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-zso239'])[2]")
	WebElement RoundTrip;
	
	@FindBy(xpath="(//input[@autocapitalize='sentences'])[1]")
	WebElement FromOrigin;
	
	@FindBy(xpath="(//input[@autocapitalize='sentences'])[2]")
	WebElement ToDestination;
	
	@FindBy(xpath="(//div[@style='font-family: inherit;'])[121]")
	WebElement DepartureDate;
	
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[4]")
	WebElement DateSelection;
	
	@FindBy(xpath="(//div[@style='font-family: inherit;'])[152]")
	WebElement ReturnDate;
	
	@FindBy(xpath="//div[@data-testid='home-page-flight-cta']")
	WebElement SearchFlight;
	
	public void ClickonRoundTrip() {
		RoundTrip.click();
	}
	
	public void EnterFromOrigin(String Text) {
		FromOrigin.sendKeys(Text);
	}
	
	public void EnterToDestination(String Text) {
		ToDestination.sendKeys(Text);
	}
	
	public void DepartureDate() {
		
		Actions act = new Actions(driver);
		act.doubleClick(DepartureDate).perform();
		
	}
	
	public void ClickonDate() {
		DateSelection.click();
	}
	
	public void ReturnDate() {
		ReturnDate.click();
	}
	
	public void Searchflight() {
		SearchFlight.click();
	}
}

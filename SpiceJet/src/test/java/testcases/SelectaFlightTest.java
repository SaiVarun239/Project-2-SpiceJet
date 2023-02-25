package testcases;

import org.testng.annotations.Test;

import base.Base;
import pageobjects.SearchforOneWayPage;
import pageobjects.SelectaFlightPage;

public class SelectaFlightTest extends Base {

	@Test
	public void BookFlight() {
		
		SearchforOneWayPage sp = new SearchforOneWayPage(driver);
		sp.EnterFromOrigin("Hy");
		sp.EnterToDestination("Vis");
		sp.DepartureDate();
		sp.Searchflight();
		SelectaFlightPage FP = new SelectaFlightPage(driver);
		FP.clickOnContinue();
		FP.EnterFandMname(prop.getProperty("FirstName"));
		FP.EnterLname(prop.getProperty("LastName"));
		FP.EnterContactnumber(prop.getProperty("Contact"));
		FP.EnterEmaiId(prop.getProperty("Email"));
		FP.Entercityfield(prop.getProperty("City"));
		FP.EnterCheckMark();
		FP.ClickOnContinueButton();
		FP.ClickOnContinueButton2();
		
	}
}

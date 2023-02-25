package testcases;

import org.testng.annotations.Test;

import base.Base;
import pageobjects.SearchforRoundtripPage;

public class SearchforRoundtripTest extends Base {

	@Test
	public void FlightSearch() {
		
		SearchforRoundtripPage sp = new SearchforRoundtripPage(driver);
		sp.ClickonRoundTrip();
		sp.EnterFromOrigin(prop.getProperty("Origin"));
		sp.EnterToDestination(prop.getProperty("Destination"));
		sp.DepartureDate();
		sp.ClickonDate();
		sp.ReturnDate();
		sp.Searchflight();
	}
}

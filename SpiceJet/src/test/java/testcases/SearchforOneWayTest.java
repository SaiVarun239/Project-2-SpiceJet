package testcases;

import org.testng.annotations.Test;

import base.Base;
import pageobjects.SearchforOneWayPage;

public class SearchforOneWayTest extends Base {

	@Test
	public void FlightSearch() {
		
		SearchforOneWayPage sp = new SearchforOneWayPage(driver);
		sp.EnterFromOrigin(prop.getProperty("From"));
		sp.EnterToDestination(prop.getProperty("To"));
		sp.DepartureDate();
		sp.Searchflight();	
    }
}
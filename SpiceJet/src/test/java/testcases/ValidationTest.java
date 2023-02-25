package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.Base;
import pageobjects.ValidationPage;


public class ValidationTest extends Base {

	@Test(priority=1)
	public void ValidationOnElement1() {
		
		ValidationPage vp = new ValidationPage(driver);
		Assert.assertTrue(vp.ValidationforCheckIn());	
	}
	
	@Test(priority=2)
	public void ValidationOnElement2() {
		
		ValidationPage vp = new ValidationPage(driver);
		Assert.assertTrue(vp.ValidationforFlightStatus());	
	}
	
	@Test(priority=3)
	public void ValidationOnElement3() {
		
	    ValidationPage vp = new ValidationPage(driver);
	    Assert.assertTrue(vp.ValidationforManageBooking());
	}
}



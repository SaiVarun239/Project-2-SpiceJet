package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utilities.Utility;

public class Base extends Utility {
    
	@BeforeMethod
	public void startup() throws Exception  {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void closeup() {
		driver.quit();
	}
}


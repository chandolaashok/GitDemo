package Academy;

import static org.testng.Assert.assertFalse;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import Resources.basic;
import junit.framework.Assert;

public class ValidateNavBar extends basic {
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();// it will return driver
		driver.get(prop.getProperty("url"));//  add driver here, we can send this driver 
		
	}

	@Test
	 public void basepagenavigation() throws IOException
	 {
			LandingPage l = new LandingPage(driver);
	    Assert.assertTrue(l.getnavbar().isDisplayed()); 	   // to check weather it is returning true or false
	   // Assert.assertFalse(l.getnavbar().isDisplayed()); // it will return true if condition is failed....
	 }
	
	  		  
@AfterTest
public void teardown()
{
	
	 driver.close();
	}
	
}



	  
	  
	  
	  
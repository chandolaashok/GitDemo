package Academy;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import Resources.basic;
import junit.framework.Assert;

public class Validatetitle extends basic {
	public static Logger Log = LogManager.getLogger(basic.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{   
		
		driver=initializeDriver();// it will return driver.....  and refer to driver= null;// it will save our memory.... (heap memory) 
		Log.info("Driver is  Initialized");
			driver.get(prop.getProperty("url"));// now in academy package create one more package called resources.. one more package for named as PageObject
			
		
	}
	

	@Test
	 public void basepagenavigation() throws IOException
	 {
		
		LandingPage l = new LandingPage(driver);//  add driver here, we can send this driver 
		//compare text from the browser with actual value. if there is a mismatch script will fail and return an error 
		l.gettitle().getText();
	   Assert.assertEquals(l.gettitle().getText(),"FEATURED COURSES");	
	   Log.info("display text featured courses..");
	 }
	@AfterTest
	public void teardown()
	{
		
		 driver.close();
		 driver= null;// it will save our memory.... (heap memory)
		 
		}
	  		  
	   }


	  
	  
	  
	  
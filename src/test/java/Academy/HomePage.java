package Academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import PageObjects.LandingPage;
import PageObjects.LoginPage;
import Resources.basic;

public class HomePage extends basic {
	

	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		
	}

	@Test(dataProvider="getData")
	
	 public void basepagenavigation(String userame, String password, String text) throws IOException
	 {   
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);//  add driver here, we can send this driver 
		l.getlogin().click();//  driver.findelement(By.css())
		LoginPage lp = new LoginPage(driver);
		lp.getemail().sendKeys(userame); // now no need to hard code like this lp.getemial().sendKeys("ashokch@brcikiwn.net")..
		lp.getpass().sendKeys(password);
		System.out.println(text);
		lp.getlogin().click();
		
		//Two ways to access the objects of class
		//1. by inheritance
		//2. b creating object of the class
		
		// passing values directaly is not good practice, we will use data provider anotation for that...
		//to test your data with multiple data 
	 }
	
	
	@AfterTest
	  public void teardown()
	  {
	  	
	  	 driver.close();
	  	}
	

	@AfterTest
	  public void teardown2()
	  {
	  	
	  	 driver.close();
	  	}
	
	  @DataProvider 
	   public Object[][] getData() // here we need to create an array
	   {
		  Object[][] data= new Object[2][3]; 
		  
		  // row stands for how many different data types test should run...
		  //i.e  one test case should run with one data another test case should run with another data..
		  //column stands for how many values per test....
		  //0th index but here we have passwors and email id ie. 2 indexes
		  // means 1st number ka data(0th index wala) and number of values i.e [1][2]
		  // now starting values  [1][2], here 2 means 0, 1 ,2 i.e three arguments.........
		  //0th row
		  
		  data[0][0]="ashokch@brcikiwn.net";
		  data[0][1]="y8687678";
		  data[0][2]="RistrictedUser";

	   //Once row is completed that mean one test data is completed, to test with another set of data you have to come with new row........
	   
          data[1][0]="restusers@brickwin.net";
		  data[1][1]="passtestnew123";
		  data[1][2]="Non ristricted user";
		  
		  // now when we will map this getdata() with the test , it will take the first row and complete the test and once it completes the test, it will pick the second row and does the same....
	
		  return data;  // and then after returning it.... pass getData to data provides i.e   ->  @Test(dataProvider="getData")
		  
	   }

	  
}

	  
	  
	  
	  
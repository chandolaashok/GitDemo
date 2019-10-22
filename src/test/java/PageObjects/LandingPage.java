package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	 public WebDriver driver;
	 By signin=By.cssSelector("a[href*='sign_in']");//  tag name [attribute*='sign in'] means href contains signin...
      //By title =By.cssSelector("//div[@class='container']//div[@class='text-center']");
	 //By title =By.xpath("//h2[contains(text(),'Featured Courses')]");  
	  By title =  By.cssSelector(".text-center>h2");
	 
	  By navbar =By.xpath("//*[@id='homepage']/header/div[2]");

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	// here driver object which have life is assigned to driver object of the class, here this.driver  is the class object and second
	//driver is the object which we got from home page driver inside landing page object "l"
	//i.e LandingPage l = new LandingPage(driver); 
	
	}
	

  public WebElement gettitle()
  {
	  return driver.findElement(title);
  }
  
  public WebElement getnavbar()
  {
	  return driver.findElement(navbar);
  }

	public WebElement getlogin()
	 {
		 return driver.findElement(signin);// there is no life in this driver right now, we have to create constructor for that..
	 }


}

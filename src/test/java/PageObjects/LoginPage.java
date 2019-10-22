package PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	 public WebDriver driver;
	 By email=By.cssSelector("input[id='user_email']");
	 By password= By.cssSelector("input[id='user_password']");
	  By login=By.cssSelector("[value='Log In']");

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	// here driver object which have life is assigned to driver object of the class, here this.driver  is the class object and second
	//driver is the object which we got from home page driver inside landing page object "l"
	//i.e LandingPage l = new LandingPage(driver); 
	
	}
	



	public WebElement getemail() {
		
		 return driver.findElement(email);// there is no life in this driver right now, we have to create constructor for that..
	       
	}
	
	
	public WebElement getpass()
	{
		return driver.findElement(password);
	}
	
	public WebElement getlogin()
	{
		return driver.findElement(login);
	}




	
}


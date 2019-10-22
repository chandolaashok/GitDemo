package Resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic {

	public WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException
{
 prop= new Properties();// data driver properties file
FileInputStream fs = new FileInputStream("C:\\Users\\Jharna.agrawal\\DemoMavenProject\\src\\test\\java\\Resources\\Data.properties");
      prop.load(fs);                     //Properties file do not have knowledge of the file so  use it
    String browsername =prop.getProperty("browser");
         
    if(browsername.equals("chrome"))// equals() compares values inside the objects   and == is reference comparison, i.e both objects points to same memory location
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jharna.agrawal\\Desktop\\AshokDataALL\\chromedriver\\chromedriver.exe");
		  driver= new ChromeDriver();
	
    	//execute it in chrome browser
    }
    else if(browsername.equals("firefox"))
    {
    	
    }
    else if(browsername.equals("IE"))
    {
    	
    }
   
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
return driver;// sending the driver object back so that any one who wants to use it, they can use... move base.java and data.properties  to resources package....

}

public void getscreenshot(String result) throws IOException
{
	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 // once it takes screenshot , it will get stored somewhere in src, so we need to copy it.
	FileUtils.copyFile(src, new File("C://test//"+result+ "screenshot.png"));// there i a folder in c drive we can save it there..
//now in test folder you will see the failed test with screenshoot.png... it will avoid overriding..........
	
}

    
}
	


package Library_Files;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

public WebDriver driver;
	
	public void InitializeBrowser() 
	{
		//Step-I:
				//Parameter-I: Name of the Browser
				//Parameter-II:Path of ChromeDriver.exe file
						
		System.setProperty("webdriver.chrome.driver", "F:\\Java Velocity\\Mavan_Practice\\Browser\\chromedriver.exe");

				//Step-II:Create object of ChromeDriver class by providing reference of WebDriver(Interface)
		driver=new ChromeDriver();        //Upcasting
					               				       
				//To Enter URL
		driver.get("https://www.policybazaar.com/?pb_source=google_brand&pb_medium=ppc&pb_term=Policybazaar&pb_campaign=PolicyBazaar00PolicyBazaar&gclid=CjwKCAiAxvGfBhB-EiwAMPakqudXAE2Z5ZtLXOOQA1HhfzmP2Rj-IwxyzkfX_XmIb1sPMT-2QuNpmhoCTFQQAvD_BwE");
					
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
		
	}
	
	
	
	
	

}

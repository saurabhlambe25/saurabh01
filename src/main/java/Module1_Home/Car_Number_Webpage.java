package Module1_Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Car_Number_Webpage {

	//POM-II
	
	//1. Data members/Global Variables should be declared globally with access level private by using @findby Annotation
		
		@FindBy(xpath="//a[@class='btn-proceed']")  private  WebElement CarWithoutNo;  //private WebElement Signedinas=driver.findElement(by.xpath("//h4[text()='saradeg41@gmail.com']"));
		                                  
	
		

		//2. Initialize within a constructor with access level public using pagefactory
		
		public Car_Number_Webpage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		//3. Utilize within a method with access level public

	
		
		public void ClickWithoutCarNo() 
		{
			CarWithoutNo.click();
		}

}

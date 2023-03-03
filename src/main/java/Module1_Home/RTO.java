package Module1_Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTO {

	//POM-III
	
		//1. Data members/Global Variables should be declared globally with access level private by using @findby Annotation
			
			@FindBy(tagName="span")  private  WebElement SelectCandR;  //private WebElement Signedinas=driver.findElement(by.xpath("//h4[text()='saradeg41@gmail.com']"));
			                                  
		
			

			//2. Initialize within a constructor with access level public using pagefactory
			
			public RTO(WebDriver driver)
			{
				PageFactory.initElements(driver,this);
			}
			
			//3. Utilize within a method with access level public

		
			
			public String VerifCityandRto() 
			{
				String SelectCityandRTO=SelectCandR.getText();
			
				return VerifCityandRto();
			}
}

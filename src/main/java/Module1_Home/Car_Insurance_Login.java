package Module1_Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Car_Insurance_Login {

	//POM-I
	
	//1. Data members/Global Variables should be declared globally with access level private by using @findby Annotation
		
		@FindBy(xpath="(//div[@class='prd-icon add shadowHandler short'])[4]")  private  WebElement CarInsurance;		
		
		
		//2. Initialize within a constructor with access level public using pagefactory
		
      public Car_Insurance_Login(WebDriver driver){
	
	PageFactory.initElements(driver, this);
	
	
}
		
		public void ClickCarInsurance() 
		{
			CarInsurance.click();
		}
}

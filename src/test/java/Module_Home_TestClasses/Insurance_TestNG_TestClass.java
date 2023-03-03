package Module_Home_TestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_Files.BaseClass;
import Library_Files.UtilityClass;
import Module1_Home.Car_Insurance_Login;
import Module1_Home.Car_Number_Webpage;
import Module1_Home.RTO;

public class Insurance_TestNG_TestClass extends BaseClass{
	//public WebDriver driver;
		//InitializeBrowser() 
		
	Car_Insurance_Login Login;
	Car_Number_Webpage SelectCar;
		RTO rt;
		
		int TestCaseID;

		@BeforeClass
		public void OpenBrowser() 
		{
			InitializeBrowser();
			
			 //Create Object Of POM-I Class
			Login=new Car_Insurance_Login(driver);
			
			//Create object of POM-II Class
	        SelectCar=new Car_Number_Webpage(driver);
	        
	        rt = new RTO(driver);
	        

		}
		
		
		@BeforeMethod
		public void loginToApp() throws IOException 
		{
			
			
		}
		
		@Test                           //Test Case/method
		public void Verify() throws EncryptedDocumentException, IOException
		{
		String Actual = rt.VerifCityandRto();
			
			
			
	

			String Expected=UtilityClass.getdataFromExcelsheet(0, 0);  
		
			Assert.assertEquals(Actual,Expected);		
		}
	
		
		@AfterMethod                          //Fail
		public void LogoutFromApp()  //Pass Fail
		{       //Fail                   //Fail
			
			
			
			
		
		}
		
		@AfterClass
		public void CloseBrowser() 
		{
			driver.close();
		}
		
	
}

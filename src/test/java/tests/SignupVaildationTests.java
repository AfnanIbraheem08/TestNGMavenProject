package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.SignupVerficationsPage;
import utilis.Driver;
import utilis.TestDataReader;

public class SignupVaildationTests {
	 @BeforeMethod
	   public void setUp() {
		   Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   }
		
	
	
  @Test(description="Signup Fields verification")
  public void SignupVaildationTest() {
	  
	  SignupVerficationsPage verificationPage= new SignupVerficationsPage ();
	//When
			Driver.getDriver().get(TestDataReader.getProperty("appurl"));
			
			// click
			Assert.assertTrue(verificationPage.signupButton.isDisplayed());
			verificationPage.signupButton.click();
			
			//invaild email address
			Assert.assertTrue(verificationPage.emailFieldIsRequired.isDisplayed());
			//invaild first name address
			Assert.assertTrue(verificationPage.firstNameFieldIsRequired.isDisplayed());
			//invaild Last name address
			Assert.assertTrue(verificationPage.lastNameFieldIsRequired.isDisplayed());
			// invaild password
			Assert.assertTrue(verificationPage.passwordFieldIsRequired.isDisplayed());
			
			
			
			
			
  }
}

package tests;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.CommonPage;
import pages.SignupPage;
import utilis.Driver;
import utilis.TestDataReader;

public class SignupTests {
	
   @BeforeMethod
   public void setUp() {
	   Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   }

   @Test
 public void testCase1() throws InterruptedException {
	 
	   System.out.println("Test1 :" + "Thread :" +Thread.currentThread().getId());
 }
   @Test
   public void testCase3() throws InterruptedException {
	   
	   System.out.println("Test3 :" + "Thread :" +Thread.currentThread().getId());
   }
   @Test
  public void testCase4() throws InterruptedException {
	  
	   System.out.println("Test 4:" + "Thread :" +Thread.currentThread().getId());
  }
  @Test(groups= {"smoke-test"})
   public void testCase5() throws InterruptedException {
	 
	   System.out.println("Test5 :" + "Thread :" +Thread.currentThread().getId());
   }
	
	@Test (groups= {"smoke-test","SignupPage"}, description="verify signup page components")
	public void SignUpTest() throws InterruptedException {

		CommonPage commonpage = new CommonPage();
       SignupPage signupPage = new SignupPage();
	//When
		Driver.getDriver().get(TestDataReader.getProperty("appurl"));
		// and click 
		Assert.assertTrue(commonpage.welcomeLink.isDisplayed());
		commonpage.welcomeLink.click();
		//and click
		Assert.assertTrue(commonpage.signUpButton.isDisplayed());
		commonpage.signUpButton.click();
		
		// Verify the signup page web component
		Assert.assertTrue(signupPage.SignupText.isDisplayed());
		// email field verification
		Assert.assertTrue(signupPage.emailFieldLabel.isDisplayed());
		Assert.assertEquals( signupPage.emailField.getAttribute("placeholder"),"Please Enter Your Email");
		
		// First Name Verification
		Assert.assertTrue(signupPage.firstNameLabel.isDisplayed());
		Assert.assertEquals( signupPage.firstNameField.getAttribute("placeholder"),"Please Enter Your First Name");
		
		// last  Name Verification
		Assert.assertTrue(signupPage.lastNameLabel.isDisplayed());
		Assert.assertEquals( signupPage.lastNameField.getAttribute("placeholder"),"Please Enter Your Last Name");
		
		// password Name Verification
		Assert.assertTrue(signupPage.passwordFieldLabel.isDisplayed());
		Assert.assertEquals( signupPage.passwordField.getAttribute("placeholder"),"Please Enter Your Password");
		
		
		
		//Google and Facebook login Verification
		Assert.assertTrue(signupPage.signupWithGoogleLink.isDisplayed());
		Assert.assertTrue(signupPage.signupWithFacebbokLink.isDisplayed());
		
		// check box verificatiom
		Assert.assertTrue(signupPage.subscribeCheckBox.isDisplayed());
		Assert.assertFalse(signupPage.subscribeCheckBox.isSelected());
		Assert.assertTrue(signupPage.SubsribeToNewsLetter.isDisplayed());
		
		// back and signup buutons
		Assert.assertTrue(signupPage.SignUpButton.isDisplayed());
		Assert.assertTrue(signupPage.backToLoginLink.isDisplayed());
		
	
		
		
	}
	
	

	
		
		
		
	
	
}

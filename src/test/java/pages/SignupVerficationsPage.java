package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilis.Driver;

public class SignupVerficationsPage {

	public SignupVerficationsPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
//	@FindBy(linkText="Welcome!")
//	public WebElement welcomeLinkText;
	
	@FindBy(xpath="//span[text()='Sign Up']")
		public WebElement signupButton;	
	
	
	@FindBy(xpath="//span[text()='Email is required.']")
	public WebElement emailFieldIsRequired;
	
	@FindBy(xpath="//span[text()='First Name is required.']")
	public WebElement firstNameFieldIsRequired;
	
	@FindBy(xpath="//span[text()='Last Name is required.']")
	public WebElement lastNameFieldIsRequired;
	
	@FindBy(xpath="//span[text()='Password is required.']")
	public WebElement passwordFieldIsRequired;
	
	
}

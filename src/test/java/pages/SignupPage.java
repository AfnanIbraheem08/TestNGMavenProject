package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilis.Driver;

public class SignupPage {

	
      public SignupPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		
	}
	
	@FindBy(xpath="//h2[text()='Sign Up']")
	public WebElement SignupText;
	
	
	@FindBy(xpath="//label[text()='Email Address']")
	public WebElement emailFieldLabel;
	
	@FindBy(name="email")
	public WebElement emailField;
	
	@FindBy(xpath="//label[text()='First Name']")
	public WebElement firstNameLabel;
	
	@FindBy(name="firstName")
	public WebElement firstNameField;
	
	@FindBy(xpath="//label[text()='Last Name']")
	public WebElement lastNameLabel;
	
	
	@FindBy(name="lastName")
	public WebElement lastNameField;
	
	@FindBy(xpath="//label[text()='Password']")
	public WebElement passwordFieldLabel;
	
	
	@FindBy(name="password")
	public WebElement passwordField;
	
	
	@FindBy(xpath="//span[text()='Login with Google']")
	public WebElement signupWithGoogleLink;	
	
	@FindBy(xpath="//span[text()='Login with Facebook']")
	public WebElement signupWithFacebbokLink;	
	
	

	@FindBy(id="subscribe")
	public WebElement subscribeCheckBox;
	
	
	
	@FindBy(xpath="//label[text()='Subscribe To Our Newsletter']")
	public WebElement SubsribeToNewsLetter;
	
	@FindBy(xpath="//span[text()='Sign Up']")
	public WebElement SignUpButton;
	
	
	@FindBy(linkText="Back To Login")
	public WebElement backToLoginLink;
	
	
	
	
	
}

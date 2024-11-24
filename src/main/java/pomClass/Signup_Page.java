package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@id='firstname']")
	private WebElement FirstName;
	@FindBy(xpath="//input[@id='lastname']")
	private WebElement LastName;
	@FindBy(xpath="//input[@id='email_address']")
	private WebElement Email;
	@FindBy(xpath="//input[@id='password']")
	private WebElement Password;
	@FindBy(xpath="//input[@id='password-confirmation']")
	private WebElement ConfirmPassword;
	@FindBy(xpath="//button[@title=\"Create an Account\"]")
	private WebElement CreateAccount;
	
	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	public WebElement getCreateAccount() {
		return CreateAccount;
	}
	
	public Signup_Page(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}



}

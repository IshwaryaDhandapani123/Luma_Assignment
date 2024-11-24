package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_In_Page {

	public WebDriver driver;

	@FindBy(xpath="//*[@class='panel wrapper']//descendant::ul[@class='header links']//following-sibling::li[@class='authorization-link']")
	private WebElement signIn;
	@FindBy(xpath="//input[@id='email']")
	private WebElement mailId;
	@FindBy(xpath="//*[@name='login[password]']")
	private WebElement password;
	@FindBy(xpath="//*[@class='action login primary']")
	private WebElement clickSignInButton;

	public WebElement getSignIn() {
		return signIn;
	}
	public WebElement getClickSignInButton() {
		return clickSignInButton;
	}

	public WebElement getMailId() {
		return mailId;
	}

	public WebElement getPassword() {
		return password;
	}

	public Sign_In_Page(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}

}

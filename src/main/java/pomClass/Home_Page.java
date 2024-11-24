package pomClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//*[@class='page-header']//descendant::li[3]//child::a[text()='Create an Account']")
	private WebElement createAccountButton;

	
	public WebElement getCreateAccountButton() {
		return createAccountButton;
	}


	public Home_Page(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}

}

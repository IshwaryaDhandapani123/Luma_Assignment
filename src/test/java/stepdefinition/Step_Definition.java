package stepdefinition;

import org.openqa.selenium.support.PageFactory;

import com.pageobjectmanager.Page_Object_Manager;

import BaseClass.Base_Class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pomClass.Sign_In_Page;
import pomClass.Signup_Page;

public class Step_Definition extends Base_Class {

	public static Page_Object_Manager pom;

	@Given("^I navigate To The LUMA Home Page$")
	public void i_navigate_To_The_LUMA_Home_Page() throws Throwable {

		launchUrl("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
	}

	@When("^I click On The Create An Account button$")
	public void i_click_On_The_Create_An_Account_button() throws Throwable {
		pom = new Page_Object_Manager(driver);

		clickOnElement(pom.getHomePage().getCreateAccountButton());

	}

	@When("^I fill in First Name as <\"([^\"]*)\"> , Last Name as <\"([^\"]*)\"> , Email as <\"([^\"]*)\">,  Password as <\"([^\"]*)\">, Confirm Password as <\"([^\"]*)\">$")
	public void i_fill_in_First_Name_as_Last_Name_as_Email_as_Password_as_Confirm_Password_as(String firstName,
			String lastName, String email, String password, String confirmPassword) throws Throwable {

		sendValues(pom.getSignUpPage().getFirstName(), firstName);
		sendValues(pom.getSignUpPage().getLastName(), lastName);
		sendValues(pom.getSignUpPage().getEmail(), email);
		sendValues(pom.getSignUpPage().getPassword(), password);
		sendValues(pom.getSignUpPage().getConfirmPassword(), confirmPassword);
	}

	@When("^I clicked Create An Account button$")
	public void i_clicked_Create_An_Account_button() throws Throwable {

		clickOnElement(pom.getSignUpPage().getCreateAccount());
	}

	@Then("^I should Redirected To The SignIn Page$")
	public void i_should_Redirected_To_The_SignIn_Page() throws Throwable {
		
		clickOnElement(pom.getSignInPage().getSignIn());
	}

	
	@When("^I enter Username as <\"([^\"]*)\"> and Password as <\"([^\"]*)\">$")
	public void i_enter_Username_as_and_Password_as(String mailId, String password) throws Throwable {

		sendValues(pom.getSignInPage().getMailId(), mailId);
		sendValues(pom.getSignInPage().getPassword(), password);
	}

	@Then("^I click The Loginbutton$")
	public void i_click_The_Loginbutton() throws Throwable {
		clickOnElement(pom.getSignInPage().getClickSignInButton());
	}

	
}

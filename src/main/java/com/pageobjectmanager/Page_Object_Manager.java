package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pomClass.Home_Page;
import pomClass.Sign_In_Page;
import pomClass.Signup_Page;


public class Page_Object_Manager {
	
	public WebDriver driver;

	private Sign_In_Page signInPage;
	private Signup_Page signUpPage;
	private Home_Page homePage;
	

	public Sign_In_Page getSignInPage() {
		signInPage= new Sign_In_Page(driver);
		return signInPage;
	}

	public Signup_Page getSignUpPage() {
		signUpPage= new Signup_Page(driver);
		return signUpPage;
	}

	public Home_Page getHomePage() {
		homePage= new Home_Page(driver);
		return homePage;
	}

	
	
	public Page_Object_Manager(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(this.driver, this);
	}

}

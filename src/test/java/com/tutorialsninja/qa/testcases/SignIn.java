package com.tutorialsninja.qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.tutorialsninja.qa.base.Base;
import com.tutorialsninja.qa.pages.Rest;


public class SignIn extends Base{
	
	public SignIn () {
		super();
	}
	
	WebDriver driver;
	
	
	@Test(priority=1)
	public void  setup() {
    	
    	
    	//extending base class to initialize until application is opened
    	driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
	    Rest Rest = new Rest(driver);
	    Rest.clickOnSignIn();
    	Rest.clickOnSignInPopUp();
    
		
	}
	@Test(priority=2)
	public void  setup1() {
    	
    	
    	//extending base class to initialize until application is opened
    	driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
	    Rest Rest = new Rest(driver);
	    Rest.clickOnSignIn();
    	Rest.clickOnSignInRedirect();
	}
}
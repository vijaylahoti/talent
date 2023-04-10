package com.tutorialsninja.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomemessage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\\\"root\\\"]/h5/center")
	private WebElement welcometothetalentsavvy;

	
	public Welcomemessage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	
	public String retrieveWelcomemessageHeading() {
		
		String WelcomemessageHeadingtext = welcometothetalentsavvy.getText();
		return WelcomemessageHeadingtext;
	}
	
}

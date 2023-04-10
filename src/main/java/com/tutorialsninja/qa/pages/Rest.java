package com.tutorialsninja.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rest {

WebDriver driver;
	
	
	@FindBy(xpath="//button[@type='button']")
	private WebElement SignIn;
	
	@FindBy(xpath="//*[@id=\"root\"]/nav/div/div/div/button[1]")
	private WebElement SignInPopUp;
	
	@FindBy(xpath="//*[@id=\"root\"]/nav/div/div/div/button[2]")
	private WebElement SignInRedirect;
	
	@FindBy(xpath="//*[@id=\"root\"]/h5/center")
	private WebElement Welcome;
	
	
	public Rest (WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	
	//Actions
	
	
	public void clickOnSignIn () {
		
		SignIn.click();
	}
	
    public void clickOnSignInPopUp () {
		
		SignInPopUp.click();
}
    public void clickOnSignInRedirect () {
		
		SignInRedirect.click();
    }
		
	public void clickOnWelcome () {
			
			Welcome.getText();
}
}
	
	
		
	

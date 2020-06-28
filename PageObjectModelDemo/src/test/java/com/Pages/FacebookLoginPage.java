package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {

	WebDriver driver;
	@FindBy(id="email")
	WebElement usernameElement;
	@FindBy(id="pass")
	WebElement pwdElement;
	@FindBy(xpath="//*[@id='u_0_4']")
	WebElement Loginbutton;
	
	public FacebookLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
}
	public void login(String username,String password) {
		usernameElement.sendKeys(username);
		pwdElement.sendKeys(password);
		
		Loginbutton.click();
		
	}
}

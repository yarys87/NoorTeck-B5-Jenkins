package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonElementPage {

	@FindBy(id = "txtUsername")
	WebElement userNameField;

	@FindBy(id = "txtPassword")
	WebElement passwordField;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginButton;
	
	@FindBy(xpath = "//*[@title='Show Password']")
	WebElement showPassword;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@Override
	public void click(String element) {

		switch (element) {
		case "login.loginButton":
			click(loginButton);
			break;
		case "login.showPassword":
			click(showPassword);
			break;
		}
	}
	
	public void enter(String element, String value) {
		switch (element) {
		case "login.username":
			enter(userNameField, value);
			break;
		case "login.password":
			enter(passwordField, value);
			break;

		}
	}
	
	
}


 

 
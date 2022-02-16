package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillsPage extends CommonElementPage {

	// nameField
	@FindBy(id = "name")
	WebElement nameField;

	// descriptionField
	@FindBy(id = "description")
	WebElement descriptionField;

	public SkillsPage() {
		PageFactory.initElements(driver, this);
	}

	public void enter(String element, String value) {
		switch (element) {
		case "skills.name":
			enter(nameField, value);
			break;
		case "skills.description":
			enter(descriptionField, value);
			break;
		}
	}

}

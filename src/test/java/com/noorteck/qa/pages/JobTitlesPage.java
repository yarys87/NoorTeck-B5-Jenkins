package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobTitlesPage extends CommonElementPage {
	@FindBy(id = "jobTitleName")
	WebElement titleField;

	@FindBy(id = "jobDescription")
	WebElement descriptionField;

	@FindBy(id = "note")
	WebElement noteField;

	public JobTitlesPage() {
		PageFactory.initElements(driver, this);
	}

	public void enter(String element, String value) {
		switch (element) {
		case "jobTitles.title":
			enter(titleField, value);
			break;
		case "jobTitles.description":
			enter(descriptionField, value);
			break;
		case "jobTitles.note":
			enter(noteField, value);
			break;
		}
	}
}
 
package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalaryComponentsPage extends CommonElementPage {

	@FindBy(id = "name")
	WebElement nameField;

	@FindBy(xpath = "//label[@for='type_1']")
	WebElement earningType;

	@FindBy(xpath = "//label[@for='type_2']")
	WebElement deductionType;

	@FindBy(xpath = "//label[text()='Total Payable']")
	WebElement totalPayable;

	@FindBy(xpath = "//label[text()='Cost to Company']")
	WebElement costToCompany;

	@FindBy(xpath = "//label[text()='Amount']")
	WebElement amountValueType;

	@FindBy(xpath = "//label[text()='Percentage']")
	WebElement percentageValueType;

	public SalaryComponentsPage() {
		PageFactory.initElements(driver, this);
	}

	// pagename.elementName

	public void click(String element) {
		System.out.println("HEREE...." + element);
		switch (element) {
		case "salaryComp.earning":
			click(earningType);
			break;
		case "salaryComp.deduction":
			click(deductionType);
			break;
		case "salaryComp.totalPayable":
			click(totalPayable);
			break;
		case "salaryComp.costOfCompany":
			click(costToCompany);
			break;
		case "salaryComp.amount":
			click(amountValueType);
			break;
		case "salaryComp.percentage":
			click(percentageValueType);
			break;
		}

	}

	public void enter(String element, String value) {
		switch (element) {
		case "salaryComp.name":
			enter(nameField, value);
			break;
		}
	}

}

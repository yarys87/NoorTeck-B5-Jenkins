package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends CommonElementPage {

	@FindBy(xpath = "//span[text()='Admin']")
	WebElement admin;

	// JOB MENU
	@FindBy(xpath = "//span[text()='Job']")
	WebElement job;
	@FindBy(xpath = "//span[text()='Job Titles']")
	WebElement jobTitles;
	@FindBy(xpath = "//span[text()='Salary Components']")
	WebElement salaryComp;
	@FindBy(xpath = "//span[text()='Pay Grades']")
	WebElement payGrades;
	@FindBy(xpath = "//span[text()='Employment Status']")
	WebElement empStatus;
	@FindBy(xpath = "//span[text()='Job Categories']")
	WebElement jobCategories;
	@FindBy(xpath = "//span[text()='Work Shifts']")
	WebElement workShifts;

	// Qualifications MENU
	@FindBy(xpath = "//span[text()='Qualifications']")
	WebElement qualifications;
	@FindBy(xpath = "//span[text()='Skills']")
	WebElement skills;
	@FindBy(xpath = "//span[text()='Education']")
	WebElement education;

	// PIM MENU
	@FindBy(xpath = "//span[text()='PIM']")
	WebElement pim;
	@FindBy(xpath = "//span[text()='Employee List']")
	WebElement empList;

	// DISCIPLINE MENU
	@FindBy(xpath = "//span[text()='Discipline']")
	WebElement discipline;
	@FindBy(xpath = "//span[text()='Disciplinary Cases']")
	WebElement disciplinaryCases;

	// OTM MENU
	@FindBy(xpath = "//span[text()='OTM']")
	WebElement otm;
	@FindBy(xpath = "//span[text()='My Courses']")
	WebElement myCourses;

	public MenuPage() {
		PageFactory.initElements(driver, this);

	}

	public void navigateTo(String pageName) {
		switch (pageName) {
		case "menu.jobTitles":
			click(admin);
			click(job);
			click(jobTitles);
			break;
		case "menu.salaryComp":
			click(admin);
			sleep(500);
			click(job);
			sleep(500);
			click(salaryComp);
			break;
		case "menu.payGrades":
			click(admin);
			click(job);
			click(payGrades);
			break;
		case "menu.empStatus":
			click(admin);
			click(job);
			click(empStatus);
			break;
		case "menu.jobCategories":
			click(admin);
			click(job);
			click(jobCategories);
			break;
		case "menu.workShifts":
			click(admin);
			click(job);
			click(workShifts);
			break;
		case "menu.empList":
			click(pim);
			click(empList);
			break;
		case "menu.discipCases":
			click(discipline);
			click(disciplinaryCases);
			break;
		case "menu.myCourses":
			click(otm);
			click(myCourses);
			break;
		case "menu.skills":
			click(admin);
			sleep(500);
			click(qualifications);
			sleep(500);
			click(skills);
			break;
		}
		
		sleep(1000);
	}
	
	 

}

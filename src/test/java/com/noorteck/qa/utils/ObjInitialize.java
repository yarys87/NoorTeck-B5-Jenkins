package com.noorteck.qa.utils;

import com.noorteck.qa.pages.CommonElementPage;
import com.noorteck.qa.pages.JobTitlesPage;
import com.noorteck.qa.pages.LoginPage;
import com.noorteck.qa.pages.MenuPage;
import com.noorteck.qa.pages.SalaryComponentsPage;
import com.noorteck.qa.pages.SkillsPage;

/**
 * The purpose of this class is to initialize the PAGE CLASS Objects
 * @author NoorTeck
 *
 */
public class ObjInitialize extends Constants {
	
	//initialize class objects 
	public static void initializeClassObj() {
		loginObj = new LoginPage();
		menuObj = new MenuPage();
		jobTitlesObj = new JobTitlesPage();
		commonObj = new CommonElementPage();
		salCompObj = new SalaryComponentsPage();
		
		skillsObj = new SkillsPage();
	}

}
